package t21;

/* loaded from: classes12.dex */
public class c1 implements z25.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t21.w0 f496252a;

    public c1(t21.w0 w0Var) {
        this.f496252a = w0Var;
    }

    @Override // z25.e
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideo", "onUploadFailure, errCode:%s, uploadID:%s", java.lang.Integer.valueOf(i17), str);
        t21.w0 w0Var = this.f496252a;
        t21.d3.G(w0Var.f496566f);
        w0Var.f496564d.mo815x76e0bfae(3, i17, "", w0Var);
    }

    @Override // z25.e
    public void b(float f17, long j17) {
    }

    @Override // z25.e
    public void c(z25.j jVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "upload success, field_aesKey:%s, fileId:%s, fileLen:%s", jVar.f551357b, jVar.f551356a, java.lang.Long.valueOf(jVar.f551359d));
        dn.h hVar = new dn.h();
        hVar.f69502xf11df5f5 = jVar.f551357b;
        hVar.f69522xf9dbbe9c = jVar.f551356a;
        hVar.f69526x419c9c3d = jVar.f551358c;
        hVar.f69523x17c343e7 = jVar.f551359d;
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, this.f496252a.f496566f, false);
        hVar.f69562x366b1958 = (int) com.p314xaae8f345.mm.vfs.w6.k(this.f496252a.K(tj6));
        hVar.f69563x1209e7cb = this.f496252a.f496571n.h();
        ((ku5.t0) ku5.t0.f394148d).g(new t21.z0(this, tj6));
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        t21.w0 w0Var = this.f496252a;
        d17.g(new t21.u1(w0Var.f496566f, w0Var.I(), hVar, new t21.b1(this)));
    }
}
