package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView */
/* loaded from: classes12.dex */
public class ViewOnClickListenerC13352x11f2b862 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.RecommendView implements com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.i0, android.view.View.OnClickListener {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f179836t = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f179837d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f179838e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f179839f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f179840g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f179841h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f179842i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f179843m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f179844n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 f179845o;

    /* renamed from: p, reason: collision with root package name */
    public z12.l f179846p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f179847q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f179848r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f179849s;

    public ViewOnClickListenerC13352x11f2b862(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f179847q = true;
        this.f179848r = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.e0(this);
        this.f179849s = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView.2
            {
                this.f39173x3fe91575 = 449099204;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 c5327x7bab71d4) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 c5327x7bab71d42 = c5327x7bab71d4;
                if (!(c5327x7bab71d42 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4)) {
                    return false;
                }
                java.lang.String str = c5327x7bab71d42.f135640g.f89515d;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ViewOnClickListenerC13352x11f2b862.f179836t;
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ViewOnClickListenerC13352x11f2b862 viewOnClickListenerC13352x11f2b862 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ViewOnClickListenerC13352x11f2b862.this;
                viewOnClickListenerC13352x11f2b862.getClass();
                am.t4 t4Var = c5327x7bab71d42.f135640g;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t4Var.f89512a) || !t4Var.f89512a.equalsIgnoreCase(viewOnClickListenerC13352x11f2b862.f179844n)) {
                    return false;
                }
                java.lang.String str2 = t4Var.f89512a;
                int i18 = t4Var.f89513b;
                int i19 = t4Var.f89514c;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = viewOnClickListenerC13352x11f2b862.f179848r;
                if (i18 == 6) {
                    android.os.Message obtain = android.os.Message.obtain();
                    obtain.getData().putString("product_id", str2);
                    obtain.getData().putInt("progress", i19);
                    obtain.what = 131075;
                    if (n3Var == null) {
                        return false;
                    }
                    n3Var.mo50308x2936bf5f(obtain);
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product status:%d", java.lang.Integer.valueOf(i18));
                android.os.Message obtain2 = android.os.Message.obtain();
                obtain2.getData().putString("product_id", str2);
                obtain2.getData().putInt("status", i18);
                obtain2.what = 131076;
                if (n3Var == null) {
                    return false;
                }
                n3Var.mo50308x2936bf5f(obtain2);
                return false;
            }
        };
        a();
    }

    /* renamed from: setTitleName */
    private void m54835xdc7156c1(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247) {
        android.widget.Button button = this.f179842i;
        if (button != null) {
            int i17 = c21051xbc71d247.f68376xce8675f1;
            if (i17 == 1) {
                button.setVisibility(0);
                this.f179842i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.byn);
            } else if (i17 != 2) {
                button.setVisibility(8);
            } else {
                button.setVisibility(0);
                this.f179842i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574067gv4);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21051xbc71d247.f68391x4a7ba5e9)) {
            this.f179840g.setText(c21051xbc71d247.f68391x4a7ba5e9);
        }
        if (this.f179841h != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21051xbc71d247.f68399x61a1d65d)) {
                this.f179841h.setVisibility(8);
            } else {
                this.f179841h.setVisibility(0);
                this.f179841h.setText(c21051xbc71d247.f68399x61a1d65d);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.i0
    public void I0(boolean z17) {
    }

    public final void a() {
        if (this.f179847q) {
            this.f179837d = (android.view.ViewGroup) com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a87, this);
        } else {
            this.f179837d = (android.view.ViewGroup) com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a88, this);
        }
        this.f179838e = (android.widget.ImageView) this.f179837d.findViewById(com.p314xaae8f345.mm.R.id.dai);
        this.f179839f = (android.widget.ImageView) this.f179837d.findViewById(com.p314xaae8f345.mm.R.id.dbh);
        this.f179840g = (android.widget.TextView) this.f179837d.findViewById(com.p314xaae8f345.mm.R.id.deq);
        this.f179841h = (android.widget.TextView) this.f179837d.findViewById(com.p314xaae8f345.mm.R.id.deu);
        this.f179842i = (android.widget.Button) this.f179837d.findViewById(com.p314xaae8f345.mm.R.id.db6);
        this.f179843m = (android.widget.ProgressBar) this.f179837d.findViewById(com.p314xaae8f345.mm.R.id.db7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f179849s.mo48813x58998cd();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleRecommendView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == this.f179838e) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().L0(this.f179844n);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12068, 2, this.f179844n, java.lang.Integer.valueOf(this.f179845o.f68398x61a09e8d));
        } else {
            android.view.ViewGroup viewGroup = this.f179837d;
            d22.u uVar = d22.u.f307409a;
            if (view == viewGroup) {
                r45.qj0 a17 = new j12.i(this.f179845o.t0()).a(true);
                java.lang.String str = a17.f465565d;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                d22.d0 d0Var = new d22.d0(str != null ? str : "", a17, null);
                d0Var.f445731g = 108;
                d0Var.f445688a = 8;
                uVar.a(getContext(), d0Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12068, 4, this.f179844n, java.lang.Integer.valueOf(this.f179845o.f68398x61a09e8d));
            } else if (view == this.f179842i) {
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247 = this.f179845o;
                int i17 = c21051xbc71d247.f68376xce8675f1;
                if (i17 == 1) {
                    this.f179846p = new z12.l(this.f179844n);
                    gm0.j1.n().f354821b.g(this.f179846p);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var.d(12068, 3, this.f179844n, java.lang.Integer.valueOf(this.f179845o.f68398x61a09e8d));
                    g0Var.d(12066, 0, 8, "", this.f179844n);
                } else if (i17 == 2) {
                    r45.qj0 a18 = new j12.i(c21051xbc71d247.t0()).a(true);
                    java.lang.String str2 = a18.f465565d;
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    d22.d0 d0Var2 = new d22.d0(str2 != null ? str2 : "", a18, null);
                    d0Var2.f445731g = 108;
                    d0Var2.f445688a = 8;
                    uVar.a(getContext(), d0Var2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12068, 4, this.f179844n, java.lang.Integer.valueOf(this.f179845o.f68398x61a09e8d));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "unknown buttonType do nothing.");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleRecommendView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f179849s.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.i0
    public void s(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        gm0.j1.n().f354821b.g(new z12.l(str, str2, str3, null, str5));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.RecommendView
    /* renamed from: setProductID */
    public void mo54836x1d0f8808(java.lang.String str) {
        this.f179844n = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f179837d.setVisibility(8);
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        this.f179845o = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().f1(this.f179844n, false);
        this.f179838e.setOnClickListener(this);
        this.f179842i.setOnClickListener(this);
        this.f179837d.setOnClickListener(this);
        m54835xdc7156c1(this.f179845o);
        this.f179843m.setVisibility(8);
        n11.a b17 = n11.a.b();
        java.lang.String str2 = this.f179845o.f68374x14a71d9b;
        b17.h(str2, this.f179839f, y12.f.c(this.f179844n, str2, true, new java.lang.Object[0]));
    }

    public ViewOnClickListenerC13352x11f2b862(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f179847q = true;
        this.f179848r = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.e0(this);
        this.f179849s = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView.2
            {
                this.f39173x3fe91575 = 449099204;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 c5327x7bab71d4) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 c5327x7bab71d42 = c5327x7bab71d4;
                if (!(c5327x7bab71d42 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4)) {
                    return false;
                }
                java.lang.String str = c5327x7bab71d42.f135640g.f89515d;
                int i172 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ViewOnClickListenerC13352x11f2b862.f179836t;
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ViewOnClickListenerC13352x11f2b862 viewOnClickListenerC13352x11f2b862 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ViewOnClickListenerC13352x11f2b862.this;
                viewOnClickListenerC13352x11f2b862.getClass();
                am.t4 t4Var = c5327x7bab71d42.f135640g;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t4Var.f89512a) || !t4Var.f89512a.equalsIgnoreCase(viewOnClickListenerC13352x11f2b862.f179844n)) {
                    return false;
                }
                java.lang.String str2 = t4Var.f89512a;
                int i18 = t4Var.f89513b;
                int i19 = t4Var.f89514c;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = viewOnClickListenerC13352x11f2b862.f179848r;
                if (i18 == 6) {
                    android.os.Message obtain = android.os.Message.obtain();
                    obtain.getData().putString("product_id", str2);
                    obtain.getData().putInt("progress", i19);
                    obtain.what = 131075;
                    if (n3Var == null) {
                        return false;
                    }
                    n3Var.mo50308x2936bf5f(obtain);
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product status:%d", java.lang.Integer.valueOf(i18));
                android.os.Message obtain2 = android.os.Message.obtain();
                obtain2.getData().putString("product_id", str2);
                obtain2.getData().putInt("status", i18);
                obtain2.what = 131076;
                if (n3Var == null) {
                    return false;
                }
                n3Var.mo50308x2936bf5f(obtain2);
                return false;
            }
        };
        a();
    }
}
