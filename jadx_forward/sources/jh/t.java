package jh;

/* loaded from: classes13.dex */
public class t implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public jh.r f381286d;

    /* renamed from: e, reason: collision with root package name */
    public final jh.m f381287e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f381288f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f381289g;

    /* renamed from: h, reason: collision with root package name */
    public final jh.f0 f381290h;

    /* renamed from: i, reason: collision with root package name */
    public final long f381291i;

    public t(jh.m mVar, android.content.Context context, jh.f0 f0Var, long j17) {
        this.f381291i = 0L;
        this.f381287e = mVar;
        if (this.f381288f == null) {
            this.f381288f = new android.os.Handler(android.os.Looper.getMainLooper(), this);
        }
        this.f381289g = context;
        this.f381290h = f0Var;
        this.f381291i = java.lang.Math.max(j17, 3000L);
    }

    public void a(jh.s sVar) {
        int size;
        int ordinal = this.f381290h.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            android.content.Context context = this.f381289g;
            synchronized (this) {
                jh.r rVar = this.f381286d;
                if (rVar != null) {
                    synchronized (rVar) {
                        ((java.util.HashSet) rVar.f381280f).remove(sVar);
                        size = ((java.util.HashSet) rVar.f381280f).size();
                    }
                    if (size == 0) {
                        oj.j.c("Matrix.WarmUpScheduler", "Unregister idle receiver.", new java.lang.Object[0]);
                        context.unregisterReceiver(this.f381286d);
                        this.f381286d = null;
                    }
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        jh.m mVar = this.f381287e;
        if (i17 == 1) {
            mVar.f381261d.a(new jh.c(mVar, (android.os.CancellationSignal) message.obj), "warm-up");
            return false;
        }
        if (i17 == 2) {
            mVar.f381261d.a(new jh.f(mVar, (android.os.CancellationSignal) message.obj), "consuming-up");
            return false;
        }
        if (i17 == 3) {
            mVar.f381261d.a(new jh.e(mVar, (android.os.CancellationSignal) message.obj), "clean-up");
            return false;
        }
        if (i17 != 4) {
            return false;
        }
        mVar.f381261d.a(new jh.h(mVar, (android.os.CancellationSignal) message.obj), "compute-disk-usage");
        return false;
    }
}
