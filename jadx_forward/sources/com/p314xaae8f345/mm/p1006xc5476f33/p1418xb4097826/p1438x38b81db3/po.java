package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class po implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f185806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.a0 f185807b;

    public po(r45.qt2 qt2Var, so2.a0 a0Var) {
        this.f185806a = qt2Var;
        this.f185807b = a0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[4];
        r45.qt2 qt2Var = this.f185806a;
        lVarArr[0] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
        lVarArr[1] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(2) : null);
        lVarArr[2] = new jz5.l("collection_id", pm0.v.u(this.f185807b.mo2128x1ed62e84()));
        lVarArr[3] = new jz5.l("sub_tab_type", 2);
        return kz5.c1.k(lVarArr);
    }
}
