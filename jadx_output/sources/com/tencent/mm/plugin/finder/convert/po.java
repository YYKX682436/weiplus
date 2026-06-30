package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class po implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f104273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.a0 f104274b;

    public po(r45.qt2 qt2Var, so2.a0 a0Var) {
        this.f104273a = qt2Var;
        this.f104274b = a0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[4];
        r45.qt2 qt2Var = this.f104273a;
        lVarArr[0] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
        lVarArr[1] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
        lVarArr[2] = new jz5.l("collection_id", pm0.v.u(this.f104274b.getItemId()));
        lVarArr[3] = new jz5.l("sub_tab_type", 2);
        return kz5.c1.k(lVarArr);
    }
}
