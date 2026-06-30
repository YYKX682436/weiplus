package tf1;

/* loaded from: classes7.dex */
public abstract class h {
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a(sf.f fVar) {
        if (!(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = fVar.m();
        if (m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) m17).t3();
        }
        if (m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) m17).t3();
        }
        return null;
    }

    public static int b(java.lang.String str) {
        java.util.Map map;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(str);
        synchronized (tf1.g.class) {
            map = tf1.g.f500410f;
            if (map == null) {
                tf1.g.h();
                map = tf1.g.f500410f;
            }
        }
        return ((java.lang.Integer) map.get(d17)).intValue();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 c(int i17) {
        java.util.Map map;
        synchronized (tf1.g.class) {
            map = tf1.g.f500411g;
            if (map == null) {
                tf1.g.h();
                map = tf1.g.f500411g;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0) map.get(java.lang.Integer.valueOf(i17));
        return w0Var == null ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.HIDE : w0Var;
    }
}
