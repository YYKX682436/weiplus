package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2164x6289ae8.p2165x373aa5;

/* renamed from: com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader */
/* loaded from: classes4.dex */
public class C17869xad7dd40c extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f245562d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f245563e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f245564f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f245565g;

    public C17869xad7dd40c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f245562d = null;
        a();
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bvc, this);
        this.f245562d = inflate.findViewById(com.p314xaae8f345.mm.R.id.f564409qi);
        this.f245563e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564388pw);
        this.f245564f = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564389px);
        this.f245565g = m69777x8647f0a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        java.lang.String str;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContent", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(c17933xe8d1b226);
        r45.da6 da6Var = e17.f38998xb2b52717;
        if (da6Var != null) {
            java.util.LinkedList linkedList = da6Var.f453808e;
            if (linkedList.size() != 0) {
                setVisibility(0);
                this.f245563e.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jcn, java.lang.Integer.valueOf(e17.f38998xb2b52717.f453807d), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t((ha4.k.e(c17933xe8d1b226, e17) * 1.0d) / 100.0d)));
                this.f245562d.setTag(c17933xe8d1b226);
                this.f245562d.setOnClickListener(iVar.f251354x);
                boolean isEmpty = linkedList.isEmpty();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRewardList", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 32.0f);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 6.0f);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 10.0f);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 17.0f);
                int f17 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.aq9);
                int f18 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.aq8);
                int f19 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.aq7);
                int f27 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.aq6);
                int f28 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.aq_);
                int f29 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.aqa);
                if (this.f245564f == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRewardList", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                    str = "setContent";
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("guessWidth", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                    android.view.Display defaultDisplay = ((android.view.WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
                    defaultDisplay.getRealMetrics(new android.util.DisplayMetrics());
                    int rotation = defaultDisplay.getRotation();
                    str = "setContent";
                    float min = ((rotation == 0 || rotation == 2) ? java.lang.Math.min(r8.widthPixels, r8.heightPixels) : java.lang.Math.max(r8.widthPixels, r8.heightPixels)) - (getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.i_) * 2.0f);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("guessWidth", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                    if (linkedList.size() <= 0) {
                        if (this.f245564f.getParent() != null) {
                            i17 = 8;
                            this.f245564f.setVisibility(8);
                        } else {
                            i17 = 8;
                        }
                        this.f245564f.removeAllViews();
                        this.f245564f.setVisibility(i17);
                        this.f245564f.setVisibility(i17);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRewardList", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                    } else {
                        this.f245564f.getParent();
                        this.f245564f.removeAllViews();
                        this.f245564f.setVisibility(0);
                        this.f245564f.setPadding(0, f17, 0, f18 - f28);
                        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
                        imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79410x68d340ee);
                        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(f19, f19);
                        layoutParams.leftMargin = f27;
                        layoutParams.rightMargin = f27;
                        layoutParams.topMargin = (f29 - f19) / 2;
                        layoutParams.gravity = 48;
                        imageView.setLayoutParams(layoutParams);
                        imageView.setClickable(false);
                        imageView.setFocusable(false);
                        this.f245564f.addView(imageView);
                        float f37 = min - (f19 + (f27 * 2));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateLikeIconRightMargin", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                        int a17 = i65.a.a(getContext(), 4.0f);
                        int i18 = f29 * 2;
                        int a18 = i65.a.a(getContext(), 4.0f);
                        for (float f38 = 4.0f; f38 <= 8.0f; f38 += 0.25f) {
                            int a19 = i65.a.a(getContext(), f38);
                            int i19 = ((int) (f37 - a18)) % (f29 + a19);
                            int i27 = i19 >= f29 ? i19 - f29 : i19 + a19;
                            if (i27 < i18) {
                                a17 = a19;
                                i18 = i27;
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateLikeIconRightMargin", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                        float f39 = f29 + a17;
                        int i28 = (int) (f37 / f39);
                        if (((int) (f37 % f39)) > f29) {
                            i28++;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x0 x0Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x0(getContext());
                        x0Var.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
                        x0Var.m71362xac130ce4(i28);
                        for (int i29 = 0; i29 < linkedList.size(); i29++) {
                            r45.b96 b96Var = (r45.b96) linkedList.get(i29);
                            android.widget.ImageView c18149x2128f641 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18149x2128f641(getContext());
                            c18149x2128f641.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                            c18149x2128f641.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ady);
                            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(f29, f29);
                            layoutParams2.setMargins(0, 0, a17, f28);
                            c18149x2128f641.setLayoutParams(layoutParams2);
                            c18149x2128f641.setTag(b96Var.f452172d);
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(c18149x2128f641, b96Var.f452172d, pc4.d.f434943a.l());
                            c18149x2128f641.setOnClickListener(iVar.f251343m);
                            x0Var.addView(c18149x2128f641);
                        }
                        this.f245564f.addView(x0Var);
                        this.f245565g.setVisibility(isEmpty ? 8 : 0);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRewardList", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
                return;
            }
        }
        setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContent", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
    }

    /* renamed from: getLinearSeparator */
    public android.widget.LinearLayout m69777x8647f0a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLinearSeparator", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        android.widget.AbsListView.LayoutParams layoutParams = new android.widget.AbsListView.LayoutParams(-1, com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 1.0f) / 2);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563651d93);
        linearLayout.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLinearSeparator", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        return linearLayout;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVisibility", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        super.setVisibility(i17);
        android.view.View view = this.f245562d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/lucky/view/SnsDetailLuckyHeader", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/lucky/view/SnsDetailLuckyHeader", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVisibility", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
    }

    public C17869xad7dd40c(android.content.Context context) {
        super(context);
        this.f245562d = null;
        a();
    }

    public C17869xad7dd40c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245562d = null;
        a();
    }
}
