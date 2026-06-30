package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class tz implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f201450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f201451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xq1 f201452f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.q63 f201453g;

    public tz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var, r45.fr1 fr1Var, r45.xq1 xq1Var, r45.q63 q63Var) {
        this.f201450d = m10Var;
        this.f201451e = fr1Var;
        this.f201452f = xq1Var;
        this.f201453g = q63Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.z87 z87Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f201450d;
        m10Var.f200531J = true;
        r45.fr1 fr1Var = this.f201451e;
        r45.h41 h41Var = (r45.h41) fr1Var.m75936x14adae67(21);
        java.lang.String str = null;
        java.lang.String m75945x2fec8307 = h41Var != null ? h41Var.m75945x2fec8307(1) : null;
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            r45.xq1 xq1Var = this.f201452f;
            if (xq1Var != null) {
                str = xq1Var.m75945x2fec8307(3);
            }
        } else {
            r45.h41 h41Var2 = (r45.h41) fr1Var.m75936x14adae67(21);
            if (h41Var2 != null) {
                str = h41Var2.m75945x2fec8307(1);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pz pzVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10.R;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = m10Var.f200534c;
        android.content.Context context = m10Var.f200532a.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.xq1 xq1Var2 = this.f201452f;
        r45.fr1 fr1Var2 = this.f201451e;
        java.lang.String m75945x2fec83072 = fr1Var2.m75945x2fec8307(4);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a;
        boolean a17 = pzVar.a(fr1Var);
        java.lang.String str2 = (!pzVar.a(fr1Var) ? str == null : (z87Var = (r45.z87) fr1Var.m75936x14adae67(18)) == null || (str = z87Var.m75945x2fec8307(4)) == null) ? str : "";
        android.content.Context context2 = m10Var.f200532a.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        r45.yq1 yq1Var = ((mm2.c1) m10Var.f200534c.P0(mm2.c1.class)).f410344g6;
        pzVar.b(lVar, context, xq1Var2, fr1Var2, m75945x2fec83072, b3Var.g(a17, 7, str2, context2, yq1Var != null ? yq1Var.m75939xb282bd08(5) : -1), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sz(this.f201453g, m10Var), ((mm2.c1) m10Var.f200534c.P0(mm2.c1.class)).N2);
    }
}
