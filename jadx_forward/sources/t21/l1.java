package t21;

/* loaded from: classes12.dex */
public class l1 implements z25.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t21.w0 f496364a;

    public l1(t21.w0 w0Var) {
        this.f496364a = w0Var;
    }

    @Override // z25.e
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideo", "onUploadFailure, errCode:%s, uploadID:%s", java.lang.Integer.valueOf(i17), str);
        t21.w0 w0Var = this.f496364a;
        t21.d3.G(w0Var.f496566f);
        w0Var.f496564d.mo815x76e0bfae(3, i17, "", w0Var);
    }

    @Override // z25.e
    public void b(float f17, long j17) {
        t21.w0 w0Var = this.f496364a;
        t21.v2 h17 = t21.d3.h(w0Var.f496566f);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideo", "%s info is null", w0Var.N());
            return;
        }
        if (h17.f496539d > j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadVideo", "%s cdntra cdnEndProc error oldpos:%d newpos:%d", w0Var.N(), java.lang.Integer.valueOf(h17.f496539d), java.lang.Long.valueOf(j17));
            return;
        }
        h17.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        h17.f496539d = (int) j17;
        h17.U = 1032;
        t21.d3.Q(h17);
    }

    @Override // z25.e
    public void c(z25.j jVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "upload success, field_aesKey:%s, fileId:%s, fileLen:%s", jVar.f551357b, jVar.f551356a, java.lang.Long.valueOf(jVar.f551359d));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.System.currentTimeMillis();
        long j17 = this.f496364a.f496576s;
        dn.h hVar = new dn.h();
        hVar.f69502xf11df5f5 = jVar.f551357b;
        hVar.f69522xf9dbbe9c = jVar.f551356a;
        hVar.f69526x419c9c3d = jVar.f551358c;
        hVar.f69523x17c343e7 = jVar.f551359d;
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        bm5.f0 f0Var = bm5.f0.f104104s;
        java.lang.String rj6 = ((k90.b) u0Var).rj(null, f0Var, this.f496364a.f496566f, false);
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, this.f496364a.f496566f, false);
        hVar.f69562x366b1958 = (int) com.p314xaae8f345.mm.vfs.w6.k(this.f496364a.K(tj6));
        hVar.f69525x419c7893 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ai(rj6);
        hVar.f69563x1209e7cb = this.f496364a.f496571n.h();
        ((ku5.t0) ku5.t0.f394148d).g(new t21.i1(this, tj6));
        t21.v2 h17 = t21.d3.h(this.f496364a.f496566f);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.g())) {
            java.lang.String str = ((("<msg><videomsg aeskey=\"" + hVar.f69502xf11df5f5 + "\" cdnthumbaeskey=\"" + hVar.f69502xf11df5f5 + "\" cdnvideourl=\"" + hVar.f69522xf9dbbe9c + "\" ") + "cdnthumburl=\"" + hVar.f69522xf9dbbe9c + "\" ") + "length=\"" + hVar.f69523x17c343e7 + "\" ") + "cdnthumblength=\"" + hVar.f69562x366b1958 + "\"/>";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            java.lang.String str2 = h17.N;
            if (str2 == null) {
                str2 = "";
            }
            sb6.append(str2);
            java.lang.String str3 = sb6.toString() + "</msg>";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "%s cdn callback new build cdnInfo:%s", this.f496364a.N(), str3);
            h17.f496558w = str3;
            t21.d3.Q(h17);
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(h17.g(), "msg", null);
        if (d17 != null) {
            t21.o2.Ui().B(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, f0Var, this.f496364a.f496566f, false), (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl"), (java.lang.String) d17.get(".msg.videomsg.$aeskey"));
        }
        if (h17.f496559x == 4) {
            t21.w0.H(this.f496364a, hVar);
            t21.w0 w0Var = this.f496364a;
            w0Var.f496564d.mo815x76e0bfae(0, 0, "", w0Var);
            this.f496364a.M(hVar);
            return;
        }
        f65.y0.f341552a.i(this.f496364a.f496566f, hVar.f69501xb9d727af);
        com.p314xaae8f345.mm.p944x882e457a.r1 d18 = gm0.j1.d();
        t21.w0 w0Var2 = this.f496364a;
        d18.g(new t21.q1(w0Var2.f496566f, w0Var2.I(), hVar, new t21.k1(this, h17)));
    }
}
