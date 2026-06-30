package vf0;

/* loaded from: classes12.dex */
public final class b3 extends jm0.g implements wf0.j1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).Zi(this);
    }

    @Override // jm0.g
    public void S6() {
        ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).mj(this);
    }

    @Override // wf0.j1
    public void l1(qi3.e0 event) {
        vf0.h3 h3Var;
        t21.v2 d17;
        zz.b hj6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        zf0.v0 v0Var = (zf0.v0) event.f445225b;
        if (v0Var == null || (h3Var = v0Var.f554096i) == null || !vf0.m3.j(event)) {
            return;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = event.f445230g;
        java.lang.String a17 = c16564xb55e1d5 != null ? c16564xb55e1d5.a() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d52 = event.f445230g;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(a17, c16564xb55e1d52 != null ? c16564xb55e1d52.f231013d : 0L);
        if (k17 == null || (d17 = vf0.m3.d(k17)) == null) {
            return;
        }
        ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).cj(k17, false);
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(k17, d17.d(), false);
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(k17, bm5.f0.f104104s, d17.d(), false);
        java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(k17, bm5.f0.f104103r, d17.d(), false);
        if (com.p314xaae8f345.mm.vfs.w6.j(rj6)) {
            java.lang.String f17 = d17.f();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getImportPath(...)");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
                hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).hj(f17, rj6, tj6, k17.mo78013xfb85f7b0(), d17.f496548m, com.p314xaae8f345.mm.vfs.w6.p(f17));
            } else if (com.p314xaae8f345.mm.vfs.w6.j(tj6)) {
                java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(tj6);
                a00.i iVar = (a00.i) i95.n0.c(a00.i.class);
                int mo78013xfb85f7b0 = k17.mo78013xfb85f7b0();
                y15.c n17 = h3Var.f517712f.n();
                hj6 = ((t02.e) iVar).bj(rj6, mo78013xfb85f7b0, n17.m75945x2fec8307(n17.f540455d + 18), null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.video.VideoSendFileOpFSC", "check video thumb dup, fileName = " + d17.d() + " result = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, k17.mo78013xfb85f7b0(), p17, null).f559224a);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.video.VideoSendFileOpFSC", "import path and thumb path both not exist");
                hj6 = null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("check video dup, fileName = ");
            sb6.append(d17.d());
            sb6.append(" result = ");
            sb6.append(hj6 != null ? hj6.m180095x9616526c() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.video.VideoSendFileOpFSC", sb6.toString());
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(rj7)) {
            a00.i iVar2 = (a00.i) i95.n0.c(a00.i.class);
            int mo78013xfb85f7b02 = k17.mo78013xfb85f7b0();
            y15.c n18 = h3Var.f517712f.n();
            ((t02.e) iVar2).cj(rj7, mo78013xfb85f7b02, n18.m75945x2fec8307(n18.f540455d + 21), null, new vf0.a3(d17));
        }
    }
}
