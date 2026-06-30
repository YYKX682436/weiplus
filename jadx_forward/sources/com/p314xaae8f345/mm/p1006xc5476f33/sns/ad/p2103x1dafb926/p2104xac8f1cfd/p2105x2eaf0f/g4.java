package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class g4 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 {
    public android.widget.FrameLayout A;
    public android.widget.LinearLayout B;
    public android.widget.TextView C;
    public int D;
    public android.graphics.Bitmap E;
    public final android.view.ViewOutlineProvider F;
    public final java.util.Map G;
    public boolean H;
    public final android.os.Handler I;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f244363s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f244364t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f244365u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f244366v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f244367w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f244368x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f244369y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f244370z;

    public g4(android.content.Context context, f54.g0 g0Var, android.view.ViewGroup viewGroup) {
        super(context, g0Var, viewGroup);
        this.D = 1;
        this.F = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.c4(this);
        this.G = new java.util.HashMap();
        this.H = true;
        this.I = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f4(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingSocialCardComponent", "hash=" + hashCode() + ", info=" + g0Var.m129064x9616526c());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        if (!super.D(jSONObject)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return false;
        }
        try {
            jSONObject.put("uiType", this.D);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return true;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        android.view.ViewGroup.LayoutParams layoutParams = this.f246589n.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins((int) O().f84354h, (int) O().f84352f, (int) O().f84355i, (int) O().f84353g);
            this.f246589n.setLayoutParams(marginLayoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        super.M();
        this.I.removeCallbacksAndMessages(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    public final f54.g0 O() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        f54.g0 g0Var = (f54.g0) this.f246583e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        return g0Var;
    }

    public final void P(java.lang.String str, android.widget.ImageView imageView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadAvatarByUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingSocialCardComponent", "loadAvatarByUserName start, userName=" + str);
        imageView.setImageBitmap(this.E);
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadAvatarByUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return;
        }
        imageView.setTag(str);
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.e4(this, str, imageView));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadAvatarByUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    public void R() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateDyncContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingSocialCardComponent", "updateDyncContent");
        f54.g0 O = O();
        if (O == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDyncContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return;
        }
        this.f244363s.setText(O.F);
        this.f244364t.setText(O.G);
        this.f244365u.setText(O.H);
        this.f244366v.setText(O.I);
        this.f244370z.setText(O.f341254J);
        this.D = 1;
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.b4(this, O));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDyncContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        this.f244363s = (android.widget.TextView) this.f246589n.findViewById(com.p314xaae8f345.mm.R.id.ocz);
        this.f244364t = (android.widget.TextView) this.f246589n.findViewById(com.p314xaae8f345.mm.R.id.ocv);
        this.f244365u = (android.widget.TextView) this.f246589n.findViewById(com.p314xaae8f345.mm.R.id.od9);
        this.f244366v = (android.widget.TextView) this.f246589n.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        this.f244367w = (android.widget.ImageView) this.f246589n.findViewById(com.p314xaae8f345.mm.R.id.agc);
        this.f244368x = (android.widget.ImageView) this.f246589n.findViewById(com.p314xaae8f345.mm.R.id.a_e);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f246589n.findViewById(com.p314xaae8f345.mm.R.id.mkt);
        this.f244369y = imageView;
        imageView.setOutlineProvider(this.F);
        this.f244369y.setClipToOutline(true);
        this.f244370z = (android.widget.TextView) this.f246589n.findViewById(com.p314xaae8f345.mm.R.id.a9y);
        this.A = (android.widget.FrameLayout) this.f246589n.findViewById(com.p314xaae8f345.mm.R.id.f568688nq0);
        this.B = (android.widget.LinearLayout) this.f246589n.findViewById(com.p314xaae8f345.mm.R.id.gea);
        this.C = (android.widget.TextView) this.f246589n.findViewById(com.p314xaae8f345.mm.R.id.au6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initDefaultAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        try {
            this.E = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null)), false, r3.getWidth());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingSocialCardComponent", "initDefaultAvatar exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initDefaultAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        if (this.f246589n == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return;
        }
        f54.g0 O = O();
        if (O == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return;
        }
        a84.z.h(O.f69689xaeeabadc, this.f244368x);
        java.lang.String m69872xaa2fb6d8 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69872xaa2fb6d8();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingSocialCardComponent", "fillItem, selfUserName=" + m69872xaa2fb6d8);
        P(m69872xaa2fb6d8, this.f244369y);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public int v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cpy;
    }
}
