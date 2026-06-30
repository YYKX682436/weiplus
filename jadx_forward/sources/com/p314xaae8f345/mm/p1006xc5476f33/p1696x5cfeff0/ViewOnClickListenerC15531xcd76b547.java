package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* renamed from: com.tencent.mm.plugin.flash.FaceFlashUI */
/* loaded from: classes14.dex */
public class ViewOnClickListenerC15531xcd76b547 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f f218584d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.C15530x17431dc6 f218585e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f218586f;

    /* renamed from: g, reason: collision with root package name */
    public final int f218587g = 90004;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f218588h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f218589i = "";

    /* renamed from: m, reason: collision with root package name */
    public final long f218590m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f218591n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f218592o;

    public ViewOnClickListenerC15531xcd76b547() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f218590m = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f218591n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba>(a0Var) { // from class: com.tencent.mm.plugin.flash.FaceFlashUI.2
            {
                this.f39173x3fe91575 = -797557590;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba) {
                if (c6231x4f3054ba.f136478g.f89948b != 3) {
                    return false;
                }
                vz2.c.b().B = 1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.ViewOnClickListenerC15531xcd76b547.this.W6(90030, "finish by voip call");
                return false;
            }
        };
        this.f218592o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5422x7cda145c>(this, a0Var) { // from class: com.tencent.mm.plugin.flash.FaceFlashUI.3
            {
                this.f39173x3fe91575 = -544026548;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5422x7cda145c c5422x7cda145c) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5422x7cda145c c5422x7cda145c2 = c5422x7cda145c;
                if (c5422x7cda145c2 == null) {
                    return false;
                }
                c5422x7cda145c2.f135766g.f89143a = true;
                return false;
            }
        };
    }

    public static boolean X6(android.app.Activity activity, android.os.Bundle bundle, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.s(activity);
        if (iq.b.h(activity, true, sVar) || iq.b.D(activity, sVar) || iq.b.w(activity, sVar) || iq.b.f(activity, sVar) || iq.b.k(activity, sVar)) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.ViewOnClickListenerC15531xcd76b547.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/flash/FaceFlashUI", "jumpToFaceFlashUI", "(Landroid/app/Activity;Landroid/os/Bundle;I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return true;
    }

    public static android.content.Intent b7(int i17, int i18, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("err_type", i17);
        bundle.putInt("err_code", i18);
        bundle.putString("err_msg", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "face result errorType:%s errorCode:%s errorMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        intent.putExtras(bundle);
        return intent;
    }

    public void T6() {
        if (!android.text.TextUtils.isEmpty(this.f218589i)) {
            try {
                V6(new org.json.JSONObject(this.f218589i));
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManager", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity finishByCancel", java.lang.Integer.valueOf(hashCode()));
        android.content.Intent b76 = b7(1, this.f218587g, "cancel");
        b76.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        b76.putExtra("totalTime", android.os.SystemClock.elapsedRealtime() - this.f218590m);
        try {
            if (!android.text.TextUtils.isEmpty(this.f218588h)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f218588h);
                b76.putExtra("serial_id", jSONObject.optString("serial_id"));
                U6(jSONObject);
                return;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManager", e18, "", new java.lang.Object[0]);
        }
        vz2.c.j("usrCancel");
        vz2.c.a(false);
        vz2.c.b().B = 6;
        vz2.c.f(90004);
        setResult(0, b76);
        finish();
    }

    public void U6(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity finishByFailed", java.lang.Integer.valueOf(hashCode()));
        this.f218584d.f218566u.d();
        vz2.c.a(false);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(wz2.a.a(jSONObject));
        setResult(1, intent);
        finish();
    }

    public void V6(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity finishBySuccess", java.lang.Integer.valueOf(hashCode()));
        if (isFinishing() || isDestroyed()) {
            return;
        }
        vz2.c.a(true);
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle a17 = wz2.a.a(jSONObject);
        a17.putString("click_other_verify_btn", "no");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        a17.putLong("totalTime", android.os.SystemClock.elapsedRealtime() - this.f218590m);
        intent.putExtras(a17);
        setResult(-1, intent);
        finish();
    }

    public void W6(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity finishByUnexpectedError", java.lang.Integer.valueOf(hashCode()));
        vz2.c.k("msgVerify", str);
        vz2.c.f(i17);
        vz2.c.a(false);
        setResult(1, b7(4, i17, str));
        finish();
    }

    public void Y6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity reset", java.lang.Integer.valueOf(hashCode()));
        vz2.c.j("reset");
        vz2.c.b().f137725q = java.lang.System.currentTimeMillis();
        Z6(i65.a.d(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        this.f218588h = "";
        this.f218589i = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f = this.f218584d;
        textureViewSurfaceTextureListenerC15528xde21bc5f.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "reset");
        textureViewSurfaceTextureListenerC15528xde21bc5f.B = 0;
        android.os.CountDownTimer countDownTimer = textureViewSurfaceTextureListenerC15528xde21bc5f.N;
        countDownTimer.cancel();
        countDownTimer.start();
        textureViewSurfaceTextureListenerC15528xde21bc5f.H = false;
        vz2.c.m(12);
        vz2.c.b().f137723o = 1;
        vz2.c.b().f137713e = textureViewSurfaceTextureListenerC15528xde21bc5f.D;
        textureViewSurfaceTextureListenerC15528xde21bc5f.a();
        if (!textureViewSurfaceTextureListenerC15528xde21bc5f.f218567v.isShowing() && ((((java.lang.System.currentTimeMillis() - textureViewSurfaceTextureListenerC15528xde21bc5f.f218551J) / 1000) / 60) / 60) / 24 >= 30) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            textureViewSurfaceTextureListenerC15528xde21bc5f.f218551J = currentTimeMillis;
            textureViewSurfaceTextureListenerC15528xde21bc5f.I.B("show-dialog", currentTimeMillis);
            textureViewSurfaceTextureListenerC15528xde21bc5f.f218567v.show();
        }
        this.f218584d.setVisibility(0);
        this.f218584d.c();
        this.f218585e.setVisibility(8);
        vz2.c.d().f137701j++;
    }

    public void Z6(int i17) {
        this.f218586f.m82040x7541828(i17);
    }

    public void a7(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity showFailedLayout", java.lang.Integer.valueOf(hashCode()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f = this.f218584d;
        if (textureViewSurfaceTextureListenerC15528xde21bc5f.f218567v.isShowing()) {
            textureViewSurfaceTextureListenerC15528xde21bc5f.f218567v.dismiss();
        }
        this.f218588h = str;
        int intExtra = getIntent().getIntExtra("identify_type", 0);
        int intExtra2 = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        if (intExtra == 1 && intExtra2 == 5) {
            try {
                U6(new org.json.JSONObject(str));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManager", e17.getMessage());
                finish();
            }
            vz2.c.g(str);
            return;
        }
        Z6(i65.a.d(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        this.f218584d.setVisibility(8);
        this.f218584d.b();
        this.f218585e.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.C15530x17431dc6 c15530x17431dc6 = this.f218585e;
        c15530x17431dc6.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "showFailedAnimation");
        c15530x17431dc6.findViewById(com.p314xaae8f345.mm.R.id.lqx).setPadding(0, com.p314xaae8f345.mm.ui.bl.a(c15530x17431dc6.getContext()), 0, 0);
        try {
            c15530x17431dc6.f218578h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562964t6);
            c15530x17431dc6.f218578h.startAnimation(c15530x17431dc6.f218581n);
            c15530x17431dc6.f218577g.setImageDrawable(i65.a.i(c15530x17431dc6.getContext(), com.p314xaae8f345.mm.R.raw.f79724xeb42fc43));
            c15530x17431dc6.f218577g.startAnimation(c15530x17431dc6.f218583p);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c || z65.c.a()) {
                c15530x17431dc6.f218577g.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.k(c15530x17431dc6));
            } else {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            android.widget.TextView textView = c15530x17431dc6.f218575e;
            java.lang.String r17 = i65.a.r(c15530x17431dc6.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c6l);
            java.lang.String optString = jSONObject.optString("err_msg", jSONObject.optString("errormsg", r17));
            if (android.text.TextUtils.isEmpty(optString)) {
                vz2.c.k("msgVerify", r17);
            } else {
                vz2.c.k("msgVerify", optString);
                r17 = optString;
            }
            textView.setText(r17);
            c15530x17431dc6.f218576f.setVisibility(0);
            android.widget.TextView textView2 = c15530x17431dc6.f218576f;
            java.lang.String optString2 = jSONObject.optString("err_tip", "");
            if (android.text.TextUtils.isEmpty(optString2)) {
                optString2 = "";
            }
            textView2.setText(optString2);
            java.lang.String optString3 = jSONObject.optString("err_feedback", "");
            c15530x17431dc6.f218580m.setVisibility(android.text.TextUtils.isEmpty(optString3) ? 4 : 0);
            c15530x17431dc6.f218580m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.l(c15530x17431dc6, jSONObject, optString3));
            boolean optBoolean = jSONObject.optBoolean("err_retry", true);
            c15530x17431dc6.f218579i.setVisibility(0);
            c15530x17431dc6.f218579i.setText(optBoolean ? i65.a.r(c15530x17431dc6.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c7v) : i65.a.r(c15530x17431dc6.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c7t));
            c15530x17431dc6.f218579i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.m(c15530x17431dc6, optBoolean, jSONObject));
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e18, "parse face failed result error.%s", str);
            c15530x17431dc6.f218575e.setText(str);
            c15530x17431dc6.f218580m.setVisibility(4);
            c15530x17431dc6.f218579i.setVisibility(0);
            c15530x17431dc6.f218579i.setText(i65.a.r(c15530x17431dc6.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c7v));
            c15530x17431dc6.f218579i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.n(c15530x17431dc6));
        }
        vz2.c.g(str);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity finish", java.lang.Integer.valueOf(hashCode()));
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.t(this));
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aa6;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onBackPressed", java.lang.Integer.valueOf(hashCode()));
        T6();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/FaceFlashUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.g7w) {
            T6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/flash/FaceFlashUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "screen orientation %d", java.lang.Integer.valueOf(configuration.orientation));
        this.f218584d.onConfigurationChanged(configuration);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onCreate", java.lang.Integer.valueOf(hashCode()));
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            vz2.c.d().f137695d = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6432x5629f7e8 d17 = vz2.c.d();
            d17.f137696e = d17.b("functionName", intent.getStringExtra("key_function_name"), true);
            vz2.c.d().f137697f = intent.getIntExtra("key_business_type", -1);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6432x5629f7e8 d18 = vz2.c.d();
            d18.f137698g = d18.b("appId", intent.getStringExtra("appId"), true);
            vz2.c.d().f137701j = 1L;
            vz2.c.d().f137702k = intent.getLongExtra("confirm_page_timestamp", -1L);
            vz2.c.d().f137703l = java.lang.System.currentTimeMillis();
            vz2.c.d().f137706o = intent.getIntExtra("check_alive_type", -1);
        }
        vz2.c.j("enter");
        vz2.c.b().f137725q = java.lang.System.currentTimeMillis();
        mo78514x143f1b92().W0(this, i65.a.d(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f218584d = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f) findViewById(com.p314xaae8f345.mm.R.id.f566540g80);
        this.f218585e = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.C15530x17431dc6) findViewById(com.p314xaae8f345.mm.R.id.f566541g81);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.g7w);
        this.f218586f = c22699x3dcdb352;
        c22699x3dcdb352.setOnClickListener(this);
        this.f218591n.mo48813x58998cd();
        this.f218592o.mo48813x58998cd();
        jx3.f.INSTANCE.mo68477x336bdfd8(1484L, 1L, 1L, false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onDestroy", java.lang.Integer.valueOf(hashCode()));
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.t(this));
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onPause", java.lang.Integer.valueOf(hashCode()));
        super.onPause();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120761x6bee482b();
        this.f218584d.b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onResume", java.lang.Integer.valueOf(hashCode()));
        super.onResume();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120762x157bec98();
        this.f218584d.c();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "onSwipeBack");
        T6();
        super.mo2295x59cfc822();
    }
}
