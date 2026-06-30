package qe5;

/* loaded from: classes8.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.z1 f443751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(qe5.z1 z1Var) {
        super(1);
        this.f443751d = z1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        zh1.v0 v0Var;
        java.lang.String e17;
        oi3.g gVar;
        kd5.e state = (kd5.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        kd5.q qVar = (kd5.q) state.a(kd5.q.class);
        qe5.z1 z1Var = this.f443751d;
        if (qVar != null) {
            kd5.e T6 = z1Var.T6();
            java.lang.String str = T6 != null ? T6.f388426x : null;
            kd5.e T62 = z1Var.T6();
            java.lang.String m75945x2fec8307 = (T62 == null || (gVar = T62.f388414i) == null) ? null : gVar.m75945x2fec8307(gVar.f427150d + 13);
            jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
            ot0.q v17 = ot0.q.v(m75945x2fec8307);
            if (v17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppAttachDownLoadUtil", "parse content error?? content:%s", m75945x2fec8307);
                e17 = "";
            } else {
                jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
                java.lang.String str2 = v17.f430223o;
                ((ht.a) vVar).getClass();
                e17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.e(str2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getMimeTypeByExt(...)");
            }
            ((ht.s) a0Var).getClass();
            if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.k(str, e17)) {
                kd5.e T63 = z1Var.T6();
                java.lang.String str3 = T63 != null ? T63.F : null;
                kd5.e T64 = z1Var.T6();
                java.lang.String str4 = T64 != null ? T64.f388426x : null;
                if (x51.t1.b(str3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.File.LoadOpenMaterialsUIC", "loadOpenMaterials, filePath is empty");
                } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, z1Var.f443761d) || z1Var.f443762e == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622.b(str3, str4);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5.class);
                    if (k5Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.File.LoadOpenMaterialsUIC", "loadOpenMaterials, openMaterialService is null");
                    } else {
                        zh1.p pVar = (zh1.p) k5Var;
                        if (pVar.Vi(bi1.g.ATTACH)) {
                            pVar.Ni(b17, new qe5.w1(z1Var, b17, k5Var));
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.LoadOpenMaterialsUIC", "loadOpenMaterials, openMaterialService is not enabled");
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.LoadOpenMaterialsUIC", "loadOpenMaterials, already load");
                }
            }
        }
        if (((kd5.s) state.a(kd5.s.class)) != null && (v0Var = z1Var.f443763f) != null) {
            v0Var.r();
        }
        return jz5.f0.f384359a;
    }
}
