package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.AsyncNormalTextView */
/* loaded from: classes4.dex */
public class C17942x46376cf5 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17953xbf81077c {
    public java.lang.String A;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs B;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder C;
    public int D;

    /* renamed from: z, reason: collision with root package name */
    public final android.content.Context f247751z;

    public C17942x46376cf5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = 0;
        this.f247751z = context;
    }

    public void e() {
        java.lang.CharSequence charSequence;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AsyncNormalTextView", "buildContent: show , textType:%d", java.lang.Integer.valueOf(this.D));
            java.lang.System.currentTimeMillis();
            setVisibility(0);
            int i17 = this.D;
            android.content.Context context = this.f247751z;
            if (i17 == 1) {
                if (this.A.length() > 100) {
                    str = this.A.substring(0, 100) + "...";
                } else {
                    str = this.A;
                }
                this.A = str;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str2 = this.A;
                float m46336x40077844 = this.f247789f.m46336x40077844();
                ((ke0.e) xVar).getClass();
                java.lang.CharSequence f17 = ga4.m.f(this.f247800t.f251558a.f68891x29d1292e, new android.text.SpannableStringBuilder(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str2, m46336x40077844)), 0, 2);
                int i18 = this.D;
                android.widget.TextView.BufferType bufferType = android.widget.TextView.BufferType.NORMAL;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.B;
                java.util.HashMap hashMap = bsVar.f249584q;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar = this.f247800t;
                c(i18, f17, bufferType, hashMap, nsVar.f251569h, nsVar.f251570i, bsVar, this.A, nsVar.f251577p);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar2 = this.f247800t;
                java.lang.CharSequence charSequence2 = nsVar2 != null ? nsVar2.f251566e : null;
                if (charSequence2 == null) {
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String str3 = this.A;
                    float m46336x400778442 = this.f247789f.m46336x40077844();
                    ((ke0.e) xVar2).getClass();
                    charSequence = ga4.m.f(this.f247800t.f251558a.f68891x29d1292e, new android.text.SpannableStringBuilder(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str3, m46336x400778442)), 0, 2);
                } else {
                    charSequence = charSequence2;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar3 = this.f247800t;
                if (nsVar3 != null) {
                    int i19 = this.D;
                    android.widget.TextView.BufferType bufferType2 = android.widget.TextView.BufferType.SPANNABLE;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar2 = this.B;
                    c(i19, charSequence, bufferType2, bsVar2.f249584q, nsVar3.f251569h, nsVar3.f251570i, bsVar2, this.A, nsVar3.f251577p);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar4 = this.f247800t;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.go goVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.go(nsVar4.f251570i, nsVar4.f251569h, false, false, 1);
            goVar.f249983f = nsVar4.f251584w;
            this.f247789f.setTag(goVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18117xa07b66ea c18117xa07b66ea = this.f247790g;
            if (c18117xa07b66ea != null) {
                c18117xa07b66ea.setTag(goVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = this.C;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindOpTvCollapseHolder", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
            this.f247791h.setTag(baseViewHolder);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindOpTvCollapseHolder", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
            setTag(this.C);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    /* renamed from: getContent */
    public java.lang.String m70548x76847043() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        java.lang.String str = this.A;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        return str;
    }

    public void i(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        this.D = i17;
        this.A = str;
        this.B = bsVar;
        this.f247800t = nsVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInitializeAccessibilityNodeInfo", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.A);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInitializeAccessibilityNodeInfo", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17953xbf81077c, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        super.onLayout(z17, i17, i18, i19, i27);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        super.onMeasure(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPopulateAccessibilityEvent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(this.A);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPopulateAccessibilityEvent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    /* renamed from: setContentWidth */
    public void m70549xc85a7a4f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContentWidth", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        if (this.f247790g != null) {
            this.f247789f.m71290x4b66160f(i17);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i17, -2);
            this.f247790g.setLayoutParams(layoutParams);
            this.f247789f.setLayoutParams(layoutParams);
            this.f247791h.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContentWidth", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    /* renamed from: setShow */
    public void m70550x76500a7f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShow", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        this.C = baseViewHolder;
        e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShow", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }
}
