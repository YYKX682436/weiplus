package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class m implements al1.e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168397a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f168398b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f168399c;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 pageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        this.f168397a = pageView;
    }

    @Override // al1.e
    public boolean a(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandActionBarHomeButtonStyle", "pageView click close button");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168397a;
        if (v5Var.r1().f87278v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandActionBarHomeButtonStyle", "pageView click close button, but nav area is hidden");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = v5Var.mo32091x9a3f0ba2().x0();
        if (x07 == null) {
            return false;
        }
        x07.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l4(x07, x07.f168235e.m0().b(), true, null));
        return false;
    }

    @Override // al1.e
    public int c() {
        return com.p314xaae8f345.mm.R.C30860x5b28f31.f561557lx;
    }

    @Override // al1.e
    public void d(al1.b actionBarThis, bm5.x0 navButtonGetter, bm5.x0 homeBtnGetter, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionBarThis, "actionBarThis");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navButtonGetter, "navButtonGetter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(homeBtnGetter, "homeBtnGetter");
        this.f168399c = true;
        if (actionBarThis.f87279w || actionBarThis.f87278v) {
            return;
        }
        android.content.Context context = actionBarThis.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168397a;
        if (v5Var.mo32091x9a3f0ba2().x0().m52173x328fb10a() != 1) {
            android.widget.ImageView imageView = (android.widget.ImageView) navButtonGetter.b();
            if (imageView != null) {
                imageView.setVisibility(0);
                android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout.LayoutParams");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12759xcecc55cd.LayoutParams layoutParams2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12759xcecc55cd.LayoutParams) layoutParams;
                ((android.widget.LinearLayout.LayoutParams) layoutParams2).leftMargin = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561557lx);
                ((android.widget.LinearLayout.LayoutParams) layoutParams2).rightMargin = imageView.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561106p);
                ((android.widget.LinearLayout.LayoutParams) layoutParams2).gravity = 17;
                imageView.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) navButtonGetter.d();
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        android.widget.ImageView imageView3 = (android.widget.ImageView) homeBtnGetter.b();
        if (imageView3 != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout.LayoutParams");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12759xcecc55cd.LayoutParams layoutParams4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12759xcecc55cd.LayoutParams) layoutParams3;
            int dimensionPixelOffset = imageView3.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561559lz);
            ((android.widget.LinearLayout.LayoutParams) layoutParams4).height = dimensionPixelOffset;
            ((android.widget.LinearLayout.LayoutParams) layoutParams4).width = dimensionPixelOffset;
            ((android.widget.LinearLayout.LayoutParams) layoutParams4).gravity = 17;
            ((android.widget.LinearLayout.LayoutParams) layoutParams4).leftMargin = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561557lx);
            ((android.widget.LinearLayout.LayoutParams) layoutParams4).rightMargin = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561558ly);
            imageView3.setLayoutParams(layoutParams4);
            imageView3.clearColorFilter();
            imageView3.setImageDrawable(b3.l.m9707x4a96be14(imageView3.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.bd9));
            imageView3.setColorFilter(v5Var.r1().m2211xbe2bf9aa(), android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }
}
