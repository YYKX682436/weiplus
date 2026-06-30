package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class WxaLiteAppFragment extends com.tencent.liteapp.ui.WxaLiteAppBaseFragment implements com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback {
    public static final /* synthetic */ int Q = 0;
    public java.lang.String E;
    public java.lang.String[] F;
    public java.lang.String[] G;
    public com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback H;
    public com.tencent.liteapp.report.WxaLiteAppStartReport K;
    public com.tencent.mm.plugin.lite.LiteAppCenter.PageConfig L;
    public md.h M;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo f46065r;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f46067t;

    /* renamed from: p, reason: collision with root package name */
    public long f46063p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f46064q = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f46066s = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f46068u = -1;

    /* renamed from: v, reason: collision with root package name */
    public boolean f46069v = false;

    /* renamed from: w, reason: collision with root package name */
    public float f46070w = 1.0f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f46071x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f46072y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f46073z = false;
    public boolean A = false;
    public boolean B = true;
    public int C = -1;
    public java.lang.String D = "";
    public com.tencent.liteapp.gen.LiteAppReporter I = null;

    /* renamed from: J, reason: collision with root package name */
    public boolean f46062J = false;
    public final md.g N = new com.tencent.liteapp.ui.r(this);
    public long P = -1;

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void closeWindow(android.content.Intent intent) {
        androidx.activity.k activity = getActivity();
        if (activity instanceof com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback) {
            ((com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback) activity).closeWindow(intent);
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void enterFullScreen() {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void exitFullScreen() {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public long getAppUuid() {
        return this.f46063p;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public android.content.Context getCurrentContext() {
        return super.getContext();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public long getDataUuid() {
        return this.P;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public android.os.Bundle getExtraData() {
        if (getActivity().getIntent().hasExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA)) {
            return getActivity().getIntent().getBundleExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        }
        return null;
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseFragment, mx5.b
    /* renamed from: getFlutterEngineId */
    public int getF45967f() {
        return this.f46030o;
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseFragment, mx5.b
    public java.lang.String getFlutterViewId() {
        kd.c.a("WxaLiteAp.WxaLiteAppFragment", "getFlutterViewId %s", java.lang.Long.valueOf(this.f46064q));
        return java.lang.String.valueOf(this.f46064q);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseFragment, mx5.b
    public java.lang.String getFlutterViewName() {
        return java.lang.String.valueOf(this.f46066s);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseFragment, mx5.b
    /* renamed from: getFlutterViewParams */
    public java.util.Map getE() {
        if (this.f46065r == null) {
            super.getE();
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.Long.valueOf(this.f46065r.appUuid));
        hashMap.put("appId", this.f46024f.appId);
        hashMap.put("appPtr", java.lang.Long.valueOf(this.f46065r.appPtr));
        hashMap.put("pageViewId", java.lang.Long.valueOf(this.f46065r.pageId));
        hashMap.put("basePath", this.f46065r.basePath);
        hashMap.put("pageRenderPtr", java.lang.Long.valueOf(this.f46065r.renderId));
        hashMap.put("flags", java.lang.Integer.valueOf(this.f46065r.flags));
        hashMap.put("startTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return hashMap;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo getSystemInfo(int i17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo systemInfo = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback.getSystemInfo(this.C);
        systemInfo.appId = this.f46026h;
        systemInfo.isHalfScreen = true;
        return systemInfo;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public boolean hasCutOut() {
        return false;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void hideKeyboard() {
        androidx.activity.k activity = getActivity();
        if (activity instanceof com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback) {
            ((com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback) activity).hideKeyboard();
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public boolean isDarkMode() {
        return this.f46069v;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void keyboardEnable(boolean z17) {
    }

    public final void m0(com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport) {
        if (this.f46062J) {
            return;
        }
        this.f46062J = true;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = wxaLiteAppStartReport.I;
        if (liteAppReporter != null) {
            com.tencent.liteapp.report.WxaLiteAppStartReport.a(liteAppReporter, wxaLiteAppStartReport);
        }
        try {
            java.lang.String b17 = wxaLiteAppStartReport.b();
            kd.c.c("WxaLiteAp.WxaLiteAppFragment", "reportStartLiteApp %s", b17);
            com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback;
            if (iWxaLiteAppCallback != null) {
                iWxaLiteAppCallback.dataReporting("startLiteAppTimeLine", b17, wxaLiteAppStartReport.f45997d);
            }
        } catch (java.lang.Exception e17) {
            kd.c.b("WxaLiteAp.WxaLiteAppFragment", e17.toString(), new java.lang.Object[0]);
        }
    }

    public final void n0() {
        android.widget.FrameLayout frameLayout = this.f46067t;
        android.graphics.Point b17 = es.u.b(getContext());
        android.content.Context context = zc.c.f471339b;
        if (context == null) {
            kotlin.jvm.internal.o.o("appContext");
            throw null;
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int measuredWidth = frameLayout.getMeasuredWidth();
        int measuredHeight = frameLayout.getMeasuredHeight();
        float f17 = displayMetrics.density;
        this.C = this.f46071x ? com.tencent.mm.plugin.lite.LiteAppCenter.cacheNavigationBarHeight(getContext(), this.C, this.f46063p) : 0;
        float f18 = 48 * f17;
        boolean z17 = getResources().getConfiguration().orientation == 2;
        int e17 = md.n.e(getContext());
        if (!z17 || b17.x <= b17.y * 1.2d) {
            float f19 = e17 / f17;
            int i17 = this.f46068u;
            com.tencent.mm.plugin.lite.LiteAppCenter.setSafeAreaInsets(this.f46063p, 0.0f, f19, 0.0f, (i17 == 3 || i17 == 7) ? this.C / f17 : 0.0f, false);
        } else {
            com.tencent.mm.plugin.lite.LiteAppCenter.setSafeAreaInsets(this.f46063p, e17 / f17, 0.0f, this.C / f17, 0.0f, false);
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.setDisplayParams(this.f46063p, measuredWidth / f17, measuredHeight / f17, b17.x / f17, b17.y / f17, displayMetrics.densityDpi, f17, f18 / f17, 0.0f, this.C / f17);
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "updateLvCppDisplayParams SetDisplayParams w=%d h=%d screen=%d,%d densityDpi=%d density=%f navigationBarHeight=%d", java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight), java.lang.Integer.valueOf(b17.x), java.lang.Integer.valueOf(b17.y), java.lang.Integer.valueOf(displayMetrics.densityDpi), java.lang.Float.valueOf(displayMetrics.density), java.lang.Integer.valueOf(this.C));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void navigateBack(boolean z17) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.liteapp.ui.v(this));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckBaseLibSumFail(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteAp.WxaLiteAppFragment", "Check BaseLib Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckSumFail(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteAp.WxaLiteAppFragment", "Check Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean isCurrentDarkMode = com.tencent.mm.plugin.lite.LiteAppCenter.isCurrentDarkMode();
        if (isCurrentDarkMode != this.f46069v) {
            kd.c.c("WxaLiteAp.WxaLiteAppFragment", "DarkMode change %b", java.lang.Boolean.valueOf(isCurrentDarkMode));
            this.f46069v = isCurrentDarkMode;
            com.tencent.mm.plugin.lite.LiteAppCenter.updateDarkMode(isCurrentDarkMode);
        }
        float f17 = configuration.fontScale;
        if (f17 == this.f46070w || !com.tencent.mm.plugin.lite.LiteAppCenter.fontScaleFollowSystem) {
            return;
        }
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "fontScale change %b", java.lang.Float.valueOf(f17));
        float f18 = configuration.fontScale;
        this.f46070w = f18;
        com.tencent.mm.plugin.lite.LiteAppCenter.updateFontScale(f18);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        android.os.Bundle bundleExtra = getActivity().getIntent().hasExtra("bundle") ? getActivity().getIntent().getBundleExtra("bundle") : null;
        if (getArguments().containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP)) {
            this.f46024f = (com.tencent.liteapp.storage.WxaLiteAppInfo) getArguments().getParcelable(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP);
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "getWxaLiteAppInfo from Arguments KEY_LITE_APP", new java.lang.Object[0]);
        } else {
            if (getArguments().containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP_ID)) {
                l0(getArguments().getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP_ID), "");
                throw null;
            }
            if (getActivity().getIntent().hasExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP)) {
                this.f46024f = (com.tencent.liteapp.storage.WxaLiteAppInfo) getActivity().getIntent().getParcelableExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP);
                kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "getWxaLiteAppInfo from Activity Intent KEY_LITE_APP", new java.lang.Object[0]);
            } else {
                if (getActivity().getIntent().hasExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP_ID)) {
                    l0(getActivity().getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP_ID), "");
                    throw null;
                }
                kd.c.e("WxaLiteAp.WxaLiteAppBaseFragment", "Not contains app info.", new java.lang.Object[0]);
            }
        }
        if (getArguments().containsKey("query")) {
            this.f46028m = getArguments().getString("query");
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "mQuery from Arguments KEY_QUERY", new java.lang.Object[0]);
        } else if (bundleExtra == null || !bundleExtra.containsKey("query")) {
            kd.c.e("WxaLiteAp.WxaLiteAppBaseFragment", "Not contains query info.", new java.lang.Object[0]);
        } else {
            this.f46028m = bundleExtra.getString("query");
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "mQuery from Activity Intent KEY_QUERY", new java.lang.Object[0]);
        }
        if (getArguments().containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE)) {
            this.f46027i = getArguments().getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "mPage from Arguments KEY_PAGE", new java.lang.Object[0]);
        } else if (getActivity().getIntent().hasExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE)) {
            this.f46027i = getActivity().getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "mPage from Activity Intent KEY_PAGE", new java.lang.Object[0]);
        } else {
            kd.c.e("WxaLiteAp.WxaLiteAppBaseFragment", "Not contains page info.", new java.lang.Object[0]);
        }
        if (getArguments().containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            this.f46029n = getArguments().getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "mSessionId from Arguments KEY_SESSION_ID", new java.lang.Object[0]);
        } else if (getActivity().getIntent().hasExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            this.f46029n = getActivity().getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "mSessionId from Activity Intent KEY_SESSION_ID", new java.lang.Object[0]);
        } else {
            kd.c.e("WxaLiteAp.WxaLiteAppBaseFragment", "Not contains sessionId info.", new java.lang.Object[0]);
        }
        if (bundleExtra != null && bundleExtra.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_NEW_TAB)) {
            bundleExtra.getBoolean(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_NEW_TAB, false);
        }
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo = this.f46024f;
        com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo queryPreloadAppInfo = com.tencent.mm.plugin.lite.LiteAppCenter.queryPreloadAppInfo(wxaLiteAppInfo.appId, this.f46027i, wxaLiteAppInfo.path);
        long j17 = queryPreloadAppInfo.appUuid;
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "queryPreloadAppUuid: %d", java.lang.Long.valueOf(j17));
        if (j17 == 0) {
            this.f46063p = com.tencent.mm.plugin.lite.LiteAppCenter.genAppUuid();
            java.lang.String str = this.f46029n;
            this.f46029n = (str == null || str.isEmpty()) ? com.tencent.mm.plugin.lite.LiteAppCenter.genLiteAppSessionId() : this.f46029n;
        } else {
            this.f46063p = j17;
            this.f46030o = queryPreloadAppInfo.engineId;
            java.lang.String str2 = this.f46029n;
            this.f46029n = (str2 == null || str2.isEmpty()) ? queryPreloadAppInfo.sessionId : this.f46029n;
        }
        this.f46064q = this.f46063p;
        super.onCreate(bundle);
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "WxaLiteAppFragment onCreate mContentView: " + this.f46067t, new java.lang.Object[0]);
        android.widget.FrameLayout frameLayout = this.f46067t;
        if (frameLayout != null) {
            md.h c17 = md.f.c(frameLayout);
            this.M = c17;
            c17.a(this.N);
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCreateLitePageViewFinish(com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo) {
        this.f46065r = pageInfo;
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.K;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport2 = this.K;
        wxaLiteAppStartReport.E = currentTimeMillis - wxaLiteAppStartReport2.D;
        wxaLiteAppStartReport2.C = pageInfo.success;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport3 = this.K;
        wxaLiteAppStartReport2.F = currentTimeMillis2 - wxaLiteAppStartReport3.f46002i;
        wxaLiteAppStartReport3.f46016z = pageInfo.isPreload;
        if (wxaLiteAppStartReport3.G != 0) {
            m0(wxaLiteAppStartReport3);
        }
        java.util.Map e17 = getE();
        if (e17 != null) {
            java.util.HashMap hashMap = (java.util.HashMap) e17;
            if (hashMap.containsKey("appId")) {
                this.f46026h = java.lang.String.valueOf(hashMap.get("appId"));
            }
            if (hashMap.containsKey("appPtr")) {
                java.lang.Long.valueOf(hashMap.get("appPtr").toString()).longValue();
            }
            if (hashMap.containsKey("pageViewId")) {
                this.f46066s = java.lang.Long.valueOf(hashMap.get("pageViewId").toString()).longValue();
            }
            if (hashMap.containsKey("activityId")) {
                this.f46022d = hashMap.get("activityId").toString();
            }
            if (hashMap.containsKey("pageRenderPtr")) {
                java.lang.Long.valueOf(hashMap.get("pageRenderPtr").toString()).longValue();
            }
        }
        setFlags(pageInfo.flags);
        n0();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0206  */
    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(android.view.LayoutInflater r25, android.view.ViewGroup r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteapp.ui.WxaLiteAppFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        md.g gVar;
        super.onDestroy();
        com.tencent.mm.plugin.lite.LiteAppCenter.unsetUICallback(this.f46063p, this.H);
        com.tencent.mm.plugin.lite.LiteAppCenter.unsetReporter(this.f46063p);
        if (this.f46026h != null) {
            ld.d.f318046b.a().c(this.f46026h);
        }
        md.h hVar = this.M;
        if (hVar == null || (gVar = this.N) == null) {
            return;
        }
        hVar.f325694f.remove(gVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        java.lang.String str = this.f46028m;
        if (str != null && str.length() <= 307200) {
            bundle.putString("queryParam", this.f46028m);
        }
        if (!this.D.isEmpty() && this.D.length() <= 307200) {
            bundle.putString("referrerInfo", this.D);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str2 = this.f46028m;
        objArr[0] = str2;
        objArr[1] = java.lang.Integer.valueOf(str2 != null ? str2.length() : 0);
        objArr[2] = bundle.toString();
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "onSaveInstanceState query:%s len:%d bundle:%s", objArr);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onShowPageTimeStamp(long j17, com.tencent.mm.plugin.lite.LiteAppCenter.PageShowInfo pageShowInfo) {
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.K;
        if (wxaLiteAppStartReport != null) {
            wxaLiteAppStartReport.H = pageShowInfo;
            wxaLiteAppStartReport.G = pageShowInfo.timestamp - wxaLiteAppStartReport.f46002i;
            if (wxaLiteAppStartReport.F != 0) {
                m0(wxaLiteAppStartReport);
            }
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        com.tencent.mm.plugin.lite.LiteAppCenter.setLocale(java.util.Locale.getDefault().getLanguage(), java.util.Locale.getDefault().getCountry());
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void openApp() {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void openWebView(java.util.Map map) {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void rightGestureEvent(java.lang.String str, boolean z17) {
        java.lang.String str2 = z17 ? "gesture" : "backpress";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, str2);
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEvent(this.f46063p, java.lang.Integer.parseInt(str), "app.rightGesture", jSONObject);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setCanOverScroll(boolean z17) {
        this.B = z17;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setDragToClose(boolean z17) {
        this.A = z17;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setFlags(int i17) {
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "setFlags %d old=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f46068u));
        if (this.f46068u == i17) {
            return;
        }
        this.f46068u = i17;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setForbidRightGestureEnable(boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.String.valueOf(this.f46064q));
        hashMap.put("enable", java.lang.Boolean.valueOf(z17));
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.liteapp.ui.u(this, hashMap));
        this.f46073z = z17;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setIsPopGestureEnabled(boolean z17) {
        this.f46072y = z17;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setKeepScreenOn(boolean z17) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.liteapp.ui.w(this, z17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setPageOrientation(int i17) {
        androidx.activity.k activity = getActivity();
        if (activity instanceof com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback) {
            ((com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback) activity).setPageOrientation(i17);
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setScreenshotEnabled(boolean z17) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.liteapp.ui.x(this, z17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void showPage(com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo) {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void vibrateLong(long j17) {
        android.os.Vibrator vibrator = (android.os.Vibrator) getActivity().getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(j17);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void vibrateShort(long j17, int i17) {
        android.os.Vibrator vibrator = (android.os.Vibrator) getActivity().getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 26 || !vibrator.hasAmplitudeControl()) {
            vibrator.vibrate(j17);
        } else {
            vibrator.vibrate(android.os.VibrationEffect.createOneShot(j17, i17));
        }
    }
}
