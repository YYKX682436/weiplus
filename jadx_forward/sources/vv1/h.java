package vv1;

/* loaded from: classes9.dex */
public class h extends vv1.d {

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f521947m;

    /* renamed from: n, reason: collision with root package name */
    public long f521948n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f521949o;

    /* renamed from: p, reason: collision with root package name */
    public im5.a f521950p;

    @Override // vv1.d
    public boolean d() {
        lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
        java.lang.String str = this.f521949o;
        long j17 = this.f521948n;
        java.lang.String Q0 = this.f521947m.Q0();
        ((qb5.g) oVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d g17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.g(str, j17, Q0);
        lo.o oVar2 = (lo.o) i95.n0.c(lo.o.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f521947m;
        ((qb5.g) oVar2).getClass();
        if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.u(f9Var, g17)) {
            return false;
        }
        com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d c10396xb34a007d = new com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d();
        wv1.a aVar = this.f521938d;
        c10396xb34a007d.f146294d = aVar.e();
        c10396xb34a007d.f146295e = g17.f68099xfeae815;
        c10396xb34a007d.f146296f = aVar.d();
        c10396xb34a007d.f146298h = "file";
        c10396xb34a007d.f146299i = aVar.c();
        c10396xb34a007d.f146297g = aVar.g() / 1000;
        c(c10396xb34a007d);
        return true;
    }

    @Override // vv1.d, im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_File", "dead");
        im5.a aVar = this.f521950p;
        if (aVar != null) {
            aVar.mo10668x2efc64();
        }
    }

    @Override // vv1.d
    public boolean j() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_File", "start %s", this);
        wv1.a aVar = this.f521938d;
        if (aVar == null || (f9Var = aVar.f531463b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_File", "mMsgInfo is null, err");
            return false;
        }
        this.f521947m = f9Var;
        this.f521948n = f9Var.m124847x74d37ac6();
        ot0.q v17 = ot0.q.v(this.f521947m.j());
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_File", "parse msgContent error, %s", this.f521947m.j());
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430227p) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.L)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_File", "msgContent format error, %s", this.f521947m.j());
            v17.f430227p = "" + v17.L.hashCode();
        }
        java.lang.String str = v17.f430227p;
        this.f521949o = str;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_File", "MediaId is null, err return");
        return false;
    }

    @Override // vv1.d
    public void k() {
        lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
        java.lang.String str = this.f521949o;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f521947m;
        vv1.g gVar = new vv1.g(this);
        qb5.g gVar2 = (qb5.g) oVar;
        gVar2.getClass();
        boolean z17 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChooseMsgFileCompat", "mediaId:%s or msg is null, err", str);
        } else {
            qb5.a aVar = new qb5.a(gVar2, str, gVar);
            c01.d9.e().a(728, aVar);
            if (!(!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.R(str, f9Var))) {
                gVar.a(0, "");
                c01.d9.e().q(728, aVar);
            }
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_File", "initOk:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_File", "initOk fail");
        a();
    }
}
