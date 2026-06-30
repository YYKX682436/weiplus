package d54;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.mb.C17734x49521fb8 f308081s;

    /* renamed from: t, reason: collision with root package name */
    public final f54.a0 f308082t;

    /* renamed from: u, reason: collision with root package name */
    public hq0.e0 f308083u;

    /* renamed from: v, reason: collision with root package name */
    public e64.h f308084v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f308085w;

    public a(android.content.Context context, f54.a0 a0Var, android.view.ViewGroup viewGroup) {
        super(context, a0Var, viewGroup);
        this.f308085w = true;
        this.f308082t = a0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public boolean C(org.json.JSONArray jSONArray) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        try {
            f54.a0 a0Var = this.f308082t;
            if (a0Var != null) {
                android.content.Context context = this.f246582d;
                if (context instanceof android.app.Activity) {
                    android.app.Activity activity = (android.app.Activity) context;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    if (!D(jSONObject)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingMBComponent", "magic brush component doesn't allow to report 13387");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
                        return false;
                    }
                    java.util.List<org.json.JSONObject> a17 = e64.p.a(activity, a0Var.f84350d);
                    if (a84.b0.b(a17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingMBComponent", "there is no children in magic brush !!");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
                        return false;
                    }
                    for (org.json.JSONObject jSONObject2 : a17) {
                        if (jSONObject2.has("cid")) {
                            if (!jSONObject2.has(dm.n.f67499xab3e7a9)) {
                                jSONObject2.put(dm.n.f67499xab3e7a9, r());
                            }
                            if (!jSONObject2.has("stayTime")) {
                                jSONObject2.put("stayTime", w());
                            }
                            jSONArray.put(jSONObject2);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingMBComponent", "there is one data without id, are you sure?");
                        }
                    }
                    jSONArray.put(jSONObject);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1997, 3);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
                    return true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingMBComponent", "the mb info is null in setComponentKVReportData, or activity is null, are you sure?");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1997, 4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingMBComponent", "there is a wrong in setComponentKVReportData, exception: " + e17.getMessage());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1997, 4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        super.K();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingMBComponent", "viewWillAppear is called");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        super.M();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    public final void O() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindMagicSclView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        f54.a0 a0Var = this.f308082t;
        if (a0Var == null || android.text.TextUtils.isEmpty(a0Var.F) || android.text.TextUtils.isEmpty(a0Var.G)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingMBComponent", "the magic node info is null, or necessity is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindMagicSclView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return;
        }
        if (this.f308081s != null && this.f308083u != null && this.f308085w && this.f308084v != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingMBComponent", "rebind scl view again");
            this.f308085w = false;
            this.f308081s.a(this.f308083u);
            e64.h hVar = this.f308084v;
            java.lang.String data = a0Var.G;
            java.lang.String str = a0Var.F;
            hVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendDataChangeEvent", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
            hq0.e0 e0Var = hVar.A;
            jz5.f0 f0Var = null;
            if (e0Var != null) {
                if (str == null || r26.n0.N(str)) {
                    e0Var.a(data, null);
                } else {
                    hq0.e0.b(e0Var, data, str, null, 4, null);
                }
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdMB", "the frameSetRoot is null, please create frame-set-root and bound it by one frame-set");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendDataChangeEvent", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindMagicSclView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        f54.a0 a0Var = this.f308082t;
        if (a0Var != null && a0Var.H == 1) {
            a0Var.f84356m = this.f246591p;
            a0Var.f84357n = this.f246592q;
        }
        super.g();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void h() {
        f54.a0 a0Var;
        e64.h hVar;
        hq0.e0 e0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        android.content.Context context = this.f246582d;
        if (!(context instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingMBComponent", "the context is not activity, is the component right?");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return;
        }
        if (this.f246589n == null || (a0Var = this.f308082t) == null || android.text.TextUtils.isEmpty(a0Var.F)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingMBComponent", "the magic info is null, or the frame set name is empty!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.mb.C17734x49521fb8 c17734x49521fb8 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.mb.C17734x49521fb8) this.f246589n.findViewById(com.p314xaae8f345.mm.R.id.maf);
        this.f308081s = c17734x49521fb8;
        if (c17734x49521fb8 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingMBComponent", "the magic view is null, are you sure???");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return;
        }
        if (!e64.q.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingMBComponent", "the mb is not supported, hide the magic scl view");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return;
        }
        android.view.View view = this.f246589n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/mb/AdLandingMBComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/mb/AdLandingMBComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f308081s.m46621x77a67e9f(false);
        this.f308081s.addOnAttachStateChangeListener(this);
        this.f308081s.e(a0Var.F);
        android.app.Activity activity = (android.app.Activity) context;
        java.util.Map map = e64.p.f331371a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepareBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdMB", "activity is null, are you sure??");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepareBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            hVar = null;
        } else {
            try {
                int hashCode = activity.hashCode();
                java.util.Map map2 = e64.p.f331371a;
                e64.e eVar = (e64.e) ((java.util.LinkedHashMap) map2).get(java.lang.Integer.valueOf(hashCode));
                if (eVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdMB", "new magic brush manager data.");
                    e64.e eVar2 = new e64.e(hashCode, null, null, 6, null);
                    map2.put(java.lang.Integer.valueOf(hashCode), eVar2);
                    eVar = eVar2;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
                hVar = eVar.f331355b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
                if (hVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdMB", "new magic brush biz created!");
                    hVar = new e64.h(activity);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
                    eVar.f331355b = hVar;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) e64.p.f331372b).get(java.lang.Integer.valueOf(hashCode));
                    hVar.N1(weakReference != null ? (android.widget.FrameLayout) weakReference.get() : null);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdMB", "there is an exception in destroy: " + e17.getMessage());
                hVar = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepareBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        }
        this.f308084v = hVar;
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingMBComponent", "the biz is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOrCreateFrameSetRoot", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        java.lang.ref.Reference reference = hVar.f331361z;
        if (reference.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdMB", "the activity is null, Please check it");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOrCreateFrameSetRoot", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            e0Var = null;
        } else {
            hq0.e0 e0Var2 = hVar.A;
            if (e0Var2 == null) {
                android.app.Activity activity2 = (android.app.Activity) reference.get();
                e0Var = activity2 != null ? hq0.i0.K0(hVar, hVar, activity2, "MagicAdLandPage", "frames", "", false, 32, null) : null;
                hVar.A = e0Var;
            } else {
                e0Var = e0Var2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOrCreateFrameSetRoot", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        }
        this.f308083u = e0Var;
        if (e0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingMBComponent", "the frameSetRoot is null, is biz prepared???");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        } else {
            this.f308081s.c(e0Var);
            O();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewAttachedToWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        O();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewAttachedToWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        this.f308085w = view == this.f308081s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public int v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cpr;
    }
}
