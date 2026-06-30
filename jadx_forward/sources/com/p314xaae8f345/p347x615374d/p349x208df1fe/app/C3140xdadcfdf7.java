package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaRealNameManagerImpl */
/* loaded from: classes9.dex */
public class C3140xdadcfdf7 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3570xcb789b37 {

    /* renamed from: REQUEST_CODE_AGREEMENTS */
    public static final int f12068x507d9b6b = 911;

    /* renamed from: mPrivacyDutyHelper */
    private com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ca f12070x4513fadf;
    private final java.lang.String TAG = "KindaRealNameManagerImpl";

    /* renamed from: KEY_PROCESS_ID */
    private final java.lang.String f12069x9900130b = "process_id";

    /* renamed from: privacyDutyIListener */
    private final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f12071x1db36f5f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6281x53bb9e6>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.kinda.framework.app.KindaRealNameManagerImpl.1
        {
            this.f39173x3fe91575 = 758220246;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6281x53bb9e6 c6281x53bb9e6) {
            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3140xdadcfdf7.this.f12070x4513fadf == null) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaRealNameManagerImpl", "privacyDutyIListener callback：%s", java.lang.Boolean.valueOf(c6281x53bb9e6.f136530g.f89956a));
            am.y20 y20Var = c6281x53bb9e6.f136530g;
            if (y20Var.f89956a) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_marketing_switch_closed", y20Var.f89957b);
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3140xdadcfdf7.this.f12070x4513fadf.a(intent);
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.aa aaVar = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3140xdadcfdf7.this.f12070x4513fadf.f261715g;
            if (aaVar == null) {
                return true;
            }
            aaVar.mo25351xae7a2e7a();
            return true;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resetPrivacyDutyHelper */
    public void m25342xb6e2fe3d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ca caVar = this.f12070x4513fadf;
        if (caVar != null) {
            caVar.f261712d = false;
            caVar.b();
            this.f12070x4513fadf.getClass();
            this.f12070x4513fadf = null;
            this.f12071x1db36f5f.mo48814x2efc64();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3570xcb789b37
    /* renamed from: callPrivacyDutyPageImpl */
    public void mo25343xc500f2af(final com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f abstractC3628xfac5d5f) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaRealNameManagerImpl", "callPrivacyDutyPageImpl");
        final android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (!(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaRealNameManagerImpl", "Fail to start callPrivacyDutyPageImpl due to incompatible context(%s)", context.getClass().getName());
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
            m27539xaf65a0fc.mo27556xf2e34299("agree", false);
            abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ca caVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ca();
        this.f12070x4513fadf = caVar;
        caVar.f261714f = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ba() { // from class: com.tencent.kinda.framework.app.KindaRealNameManagerImpl.3
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ba
            /* renamed from: getContext */
            public android.content.Context mo25348x76847179() {
                return context;
            }

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ba
            /* renamed from: getShowAgreenRequestCode */
            public int mo25349xc7cead47() {
                return com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3140xdadcfdf7.f12068x507d9b6b;
            }
        };
        this.f12070x4513fadf.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ca caVar2 = this.f12070x4513fadf;
        caVar2.f261713e = true;
        caVar2.d(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.aa() { // from class: com.tencent.kinda.framework.app.KindaRealNameManagerImpl.4
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.aa
            /* renamed from: agree */
            public void mo25350x58772ac(android.content.Intent intent) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc2 = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                m27539xaf65a0fc2.mo27556xf2e34299("agree", true);
                if (intent != null) {
                    m27539xaf65a0fc2.mo27556xf2e34299("marketingSwitchClosed", intent.getBooleanExtra("key_marketing_switch_closed", false));
                }
                abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc2);
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3140xdadcfdf7.this.m25342xb6e2fe3d();
            }

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.aa
            /* renamed from: cancel */
            public void mo25351xae7a2e7a() {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc2 = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                m27539xaf65a0fc2.mo27556xf2e34299("agree", false);
                abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc2);
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3140xdadcfdf7.this.m25342xb6e2fe3d();
            }

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.aa
            /* renamed from: nothing */
            public void mo25352x7eeae7cd() {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc2 = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                m27539xaf65a0fc2.mo27556xf2e34299("agree", true);
                abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc2);
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3140xdadcfdf7.this.m25342xb6e2fe3d();
            }
        }, true);
        this.f12071x1db36f5f.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3570xcb789b37
    /* renamed from: goToRealNameInputUIImpl */
    public void mo25344xc63f1392(final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaRealNameManagerImpl", "go to realname input ui");
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (!(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaRealNameManagerImpl", "Fail to start go to realname input ui, due to incompatible context(%s)", context.getClass().getName());
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        abstractActivityC21394xb3d2c0cf.getIntent().putExtra("process_id", com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a.class.hashCode());
        boolean mo27542xfb7da360 = abstractC3411xcfaed72e.mo27542xfb7da360("marketingSwitchClosed");
        boolean mo27542xfb7da3602 = abstractC3411xcfaed72e.mo27542xfb7da360("isFromCashier");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_marketing_switch_closed", mo27542xfb7da360);
        bundle.putString("start_activity_class", abstractActivityC21394xb3d2c0cf.getClass().getName());
        bundle.putBoolean("directGotoInputUI", true);
        bundle.putBoolean("is_from_new_cashier", mo27542xfb7da3602);
        if (mo27542xfb7da3602) {
            bundle.putInt("realname_verify_process_from_scene", 8);
        } else {
            bundle.putInt("realname_verify_process_from_scene", 3);
        }
        com.p314xaae8f345.mm.p2802xd031a825.a.j(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a.class, bundle, null);
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(abstractActivityC21394xb3d2c0cf);
        if (!(g17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaRealNameManagerImpl", "Fail to get correct wallet process in KindaRealNameManagerImpl, expect RealNameVerifyProcess got %s", g17.getClass().getName());
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a) g17).f260857n = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.r() { // from class: com.tencent.kinda.framework.app.KindaRealNameManagerImpl.5
                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.r
                public void run(android.app.Activity activity) {
                    if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19084x72adb339)) {
                        abstractC3623x3b4856192.mo25801x2e7a5e();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaRealNameManagerImpl", "process end");
                        abstractC3623x3b485619.mo25801x2e7a5e();
                    }
                }
            };
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3570xcb789b37
    /* renamed from: reportRealnameAction */
    public void mo25345x4f72f313(int i17) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r0(i17, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1012);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3570xcb789b37
    /* renamed from: startRealNameImpl */
    public void mo25346xea0be88b(final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaRealNameManagerImpl", "kinda content is null, fail to start realname");
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaRealNameManagerImpl", "Fail to start KindaRealNameManagerImpl due to incompatible context(%s)", context.getClass().getName());
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        activity.getIntent().putExtra("process_id", com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a.class.hashCode());
        int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("reportScene");
        if (mo27544xb58848b9 == 0) {
            mo27544xb58848b9 = 2;
        }
        int mo27544xb58848b92 = abstractC3411xcfaed72e.mo27544xb58848b9("realname_entry_scene");
        boolean mo27542xfb7da360 = abstractC3411xcfaed72e.mo27542xfb7da360("isFromCashier");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("realname_verify_process_jump_activity", activity.getClass().getName());
        bundle.putInt("real_name_verify_mode", 0);
        bundle.putInt("entry_scene", mo27544xb58848b9);
        bundle.putBoolean("process_finish_stay_orgpage", false);
        bundle.putBoolean("is_from_new_cashier", mo27542xfb7da360);
        bundle.putString("start_activity_class", activity.getClass().getName());
        bundle.putInt("realname_entry_scene", mo27544xb58848b92);
        bundle.putInt("realname_payScene", abstractC3411xcfaed72e.mo27544xb58848b9("payScene"));
        if (mo27542xfb7da360) {
            bundle.putInt("realname_verify_process_from_scene", 8);
        } else if (abstractC3411xcfaed72e.mo27544xb58848b9("real_name_entry_scene") == 1) {
            bundle.putInt("realname_verify_process_from_scene", 3);
        } else if (mo27544xb58848b9 == 8) {
            bundle.putInt("realname_verify_process_from_scene", 4);
        } else if (mo27544xb58848b9 == 1013) {
            bundle.putInt("realname_verify_process_from_scene", 39);
        } else if (mo27544xb58848b9 == 1009) {
            bundle.putInt("realname_verify_process_from_scene", 1);
        } else if (mo27544xb58848b9 == 1007) {
            bundle.putInt("realname_verify_process_from_scene", 2);
        } else if (mo27544xb58848b9 == 1014) {
            bundle.putInt("realname_verify_process_from_scene", 52);
        }
        if (!mo27542xfb7da360) {
            bundle.putString("realname_verify_process_jump_plugin", "wallet_core");
        }
        if (mo27544xb58848b9 == 1014) {
            bundle.putString("realname_verify_process_jump_activity", "");
            bundle.putString("realname_verify_process_jump_plugin", "");
        }
        com.p314xaae8f345.mm.p2802xd031a825.a.j(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a.class, bundle, null);
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(activity);
        if (!(g17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaRealNameManagerImpl", "Fail to get correct wallet process in KindaRealNameManagerImpl, expect RealNameVerifyProcess got %s", g17.getClass().getName());
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a) g17).f260857n = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.r() { // from class: com.tencent.kinda.framework.app.KindaRealNameManagerImpl.2
                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.r
                public void run(android.app.Activity activity2) {
                    if (activity2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19084x72adb339) {
                        abstractC3623x3b485619.mo25801x2e7a5e();
                    } else {
                        abstractC3623x3b4856192.mo25801x2e7a5e();
                    }
                }
            };
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3570xcb789b37
    /* renamed from: startRealNameVerifyPhone */
    public void mo25347x87a3aa(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaRealNameManagerImpl", "verify phone from realname mgr");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5664x24fbc67f c5664x24fbc67f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5664x24fbc67f();
        am.ei eiVar = c5664x24fbc67f.f135988g;
        eiVar.f88090a = str;
        eiVar.f88091b = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        c5664x24fbc67f.e();
    }
}
