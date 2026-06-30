package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class tb implements ni1.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168659a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f168660b;

    public tb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 page) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        this.f168659a = page;
    }

    public final void a(al1.b bVar) {
        android.content.Context context = bVar.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12501xc5d62fec m2209x716f693c = bVar.m2209x716f693c();
        if (m2209x716f693c.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.LayoutParams layoutParams = m2209x716f693c.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            xi1.g mo50261xee5260a9 = this.f168659a.mo50261xee5260a9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50261xee5260a9);
            int dimensionPixelSize = mo50261xee5260a9.mo51612x60543150().a() == xi1.o.PORTRAIT ? context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561553lt) : context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561554lu);
            if (marginLayoutParams.rightMargin != dimensionPixelSize || marginLayoutParams.getMarginEnd() != dimensionPixelSize) {
                marginLayoutParams.rightMargin = dimensionPixelSize;
                marginLayoutParams.setMarginEnd(dimensionPixelSize);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MPPageViewActionBarExtensionImpl", "[applyActionBarSizeProperty] reset capsule rightMargin:" + dimensionPixelSize);
                m2209x716f693c.requestLayout();
            }
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        al1.e m2213x3bbc543 = bVar.m2213x3bbc543();
        int c17 = m2213x3bbc543 != null ? m2213x3bbc543.c() : com.p314xaae8f345.mm.R.C30860x5b28f31.f561560m0;
        bVar.i();
        bVar.m2226xc8bb9298(context.getResources().getDimensionPixelOffset(c17));
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561555lv);
        bVar.m2214xe72f08c2(dimensionPixelOffset);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MPPageViewActionBarExtensionImpl", "[applyActionBarSizeProperty] ActionBar height=" + dimensionPixelOffset + "  density=" + context.getResources().getDisplayMetrics().density);
    }

    @Override // ni1.c
    public void b() {
        this.f168660b = true;
        al1.b r17 = this.f168659a.r1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getActionBar(...)");
        a(r17);
    }

    @Override // ni1.c
    public void c() {
        this.f168660b = false;
    }

    @Override // ni1.c
    /* renamed from: onConfigurationChanged */
    public void mo14690x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        if (this.f168660b) {
            al1.b r17 = this.f168659a.r1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getActionBar(...)");
            a(r17);
        }
    }

    @Override // ni1.c
    /* renamed from: onDestroy */
    public void mo14691xac79a11b() {
        this.f168660b = false;
    }
}
