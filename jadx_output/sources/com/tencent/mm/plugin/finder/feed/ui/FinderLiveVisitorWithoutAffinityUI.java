package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(4128)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorWithoutAffinityUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Lnf/m;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@db5.c9
@com.tencent.mm.ui.a2
@ul5.d(0)
/* loaded from: classes3.dex */
public class FinderLiveVisitorWithoutAffinityUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI implements nf.m {
    public final com.tencent.mm.sdk.platformtools.n3 A;
    public int B;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f109437v = "FinderLiveVisitorWithoutAffinityUI@" + hashCode();

    /* renamed from: w, reason: collision with root package name */
    public boolean f109438w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment f109439x;

    /* renamed from: y, reason: collision with root package name */
    public long f109440y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI$liveEndPageFinishListener$1 f109441z;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI$liveEndPageFinishListener$1] */
    public FinderLiveVisitorWithoutAffinityUI() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f109441z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveEndPageFinishedEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI$liveEndPageFinishListener$1
            {
                this.__eventId = 1944079072;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveEndPageFinishedEvent finderLiveEndPageFinishedEvent) {
                com.tencent.mm.autogen.events.FinderLiveEndPageFinishedEvent event = finderLiveEndPageFinishedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI finderLiveVisitorWithoutAffinityUI = com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI.this;
                finderLiveVisitorWithoutAffinityUI.finish();
                finderLiveVisitorWithoutAffinityUI.overridePendingTransition(0, 0);
                return true;
            }
        };
        this.A = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.B = -1;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public boolean V6() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public void Z6(int i17, int i18, int i19, int i27, float f17) {
        com.tencent.mars.xlog.Log.i(this.f109437v, "onDragPositionChange dx=" + i19 + " left=" + i17 + " scrollPercent=" + f17);
        com.tencent.mm.autogen.events.FinderLiveBgPositionChangeEvent finderLiveBgPositionChangeEvent = new com.tencent.mm.autogen.events.FinderLiveBgPositionChangeEvent();
        finderLiveBgPositionChangeEvent.f54283g.f7416a = i17;
        finderLiveBgPositionChangeEvent.e();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI
    public boolean c7() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return false;
    }

    public final void d7() {
        com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment finderLiveVisitorFragment = new com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment();
        this.f109439x = finderLiveVisitorFragment;
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        beginTransaction.k(com.tencent.mm.R.id.gd9, finderLiveVisitorFragment, null);
        beginTransaction.f();
    }

    public final boolean e7() {
        return getIntent().getBooleanExtra("LAUNCH_WITH_ANIM", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x019f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a0  */
    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void finish() {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI.finish():void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        boolean z17 = false;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).L2) {
            z17 = true;
        }
        return z17 ? this.B : super.getForceOrientation();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b0u;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.rb.class)), d92.z0.class, com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC.class, d92.e1.class, pl2.x.class, im2.t6.class, com.tencent.mm.plugin.finder.viewmodel.component.ye.class, im2.s6.class, com.tencent.mm.plugin.finder.viewmodel.component.go.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.v9.class)), im2.n.class, or2.f.class, or2.t.class});
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public void initActivityCloseAnimation() {
        if (e7()) {
            return;
        }
        super.initActivityCloseAnimation();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3809m0).getValue()).r()).intValue() == 1 && getIntent().getBooleanExtra("intent_key_ignore_back", false)) {
            com.tencent.mars.xlog.Log.w(this.f109437v, "ignore onBackPressed!");
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionDenied(java.lang.String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if ((r4.f309583c == kn0.j.f309562d) == false) goto L15;
     */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBusinessPermissionGranted(java.lang.String r4) {
        /*
            r3 = this;
            d85.g0 r0 = d85.g0.CAMERA
            java.lang.String r0 = r0.f227192d
            boolean r0 = kotlin.jvm.internal.o.b(r4, r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L35
            tn0.w0 r4 = dk2.ef.f233378d
            if (r4 == 0) goto L20
            kn0.p r4 = r4.D
            if (r4 == 0) goto L20
            kn0.j r4 = r4.f309583c
            kn0.j r0 = kn0.j.f309562d
            if (r4 != r0) goto L1c
            r4 = r1
            goto L1d
        L1c:
            r4 = r2
        L1d:
            if (r4 != 0) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            if (r1 == 0) goto L64
            com.tencent.mm.plugin.finder.live.view.k0 r4 = dk2.ef.f233380e
            if (r4 == 0) goto L64
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.dk0> r0 = com.tencent.mm.plugin.finder.live.plugin.dk0.class
            com.tencent.mm.plugin.finder.live.plugin.l r4 = r4.getPlugin(r0)
            com.tencent.mm.plugin.finder.live.plugin.dk0 r4 = (com.tencent.mm.plugin.finder.live.plugin.dk0) r4
            if (r4 == 0) goto L64
            r4.v1()
            goto L64
        L35:
            d85.g0 r0 = d85.g0.MICRO_PHONE
            java.lang.String r0 = r0.f227192d
            boolean r4 = kotlin.jvm.internal.o.b(r4, r0)
            if (r4 == 0) goto L64
            tn0.w0 r4 = dk2.ef.f233378d
            if (r4 == 0) goto L53
            kn0.p r4 = r4.D
            if (r4 == 0) goto L53
            kn0.j r4 = r4.f309583c
            kn0.j r0 = kn0.j.f309562d
            if (r4 != r0) goto L4f
            r4 = r1
            goto L50
        L4f:
            r4 = r2
        L50:
            if (r4 != 0) goto L53
            r2 = r1
        L53:
            if (r2 == 0) goto L64
            tn0.w0 r4 = dk2.ef.f233378d
            boolean r0 = r4 instanceof co0.s
            if (r0 == 0) goto L5e
            co0.s r4 = (co0.s) r4
            goto L5f
        L5e:
            r4 = 0
        L5f:
            if (r4 == 0) goto L64
            r4.C0(r1)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI.onBusinessPermissionGranted(java.lang.String):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        if (!(context instanceof android.app.Activity)) {
            context = null;
        }
        boolean z17 = false;
        if (context != null && (intent = context.getIntent()) != null) {
            z17 = intent.getBooleanExtra("KEY_PARAMS_FROM_SPLIT_SCREEN", false);
        }
        java.lang.String str = "[onConfigurationChanged] isFromSplitScreen:" + z17 + ", lastOrientation：" + this.B + ",newConfig.orientation:" + newConfig.orientation + " originResource: " + getResources().getConfiguration() + " hashCode: " + getResources().getConfiguration().hashCode();
        java.lang.String str2 = this.f109437v;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (z17) {
            com.tencent.mars.xlog.Log.i(str2, "isFromSplitScreen, donothing");
            return;
        }
        int i17 = this.B;
        int i18 = newConfig.orientation;
        if (i17 != i18) {
            this.B = i18;
            getIntent().putExtra("KEY_PARAMS_RESET_LIVE", true);
            com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment finderLiveVisitorFragment = this.f109439x;
            if (finderLiveVisitorFragment != null) {
                androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
                kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
                beginTransaction.j(finderLiveVisitorFragment);
                beginTransaction.f();
            }
            d7();
            getResources().getConfiguration().orientation = newConfig.orientation;
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Ik(true, newConfig.orientation);
        }
        com.tencent.mm.sdk.platformtools.m2.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra;
        org.json.JSONObject jSONObject;
        android.view.Window window;
        android.view.View decorView;
        this.f128811m = true;
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        java.lang.String str = "";
        ml2.m5.f327718a.c(this, "");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, com.tencent.mm.plugin.finder.feed.ui.xe.f110733a);
        ig2.o.f291411a.c("onCreate before");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_context_id");
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_click_tab_context_id");
        java.lang.String stringExtra4 = getIntent().getStringExtra("key_click_sub_tab_context_id");
        if (getIntent().hasExtra("KEY_ENTER_LIVE_FROM_MINI_WINDOW_CHNL_EXTRA")) {
            java.lang.String stringExtra5 = getIntent().getStringExtra("KEY_ENTER_LIVE_FROM_MINI_WINDOW_CHNL_EXTRA");
            stringExtra = stringExtra5 != null ? r26.i0.t(stringExtra5, ";", ",", false) : null;
        } else {
            stringExtra = getIntent().getStringExtra("key_chnl_extra");
        }
        this.f109440y = getIntent().getLongExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID", 0L);
        int intExtra = getIntent().getIntExtra("KEY_FINDER_FROM_FEED_TYPE", 0);
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f109440y);
        if (!(valueOf.longValue() != 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            if (!(!(stringExtra == null || stringExtra.length() == 0))) {
                stringExtra = null;
            }
            org.json.JSONObject jSONObject2 = stringExtra != null ? new org.json.JSONObject(stringExtra) : new org.json.JSONObject("{}");
            jSONObject2.put("from_feed_id", pm0.v.u(longValue));
            stringExtra = jSONObject2.toString();
        }
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intExtra);
        if (!(valueOf2.intValue() != 0)) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            int intValue = valueOf2.intValue();
            if (!(!(stringExtra == null || stringExtra.length() == 0))) {
                stringExtra = null;
            }
            org.json.JSONObject jSONObject3 = stringExtra != null ? new org.json.JSONObject(stringExtra) : new org.json.JSONObject("{}");
            jSONObject3.put("head_enter_type", java.lang.String.valueOf(intValue));
            stringExtra = jSONObject3.toString();
        }
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        java.lang.String str2 = a52.a.f1584l;
        if (str2 == null) {
            str2 = "";
        }
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            jSONObject = new org.json.JSONObject();
        } else {
            try {
                jSONObject = new org.json.JSONObject(stringExtra);
            } catch (org.json.JSONException unused) {
                jSONObject = new org.json.JSONObject();
            }
        }
        org.json.JSONObject jSONObject4 = android.text.TextUtils.isEmpty(jSONObject.optString("enter_immerse_type")) ? jSONObject : null;
        if (jSONObject4 != null) {
            jSONObject4.put("enter_immerse_type", str2);
        }
        java.lang.String stringExtra6 = getIntent().getStringExtra("KEY_ENTER_LIVE_PARAM_APP_PUSH_TASK_ID");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra6)) {
            org.json.JSONObject jSONObject5 = android.text.TextUtils.isEmpty(jSONObject.optString("taskid")) ? jSONObject : null;
            if (jSONObject5 != null) {
                jSONObject5.put("taskid", stringExtra6);
            }
        }
        org.json.JSONObject jSONObject6 = android.text.TextUtils.isEmpty(jSONObject.optString("slide_sessionid")) ? jSONObject : null;
        if (jSONObject6 != null) {
            jSONObject6.put("slide_sessionid", java.lang.System.currentTimeMillis());
        }
        dk2.x4 a17 = dk2.x4.C.a(getIntent());
        if (a17 != null) {
            org.json.JSONObject jSONObject7 = android.text.TextUtils.isEmpty(jSONObject.optString("is_pk_enter")) ? jSONObject : null;
            if (jSONObject7 != null) {
                r45.ta4 ta4Var = a17.B;
                java.lang.String string = ta4Var != null ? ta4Var.getString(9) : null;
                jSONObject7.put("is_pk_enter", !(string == null || string.length() == 0) ? "1" : "0");
            }
        }
        java.lang.String str3 = this.f109437v;
        com.tencent.mars.xlog.Log.i(str3, "appendChnlExta currentScene: " + str2 + " data: " + jSONObject);
        java.lang.String jSONObject8 = jSONObject.toString();
        if (!android.text.TextUtils.isEmpty(stringExtra2)) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(this).c(zy2.ra.class))).f135382p = stringExtra2;
        }
        if (!android.text.TextUtils.isEmpty(stringExtra3)) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(this).c(zy2.ra.class))).f135386r = stringExtra3;
        }
        if (!android.text.TextUtils.isEmpty(stringExtra4)) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(this).c(zy2.ra.class))).f135387s = stringExtra4;
        }
        if (!android.text.TextUtils.isEmpty(jSONObject8)) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(this).c(zy2.ra.class))).Q6(jSONObject8);
        }
        getIntent().putExtra("KEY_PARAMS_RESET_LIVE", false);
        d7();
        ig2.o.f291411a.c("onCreate after");
        if (!e7() && (window = getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setBackgroundColor(-16777216);
        }
        com.tencent.mars.xlog.Log.i(str3, "[onCreate] fromFeedId: " + this.f109440y);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        try {
            if (!u46.l.e(((ml2.r0) i95.n0.c(ml2.r0.class)).H1)) {
                str = new org.json.JSONObject(((ml2.r0) i95.n0.c(ml2.r0.class)).H1).getString("appid");
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
            h0Var.f310123d = str;
        } catch (java.lang.Exception unused2) {
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderLiveVisitorWithoutAffinityUI);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Rj(this, iy1.a.FinderLive);
        aVar.fk(this, "page_type", 0);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.tencent.mm.plugin.finder.feed.ui.ye(dk2.x4.C.a(getIntent()), h0Var, this));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 40, 25388);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 12, 25561);
        if (e7()) {
            long longExtra = getIntent().getLongExtra("CURRENT_FEED_ID", 0L);
            ig2.m mVar = ig2.m.f291393a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopEnterLiveCountDown feedId: ");
            sb6.append(longExtra);
            sb6.append(" coundownJob : ");
            java.util.HashMap hashMap = ig2.m.f291394b;
            kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) hashMap.get(java.lang.Long.valueOf(longExtra));
            sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
            com.tencent.mars.xlog.Log.i("FinderFluentSwitchManager", sb6.toString());
            kotlinx.coroutines.r2 r2Var2 = (kotlinx.coroutines.r2) hashMap.get(java.lang.Long.valueOf(longExtra));
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
        }
        alive();
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3809m0).getValue()).r()).intValue() == 1 && getIntent().getBooleanExtra("intent_key_ignore_back", false)) {
            this.A.postDelayed(new com.tencent.mm.plugin.finder.feed.ui.ze(this), 5000L);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        if (e7()) {
            if (com.tencent.mm.ui.bk.C()) {
                setTheme(com.tencent.mm.R.style.f494372la);
            } else {
                setTheme(com.tencent.mm.R.style.f494372la);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ml2.m5.f327718a.d(this, this.f128818u);
        fo0.o.f264833a.b();
        zl2.r4.f473950a.s3(true, false);
        com.tencent.mm.plugin.finder.report.q1.f125258d = null;
        com.tencent.mm.plugin.finder.report.q1.f125256b = 0L;
        com.tencent.mm.plugin.finder.report.q1.f125257c = 0L;
        com.tencent.mm.plugin.finder.report.q1.f125259e = false;
        com.tencent.mm.plugin.finder.report.q1.f125261g = true;
        try {
            za2.b.f470884a.b(this);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("PhoneWindowLeakFixed", "fix fail " + e17);
        }
        java.lang.String str = this.f109437v;
        com.tencent.mars.xlog.Log.i(str, "[onDestroy]");
        nf.g.b(this);
        dead();
        yz5.a aVar = vd2.w5.f435980a;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i(str, "onDestroy: Found a post-close action, executing it now.");
            aVar.invoke();
            vd2.w5.f435980a = null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i(this.f109437v, "[onPause]");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void onPreDestroyed() {
        super.onPreDestroyed();
        this.A.quit();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        if (grantResults.length == 0) {
            com.tencent.mars.xlog.Log.i(this.f109437v, "onRequestPermissionsResult grantResults length 0. requestCode=%d", java.lang.Integer.valueOf(i17));
        } else {
            nf.g.a(this).h(i17, permissions, grantResults);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ml2.m5.f327718a.c(this, "");
        java.lang.String str = this.f109437v;
        com.tencent.mars.xlog.Log.i(str, "[onResume]");
        ig2.o.f291411a.c("onResume after");
        com.tencent.mm.plugin.finder.report.q5 q5Var = com.tencent.mm.plugin.finder.report.r5.f125336b;
        if ((q5Var != null && q5Var.f125269b == 0) && q5Var != null) {
            q5Var.f125269b = java.lang.System.currentTimeMillis();
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "special_enter_source", java.lang.Integer.valueOf(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Bi()));
        if (p52.h.A) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_to_full_window_event", this, um2.x5.f429020x1.a(), 25561);
            p52.h.A = false;
        }
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C7).getValue()).r()).intValue() == 1;
        com.tencent.mars.xlog.Log.i(str, "initSwipeBackLayoutIfNeed enableSupport=" + z17);
        if (z17) {
            getSwipeBackLayout().setEdgeSize(com.tencent.mm.ui.bh.a(this).f197135a);
            com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
            if (swipeBackLayout != null) {
                swipeBackLayout.setEnableGesture(false);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i(this.f109437v, "[onStart]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i(this.f109437v, "[onStop]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC finderLiveVisitorUIC;
        com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment finderLiveVisitorFragment = this.f109439x;
        if (finderLiveVisitorFragment != null && (finderLiveVisitorUIC = (com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC) pf5.z.f353948a.b(finderLiveVisitorFragment).e(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC.class)) != null) {
            finderLiveVisitorUIC.f117010r = true;
        }
        com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC = (com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC.class);
        finderLiveExitAnimateOpUIC.f116991q = true;
        finderLiveExitAnimateOpUIC.f116992r = 9;
        this.f109438w = true;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_FUN_USED_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        android.app.Activity hostActivity = getHostActivity();
        kotlin.jvm.internal.o.f(hostActivity, "getHostActivity(...)");
        boolean booleanExtra = hostActivity.getIntent().getBooleanExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", true);
        com.tencent.mars.xlog.Log.i("SlideToCloseLiveHelper", "curLiveRoomSwipeToMiniWindow backNeedMiniWindow=" + booleanExtra);
        java.lang.String str = this.f109437v;
        if (!booleanExtra) {
            com.tencent.mars.xlog.Log.i(str, "reportExitLiveRoomBySwipeBack");
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            androidx.appcompat.app.AppCompatActivity context = getContext();
            ml2.e4 e4Var = ml2.e4.f327386r;
            km2.n nVar = dk2.ef.H;
            ml2.r0.Ck(r0Var, context, e4Var, nVar != null ? nVar.f309160l : null, false, null, 24, null);
        }
        super.onSwipeBack();
        com.tencent.mars.xlog.Log.i(str, "onSwipeBack");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.remove(com.tencent.mm.plugin.finder.viewmodel.component.g1.class);
    }
}
