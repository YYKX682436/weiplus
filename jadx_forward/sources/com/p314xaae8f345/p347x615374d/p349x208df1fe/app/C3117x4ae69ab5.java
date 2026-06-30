package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KPaySettingsServiceImpl */
/* loaded from: classes9.dex */
public class C3117x4ae69ab5 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5 {
    private static final java.lang.String TAG = "MicroMsg.KPaySettingsServiceImpl";

    /* renamed from: _hellAccFlag_ */
    private byte f11920x7f11beae;

    /* renamed from: bioPayProcessCallback */
    private com.p314xaae8f345.mm.p2802xd031a825.g f11921xba196d34 = null;

    /* renamed from: closeBioPay */
    private void m25046xecb0ae98(final int i17, final com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f abstractC3628xfac5d5f) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_g);
        if (i17 == 2) {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8s);
        }
        db5.e1.K(context, false, string, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lda), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.app.KPaySettingsServiceImpl.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                final android.app.Dialog e17 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), false, false, null);
                final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5274xb33ae62e c5274xb33ae62e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5274xb33ae62e();
                c5274xb33ae62e.f135598g.f87965a = i17;
                c5274xb33ae62e.f273897d = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KPaySettingsServiceImpl.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (c5274xb33ae62e.f135599h == null) {
                            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                            m27539xaf65a0fc.mo27556xf2e34299("result", false);
                            abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc);
                            return;
                        }
                        android.app.Dialog dialog = e17;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3117x4ae69ab5.TAG, "close event result: %s", java.lang.Integer.valueOf(c5274xb33ae62e.f135599h.f88068a));
                        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc2 = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                        if (c5274xb33ae62e.f135599h.f88068a == 0) {
                            gm0.j1.n().f354821b.g(new ss4.e0(null, 19));
                            m27539xaf65a0fc2.mo27556xf2e34299("result", true);
                            abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc2);
                            return;
                        }
                        android.content.Context context2 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
                        java.lang.String string2 = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_h);
                        if (i17 == 2) {
                            string2 = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kud);
                        }
                        db5.e1.F(context2, string2, "", true);
                        m27539xaf65a0fc2.mo27556xf2e34299("result", false);
                        abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc2);
                    }
                };
                c5274xb33ae62e.b(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get().getMainLooper());
            }
        }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.app.KPaySettingsServiceImpl.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                m27539xaf65a0fc.mo27556xf2e34299("result", false);
                abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc);
            }
        });
    }

    /* renamed from: getRedDotConfig */
    private org.json.JSONObject m25047xd6c026d0() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                return new org.json.JSONObject(str);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    /* renamed from: normalizedReddotId */
    private java.lang.String m25048x97e65a6a(java.lang.String str) {
        return str + "_BOOLEAN_SYNC";
    }

    /* renamed from: showEnrollBiometricGuideAlert */
    private void m25049x4cd76395(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "show enroll biometric guide: %s", java.lang.Integer.valueOf(i17));
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kur);
        if (i17 == 1) {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kut);
        }
        db5.e1.y(context, string, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kuq), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.app.KPaySettingsServiceImpl.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i18) {
            }
        });
    }

    /* renamed from: startOpenBioPayProcess */
    private void m25050xc8abc563(int i17, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, final com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f abstractC3628xfac5d5f) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start open process: %s", java.lang.Integer.valueOf(i17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_open_biometric_type", i17);
        if (abstractC3411xcfaed72e != null) {
            java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("bus_info");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec8307)) {
                bundle.putString("bus_info", mo27551x2fec8307);
            }
        }
        android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        com.p314xaae8f345.mm.p2802xd031a825.g gVar = new com.p314xaae8f345.mm.p2802xd031a825.g() { // from class: com.tencent.kinda.framework.app.KPaySettingsServiceImpl.2
            @Override // com.p314xaae8f345.mm.p2802xd031a825.g
            /* renamed from: onProcessEnd */
            public android.content.Intent mo14634xe047072b(int i18, android.os.Bundle bundle2) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                if ((bundle2 != null ? bundle2.getInt("key_process_err_code", -1) : -1) == 0) {
                    m27539xaf65a0fc.mo27556xf2e34299("result", true);
                    java.lang.String string = bundle2.getString("token");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                        m27539xaf65a0fc.mo27566xe4673800("token", string);
                    }
                    abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc);
                } else {
                    m27539xaf65a0fc.mo27556xf2e34299("result", false);
                    abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc);
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3117x4ae69ab5.this.f11921xba196d34 = null;
                return null;
            }
        };
        this.f11921xba196d34 = gVar;
        com.p314xaae8f345.mm.p2802xd031a825.a.k(m27313x7608d9c4, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.f47003xb618721a, "FingerprintAuth", bundle, gVar);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: commitHbRefundWayTypeChange */
    public void mo25051x6136af0() {
        r45.oo4 oo4Var = new r45.oo4();
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC, 0L)).longValue();
        if ((longValue & 1) != 0) {
            oo4Var.f463929d = 1L;
            oo4Var.f463930e = 2L;
        } else if ((longValue & 2) != 0) {
            oo4Var.f463929d = 2L;
            oo4Var.f463930e = 1L;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "doSettingsOplog: extStatus: %s, set_bitmask: %s, clear_bitmask:%s", java.lang.Long.toBinaryString(longValue), java.lang.Long.toBinaryString(oo4Var.f463929d), java.lang.Long.toBinaryString(oo4Var.f463930e));
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(218, oo4Var));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: commitTransferDelayTypeChange */
    public void mo25052x718c96cb() {
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().l(147457, 0L)).longValue();
        int i17 = (16 & longValue) != 0 ? 1 : (longValue & 32) != 0 ? 2 : 0;
        r45.po4 po4Var = new r45.po4();
        po4Var.f464786d = i17;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(205, po4Var));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: getHbRefundWayType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3467x2a09e18c mo25053x341cfb21() {
        gm0.j1.i();
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B0(((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC, 0L)).longValue() & 3, 2L) ? com.p314xaae8f345.p347x615374d.gen.EnumC3467x2a09e18c.ORIGIN : com.p314xaae8f345.p347x615374d.gen.EnumC3467x2a09e18c.LQ;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: getReddotStatus */
    public boolean mo25054x7adc53a0(java.lang.String str) {
        gm0.j1.i();
        return ((java.lang.Boolean) gm0.j1.u().c().p(m25048x97e65a6a(str), java.lang.Boolean.FALSE)).booleanValue();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: getTransferDelayType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3538xb2ede2a7 mo25055x84a0eafc() {
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().l(147457, 0L)).longValue();
        return (16 & longValue) != 0 ? com.p314xaae8f345.p347x615374d.gen.EnumC3538xb2ede2a7.DELAY2HOUR : (longValue & 32) != 0 ? com.p314xaae8f345.p347x615374d.gen.EnumC3538xb2ede2a7.DELAY24HOUR : com.p314xaae8f345.p347x615374d.gen.EnumC3538xb2ede2a7.NODELAY;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: getTransferPhoneGrantFlag */
    public int mo25056xec0aa89b() {
        gm0.j1.i();
        return ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MOBILE_REMITTANCE_SWITCH_GRANT_FLAG_INT_SYNC, 2)).intValue();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: getUnexpiredXMLReddot */
    public com.p314xaae8f345.p347x615374d.gen.C3553x183cf754 mo25057x697e92f9(java.lang.String str) {
        org.json.JSONObject m25047xd6c026d0 = m25047xd6c026d0();
        if (m25047xd6c026d0 == null) {
            return new com.p314xaae8f345.p347x615374d.gen.C3553x183cf754("", 0L, "");
        }
        if (!(m25047xd6c026d0.optInt(str, 0) == 1)) {
            return new com.p314xaae8f345.p347x615374d.gen.C3553x183cf754("", 0L, "");
        }
        long optLong = m25047xd6c026d0.optLong(java.lang.String.format("%s_expiretime", str), 0L);
        if (optLong <= 0 || java.lang.System.currentTimeMillis() <= optLong) {
            return new com.p314xaae8f345.p347x615374d.gen.C3553x183cf754(str, optLong, m25047xd6c026d0.optString(java.lang.String.format("%s_wording", str)));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Reddot expired: %s, expireTime=%d", str, java.lang.Long.valueOf(optLong));
        return new com.p314xaae8f345.p347x615374d.gen.C3553x183cf754("", 0L, "");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: handlePushBioPaySettingPageImpl */
    public void mo25058xb160c8dd(final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        android.os.ResultReceiver resultReceiver = new android.os.ResultReceiver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: com.tencent.kinda.framework.app.KPaySettingsServiceImpl.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                abstractC3623x3b485619.mo25801x2e7a5e();
            }
        };
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19041xb051660.class);
        intent.putExtra("key_should_update_result_receiver", resultReceiver);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/kinda/framework/app/KPaySettingsServiceImpl", "handlePushBioPaySettingPageImpl", "(Lcom/tencent/kinda/gen/VoidCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/kinda/framework/app/KPaySettingsServiceImpl", "handlePushBioPaySettingPageImpl", "(Lcom/tencent/kinda/gen/VoidCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: isBioPayTypeEnabled */
    public boolean mo25059xb5e923fd(com.p314xaae8f345.p347x615374d.gen.EnumC3429xa8ed3c85 enumC3429xa8ed3c85) {
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        return enumC3429xa8ed3c85 == com.p314xaae8f345.p347x615374d.gen.EnumC3429xa8ed3c85.FACEID ? ((mz2.a) aVar).b() : ((mz2.a) aVar).a();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: logGeneralUserAction */
    public void mo25060xb9800205(int i17) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(i17, 1);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: markReddotConsumed */
    public void mo25061xde786f4d(java.lang.String str) {
        gm0.j1.i();
        gm0.j1.u().c().y(m25048x97e65a6a(str), java.lang.Boolean.TRUE);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: markXMLReddotConsumed */
    public void mo25062xbb0737ca(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "clear reddot: %s", str);
        org.json.JSONObject m25047xd6c026d0 = m25047xd6c026d0();
        if (m25047xd6c026d0 == null) {
            return;
        }
        m25047xd6c026d0.remove(str);
        m25047xd6c026d0.remove(java.lang.String.format("%s_expiretime", str));
        m25047xd6c026d0.remove(java.lang.String.format("%s_wording", str));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, m25047xd6c026d0.toString());
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: setBioPayTypeEnabledImpl */
    public void mo25063x27223785(com.p314xaae8f345.p347x615374d.gen.EnumC3429xa8ed3c85 enumC3429xa8ed3c85, boolean z17, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f abstractC3628xfac5d5f) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet").putInt("MMKV_KEY_SOTER_OPEN_SCENE", 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "open bio pay, open scene is 1");
        if (enumC3429xa8ed3c85 == com.p314xaae8f345.p347x615374d.gen.EnumC3429xa8ed3c85.FACEID) {
            if (!z17) {
                m25046xecb0ae98(2, abstractC3628xfac5d5f);
                return;
            }
            if (is4.a.b()) {
                m25050xc8abc563(2, abstractC3411xcfaed72e, abstractC3628xfac5d5f);
                return;
            }
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
            m27539xaf65a0fc.mo27556xf2e34299("result", false);
            abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc);
            m25049x4cd76395(2);
            return;
        }
        if (enumC3429xa8ed3c85 == com.p314xaae8f345.p347x615374d.gen.EnumC3429xa8ed3c85.TOUCHID) {
            if (!z17) {
                m25046xecb0ae98(1, abstractC3628xfac5d5f);
                return;
            }
            if (is4.a.c()) {
                m25050xc8abc563(1, abstractC3411xcfaed72e, abstractC3628xfac5d5f);
                return;
            }
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc2 = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
            m27539xaf65a0fc2.mo27556xf2e34299("result", false);
            abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc2);
            m25049x4cd76395(1);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: setHbRefundWayType */
    public void mo25064x6af39495(com.p314xaae8f345.p347x615374d.gen.EnumC3467x2a09e18c enumC3467x2a09e18c) {
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        if (enumC3467x2a09e18c == com.p314xaae8f345.p347x615374d.gen.EnumC3467x2a09e18c.LQ) {
            longValue = (longValue | 1) & (-3);
        } else if (enumC3467x2a09e18c == com.p314xaae8f345.p347x615374d.gen.EnumC3467x2a09e18c.ORIGIN) {
            longValue = (longValue & (-2)) | 2;
        }
        gm0.j1.i();
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(longValue));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: setTransferDelayType */
    public void mo25065x6036f770(com.p314xaae8f345.p347x615374d.gen.EnumC3538xb2ede2a7 enumC3538xb2ede2a7) {
        long j17;
        long j18;
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().l(147457, 0L)).longValue();
        if (enumC3538xb2ede2a7 == com.p314xaae8f345.p347x615374d.gen.EnumC3538xb2ede2a7.NODELAY) {
            longValue = longValue & (-17) & (-33);
        } else {
            if (enumC3538xb2ede2a7 == com.p314xaae8f345.p347x615374d.gen.EnumC3538xb2ede2a7.DELAY2HOUR) {
                j17 = longValue & (-33);
                j18 = 16;
            } else if (enumC3538xb2ede2a7 == com.p314xaae8f345.p347x615374d.gen.EnumC3538xb2ede2a7.DELAY24HOUR) {
                j17 = longValue & (-17);
                j18 = 32;
            }
            longValue = j17 | j18;
        }
        gm0.j1.i();
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(longValue));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: setTransferPhoneGrantFlag */
    public void mo25066x1e4e44a7(int i17) {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MOBILE_REMITTANCE_SWITCH_GRANT_FLAG_INT_SYNC, java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3497xdfda46f5
    /* renamed from: supportedBioPayTypes */
    public java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.EnumC3429xa8ed3c85> mo25067xcfeef44b() {
        java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.EnumC3429xa8ed3c85> arrayList = new java.util.ArrayList<>();
        if (is4.a.b()) {
            arrayList.add(com.p314xaae8f345.p347x615374d.gen.EnumC3429xa8ed3c85.FACEID);
        }
        if (is4.a.c()) {
            arrayList.add(com.p314xaae8f345.p347x615374d.gen.EnumC3429xa8ed3c85.TOUCHID);
        }
        return arrayList;
    }
}
