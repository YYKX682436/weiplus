package nt1;

/* loaded from: classes9.dex */
public class a implements nt1.c {
    @Override // nt1.c
    public java.util.List b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        java.lang.String j17 = f9Var.j();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        ot0.q v17 = j17 != null ? ot0.q.v(j17) : null;
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgImgMsgHandler", "content is null");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d D0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().D0(v17.f430227p);
        if (D0 != null) {
            nt1.c.a(arrayList, f9Var, D0.f68099xfeae815, 30);
        }
        nt1.c.a(arrayList, f9Var, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true), 31);
        return arrayList;
    }
}
