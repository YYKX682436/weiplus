package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class ld {

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.Map f267182s = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f267186d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f267187e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.m3 f267188f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd f267189g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f267190h;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f267192j;

    /* renamed from: a, reason: collision with root package name */
    public boolean f267183a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f267184b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f267185c = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f267191i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    public zq1.v f267193k = null;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f267194l = null;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f267195m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f267196n = true;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f267197o = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f267198p = false;

    /* renamed from: q, reason: collision with root package name */
    public long f267199q = android.os.SystemClock.elapsedRealtime();

    /* renamed from: r, reason: collision with root package name */
    public int f267200r = -1;

    public ld(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        this.f267192j = null;
        this.f267187e = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f267188f = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.m3(viewOnCreateContextMenuListenerC19337x37f3384d);
        if (this.f267192j == null && k()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19346xdeeaf4e7 c19346xdeeaf4e7 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19346xdeeaf4e7(this);
            this.f267192j = c19346xdeeaf4e7;
            c19346xdeeaf4e7.mo48813x58998cd();
        }
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, android.view.MotionEvent motionEvent, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59;
        ldVar.getClass();
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.f265377p0 == null || (c22633x83752a59 = viewOnCreateContextMenuListenerC19337x37f3384d.f265348f) == null) {
            return;
        }
        int[] iArr = new int[2];
        c22633x83752a59.getLocationOnScreen(iArr);
        int rawX = ((int) motionEvent.getRawX()) - iArr[0];
        int rawY = ((int) motionEvent.getRawY()) - iArr[1];
        float m81401x1f106092 = c22633x83752a59.m81401x1f106092();
        if (m81401x1f106092 != 0.0f) {
            nw4.n nVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265377p0;
            float f17 = rawX / m81401x1f106092;
            float f18 = rawY / m81401x1f106092;
            if (!nVar.f422428i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "sendFakeImmersiveUIStyleTopInsetChanged fail, not ready");
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("x", java.lang.String.valueOf(f17));
            hashMap.put("y", java.lang.String.valueOf(f18));
            hashMap.put("action", str);
            nVar.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("onActionBarClickEventInImmersiveMode", hashMap, nVar.f422436q, nVar.f422437r) + ")", null);
        }
    }

    public static void p(android.view.View view, com.p314xaae8f345.mm.ui.ga gaVar) {
        android.view.View j17 = gaVar.G.j();
        if (j17 instanceof android.widget.LinearLayout) {
            ((android.widget.LinearLayout) j17).addView(view);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.weight = 1.0f;
            view.setLayoutParams(layoutParams);
            return;
        }
        if (j17 instanceof android.widget.RelativeLayout) {
            ((android.widget.RelativeLayout) j17).addView(view);
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        r0.putBoolean("set_navigation_bar_color_titleAlphaAdjustment", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(r10, false));
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[Catch: Exception -> 0x00bf, TryCatch #1 {Exception -> 0x00bf, blocks: (B:31:0x007e, B:33:0x0086, B:38:0x0092, B:43:0x00a1, B:45:0x00aa, B:50:0x00b4), top: B:30:0x007e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r9, org.json.JSONObject r10, com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 r11) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld.b(java.lang.String, org.json.JSONObject, com.tencent.mm.protocal.JsapiPermissionWrapper):void");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.jd c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        android.os.Bundle bundle = (android.os.Bundle) ((java.util.HashMap) f267182s).get(f(str));
        if (bundle == null) {
            return null;
        }
        java.lang.String string = bundle.getString("key_brand_name");
        java.lang.String string2 = bundle.getString("key_brand_user_name");
        java.lang.String string3 = bundle.getString("key_bag_icon");
        java.lang.String string4 = bundle.getString("key_title");
        java.lang.String string5 = bundle.getString("key_cover");
        boolean z17 = bundle.getBoolean("key_show_menu_onfo", false);
        int i17 = bundle.getInt("key_item_show_type", -1);
        boolean z18 = bundle.getBoolean("key_disable_menu_header", false);
        java.lang.String string6 = bundle.getString("key_mp_vid", "");
        boolean z19 = bundle.getBoolean("key_disable_can_read_articel", false);
        boolean z27 = bundle.getBoolean("key_send_article_reading_btn_clicked", false);
        java.lang.String string7 = bundle.getString("key_biz_id", "");
        long j17 = bundle.getLong("key_idx", -1L);
        long j18 = bundle.getLong("key_mid", -1L);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.jd jdVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.jd();
        jdVar.f266406c = string3;
        jdVar.f266405b = string;
        jdVar.f266404a = string2;
        jdVar.f266409f = z17;
        jdVar.f266407d = string4;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string5)) {
            string3 = string5;
        }
        jdVar.f266408e = string3;
        jdVar.f266410g = i17;
        jdVar.f266411h = z18;
        jdVar.f266412i = string6;
        jdVar.f266414k = z19;
        jdVar.f266415l = z27;
        jdVar.f266413j = str;
        jdVar.f266416m = string7;
        jdVar.f266418o = j17;
        jdVar.f266417n = j18;
        return jdVar;
    }

    public int d() {
        if (this.f267187e == null) {
            return 0;
        }
        return j() ? this.f267187e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aam) : this.f267187e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aae);
    }

    public final java.lang.String e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(parse.getQueryParameter("idx"), 0);
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(parse.getQueryParameter("mid"), 0L);
            this.f267200r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(parse.getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 0);
            return V + "#" + P;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final java.lang.String f(java.lang.String str) {
        if (str == null || gm0.j1.s(zq1.a0.class) == null || !((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(str)) {
            return str;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.n(str);
    }

    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f267187e;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null) {
            return;
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.mo78514x143f1b92().D0(0);
        o();
        android.view.View view = this.f267194l;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "hideTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "hideTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        zq1.v vVar = this.f267193k;
        if (vVar != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h) vVar).b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            r6 = this;
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r6.f267187e
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "MicroMsg.WebViewUIStyleHelper"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto Le
        Lb:
            r0 = r3
            goto L77
        Le:
            boolean r0 = r0.f7()
            if (r0 == 0) goto L15
            goto Lb
        L15:
            boolean r0 = r6.f267184b
            if (r0 == 0) goto L1a
            goto Lb
        L1a:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r6.f267187e
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L76
            java.lang.String r4 = "disable_light_actionbar_style"
            boolean r4 = r0.getBooleanExtra(r4, r2)
            if (r4 == 0) goto L30
            java.lang.String r0 = "checkDisableLightActionbarStyle, KDisableLightActionbarStyle is true"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            goto Lb
        L30:
            java.lang.String r4 = "status_bar_style"
            java.lang.String r4 = r0.getStringExtra(r4)
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r5 != 0) goto L4b
            java.lang.String r5 = "black"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L4b
            java.lang.String r0 = "checkDisableLightActionbarStyle, customized by KStatusBarStyle"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            goto Lb
        L4b:
            java.lang.String r4 = "customize_status_bar_color"
            int r4 = r0.getIntExtra(r4, r2)
            if (r4 == 0) goto L59
            java.lang.String r0 = "checkDisableLightActionbarStyle, customized by KCustomizeStatusBarColor"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            goto Lb
        L59:
            java.lang.String r4 = "open_custom_style_url"
            boolean r4 = r0.getBooleanExtra(r4, r2)
            if (r4 == 0) goto L67
            java.lang.String r0 = "checkDisableLightActionbarStyle, customized by KOpenCustomStyleUrl"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            goto Lb
        L67:
            java.lang.String r4 = "show_full_screen"
            boolean r0 = r0.getBooleanExtra(r4, r2)
            if (r0 == 0) goto L76
            java.lang.String r0 = "checkDisableLightActionbarStyle, webview is fullscreen"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            goto Lb
        L76:
            r0 = r2
        L77:
            if (r0 == 0) goto L7c
            r6.f267183a = r3
            goto L7e
        L7c:
            r6.f267183a = r2
        L7e:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r6.f267187e
            boolean r2 = r6.f267183a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "initNewWebViewUIStyleParams, webViewUI#%s, disableLightActionbarStyle:%b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld.h():void");
    }

    public final boolean i(android.os.Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("key_show_live_top_bar", true)) {
            return false;
        }
        java.lang.String string = bundle.getString("key_url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) || gm0.j1.s(zq1.a0.class) == null || !((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(string) || !k()) {
            return false;
        }
        java.lang.String string2 = bundle.getString("key_brand_user_name");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a.o(string2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00be, code lost:
    
        if (r2.matcher(r0).find() != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j() {
        /*
            r8 = this;
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r8.f267187e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r8.f267190h
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r2 == 0) goto L14
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r8.f267187e
            java.lang.String r0 = r0.F7()
        L14:
            java.lang.Boolean r2 = hy4.p0.f367721d
            if (r2 == 0) goto L28
            java.lang.String r2 = hy4.p0.f367720c
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r0, r2)
            if (r2 == 0) goto L28
            java.lang.Boolean r0 = hy4.p0.f367721d
            boolean r0 = r0.booleanValue()
            goto Lcb
        L28:
            hy4.p0.f367720c = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "^(http|https)://"
            r2.<init>(r3)
            r4 = 2131769611(0x7f10390b, float:1.9170502E38)
            java.lang.String r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(r4)
            r2.append(r5)
            java.lang.String r5 = "/(s|mp/author|mp/appmsg/show)"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r5 = 2
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r5)
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r2 = r2.find()
            r6 = 1
            if (r2 == 0) goto L55
            goto Lc0
        L55:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "^(http|https)://(sh.|hk.|sz.)?"
            r2.<init>(r7)
            r7 = 2131769613(0x7f10390d, float:1.9170506E38)
            java.lang.String r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(r7)
            r2.append(r7)
            java.lang.String r7 = "/connect/(confirm|oauth2/(authorize|explorer_authorize))"
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r5)
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r2 = r2.find()
            if (r2 == 0) goto L7e
            goto Lc0
        L7e:
            java.util.regex.Pattern r2 = hy4.p0.f367719b
            if (r2 != 0) goto Lb2
            j62.e r2 = j62.e.g()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(r4)
            r5.append(r3)
            java.lang.String r3 = "/mp/(readtemplate\\?t=scanlogin/index_tmpl|scanlogin\\?action=index|relatedarticle\\?action=page|aboutbiz|infringement|qa)"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r4 = "clicfg_webview_mp_host_list"
            java.lang.String r2 = r2.a(r4, r3, r6, r6)
            java.lang.Object[] r3 = new java.lang.Object[]{r2}
            java.lang.String r4 = "MicroMsg.WebViewUIUtil"
            java.lang.String r5 = "mpHosts=:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            hy4.p0.f367719b = r2
        Lb2:
            java.util.regex.Pattern r2 = hy4.p0.f367719b
            if (r2 == 0) goto Lc1
            java.util.regex.Matcher r0 = r2.matcher(r0)
            boolean r0 = r0.find()
            if (r0 == 0) goto Lc1
        Lc0:
            r1 = r6
        Lc1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            hy4.p0.f367721d = r0
            boolean r0 = r0.booleanValue()
        Lcb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld.j():boolean");
    }

    public boolean k() {
        if (gm0.j1.s(zq1.a0.class) != null) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270741l).mo141623x754a37bb()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f267187e;
        if (viewOnCreateContextMenuListenerC19337x37f3384d != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r3 r3Var = viewOnCreateContextMenuListenerC19337x37f3384d.f265403x2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.j3 j3Var = r3Var.f268339b;
            if (!(j3Var.f266385a || j3Var.f266387c) && !r3Var.f268340c) {
                this.f267187e.mo64405x4dab7448(d());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d2 = this.f267187e;
        if (viewOnCreateContextMenuListenerC19337x37f3384d2 != null) {
            android.view.View findViewById = viewOnCreateContextMenuListenerC19337x37f3384d2.findViewById(com.p314xaae8f345.mm.R.id.pim);
            if (findViewById != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.j3 j3Var2 = this.f267187e.f265403x2.f268339b;
                if (!(j3Var2.f266385a || j3Var2.f266387c) && !this.f267188f.f267212b) {
                    findViewById.setBackgroundColor(d());
                }
            }
            int color = this.f267187e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aan);
            android.view.View findViewById2 = this.f267187e.findViewById(com.p314xaae8f345.mm.R.id.pip);
            if (findViewById2 != null && (findViewById2 instanceof android.widget.TextView)) {
                ((android.widget.TextView) findViewById2).setTextColor(color);
            }
        }
        m();
    }

    public void m() {
        if (this.f267187e == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd = this.f267189g;
        if ((c19231x33dc2abd.f263275e == null || c19231x33dc2abd.c().f305779o.mo3195x754a37bb() == null || c19231x33dc2abd.c().f305779o.mo3195x754a37bb() == cw4.q0.f305802d) ? false : true) {
            this.f267187e.mo78530x8b45058f();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f267187e;
        if (viewOnCreateContextMenuListenerC19337x37f3384d.M2) {
            viewOnCreateContextMenuListenerC19337x37f3384d.mo78530x8b45058f();
        } else {
            viewOnCreateContextMenuListenerC19337x37f3384d.m78599xdf056fb4();
        }
    }

    public void n() {
        android.os.Bundle bundle = (android.os.Bundle) ((java.util.HashMap) f267182s).get(f(this.f267190h));
        if (bundle == null || this.f267187e == null) {
            g();
        } else if (bundle.getBoolean("key_current_info_show") || i(bundle)) {
            q();
        } else {
            g();
        }
    }

    public final void o() {
        android.widget.TextView m78517x1162058e = this.f267187e.m78517x1162058e();
        java.lang.String charSequence = (m78517x1162058e == null || m78517x1162058e.getText() == null) ? null : m78517x1162058e.getText().toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence)) {
            return;
        }
        this.f267187e.mo78514x143f1b92().A0(charSequence);
    }

    public void q() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d;
        int i17;
        java.lang.String str;
        android.os.Bundle bundle = (android.os.Bundle) ((java.util.HashMap) f267182s).get(f(this.f267190h));
        if (bundle == null || (viewOnCreateContextMenuListenerC19337x37f3384d = this.f267187e) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUIStyleHelper", "showTopBar not ready %s", this.f267190h);
            return;
        }
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265342d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIStyleHelper", "fixedTitle not show topbar");
            return;
        }
        if (!this.f267196n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIStyleHelper", "showTopBar canShowShowTopBarLayout false and not show");
            return;
        }
        if (this.f267198p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIStyleHelper", "trans help button shown, do not show topbar");
            return;
        }
        android.view.View view = this.f267197o;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f267187e.mo78514x143f1b92().D0(8);
        this.f267187e.mo78514x143f1b92().N.setVisibility(8);
        if (this.f267194l == null) {
            android.view.View inflate = this.f267187e.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_4, (android.view.ViewGroup) null);
            this.f267194l = inflate;
            this.f267195m = inflate.findViewById(com.p314xaae8f345.mm.R.id.m3c);
            p(this.f267194l, this.f267187e.mo78514x143f1b92());
        }
        android.widget.TextView textView = (android.widget.TextView) this.f267194l.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        android.view.View findViewById = this.f267194l.findViewById(com.p314xaae8f345.mm.R.id.pix);
        android.view.View findViewById2 = this.f267194l.findViewById(com.p314xaae8f345.mm.R.id.piw);
        android.view.View findViewById3 = this.f267194l.findViewById(com.p314xaae8f345.mm.R.id.piy);
        android.view.View findViewById4 = this.f267194l.findViewById(com.p314xaae8f345.mm.R.id.ifp);
        java.lang.String string = bundle.getString("key_brand_name");
        java.lang.String string2 = bundle.getString("key_brand_user_name");
        java.lang.String i18 = gm0.j1.s(zq1.a0.class) != null ? ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).i(string2) : "";
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i18) && i(bundle);
        boolean z18 = bundle.getBoolean("key_current_info_show");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIStyleHelper", "showTopBar userName:%s, nickName:%s, isLiveNow:%b, show %b", string2, string, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUIStyleHelper", "showTopBar invalid param, userName %s, nickName %s", string2, string);
            return;
        }
        this.f267187e.mo54450xbf7c1df6("");
        android.view.View view2 = this.f267194l;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i19 = z17 ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        java.lang.String str2 = i18;
        yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i27 = z17 ? 8 : 4;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int b17 = i65.a.b(this.f267187e, 4);
        int intExtra = this.f267187e.getIntent().getIntExtra(com.p314xaae8f345.mm.ui.w2.f292726f, 0);
        if (!z17 || z18) {
            i17 = 1;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d2 = this.f267187e;
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(viewOnCreateContextMenuListenerC19337x37f3384d2, string, textSize));
            findViewById2.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            textView.setTextSize(1, 17.0f);
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            int i28 = b17 * 2;
            findViewById2.setPadding(i28, 0, i28, 0);
            int b18 = i65.a.b(this.f267187e, 10);
            fq1.e eVar = fq1.e.f347040a;
            android.view.View view3 = this.f267195m;
            int i29 = b18 * 2;
            if (view3 != null) {
                android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                layoutParams.width = b18;
                layoutParams.height = i29;
                view3.setLayoutParams(layoutParams);
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(findViewById);
        } else {
            textView.setText(this.f267187e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aku));
            findViewById2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.baz);
            i17 = 1;
            textView.setTextSize(1, 13.0f);
            com.p314xaae8f345.mm.ui.bk.t0(textView.getPaint());
            int i37 = b17 * 3;
            findViewById2.setPadding(i37, 0, i37, 0);
            int i38 = b17 * 2;
            fq1.e eVar2 = fq1.e.f347040a;
            android.view.View view4 = this.f267195m;
            int i39 = i38 * 2;
            if (view4 != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                layoutParams2.width = i38;
                layoutParams2.height = i39;
                view4.setLayoutParams(layoutParams2);
            }
        }
        java.lang.String string3 = bundle.getString("key_url");
        if (z17) {
            str = string2;
            int j17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(str);
            java.lang.String e17 = e(string3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[8];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[i17] = str;
            objArr[2] = java.lang.Integer.valueOf(this.f267200r);
            objArr[3] = java.lang.Integer.valueOf(intExtra);
            objArr[4] = str2;
            objArr[5] = java.lang.Integer.valueOf(j17);
            objArr[6] = java.lang.Integer.valueOf(z18 ? 3 : 2);
            objArr[7] = e17;
            g0Var.d(23044, objArr);
        } else {
            str = string2;
        }
        if (z17 && !z18) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById, "living_label_webview_title");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById, 40, 26236);
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            arrayMap.put("live_id", "");
            arrayMap.put("finder_username", "");
            arrayMap.put("feed_id", "");
            arrayMap.put("comment_scene", "");
            arrayMap.put("wx_username", str);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(findViewById, arrayMap);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(findViewById, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.gd(this, str2));
        }
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.id(this, z17, str, intExtra, str2, z18, string3));
        com.p314xaae8f345.mm.ui.p2740x696c9db.d8.a(findViewById);
    }

    public final void r(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIStyleHelper", "startCheck fail bizUserName is null");
            return;
        }
        if (this.f267193k == null) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            this.f267193k = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h(9);
        }
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h) this.f267193k).a(str);
    }

    public final void s(float f17) {
        if (this.f267185c != f17) {
            this.f267185c = f17;
            nw4.n nVar = this.f267187e.f265377p0;
            if (!nVar.f422428i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "sendFakeImmersiveUIStyleTopInsetChanged fail, not ready");
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("top", java.lang.String.valueOf(f17));
            nVar.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("fakeImmersiveUIStyleTopInsetChanged", hashMap, nVar.f422436q, nVar.f422437r) + ")", null);
        }
    }
}
