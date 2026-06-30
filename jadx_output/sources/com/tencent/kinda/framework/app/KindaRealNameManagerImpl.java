package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KindaRealNameManagerImpl implements com.tencent.kinda.gen.KindaRealNameManager {
    public static final int REQUEST_CODE_AGREEMENTS = 911;
    private com.tencent.mm.plugin.wallet_core.ui.ca mPrivacyDutyHelper;
    private final java.lang.String TAG = "KindaRealNameManagerImpl";
    private final java.lang.String KEY_PROCESS_ID = "process_id";
    private final com.tencent.mm.sdk.event.IListener privacyDutyIListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WxPayPrivacyDutyResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.kinda.framework.app.KindaRealNameManagerImpl.1
        {
            this.__eventId = 758220246;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WxPayPrivacyDutyResultEvent wxPayPrivacyDutyResultEvent) {
            if (com.tencent.kinda.framework.app.KindaRealNameManagerImpl.this.mPrivacyDutyHelper == null) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("KindaRealNameManagerImpl", "privacyDutyIListener callback：%s", java.lang.Boolean.valueOf(wxPayPrivacyDutyResultEvent.f54997g.f8423a));
            am.y20 y20Var = wxPayPrivacyDutyResultEvent.f54997g;
            if (y20Var.f8423a) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_marketing_switch_closed", y20Var.f8424b);
                com.tencent.kinda.framework.app.KindaRealNameManagerImpl.this.mPrivacyDutyHelper.a(intent);
                return true;
            }
            com.tencent.mm.plugin.wallet_core.ui.aa aaVar = com.tencent.kinda.framework.app.KindaRealNameManagerImpl.this.mPrivacyDutyHelper.f180182g;
            if (aaVar == null) {
                return true;
            }
            aaVar.cancel();
            return true;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void resetPrivacyDutyHelper() {
        com.tencent.mm.plugin.wallet_core.ui.ca caVar = this.mPrivacyDutyHelper;
        if (caVar != null) {
            caVar.f180179d = false;
            caVar.b();
            this.mPrivacyDutyHelper.getClass();
            this.mPrivacyDutyHelper = null;
            this.privacyDutyIListener.dead();
        }
    }

    @Override // com.tencent.kinda.gen.KindaRealNameManager
    public void callPrivacyDutyPageImpl(final com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        com.tencent.mars.xlog.Log.i("KindaRealNameManagerImpl", "callPrivacyDutyPageImpl");
        final android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (!(context instanceof com.tencent.mm.ui.MMActivity)) {
            com.tencent.mars.xlog.Log.e("KindaRealNameManagerImpl", "Fail to start callPrivacyDutyPageImpl due to incompatible context(%s)", context.getClass().getName());
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            create.putBool("agree", false);
            voidITransmitKvDataCallback.call(create);
            return;
        }
        com.tencent.mm.plugin.wallet_core.ui.ca caVar = new com.tencent.mm.plugin.wallet_core.ui.ca();
        this.mPrivacyDutyHelper = caVar;
        caVar.f180181f = new com.tencent.mm.plugin.wallet_core.ui.ba() { // from class: com.tencent.kinda.framework.app.KindaRealNameManagerImpl.3
            @Override // com.tencent.mm.plugin.wallet_core.ui.ba
            public android.content.Context getContext() {
                return context;
            }

            @Override // com.tencent.mm.plugin.wallet_core.ui.ba
            public int getShowAgreenRequestCode() {
                return com.tencent.kinda.framework.app.KindaRealNameManagerImpl.REQUEST_CODE_AGREEMENTS;
            }
        };
        this.mPrivacyDutyHelper.c();
        com.tencent.mm.plugin.wallet_core.ui.ca caVar2 = this.mPrivacyDutyHelper;
        caVar2.f180180e = true;
        caVar2.d(new com.tencent.mm.plugin.wallet_core.ui.aa() { // from class: com.tencent.kinda.framework.app.KindaRealNameManagerImpl.4
            @Override // com.tencent.mm.plugin.wallet_core.ui.aa
            public void agree(android.content.Intent intent) {
                com.tencent.kinda.gen.ITransmitKvData create2 = com.tencent.kinda.gen.ITransmitKvData.create();
                create2.putBool("agree", true);
                if (intent != null) {
                    create2.putBool("marketingSwitchClosed", intent.getBooleanExtra("key_marketing_switch_closed", false));
                }
                voidITransmitKvDataCallback.call(create2);
                com.tencent.kinda.framework.app.KindaRealNameManagerImpl.this.resetPrivacyDutyHelper();
            }

            @Override // com.tencent.mm.plugin.wallet_core.ui.aa
            public void cancel() {
                com.tencent.kinda.gen.ITransmitKvData create2 = com.tencent.kinda.gen.ITransmitKvData.create();
                create2.putBool("agree", false);
                voidITransmitKvDataCallback.call(create2);
                com.tencent.kinda.framework.app.KindaRealNameManagerImpl.this.resetPrivacyDutyHelper();
            }

            @Override // com.tencent.mm.plugin.wallet_core.ui.aa
            public void nothing() {
                com.tencent.kinda.gen.ITransmitKvData create2 = com.tencent.kinda.gen.ITransmitKvData.create();
                create2.putBool("agree", true);
                voidITransmitKvDataCallback.call(create2);
                com.tencent.kinda.framework.app.KindaRealNameManagerImpl.this.resetPrivacyDutyHelper();
            }
        }, true);
        this.privacyDutyIListener.alive();
    }

    @Override // com.tencent.kinda.gen.KindaRealNameManager
    public void goToRealNameInputUIImpl(final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidCallback voidCallback2, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        com.tencent.mars.xlog.Log.i("KindaRealNameManagerImpl", "go to realname input ui");
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (!(context instanceof com.tencent.mm.ui.MMActivity)) {
            com.tencent.mars.xlog.Log.e("KindaRealNameManagerImpl", "Fail to start go to realname input ui, due to incompatible context(%s)", context.getClass().getName());
            return;
        }
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        mMActivity.getIntent().putExtra("process_id", com.tencent.mm.plugin.wallet_core.id_verify.a.class.hashCode());
        boolean bool = iTransmitKvData.getBool("marketingSwitchClosed");
        boolean bool2 = iTransmitKvData.getBool("isFromCashier");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_marketing_switch_closed", bool);
        bundle.putString("start_activity_class", mMActivity.getClass().getName());
        bundle.putBoolean("directGotoInputUI", true);
        bundle.putBoolean("is_from_new_cashier", bool2);
        if (bool2) {
            bundle.putInt("realname_verify_process_from_scene", 8);
        } else {
            bundle.putInt("realname_verify_process_from_scene", 3);
        }
        com.tencent.mm.wallet_core.a.j(mMActivity, com.tencent.mm.plugin.wallet_core.id_verify.a.class, bundle, null);
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(mMActivity);
        if (!(g17 instanceof com.tencent.mm.plugin.wallet_core.id_verify.a)) {
            com.tencent.mars.xlog.Log.e("KindaRealNameManagerImpl", "Fail to get correct wallet process in KindaRealNameManagerImpl, expect RealNameVerifyProcess got %s", g17.getClass().getName());
        } else {
            ((com.tencent.mm.plugin.wallet_core.id_verify.a) g17).f179324n = new com.tencent.mm.plugin.wallet_core.id_verify.r() { // from class: com.tencent.kinda.framework.app.KindaRealNameManagerImpl.5
                @Override // com.tencent.mm.plugin.wallet_core.id_verify.r
                public void run(android.app.Activity activity) {
                    if (!(activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI)) {
                        voidCallback2.call();
                    } else {
                        com.tencent.mars.xlog.Log.i("KindaRealNameManagerImpl", "process end");
                        voidCallback.call();
                    }
                }
            };
        }
    }

    @Override // com.tencent.kinda.gen.KindaRealNameManager
    public void reportRealnameAction(int i17) {
        com.tencent.mm.wallet_core.ui.r1.r0(i17, 1, com.tencent.mm.sdk.platformtools.t8.i1(), 1012);
    }

    @Override // com.tencent.kinda.gen.KindaRealNameManager
    public void startRealNameImpl(final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidCallback voidCallback2, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e("KindaRealNameManagerImpl", "kinda content is null, fail to start realname");
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("KindaRealNameManagerImpl", "Fail to start KindaRealNameManagerImpl due to incompatible context(%s)", context.getClass().getName());
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        activity.getIntent().putExtra("process_id", com.tencent.mm.plugin.wallet_core.id_verify.a.class.hashCode());
        int i17 = iTransmitKvData.getInt("reportScene");
        if (i17 == 0) {
            i17 = 2;
        }
        int i18 = iTransmitKvData.getInt("realname_entry_scene");
        boolean bool = iTransmitKvData.getBool("isFromCashier");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("realname_verify_process_jump_activity", activity.getClass().getName());
        bundle.putInt("real_name_verify_mode", 0);
        bundle.putInt("entry_scene", i17);
        bundle.putBoolean("process_finish_stay_orgpage", false);
        bundle.putBoolean("is_from_new_cashier", bool);
        bundle.putString("start_activity_class", activity.getClass().getName());
        bundle.putInt("realname_entry_scene", i18);
        bundle.putInt("realname_payScene", iTransmitKvData.getInt("payScene"));
        if (bool) {
            bundle.putInt("realname_verify_process_from_scene", 8);
        } else if (iTransmitKvData.getInt("real_name_entry_scene") == 1) {
            bundle.putInt("realname_verify_process_from_scene", 3);
        } else if (i17 == 8) {
            bundle.putInt("realname_verify_process_from_scene", 4);
        } else if (i17 == 1013) {
            bundle.putInt("realname_verify_process_from_scene", 39);
        } else if (i17 == 1009) {
            bundle.putInt("realname_verify_process_from_scene", 1);
        } else if (i17 == 1007) {
            bundle.putInt("realname_verify_process_from_scene", 2);
        } else if (i17 == 1014) {
            bundle.putInt("realname_verify_process_from_scene", 52);
        }
        if (!bool) {
            bundle.putString("realname_verify_process_jump_plugin", "wallet_core");
        }
        if (i17 == 1014) {
            bundle.putString("realname_verify_process_jump_activity", "");
            bundle.putString("realname_verify_process_jump_plugin", "");
        }
        com.tencent.mm.wallet_core.a.j(activity, com.tencent.mm.plugin.wallet_core.id_verify.a.class, bundle, null);
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(activity);
        if (!(g17 instanceof com.tencent.mm.plugin.wallet_core.id_verify.a)) {
            com.tencent.mars.xlog.Log.e("KindaRealNameManagerImpl", "Fail to get correct wallet process in KindaRealNameManagerImpl, expect RealNameVerifyProcess got %s", g17.getClass().getName());
        } else {
            ((com.tencent.mm.plugin.wallet_core.id_verify.a) g17).f179324n = new com.tencent.mm.plugin.wallet_core.id_verify.r() { // from class: com.tencent.kinda.framework.app.KindaRealNameManagerImpl.2
                @Override // com.tencent.mm.plugin.wallet_core.id_verify.r
                public void run(android.app.Activity activity2) {
                    if (activity2 instanceof com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI) {
                        voidCallback.call();
                    } else {
                        voidCallback2.call();
                    }
                }
            };
        }
    }

    @Override // com.tencent.kinda.gen.KindaRealNameManager
    public void startRealNameVerifyPhone(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("KindaRealNameManagerImpl", "verify phone from realname mgr");
        com.tencent.mm.autogen.events.KindaBindCardVerifyPhoneEvent kindaBindCardVerifyPhoneEvent = new com.tencent.mm.autogen.events.KindaBindCardVerifyPhoneEvent();
        am.ei eiVar = kindaBindCardVerifyPhoneEvent.f54455g;
        eiVar.f6557a = str;
        eiVar.f6558b = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        kindaBindCardVerifyPhoneEvent.e();
    }
}
