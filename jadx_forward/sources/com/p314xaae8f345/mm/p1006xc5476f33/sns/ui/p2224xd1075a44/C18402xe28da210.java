package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView */
/* loaded from: classes4.dex */
public class C18402xe28da210 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qa f252317d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f252318e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f252319f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f252320g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f252321h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f252322i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f252323m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f252324n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f252325o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f252326p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f252327q;

    /* renamed from: r, reason: collision with root package name */
    public int f252328r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f252329s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f252330t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f252331u;

    /* renamed from: v, reason: collision with root package name */
    public long f252332v;

    public C18402xe28da210(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f252329s = "";
        this.f252330t = null;
        this.f252331u = false;
        this.f252332v = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cty, this);
        this.f252318e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567394jc5);
        this.f252319f = findViewById(com.p314xaae8f345.mm.R.id.or9);
        this.f252320g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ora);
        this.f252321h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.or8);
        this.f252322i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.or_);
        this.f252323m = findViewById(com.p314xaae8f345.mm.R.id.hax);
        this.f252324n = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.haw);
        this.f252325o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hav);
        this.f252326p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hay);
        this.f252327q = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.cl6);
        this.f252318e.setBackgroundColor(android.graphics.Color.parseColor("#7f000000"));
        ca4.m0.y0(this.f252320g, com.p314xaae8f345.mm.R.C30860x5b28f31.a_p);
        ca4.m0.y0(this.f252321h, com.p314xaae8f345.mm.R.C30860x5b28f31.a_m);
        ca4.m0.y0(this.f252322i, com.p314xaae8f345.mm.R.C30860x5b28f31.a_o);
        ca4.m0.y0(this.f252325o, com.p314xaae8f345.mm.R.C30860x5b28f31.a_n);
        ca4.m0.y0(this.f252326p, com.p314xaae8f345.mm.R.C30860x5b28f31.a_o);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportVideoEndViewClick", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdCardVideoEndView", "reportVideoEndViewClick snsInfo==null, scene=" + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportVideoEndViewClick", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("clickCount", 1);
            jSONObject2.put("type", 4);
            java.lang.String m70375x338a8cc7 = c17933xe8d1b226.m70375x338a8cc7();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m70375x338a8cc7 == null) {
                m70375x338a8cc7 = "";
            }
            jSONObject.put("extInfo", jSONObject2);
            jSONObject.put("uxinfo", m70375x338a8cc7);
            jSONObject.put("snsid", c17933xe8d1b226.f68891x29d1292e);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("17539", jSONObject3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdCardVideoEndView", "reportVideoEndViewClick 17539, content=" + jSONObject3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdCardVideoEndView", "reportVideoEndViewClick exp:" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportVideoEndViewClick", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        java.lang.String m70367x7525eefd = c17933xe8d1b226.m70367x7525eefd();
        if (!android.text.TextUtils.isEmpty(this.f252329s) && this.f252329s.equals(m70367x7525eefd)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdCardVideoEndView", "checkSnsId changed, old=" + this.f252329s + ", new=" + m70367x7525eefd);
        this.f252332v = 0L;
        c(false);
        this.f252329s = m70367x7525eefd;
        this.f252330t = c17933xe8d1b226;
        this.f252331u = false;
        setBackgroundDrawable(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        return true;
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doReportExpouse", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        if (this.f252330t != null && this.f252317d != null && this.f252332v > 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.f252332v;
            float f17 = (float) (currentTimeMillis - j17);
            int i17 = this.f252317d.f251869d;
            if (f17 > i17) {
                f17 = i17;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f252330t;
            float f18 = f17 / 1000.0f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportVideoEndViewExpouse", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            if (c17933xe8d1b226 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdCardVideoEndView", "reportVideoEndViewExpouse snsInfo==null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportVideoEndViewExpouse", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            } else {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("exposureDuration", f18);
                    jSONObject2.put("startTimestamp", j17);
                    jSONObject2.put("type", 5);
                    java.lang.String m70375x338a8cc7 = c17933xe8d1b226.m70375x338a8cc7();
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (m70375x338a8cc7 == null) {
                        m70375x338a8cc7 = "";
                    }
                    jSONObject.put("extInfo", jSONObject2);
                    jSONObject.put("uxinfo", m70375x338a8cc7);
                    jSONObject.put("snsid", c17933xe8d1b226.f68891x29d1292e);
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f252328r);
                    java.lang.String jSONObject3 = jSONObject.toString();
                    ca4.m0.a("17539", jSONObject3);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdCardVideoEndView", "reportVideoEndViewExpouse 17539, content=" + jSONObject3);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdCardVideoEndView", "reportVideoEndViewExpouse exp:" + e17.toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportVideoEndViewExpouse", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            }
            this.f252332v = 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doReportExpouse", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    public void c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hide", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdCardVideoEndView", "hide, anim=" + z17);
        if (getVisibility() == 0) {
            b();
        }
        if (!z17) {
            setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hide", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return;
        }
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(250L);
        alphaAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.i0(this));
        startAnimation(alphaAnimation);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hide", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshUI", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qa qaVar = this.f252317d;
        if (qaVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshUI", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return;
        }
        if (android.text.TextUtils.isEmpty(qaVar.f251866a)) {
            this.f252325o.setText(this.f252317d.f251867b);
            this.f252326p.setText(this.f252317d.f251868c);
            if (!android.text.TextUtils.isEmpty(this.f252317d.f38456xd58e724)) {
                a84.m.a(this.f252317d.f38456xd58e724, this.f252324n);
            }
            android.view.View view = this.f252319f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f252323m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.f252320g.setText(this.f252317d.f251866a);
            this.f252321h.setText(this.f252317d.f251867b);
            this.f252322i.setText(this.f252317d.f251868c);
            android.view.View view3 = this.f252319f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f252323m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (android.text.TextUtils.isEmpty(this.f252317d.f38455xe4f35543)) {
            this.f252327q.setVisibility(8);
        } else {
            this.f252327q.setVisibility(0);
            a84.m.a(this.f252317d.f38455xe4f35543, this.f252327q);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshUI", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    public void f(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("show", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdCardVideoEndView", "show, anim=" + z17);
        this.f252332v = java.lang.System.currentTimeMillis();
        if (!z17) {
            setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("show", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return;
        }
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setStartOffset(100L);
        alphaAnimation.setDuration(300L);
        setVisibility(0);
        startAnimation(alphaAnimation);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("show", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdCardVideoEndView", "onAttachedToWindow");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        super.onDetachedFromWindow();
        if (getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdCardVideoEndView", "onDetachedFromWindow");
            b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    /* renamed from: setBlurBkg */
    public void m71241xb0523095(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBlurBkg", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        try {
        } catch (java.lang.Throwable th6) {
            th = th6;
            str = "setBlurBkg";
        }
        if (this.f252331u) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBlurBkg", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.graphics.Bitmap bitmap = view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 ? ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0) view).getBitmap() : view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18692xd171d8a0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18692xd171d8a0) view).getBitmap() : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(view);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        int width = bitmap.getWidth() / 5;
        int height = bitmap.getHeight() / 5;
        android.graphics.Bitmap X = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.X(android.graphics.Bitmap.createScaledBitmap(bitmap, width, height, false), 20);
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(X));
        this.f252331u = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setBlurBkg, totalCost=");
        str = "setBlurBkg";
        try {
            sb6.append(currentTimeMillis3 - currentTimeMillis);
            sb6.append(", captureCost=");
            sb6.append(currentTimeMillis2 - currentTimeMillis);
            sb6.append(", blurCost=");
            sb6.append(currentTimeMillis3 - currentTimeMillis2);
            sb6.append(", w=");
            sb6.append(width);
            sb6.append(", h=");
            sb6.append(height);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdCardVideoEndView", sb6.toString());
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdCardVideoEndView", "setBlurBkg, exp=" + th.toString());
            this.f252331u = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }
}
