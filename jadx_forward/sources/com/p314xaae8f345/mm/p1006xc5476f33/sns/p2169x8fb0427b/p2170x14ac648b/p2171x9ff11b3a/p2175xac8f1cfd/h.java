package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 {

    /* renamed from: s, reason: collision with root package name */
    public final int f246755s;

    /* renamed from: t, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f246756t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.Map f246757u;

    /* renamed from: v, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f246758v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.Set f246759w;

    public h(android.content.Context context, ab4.v vVar, android.view.ViewGroup viewGroup) {
        super(context, vVar, viewGroup);
        this.f246755s = i65.a.b(context, 12);
        this.f246757u = new java.util.HashMap();
        this.f246759w = new java.util.HashSet();
    }

    public static void O(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.h hVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        hVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateChildrenExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = hVar.f246758v;
        if (c1162x665295de != null) {
            hVar.R(c1162x665295de.w(), hVar.f246758v.y());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        int w17 = hVar.f246758v.w();
        int y17 = hVar.f246758v.y();
        for (java.util.Map.Entry entry : ((java.util.HashMap) hVar.f246757u).entrySet()) {
            if (((java.lang.Integer) entry.getKey()).intValue() < w17 || ((java.lang.Integer) entry.getKey()).intValue() > y17) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.c) entry.getValue()).a();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateChildrenExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public boolean C(org.json.JSONArray jSONArray) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        if (jSONArray == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            return false;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (D(jSONObject)) {
            jSONArray.put(jSONObject);
        }
        try {
            java.util.Map map = this.f246757u;
            java.util.Set set = this.f246759w;
            this.f246759w = new java.util.HashSet();
            this.f246757u = new java.util.HashMap();
            for (java.util.Map.Entry entry : map.entrySet()) {
                ab4.d0 d0Var = (ab4.d0) P().F.get(((java.lang.Integer) entry.getKey()).intValue());
                if (!d0Var.f84367x && (d0Var instanceof ab4.x)) {
                    ab4.x xVar = (ab4.x) d0Var;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("cid", ((ab4.d0) P().F.get(((java.lang.Integer) entry.getKey()).intValue())).f84350d);
                    jSONObject2.put(dm.n.f67499xab3e7a9, ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.c) entry.getValue()).f246639a);
                    jSONObject2.put("stayTime", ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.c) entry.getValue()).f246640b);
                    if (set.contains(entry.getKey())) {
                        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(xVar.f9x7249350d);
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("urlMd5", a17);
                        jSONObject3.put("needDownload", 1);
                        jSONObject2.put("imgUrlInfo", jSONObject3);
                    }
                    jSONArray.put(jSONObject2);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            return true;
        } catch (org.json.JSONException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingCarouselComp", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        super.K();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f246758v;
        if (c1162x665295de != null) {
            R(c1162x665295de.w(), this.f246758v.y());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        super.M();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyChildrenDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f246758v;
        if (c1162x665295de != null) {
            int y17 = this.f246758v.y();
            for (int w17 = c1162x665295de.w(); w17 <= y17; w17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.c) ((java.util.HashMap) this.f246757u).get(java.lang.Integer.valueOf(w17));
                if (cVar != null) {
                    cVar.a();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyChildrenDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
    }

    public final ab4.v P() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        ab4.v vVar = (ab4.v) this.f246583e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        return vVar;
    }

    public final void R(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startItmesExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        while (i17 <= i18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.c) this.f246757u.get(java.lang.Integer.valueOf(i17));
            if (cVar == null) {
                cVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.c(this, null);
                this.f246757u.put(java.lang.Integer.valueOf(i17), cVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beginExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$ExposureInfo");
            if (cVar.f246642d) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beginExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$ExposureInfo");
            } else {
                cVar.f246642d = true;
                cVar.f246641c = java.lang.System.currentTimeMillis();
                cVar.f246639a++;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beginExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$ExposureInfo");
            }
            i17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startItmesExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) this.f246589n.findViewById(com.p314xaae8f345.mm.R.id.lq8);
        this.f246756t = c1163xf1deaba4;
        c1163xf1deaba4.setBackgroundColor(P().G);
        java.util.Iterator it = P().F.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            ab4.d0 d0Var = (ab4.d0) it.next();
            if (d0Var instanceof ab4.x) {
                int i18 = ((int) (d0Var.f84353g + d0Var.f84352f + ((ab4.x) d0Var).f84363t)) + (this.f246755s << 1);
                if (i17 <= i18) {
                    i17 = i18;
                }
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f246756t.getLayoutParams();
        layoutParams.height = i17;
        this.f246756t.setLayoutParams(layoutParams);
        this.f246756t.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.e(this, null));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this.f246582d);
        this.f246758v = c1162x665295de;
        c1162x665295de.Q(0);
        this.f246756t.mo7967x900dcbe1(this.f246758v);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f246756t;
        c1163xf1deaba42.i(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.g(this, c1163xf1deaba42, this.f246758v));
        this.f246756t.setNestedScrollingEnabled(false);
        this.f246756t.m7963x830bc99d(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public int v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cpf;
    }
}
