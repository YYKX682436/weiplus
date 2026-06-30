package com.tencent.mm.plugin.appbrand.service;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class o0 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.service.o0 f88728f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.service.o0 f88729g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.service.o0 f88730h;

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.service.o0 f88731p;

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.service.o0 f88732r;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.service.o0[] f88733u;

    /* renamed from: d, reason: collision with root package name */
    public final int f88734d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f88735e;

    static {
        com.tencent.mm.plugin.appbrand.service.o0 o0Var = new com.tencent.mm.plugin.appbrand.service.o0("OK", 0, 0, ya.b.SUCCESS);
        f88728f = o0Var;
        com.tencent.mm.plugin.appbrand.service.o0 o0Var2 = new com.tencent.mm.plugin.appbrand.service.o0("NOT_IN_FOREGROUND", 1, -1, "app task is not in foreground.");
        com.tencent.mm.plugin.appbrand.service.o0 o0Var3 = new com.tencent.mm.plugin.appbrand.service.o0("NOT_IN_AGENT_MODE", 2, -2, "app task is not in agent mode.");
        f88729g = o0Var3;
        com.tencent.mm.plugin.appbrand.service.o0 o0Var4 = new com.tencent.mm.plugin.appbrand.service.o0("NOT_BOUND_TO_APP_ID", 3, -3, "command not bound to appid.");
        com.tencent.mm.plugin.appbrand.service.o0 o0Var5 = new com.tencent.mm.plugin.appbrand.service.o0("WEB_VIEW_NOT_EXIST", 4, -4, "webview not exist.");
        com.tencent.mm.plugin.appbrand.service.o0 o0Var6 = new com.tencent.mm.plugin.appbrand.service.o0("COMMAND_FAILURE", 5, -5, "command run failed.");
        f88730h = o0Var6;
        com.tencent.mm.plugin.appbrand.service.o0 o0Var7 = new com.tencent.mm.plugin.appbrand.service.o0("PARAMS_INVALID", 6, -6, "command params invalid.");
        com.tencent.mm.plugin.appbrand.service.o0 o0Var8 = new com.tencent.mm.plugin.appbrand.service.o0("INTERRUPT_BY_REQUEST_PAYMENT", 7, -7, "interrupt by requestPayment.");
        com.tencent.mm.plugin.appbrand.service.o0 o0Var9 = new com.tencent.mm.plugin.appbrand.service.o0("ENGINE_IS_SKYLINE", 8, -8, "skyline view is not supported.");
        com.tencent.mm.plugin.appbrand.service.o0 o0Var10 = new com.tencent.mm.plugin.appbrand.service.o0("INTERRUPT_BY_USER", 9, -9, "interrupt by user.");
        com.tencent.mm.plugin.appbrand.service.o0 o0Var11 = new com.tencent.mm.plugin.appbrand.service.o0("APP_NOT_IN_FOREGROUND", 10, -10, "app not in foreground.");
        com.tencent.mm.plugin.appbrand.service.o0 o0Var12 = new com.tencent.mm.plugin.appbrand.service.o0("JUMP_OTHER_PAGE", 11, -11, "jump other page.");
        com.tencent.mm.plugin.appbrand.service.o0 o0Var13 = new com.tencent.mm.plugin.appbrand.service.o0("APP_BANNED", 12, -12, "app is banned.");
        f88731p = o0Var13;
        com.tencent.mm.plugin.appbrand.service.o0 o0Var14 = new com.tencent.mm.plugin.appbrand.service.o0("APP_EXIT", 13, -13, "app is exit.");
        com.tencent.mm.plugin.appbrand.service.o0 o0Var15 = new com.tencent.mm.plugin.appbrand.service.o0("APP_LAUNCH_FAIL_NETWORK", 14, -15, "app launch fail, maybe network error.");
        f88732r = o0Var15;
        com.tencent.mm.plugin.appbrand.service.o0[] o0VarArr = {o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6, o0Var7, o0Var8, o0Var9, o0Var10, o0Var11, o0Var12, o0Var13, o0Var14, o0Var15, new com.tencent.mm.plugin.appbrand.service.o0("COMMAND_FAILURE_CLICK_CAPSULE_BUTTON", 15, -52, "click capsule button."), new com.tencent.mm.plugin.appbrand.service.o0("TOUCH_POINT_NOT_SIMILARITY", 16, -51, "touch point not similarity.")};
        f88733u = o0VarArr;
        rz5.b.a(o0VarArr);
    }

    public o0(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f88734d = i18;
        this.f88735e = str2;
    }

    public static com.tencent.mm.plugin.appbrand.service.o0 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.service.o0) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.service.o0.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.service.o0[] values() {
        return (com.tencent.mm.plugin.appbrand.service.o0[]) f88733u.clone();
    }
}
