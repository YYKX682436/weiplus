package k5;

/* loaded from: classes13.dex */
public class n implements java.lang.Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f385676g = a5.a0.e("StopWorkRunnable");

    /* renamed from: d, reason: collision with root package name */
    public final b5.w f385677d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f385678e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f385679f;

    public n(b5.w wVar, java.lang.String str, boolean z17) {
        this.f385677d = wVar;
        this.f385678e = str;
        this.f385679f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean containsKey;
        boolean i17;
        b5.w wVar = this.f385677d;
        p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc abstractC1265x5c5aefcc = wVar.f99430c;
        b5.e eVar = wVar.f99433f;
        j5.x n17 = abstractC1265x5c5aefcc.n();
        abstractC1265x5c5aefcc.c();
        try {
            java.lang.String str = this.f385678e;
            synchronized (eVar.f99401q) {
                containsKey = ((java.util.HashMap) eVar.f99396i).containsKey(str);
            }
            if (this.f385679f) {
                i17 = this.f385677d.f99433f.h(this.f385678e);
            } else {
                if (!containsKey) {
                    j5.g0 g0Var = (j5.g0) n17;
                    if (g0Var.f(this.f385678e) == a5.q0.RUNNING) {
                        g0Var.p(a5.q0.ENQUEUED, this.f385678e);
                    }
                }
                i17 = this.f385677d.f99433f.i(this.f385678e);
            }
            a5.a0.c().a(f385676g, java.lang.String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f385678e, java.lang.Boolean.valueOf(i17)), new java.lang.Throwable[0]);
            abstractC1265x5c5aefcc.h();
        } finally {
            abstractC1265x5c5aefcc.f();
        }
    }
}
