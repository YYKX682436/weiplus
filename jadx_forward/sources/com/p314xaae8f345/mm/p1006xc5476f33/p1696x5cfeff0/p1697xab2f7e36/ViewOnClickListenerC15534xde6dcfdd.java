package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

@db5.a(m123858x6ac9171 = 512)
/* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionUI */
/* loaded from: classes14.dex */
public class ViewOnClickListenerC15534xde6dcfdd extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 f218635d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970 f218636e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f218637f;

    /* renamed from: g, reason: collision with root package name */
    public int f218638g = 90004;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f218639h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f218640i = "";

    /* renamed from: m, reason: collision with root package name */
    public final long f218641m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f218642n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f218643o;

    public ViewOnClickListenerC15534xde6dcfdd() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f218641m = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f218642n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba>(a0Var) { // from class: com.tencent.mm.plugin.flash.action.FaceFlashActionUI.2
            {
                this.f39173x3fe91575 = -797557590;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba) {
                if (c6231x4f3054ba.f136478g.f89948b != 3) {
                    return false;
                }
                vz2.c.c().f137750s = 1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd.this.W6(90030, "finish by voip call");
                return false;
            }
        };
        this.f218643o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5422x7cda145c>(this, a0Var) { // from class: com.tencent.mm.plugin.flash.action.FaceFlashActionUI.3
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

    public static android.content.Intent c7(int i17, int i18, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("err_type", i17);
        bundle.putInt("err_code", i18);
        bundle.putString("err_msg", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "face result errorType:%s errorCode:%s errorMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        intent.putExtras(bundle);
        return intent;
    }

    public void T6() {
        if (!android.text.TextUtils.isEmpty(this.f218640i)) {
            try {
                V6(new org.json.JSONObject(this.f218640i));
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashActionUI", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity finishByCancel", java.lang.Integer.valueOf(hashCode()));
        android.content.Intent c76 = c7(1, this.f218638g, "cancel");
        c76.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c76.putExtra("totalTime", android.os.SystemClock.elapsedRealtime() - this.f218641m);
        try {
            if (!android.text.TextUtils.isEmpty(this.f218639h)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f218639h);
                c76.putExtra("serial_id", jSONObject.optString("serial_id"));
                if (wz2.a.d(jSONObject)) {
                    if (((android.app.Activity) this.f218635d.getContext()).getIntent() != null ? !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0.getStringExtra("otherVerifyTitle")) : false) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23269, 1, 2, 1);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23269, 1, 2, 0);
                    }
                }
                U6(jSONObject);
                return;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashActionUI", e18, "", new java.lang.Object[0]);
        }
        vz2.c.j("usrCancel");
        vz2.c.c().f137750s = 6;
        vz2.c.h(90004);
        setResult(0, c76);
        finish();
    }

    public void U6(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity finishByFailed", java.lang.Integer.valueOf(hashCode()));
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle a17 = wz2.a.a(jSONObject);
        a17.putString("err_msg", "fail");
        intent.putExtras(a17);
        setResult(1, intent);
        finish();
    }

    public void V6(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity finishBySuccess", java.lang.Integer.valueOf(hashCode()));
        if (isFinishing() || isDestroyed()) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle a17 = wz2.a.a(jSONObject);
        a17.putString("err_msg", "ok");
        a17.putString("click_other_verify_btn", "no");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        a17.putLong("totalTime", android.os.SystemClock.elapsedRealtime() - this.f218641m);
        intent.putExtras(a17);
        setResult(-1, intent);
        finish();
    }

    public void W6(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity finishByUnexpectedError", java.lang.Integer.valueOf(hashCode()));
        vz2.c.k("msgVerify", str);
        vz2.c.h(i17);
        setResult(1, c7(4, i17, "fail"));
        finish();
    }

    public void X6(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "onKindaBackResult");
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "resultData == null");
            T6();
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("error_msg");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "errorMsg == null");
            T6();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "errorMsg：%s", stringExtra);
        stringExtra.getClass();
        char c17 = 65535;
        switch (stringExtra.hashCode()) {
            case 3548:
                if (stringExtra.equals("ok")) {
                    c17 = 0;
                    break;
                }
                break;
            case 3135262:
                if (stringExtra.equals("fail")) {
                    c17 = 1;
                    break;
                }
                break;
            case 108405416:
                if (stringExtra.equals("retry")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                try {
                    V6(new org.json.JSONObject(this.f218640i));
                    return;
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionUI", "parse face success result error：%s，successStr：%s", e17.toString(), this.f218640i);
                    T6();
                    return;
                }
            case 1:
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(this.f218639h);
                    if ("yes".equals(intent.getStringExtra("other_verify_title_state"))) {
                        jSONObject.put("click_other_verify_btn", "yes");
                        if (wz2.a.d(jSONObject)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23269, 1, 1, 1);
                        }
                    } else {
                        java.lang.String optString = jSONObject.optString("otherVerifyTitle");
                        if (wz2.a.d(jSONObject)) {
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23269, 1, 3, 1);
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23269, 1, 3, 0);
                            }
                        }
                    }
                    U6(jSONObject);
                    return;
                } catch (org.json.JSONException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionUI", "parse face failed result error：%s，failStr：%s", e18.toString(), this.f218639h);
                    T6();
                    return;
                }
            case 2:
                Y6();
                return;
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionUI", "unknown type");
                T6();
                return;
        }
    }

    public void Y6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity reset", java.lang.Integer.valueOf(hashCode()));
        vz2.c.j("reset");
        Z6(i65.a.d(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        this.f218639h = "";
        this.f218640i = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809 = this.f218635d;
        textureViewSurfaceTextureListenerC15532xe9ad4809.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "reset");
        textureViewSurfaceTextureListenerC15532xe9ad4809.D = 0;
        android.os.CountDownTimer countDownTimer = textureViewSurfaceTextureListenerC15532xe9ad4809.f218619y0;
        countDownTimer.cancel();
        countDownTimer.start();
        textureViewSurfaceTextureListenerC15532xe9ad4809.L = false;
        textureViewSurfaceTextureListenerC15532xe9ad4809.c();
        vz2.c.c().f137747p = 1;
        vz2.c.c().f137736e = textureViewSurfaceTextureListenerC15532xe9ad4809.I;
        this.f218635d.setVisibility(0);
        this.f218636e.setVisibility(8);
    }

    public void Z6(int i17) {
        this.f218637f.m82040x7541828(i17);
    }

    public void a7(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity showFailedLayout", java.lang.Integer.valueOf(hashCode()));
        this.f218638g = 90006;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if ((((android.app.Activity) this.f218635d.getContext()).getIntent() != null ? !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1.getStringExtra("otherVerifyTitle")) : false) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jSONObject.optString("otherVerifyTitle"))) {
                jSONObject.put("otherVerifyTitle", this.f218635d.m63478x4845a922());
                str = jSONObject.toString();
            }
        } catch (org.json.JSONException unused) {
        }
        this.f218639h = str;
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.w0(this));
    }

    public void b7(java.lang.String str) {
        this.f218636e.setVisibility(8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "startKindaFaceCheckUseCase result：%s", str);
        str.getClass();
        if (str.equals("ok")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("error_msg", "ok");
            ((h45.q) i95.n0.c(h45.q.class)).mo24801xcb599eae("faceCheckResultUseCase", intent, new h45.i() { // from class: com.tencent.mm.plugin.flash.action.FaceFlashActionUI$$a
                @Override // h45.i
                /* renamed from: onKindaBusinessCallback */
                public final void mo24858x44dbb8f3(android.content.Intent intent2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd.this.X6(intent2);
                }
            });
        } else if (str.equals("fail")) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("error_msg", "fail");
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f218639h);
                intent2.putExtra("error_tips", wz2.a.b(jSONObject, i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.c6l)));
                boolean z17 = true;
                if (jSONObject.optInt("err_retry", 1) != 1) {
                    z17 = false;
                }
                intent2.putExtra("can_retry", z17);
                intent2.putExtra("other_verify_title", jSONObject.optString("otherVerifyTitle"));
            } catch (org.json.JSONException e17) {
                T6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionUI", "parse failed result error：%s，failStr：%s", e17.toString(), this.f218639h);
            }
            ((h45.q) i95.n0.c(h45.q.class)).mo24801xcb599eae("faceCheckResultUseCase", intent2, new h45.i() { // from class: com.tencent.mm.plugin.flash.action.FaceFlashActionUI$$a
                @Override // h45.i
                /* renamed from: onKindaBusinessCallback */
                public final void mo24858x44dbb8f3(android.content.Intent intent22) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd.this.X6(intent22);
                }
            });
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionUI", "unknown type");
            T6();
        }
        this.f218635d.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity finish", java.lang.Integer.valueOf(hashCode()));
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.u0(this));
        this.f218642n.mo48814x2efc64();
        this.f218643o.mo48814x2efc64();
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
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570281aa3;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity onBackPressed", java.lang.Integer.valueOf(hashCode()));
        T6();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/action/FaceFlashActionUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.g7w) {
            T6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/flash/action/FaceFlashActionUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "FaceFlashActivity onCreate, hashCode:%s. start verify sdk version:%s", java.lang.Integer.valueOf(hashCode()), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120775x14f51cd8());
        vz2.c.j("enter");
        super.onCreate(bundle);
        mo78514x143f1b92().W0(this, i65.a.d(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f218635d = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809) findViewById(com.p314xaae8f345.mm.R.id.f566540g80);
        this.f218636e = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970) findViewById(com.p314xaae8f345.mm.R.id.f566541g81);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.g7w);
        this.f218637f = c22699x3dcdb352;
        c22699x3dcdb352.setOnClickListener(this);
        new r45.ju3();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = mo55332x76847179();
        android.view.Window window = getWindow();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_faceoverlay, false) && android.os.Build.VERSION.SDK_INT >= 31) {
            try {
                if (b3.l.m9698x3fed0563(context, "android.permission.HIDE_OVERLAY_WINDOWS") != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FaceFlashActionUI", "no permission");
                } else if (window != null) {
                    window.setHideOverlayWindows(true);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FaceFlashActionUI", e17, "", new java.lang.Object[0]);
            }
        }
        this.f218642n.mo48813x58998cd();
        this.f218643o.mo48813x58998cd();
        jx3.f.INSTANCE.mo68477x336bdfd8(1484L, 1L, 1L, false);
        if (getWindow() == null || android.os.Build.VERSION.SDK_INT < 28) {
            return;
        }
        getWindow().setNavigationBarDividerColor(0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onDestroy", java.lang.Integer.valueOf(hashCode()));
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.u0(this));
        this.f218642n.mo48814x2efc64();
        this.f218643o.mo48814x2efc64();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity onPause", java.lang.Integer.valueOf(hashCode()));
        super.onPause();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120761x6bee482b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809 = this.f218635d;
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218610r.g();
        textureViewSurfaceTextureListenerC15532xe9ad4809.h();
        tz2.l lVar = tz2.l.f504835d;
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218608p0 = lVar;
        textureViewSurfaceTextureListenerC15532xe9ad4809.i(lVar);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity onResume", java.lang.Integer.valueOf(hashCode()));
        super.onResume();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120762x157bec98();
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809 = this.f218635d;
        if (textureViewSurfaceTextureListenerC15532xe9ad4809.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var = textureViewSurfaceTextureListenerC15532xe9ad4809.f218610r;
            if (d0Var.f218741k || textureViewSurfaceTextureListenerC15532xe9ad4809.f218598d == null || textureViewSurfaceTextureListenerC15532xe9ad4809.f218605n.getVisibility() == 0) {
                return;
            }
            d0Var.f(textureViewSurfaceTextureListenerC15532xe9ad4809.f218598d, new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.b0(textureViewSurfaceTextureListenerC15532xe9ad4809));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "onSwipeBack");
        T6();
        super.mo2295x59cfc822();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(rz2.e.class);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0.class);
    }
}
