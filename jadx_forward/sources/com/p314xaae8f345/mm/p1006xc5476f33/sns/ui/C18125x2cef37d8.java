package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTranslateResultView */
/* loaded from: classes4.dex */
public class C18125x2cef37d8 extends com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 {

    /* renamed from: q, reason: collision with root package name */
    public static final int f249002q = android.graphics.Color.parseColor("#19000000");

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f249003d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f249004e;

    /* renamed from: f, reason: collision with root package name */
    public bd4.f2 f249005f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f249006g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f249007h;

    /* renamed from: i, reason: collision with root package name */
    public int f249008i;

    /* renamed from: m, reason: collision with root package name */
    public float f249009m;

    /* renamed from: n, reason: collision with root package name */
    public int f249010n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View.OnCreateContextMenuListener f249011o;

    /* renamed from: p, reason: collision with root package name */
    public db5.t4 f249012p;

    public C18125x2cef37d8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f249008i = -1;
        this.f249009m = -1.0f;
        this.f249010n = -1;
        i();
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroySelectableTextHelper", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        bd4.f2 f2Var = this.f249005f;
        if (f2Var != null) {
            f2Var.k();
            this.f249005f = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroySelectableTextHelper", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    public void e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6 r6Var, int i17, java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finishTranslate", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        this.f249008i = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateTranslateReusltSizeAndColor", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        float f17 = this.f249009m;
        if (f17 == -1.0f && this.f249010n == -1) {
            int i18 = this.f249008i;
            if (i18 == 2) {
                this.f249004e.setTextSize(1, i65.a.q(getContext()) * 14.0f);
            } else if (i18 == 1) {
                this.f249004e.setTextSize(1, i65.a.q(getContext()) * 15.0f);
            }
        } else {
            this.f249004e.setTextSize(this.f249010n, f17);
        }
        int i19 = this.f249008i;
        if (i19 == 2) {
            this.f249004e.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6k));
        } else if (i19 == 1) {
            this.f249004e.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6m));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTranslateReusltSizeAndColor", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f249004e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jgm);
            c();
        } else {
            this.f249004e.setText(str);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(this.f249004e, 2);
            j();
        }
        this.f249004e.setCompoundDrawables(null, null, null, null);
        if (z17 && fp.h.c(11)) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.l5.b(this.f249004e, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xs(this, r6Var));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            this.f249003d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b6e);
        } else {
            this.f249003d.setText(str2);
        }
        this.f249003d.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finishTranslate", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    /* renamed from: getResultTextView */
    public android.widget.TextView m70803x246721a5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResultTextView", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        android.widget.TextView textView = this.f249004e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResultTextView", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        return textView;
    }

    /* renamed from: getSplitlineView */
    public android.view.View m70804xb86b621d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSplitlineView", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        android.view.View view = this.f249006g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSplitlineView", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        return view;
    }

    public final void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d2c, this);
        this.f249003d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nc6);
        this.f249004e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nc7);
        this.f249006g = findViewById(com.p314xaae8f345.mm.R.id.ojf);
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bng);
        this.f249007h = drawable;
        drawable.setBounds(0, 0, (int) (this.f249004e.getTextSize() * 0.8f), (int) (this.f249004e.getTextSize() * 0.8f));
        this.f249007h.setColorFilter(f249002q, android.graphics.PorterDuff.Mode.SRC_IN);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    public final void j() {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        if (!pc4.d.f434943a.b(false) || (textView = this.f249004e) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(textView.getText().toString()) || this.f249011o == null || this.f249012p == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
            return;
        }
        java.lang.Object tag = this.f249004e.getTag();
        if (!(tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.go)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
            return;
        }
        c();
        this.f249004e.setBackground(null);
        bd4.f2 f2Var = new bd4.f2(getContext(), this.f249004e, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.go) tag).f249979b), this.f249011o, this.f249012p, null);
        this.f249005f = f2Var;
        f2Var.j();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    public void k(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startTranslate", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        c();
        this.f249004e.setCompoundDrawables(this.f249007h, null, null, null);
        this.f249004e.setCompoundDrawablePadding(i65.a.b(getContext(), 3));
        this.f249004e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jgo);
        com.p314xaae8f345.mm.ui.p2740x696c9db.l5.b(this.f249004e, null);
        this.f249003d.setVisibility(4);
        this.f249008i = i17;
        this.f249004e.setTextSize(0, this.f249003d.getTextSize());
        this.f249004e.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6l));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startTranslate", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        c();
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    /* renamed from: setCreateContextMenuListener */
    public void m70805x3b820da4(android.view.View.OnCreateContextMenuListener onCreateContextMenuListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCreateContextMenuListener", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        this.f249011o = onCreateContextMenuListener;
        j();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCreateContextMenuListener", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    /* renamed from: setMenuItemSelectedListener */
    public void m70806x2fedc823(db5.t4 t4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMenuItemSelectedListener", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        this.f249012p = t4Var;
        j();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMenuItemSelectedListener", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    /* renamed from: setResultTextSize */
    public void m70807xec5c2f0d(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setResultTextSize", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        this.f249004e.setTextSize(0, f17);
        this.f249009m = f17;
        this.f249010n = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setResultTextSize", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    public C18125x2cef37d8(android.content.Context context) {
        super(context);
        this.f249008i = -1;
        this.f249009m = -1.0f;
        this.f249010n = -1;
        i();
    }

    public C18125x2cef37d8(android.content.Context context, boolean z17) {
        super(context);
        this.f249008i = -1;
        this.f249009m = -1.0f;
        this.f249010n = -1;
        if (z17) {
            return;
        }
        i();
    }
}
