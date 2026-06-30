package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class d0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f103108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.c0 f103109b;

    public d0(r45.qt2 qt2Var, so2.c0 c0Var) {
        this.f103108a = qt2Var;
        this.f103109b = c0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[4];
        r45.qt2 qt2Var = this.f103108a;
        lVarArr[0] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
        lVarArr[1] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
        lVarArr[2] = new jz5.l("collection_id", pm0.v.u(this.f103109b.getItemId()));
        lVarArr[3] = new jz5.l("sub_tab_type", 2);
        return kz5.c1.k(lVarArr);
    }
}
