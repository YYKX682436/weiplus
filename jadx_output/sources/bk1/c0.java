package bk1;

/* loaded from: classes3.dex */
public final class c0 implements k91.e5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f21294a;

    public c0(yz5.a aVar) {
        this.f21294a = aVar;
    }

    @Override // k91.e5
    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaAppGetUserAuthorizeScopeListWithAttrs", "doFetch, batch sync done");
        ku5.u0 u0Var = ku5.t0.f312615d;
        final yz5.a aVar = this.f21294a;
        ((ku5.t0) u0Var).q(new java.lang.Runnable(aVar) { // from class: bk1.d0

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f21295d;

            {
                kotlin.jvm.internal.o.g(aVar, "function");
                this.f21295d = aVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f21295d.invoke();
            }
        });
    }
}
