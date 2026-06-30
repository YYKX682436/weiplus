package vv1;

/* loaded from: classes3.dex */
public class k extends vv1.d {

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f521953m;

    /* renamed from: n, reason: collision with root package name */
    public m11.b0 f521954n;

    @Override // vv1.d
    public boolean d() {
        if (this.f521953m.mo78013xfb85f7b0() == 268435505) {
            lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f521953m;
            ((qb5.g) oVar).getClass();
            if (com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.s(f9Var))) {
                wv1.a aVar = this.f521938d;
                if (aVar instanceof wv1.b) {
                    l((wv1.b) aVar);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_Image", "mMsgItem isn't AppMsgImageMsgItem, err");
                    a();
                }
                return true;
            }
        } else if (this.f521954n.k()) {
            lo.o oVar2 = (lo.o) i95.n0.c(lo.o.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f521953m;
            m11.b0 b0Var = this.f521954n;
            ((qb5.g) oVar2).getClass();
            java.lang.String x17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.x(f9Var2, b0Var, false);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
                p(x17);
                return true;
            }
        }
        return false;
    }

    @Override // vv1.d
    public boolean j() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        wv1.a aVar = this.f521938d;
        if (aVar == null || (f9Var = aVar.f531463b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_Image", "mMsgInfo is null, return");
            a();
            return false;
        }
        this.f521953m = f9Var;
        if (f9Var.z2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_Image", "mMsgInfo:%s is clean, return", this.f521953m);
            return false;
        }
        lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f521953m;
        ((qb5.g) oVar).getClass();
        if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.J(f9Var2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_Image", "mMsgInfo is not img msg, return");
            return false;
        }
        if (this.f521953m.mo78013xfb85f7b0() == 268435505) {
            return true;
        }
        lo.o oVar2 = (lo.o) i95.n0.c(lo.o.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = this.f521953m;
        ((qb5.g) oVar2).getClass();
        m11.b0 v17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.v(f9Var3);
        this.f521954n = v17;
        if (v17 != null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_Image", "mImgInfo is null, return");
        return false;
    }

    @Override // vv1.d
    public void k() {
        if (this.f521953m.mo78013xfb85f7b0() != 268435505) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_Image", "isOk:%b", java.lang.Boolean.valueOf(((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).c(this.f521954n.f404166a, tg3.l1.a(this.f521953m), 0, java.lang.Long.valueOf(this.f521953m.m124847x74d37ac6()), com.p314xaae8f345.mm.R.C30861xcebc809e.bzt, new vv1.j(this))));
        } else {
            lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f521953m;
            vv1.i iVar = new vv1.i(this);
            qb5.g gVar = (qb5.g) oVar;
            gVar.getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.d(f9Var, new qb5.e(gVar, iVar));
        }
    }

    public final void l(wv1.b bVar) {
        com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d c10396xb34a007d = new com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d();
        c10396xb34a007d.f146294d = bVar.e();
        lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f521953m;
        ((qb5.g) oVar).getClass();
        c10396xb34a007d.f146295e = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.s(f9Var);
        c10396xb34a007d.f146296f = bVar.d() + "." + c10396xb34a007d.f146299i;
        c10396xb34a007d.f146298h = "image";
        c10396xb34a007d.f146299i = bVar.c();
        c10396xb34a007d.f146297g = bVar.g();
        c(c10396xb34a007d);
    }

    public final void p(java.lang.String str) {
        int lastIndexOf;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str)) {
            str = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ai(str, 1);
        }
        com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d c10396xb34a007d = new com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d();
        c10396xb34a007d.f146294d = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
        c10396xb34a007d.f146295e = str;
        java.lang.String str2 = this.f521954n.f404170e;
        c10396xb34a007d.f146296f = str2;
        c10396xb34a007d.f146298h = "image";
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = xv1.d.f538924a;
        java.lang.String str3 = "";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (lastIndexOf = str2.lastIndexOf(".")) >= 0) {
            str3 = str2.substring(lastIndexOf + 1);
        }
        c10396xb34a007d.f146299i = str3;
        c10396xb34a007d.f146297g = this.f521954n.f404179n;
        c(c10396xb34a007d);
    }
}
