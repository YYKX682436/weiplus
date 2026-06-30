package com.tencent.kinda.framework.kindalite;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0001]B\u000f\u0012\u0006\u00105\u001a\u00020\u0003¢\u0006\u0004\b[\u0010\\J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0002J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0012\u0010\u0018\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u00020\u0003H\u0002J\b\u0010 \u001a\u00020\u0003H\u0002J\u0006\u0010!\u001a\u00020\u0007J\u0006\u0010#\u001a\u00020\"J\b\u0010$\u001a\u0004\u0018\u00010\u0003J(\u0010(\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\"J\u0014\u0010+\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070)J\u0006\u0010,\u001a\u00020\u0007J\b\u0010-\u001a\u00020\u0003H\u0016J\u0012\u0010.\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010/\u001a\u00020\u0007H\u0016J*\u00104\u001a\u00020\"2\u0006\u00100\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u0002022\u0006\u00103\u001a\u00020\u0015H\u0016R\u0014\u00105\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R(\u0010=\u001a\u0004\u0018\u00010\u00032\b\u0010<\u001a\u0004\u0018\u00010\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u0010?R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010GR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001c\u0010U\u001a\b\u0012\u0002\b\u0003\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0011\u0010Z\u001a\u00020W8F¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006^"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/KindaLiteUseCase;", "Lcom/tencent/kinda/gen/UseCase;", "Lcom/tencent/kinda/framework/kindalite/KindaLiteStoreCallback;", "", "url", "Lcom/tencent/kinda/gen/ITransmitKvData;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Ljz5/f0;", "startLiteApp", "stopLiteApp", "", "appUuid", "onLiteAppCreate", "onLiteAppStopped", "onLiteAppRunning", "onLiteAppPaying", "onLiteAppPaySucceed", "cleanup", "clearOfflineMainUISecureFlag", "onLiteAppActivityOnResume", "routeInfo", "", "delayInMs", "startNativeRoute", "reportNativeStartUseCase", "reportStopKindaLiteUseCaseTimeout", "reportStopKindaLiteUseCaseSuccess", "result", "reportForceStopAction", "getAppColdStartTime", "getAccountLoginSuccessTime", "getFirstPreloadTime", "getLastEnterForegroundTime", "markDiscardedBeforeStart", "", "wasDiscardedBeforeStart", "currentSessionId", "Lcom/tencent/kinda/gen/UseCaseCallback;", "callback", "isDuplicate", "start", "Lkotlin/Function0;", "completion", "stop", "forceStop", "toString", "notify", "preStepDidDestory", "instanceId", "actionName", "Lorg/json/JSONObject;", "callbackId", "onStoreDispatch", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "Ljava/lang/String;", "callbackBlock", "Lcom/tencent/kinda/gen/UseCaseCallback;", "Lcom/tencent/kinda/gen/KJSEvent;", "jsEvent", "Lcom/tencent/kinda/gen/KJSEvent;", "<set-?>", "useCaseUrl", "getUseCaseUrl", "()Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "sourceActivity", "Ljava/lang/ref/WeakReference;", "liteAppUuid", "J", "hasInvokedCallback", "Z", "Lcom/tencent/kinda/framework/kindalite/KindaLiteStateMachine;", "fsm", "Lcom/tencent/kinda/framework/kindalite/KindaLiteStateMachine;", "discardedBeforeStart", "stopUseCaseCompletion", "Lyz5/a;", "Ljava/lang/Runnable;", "stopTimeoutRunnable", "Ljava/lang/Runnable;", "Landroid/os/Handler;", "stopTimeoutHandler", "Landroid/os/Handler;", "Lcom/tencent/mm/sdk/event/IListener;", "liteAppLifeCycleEventListener", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/kinda/framework/kindalite/KindaLiteAppState;", "getLiteAppState", "()Lcom/tencent/kinda/framework/kindalite/KindaLiteAppState;", "liteAppState", "<init>", "(Ljava/lang/String;)V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class KindaLiteUseCase extends com.tencent.kinda.gen.UseCase implements com.tencent.kinda.framework.kindalite.KindaLiteStoreCallback {
    public static final java.lang.String TAG = "KindaLiteUseCase";
    private com.tencent.kinda.gen.UseCaseCallback callbackBlock;
    private boolean discardedBeforeStart;
    private final com.tencent.kinda.framework.kindalite.KindaLiteStateMachine fsm;
    private boolean hasInvokedCallback;
    private com.tencent.kinda.gen.KJSEvent jsEvent;
    private com.tencent.mm.sdk.event.IListener<?> liteAppLifeCycleEventListener;
    private long liteAppUuid;
    private final java.lang.String sessionId;
    private java.lang.ref.WeakReference<android.app.Activity> sourceActivity;
    private final android.os.Handler stopTimeoutHandler;
    private java.lang.Runnable stopTimeoutRunnable;
    private yz5.a stopUseCaseCompletion;
    private java.lang.String useCaseUrl;

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.tencent.kinda.framework.kindalite.KindaLiteAppState.values().length];
            try {
                iArr[com.tencent.kinda.framework.kindalite.KindaLiteAppState.Running.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.tencent.kinda.framework.kindalite.KindaLiteAppState.Paying.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.tencent.kinda.framework.kindalite.KindaLiteAppState.PaySucceeded.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KindaLiteUseCase(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        this.sessionId = sessionId;
        this.fsm = new com.tencent.kinda.framework.kindalite.KindaLiteStateMachine(new com.tencent.kinda.framework.kindalite.KindaLiteUseCase$fsm$1(this), new com.tencent.kinda.framework.kindalite.KindaLiteEffects() { // from class: com.tencent.kinda.framework.kindalite.KindaLiteUseCase$fsm$2
            @Override // com.tencent.kinda.framework.kindalite.KindaLiteEffects
            public void effectOnLiteAppPaySucceed() {
                com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.onLiteAppPaySucceed();
            }

            @Override // com.tencent.kinda.framework.kindalite.KindaLiteEffects
            public void effectOnLiteAppPaying() {
                com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.onLiteAppPaying();
            }

            @Override // com.tencent.kinda.framework.kindalite.KindaLiteEffects
            public void effectOnLiteAppRunning() {
                com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.onLiteAppRunning();
            }

            @Override // com.tencent.kinda.framework.kindalite.KindaLiteEffects
            public void effectOnLiteAppStopped() {
                com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.onLiteAppStopped();
            }

            @Override // com.tencent.kinda.framework.kindalite.KindaLiteEffects
            public void effectPublishStop() {
                com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.stopLiteApp();
            }

            @Override // com.tencent.kinda.framework.kindalite.KindaLiteEffects
            public void effectStartLiteApp(java.lang.String url, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                kotlin.jvm.internal.o.g(url, "url");
                com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.startLiteApp(url, iTransmitKvData);
            }
        });
        this.stopTimeoutHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.kinda.framework.kindalite.KindaLiteUseCase$liteAppLifeCycleEventListener$1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent event) {
                long j17;
                long j18;
                com.tencent.kinda.framework.kindalite.KindaLiteStateMachine kindaLiteStateMachine;
                kotlin.jvm.internal.o.g(event, "event");
                am.ri riVar = event.f54468g;
                if (kotlin.jvm.internal.o.b(riVar.f7819c, com.tencent.kinda.framework.kindalite.KindaLiteDef.WX_PAY_CASHIER_LITE_APP_ID)) {
                    java.lang.Long l17 = riVar.f7820d;
                    j17 = com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.liteAppUuid;
                    if (l17 != null && l17.longValue() == j17) {
                        int i17 = riVar.f7817a;
                        if (i17 == 1) {
                            com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.onLiteAppActivityOnResume();
                        } else if (i17 == 3) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiteAppLifeCycle_OnDestroy captured, appUuid=");
                            j18 = com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.liteAppUuid;
                            sb6.append(j18);
                            sb6.append("; dispatch LiteAppDestroyed");
                            com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.kindalite.KindaLiteUseCase.TAG, sb6.toString());
                            kindaLiteStateMachine = com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.fsm;
                            kindaLiteStateMachine.dispatch(com.tencent.kinda.framework.kindalite.LiteEvent.LiteAppDestroyed.INSTANCE);
                        }
                    }
                }
                return false;
            }
        };
        this.liteAppLifeCycleEventListener = iListener;
        iListener.alive();
    }

    private final void cleanup() {
        com.tencent.mm.sdk.event.IListener<?> iListener = this.liteAppLifeCycleEventListener;
        if (iListener != null) {
            iListener.dead();
        }
        this.liteAppLifeCycleEventListener = null;
        java.lang.Runnable runnable = this.stopTimeoutRunnable;
        if (runnable != null) {
            this.stopTimeoutHandler.removeCallbacks(runnable);
        }
        this.stopTimeoutRunnable = null;
        this.liteAppUuid = 0L;
    }

    private final void clearOfflineMainUISecureFlag() {
        if (kotlin.jvm.internal.o.b(this.useCaseUrl, "offlinePay")) {
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lite_app_clear_offline_main_ui_secure_flag_android, true)) {
                com.tencent.mars.xlog.Log.i(TAG, "disable clear offline main ui secure flag");
                return;
            }
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.kindalite.KindaLiteUseCase$clearOfflineMainUISecureFlag$runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.ref.WeakReference weakReference;
                    android.app.Activity activity;
                    android.view.Window window;
                    android.view.WindowManager.LayoutParams attributes;
                    weakReference = com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.sourceActivity;
                    if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null || (attributes.flags & 8192) == 0) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.kindalite.KindaLiteUseCase.TAG, "clearOfflineMainUISecureFlag: clearing FLAG_SECURE");
                    window.clearFlags(8192);
                }
            };
            if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                runnable.run();
            } else {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(runnable);
            }
        }
    }

    private final java.lang.String getAccountLoginSuccessTime() {
        try {
            h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
            if (qVar == null) {
                return "0";
            }
            java.lang.String l17 = java.lang.Long.valueOf(qVar.getAccountLoginSuccessTime()).toString();
            return l17 == null ? "0" : l17;
        } catch (java.lang.Throwable unused) {
            return "0";
        }
    }

    private final java.lang.String getAppColdStartTime() {
        java.lang.String l17;
        try {
            h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
            return (qVar == null || (l17 = java.lang.Long.valueOf(qVar.getAppColdStartTime()).toString()) == null) ? java.lang.String.valueOf(com.tencent.mm.app.x.f53906a) : l17;
        } catch (java.lang.Throwable unused) {
            return java.lang.String.valueOf(com.tencent.mm.app.x.f53906a);
        }
    }

    private final java.lang.String getFirstPreloadTime() {
        try {
            h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
            if (qVar == null) {
                return "0";
            }
            java.lang.String l17 = java.lang.Long.valueOf(qVar.getFirstPreloadTime()).toString();
            return l17 == null ? "0" : l17;
        } catch (java.lang.Throwable unused) {
            return "0";
        }
    }

    private final java.lang.String getLastEnterForegroundTime() {
        try {
            h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
            if (qVar == null) {
                return "0";
            }
            java.lang.String l17 = java.lang.Long.valueOf(qVar.getLastEnterForegroundTime()).toString();
            return l17 == null ? "0" : l17;
        } catch (java.lang.Throwable unused) {
            return "0";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLiteAppActivityOnResume() {
        clearOfflineMainUISecureFlag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLiteAppCreate(long j17) {
        com.tencent.mars.xlog.Log.i(TAG, this + ", on liteapp create, appUuid: " + j17 + ", sessionId=" + this.sessionId);
        this.liteAppUuid = j17;
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).dk(j17, com.tencent.kinda.framework.kindalite.KindaLiteDef.KINDA_LITE_USE_CASE_KEY, this);
        java.lang.String str = this.sessionId;
        if (str != null) {
            com.tencent.kinda.framework.kindalite.KindaLiteStore.INSTANCE.getInstance().addStoreCallback(str, this);
        }
        com.tencent.kinda.framework.kindalite.KindaLiteStore.INSTANCE.getInstance().initStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLiteAppPaySucceed() {
        com.tencent.mars.xlog.Log.i(TAG, this + ", on liteapp pay succeed, appUuid=" + this.liteAppUuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLiteAppPaying() {
        com.tencent.mars.xlog.Log.i(TAG, this + ", on liteapp paying, appUuid=" + this.liteAppUuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLiteAppRunning() {
        com.tencent.mars.xlog.Log.i(TAG, this + ", on liteapp running, appUuid=" + this.liteAppUuid + ", sessionId=" + this.sessionId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLiteAppStopped() {
        com.tencent.mars.xlog.Log.i(TAG, this + ", on liteapp stopped, current=" + this.fsm.getState() + ", hasInvokedCallback=" + this.hasInvokedCallback);
        boolean z17 = l75.d1.f316945a;
        l75.d1.f316951g = false;
        if (!this.hasInvokedCallback) {
            com.tencent.mars.xlog.Log.i(TAG, this + ", fallback callback on stop (empty data)");
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            com.tencent.kinda.gen.UseCaseCallback useCaseCallback = this.callbackBlock;
            if (useCaseCallback != null) {
                useCaseCallback.call(create);
            }
            this.hasInvokedCallback = true;
        }
        yz5.a aVar = this.stopUseCaseCompletion;
        if (aVar != null) {
            aVar.invoke();
        }
        this.stopUseCaseCompletion = null;
        cleanup();
    }

    private final void reportForceStopAction(int i17) {
        try {
            java.lang.String str = this.sessionId;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String str3 = this.useCaseUrl;
            com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 kindaLiteReportData35075 = new com.tencent.kinda.framework.kindalite.KindaLiteReportData35075(str2, 2, 0, 0, 0, 0, null, null, 0, 0, 0, 40, i17, 0, 0, 0, 0, null, null, null, null, null, null, null, 0, null, str3 == null ? "" : str3, 0, 0L, null, null, 2080368636, null);
            com.tencent.kinda.framework.kindalite.KindaLiteReportUtil kindaLiteReportUtil = com.tencent.kinda.framework.kindalite.KindaLiteReportUtil.INSTANCE;
            kindaLiteReportUtil.buildReportString35075(kindaLiteReportData35075);
            kindaLiteReportUtil.report35075(kindaLiteReportData35075);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "reportForceStopAction error: %s", e17.getMessage());
        }
    }

    private final void reportNativeStartUseCase(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        java.lang.String str;
        java.lang.String str2;
        try {
            com.tencent.kinda.framework.module.impl.ReportServiceImpl reportServiceImpl = new com.tencent.kinda.framework.module.impl.ReportServiceImpl();
            com.tencent.liteapp.storage.WxaLiteAppInfo Bj = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(com.tencent.kinda.framework.kindalite.KindaLiteDef.WX_PAY_CASHIER_LITE_APP_ID);
            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo vj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).vj();
            java.lang.String str3 = Bj != null ? Bj.version : null;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = vj6 != null ? vj6.version : null;
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String valueOf = java.lang.String.valueOf(reportServiceImpl.svrTimeMs());
            java.lang.String valueOf2 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            if (iTransmitKvData == null || (str = java.lang.Integer.valueOf(iTransmitKvData.getInt("payScene")).toString()) == null) {
                str = "";
            }
            if (iTransmitKvData == null || (str2 = java.lang.Integer.valueOf(iTransmitKvData.getInt("payChannel")).toString()) == null) {
                str2 = "";
            }
            java.lang.String string = iTransmitKvData != null ? iTransmitKvData.getString("nativeReportSessionId") : null;
            if (string == null) {
                string = "";
            }
            java.lang.String str5 = "app_id=wxalite2264f3d3bd4efb9d089e6893879d404f@pay&liteapp_version=" + str3 + "&baselib_version=" + str4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("1");
            java.lang.String str6 = this.sessionId;
            if (str6 == null) {
                str6 = "";
            }
            arrayList.add(str6);
            arrayList.add("0");
            arrayList.add("nativeStartUseCase");
            arrayList.add(valueOf);
            arrayList.add("1");
            arrayList.add("");
            arrayList.add(str);
            arrayList.add(str2);
            arrayList.add(string);
            arrayList.add(valueOf2);
            arrayList.add(str5);
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.h2.a(arrayList, ",");
            com.tencent.mars.xlog.Log.i(TAG, "reportNativeStartUseCase: %s", a17);
            reportServiceImpl.kvStat(15582, a17);
            java.lang.String str7 = this.sessionId;
            java.lang.String str8 = str7 == null ? "" : str7;
            java.lang.String str9 = this.useCaseUrl;
            com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 kindaLiteReportData35075 = new com.tencent.kinda.framework.kindalite.KindaLiteReportData35075(str8, 1, 0, 0, 0, 0, null, null, 0, 0, 59, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, 0, null, str9 == null ? "" : str9, 0, 0L, null, null, 2080373756, null);
            com.tencent.kinda.framework.kindalite.KindaLiteReportUtil kindaLiteReportUtil = com.tencent.kinda.framework.kindalite.KindaLiteReportUtil.INSTANCE;
            com.tencent.mars.xlog.Log.i(TAG, "reportNativeStartUseCase35075: %s", kindaLiteReportUtil.buildReportString35075(kindaLiteReportData35075));
            kindaLiteReportUtil.report35075(kindaLiteReportData35075);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "reportNativeStartUseCase error: %s", e17.getMessage());
        }
    }

    private final void reportStopKindaLiteUseCaseSuccess() {
        try {
            java.lang.String str = this.sessionId;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String str3 = this.useCaseUrl;
            com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 kindaLiteReportData35075 = new com.tencent.kinda.framework.kindalite.KindaLiteReportData35075(str2, 2, 0, 0, 0, 0, null, null, 0, 0, 59, 35, 41, 0, 0, 0, 0, null, null, null, null, null, null, null, 0, null, str3 == null ? "" : str3, 0, 0L, null, null, 2080367612, null);
            com.tencent.kinda.framework.kindalite.KindaLiteReportUtil kindaLiteReportUtil = com.tencent.kinda.framework.kindalite.KindaLiteReportUtil.INSTANCE;
            com.tencent.mars.xlog.Log.i(TAG, "reportStopKindaLiteUseCaseSuccess: %s", kindaLiteReportUtil.buildReportString35075(kindaLiteReportData35075));
            kindaLiteReportUtil.report35075(kindaLiteReportData35075);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "reportStopKindaLiteUseCaseSuccess error: %s", e17.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportStopKindaLiteUseCaseTimeout() {
        try {
            java.lang.String str = this.sessionId;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String str3 = this.useCaseUrl;
            com.tencent.kinda.framework.kindalite.KindaLiteReportData35075 kindaLiteReportData35075 = new com.tencent.kinda.framework.kindalite.KindaLiteReportData35075(str2, 2, 0, 0, 0, 0, null, null, 0, 0, 59, 35, 42, 0, 0, 0, 0, null, null, null, null, null, null, null, 0, null, str3 == null ? "" : str3, 0, 0L, null, null, 2080367612, null);
            com.tencent.kinda.framework.kindalite.KindaLiteReportUtil kindaLiteReportUtil = com.tencent.kinda.framework.kindalite.KindaLiteReportUtil.INSTANCE;
            com.tencent.mars.xlog.Log.i(TAG, "reportStopKindaLiteUseCaseTimeout: %s", kindaLiteReportUtil.buildReportString35075(kindaLiteReportData35075));
            kindaLiteReportUtil.report35075(kindaLiteReportData35075);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "reportStopKindaLiteUseCaseTimeout error: %s", e17.getMessage());
        }
    }

    public static /* synthetic */ void start$default(com.tencent.kinda.framework.kindalite.KindaLiteUseCase kindaLiteUseCase, java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.UseCaseCallback useCaseCallback, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        kindaLiteUseCase.start(str, iTransmitKvData, useCaseCallback, z17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startLiteApp(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        java.lang.String str2;
        java.lang.Object m521constructorimpl;
        java.lang.String str3;
        java.lang.String json;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", com.tencent.kinda.framework.kindalite.KindaLiteDef.WX_PAY_CASHIER_LITE_APP_ID);
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, com.tencent.kinda.framework.kindalite.KindaLiteDef.WX_PAY_CASHIER_LITE_APP_USE_CASE_PATH);
        bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, true);
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("mmkv_id_uat").getString("uat_script_id", null);
        com.tencent.mars.xlog.Log.i(TAG, "uatScriptId: " + string);
        java.lang.String str4 = "&app_cold_start_time=" + getAppColdStartTime() + "&account_login_success_time=" + getAccountLoginSuccessTime() + "&first_preload_time=" + getFirstPreloadTime() + "&app_last_enter_foreground_time=" + getLastEnterForegroundTime();
        try {
            str2 = fp.s0.b(com.tencent.liteapp.framework.dynamic_module.WeixinPayService.INSTANCE.aggregatePayPreData().toString(), com.tencent.mapsdk.internal.rv.f51270c);
            com.tencent.mars.xlog.Log.i(TAG, "PayPreData aggregated, payload length=" + str2.length());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(TAG, "aggregatePayPreData failed: " + th6.getMessage() + "; JS will fallback to legacy JSAPI");
            str2 = "";
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String a17 = j62.e.g().a("clicfg_kinda_lite_store_await_timeout_ms_android", "1000", false, false);
            kotlin.jvm.internal.o.f(a17, "getMulitExpt(...)");
            long parseLong = java.lang.Long.parseLong(a17);
            if (parseLong < 0) {
                parseLong = 0;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Long.valueOf(parseLong));
        } catch (java.lang.Throwable th7) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = 1000L;
        }
        long longValue = ((java.lang.Number) m521constructorimpl).longValue();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean awaitStoreCreated = com.tencent.kinda.framework.kindalite.KindaLiteMgr.INSTANCE.awaitStoreCreated(longValue);
        com.tencent.mars.xlog.Log.i(TAG, "startLiteApp awaitStoreCreated ready=" + awaitStoreCreated + " cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms timeout=" + longValue + "ms");
        if (string == null || string.length() == 0) {
            str3 = "use_case=" + str + "&session_id=" + this.sessionId + "&native_start_time=" + java.lang.System.currentTimeMillis() + str4 + "&pay_pre_data=" + str2;
        } else {
            str3 = "use_case=" + str + "&session_id=" + this.sessionId + "&uat_script_id=" + string + "&native_start_time=" + java.lang.System.currentTimeMillis() + str4 + "&pay_pre_data=" + str2;
        }
        if (iTransmitKvData != null && (json = iTransmitKvData.toJson()) != null) {
            java.lang.String str5 = str3 + "&entry_data=" + fp.s0.b(json, com.tencent.mapsdk.internal.rv.f51270c);
            if (str5 != null) {
                str3 = str5;
            }
        }
        bundle.putString("query", str3);
        bundle.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.sessionId);
        com.tencent.mars.xlog.Log.i(TAG, "openLiteAppInfo " + bundle);
        if (awaitStoreCreated) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(str3);
            jSONObject.put("__args", jSONArray);
            jSONObject.put("__scopeId", this.sessionId);
            com.tencent.mm.plugin.lite.LiteAppCenter.dispatchStore(com.tencent.kinda.framework.kindalite.KindaLiteDef.WX_PAY_CASHIER_LITE_APP_ID, "index:store/startCgi", jSONObject);
        } else {
            com.tencent.mars.xlog.Log.w(TAG, "skip dispatchStore index:store/startCgi because store is not ready");
        }
        if (!kotlin.jvm.internal.o.b(str, "scanQRCodePay")) {
            boolean b17 = kotlin.jvm.internal.o.b(str, "snsPay");
            com.tencent.liteapp.framework.dynamic_module.c cVar = com.tencent.liteapp.framework.dynamic_module.c.f45986a;
            if (b17) {
                boolean bool = iTransmitKvData != null ? iTransmitKvData.getBool("need_start_loading") : false;
                boolean bool2 = iTransmitKvData != null ? iTransmitKvData.getBool("need_kinda_cashier_Loading") : false;
                if (bool || bool2) {
                    com.tencent.mars.xlog.Log.i(TAG, "startLiteApp snsPay, need to show loading");
                    cVar.a(true);
                } else {
                    com.tencent.mars.xlog.Log.i(TAG, "startLiteApp snsPay, no need to show loading");
                }
            } else {
                cVar.a(true);
            }
        }
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(context, bundle, true, false, null, new q80.f0() { // from class: com.tencent.kinda.framework.kindalite.KindaLiteUseCase$startLiteApp$1
            @Override // q80.f0
            public void cancel() {
                java.lang.String str6;
                com.tencent.kinda.framework.kindalite.KindaLiteStateMachine kindaLiteStateMachine;
                com.tencent.liteapp.framework.dynamic_module.c.f45986a.a(false);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start liteapp cancel, sessionId=");
                str6 = com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.sessionId;
                sb6.append(str6);
                com.tencent.mars.xlog.Log.e(com.tencent.kinda.framework.kindalite.KindaLiteUseCase.TAG, sb6.toString());
                kindaLiteStateMachine = com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.fsm;
                kindaLiteStateMachine.dispatch(com.tencent.kinda.framework.kindalite.LiteEvent.StartCancelled.INSTANCE);
            }

            @Override // q80.f0
            public void fail() {
                java.lang.String str6;
                com.tencent.kinda.framework.kindalite.KindaLiteStateMachine kindaLiteStateMachine;
                com.tencent.liteapp.framework.dynamic_module.c.f45986a.a(false);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start liteapp fail, sessionId=");
                str6 = com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.sessionId;
                sb6.append(str6);
                com.tencent.mars.xlog.Log.e(com.tencent.kinda.framework.kindalite.KindaLiteUseCase.TAG, sb6.toString());
                kindaLiteStateMachine = com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.fsm;
                kindaLiteStateMachine.dispatch(com.tencent.kinda.framework.kindalite.LiteEvent.StartFailed.INSTANCE);
            }

            @Override // q80.f0
            public boolean listenOnCreate() {
                return true;
            }

            @Override // q80.f0
            public void onCreate(long j17, java.lang.String sessionId) {
                kotlin.jvm.internal.o.g(sessionId, "sessionId");
                com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.onLiteAppCreate(j17);
            }

            @Override // q80.f0
            public void success() {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.kindalite.KindaLiteUseCase.TAG, "start liteapp success");
            }
        });
    }

    private final void startNativeRoute(final java.lang.String str, int i17) {
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
        t0Var.getClass();
        t0Var.z(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.kindalite.KindaLiteUseCase$startNativeRoute$1
            @Override // java.lang.Runnable
            public final void run() {
                byte[] decode = android.util.Base64.decode(str, 0);
                kotlin.jvm.internal.o.f(decode, "decode(...)");
                com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                create.putBinary("route_info", decode);
                com.tencent.kinda.framework.boot.KindaApp.appKinda().startUseCase("commonRoute", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.kindalite.KindaLiteUseCase$startNativeRoute$1.1
                    @Override // com.tencent.kinda.gen.UseCaseCallback
                    public final void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                    }
                });
            }
        }, i17, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopLiteApp() {
        com.tencent.mars.xlog.Log.i(TAG, this + ", execute stop liteapp, publish notify event, state=" + this.fsm.getState());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("notifyType", "stopUseCase");
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(this.liteAppUuid, 0L, "pay.kindaNotify", jSONObject);
    }

    /* renamed from: currentSessionId, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final void forceStop() {
        if (getLiteAppState() == com.tencent.kinda.framework.kindalite.KindaLiteAppState.Stopped) {
            com.tencent.mars.xlog.Log.i(TAG, this + ", forceStop: liteAppState is Stopped");
            return;
        }
        if (this.liteAppUuid == 0) {
            com.tencent.mars.xlog.Log.e(TAG, this + ", forceStop: liteAppUuid is 0");
            reportForceStopAction(50);
        } else {
            com.tencent.mars.xlog.Log.i(TAG, this + ", forceStop closeWindow");
            com.tencent.mm.plugin.lite.LiteAppCenter.closeWindow(this.liteAppUuid, new android.content.Intent());
            reportForceStopAction(51);
        }
        this.fsm.dispatch(com.tencent.kinda.framework.kindalite.LiteEvent.LiteAppDestroyed.INSTANCE);
    }

    public final com.tencent.kinda.framework.kindalite.KindaLiteAppState getLiteAppState() {
        return this.fsm.getState();
    }

    public final java.lang.String getUseCaseUrl() {
        return this.useCaseUrl;
    }

    public final void markDiscardedBeforeStart() {
        if (this.discardedBeforeStart) {
            return;
        }
        this.discardedBeforeStart = true;
        com.tencent.mars.xlog.Log.w(TAG, this + " discarded before start; will not run");
    }

    @Override // com.tencent.kinda.gen.UseCase
    public void notify(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        com.tencent.mars.xlog.Log.i(TAG, "notify " + iTransmitKvData);
    }

    @Override // com.tencent.kinda.framework.kindalite.KindaLiteStoreCallback
    public boolean onStoreDispatch(long instanceId, java.lang.String actionName, org.json.JSONObject data, int callbackId) {
        java.lang.String str;
        com.tencent.kinda.gen.KJSEvent kJSEvent;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i(TAG, "storeCallback instanceId: " + instanceId + " actionName: " + actionName + " data: " + data + " callbackId: " + callbackId);
        if (actionName != null) {
            str = actionName.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.o.f(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = com.tencent.kinda.framework.kindalite.KindaLiteDef.STORE_ACTION_JS_EVENT_END_WITH_RESULT.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, lowerCase) && this.jsEvent != null) {
            java.lang.String optString = data.optString("result");
            org.json.JSONObject optJSONObject = data.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO);
            boolean optBoolean = data.optBoolean("closeWebView");
            java.lang.String optString2 = data.optString("routeInfo");
            int optInt = data.optInt("routeDelayInMs");
            java.util.HashMap c17 = optJSONObject != null ? dd.d.f228871a.c(optJSONObject) : new java.util.HashMap();
            com.tencent.kinda.gen.KJSEvent kJSEvent2 = this.jsEvent;
            if (kJSEvent2 != null) {
                kJSEvent2.kindaEndWithResult(optString, c17);
            }
            if (optBoolean && (kJSEvent = this.jsEvent) != null) {
                kJSEvent.kindaCloseWebViewImpl(true, new com.tencent.kinda.gen.VoidCallback() { // from class: com.tencent.kinda.framework.kindalite.KindaLiteUseCase$onStoreDispatch$1
                    @Override // com.tencent.kinda.gen.VoidCallback
                    public void call() {
                        com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.kindalite.KindaLiteUseCase.TAG, "webView closed");
                    }
                });
            }
            kotlin.jvm.internal.o.d(optString2);
            if (optString2.length() > 0) {
                startNativeRoute(optString2, optInt);
            }
            return false;
        }
        java.lang.String lowerCase2 = com.tencent.kinda.framework.kindalite.KindaLiteDef.STORE_ACTION_JS_EVENT_CLOSE_WEB_VIEW.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, lowerCase2) && this.jsEvent != null) {
            boolean optBoolean2 = data.optBoolean("animated");
            com.tencent.kinda.gen.KJSEvent kJSEvent3 = this.jsEvent;
            if (kJSEvent3 != null) {
                kJSEvent3.kindaCloseWebViewImpl(optBoolean2, new com.tencent.kinda.gen.VoidCallback() { // from class: com.tencent.kinda.framework.kindalite.KindaLiteUseCase$onStoreDispatch$2
                    @Override // com.tencent.kinda.gen.VoidCallback
                    public void call() {
                        com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.kindalite.KindaLiteUseCase.TAG, "webView closed");
                    }
                });
            }
            return false;
        }
        java.lang.String lowerCase3 = com.tencent.kinda.framework.kindalite.KindaLiteDef.STORE_ACTION_USE_CASE_CALLBACK.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase3, "toLowerCase(...)");
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, lowerCase3) && this.callbackBlock != null) {
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            dd.c cVar = dd.d.f228871a;
            kotlin.jvm.internal.o.d(create);
            cVar.b(data, create);
            com.tencent.mars.xlog.Log.i(TAG, "UseCaseCallback invoked by store (useCaseCallback), marking hasInvokedCallback=true");
            com.tencent.kinda.gen.UseCaseCallback useCaseCallback = this.callbackBlock;
            if (useCaseCallback != null) {
                useCaseCallback.call(create);
            }
            this.hasInvokedCallback = true;
            return false;
        }
        java.lang.String lowerCase4 = com.tencent.kinda.framework.kindalite.KindaLiteDef.STORE_ACTION_UPDATE_LITE_APP_STATE.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase4, "toLowerCase(...)");
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, lowerCase4)) {
            com.tencent.kinda.framework.kindalite.KindaLiteAppState fromCode = com.tencent.kinda.framework.kindalite.KindaLiteAppState.INSTANCE.fromCode(data.optInt("liteAppState"));
            com.tencent.mars.xlog.Log.i(TAG, "updateLiteAppState reported=" + fromCode + " current=" + this.fsm.getState());
            int i17 = fromCode == null ? -1 : com.tencent.kinda.framework.kindalite.KindaLiteUseCase.WhenMappings.$EnumSwitchMapping$0[fromCode.ordinal()];
            if (i17 == 1) {
                this.fsm.dispatch(com.tencent.kinda.framework.kindalite.LiteEvent.JsRunning.INSTANCE);
            } else if (i17 == 2) {
                this.fsm.dispatch(com.tencent.kinda.framework.kindalite.LiteEvent.JsPaying.INSTANCE);
            } else if (i17 != 3) {
                com.tencent.mars.xlog.Log.w(TAG, "updateLiteAppState invalid state: " + fromCode);
            } else {
                this.fsm.dispatch(com.tencent.kinda.framework.kindalite.LiteEvent.JsPaySucceeded.INSTANCE);
            }
        }
        return false;
    }

    @Override // com.tencent.kinda.gen.UseCase
    public void preStepDidDestory() {
        com.tencent.mars.xlog.Log.i(TAG, "preStepDidDestory");
    }

    public final void start(java.lang.String url, com.tencent.kinda.gen.ITransmitKvData data, com.tencent.kinda.gen.UseCaseCallback callback, boolean z17) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(TAG, "start useCase " + url + " isDuplicate=" + z17 + " sessionId=" + this.sessionId);
        com.tencent.kinda.framework.kindalite.KindaLiteMgr.INSTANCE.ensureDynamicModuleRegistered();
        boolean z18 = l75.d1.f316945a;
        l75.d1.f316951g = true;
        this.hasInvokedCallback = false;
        if (z17) {
            reportStopKindaLiteUseCaseSuccess();
        }
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            this.sourceActivity = new java.lang.ref.WeakReference<>(activity);
        }
        this.useCaseUrl = url;
        this.jsEvent = data.getJSEvent("JSEvent");
        this.callbackBlock = callback;
        com.tencent.kinda.framework.module.impl.KindaSessionIdListenerManager.INSTANCE.notifySessionId(this.sessionId);
        reportNativeStartUseCase(data);
        this.fsm.dispatch(new com.tencent.kinda.framework.kindalite.LiteEvent.StartRequested(url, data));
    }

    public final void stop(yz5.a completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        com.tencent.mars.xlog.Log.i(TAG, this + ", stop useCase, current=" + this.fsm.getState());
        this.stopUseCaseCompletion = completion;
        if (this.fsm.getState() == com.tencent.kinda.framework.kindalite.KindaLiteAppState.Idle) {
            com.tencent.mars.xlog.Log.i(TAG, this + ", stop while Idle -> immediate cleanup & onLiteAppStopped");
            this.fsm.dispatch(com.tencent.kinda.framework.kindalite.LiteEvent.StopRequested.INSTANCE);
            return;
        }
        final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f310121d = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        java.lang.String a17 = j62.e.g().a("clicfg_kinda_lite_usecase_stop_timeout_android", "", false, false);
        kotlin.jvm.internal.o.d(a17);
        if (a17.length() > 0) {
            g0Var.f310121d = java.lang.Long.parseLong(a17);
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.kindalite.KindaLiteUseCase$stop$1
            @Override // java.lang.Runnable
            public final void run() {
                yz5.a aVar;
                long j17;
                com.tencent.kinda.framework.kindalite.KindaLiteStateMachine kindaLiteStateMachine;
                long j18;
                long j19;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this);
                sb6.append(", stop timeout, ");
                sb6.append(g0Var.f310121d);
                sb6.append("ms, stopUseCaseCompletion:");
                aVar = com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.stopUseCaseCompletion;
                sb6.append(aVar);
                com.tencent.mars.xlog.Log.e(com.tencent.kinda.framework.kindalite.KindaLiteUseCase.TAG, sb6.toString());
                j17 = com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.liteAppUuid;
                if (j17 != 0) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("stop timeout: close liteapp directly, appUuid=");
                    j18 = com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.liteAppUuid;
                    sb7.append(j18);
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.kindalite.KindaLiteUseCase.TAG, sb7.toString());
                    j19 = com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.liteAppUuid;
                    com.tencent.mm.plugin.lite.LiteAppCenter.closeWindow(j19, new android.content.Intent());
                }
                kindaLiteStateMachine = com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.fsm;
                kindaLiteStateMachine.dispatch(com.tencent.kinda.framework.kindalite.LiteEvent.LiteAppDestroyed.INSTANCE);
                com.tencent.kinda.framework.kindalite.KindaLiteUseCase.this.reportStopKindaLiteUseCaseTimeout();
            }
        };
        this.stopTimeoutHandler.postDelayed(runnable, g0Var.f310121d);
        this.stopTimeoutRunnable = runnable;
        this.fsm.dispatch(com.tencent.kinda.framework.kindalite.LiteEvent.StopRequested.INSTANCE);
    }

    public java.lang.String toString() {
        return "KindaLiteUseCase(sessionId:" + this.sessionId + ", liteAppUuid:" + this.liteAppUuid + ", liteAppState:" + getLiteAppState() + ", discarded:" + this.discardedBeforeStart + ')';
    }

    /* renamed from: wasDiscardedBeforeStart, reason: from getter */
    public final boolean getDiscardedBeforeStart() {
        return this.discardedBeforeStart;
    }
}
