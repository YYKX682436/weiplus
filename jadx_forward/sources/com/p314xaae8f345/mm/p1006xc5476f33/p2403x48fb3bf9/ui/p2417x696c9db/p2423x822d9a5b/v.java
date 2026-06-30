package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f265758a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9 f265759b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f265760c;

    /* renamed from: d, reason: collision with root package name */
    public pv.a0 f265761d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f265762e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.t.f265755d);

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f265763f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Boolean f265764g;

    public final boolean a(long j17, pv.b0 scene) {
        boolean booleanValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        java.lang.Long l17 = this.f265763f;
        if (l17 == null || l17 == null || l17.longValue() != j17) {
            this.f265763f = java.lang.Long.valueOf(j17);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((ov.f0) ((pv.c0) i95.n0.c(pv.c0.class))).wi(scene));
            this.f265764g = valueOf;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            booleanValue = valueOf.booleanValue();
        } else {
            java.lang.Boolean bool = this.f265764g;
            booleanValue = bool != null ? bool.booleanValue() : false;
        }
        scene.toString();
        return booleanValue;
    }

    public final void b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, boolean z17, yz5.a aVar) {
        int width;
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = abstractActivityC21394xb3d2c0cf.mo2533x106ab264();
        android.view.View j17 = mo2533x106ab264 != null ? mo2533x106ab264.j() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallEduHelper", "doAddFloatBallEduView actionBar.customView: " + j17);
        if (j17 == null) {
            return;
        }
        android.view.View findViewById = j17.findViewById(com.p314xaae8f345.mm.R.id.f564015fq);
        if (findViewById == null || findViewById.getVisibility() == 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewFloatBallEduHelper", "doAddFloatBallEduView optionIcon invalid and not show");
            return;
        }
        int[] s17 = pm0.v.s(j17);
        j17.getHeight();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95 = abstractActivityC21394xb3d2c0cf.m78735x28280f95();
        if (m78735x28280f95 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewFloatBallEduHelper", "doAddFloatBallEduView swipeLayout is null");
            return;
        }
        android.view.View findViewById2 = m78735x28280f95.findViewById(com.p314xaae8f345.mm.R.id.jlt);
        if (findViewById2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewFloatBallEduHelper", "doAddFloatBallEduView contentRootLayout is null");
            width = 0;
        } else {
            width = m78735x28280f95.getWidth() - findViewById2.getWidth();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallEduHelper", "doAddFloatBallEduView swipeLayout: " + m78735x28280f95 + ", childCount: " + m78735x28280f95.getChildCount() + ", diff: " + width);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9 c12915xed9c02f9 = this.f265759b;
        if (c12915xed9c02f9 != null) {
            pv.c0 c0Var = (pv.c0) i95.n0.c(pv.c0.class);
            pv.a0 a0Var = this.f265761d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a0Var);
            c12915xed9c02f9.m54093x4150ff41(((ov.f0) c0Var).Bi(a0Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9 c12915xed9c02f92 = this.f265759b;
        if (c12915xed9c02f92 != null) {
            c12915xed9c02f92.m54091x9baa4729(com.p314xaae8f345.mm.ui.zk.a(abstractActivityC21394xb3d2c0cf, 13));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9 c12915xed9c02f93 = this.f265759b;
        if (c12915xed9c02f93 != null) {
            c12915xed9c02f93.m54094x1d7ab60b(width);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9 c12915xed9c02f94 = this.f265759b;
        if (c12915xed9c02f94 != null) {
            c12915xed9c02f94.m54095x90c9d113(j17.getHeight() + s17[1]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9 c12915xed9c02f95 = this.f265759b;
        if (c12915xed9c02f95 != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388613;
            c12915xed9c02f95.setLayoutParams(layoutParams);
        }
        if (z17) {
            ym5.v6.b(m78735x28280f95, this.f265759b);
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.r(this));
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallEduHelper", "hideFloatBallEduView");
        this.f265760c = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9 c12915xed9c02f9 = this.f265759b;
        if (c12915xed9c02f9 == null) {
            return;
        }
        c12915xed9c02f9.setVisibility(8);
    }
}
