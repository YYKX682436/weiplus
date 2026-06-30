package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class b1 extends ze.g {
    public static final com.tencent.mm.plugin.appbrand.ui.a1 Companion = new com.tencent.mm.plugin.appbrand.ui.a1(null);
    private static final nf.r forceCenterInside$delegate;
    private static final nf.r forceNotCenterInside$delegate;
    private static java.lang.Boolean mayDisableInHuaWeiDevices;
    private final xi1.g base;

    static {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        forceCenterInside$delegate = new nf.r(bool);
        forceNotCenterInside$delegate = new nf.r(bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6, xi1.p activityOrientationHandler, xi1.g base) {
        super(rt6, activityOrientationHandler, false, 4, null);
        kotlin.jvm.internal.o.g(rt6, "rt");
        kotlin.jvm.internal.o.g(activityOrientationHandler, "activityOrientationHandler");
        kotlin.jvm.internal.o.g(base, "base");
        this.base = base;
    }

    public static final /* synthetic */ nf.r access$getForceCenterInside$delegate$cp() {
        return forceCenterInside$delegate;
    }

    public static final /* synthetic */ nf.r access$getForceNotCenterInside$delegate$cp() {
        return forceNotCenterInside$delegate;
    }

    public static final /* synthetic */ java.lang.Boolean access$getMayDisableInHuaWeiDevices$cp() {
        return mayDisableInHuaWeiDevices;
    }

    public static final /* synthetic */ void access$setMayDisableInHuaWeiDevices$cp(java.lang.Boolean bool) {
        mayDisableInHuaWeiDevices = bool;
    }

    private final boolean enableForGame() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_center_inside_for_mini_game, 0) == 1;
    }

    public static final boolean isBlackListing(android.content.Context context) {
        return Companion.c(context);
    }

    @Override // ze.g
    public int getBackgroundColor() {
        return com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.b(getInitConfig()) ? com.tencent.mm.R.color.f478714f5 : com.tencent.mm.R.color.f478492d;
    }

    @Override // ze.g, xi1.s
    public xi1.f getStatusBar() {
        return this.base.getStatusBar();
    }

    @Override // ze.g, xi1.s
    public boolean shouldInLargeScreenCompatMode() {
        com.tencent.mm.plugin.appbrand.ui.a1 a1Var = Companion;
        if (a1Var.a()) {
            return true;
        }
        if (getRt().Q0()) {
            return false;
        }
        if (getInitConfig() != null) {
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU initConfig = getInitConfig();
            kotlin.jvm.internal.o.d(initConfig);
            if (((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) initConfig).f77292e2 || (com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.b(getInitConfig()) && !enableForGame())) {
                return false;
            }
        }
        if (getResizable() || a1Var.c(this.base.getContext())) {
            return false;
        }
        nf.y yVar = nf.x.f336616b;
        if (yVar != null ? yVar.e() : false) {
            return true;
        }
        return super.shouldInLargeScreenCompatMode();
    }
}
