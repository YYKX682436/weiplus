package kd2;

/* loaded from: classes2.dex */
public final class j0 implements o04.p {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f388295a = "";

    /* renamed from: b, reason: collision with root package name */
    public kd2.i0 f388296b;

    @Override // o04.p
    public r45.x60 a() {
        return b(this.f388296b);
    }

    public final r45.x60 b(kd2.i0 i0Var) {
        r45.x60 x60Var = new r45.x60();
        if (i0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = i0Var.f388289a;
            java.lang.String m59226x730bcac6 = abstractC14490x69736cb5.getFeedObject().m59226x730bcac6();
            if (!java.lang.Boolean.valueOf(!(m59226x730bcac6 == null || m59226x730bcac6.length() == 0)).booleanValue()) {
                m59226x730bcac6 = null;
            }
            if (m59226x730bcac6 == null) {
                m59226x730bcac6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o0z, abstractC14490x69736cb5.getFeedObject().getNickNameSpan());
            }
            x60Var.f471346d = m59226x730bcac6;
            x60Var.f471349g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8e);
            x60Var.f471347e = "2";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderRecoverPageHelper", "onGetRecoveryData " + hc2.b0.f(abstractC14490x69736cb5, true) + " progress:" + i0Var.f388290b);
            r45.rs2 rs2Var = new r45.rs2();
            rs2Var.set(0, java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
            rs2Var.set(1, java.lang.Long.valueOf(i0Var.f388290b * ((long) 1000)));
            x60Var.f471348f = hc2.b.a(rs2Var);
        }
        return x60Var;
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderRecoverPageHelper", "resetRecoverData");
        this.f388296b = null;
        ((q04.y) ((xs.k1) i95.n0.c(xs.k1.class))).Di(this.f388295a, 2, new r45.x60());
    }
}
