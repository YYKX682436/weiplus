package q54;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final za4.x0 f441737a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f441738b = false;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6 f441739c;

    public b(za4.x0 x0Var) {
        this.f441737a = x0Var;
    }

    public boolean a(android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("attachFloatPageViewToParentIfExist", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
        this.f441738b = false;
        if (viewGroup == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachFloatPageViewToParentIfExist", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
            return false;
        }
        try {
            ab4.b0 b17 = b();
            if (b17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6 c18403xee2674b6 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6(viewGroup.getContext());
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("sns_float_component_id", b17.f84350d);
                if (bundle != null && bundle.size() > 0) {
                    bundle2.putAll(bundle);
                }
                c18403xee2674b6.e(bundle2, (za4.g0) this.f441737a.f552747a.get(0));
                viewGroup.addView(c18403xee2674b6, viewGroup.getChildCount() - 1, new android.view.ViewGroup.LayoutParams(-1, -1));
                this.f441739c = c18403xee2674b6;
                this.f441738b = true;
                c(b17.G);
            }
        } catch (java.lang.Throwable unused) {
        }
        boolean z17 = this.f441738b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachFloatPageViewToParentIfExist", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
        return z17;
    }

    public final ab4.b0 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findAutoShowFloatPageViewInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
        za4.x0 x0Var = this.f441737a;
        if (x0Var != null) {
            java.util.LinkedList linkedList = x0Var.f552747a;
            if (a84.b0.e(linkedList)) {
                za4.g0 g0Var = (za4.g0) linkedList.get(0);
                if (g0Var != null) {
                    java.util.Map map = g0Var.f552617d;
                    if (!a84.b0.c(map)) {
                        for (ab4.d0 d0Var : ((java.util.LinkedHashMap) map).values()) {
                            if (d0Var instanceof ab4.b0) {
                                ab4.b0 b0Var = (ab4.b0) d0Var;
                                if (b0Var.H > 0) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findAutoShowFloatPageViewInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
                                    return b0Var;
                                }
                            }
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findAutoShowFloatPageViewInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
                return null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findAutoShowFloatPageViewInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
        return null;
    }

    public final void c(float f17) {
        android.view.View childAt;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFloatChildViewElevation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6 c18403xee2674b6 = this.f441739c;
        if (c18403xee2674b6 != null && c18403xee2674b6.getChildCount() > 0 && (childAt = c18403xee2674b6.getChildAt(0)) != null) {
            android.content.Context context = childAt.getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createDrawable", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a4z));
            gradientDrawable.setCornerRadius(f17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createDrawable", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
            childAt.setBackground(gradientDrawable);
            childAt.setElevation(childAt.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a_d));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFloatChildViewElevation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
    }
}
