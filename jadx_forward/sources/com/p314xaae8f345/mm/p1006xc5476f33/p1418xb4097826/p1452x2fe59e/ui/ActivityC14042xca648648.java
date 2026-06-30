package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = 4128)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorWithoutAffinityUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Lnf/m;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@db5.c9
@com.p314xaae8f345.mm.ui.a2
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI */
/* loaded from: classes3.dex */
public class ActivityC14042xca648648 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 implements nf.m {
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 A;
    public int B;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f190970v = "FinderLiveVisitorWithoutAffinityUI@" + hashCode();

    /* renamed from: w, reason: collision with root package name */
    public boolean f190971w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14221x14e9402c f190972x;

    /* renamed from: y, reason: collision with root package name */
    public long f190973y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14043x9e129476 f190974z;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI$liveEndPageFinishListener$1] */
    public ActivityC14042xca648648() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f190974z = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5481x3f40dcd0>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI$liveEndPageFinishListener$1
            {
                this.f39173x3fe91575 = 1944079072;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5481x3f40dcd0 c5481x3f40dcd0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5481x3f40dcd0 event = c5481x3f40dcd0;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14042xca648648 activityC14042xca648648 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14042xca648648.this;
                activityC14042xca648648.finish();
                activityC14042xca648648.overridePendingTransition(0, 0);
                return true;
            }
        };
        this.A = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.B = -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public boolean V6() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public void Z6(int i17, int i18, int i19, int i27, float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f190970v, "onDragPositionChange dx=" + i19 + " left=" + i17 + " scrollPercent=" + f17);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5478xe7e70c2a c5478xe7e70c2a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5478xe7e70c2a();
        c5478xe7e70c2a.f135816g.f88949a = i17;
        c5478xe7e70c2a.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806
    public boolean c7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: convertActivityFromTranslucent */
    public boolean mo44290xd3d2670d() {
        return false;
    }

    public final void d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14221x14e9402c c14221x14e9402c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14221x14e9402c();
        this.f190972x = c14221x14e9402c;
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
        m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.gd9, c14221x14e9402c, null);
        m7630xb2c12e75.f();
    }

    public final boolean e7() {
        return getIntent().getBooleanExtra("LAUNCH_WITH_ANIM", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x019f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a0  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void finish() {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14042xca648648.finish():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        boolean z17 = false;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).L2) {
            z17 = true;
        }
        return z17 ? this.B : super.mo44431x663c095b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b0u;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.z.D0(new java.lang.Class[]{pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.rb.class)), d92.z0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd.class, d92.e1.class, pl2.x.class, im2.t6.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ye.class, im2.s6.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.go.class, pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.v9.class)), im2.n.class, or2.f.class, or2.t.class});
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initActivityCloseAnimation */
    public void mo50392x5138328b() {
        if (e7()) {
            return;
        }
        super.mo50392x5138328b();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85342m0).mo141623x754a37bb()).r()).intValue() == 1 && getIntent().getBooleanExtra("intent_key_ignore_back", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f190970v, "ignore onBackPressed!");
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onBusinessPermissionDenied */
    public void mo53824x34301f29(java.lang.String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if ((r4.f391116c == kn0.j.f391095d) == false) goto L15;
     */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onBusinessPermissionGranted */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo53825x600c4ed(java.lang.String r4) {
        /*
            r3 = this;
            d85.g0 r0 = d85.g0.CAMERA
            java.lang.String r0 = r0.f308725d
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L35
            tn0.w0 r4 = dk2.ef.f314911d
            if (r4 == 0) goto L20
            kn0.p r4 = r4.D
            if (r4 == 0) goto L20
            kn0.j r4 = r4.f391116c
            kn0.j r0 = kn0.j.f391095d
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
            com.tencent.mm.plugin.finder.live.view.k0 r4 = dk2.ef.f314913e
            if (r4 == 0) goto L64
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.dk0> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0.class
            com.tencent.mm.plugin.finder.live.plugin.l r4 = r4.mo57682x2a5e9229(r0)
            com.tencent.mm.plugin.finder.live.plugin.dk0 r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0) r4
            if (r4 == 0) goto L64
            r4.v1()
            goto L64
        L35:
            d85.g0 r0 = d85.g0.MICRO_PHONE
            java.lang.String r0 = r0.f308725d
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r0)
            if (r4 == 0) goto L64
            tn0.w0 r4 = dk2.ef.f314911d
            if (r4 == 0) goto L53
            kn0.p r4 = r4.D
            if (r4 == 0) goto L53
            kn0.j r4 = r4.f391116c
            kn0.j r0 = kn0.j.f391095d
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
            tn0.w0 r4 = dk2.ef.f314911d
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14042xca648648.mo53825x600c4ed(java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        if (!(mo55332x76847179 instanceof android.app.Activity)) {
            mo55332x76847179 = null;
        }
        boolean z17 = false;
        if (mo55332x76847179 != null && (intent = mo55332x76847179.getIntent()) != null) {
            z17 = intent.getBooleanExtra("KEY_PARAMS_FROM_SPLIT_SCREEN", false);
        }
        java.lang.String str = "[onConfigurationChanged] isFromSplitScreen:" + z17 + ", lastOrientation：" + this.B + ",newConfig.orientation:" + newConfig.orientation + " originResource: " + getResources().getConfiguration() + " hashCode: " + getResources().getConfiguration().hashCode();
        java.lang.String str2 = this.f190970v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "isFromSplitScreen, donothing");
            return;
        }
        int i17 = this.B;
        int i18 = newConfig.orientation;
        if (i17 != i18) {
            this.B = i18;
            getIntent().putExtra("KEY_PARAMS_RESET_LIVE", true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14221x14e9402c c14221x14e9402c = this.f190972x;
            if (c14221x14e9402c != null) {
                p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
                m7630xb2c12e75.j(c14221x14e9402c);
                m7630xb2c12e75.f();
            }
            d7();
            getResources().getConfiguration().orientation = newConfig.orientation;
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Ik(true, newConfig.orientation);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra;
        org.json.JSONObject jSONObject;
        android.view.Window window;
        android.view.View decorView;
        this.f210344m = true;
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        java.lang.String str = "";
        ml2.m5.f409251a.c(this, "");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.xe.f192266a);
        ig2.o.f372944a.c("onCreate before");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_context_id");
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_click_tab_context_id");
        java.lang.String stringExtra4 = getIntent().getStringExtra("key_click_sub_tab_context_id");
        if (getIntent().hasExtra("KEY_ENTER_LIVE_FROM_MINI_WINDOW_CHNL_EXTRA")) {
            java.lang.String stringExtra5 = getIntent().getStringExtra("KEY_ENTER_LIVE_FROM_MINI_WINDOW_CHNL_EXTRA");
            stringExtra = stringExtra5 != null ? r26.i0.t(stringExtra5, ";", ",", false) : null;
        } else {
            stringExtra = getIntent().getStringExtra("key_chnl_extra");
        }
        this.f190973y = getIntent().getLongExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID", 0L);
        int intExtra = getIntent().getIntExtra("KEY_FINDER_FROM_FEED_TYPE", 0);
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f190973y);
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
        java.lang.String str2 = a52.a.f83117l;
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
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra6)) {
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
                java.lang.String m75945x2fec8307 = ta4Var != null ? ta4Var.m75945x2fec8307(9) : null;
                jSONObject7.put("is_pk_enter", !(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) ? "1" : "0");
            }
        }
        java.lang.String str3 = this.f190970v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "appendChnlExta currentScene: " + str2 + " data: " + jSONObject);
        java.lang.String jSONObject8 = jSONObject.toString();
        if (!android.text.TextUtils.isEmpty(stringExtra2)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(this).c(zy2.ra.class))).f216915p = stringExtra2;
        }
        if (!android.text.TextUtils.isEmpty(stringExtra3)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(this).c(zy2.ra.class))).f216919r = stringExtra3;
        }
        if (!android.text.TextUtils.isEmpty(stringExtra4)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(this).c(zy2.ra.class))).f216920s = stringExtra4;
        }
        if (!android.text.TextUtils.isEmpty(jSONObject8)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(this).c(zy2.ra.class))).Q6(jSONObject8);
        }
        getIntent().putExtra("KEY_PARAMS_RESET_LIVE", false);
        d7();
        ig2.o.f372944a.c("onCreate after");
        if (!e7() && (window = getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setBackgroundColor(-16777216);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[onCreate] fromFeedId: " + this.f190973y);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = "";
        try {
            if (!u46.l.e(((ml2.r0) i95.n0.c(ml2.r0.class)).H1)) {
                str = new org.json.JSONObject(((ml2.r0) i95.n0.c(ml2.r0.class)).H1).getString("appid");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            }
            h0Var.f391656d = str;
        } catch (java.lang.Exception unused2) {
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderLiveVisitorWithoutAffinityUI);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Rj(this, iy1.a.FinderLive);
        aVar.fk(this, "page_type", 0);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ye(dk2.x4.C.a(getIntent()), h0Var, this));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 40, 25388);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 12, 25561);
        if (e7()) {
            long longExtra = getIntent().getLongExtra("CURRENT_FEED_ID", 0L);
            ig2.m mVar = ig2.m.f372926a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopEnterLiveCountDown feedId: ");
            sb6.append(longExtra);
            sb6.append(" coundownJob : ");
            java.util.HashMap hashMap = ig2.m.f372927b;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) hashMap.get(java.lang.Long.valueOf(longExtra));
            sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchManager", sb6.toString());
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = (p3325xe03a0797.p3326xc267989b.r2) hashMap.get(java.lang.Long.valueOf(longExtra));
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
        }
        mo48813x58998cd();
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85342m0).mo141623x754a37bb()).r()).intValue() == 1 && getIntent().getBooleanExtra("intent_key_ignore_back", false)) {
            this.A.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ze(this), 5000L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        if (e7()) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575905la);
            } else {
                setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575905la);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ml2.m5.f409251a.d(this, this.f210351u);
        fo0.o.f346366a.b();
        zl2.r4.f555483a.s3(true, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206789b = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206790c = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206792e = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206794g = true;
        try {
            za2.b.f552417a.b(this);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PhoneWindowLeakFixed", "fix fail " + e17);
        }
        java.lang.String str = this.f190970v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onDestroy]");
        nf.g.b(this);
        mo48814x2efc64();
        yz5.a aVar = vd2.w5.f517513a;
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onDestroy: Found a post-close action, executing it now.");
            aVar.mo152xb9724478();
            vd2.w5.f517513a = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f190970v, "[onPause]");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: onPreDestroyed */
    public void mo56581x6fa9d635() {
        super.mo56581x6fa9d635();
        this.A.mo50299x35224f();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        if (grantResults.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f190970v, "onRequestPermissionsResult grantResults length 0. requestCode=%d", java.lang.Integer.valueOf(i17));
        } else {
            nf.g.a(this).h(i17, permissions, grantResults);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        ml2.m5.f409251a.c(this, "");
        java.lang.String str = this.f190970v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onResume]");
        ig2.o.f372944a.c("onResume after");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q5 q5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r5.f206869b;
        if ((q5Var != null && q5Var.f206802b == 0) && q5Var != null) {
            q5Var.f206802b = java.lang.System.currentTimeMillis();
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "special_enter_source", java.lang.Integer.valueOf(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Bi()));
        if (p52.h.A) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_to_full_window_event", this, um2.x5.f510553x1.a(), 25561);
            p52.h.A = false;
        }
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C7).mo141623x754a37bb()).r()).intValue() == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initSwipeBackLayoutIfNeed enableSupport=" + z17);
        if (z17) {
            m78735x28280f95().m81448xd1d239e0(com.p314xaae8f345.mm.ui.bh.a(this).f278668a);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95 = m78735x28280f95();
            if (m78735x28280f95 != null) {
                m78735x28280f95.m81450x8e764904(false);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f190970v, "[onStart]");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f190970v, "[onStop]");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3 c14385xe1b728f3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14221x14e9402c c14221x14e9402c = this.f190972x;
        if (c14221x14e9402c != null && (c14385xe1b728f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3) pf5.z.f435481a.b(c14221x14e9402c).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3.class)) != null) {
            c14385xe1b728f3.f198543r = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd c14380x23078afd = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd.class);
        c14380x23078afd.f198524q = true;
        c14380x23078afd.f198525r = 9;
        this.f190971w = true;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_FUN_USED_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        android.app.Activity mo53059x9d6db74d = mo53059x9d6db74d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo53059x9d6db74d, "getHostActivity(...)");
        boolean booleanExtra = mo53059x9d6db74d.getIntent().getBooleanExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideToCloseLiveHelper", "curLiveRoomSwipeToMiniWindow backNeedMiniWindow=" + booleanExtra);
        java.lang.String str = this.f190970v;
        if (!booleanExtra) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "reportExitLiveRoomBySwipeBack");
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            ml2.e4 e4Var = ml2.e4.f408919r;
            km2.n nVar = dk2.ef.H;
            ml2.r0.Ck(r0Var, mo55332x76847179, e4Var, nVar != null ? nVar.f390693l : null, false, null, 24, null);
        }
        super.mo2295x59cfc822();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onSwipeBack");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.remove(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1.class);
    }
}
