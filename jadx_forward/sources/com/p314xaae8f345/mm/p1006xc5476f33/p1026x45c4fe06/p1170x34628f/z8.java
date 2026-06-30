package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class z8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h9 f168847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h9 h9Var) {
        super(0);
        this.f168847d = h9Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h9 h9Var = this.f168847d;
        android.view.ViewGroup.LayoutParams layoutParams = h9Var.f168213e.f434420m.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
        p91.b bVar = h9Var.f168213e;
        bVar.f434420m.setVisibility(8);
        bVar.f434413f.setVisibility(0);
        return jz5.f0.f384359a;
    }
}
