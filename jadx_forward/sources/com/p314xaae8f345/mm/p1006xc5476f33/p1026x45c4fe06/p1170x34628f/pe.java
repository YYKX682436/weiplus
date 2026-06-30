package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class pe extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h3 f168550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f168551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h3 h3Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        super(1);
        this.f168550d = h3Var;
        this.f168551e = k0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            android.view.View view = this.f168550d.f168047g;
            if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f72 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72) view;
                c12494xc37d1f72.f167881e.findViewById(com.p314xaae8f345.mm.R.id.jgp).setPadding(c12494xc37d1f72.f167881e.getPaddingLeft(), c12494xc37d1f72.f167881e.getPaddingTop(), c12494xc37d1f72.f167881e.getPaddingRight(), 0);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f168551e;
            if (k0Var.P.size() > 0 && k0Var.D1 == null) {
                k0Var.g();
                k0Var.b(0);
            }
        }
        return jz5.f0.f384359a;
    }
}
