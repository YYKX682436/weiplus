package cd0;

/* loaded from: classes5.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f40546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f40547f;

    public k(java.lang.String str, com.tencent.mm.storage.f9 f9Var, kotlin.jvm.internal.g0 g0Var) {
        this.f40545d = str;
        this.f40546e = f9Var;
        this.f40547f = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ot0.q v17 = ot0.q.v(this.f40545d);
        com.tencent.mm.storage.f9 f9Var = this.f40546e;
        if (v17 != null && ez.v0.f257777a.j(java.lang.Integer.valueOf(v17.f348666i))) {
            int x17 = com.tencent.mm.pluginsdk.model.app.k0.x(f9Var.getMsgId(), f9Var.Q0(), v17.n());
            ot0.h y17 = v17.y(rt0.b.class);
            kotlin.jvm.internal.o.f(y17, "piece(...)");
            long j17 = ((rt0.b) y17).f399372b;
            if (j17 > 0) {
                this.f40547f.f310121d = j17;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgHandler", "pause msg:%s send, result:%s", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Integer.valueOf(x17));
        }
        ((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).aj(f9Var.getMsgId(), f9Var.Q0());
    }
}
