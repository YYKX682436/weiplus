package cd0;

/* loaded from: classes5.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f122079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f122080f;

    public k(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var) {
        this.f122078d = str;
        this.f122079e = f9Var;
        this.f122080f = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ot0.q v17 = ot0.q.v(this.f122078d);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f122079e;
        if (v17 != null && ez.v0.f339310a.j(java.lang.Integer.valueOf(v17.f430199i))) {
            int x17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.x(f9Var.m124847x74d37ac6(), f9Var.Q0(), v17.n());
            ot0.h y17 = v17.y(rt0.b.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(y17, "piece(...)");
            long j17 = ((rt0.b) y17).f480905b;
            if (j17 > 0) {
                this.f122080f.f391654d = j17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgHandler", "pause msg:%s send, result:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Integer.valueOf(x17));
        }
        ((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).aj(f9Var.m124847x74d37ac6(), f9Var.Q0());
    }
}
