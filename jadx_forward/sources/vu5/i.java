package vu5;

/* loaded from: classes12.dex */
public class i extends java.util.concurrent.ThreadPoolExecutor implements vu5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu5.j f521889d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vu5.j jVar, int i17) {
        super(i17, i17, 2147483647L, java.util.concurrent.TimeUnit.HOURS, new java.util.concurrent.LinkedBlockingQueue(), new vu5.g(jVar), new vu5.h(jVar));
        this.f521889d = jVar;
    }

    @Override // vu5.a
    public void a(wu5.l lVar) {
        long delay = lVar.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            execute(lVar);
        } else {
            android.os.Handler handler = this.f521889d.f521891f;
            handler.sendMessageAtTime(handler.obtainMessage(0, lVar), android.os.SystemClock.uptimeMillis() + delay);
        }
    }
}
