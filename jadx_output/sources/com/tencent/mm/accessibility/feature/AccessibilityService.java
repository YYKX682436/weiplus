package com.tencent.mm.accessibility.feature;

@j95.b
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0014J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0014J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016R(\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/tencent/mm/accessibility/feature/AccessibilityService;", "Li95/w;", "Lcom/tencent/mm/accessibility/feature/IAccessibilityService;", "", "value", "Ljz5/f0;", "setIsTouchExplorationEnable", "enable", "onTouchExEnableChange", "Landroid/content/Context;", "context", "onCreate", "notifyReport", "onAccountInitialized", "onAccountReleased", "triggerOnCreate", "onPerformAccAction", "onClearNodeInfo", "onFakeNodeInfo", "onScreenShotDisable", "onEvilTextChange", "onInitNodeInfo", "needInterceptAccAction", "onInjectionIntercept", "Ljava/util/concurrent/Future;", "lastChangeTouchExFuture", "Ljava/util/concurrent/Future;", "getLastChangeTouchExFuture", "()Ljava/util/concurrent/Future;", "setLastChangeTouchExFuture", "(Ljava/util/concurrent/Future;)V", "<init>", "()V", "Companion", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class AccessibilityService extends i95.w implements com.tencent.mm.accessibility.feature.IAccessibilityService {
    public static final java.lang.String TAG = "MicroMsg.Acc.AccessibilityService";
    private java.util.concurrent.Future<?> lastChangeTouchExFuture;

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTouchExEnableChange(final boolean z17) {
        final long touchExDelayConfirmTimeMs = ((com.tencent.mm.accessibility.feature.IAccExptService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccExptService.class)).getTouchExDelayConfirmTimeMs();
        com.tencent.mars.xlog.Log.i(TAG, "onTouchExEnableChange: " + z17 + " delayTime:" + touchExDelayConfirmTimeMs);
        java.util.concurrent.Future<?> future = this.lastChangeTouchExFuture;
        if ((future == null || future.isDone()) ? false : true) {
            java.util.concurrent.Future<?> future2 = this.lastChangeTouchExFuture;
            if (future2 != null) {
                future2.cancel(false);
            }
            this.lastChangeTouchExFuture = null;
        }
        if (touchExDelayConfirmTimeMs == 0) {
            setIsTouchExplorationEnable(z17);
            return;
        }
        if (!z17) {
            setIsTouchExplorationEnable(z17);
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.accessibility.feature.AccessibilityService$onTouchExEnableChange$1
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
                android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
                if (accessibilityManager == null) {
                    return;
                }
                boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
                com.tencent.mm.accessibility.feature.AccessibilityService.this.setIsTouchExplorationEnable(isTouchExplorationEnabled);
                com.tencent.mars.xlog.Log.i(com.tencent.mm.accessibility.feature.AccessibilityService.TAG, "onTouchExEnableChange uiDelay: before:" + z17 + " curEnable:" + isTouchExplorationEnabled + " delayTime:" + touchExDelayConfirmTimeMs);
                com.tencent.mm.accessibility.feature.AccessibilityService.this.setLastChangeTouchExFuture(null);
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.lastChangeTouchExFuture = t0Var.z(runnable, touchExDelayConfirmTimeMs, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIsTouchExplorationEnable(boolean z17) {
        com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.setTouchExplorationEnable(z17);
        notifyReport(z17);
    }

    public final java.util.concurrent.Future<?> getLastChangeTouchExFuture() {
        return this.lastChangeTouchExFuture;
    }

    @Override // com.tencent.mm.accessibility.feature.IAccessibilityService
    public void needInterceptAccAction() {
        com.tencent.mm.accessibility.core.AccInterceptActionReporter.INSTANCE.tryReportInterceptInfo();
    }

    public final void notifyReport(boolean z17) {
        if (z17) {
            com.tencent.mm.accessibility.core.AccReporter accReporter = com.tencent.mm.accessibility.core.AccReporter.INSTANCE;
            accReporter.reportTouchExplorationEnable();
            accReporter.reportAppTypeIfNeed();
            com.tencent.mm.accessibility.core.AccServiceInfoReporter.INSTANCE.tryReportAccessibilityServiceInfo();
        }
        com.tencent.mm.accessibility.core.AccTouchTimeReporter.INSTANCE.onNotifyChange(z17);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.accessibility.uitl.AccUtil accUtil = com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_autoaccessibility_globle_disable, 0);
        com.tencent.mars.xlog.Log.i(TAG, "isGlobalDisableAcc = " + Ni);
        accUtil.setGlobalDisableAcc(Ni == 1);
        if (!accUtil.isEnableAccEnableForced()) {
            int Ri = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_autoaccessibility_force_enable, bm5.h0.RepairerConfig_AutoAccessibility_AccForcedEnable_Int, 0);
            com.tencent.mars.xlog.Log.i(TAG, "isEnableAccEnableForced = " + Ri);
            accUtil.setEnableAccEnableForced(Ri == 1);
        }
        int Ri2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_accessibility_expand_enable, bm5.h0.RepairerConfig_AutoAccessibility_ExpandEnable_Int, 1);
        com.tencent.mars.xlog.Log.i(TAG, "isEnableExpand = " + Ri2);
        accUtil.setEnableExpand(Ri2 == 1);
        if (com.tencent.mm.sdk.platformtools.s9.f192974b) {
            accUtil.setEnableExpand(false);
            com.tencent.mars.xlog.Log.i(TAG, "[isMonkeyEnv] isEnableExpand = false");
        }
        accUtil.setDisableAccClick(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.global.RepairerConfigAccbilityDisableClick()) == 1);
        ((com.tencent.mm.accessibility.feature.IAccExptService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccExptService.class)).initAccConfig();
        com.tencent.mm.accessibility.core.AccReporter.INSTANCE.initListener();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.accessibility.core.AccReporter.INSTANCE.releaseListener();
    }

    @Override // com.tencent.mm.accessibility.feature.IAccessibilityService
    public void onClearNodeInfo() {
        com.tencent.mm.accessibility.core.AccServiceInfoReporter.INSTANCE.markAccServiceHasClearInfo();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
        android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
        if (accessibilityManager == null) {
            return;
        }
        setIsTouchExplorationEnable(accessibilityManager.isTouchExplorationEnabled());
        o3.c.a(accessibilityManager, new o3.d() { // from class: com.tencent.mm.accessibility.feature.AccessibilityService$onCreate$1
            @Override // o3.d
            public final void onTouchExplorationStateChanged(boolean z17) {
                com.tencent.mm.accessibility.feature.AccessibilityService.this.onTouchExEnableChange(z17);
            }
        });
        if (z65.c.a()) {
            com.tencent.mm.accessibility.uitl.AccUtil accUtil = com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE;
            java.lang.Boolean a17 = com.tencent.mm.booter.s.b(context).a(".com.tencent.mm.debug.enableacc");
            accUtil.setEnableAccEnableForced(a17 == null ? false : a17.booleanValue());
        }
        com.tencent.mm.accessibility.core.AccServiceInfoReporter accServiceInfoReporter = com.tencent.mm.accessibility.core.AccServiceInfoReporter.INSTANCE;
        accServiceInfoReporter.initListener();
        accServiceInfoReporter.tryReportAccessibilityServiceInfo();
    }

    @Override // com.tencent.mm.accessibility.feature.IAccessibilityService
    public void onEvilTextChange() {
        com.tencent.mm.accessibility.core.AccEvilTextChangeReporter.INSTANCE.tryReport();
    }

    @Override // com.tencent.mm.accessibility.feature.IAccessibilityService
    public void onFakeNodeInfo() {
        com.tencent.mm.accessibility.core.AccServiceInfoReporter.INSTANCE.markAccServiceHasFakeInfo();
        com.tencent.mm.accessibility.core.AccFakeInfoInstantReporter.INSTANCE.tryReport();
    }

    @Override // com.tencent.mm.accessibility.feature.IAccessibilityService
    public void onInitNodeInfo() {
        com.tencent.mm.accessibility.core.AccServiceInfoReporter.INSTANCE.makeAccServiceHasInitInfo();
    }

    @Override // com.tencent.mm.accessibility.feature.IAccessibilityService
    public void onInjectionIntercept() {
        com.tencent.mm.accessibility.core.AccInjectionInterceptReporter.INSTANCE.tryReport();
    }

    @Override // com.tencent.mm.accessibility.feature.IAccessibilityService
    public void onPerformAccAction() {
        com.tencent.mm.accessibility.core.AccServiceInfoReporter.INSTANCE.markAccServicePerformAction();
    }

    @Override // com.tencent.mm.accessibility.feature.IAccessibilityService
    public void onScreenShotDisable() {
        com.tencent.mm.accessibility.core.AccEvilServiceReporter.INSTANCE.tryReport();
    }

    public final void setLastChangeTouchExFuture(java.util.concurrent.Future<?> future) {
        this.lastChangeTouchExFuture = future;
    }

    @Override // com.tencent.mm.accessibility.feature.IAccessibilityService
    public void triggerOnCreate() {
    }
}
