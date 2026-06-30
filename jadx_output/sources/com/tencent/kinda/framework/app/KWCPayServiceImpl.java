package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KWCPayServiceImpl implements com.tencent.kinda.gen.KWCPayService {
    private static final int REQUEST_CODE_FOR_WALLET_LOCK = 1001;
    private int mEntryScene;
    private int mPayChannel;
    private int mPayReceiptScene;
    private int mPayScene;
    private java.lang.String mUseCaseUrl;
    private final java.lang.String TAG = "MicroMsg.KWCPayServiceImpl";
    private com.tencent.kinda.gen.VoidITransmitKvDataCallback mQuitCallback = null;
    private com.tencent.kinda.gen.VoidITransmitKvDataNoticeItemCallback mBannerCallback = null;
    private com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletEndResultEvent> mWalletEndResultEventIListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletEndResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.kinda.framework.app.KWCPayServiceImpl.1
        {
            this.__eventId = -443741397;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletEndResultEvent walletEndResultEvent) {
            com.tencent.kinda.framework.app.KWCPayServiceImpl.this.mWalletEndResultEventIListener.dead();
            if (com.tencent.kinda.framework.app.KWCPayServiceImpl.this.mQuitCallback == null) {
                return false;
            }
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            if (walletEndResultEvent.f54953g.f6728a == -1) {
                create.putBool("result", true);
            } else {
                create.putBool("result", false);
            }
            com.tencent.kinda.framework.app.KWCPayServiceImpl.this.mQuitCallback.call(create);
            return false;
        }
    };

    private com.tencent.mm.pluginsdk.wallet.WalletJsapiData createJsapiData(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> it = iTransmitKvData.allKeys().iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            hashMap.put(next, iTransmitKvData.getString(next));
        }
        return new com.tencent.mm.pluginsdk.wallet.WalletJsapiData(hashMap);
    }

    private void doRealnameSceneProgress(android.content.Context context, int i17) {
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        mMActivity.getIntent().putExtra("process_id", com.tencent.mm.plugin.wallet_core.id_verify.a.class.hashCode());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("realname_verify_process_jump_activity", "kinda");
        bundle.putString("realname_verify_process_jump_plugin", "offline");
        bundle.putInt("real_name_verify_mode", 0);
        bundle.putInt("entry_scene", 8);
        bundle.putBoolean("process_finish_stay_orgpage", false);
        bundle.putBoolean("is_from_new_cashier", true);
        bundle.putString("start_activity_class", mMActivity.getClass().getName());
        bundle.putInt("realname_verify_process_from_scene", i17);
        com.tencent.mm.wallet_core.a.j(mMActivity, com.tencent.mm.plugin.wallet_core.id_verify.a.class, bundle, null);
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(mMActivity);
        if (!(g17 instanceof com.tencent.mm.plugin.wallet_core.id_verify.a)) {
            com.tencent.mars.xlog.Log.e("WCPayService", "Fail to get correct wallet process in KWCPayServiceImpl, expect RealNameVerifyProcess got %s", g17.getClass().getName());
        } else {
            ((com.tencent.mm.plugin.wallet_core.id_verify.a) g17).f179324n = new com.tencent.mm.plugin.wallet_core.id_verify.r() { // from class: com.tencent.kinda.framework.app.KWCPayServiceImpl.3
                @Override // com.tencent.mm.plugin.wallet_core.id_verify.r
                public void run(android.app.Activity activity) {
                    if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
                        if (com.tencent.kinda.framework.app.KWCPayServiceImpl.this.mUseCaseUrl.equalsIgnoreCase("receipt")) {
                            com.tencent.kinda.framework.app.KWCPayServiceImpl kWCPayServiceImpl = com.tencent.kinda.framework.app.KWCPayServiceImpl.this;
                            h45.a0.k(activity, kWCPayServiceImpl.getCollectReportScene(kWCPayServiceImpl.mEntryScene));
                        } else if (com.tencent.kinda.framework.app.KWCPayServiceImpl.this.mUseCaseUrl.equalsIgnoreCase("reward")) {
                            j45.l.h(activity, "collect", ".reward.ui.QrRewardMainUI");
                        }
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCollectReportScene(int i17) {
        if (i17 == 2) {
            return 1;
        }
        if (i17 == 1) {
            return 2;
        }
        if (i17 == 8) {
            return 4;
        }
        return i17 == 4 ? 6 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$addOfflinePayShortcut$0() {
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null || topOrUIPageFragmentActivity.isFinishing()) {
            return;
        }
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI.f152485q;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePayShortcutGuideUI", "showUnknownPermissionDialog");
        com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI.f152486r = new java.lang.ref.WeakReference(topOrUIPageFragmentActivity);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(topOrUIPageFragmentActivity, 1, 0);
        z2Var.i(com.tencent.mm.R.layout.elh);
        z2Var.m(topOrUIPageFragmentActivity.getString(com.tencent.mm.R.string.pem), topOrUIPageFragmentActivity.getString(com.tencent.mm.R.string.peo));
        com.tencent.mm.plugin.offline.ui.c1 c1Var = new com.tencent.mm.plugin.offline.ui.c1(z2Var);
        com.tencent.mm.plugin.offline.ui.d1 d1Var = new com.tencent.mm.plugin.offline.ui.d1(z2Var, topOrUIPageFragmentActivity);
        z2Var.D = c1Var;
        z2Var.E = d1Var;
        z2Var.l(com.tencent.mm.plugin.offline.ui.e1.f152606a);
        android.widget.LinearLayout linearLayout = z2Var.f212066r;
        if (linearLayout != null) {
            android.view.ViewParent parent = linearLayout.getParent();
            android.widget.FrameLayout frameLayout = parent instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) parent : null;
            if (frameLayout != null) {
                float f17 = topOrUIPageFragmentActivity.getResources().getDisplayMetrics().density;
                linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), (int) ((110 * f17) + 0.5f));
                android.widget.TextView textView = new android.widget.TextView(topOrUIPageFragmentActivity);
                textView.setText(topOrUIPageFragmentActivity.getString(com.tencent.mm.R.string.pen));
                textView.setTextColor(topOrUIPageFragmentActivity.getResources().getColor(com.tencent.mm.R.color.f478524a5));
                textView.setTextSize(14.0f);
                textView.setTypeface(android.graphics.Typeface.create("sans-serif-medium", 0));
                textView.setGravity(17);
                int i17 = (int) ((6 * f17) + 0.5f);
                int i18 = (int) ((4 * f17) + 0.5f);
                textView.setPadding(i17, i18, i17, i18);
                textView.setBackground(topOrUIPageFragmentActivity.getResources().getDrawable(com.tencent.mm.R.drawable.d7d));
                textView.setOnClickListener(new com.tencent.mm.plugin.offline.ui.b1(z2Var, topOrUIPageFragmentActivity));
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 81;
                layoutParams.bottomMargin = (int) ((58 * f17) + 0.5f);
                frameLayout.addView(textView, layoutParams);
            }
        }
        z2Var.C();
        com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI.f152485q = new java.lang.ref.WeakReference(z2Var);
        yo3.b.b("offlinePayShortcutFallbackShow", 2);
    }

    private boolean shouldShowFallbackDialog() {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_offlinepay_shortcut_skip_manufacturers, "oppo,realme,samsung", true);
        java.lang.String lowerCase = android.os.Build.MANUFACTURER.toLowerCase();
        for (java.lang.String str : Zi.split(",")) {
            if (str != null && str.trim().equalsIgnoreCase(lowerCase)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public void addOfflinePayShortcut() {
        android.app.Activity activity;
        com.tencent.mars.xlog.Log.i("MicroMsg.KWCPayServiceImpl", "addOfflinePayShortcut");
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.KWCPayServiceImpl", "addOfflinePayShortcut context is null");
            return;
        }
        if (isOfflinePayShortcutPinned()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KWCPayServiceImpl", "addOfflinePayShortcut: shortcut already pinned, show toast directly");
            yo3.b.b("offlinePayShortcutAlreadyExist", 2);
            java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
            if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                return;
            }
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.f211776c = activity.getString(com.tencent.mm.R.string.pel);
            e4Var.c();
            return;
        }
        ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
        ae0.e eVar = ae0.e.OTHER;
        ((zd0.e) hVar).getClass();
        int i18 = xp1.d.i(context, null, true, eVar, new zd0.e$$a()).f3379a;
        if (i18 != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KWCPayServiceImpl", "addOfflinePayShortcut: permission status=%d, add shortcut directly", java.lang.Integer.valueOf(i18));
            android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
            yo3.b.f464143a = topOrUIPageFragmentActivity != null ? new java.lang.ref.WeakReference(topOrUIPageFragmentActivity) : null;
            yo3.b.a(context);
            if (i18 == -1 && shouldShowFallbackDialog()) {
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.tencent.kinda.framework.app.KWCPayServiceImpl$$a(), 500L);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.KWCPayServiceImpl", "addOfflinePayShortcut: permission denied, show guide page");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI.f152485q;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI.class);
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI$Companion", "start", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI$Companion", "start", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public void checkWalletLockOpenStatusImpl(com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public void clearFreezeBalanceMsg() {
        com.tencent.mars.xlog.Log.i("WCPayService", "clearFreezeBalanceMsg");
        at4.a1.c("");
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public void getBannerInfoImpl(int i17, com.tencent.kinda.gen.VoidITransmitKvDataNoticeItemCallback voidITransmitKvDataNoticeItemCallback) {
        this.mBannerCallback = voidITransmitKvDataNoticeItemCallback;
        final com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = new com.tencent.mm.autogen.events.WalletGetBulletinEvent();
        java.lang.String num = java.lang.Integer.toString(i17);
        am.i10 i10Var = walletGetBulletinEvent.f54955g;
        i10Var.f6893a = num;
        i10Var.f6894b = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KWCPayServiceImpl.11
            @Override // java.lang.Runnable
            public void run() {
                if (com.tencent.kinda.framework.app.KWCPayServiceImpl.this.mBannerCallback != null && !com.tencent.mm.sdk.platformtools.t8.K0(walletGetBulletinEvent.f54956h.f6994a)) {
                    com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                    com.tencent.kinda.gen.NoticeItem noticeItem = new com.tencent.kinda.gen.NoticeItem();
                    if (walletGetBulletinEvent.f54956h.f6998e != null) {
                        create.putInt("type", 2);
                        r45.tw4 tw4Var = walletGetBulletinEvent.f54956h.f6998e;
                        noticeItem.mIsShowNotice = tw4Var.f386831d;
                        noticeItem.mWording = tw4Var.f386832e;
                        noticeItem.mJumpUrl = tw4Var.f386834g;
                        noticeItem.mLeftIcon = tw4Var.f386833f;
                        noticeItem.mNoticeId = tw4Var.f386835h;
                    }
                    create.putString("content", walletGetBulletinEvent.f54956h.f6995b);
                    create.putString("url", walletGetBulletinEvent.f54956h.f6996c);
                    com.tencent.kinda.framework.app.KWCPayServiceImpl.this.mBannerCallback.call(create, noticeItem);
                }
                com.tencent.kinda.framework.app.KWCPayServiceImpl.this.mBannerCallback = null;
            }
        };
        walletGetBulletinEvent.e();
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public void getCardListAndUsrVerifiedInfoImpl(final com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        com.tencent.mm.modelbase.u0 u0Var = new com.tencent.mm.modelbase.u0() { // from class: com.tencent.kinda.framework.app.KWCPayServiceImpl.2
            @Override // com.tencent.mm.modelbase.u0
            public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
                java.lang.String v17;
                java.lang.String v18;
                java.lang.String v19;
                com.tencent.mars.xlog.Log.i("MicroMsg.KWCPayServiceImpl", "bindQueryNewEndListener onSceneEnd");
                if (!(m1Var instanceof ss4.e0)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.KWCPayServiceImpl", "scene is not NetSceneTenpayQueryBoundBankcard");
                    return;
                }
                gm0.j1.i();
                gm0.j1.n().f273288b.q(385, this);
                if (i17 == 0 && i18 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.KWCPayServiceImpl", "getCardListAndUsrVerifiedInfoImpl: getBoundCardList success");
                    ss4.e0 e0Var = (ss4.e0) m1Var;
                    v17 = e0Var.C;
                    v18 = e0Var.A;
                    v19 = e0Var.B;
                } else {
                    gm0.j1.i();
                    v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_BINDQUERYNEW_TRUE_NAME_STRING, "");
                    gm0.j1.i();
                    v18 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_BINDQUERYNEW_CRE_NAME_STRING, "");
                    gm0.j1.i();
                    v19 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_BINDQUERYNEW_CRE_TYPE_STRING, "");
                }
                r45.w57 w57Var = new r45.w57();
                w57Var.f388906d = v17;
                r45.v57 v57Var = new r45.v57();
                w57Var.f388907e = v57Var;
                v57Var.f387924e = v18;
                v57Var.f387923d = v19;
                com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                byte[] byteArrayOrNull = w57Var.toByteArrayOrNull();
                if (byteArrayOrNull == null) {
                    create.putBinary("userInfo", new byte[0]);
                } else {
                    create.putBinary("userInfo", byteArrayOrNull);
                }
                voidITransmitKvDataCallback.call(create);
            }
        };
        gm0.j1.i();
        gm0.j1.n().f273288b.a(385, u0Var);
        ss4.e0 e0Var = new ss4.e0(null, 1);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(e0Var);
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public java.lang.String getFiltedTruthName(java.lang.String str) {
        return com.tencent.mm.wallet_core.ui.r1.g0(str);
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public com.tencent.kinda.gen.FreezeBalanceMsg getFreezeBalanceMsg() {
        at4.a1 a17 = at4.a1.a();
        if (a17 == null) {
            return new com.tencent.kinda.gen.FreezeBalanceMsg();
        }
        return new com.tencent.kinda.gen.FreezeBalanceMsg(a17.f13799a, com.tencent.mm.sdk.platformtools.t8.M(a17.f13800b, -16777216), a17.f13801c, com.tencent.mm.sdk.platformtools.t8.M(a17.f13802d, -1), a17.f13803e, a17.f13804f, a17.f13805g);
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public boolean isBalanceMasked() {
        return ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_wallet_entrance_balance_switch_state == 1;
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public boolean isNeedWalletLock() {
        long j17;
        com.tencent.mm.plugin.walletlock.model.l lVar = com.tencent.mm.plugin.walletlock.model.l.instance;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wallet_lock_kinda_config, true)) {
            boolean isUseCaseAlive = ((h45.q) i95.n0.c(h45.q.class)).isUseCaseAlive("touchLockUseCase");
            boolean isUseCaseAlive2 = ((h45.q) i95.n0.c(h45.q.class)).isUseCaseAlive("patternLockUseCase");
            if (isUseCaseAlive || isUseCaseAlive2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockManager", "wallet lock kinda exist,ignore repeat check");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockManager", "current wallet lock type: %d", java.lang.Integer.valueOf(lVar.f181372f));
                int i17 = lVar.f181372f;
                if (i17 == 2) {
                    j17 = fu4.a.f266884a;
                } else if (i17 == 1) {
                    j17 = hu4.i.f285230a;
                }
                long elapsedRealtime = (android.os.SystemClock.elapsedRealtime() - j17) / 1000;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockManager", "lastVerifyOkTime: %d, elapsedRealTime: %d, pastTime: %d, PREVENT_INPUT_PWD_SECONDS: %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()), java.lang.Long.valueOf(elapsedRealtime), java.lang.Integer.valueOf(com.tencent.mm.plugin.walletlock.model.k.a()));
                if (j17 == -1 || elapsedRealtime >= com.tencent.mm.plugin.walletlock.model.k.a()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockManager", "indicates needs verify.");
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockManager", "indicates need not verify.");
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockManager", "wallet lock kinda not enable");
        }
        return false;
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public boolean isOfflinePayShortcutPinned() {
        android.content.pm.ShortcutManager shortcutManager;
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26 && (shortcutManager = (android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)) != null) {
            java.util.Iterator<android.content.pm.ShortcutInfo> it = shortcutManager.getPinnedShortcuts().iterator();
            while (it.hasNext()) {
                if ("offline_pay_shortcut".equals(it.next().getId())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.KWCPayServiceImpl", "isOfflinePayShortcutPinned: true");
                    return true;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.KWCPayServiceImpl", "isOfflinePayShortcutPinned: false");
        return false;
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public boolean isSetWalletLock() {
        return ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().f();
    }

    public boolean isWCPayRegUser(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        int i17 = iTransmitKvData.getInt("regFlag");
        com.tencent.mars.xlog.Log.i("MicroMsg.KWCPayServiceImpl", "isWCPayRegUser, regFlag from kinda:%d", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            return true;
        }
        boolean w17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w();
        com.tencent.mars.xlog.Log.i("MicroMsg.KWCPayServiceImpl", "isWCPayRegUser from userinfo ret:%b", java.lang.Boolean.valueOf(w17));
        return w17;
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public void openHongbaoDetailUIPageImpl(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public void openHongbaoSelectExclusiveMemberPageImpl(java.lang.String str, com.tencent.kinda.gen.VoidStringCallback voidStringCallback) {
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public void openTransferToPhoneLiteapp() {
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public void refreshHongbaoDetailUIPage(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public void setBalanceMasked(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.KWCPayServiceImpl", "set balance masked:%b", java.lang.Boolean.valueOf(z17));
        at4.v1 y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0();
        y07.field_wallet_entrance_balance_switch_state = z17 ? 1 : 0;
        ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().insert(y07);
        at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
        fj6.getClass();
        fj6.f14000i = new at4.u1(y07.field_switchConfig, y07.field_wallet_entrance_balance_switch_state);
    }

    @Override // com.tencent.kinda.gen.KWCPayService
    public void startUseCaseImpl(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        com.tencent.mars.xlog.Log.i("MicroMsg.KWCPayServiceImpl", "startUseCaseImpl,url：%s", str);
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.KWCPayServiceImpl", "activity == null");
            return;
        }
        this.mUseCaseUrl = str;
        this.mQuitCallback = voidITransmitKvDataCallback;
        this.mPayScene = iTransmitKvData.getInt("payScene");
        this.mPayChannel = iTransmitKvData.getInt("payChannel");
        this.mEntryScene = iTransmitKvData.getInt("entry_scene");
        this.mPayReceiptScene = iTransmitKvData.getInt("pay_receipt_scene");
        if (str.equalsIgnoreCase("receipt")) {
            if (isWCPayRegUser(iTransmitKvData)) {
                h45.a0.k(topOrUIPageFragmentActivity, getCollectReportScene(this.mEntryScene));
                return;
            } else {
                doRealnameSceneProgress(topOrUIPageFragmentActivity, 5);
                return;
            }
        }
        if (str.equalsIgnoreCase("reward")) {
            if (isWCPayRegUser(iTransmitKvData)) {
                j45.l.h(topOrUIPageFragmentActivity, "collect", ".reward.ui.QrRewardMainUI");
                return;
            } else {
                doRealnameSceneProgress(topOrUIPageFragmentActivity, 6);
                return;
            }
        }
        if (str.equalsIgnoreCase("groupaa")) {
            android.content.Intent intent = new android.content.Intent();
            int i17 = this.mPayReceiptScene;
            if (i17 == 1) {
                intent.putExtra("enter_scene", 2);
            } else if (i17 == 2) {
                intent.putExtra("enter_scene", 4);
            }
            j45.l.j(topOrUIPageFragmentActivity, "aa", ".ui.AAEntranceUI", intent, null);
            return;
        }
        if (str.equalsIgnoreCase("faceHongBao")) {
            j45.l.h(topOrUIPageFragmentActivity, "luckymoney", ".f2f.ui.LuckyMoneyF2FQRCodeUI");
            return;
        }
        if (str.equalsIgnoreCase("transferBank")) {
            j45.l.h(topOrUIPageFragmentActivity, "remittance", ".bankcard.ui.BankRemitBankcardInputUI");
            return;
        }
        if (str.equalsIgnoreCase("transferMobile") || str.equalsIgnoreCase("transferMix")) {
            j45.l.h(topOrUIPageFragmentActivity, "remittance", ".mobile.ui.BankMobileRemittanceChooseUI");
            return;
        }
        if (str.equalsIgnoreCase("walletLock")) {
            android.content.Intent intent2 = new android.content.Intent();
            int i18 = iTransmitKvData.getInt("walletLock:entryScene");
            if (i18 != 0) {
                intent2.putExtra("wallet_lock_jsapi_scene", i18);
            }
            intent2.putExtra("key_wallet_lock_setting_scene", 2);
            if (((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).Ai()) {
                ((h45.q) i95.n0.c(h45.q.class)).startWalletLockSettingUseCase(topOrUIPageFragmentActivity, intent2, new h45.i() { // from class: com.tencent.kinda.framework.app.KWCPayServiceImpl.4
                    @Override // h45.i
                    public void onKindaBusinessCallback(android.content.Intent intent3) {
                        if (com.tencent.kinda.framework.app.KWCPayServiceImpl.this.mQuitCallback == null) {
                            return;
                        }
                        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                        create.putBool("result", intent3.getBooleanExtra("result", false));
                        com.tencent.kinda.framework.app.KWCPayServiceImpl.this.mQuitCallback.call(create);
                    }
                });
                return;
            }
            if (topOrUIPageFragmentActivity instanceof com.tencent.mm.ui.MMActivity) {
                ((com.tencent.mm.ui.MMActivity) topOrUIPageFragmentActivity).mmSetOnActivityResultCallback(new com.tencent.mm.ui.da() { // from class: com.tencent.kinda.framework.app.KWCPayServiceImpl.5
                    @Override // com.tencent.mm.ui.xc
                    public void mmOnActivityResult(int i19, int i27, android.content.Intent intent3) {
                        if (i19 != 1001 || com.tencent.kinda.framework.app.KWCPayServiceImpl.this.mQuitCallback == null) {
                            return;
                        }
                        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                        create.putBool("result", i27 == -1);
                        com.tencent.kinda.framework.app.KWCPayServiceImpl.this.mQuitCallback.call(create);
                    }
                });
            }
            ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().a(topOrUIPageFragmentActivity, intent2, 1001);
            return;
        }
        if (str.equalsIgnoreCase("paySecurity")) {
            android.content.Intent intent3 = new android.content.Intent();
            if (8 == this.mPayScene) {
                intent3.putExtra("wallet_lock_jsapi_scene", 2);
            }
            j45.l.j(topOrUIPageFragmentActivity, "wallet", ".pwd.ui.WalletSecuritySettingUI", intent3, null);
            return;
        }
        if (str.equalsIgnoreCase("pureBindCard")) {
            com.tencent.mm.pluginsdk.wallet.WalletJsapiData createJsapiData = createJsapiData(iTransmitKvData);
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("appId", createJsapiData.f192129d);
            intent4.putExtra("timeStamp", createJsapiData.f192133h);
            intent4.putExtra("nonceStr", createJsapiData.f192132g);
            intent4.putExtra("packageExt", createJsapiData.f192134i);
            intent4.putExtra("signtype", createJsapiData.f192131f);
            intent4.putExtra("paySignature", createJsapiData.f192138p);
            intent4.putExtra("url", createJsapiData.f192140r);
            intent4.putExtra("key_req_bind_scene", 4);
            intent4.putExtra("pay_channel", createJsapiData.f192144v);
            intent4.putExtra("from_kinda", true);
            intent4.putExtra("is_select_payment", createJsapiData.U);
            j45.l.o(topOrUIPageFragmentActivity, "wallet", ".bind.ui.WalletBindUI", intent4, 0, false);
            this.mWalletEndResultEventIListener.alive();
            return;
        }
        if (str.equalsIgnoreCase("verifyPassword")) {
            com.tencent.mm.pluginsdk.wallet.WalletJsapiData createJsapiData2 = createJsapiData(iTransmitKvData);
            android.content.Intent intent5 = new android.content.Intent();
            intent5.putExtra("appId", createJsapiData2.f192129d);
            intent5.putExtra("timeStamp", createJsapiData2.f192133h);
            intent5.putExtra("nonceStr", createJsapiData2.f192132g);
            intent5.putExtra("packageExt", createJsapiData2.f192134i);
            intent5.putExtra("signtype", createJsapiData2.f192131f);
            intent5.putExtra("paySignature", createJsapiData2.f192138p);
            intent5.putExtra("url", createJsapiData2.f192140r);
            intent5.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
            intent5.putExtra("from_kinda", true);
            j45.l.o(topOrUIPageFragmentActivity, "wallet_core", ".ui.WalletCheckPwdUI", intent5, 0, false);
            this.mWalletEndResultEventIListener.alive();
            return;
        }
        if (str.equalsIgnoreCase("balanceEntryUseCase")) {
            if (((h45.q) i95.n0.c(h45.q.class)).startWalletBalanceEntryUseCase(topOrUIPageFragmentActivity)) {
                return;
            }
            j45.l.m(topOrUIPageFragmentActivity, "wallet", ".balance.ui.WalletBalanceManagerUI", 65281);
            return;
        }
        if (str.equalsIgnoreCase("lqt") || str.equalsIgnoreCase("lqtDetailUseCase")) {
            if (((h45.q) i95.n0.c(h45.q.class)).startLqtDetailUseCaseWithBalanceInMMProcess(topOrUIPageFragmentActivity, iTransmitKvData.getLong("lqtWalletBalance"))) {
                return;
            }
            j45.l.n(topOrUIPageFragmentActivity, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", null, 65286);
            return;
        }
        if (str.equalsIgnoreCase("bankCard")) {
            ((h45.q) i95.n0.c(h45.q.class)).startUseCase("bankCard", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.app.KWCPayServiceImpl.6
                @Override // com.tencent.kinda.gen.UseCaseCallback
                public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData2) {
                }
            });
            return;
        }
        if (str.equalsIgnoreCase("HoneyPayPayerUseCase")) {
            if (!u73.h.g()) {
                j45.l.n(topOrUIPageFragmentActivity, "honey_pay", ".ui.HoneyPayMainUI", new android.content.Intent(), 65283);
                return;
            } else {
                ((h45.q) i95.n0.c(h45.q.class)).startUseCase("HoneyPayPayerUseCase", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.app.KWCPayServiceImpl.7
                    @Override // com.tencent.kinda.gen.UseCaseCallback
                    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData2) {
                    }
                });
                return;
            }
        }
        if (str.equalsIgnoreCase("paySettingsUseCase")) {
            iTransmitKvData.putString("modifyPwd.sessionId", gm0.j1.b().j() + "_" + com.tencent.mm.wallet_core.ui.r1.B());
            iTransmitKvData.putBool("resetPwd.bResetPwdFromPayManage", true);
            iTransmitKvData.putInt("resetPwd.realnameScene", 0);
            iTransmitKvData.putInt("resetPwd.payScene", 0);
            ((h45.q) i95.n0.c(h45.q.class)).startUseCase("paySettingsUseCase", iTransmitKvData, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.app.KWCPayServiceImpl.8
                @Override // com.tencent.kinda.gen.UseCaseCallback
                public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData2) {
                }
            });
            return;
        }
        if (str.equalsIgnoreCase("realname")) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("real_name_verify_mode", 0);
            bundle.putInt("entry_scene", 0);
            com.tencent.mm.wallet_core.a.j(topOrUIPageFragmentActivity, com.tencent.mm.plugin.wallet_core.id_verify.a.class, bundle, new com.tencent.mm.wallet_core.g() { // from class: com.tencent.kinda.framework.app.KWCPayServiceImpl.9
                @Override // com.tencent.mm.wallet_core.g
                public android.content.Intent onProcessEnd(int i19, android.os.Bundle bundle2) {
                    return null;
                }
            });
            return;
        }
        if (str.equalsIgnoreCase("walletLockVerify")) {
            android.content.Intent intent6 = new android.content.Intent();
            intent6.putExtra("need_block_back", true);
            ((h45.q) i95.n0.c(h45.q.class)).startKindaWalletLockVerify(intent6, com.tencent.mm.plugin.walletlock.model.l.instance.h(), new h45.i() { // from class: com.tencent.kinda.framework.app.KWCPayServiceImpl.10
                @Override // h45.i
                public void onKindaBusinessCallback(android.content.Intent intent7) {
                    if (intent7.getIntExtra("retCode", -1) == -1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.KWCPayServiceImpl", "walletLockVerify cancel, call quitCallback close offline");
                        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                        create.putBool("dropout", true);
                        create.putBool("dropServiceHome", true);
                        if (com.tencent.kinda.framework.app.KWCPayServiceImpl.this.mQuitCallback != null) {
                            com.tencent.kinda.framework.app.KWCPayServiceImpl.this.mQuitCallback.call(create);
                        }
                    }
                }
            });
        }
    }
}
