package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI */
/* loaded from: classes9.dex */
public class ActivityC19083x6e91f3eb extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f260834d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f260835e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f260836f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f260837g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f260839i;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ca f260838h = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ca();

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f260840m = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI.1
        {
            this.f39173x3fe91575 = 323604482;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19083x6e91f3eb activityC19083x6e91f3eb = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19083x6e91f3eb.this;
            activityC19083x6e91f3eb.f260840m.mo48814x2efc64();
            int i17 = c6256xb3fb7c12.f136506g.f87653a;
            if (i17 != -1 && i17 != 0) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameVerifyMainUI", "WcPayRealnameVerifyMainUI finish");
            activityC19083x6e91f3eb.finish();
            return false;
        }
    };

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19083x6e91f3eb activityC19083x6e91f3eb, android.content.Intent intent) {
        activityC19083x6e91f3eb.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameVerifyMainUI", "go to id input ui");
        if (intent != null) {
            activityC19083x6e91f3eb.m83105x7498fe14().putBoolean("key_marketing_switch_closed", intent.getBooleanExtra("key_marketing_switch_closed", false));
        }
        com.p314xaae8f345.mm.p2802xd031a825.a.d(activityC19083x6e91f3eb, activityC19083x6e91f3eb.m83105x7498fe14());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d9e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            r13 = this;
            r0 = 2131325505(0x7f097241, float:1.8269748E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r13.f260834d = r0
            r0 = 2131325501(0x7f09723d, float:1.826974E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.f260835e = r0
            r0 = 2131325503(0x7f09723f, float:1.8269744E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.f260836f = r0
            r0 = 2131325502(0x7f09723e, float:1.8269741E38)
            android.view.View r0 = r13.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r13.f260837g = r0
            android.widget.Button r0 = r13.f260834d
            com.tencent.mm.plugin.wallet_core.id_verify.t3 r1 = new com.tencent.mm.plugin.wallet_core.id_verify.t3
            r1.<init>(r13)
            r0.setOnClickListener(r1)
            java.lang.String r0 = " dddd time="
            gm0.j1.i()
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REALNAME_SWITCH_WORDING_STRING_SYNC
            java.lang.String r3 = ""
            java.lang.Object r1 = r1.m(r2, r3)
            r2 = 0
            r4 = 0
            java.lang.String r5 = "MicroMsg.WcPayRealnameVerifyMainUI"
            if (r1 == 0) goto Lab
            java.lang.String r1 = (java.lang.String) r1
            boolean r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r6 != 0) goto Lab
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L9f
            r6.<init>(r1)     // Catch: org.json.JSONException -> L9f
            long r7 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L9f
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            java.lang.String r1 = "timestamp"
            long r9 = r6.getLong(r1)     // Catch: org.json.JSONException -> L9f
            java.lang.String r1 = "cache_time"
            long r11 = r6.getLong(r1)     // Catch: org.json.JSONException -> L9f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L9f
            r1.<init>(r0)     // Catch: org.json.JSONException -> L9f
            r1.append(r7)     // Catch: org.json.JSONException -> L9f
            java.lang.String r0 = ";timestamp="
            r1.append(r0)     // Catch: org.json.JSONException -> L9f
            r1.append(r9)     // Catch: org.json.JSONException -> L9f
            java.lang.String r0 = ";cachetime="
            r1.append(r0)     // Catch: org.json.JSONException -> L9f
            r1.append(r11)     // Catch: org.json.JSONException -> L9f
            java.lang.String r0 = r1.toString()     // Catch: org.json.JSONException -> L9f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r0)     // Catch: org.json.JSONException -> L9f
            long r7 = r7 - r9
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 <= 0) goto L9d
            java.lang.String r0 = "wording data from cache is out of date"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r0)     // Catch: org.json.JSONException -> L9f
            goto Lb0
        L9d:
            r4 = r6
            goto Lb0
        L9f:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r5, r0, r3, r1)
            java.lang.String r0 = "parse wording data form cache error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r0)
            goto Lb0
        Lab:
            java.lang.String r0 = "cache is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r0)
        Lb0:
            if (r4 == 0) goto Lf4
            java.lang.String r0 = "cache_header_titles"
            r1 = 2131777577(0x7f105829, float:1.9186659E38)
            java.lang.String r3 = r13.getString(r1)
            java.lang.String r0 = r4.optString(r0, r3)
            java.lang.String r1 = r13.getString(r1)
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            if (r0 != 0) goto Lc8
            r0 = r1
        Lc8:
            android.widget.TextView r1 = r13.f260835e
            r1.setText(r0)
            java.lang.String r0 = "isShowCapitalSecurity"
            boolean r0 = r4.optBoolean(r0, r2)
            if (r0 == 0) goto Led
            android.widget.TextView r0 = r13.f260836f
            r1 = 2131779707(0x7f10607b, float:1.9190979E38)
            r0.setText(r1)
            android.view.ViewGroup r0 = r13.f260837g
            com.tencent.mm.plugin.wallet_core.id_verify.u3 r1 = new com.tencent.mm.plugin.wallet_core.id_verify.u3
            r1.<init>(r13)
            r0.setOnClickListener(r1)
            android.view.ViewGroup r0 = r13.f260837g
            r0.setVisibility(r2)
            goto Lf4
        Led:
            android.view.ViewGroup r0 = r13.f260837g
            r1 = 8
            r0.setVisibility(r1)
        Lf4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19083x6e91f3eb.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ca caVar = this.f260838h;
            if (i18 == -1) {
                caVar.a(intent);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.aa aaVar = caVar.f261715g;
                if (aaVar != null) {
                    aaVar.mo25351xae7a2e7a();
                }
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        this.f260838h.f261714f = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.q3(this);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.r3(this));
        java.lang.String string = m83105x7498fe14().getString("realname_verify_process_get_wording_cache");
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                r45.lm3 lm3Var = (r45.lm3) new r45.lm3().mo11468x92b714fd(string.getBytes(s46.a.f484534a));
                this.f260839i = lm3Var.f461152z;
                r45.q34 q34Var = lm3Var.A;
                if (q34Var != null) {
                    com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0.d(q34Var).g(this, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.v3(this));
                }
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WcPayRealnameVerifyMainUI", e17, "", new java.lang.Object[0]);
        }
        mo43517x10010bd5();
        this.f260840m.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f260838h.b();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f260838h.c();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
