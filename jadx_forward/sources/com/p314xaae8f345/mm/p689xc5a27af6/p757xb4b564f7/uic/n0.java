package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class n0 extends wm3.a {

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f148890h = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.b0.f148856d);

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f148891i = "ohter_entrance";

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f148892d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f148893e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f148894f;

    /* renamed from: g, reason: collision with root package name */
    public db0.j f148895g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f148892d = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.m0(this));
        this.f148894f = "";
    }

    public static final boolean T6(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 n0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2) {
        java.util.LinkedList linkedList;
        n0Var.getClass();
        if (f9Var == null) {
            return false;
        }
        java.lang.String str = c10597xb1f0d2.f148123h;
        boolean z17 = c10597xb1f0d2.f148127o;
        if (!z17 && str == null) {
            return false;
        }
        if (z17 && ((linkedList = c10597xb1f0d2.f148129q) == null || linkedList.isEmpty())) {
            return false;
        }
        return com.p314xaae8f345.mm.ui.p2650x55bb7a46.qc.f284157a.b(f9Var.mo78013xfb85f7b0(), f9Var, f9Var.j(), c10597xb1f0d2);
    }

    public static final void U6(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 n0Var, android.view.ViewGroup viewGroup, int i17) {
        n0Var.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(i17);
        viewGroup.setLayoutParams(marginLayoutParams);
    }

    public final em.a V6() {
        return (em.a) ((jz5.n) this.f148892d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.l0(this));
        }
    }
}
