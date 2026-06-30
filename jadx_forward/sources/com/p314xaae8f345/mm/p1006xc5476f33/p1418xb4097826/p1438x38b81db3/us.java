package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class us implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f186270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.q5 f186271b;

    public us(r45.qt2 qt2Var, bw5.q5 q5Var) {
        this.f186270a = qt2Var;
        this.f186271b = q5Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        jz5.l[] lVarArr = new jz5.l[4];
        java.lang.String str3 = "";
        r45.qt2 qt2Var = this.f186270a;
        if (qt2Var == null || (str2 = qt2Var.m75945x2fec8307(2)) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
        if (qt2Var != null && (m75945x2fec8307 = qt2Var.m75945x2fec8307(1)) != null) {
            str3 = m75945x2fec8307;
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0));
        lVarArr[3] = new jz5.l("productid", java.lang.Long.valueOf(this.f186271b.f113474d));
        return kz5.c1.k(lVarArr);
    }
}
