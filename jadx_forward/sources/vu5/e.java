package vu5;

/* loaded from: classes12.dex */
public class e extends java.util.concurrent.ThreadPoolExecutor implements vu5.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f521881d;

    /* renamed from: e, reason: collision with root package name */
    public final int f521882e;

    /* renamed from: f, reason: collision with root package name */
    public int f521883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vu5.f f521884g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vu5.f fVar, int i17, int i18) {
        super(i17, i18, 10L, java.util.concurrent.TimeUnit.MINUTES, new java.util.concurrent.LinkedBlockingQueue(), new vu5.c(fVar), new vu5.d(fVar));
        this.f521884g = fVar;
        this.f521883f = 1;
        this.f521881d = i17;
        this.f521882e = i18;
    }

    @Override // vu5.a
    public void a(wu5.l lVar) {
        long delay = lVar.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            execute(lVar);
        } else {
            android.os.Handler handler = this.f521884g.f521886f;
            handler.sendMessageAtTime(handler.obtainMessage(0, lVar), android.os.SystemClock.uptimeMillis() + delay);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(java.lang.Runnable runnable, java.lang.Throwable th6) {
        super.afterExecute(runnable, th6);
        if (getQueue().isEmpty()) {
            int corePoolSize = getCorePoolSize();
            int i17 = this.f521881d;
            if (corePoolSize > i17) {
                setCorePoolSize(i17);
                this.f521883f = 1;
                ku5.o.f394132c.w("ColdPool", "reset to corePoolSize(%s)", java.lang.Integer.valueOf(i17));
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        int i17;
        int corePoolSize = getCorePoolSize();
        if (getQueue().size() >= this.f521883f * 10 && (i17 = corePoolSize + 1) <= this.f521882e) {
            setCorePoolSize(i17);
            ku5.o.f394132c.w("ColdPool", "increment to expand cold pool; queue size=%s currentCoreSize=%s bufferSizeFactor=%s", java.lang.Integer.valueOf(getQueue().size()), java.lang.Integer.valueOf(corePoolSize), java.lang.Integer.valueOf(this.f521883f));
            this.f521883f++;
        }
        super.execute(runnable);
    }
}
