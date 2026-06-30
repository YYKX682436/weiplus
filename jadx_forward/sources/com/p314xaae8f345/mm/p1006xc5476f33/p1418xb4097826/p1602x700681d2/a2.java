package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class a2 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f203787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.e f203788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203789c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203790d;

    public a2(r45.qt2 qt2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.e eVar, java.lang.String str, in5.s0 s0Var) {
        this.f203787a = qt2Var;
        this.f203788b = eVar;
        this.f203789c = str;
        this.f203790d = s0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String m75945x2fec8307;
        jz5.l[] lVarArr = new jz5.l[7];
        java.lang.String str4 = "";
        r45.qt2 qt2Var = this.f203787a;
        if (qt2Var == null || (str2 = qt2Var.m75945x2fec8307(2)) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
        if (qt2Var == null || (str3 = qt2Var.m75945x2fec8307(1)) == null) {
            str3 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        if (qt2Var != null && (m75945x2fec8307 = qt2Var.m75945x2fec8307(0)) != null) {
            str4 = m75945x2fec8307;
        }
        lVarArr[2] = new jz5.l("behaviour_session_id", str4);
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0));
        lVarArr[4] = new jz5.l("collection_id", pm0.v.u(this.f203788b.f203824d.m75942xfb822ef2(0)));
        lVarArr[5] = new jz5.l("finder_username", this.f203789c);
        lVarArr[6] = new jz5.l("profile_tab_name", this.f203790d.f374654e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ey7));
        return kz5.c1.k(lVarArr);
    }
}
