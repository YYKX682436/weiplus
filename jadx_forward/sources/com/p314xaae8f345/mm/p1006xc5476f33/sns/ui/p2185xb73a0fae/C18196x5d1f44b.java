package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2185xb73a0fae;

/* renamed from: com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper */
/* loaded from: classes4.dex */
public final class C18196x5d1f44b implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final ab4.f f250033d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k0 f250034e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f250035f;

    private C18196x5d1f44b(ab4.f fVar, android.view.ViewGroup viewGroup) {
        this.f250033d = fVar;
        this.f250035f = viewGroup;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2185xb73a0fae.C18196x5d1f44b b(ab4.f fVar, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newInstance", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2185xb73a0fae.C18196x5d1f44b c18196x5d1f44b = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2185xb73a0fae.C18196x5d1f44b(fVar, viewGroup);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newInstance", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        return c18196x5d1f44b;
    }

    public final void a() {
        ab4.f fVar;
        android.view.View x17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        android.view.ViewGroup viewGroup = this.f250035f;
        if (viewGroup != null && (fVar = this.f250033d) != null) {
            this.f250034e = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k0(viewGroup.getContext(), fVar, viewGroup);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("attachToParent", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k0 k0Var = this.f250034e;
            if (k0Var != null && (x17 = k0Var.x()) != null && viewGroup != null) {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) x17.getParent();
                if (viewGroup2 == null) {
                    viewGroup.addView(x17, viewGroup.getChildCount() - 1);
                } else if (viewGroup2 != viewGroup) {
                    viewGroup2.removeView(x17);
                    viewGroup.addView(x17, viewGroup.getChildCount() - 1);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachToParent", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_CREATE)
    /* renamed from: onCreate */
    public void m70834x3e5a77bb(p012xc85e97e9.p093xedfae76a.y yVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        try {
            if (this.f250033d != null) {
                a();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onDestroy */
    public void m70835xac79a11b(p012xc85e97e9.p093xedfae76a.y yVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k0 k0Var = this.f250034e;
            if (k0Var != null) {
                k0Var.L();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onPause */
    public void m70836xb01dfb57(p012xc85e97e9.p093xedfae76a.y yVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k0 k0Var = this.f250034e;
            if (k0Var != null) {
                k0Var.M();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onResume */
    public void m70837x57429eec(p012xc85e97e9.p093xedfae76a.y yVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k0 k0Var = this.f250034e;
            if (k0Var != null) {
                k0Var.K();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
    }
}
