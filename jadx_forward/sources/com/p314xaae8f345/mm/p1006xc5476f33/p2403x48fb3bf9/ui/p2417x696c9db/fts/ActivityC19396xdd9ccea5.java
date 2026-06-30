package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC19396xdd9ccea5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19389x16789445 {

    /* renamed from: h5, reason: collision with root package name */
    public static final /* synthetic */ int f265857h5 = 0;

    /* renamed from: d5, reason: collision with root package name */
    public java.lang.Boolean f265858d5;

    /* renamed from: e5, reason: collision with root package name */
    public java.lang.Boolean f265859e5;

    /* renamed from: f5, reason: collision with root package name */
    public android.view.View f265860f5;

    /* renamed from: g5, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f265861g5;

    public ActivityC19396xdd9ccea5() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f265858d5 = bool;
        this.f265859e5 = bool;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public void B9(int i17, java.lang.String str, java.util.Map map) {
        super.B9(i17, str, map);
        if (this.f265858d5.booleanValue()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((rx4.h2) pf5.z.f435481a.a(activity).a(rx4.h2.class)).f482701g = i17;
        }
        pa();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19389x16789445, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357, tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        super.C3(str, str2, list, oVar);
        if (this.V4 && this.f265856b5 != com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            this.f265856b5 = K0;
            android.view.View view = this.W4;
            if (view != null) {
                int i17 = (K0 && this.f265386r3 == -3) ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f265861g5 != null) {
            this.f265861g5.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P9()) ? 0 : 8);
        }
        if (this.f265858d5.booleanValue()) {
            this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.c4(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357, tj5.n
    public void U1(boolean z17) {
        super.U1(z17);
        if (z17) {
            return;
        }
        U7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public java.lang.Boolean W9() {
        return java.lang.Boolean.valueOf(this.f265858d5.booleanValue() && P9().length() <= 0 && this.P4.isEmpty());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public void aa(int i17, java.lang.String str, java.util.Map map) {
        if (this.f265858d5.booleanValue()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((rx4.h2) pf5.z.f435481a.a(activity).a(rx4.h2.class)).f482701g = i17;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public void ba() {
        super.ba();
        if (this.K3) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430 c19404xac949430 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430.class);
            java.lang.Long valueOf = java.lang.Long.valueOf(c19404xac949430.f266176g);
            sg0.w2 w2Var = (sg0.w2) c19404xac949430.f266177h;
            w2Var.getClass();
            p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
            p3325xe03a0797.p3326xc267989b.l.d(b17, null, null, new sg0.r2(w2Var, valueOf, b17, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357
    public boolean ja() {
        return na();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357
    public void la(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0 b0Var) {
        if (!this.f265858d5.booleanValue() || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P9())) {
            super.la(i17, b0Var);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        rx4.h2 h2Var = (rx4.h2) pf5.z.f435481a.a(activity).a(rx4.h2.class);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) h2Var.f482713v;
        java.lang.String str = (java.lang.String) linkedHashMap.get("placeholder");
        java.lang.String str2 = (java.lang.String) linkedHashMap.get(ya.b.f77502x92235c1b);
        java.lang.String str3 = (java.lang.String) linkedHashMap.get("mixerCommonContext");
        if (str != null) {
            h2Var.a7();
            java.lang.String b17 = fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            h2Var.t7(67, str, str3, kz5.b1.e(new jz5.l("flutterSearchDirectlyAddToKvHistory", java.lang.Boolean.FALSE)));
            h2Var.q7(vu4.a.f521776m, "0|50|" + fp.s0.b("底纹词", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), "1|1|" + b17 + '|' + b17 + "|1||0||placeholder|" + str2, false, kz5.c1.k(new jz5.l("items", h2Var.f482709r), new jz5.l("clickId", h2Var.f482716y)));
            ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).bj(h2Var.f482700f, 14, new org.json.JSONObject(kz5.b1.e(new jz5.l("teachData", kz5.c1.k(new jz5.l("type", 50), new jz5.l("item", kz5.c1.k(new jz5.l("placeholder", str), new jz5.l(ya.b.f77502x92235c1b, str2), new jz5.l("mixerCommonContext", str3))))))));
        }
        U7();
    }

    public final boolean na() {
        if (this.K3) {
            return false;
        }
        return ((s50.u0) ((u50.z) i95.n0.c(u50.z.class))).Bi(getIntent().getIntExtra("ftsbizscene", 0)) && j62.e.g().i("clicfg_fts_native_teach_page_style_android", 0, true, true) > 0;
    }

    public void oa(int i17, java.lang.String query, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map) {
        java.lang.String str5;
        if (!this.K3) {
            map.remove("flutterSearchDirectlyAddToKvHistory");
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.d4(this, query, map, i17, str, str2, str3, str4));
            return;
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (map.containsKey("flutterSearchDirectlyAddToKvHistory")) {
            bool = (java.lang.Boolean) map.get("flutterSearchDirectlyAddToKvHistory");
            map.remove("flutterSearchDirectlyAddToKvHistory");
        }
        this.F4.mo81005xdc5215a6().n(query, new java.util.LinkedList());
        this.F4.mo81005xdc5215a6().d();
        U7();
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            str5 = java.net.URLEncoder.encode(new org.json.JSONObject(map).toString(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.io.UnsupportedEncodingException unused) {
            str5 = "";
        }
        hashMap.put("parentSearchID", java.lang.String.format("%d:%s:%s:%s:%s", java.lang.Integer.valueOf(i17), str, str2, str3, str5));
        if (!android.text.TextUtils.isEmpty(str4)) {
            hashMap.put("mixerCommonContext", str4);
        }
        java.lang.String m80972xc738b2f5 = this.F4.mo81005xdc5215a6().m80972xc738b2f5();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430 c19404xac949430 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430.class);
        java.lang.String str6 = m80972xc738b2f5 != null ? m80972xc738b2f5 : "";
        boolean booleanValue = bool.booleanValue();
        c19404xac949430.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "searchQuery, query: " + query + ", hintText: " + str6 + ", addToKvHistory " + booleanValue + " cgiParams " + hashMap);
        c19404xac949430.V6(query, booleanValue, hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19389x16789445, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View view;
        android.view.View findViewById;
        android.view.View view2;
        super.onCreate(bundle);
        int i17 = -1;
        if (!na()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "applyTeachPageNewStyleSearchBarIfNeeded, not enabled");
        } else if (this.J4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "applyTeachPageNewStyleSearchBarIfNeeded, skip due to forceShowNightMode");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "applyTeachPageNewStyleSearchBarIfNeeded, applying new style search bar");
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22484x63a3bec1 c22484x63a3bec1 = this.F4;
            if (c22484x63a3bec1 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "applyTeachPageNewStyleSearchBarIfNeeded, searchView null");
            } else {
                android.view.ViewGroup.LayoutParams layoutParams = c22484x63a3bec1.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i65.a.b(this, 64);
                    c22484x63a3bec1.setLayoutParams(layoutParams);
                }
                android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f568869oc0);
                if (findViewById2 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                    int b17 = i65.a.b(this, 64);
                    if (layoutParams2 != null && layoutParams2.height != b17) {
                        layoutParams2.height = b17;
                        findViewById2.setLayoutParams(layoutParams2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "applyTeachPageNewStyleSearchBarIfNeeded, title_container height -> 64dp");
                    }
                }
                android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.pil);
                if (findViewById3 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams3 = findViewById3.getLayoutParams();
                    if (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams) {
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
                        int b18 = i65.a.b(this, 64);
                        if (marginLayoutParams.topMargin != b18) {
                            marginLayoutParams.topMargin = b18;
                            findViewById3.setLayoutParams(marginLayoutParams);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "applyTeachPageNewStyleSearchBarIfNeeded, webview_keyboard_ll marginTop -> 64dp");
                        }
                    }
                }
                android.view.View view3 = c22484x63a3bec1.webActionbarSearchviewContainer;
                if (view3 != null) {
                    view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), i65.a.b(this, 8), view3.getPaddingBottom());
                }
                com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 mo81005xdc5215a6 = c22484x63a3bec1.mo81005xdc5215a6();
                if (mo81005xdc5215a6 != null) {
                    android.view.View m80976x4d774800 = mo81005xdc5215a6.m80976x4d774800();
                    if (m80976x4d774800 != null) {
                        m80976x4d774800.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563386d54);
                        android.view.ViewGroup.LayoutParams layoutParams4 = m80976x4d774800.getLayoutParams();
                        if (layoutParams4 != null) {
                            layoutParams4.height = i65.a.b(this, 48);
                            m80976x4d774800.setLayoutParams(layoutParams4);
                        }
                    }
                    boolean C = com.p314xaae8f345.mm.ui.bk.C();
                    android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.ggf);
                    if (findViewById4 != null) {
                        findViewById4.setBackgroundColor(C ? -15132391 : -1);
                    }
                    android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.aa8);
                    if (findViewById5 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) {
                        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById5).m82040x7541828(C ? -855638017 : -452984832);
                    }
                    android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.aaf);
                    if (textView != null) {
                        textView.setTextColor(C ? -855638017 : -452984832);
                    }
                    android.view.View findViewById6 = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.f563856bc) : null;
                    if (findViewById6 != null) {
                        findViewById6.setPadding(findViewById6.getPaddingLeft(), findViewById6.getPaddingTop(), 0, findViewById6.getPaddingBottom());
                    }
                    android.view.ViewGroup.LayoutParams layoutParams5 = mo81005xdc5215a6.getLayoutParams();
                    if (layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams) {
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams5;
                        marginLayoutParams2.setMarginStart(i65.a.b(this, 12));
                        marginLayoutParams2.setMarginEnd(0);
                        mo81005xdc5215a6.setLayoutParams(marginLayoutParams2);
                    }
                    if (mo81005xdc5215a6.m80966xdb574fcd() != null) {
                        android.widget.EditText m80966xdb574fcd = mo81005xdc5215a6.m80966xdb574fcd();
                        m80966xdb574fcd.setTextSize(2, 17.0f);
                        m80966xdb574fcd.setTextColor(C ? -855638017 : -452984832);
                        m80966xdb574fcd.setHintTextColor(C ? -2130706433 : Integer.MIN_VALUE);
                        m80966xdb574fcd.setPadding(i65.a.b(this, 12), m80966xdb574fcd.getPaddingTop(), m80966xdb574fcd.getPaddingRight(), m80966xdb574fcd.getPaddingBottom());
                    }
                    if (mo81005xdc5215a6.m80966xdb574fcd() != null && (view2 = (android.view.View) mo81005xdc5215a6.m80966xdb574fcd().getParent()) != null) {
                        android.view.ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
                        if (layoutParams6 instanceof android.view.ViewGroup.MarginLayoutParams) {
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) layoutParams6;
                            marginLayoutParams3.setMarginEnd(i65.a.b(this, 12));
                            view2.setLayoutParams(marginLayoutParams3);
                        }
                    }
                    android.view.View m80973xc3e0a140 = mo81005xdc5215a6.m80973xc3e0a140();
                    if (m80973xc3e0a140 instanceof android.widget.TextView) {
                        android.widget.TextView textView2 = (android.widget.TextView) m80973xc3e0a140;
                        android.view.ViewGroup.LayoutParams layoutParams7 = textView2.getLayoutParams();
                        layoutParams7.width = i65.a.b(this, 52);
                        layoutParams7.height = i65.a.b(this, 32);
                        if (layoutParams7 instanceof android.view.ViewGroup.MarginLayoutParams) {
                            ((android.view.ViewGroup.MarginLayoutParams) layoutParams7).setMarginEnd(i65.a.b(this, 8));
                        }
                        textView2.setLayoutParams(layoutParams7);
                        textView2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563385d53);
                        textView2.setMinWidth(0);
                        textView2.setPadding(0, 0, 0, 0);
                    }
                    if (mo81005xdc5215a6.m80966xdb574fcd() != null && (view = (android.view.View) mo81005xdc5215a6.m80966xdb574fcd().getParent()) != null && (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.rfy)) != null) {
                        findViewById.setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, C ? -14671840 : -526345}));
                    }
                }
            }
        }
        if (this.f265789m4) {
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 mo81005xdc5215a62 = this.F4.mo81005xdc5215a6();
            if (mo81005xdc5215a62 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "initFinderCameraButtonIfNeeded, ftsEditText is null");
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(this);
                this.f265861g5 = c22699x3dcdb352;
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80029x425e227d);
                this.f265861g5.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                this.f265861g5.setContentDescription("camera");
                if (na()) {
                    int b19 = i65.a.b(this, 20);
                    int b27 = i65.a.b(this, 16);
                    android.widget.LinearLayout.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(b19, b19);
                    layoutParams8.gravity = 16;
                    layoutParams8.setMarginEnd(b27);
                    this.f265861g5.setLayoutParams(layoutParams8);
                    this.f265861g5.setPadding(0, 0, 0, 0);
                } else {
                    int b28 = i65.a.b(this, 24);
                    int b29 = i65.a.b(this, 8);
                    int b37 = i65.a.b(this, 8);
                    android.widget.LinearLayout.LayoutParams layoutParams9 = new android.widget.LinearLayout.LayoutParams(b28 + (b29 * 2), -1);
                    layoutParams9.setMarginEnd(b37);
                    this.f265861g5.setLayoutParams(layoutParams9);
                    this.f265861g5.setPadding(b29, b29, b29, b29);
                }
                android.widget.ImageButton m80965xaaf4ce45 = mo81005xdc5215a62.m80965xaaf4ce45();
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) m80965xaaf4ce45.getParent();
                int i18 = 0;
                while (true) {
                    if (i18 >= viewGroup.getChildCount()) {
                        break;
                    }
                    if (viewGroup.getChildAt(i18) == m80965xaaf4ce45) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
                if (i17 >= 0) {
                    viewGroup.addView(this.f265861g5, i17);
                } else {
                    viewGroup.addView(this.f265861g5);
                }
                this.f265861g5.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P9()) ? 0 : 8);
                this.f265861g5.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI$$a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view4) {
                        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5.f265857h5;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5 activityC19396xdd9ccea5 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5.this;
                        activityC19396xdd9ccea5.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view4);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC19396xdd9ccea5, array);
                        activityC19396xdd9ccea5.G9(vu4.a.I, vu4.b.F);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, activityC19396xdd9ccea5.B3);
                        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.String.valueOf(activityC19396xdd9ccea5.K4));
                        activityC19396xdd9ccea5.F9(hashMap, activityC19396xdd9ccea5.f265861g5.getContext());
                        yj0.a.h(activityC19396xdd9ccea5, "com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                G9(vu4.a.f521772f, vu4.b.F);
                boolean C2 = com.p314xaae8f345.mm.ui.bk.C();
                this.f265861g5.m82040x7541828(C2 ? -855638017 : -452984832);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "initFinderCameraButtonIfNeeded, camera button added for scene: " + this.K4 + ", systemDark=" + C2);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "initFinderCameraButtonIfNeeded, not enabled for scene: " + this.K4);
        }
        if (this.K3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "preLoadFlutterEngine");
            ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Zi();
        }
        if (this.M3) {
            getWindow().setCallback(null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19389x16789445, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19389x16789445, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        pa();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.tencent.mm.ui.MMActivity, com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        ?? w96;
        int i17;
        if (this.K3) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            this.f265860f5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430.class)).f266174e;
        } else {
            this.f265860f5 = this.f265348f;
        }
        super.onStart();
        if (!this.M3 || this.f265859e5.booleanValue()) {
            return;
        }
        this.f265859e5 = java.lang.Boolean.TRUE;
        java.lang.String stringExtra = getIntent().getStringExtra("ftsrealurl");
        if (stringExtra == null || android.text.TextUtils.isEmpty(stringExtra)) {
            w96 = w9();
        } else {
            w96 = new java.util.HashMap();
            android.net.Uri parse = android.net.Uri.parse(stringExtra);
            for (java.lang.String str : parse.getQueryParameterNames()) {
                w96.put(str, parse.getQueryParameter(str));
            }
        }
        java.lang.String str2 = w96.get("referer") instanceof java.lang.String ? (java.lang.String) w96.get("referer") : "";
        java.lang.String stringExtra2 = getIntent().getStringExtra("ftsQuery");
        int i18 = this.K4;
        if (i18 != 1001) {
            if (i18 == 1014) {
                i17 = 92;
            } else if (i18 != 1022) {
                i17 = i18 != 1028 ? 0 : 134;
            }
            int i19 = i17;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("flutterSearchDirectlyAddToKvHistory", java.lang.Boolean.FALSE);
            oa(i19, stringExtra2, str2, "", "", "", hashMap);
        }
        i17 = 76;
        int i192 = i17;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("flutterSearchDirectlyAddToKvHistory", java.lang.Boolean.FALSE);
        oa(i192, stringExtra2, str2, "", "", "", hashMap2);
    }

    public final void pa() {
        if (na() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P9())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "syncCancelBtnVisibilityForNewStyle, query empty, hide cancel btn");
            this.F4.mo81011x2a82112(8);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864
    public android.view.View r9() {
        if (this.K3) {
            return this.f265860f5;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        this.f265858d5 = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("KNativeTeach", false));
        this.M3 = getIntent().getBooleanExtra("KHalfScreenSearchUseFlutter", false);
        this.K3 = getIntent().getBooleanExtra("KSearchUseFlutter", false) || this.M3;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f265858d5.booleanValue() ? "yes" : "no";
        objArr[1] = this.K3 ? "yes" : "no";
        objArr[2] = this.M3 ? "yes" : "no";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MMFTSSearchTabWebViewUI", "superImportUIComponents, isOpenNativeTeach: %s, isUseFlutter: %s, isHalfScreenFlutter: %s", objArr);
        if (this.f265858d5.booleanValue()) {
            hashSet.add(rx4.h2.class);
            hashSet.add(rx4.e0.class);
            hashSet.add(rx4.u0.class);
            hashSet.add(rx4.k0.class);
            hashSet.add(rx4.s.class);
        }
        if (this.K3) {
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430.class);
        }
    }
}
