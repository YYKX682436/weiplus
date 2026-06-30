package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class us implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f104737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.q5 f104738b;

    public us(r45.qt2 qt2Var, bw5.q5 q5Var) {
        this.f104737a = qt2Var;
        this.f104738b = q5Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String string;
        jz5.l[] lVarArr = new jz5.l[4];
        java.lang.String str3 = "";
        r45.qt2 qt2Var = this.f104737a;
        if (qt2Var == null || (str2 = qt2Var.getString(2)) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
        if (qt2Var != null && (string = qt2Var.getString(1)) != null) {
            str3 = string;
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0));
        lVarArr[3] = new jz5.l("productid", java.lang.Long.valueOf(this.f104738b.f31941d));
        return kz5.c1.k(lVarArr);
    }
}
