package vv1;

/* loaded from: classes3.dex */
public class n extends vv1.d {

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f521957m;

    /* renamed from: n, reason: collision with root package name */
    public t21.v2 f521958n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f521959o;

    @Override // vv1.d
    public boolean d() {
        wv1.a aVar = this.f521938d;
        if (aVar.a().f538922c) {
            t21.j3 d17 = t21.j3.f496333h.d(this.f521958n.g());
            if (d17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17.f496339d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_Video", "no origin video cdn url");
                java.lang.String str = this.f521958n.S;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    this.f521959o = true;
                    return false;
                }
                ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
                t21.v2 h17 = t21.d3.h(str);
                if (h17 == null) {
                    this.f521959o = true;
                    return false;
                }
                java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(this.f521957m, bm5.f0.f104103r, str, false);
                if (!com.p314xaae8f345.mm.vfs.w6.j(rj6)) {
                    this.f521959o = true;
                    return false;
                }
                if (com.p314xaae8f345.mm.vfs.w6.k(rj6) != h17.f496541f) {
                    this.f521959o = true;
                    return false;
                }
                l(h17, rj6);
                this.f521959o = true;
                return true;
            }
            this.f521959o = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgFileWorker_Video", "%s no origin video cdn url", aVar);
        } else {
            this.f521959o = false;
        }
        if (this.f521958n.i()) {
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f521957m;
            java.lang.String rj7 = ((k90.b) u0Var).rj(f9Var, bm5.f0.f104104s, f9Var.z0(), false);
            if (com.p314xaae8f345.mm.vfs.w6.j(rj7)) {
                l(this.f521958n, rj7);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_Video", "mMsgInfo is null, return");
            return false;
        }
        this.f521957m = f9Var;
        if (f9Var.z2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s is clean, return", this.f521957m);
            return false;
        }
        lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f521957m;
        ((qb5.g) oVar).getClass();
        if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.N(f9Var2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s is not video, return", this.f521957m);
            return false;
        }
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = this.f521957m.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        this.f521958n = h17;
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s videoInfo is null, return", this.f521957m);
            return false;
        }
        if (h17.f496544i != 198) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s videoInfo is invalid, return", this.f521957m);
        return false;
    }

    @Override // vv1.d
    public void k() {
        t21.v2 h17;
        if (!this.f521959o) {
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.o2.Ui().b(new vv1.m(this), android.os.Looper.getMainLooper());
            if (this.f521958n.j()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_Video", "start complete online video");
                wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                java.lang.String z07 = this.f521957m.z0();
                ((vf0.y1) x1Var).getClass();
                t21.d3.K(z07);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_Video", "start complete offline video");
            wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z08 = this.f521957m.z0();
            ((vf0.y1) x1Var2).getClass();
            t21.d3.E(z08, 10);
            wf0.x1 x1Var3 = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z09 = this.f521957m.z0();
            ((vf0.y1) x1Var3).getClass();
            t21.d3.L(z09);
            return;
        }
        lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f521957m;
        vv1.l lVar = new vv1.l(this);
        qb5.g gVar = (qb5.g) oVar;
        gVar.getClass();
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.N(f9Var)) {
            wf0.x1 x1Var4 = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z010 = f9Var.z0();
            ((vf0.y1) x1Var4).getClass();
            h17 = t21.d3.h(z010);
        } else {
            h17 = null;
        }
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "no video info for download origin video");
            return;
        }
        t21.j3 d17 = t21.j3.f496333h.d(h17.g());
        if (d17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17.f496339d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "no origin video cdn url");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g gVar2 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g(f9Var, h17, new ok4.c(java.lang.System.currentTimeMillis()), d17);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f fVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f(f9Var, h17.d(), true);
        fk4.k kVar = new fk4.k(gVar2);
        kVar.b(fVar);
        kVar.f345157l = new qb5.f(gVar, f9Var, lVar);
        boolean o17 = kVar.o();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "downloadRawVideo msgId:%d start:%b", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Boolean.valueOf(o17));
        if (!o17) {
            lVar.a(-1, "", "");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282696a.c(f9Var, kVar);
        new yd5.p(f9Var, h17.d(), false, 4).f542667f = java.lang.System.currentTimeMillis();
    }

    public final void l(t21.v2 v2Var, java.lang.String str) {
        int lastIndexOf;
        com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d c10396xb34a007d = new com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d();
        c10396xb34a007d.f146294d = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
        c10396xb34a007d.f146295e = str;
        if (this.f521938d.a().f538922c) {
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
            c10396xb34a007d.f146299i = "mp4";
        } else {
            java.lang.String str2 = c10396xb34a007d.f146295e;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = xv1.d.f538924a;
            java.lang.String str3 = "";
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (lastIndexOf = str2.lastIndexOf(".")) >= 0) {
                str3 = str2.substring(lastIndexOf + 1);
            }
            c10396xb34a007d.f146299i = str3;
        }
        c10396xb34a007d.f146298h = "video";
        c10396xb34a007d.f146296f = v2Var.d() + "." + c10396xb34a007d.f146299i;
        c10396xb34a007d.f146297g = v2Var.f496545j;
        c(c10396xb34a007d);
    }
}
