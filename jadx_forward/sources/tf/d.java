package tf;

/* loaded from: classes7.dex */
public abstract class d {
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f(sf.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = fVar.m();
        if (m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) m17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.PipPluginHandlerCommons", "getPageView, component(%s) is not AppBrandPageView", m17);
        if (m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) m17).V0();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.PipPluginHandlerCommons", "getPageView, component(%s) is not AppBrandService", m17);
        return null;
    }

    public boolean a(sf.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 h17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "amIPipPlayer");
        if (fVar == null || (f17 = f(fVar)) == null || (h17 = h(f17)) == null) {
            return false;
        }
        return java.util.Objects.equals(h17.f169063m, d());
    }

    public void b(sf.f fVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "exitPip");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f17 = f(fVar);
        jc1.d dVar = jc1.f.f380448d;
        if (f17 == null) {
            fVar.a(dVar);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 h17 = h(f17);
        if (h17 == null) {
            fVar.a(dVar);
            return;
        }
        int ordinal = h17.g(c()).ordinal();
        if (ordinal == 1) {
            fVar.a(jc1.g.f380470i);
        } else if (ordinal != 2) {
            fVar.a(jc1.f.f380445a);
        } else {
            fVar.a(jc1.g.f380469h);
        }
    }

    public abstract int c();

    public abstract java.lang.String d();

    public abstract java.lang.String e();

    public abstract tf.f g();

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = v5Var.t3();
        if (t37 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(e(), "handlePipInfo, null == runtime");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 z07 = t37.z0();
        if (z07 != null) {
            return z07;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(e(), "handlePipInfo, null == pipManager");
        return null;
    }

    public abstract pd1.n i();

    /* JADX WARN: Removed duplicated region for block: B:32:0x010a A[Catch: Exception -> 0x0151, TryCatch #0 {Exception -> 0x0151, blocks: (B:26:0x00aa, B:30:0x0102, B:32:0x010a, B:33:0x0114, B:36:0x014b, B:69:0x011e, B:73:0x0149, B:75:0x00b8, B:91:0x00f8, B:92:0x00fb, B:93:0x00fe), top: B:25:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011e A[Catch: Exception -> 0x0151, TryCatch #0 {Exception -> 0x0151, blocks: (B:26:0x00aa, B:30:0x0102, B:32:0x010a, B:33:0x0114, B:36:0x014b, B:69:0x011e, B:73:0x0149, B:75:0x00b8, B:91:0x00f8, B:92:0x00fb, B:93:0x00fe), top: B:25:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(sf.f r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.d.j(sf.f, java.lang.String):void");
    }

    public void k(sf.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 h17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "removePipId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f17 = f(fVar);
        if (f17 == null || (h17 = h(f17)) == null) {
            return;
        }
        pd1.n i17 = i();
        java.lang.String d17 = d();
        h17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.d h18 = h17.h(f17.hashCode());
        if (h18 == null) {
            return;
        }
        h18.c(i17, d17);
    }
}
