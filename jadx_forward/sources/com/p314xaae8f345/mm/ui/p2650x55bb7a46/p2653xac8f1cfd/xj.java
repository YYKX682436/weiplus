package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class xj implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ck f281770c;

    public xj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ck ckVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        this.f281770c = ckVar;
        this.f281768a = f9Var;
        this.f281769b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.RevokeMsgComponent", "errCode:%d, retType:%d, errMsg:%s", java.lang.Integer.valueOf(fVar.f152149b), java.lang.Integer.valueOf(fVar.f152148a), fVar.f152150c);
        this.f281770c.f280113d.b();
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            this.f281768a.y3();
            java.lang.String string = this.f281770c.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5l);
            java.lang.String str = "  " + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3_);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f281768a;
            com.p314xaae8f345.mm.p957x53236a1b.d1.J(string, str, f9Var, f9Var.J0());
            this.f281768a.p1("");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(this.f281768a.m124847x74d37ac6(), this.f281768a);
            c01.v1.G(this.f281770c.f280113d.x(), this.f281769b);
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wj wjVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wj(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.w(wjVar, 300000L, null);
        } else {
            db5.e1.y(this.f281770c.f280113d.g(), fVar.f152150c, "", this.f281770c.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5m), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vj(this));
        }
        return null;
    }
}
