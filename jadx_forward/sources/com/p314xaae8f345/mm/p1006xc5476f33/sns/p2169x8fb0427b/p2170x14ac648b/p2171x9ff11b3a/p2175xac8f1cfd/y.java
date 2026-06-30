package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class y extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 {
    public final android.view.ViewGroup A;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 B;
    public boolean C;
    public int D;
    public final boolean E;
    public boolean F;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d G;
    public final boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f247362J;
    public android.animation.AnimatorSet K;
    public android.animation.AnimatorSet L;
    public final android.os.Handler M;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f247363s;

    /* renamed from: t, reason: collision with root package name */
    public final ab4.j0 f247364t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f247365u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f247366v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f247367w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f247368x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.FrameLayout f247369y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 f247370z;

    /* JADX WARN: Multi-variable type inference failed */
    public y(android.content.Context context, ab4.j0 j0Var, android.view.ViewGroup viewGroup) {
        super(context, j0Var, viewGroup);
        this.C = false;
        this.D = 0;
        this.G = null;
        this.H = false;
        this.I = false;
        this.f247362J = false;
        this.K = null;
        this.L = null;
        this.M = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t(this, android.os.Looper.getMainLooper());
        this.f247363s = context;
        this.A = viewGroup;
        this.f247364t = j0Var;
        this.E = j0Var.f84360q == 141;
        boolean z17 = j0Var.f84359p == 1;
        this.H = z17;
        h();
        k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFloatBarCompWrapper", "refreshView, cid=" + j0Var.f84350d + ", hash=" + hashCode());
        if ((context instanceof p012xc85e97e9.p093xedfae76a.y) && z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.C17911xf69eff46 c17911xf69eff46 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.C17911xf69eff46(this, (p012xc85e97e9.p093xedfae76a.y) context);
            this.G = c17911xf69eff46;
            c17911xf69eff46.mo48813x58998cd();
        }
    }

    public static /* synthetic */ boolean O(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y yVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        boolean z17 = yVar.I;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return z17;
    }

    public static /* synthetic */ boolean P(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y yVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        yVar.f247362J = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return z17;
    }

    public static /* synthetic */ boolean R(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y yVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        boolean z17 = yVar.F;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        ab4.j0 j0Var = this.f247364t;
        if (j0Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kvReport, mFloatBarInfo==null?");
            sb6.append(j0Var == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFloatBarCompWrapper", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return false;
        }
        if (!super.D(jSONObject)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return false;
        }
        try {
            jSONObject.put("clickCount", this.D);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFloatBarCompWrapper", "kv=" + jSONObject.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AdLandingFloatBarCompWrapper", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        super.K();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 o2Var = this.B;
        if (o2Var != null) {
            o2Var.K();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFloatBarCompWrapper", "viewWillAppear");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 o2Var2 = this.B;
        if ((o2Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.j5) && !((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.j5) o2Var2).W().isEnabled()) {
            this.C = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void L() {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        super.L();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 o2Var = this.B;
        if (o2Var != null) {
            o2Var.L();
        }
        this.M.removeCallbacksAndMessages(null);
        if (this.H && (abstractC20980x9b9ad01d = this.G) != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        android.animation.AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.end();
            this.L.removeAllListeners();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        super.M();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 o2Var = this.B;
        if (o2Var != null) {
            o2Var.M();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFloatBarCompWrapper", "viewWillDisappear, exposureCount=" + r() + ", stayTime=" + w());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public void S() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("animationFloatBarExitSnsNativeUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (X()) {
            this.F = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 o2Var = this.B;
            android.view.View W = o2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2) o2Var).W() : o2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4) o2Var).x() : null;
            if (W != null && this.B.x() != null) {
                W.clearAnimation();
                this.B.x().clearAnimation();
                if (W.getVisibility() == 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(W, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "animationFloatBarExitSnsNativeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    W.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(W, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "animationFloatBarExitSnsNativeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.B.M();
                }
            }
            if (this.f247365u.getVisibility() == 0) {
                this.f247365u.clearAnimation();
                android.view.View view = this.f247365u;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "animationFloatBarExitSnsNativeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "animationFloatBarExitSnsNativeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                M();
            }
        } else if (this.H) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            T(false, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        } else {
            V(false, 0L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animationFloatBarExitSnsNativeUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public void T(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (this.f247365u.getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFloatBarCompWrapper", "mContentView doHide ");
            android.view.View view = this.f247365u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            M();
            this.f247365u.clearAnimation();
            if (z17) {
                android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.5f);
                translateAnimation.setDuration(400L);
                if (z18) {
                    android.view.View view2 = this.f247365u;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = this.f247365u;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    translateAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u(this));
                } else {
                    translateAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v(this));
                }
                this.f247365u.startAnimation(translateAnimation);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public void U(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (this.f247365u.getVisibility() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFloatBarCompWrapper", "mContentView doShow ");
            android.view.View view = this.f247365u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            K();
            this.f247365u.clearAnimation();
            if (z17) {
                android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.5f, 1, 0.0f);
                translateAnimation.setInterpolator(new android.view.animation.OvershootInterpolator(1.0f));
                translateAnimation.setDuration(700L);
                this.f247365u.startAnimation(translateAnimation);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public void V(boolean z17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (this.H) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        } else {
            android.os.Handler handler = this.M;
            handler.removeCallbacksAndMessages(null);
            handler.sendMessageDelayed(handler.obtainMessage(2, java.lang.Boolean.valueOf(z17)), j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public final void W() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 o2Var = this.B;
        android.view.View W = o2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2) o2Var).W() : o2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4) o2Var).x() : null;
        if (W != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(W, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            W.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(W, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view = this.f247365u;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public boolean X() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return this.E;
    }

    public boolean Y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isForHalfScreenType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        ab4.j0 j0Var = this.f247364t;
        if (j0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isForHalfScreenType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return false;
        }
        boolean z17 = j0Var.f84359p == 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isForHalfScreenType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return z17;
    }

    public boolean Z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (!X()) {
            r3 = this.f247365u.getVisibility() == 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return r3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 o2Var = this.B;
        android.widget.Button W = o2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2) o2Var).W() : o2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4) o2Var).r0() : null;
        if ((W == null || W.getVisibility() != 0) && this.f247365u.getVisibility() != 0) {
            r3 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return r3;
    }

    public final void a0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 o2Var, android.view.View view, android.widget.Button button, android.widget.Button button2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18424x4214e2c1 c18424x4214e2c1, ab4.u uVar, float f17, int i17, int i18) {
        android.animation.ObjectAnimator objectAnimator;
        android.animation.ObjectAnimator objectAnimator2;
        android.animation.ObjectAnimator objectAnimator3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playEnterSnsAdNativeAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        android.animation.AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        this.K = animatorSet2;
        animatorSet2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationY", f17, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.setStartDelay(1000L);
        this.f247362J = true;
        ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.w(this, o2Var, c18424x4214e2c1, button, button2, view));
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.x(this, uVar, button));
        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) view.getBackground();
        android.content.Context context = this.f246582d;
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(gradientDrawable, "color", i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29), android.graphics.Color.parseColor(uVar.M));
        ofInt.setEvaluator(new android.animation.ArgbEvaluator());
        ofInt.setDuration(500L);
        ofInt.setStartDelay(1000L);
        android.animation.ObjectAnimator ofInt2 = android.animation.ObjectAnimator.ofInt((android.graphics.drawable.GradientDrawable) button.getBackground(), "color", i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29), android.graphics.Color.parseColor(uVar.M));
        ofInt2.setEvaluator(new android.animation.ArgbEvaluator());
        ofInt2.setDuration(500L);
        ofInt2.setStartDelay(1000L);
        if (button2 != null) {
            objectAnimator = android.animation.ObjectAnimator.ofInt((android.graphics.drawable.GradientDrawable) button2.getBackground(), "color", i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29), android.graphics.Color.parseColor(uVar.M));
            objectAnimator.setEvaluator(new android.animation.ArgbEvaluator());
            objectAnimator.setDuration(500L);
            objectAnimator.setStartDelay(1000L);
        } else {
            objectAnimator = null;
        }
        if (c18424x4214e2c1 != null) {
            objectAnimator2 = android.animation.ObjectAnimator.ofInt((android.graphics.drawable.GradientDrawable) c18424x4214e2c1.getProgressDrawable(), "color", i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29), android.graphics.Color.parseColor(uVar.M));
            objectAnimator2.setEvaluator(new android.animation.ArgbEvaluator());
            objectAnimator2.setDuration(500L);
            objectAnimator2.setStartDelay(1000L);
        } else {
            objectAnimator2 = null;
        }
        android.animation.ObjectAnimator ofInt3 = android.animation.ObjectAnimator.ofInt(button, "textColor", i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), android.graphics.Color.parseColor(uVar.I));
        ofInt3.setEvaluator(new android.animation.ArgbEvaluator());
        ofInt3.setDuration(500L);
        ofInt3.setStartDelay(1000L);
        if (button2 != null) {
            objectAnimator3 = android.animation.ObjectAnimator.ofInt(button2, "textColor", i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), android.graphics.Color.parseColor(uVar.I));
            objectAnimator3.setEvaluator(new android.animation.ArgbEvaluator());
            objectAnimator3.setDuration(500L);
            objectAnimator3.setStartDelay(1000L);
        } else {
            objectAnimator3 = null;
        }
        ofInt3.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.m(this, uVar, button));
        android.animation.AnimatorSet animatorSet3 = this.L;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        this.L = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.f247365u, "alpha", 0.0f, 1.0f);
        android.animation.ObjectAnimator objectAnimator4 = objectAnimator2;
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, ((this.f246591p - i17) / 2) - i65.a.b(context, 28));
        android.animation.ValueAnimator ofInt4 = android.animation.ValueAnimator.ofInt(i65.a.b(context, 190), i17);
        android.animation.ValueAnimator ofInt5 = android.animation.ValueAnimator.ofInt(i65.a.b(context, 40), i18);
        ofInt4.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.n(this, view, uVar, button));
        ofInt5.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o(this, view));
        this.L.play(ofFloat2).with(ofFloat3).with(ofInt4).with(ofInt5);
        this.L.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.L.setDuration(1000L);
        this.L.setStartDelay(1500L);
        this.L.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p(this, view, i17, i18));
        if (objectAnimator == null || objectAnimator4 == null || objectAnimator3 == null) {
            this.K.play(ofInt2).with(ofInt).with(ofInt3).after(ofFloat).before(this.L);
        } else {
            this.K.play(ofInt2).with(ofInt).with(objectAnimator).with(objectAnimator4).with(ofInt3).with(objectAnimator3).after(ofFloat).before(this.L);
        }
        this.K.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playEnterSnsAdNativeAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public void b0(boolean z17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (this.H) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return;
        }
        android.os.Handler handler = this.M;
        handler.removeCallbacksAndMessages(null);
        handler.sendMessageDelayed(handler.obtainMessage(1, java.lang.Boolean.valueOf(z17)), j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public void c0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (this.H) {
            if (!this.I) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                return;
            } else if (this.f247362J) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                return;
            }
        }
        try {
            e0();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) this.f247363s;
            activityC18007x6d5e9773.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOnPause", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            boolean z17 = activityC18007x6d5e9773.X1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnPause", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (!z17) {
                K();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFloatBarCompWrapper", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d0() {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y.d0():void");
    }

    public final void e0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 o2Var = this.B;
        android.view.View W = o2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2) o2Var).W() : o2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4) o2Var).x() : null;
        if (W != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(W, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            W.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(W, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view = this.f247365u;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        android.content.Context context = this.f247363s;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        android.view.ViewGroup viewGroup = this.A;
        android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cpg, viewGroup, false);
        this.f247365u = inflate;
        this.f247366v = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566556g94);
        this.f247367w = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.g9a);
        this.f247368x = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566555g93);
        this.f247369y = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.g8v);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) inflate.findViewById(com.p314xaae8f345.mm.R.id.g8q)).m81437x205ac394(i65.a.b(context, 8));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) inflate.findViewById(com.p314xaae8f345.mm.R.id.g8r);
        this.f247370z = c22646x1e9ca55;
        c22646x1e9ca55.m81437x205ac394(i65.a.b(context, 4));
        viewGroup.addView(this.f247365u);
        if (this.E) {
            android.view.ViewGroup.LayoutParams layoutParams = this.f247365u.getLayoutParams();
            if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = i65.a.b(context, 42);
                this.f247365u.setLayoutParams(layoutParams2);
            }
        }
        android.view.View view = this.f247365u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        ab4.j0 j0Var = this.f247364t;
        if (android.text.TextUtils.isEmpty(j0Var.f6x61ad9236)) {
            this.f247370z.setVisibility(8);
        } else {
            java.lang.String str = j0Var.f6x61ad9236;
            za4.t0.c(str, false, j0Var.f84351e, 0, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q(this, str));
        }
        if (android.text.TextUtils.isEmpty(j0Var.G)) {
            this.f247367w.setVisibility(8);
        } else {
            this.f247367w.setText(j0Var.G);
            this.f247367w.setVisibility(0);
        }
        if (android.text.TextUtils.isEmpty(j0Var.H)) {
            this.f247368x.setVisibility(8);
        } else {
            this.f247368x.setText(j0Var.H);
            this.f247368x.setVisibility(0);
        }
        if (!android.text.TextUtils.isEmpty(j0Var.F)) {
            try {
                this.f247365u.setBackgroundColor(android.graphics.Color.parseColor(j0Var.F));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFloatBarCompWrapper", "refreshView backgroundColor, exp=" + e17.toString() + ", color=" + j0Var.F);
            }
        } else if (!android.text.TextUtils.isEmpty(j0Var.f5x8f2193b5)) {
            za4.t0.c(j0Var.f5x8f2193b5, false, j0Var.f84351e, 0, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.r(this));
        }
        if (!android.text.TextUtils.isEmpty(j0Var.I)) {
            try {
                this.f247367w.setTextColor(android.graphics.Color.parseColor(j0Var.I));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFloatBarCompWrapper", "refreshView titleColor, exp=" + e18.toString() + ", color=" + j0Var.I);
            }
        }
        if (!android.text.TextUtils.isEmpty(j0Var.f84381J)) {
            try {
                this.f247368x.setTextColor(android.graphics.Color.parseColor(j0Var.f84381J));
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFloatBarCompWrapper", "refreshView descColor, exp=" + e19.toString() + ", color=" + j0Var.f84381J);
            }
        }
        this.f247369y.removeAllViews();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ta.a(this.f247363s, j0Var.P, this.f247369y, 0);
        if (a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2) {
            this.B = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2) a17;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFloatBarCompWrapper", "btnComp=" + a17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 o2Var = this.B;
        boolean z17 = this.E;
        boolean z18 = this.H;
        if (o2Var != null) {
            if (o2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2) o2Var).f247396z = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            } else if (o2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4) o2Var).X = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                if (z17 || z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 u4Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4) this.B;
                    u4Var.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFloatBarAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                    u4Var.E = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFloatBarAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                }
            }
            android.view.View x17 = this.B.x();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 o2Var2 = this.B;
            android.widget.Button button = o2Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 ? (android.widget.Button) x17.findViewById(com.p314xaae8f345.mm.R.id.n4n) : o2Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 ? (android.widget.Button) x17.findViewById(com.p314xaae8f345.mm.R.id.f565648d31) : null;
            if ((this.B instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2) && button != null) {
                button.setMaxLines(1);
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(button, 1, (int) button.getTextSize(), 1, 0);
            }
            this.f247369y.addView(x17);
        }
        this.C = j0Var.K;
        this.f247365u.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.s(this));
        if (!z18 && !Y()) {
            d0();
        } else if (z17) {
            W();
        } else {
            android.view.View view = this.f247365u;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "fillItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "fillItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }
}
