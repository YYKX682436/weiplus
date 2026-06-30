package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class tx extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.tx f201448d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.tx();

    public tx() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList<r45.ix0> m75941xfb821914;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("p2p enable resp.isSuccess=");
        sb6.append(fVar != null ? java.lang.Boolean.valueOf(fVar.b()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVideoDefinitionWidget", sb6.toString());
        boolean z17 = fVar != null && fVar.b();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            r45.ml1 ml1Var = (r45.ml1) fVar.f152151d;
            if (ml1Var == null || (m75941xfb821914 = ml1Var.m75941xfb821914(1)) == null) {
                return null;
            }
            for (r45.ix0 ix0Var : m75941xfb821914) {
                if (ix0Var.m75939xb282bd08(0) == 2) {
                    int m75939xb282bd08 = ix0Var.m75939xb282bd08(1);
                    if (m75939xb282bd08 == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVideoDefinitionWidget", "real success");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVideoDefinitionWidget", "retCode=" + m75939xb282bd08);
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVideoDefinitionWidget", "p2p enable operation failed");
        }
        return f0Var;
    }
}
