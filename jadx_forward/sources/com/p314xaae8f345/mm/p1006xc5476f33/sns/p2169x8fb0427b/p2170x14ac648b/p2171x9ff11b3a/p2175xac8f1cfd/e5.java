package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public final class e5 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 {
    public final java.util.List A;
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d B;
    public boolean C;
    public boolean D;
    public android.animation.ObjectAnimator E;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 F;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f246696s;

    /* renamed from: t, reason: collision with root package name */
    public final f54.n f246697t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.ViewGroup f246698u;

    /* renamed from: v, reason: collision with root package name */
    public final int f246699v;

    /* renamed from: w, reason: collision with root package name */
    public final int f246700w;

    /* renamed from: x, reason: collision with root package name */
    public final int f246701x;

    /* renamed from: y, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f246702y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f246703z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(android.content.Context mContext, f54.n info, android.view.ViewGroup mParentContainer, int i17, int i18, int i19, p012xc85e97e9.p093xedfae76a.g0 enterAnimStatusData) {
        super(mContext, info, mParentContainer);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mParentContainer, "mParentContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterAnimStatusData, "enterAnimStatusData");
        this.f246696s = mContext;
        this.f246697t = info;
        this.f246698u = mParentContainer;
        this.f246699v = i17;
        this.f246700w = i18;
        this.f246701x = i19;
        this.f246702y = enterAnimStatusData;
        this.A = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        android.view.ViewGroup.LayoutParams layoutParams = this.f246589n.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ab4.d0 d0Var = this.f246583e;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) d0Var.f84354h, (int) d0Var.f84352f, (int) d0Var.f84355i, (int) d0Var.f84353g);
        }
        this.f246589n.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        if (this.D && !this.C) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        android.view.View view = this.f246589n;
        boolean z17 = view != null && view.getVisibility() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        } else {
            S();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void L() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        super.L();
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2) it.next()).L();
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.B;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        if (this.D && !this.C) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        } else {
            T();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        }
    }

    public final int O(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertXmlPx", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        int o17 = (int) za4.z0.o(i17, this.f246699v, this.f246700w, this.f246701x);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertXmlPx", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        return o17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        android.content.Context context = this.f246696s;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        android.view.ViewGroup viewGroup = this.f246698u;
        android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cph, viewGroup, false);
        this.f246589n = inflate;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566552g90);
        this.F = c22646x1e9ca55;
        f54.n nVar = this.f246697t;
        ab4.y0 y0Var = nVar.F;
        ab4.y0.a(c22646x1e9ca55, y0Var, y0Var != null ? y0Var.f84445e : 1.0f);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.g8z);
        viewGroup.addView(inflate);
        try {
            G();
            g();
            this.f246589n.getLayoutParams().height = -2;
        } catch (java.lang.Exception unused) {
        }
        java.util.List list = nVar.H;
        if (list == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            return;
        }
        int i18 = 1;
        this.D = nVar.f84359p == 1;
        int size = ((java.util.ArrayList) list).size();
        int i19 = 0;
        while (i19 < size) {
            f54.l lVar = (f54.l) ((java.util.ArrayList) nVar.H).get(i19);
            java.lang.String str = lVar.G;
            if (((str == null || str.length() == 0) ? i18 : 0) == 0) {
                java.lang.String str2 = lVar.H;
                if (((str2 == null || str2.length() == 0) ? i18 : 0) == 0) {
                    android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cpe, (android.view.ViewGroup) null, false);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ta.a(this.f246582d, lVar.F, linearLayout, 0);
                    if (a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2) {
                        ((java.util.ArrayList) this.A).add(a17);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2) a17).x();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 z2Var = a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2) a17 : null;
                        inflate2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.c5(z2Var != null ? z2Var.W() : null));
                    }
                    android.widget.ImageView imageView = (android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.g8w);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 c17790xf59c6992 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992) inflate2.findViewById(com.p314xaae8f345.mm.R.id.g8y);
                    android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                    int O = O(56);
                    if (layoutParams2 != null) {
                        layoutParams2.width = O;
                    }
                    if (layoutParams2 != null) {
                        layoutParams2.height = O;
                    }
                    if (layoutParams2 != null) {
                        layoutParams2.topMargin = O(16);
                    }
                    android.view.ViewGroup.LayoutParams layoutParams3 = c17790xf59c6992.getLayoutParams();
                    android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams4 != null) {
                        layoutParams4.topMargin = O(8);
                    }
                    if (layoutParams4 != null) {
                        layoutParams4.width = O(112);
                    }
                    java.lang.String str3 = lVar.G;
                    za4.t0.c(str3, false, 0, 0, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.d5(str3, imageView, this));
                    c17790xf59c6992.setText(lVar.H);
                    try {
                        java.lang.String str4 = nVar.G;
                        if (str4 == null) {
                            str4 = "";
                        }
                        c17790xf59c6992.setTextColor(android.graphics.Color.parseColor(str4));
                    } catch (java.lang.Exception unused2) {
                        c17790xf59c6992.setTextColor(-16777216);
                    }
                    c17790xf59c6992.setMaxLines(1);
                    p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(c17790xf59c6992, 1, O(24), 1, 0);
                    linearLayout.addView(inflate2);
                    android.view.ViewGroup.LayoutParams layoutParams5 = inflate2.getLayoutParams();
                    android.widget.LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams5 : null;
                    if (layoutParams6 != null) {
                        layoutParams6.width = O(128);
                    }
                    if (layoutParams6 != null) {
                        layoutParams6.height = O(128);
                    }
                    android.view.View view = new android.view.View(context);
                    view.setBackgroundColor(419430400);
                    linearLayout.addView(view);
                    view.getLayoutParams().width = O(96);
                    i17 = 1;
                    view.getLayoutParams().height = O(1);
                    i19++;
                    i18 = i17;
                }
            }
            i17 = i18;
            i19++;
            i18 = i17;
        }
        int i27 = i18;
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeViewAt(linearLayout.getChildCount() - i27);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca552 = this.F;
        if (c22646x1e9ca552 != null) {
            c22646x1e9ca552.setAlpha(0.0f);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca553 = this.F;
        if (c22646x1e9ca553 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initAnimListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y4 y4Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y4(this);
        p012xc85e97e9.p093xedfae76a.g0 g0Var = this.f246702y;
        g0Var.mo7807xc74540ab(y4Var);
        int i28 = nVar.f84359p;
        if (i28 == 1 && (context instanceof p012xc85e97e9.p093xedfae76a.y)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            final p012xc85e97e9.p093xedfae76a.y yVar = (p012xc85e97e9.p093xedfae76a.y) context;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6043xb4097527> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6043xb4097527>(yVar) { // from class: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2
                {
                    this.f39173x3fe91575 = 1394784535;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6043xb4097527 c6043xb4097527) {
                    android.animation.ObjectAnimator objectAnimator;
                    android.view.View view2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6043xb4097527 event = c6043xb4097527;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    boolean z17 = false;
                    am.hv hvVar = event.f136332g;
                    if (hvVar != null) {
                        int i29 = hvVar.f88404a;
                        android.content.Context context2 = hvVar.f88405b;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMContext$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.e5 e5Var = this;
                        android.content.Context context3 = e5Var.f246696s;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMContext$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(context2, context3)) {
                            if (i29 == 0) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                boolean z18 = e5Var.C;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                if (!z18) {
                                    e5Var.R();
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                    e5Var.C = true;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$willAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                    e5Var.S();
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$willAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
                                    z17 = true;
                                }
                            }
                            if (i29 == 1) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                boolean z19 = e5Var.C;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                if (z19) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                    android.animation.ObjectAnimator objectAnimator2 = e5Var.E;
                                    if (objectAnimator2 != null) {
                                        objectAnimator2.cancel();
                                    }
                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca554 = e5Var.F;
                                    if (c22646x1e9ca554 == null) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                    } else {
                                        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(c22646x1e9ca554);
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                                        try {
                                            view2 = (android.view.View) weakReference.get();
                                        } catch (java.lang.Exception e17) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageFloatLinearBtnsLayout", "startAnimEnter error", e17);
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                                        }
                                        if (view2 == null) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                                            objectAnimator = null;
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                                            e5Var.E = objectAnimator;
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                        } else {
                                            objectAnimator = android.animation.ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.0f);
                                            objectAnimator.setDuration(1000L);
                                            objectAnimator.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.f5(view2));
                                            objectAnimator.start();
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                                            e5Var.E = objectAnimator;
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                        }
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                    e5Var.C = false;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$willDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                    e5Var.T();
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$willDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                }
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
                            z17 = true;
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
                    return z17;
                }
            };
            this.B = abstractC20980x9b9ad01d;
            abstractC20980x9b9ad01d.mo48813x58998cd();
            android.view.View view2 = this.f246589n;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout", "initAnimListener", "(Lcom/tencent/mm/ui/widget/RoundedCornerFrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout", "initAnimListener", "(Lcom/tencent/mm/ui/widget/RoundedCornerFrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initAnimListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        } else if (i28 == 2) {
            android.view.View view3 = this.f246589n;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout", "initAnimListener", "(Lcom/tencent/mm/ui/widget/RoundedCornerFrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout", "initAnimListener", "(Lcom/tencent/mm/ui/widget/RoundedCornerFrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initAnimListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        } else {
            p012xc85e97e9.p093xedfae76a.i0 i0Var = new p012xc85e97e9.p093xedfae76a.i0();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.b5 b5Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.b5(this, c22646x1e9ca553, i0Var);
            i0Var.mo3194xffc8101c(g0Var, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z4(i0Var));
            i0Var.mo7807xc74540ab(b5Var);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a5(i0Var), 1000L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initAnimListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
    }

    public final void R() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        android.animation.ObjectAnimator objectAnimator = this.E;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        android.view.View view = this.f246589n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = this.F;
        if (c22646x1e9ca55 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        } else {
            this.E = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.g5.a(new java.lang.ref.WeakReference(c22646x1e9ca55));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        }
    }

    public final void S() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("willAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        super.K();
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2) it.next()).K();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("willAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
    }

    public final void T() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("willDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        super.M();
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2) it.next()).M();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("willDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
    }
}
