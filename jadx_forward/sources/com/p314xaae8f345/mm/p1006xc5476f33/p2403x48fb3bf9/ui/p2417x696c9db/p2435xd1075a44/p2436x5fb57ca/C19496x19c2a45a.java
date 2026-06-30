package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyPanel */
/* loaded from: classes8.dex */
public class C19496x19c2a45a extends android.widget.LinearLayout implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener, ey4.d0 {

    /* renamed from: d, reason: collision with root package name */
    public ey4.b0 f268853d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f268854e;

    /* renamed from: f, reason: collision with root package name */
    public ey4.c0 f268855f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f268856g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f268857h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19497x6eab2374 f268858i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce f268859m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f268860n;

    public C19496x19c2a45a(android.content.Context context) {
        super(context, null);
        this.f268854e = false;
        this.f268857h = null;
        this.f268858i = null;
        this.f268860n = true;
        this.f268856g = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) getContext();
        ey4.c0 c0Var = new ey4.c0();
        this.f268855f = c0Var;
        c0Var.f339143b = getContext();
        this.f268855f.f339144c = this.f268853d;
    }

    public final void a() {
        boolean j17;
        if (this.f268859m == null || (j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.j(getContext())) == this.f268860n) {
            return;
        }
        if (j17) {
            this.f268859m.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx));
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f268859m.getLayoutParams();
            layoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561911w9);
            this.f268859m.setLayoutParams(layoutParams);
        } else {
            this.f268859m.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq));
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f268859m.getLayoutParams();
            layoutParams2.bottomMargin = 0;
            this.f268859m.setLayoutParams(layoutParams2);
        }
        this.f268860n = j17;
    }

    /* renamed from: getManager */
    public final ey4.c0 m74845x6f964b77() {
        return this.f268855f;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f268854e) {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.j(getContext())) {
            super.onMeasure(i17, i18);
        } else {
            super.onMeasure(i17, i18);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        int ceil;
        ey4.v b17 = this.f268855f.b(i17);
        ey4.w wVar = (ey4.w) b17;
        if (wVar.a() * wVar.b() < 1) {
            ceil = 0;
        } else {
            ceil = (int) java.lang.Math.ceil((((com.p314xaae8f345.mm.p2614xca6eae71.e1) wVar.f339164b.a()).f274776c == null ? 0 : r2.size()) / (wVar.a() * wVar.b()));
        }
        int i18 = i17 - b17.f339165c;
        if (ceil <= 1) {
            this.f268859m.setVisibility(4);
            return;
        }
        this.f268859m.setVisibility(0);
        this.f268859m.m78919xc4325fc8(ceil);
        this.f268859m.m78922x7d600aec(i18);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        a();
    }

    /* renamed from: setOnTextOperationListener */
    public void m74846x5e04422d(ey4.b0 b0Var) {
        this.f268853d = b0Var;
        this.f268855f.f339144c = b0Var;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (i17 == 0) {
            this.f268854e = false;
        } else {
            this.f268854e = true;
        }
        super.setVisibility(i17);
        if (this.f268854e) {
            return;
        }
        this.f268856g.mo48674x36654fab();
        if (this.f268857h != null && getChildCount() > 0) {
            android.view.View view = this.f268857h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyPanel", "initShowState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyPanel", "initShowState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f268857h;
        if (view2 == null) {
            this.f268857h = android.view.View.inflate(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30864xbddafb2a.d_2, null);
        } else if (view2.getParent() != null) {
            ((android.view.ViewGroup) this.f268857h.getParent()).removeView(this.f268857h);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19497x6eab2374 c19497x6eab2374 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19497x6eab2374) this.f268857h.findViewById(com.p314xaae8f345.mm.R.id.f568494n10);
        this.f268858i = c19497x6eab2374;
        c19497x6eab2374.mo79170x2d3430b4(this);
        this.f268858i.m74848x3e2a9e8b(this.f268855f);
        this.f268858i.m74847x138029a6(this);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce c21487xa86ce1ce = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce) this.f268857h.findViewById(com.p314xaae8f345.mm.R.id.n0x);
        this.f268859m = c21487xa86ce1ce;
        c21487xa86ce1ce.m78919xc4325fc8(1);
        a();
        addView(this.f268857h, new android.widget.LinearLayout.LayoutParams(-1, -1));
    }

    public C19496x19c2a45a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f268854e = false;
        this.f268857h = null;
        this.f268858i = null;
        this.f268860n = true;
        this.f268856g = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) getContext();
        ey4.c0 c0Var = new ey4.c0();
        this.f268855f = c0Var;
        c0Var.f339143b = getContext();
        this.f268855f.f339144c = this.f268853d;
    }
}
