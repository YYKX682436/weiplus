package com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6;

@j95.b
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0014J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0014J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016R(\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/tencent/mm/accessibility/feature/AccessibilityService;", "Li95/w;", "Lcom/tencent/mm/accessibility/feature/IAccessibilityService;", "", "value", "Ljz5/f0;", "setIsTouchExplorationEnable", "enable", "onTouchExEnableChange", "Landroid/content/Context;", "context", "onCreate", "notifyReport", "onAccountInitialized", "onAccountReleased", "triggerOnCreate", "onPerformAccAction", "onClearNodeInfo", "onFakeNodeInfo", "onScreenShotDisable", "onEvilTextChange", "onInitNodeInfo", "needInterceptAccAction", "onInjectionIntercept", "Ljava/util/concurrent/Future;", "lastChangeTouchExFuture", "Ljava/util/concurrent/Future;", "getLastChangeTouchExFuture", "()Ljava/util/concurrent/Future;", "setLastChangeTouchExFuture", "(Ljava/util/concurrent/Future;)V", "<init>", "()V", "Companion", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.feature.AccessibilityService */
/* loaded from: classes14.dex */
public final class C4944x21065da7 extends i95.w implements com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70 {
    public static final java.lang.String TAG = "MicroMsg.Acc.AccessibilityService";
    private java.util.concurrent.Future<?> lastChangeTouchExFuture;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onTouchExEnableChange */
    public final void m42737x86a38c26(final boolean z17) {
        final long mo42694x1fe7a0ac = ((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26.class)).mo42694x1fe7a0ac();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onTouchExEnableChange: " + z17 + " delayTime:" + mo42694x1fe7a0ac);
        java.util.concurrent.Future<?> future = this.lastChangeTouchExFuture;
        if ((future == null || future.isDone()) ? false : true) {
            java.util.concurrent.Future<?> future2 = this.lastChangeTouchExFuture;
            if (future2 != null) {
                future2.cancel(false);
            }
            this.lastChangeTouchExFuture = null;
        }
        if (mo42694x1fe7a0ac == 0) {
            m42738x85457853(z17);
            return;
        }
        if (!z17) {
            m42738x85457853(z17);
            return;
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.accessibility.feature.AccessibilityService$onTouchExEnableChange$1
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("accessibility");
                android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
                if (accessibilityManager == null) {
                    return;
                }
                boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
                com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4944x21065da7.this.m42738x85457853(isTouchExplorationEnabled);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4944x21065da7.TAG, "onTouchExEnableChange uiDelay: before:" + z17 + " curEnable:" + isTouchExplorationEnabled + " delayTime:" + mo42694x1fe7a0ac);
                com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4944x21065da7.this.m42749xdcf801ad(null);
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.lastChangeTouchExFuture = t0Var.z(runnable, mo42694x1fe7a0ac, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setIsTouchExplorationEnable */
    public final void m42738x85457853(boolean z17) {
        com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42856x614a1309(z17);
        m42741x55127ddd(z17);
    }

    /* renamed from: getLastChangeTouchExFuture */
    public final java.util.concurrent.Future<?> m42739xc6c81c39() {
        return this.lastChangeTouchExFuture;
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70
    /* renamed from: needInterceptAccAction */
    public void mo42740x4a6402ab() {
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4862x9db39cf8.f21029x4fbc8495.m42432xf06eb601();
    }

    /* renamed from: notifyReport */
    public final void m42741x55127ddd(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4864x87555862 c4864x87555862 = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4864x87555862.f21035x4fbc8495;
            c4864x87555862.m42446xc5c2625b();
            c4864x87555862.m42445xb95cab5a();
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4866xbe15d4e3.f21037x4fbc8495.m42458x553fd8c4();
        }
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4870xf76bb94c.f21056x4fbc8495.m42476xb0dfc7d8(z17);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03 c4966x1d004c03 = com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_autoaccessibility_globle_disable, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isGlobalDisableAcc = " + Ni);
        c4966x1d004c03.m42855x48700fe(Ni == 1);
        if (!c4966x1d004c03.m42844xf1b90650()) {
            int Ri = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_autoaccessibility_force_enable, bm5.h0.RepairerConfig_AutoAccessibility_AccForcedEnable_Int, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableAccEnableForced = " + Ri);
            c4966x1d004c03.m42853x842b8a18(Ri == 1);
        }
        int Ri2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_accessibility_expand_enable, bm5.h0.RepairerConfig_AutoAccessibility_ExpandEnable_Int, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableExpand = " + Ri2);
        c4966x1d004c03.m42854x1aff0f7f(Ri2 == 1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            c4966x1d004c03.m42854x1aff0f7f(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[isMonkeyEnv] isEnableExpand = false");
        }
        c4966x1d004c03.m42851xf7a10fcd(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20238x3dd57e4e()) == 1);
        ((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26.class)).mo42697xa4492ff3();
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4864x87555862.f21035x4fbc8495.m42443xd75a7de4();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4864x87555862.f21035x4fbc8495.m42444xc34f59db();
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70
    /* renamed from: onClearNodeInfo */
    public void mo42742x49fa179e() {
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4866xbe15d4e3.f21037x4fbc8495.m42455xa15e6f62();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("accessibility");
        android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
        if (accessibilityManager == null) {
            return;
        }
        m42738x85457853(accessibilityManager.isTouchExplorationEnabled());
        o3.c.a(accessibilityManager, new o3.d() { // from class: com.tencent.mm.accessibility.feature.AccessibilityService$onCreate$1
            @Override // o3.d
            /* renamed from: onTouchExplorationStateChanged */
            public final void mo42751x8dbeb5e6(boolean z17) {
                com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4944x21065da7.this.m42737x86a38c26(z17);
            }
        });
        if (z65.c.a()) {
            com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03 c4966x1d004c03 = com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495;
            java.lang.Boolean a17 = com.p314xaae8f345.mm.p642xad8b531f.s.b(context).a(".com.tencent.mm.debug.enableacc");
            c4966x1d004c03.m42853x842b8a18(a17 == null ? false : a17.booleanValue());
        }
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4866xbe15d4e3 c4866xbe15d4e3 = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4866xbe15d4e3.f21037x4fbc8495;
        c4866xbe15d4e3.m42453xd75a7de4();
        c4866xbe15d4e3.m42458x553fd8c4();
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70
    /* renamed from: onEvilTextChange */
    public void mo42743xfd403bb0() {
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4858xec5719b3.f21017x4fbc8495.m175020x3cb8acf();
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70
    /* renamed from: onFakeNodeInfo */
    public void mo42744xd12a57c4() {
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4866xbe15d4e3.f21037x4fbc8495.m42456xe890b9fc();
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4859xcc84581e.f21022x4fbc8495.m175020x3cb8acf();
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70
    /* renamed from: onInitNodeInfo */
    public void mo42745x3f4bfa7f() {
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4866xbe15d4e3.f21037x4fbc8495.m42454x9ed161b6();
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70
    /* renamed from: onInjectionIntercept */
    public void mo42746xf0eb9ea() {
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4861xc33a6ced.f21026x4fbc8495.m175020x3cb8acf();
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70
    /* renamed from: onPerformAccAction */
    public void mo42747xd49267b5() {
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4866xbe15d4e3.f21037x4fbc8495.m42457x1a4f18d6();
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70
    /* renamed from: onScreenShotDisable */
    public void mo42748x34ceea63() {
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4857xd88ab861.f21013x4fbc8495.m175020x3cb8acf();
    }

    /* renamed from: setLastChangeTouchExFuture */
    public final void m42749xdcf801ad(java.util.concurrent.Future<?> future) {
        this.lastChangeTouchExFuture = future;
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70
    /* renamed from: triggerOnCreate */
    public void mo42750xca12f993() {
    }
}
