package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class y extends com.tencent.mm.plugin.appbrand.jsapi.f implements com.tencent.mm.minigame.g0 {
    public static final int CTRL_INDEX = 1519;
    public static final java.lang.String NAME = "operateWVA";

    /* renamed from: g, reason: collision with root package name */
    public static boolean f69159g = true;

    /* renamed from: h, reason: collision with root package name */
    public static com.tencent.mm.minigame.m f69160h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f69161i;

    public static final java.lang.Object C(com.tencent.mm.minigame.y yVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, java.lang.String str, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        yVar.getClass();
        boolean b17 = kotlin.jvm.internal.o.b(str, "bootFramework");
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (b17) {
            java.lang.Object G = yVar.G(c0Var, continuation);
            return G == pz5.a.f359186d ? G : f0Var;
        }
        if (!kotlin.jvm.internal.o.b(str, "launchApp")) {
            return f0Var;
        }
        com.tencent.mm.minigame.j1 j1Var = com.tencent.mm.minigame.j1.f69084a;
        java.lang.String appId = c0Var.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        j1Var.a(appId);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(com.tencent.mm.minigame.y r10, com.tencent.mm.plugin.appbrand.service.c0 r11, java.lang.String r12, java.util.Map r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.minigame.y.D(com.tencent.mm.minigame.y, com.tencent.mm.plugin.appbrand.service.c0, java.lang.String, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x008b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0253 A[LOOP:0: B:54:0x0251->B:55:0x0253, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0264 A[LOOP:1: B:58:0x0262->B:59:0x0264, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0204  */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l r18, org.json.JSONObject r19, int r20) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.minigame.y.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }

    public final java.lang.String E() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new jz5.l("frameworkVersion", com.tencent.mm.minigame.u0.f69147e.a("WVA_VERSION")));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            sb6.append((java.lang.String) lVar.f302833d);
            sb6.append(':');
            sb6.append(lVar.f302834e.toString());
            sb6.append(';');
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String F(int i17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(kz5.c1.k(new jz5.l("errno", java.lang.Integer.valueOf(i17)), new jz5.l(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, str)));
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        try {
            jSONObject.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        java.lang.String u17 = u(str2, jSONObject);
        kotlin.jvm.internal.o.f(u17, "makeReturnJson(...)");
        return u17;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(com.tencent.mm.plugin.appbrand.service.c0 r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.minigame.y.G(com.tencent.mm.plugin.appbrand.service.c0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public synchronized void H(com.tencent.mm.plugin.appbrand.service.c0 env) {
        kotlin.jvm.internal.o.g(env, "env");
        if (f69159g) {
            com.tencent.mars.xlog.Log.i("WVA.JsApiOperateWVA", "onWVAApiInit userId:" + (android.os.Process.myUid() / 100000));
            int i17 = hx5.c.f285706a;
            ix5.h hVar = ix5.h.f295631b;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            hVar.f(context);
            com.tencent.mm.minigame.m1 m1Var = com.tencent.mm.minigame.m1.f69109c;
            kotlin.jvm.internal.o.f(m1Var, "getInstance(...)");
            com.tencent.shadow.core.common.LoggerFactory.setILoggerFactory(m1Var);
            m1Var.init(false);
            com.tencent.mm.minigame.j0 j0Var = com.tencent.mm.minigame.j0.f69083a;
            java.lang.String appId = env.getAppId();
            kotlin.jvm.internal.o.f(appId, "getAppId(...)");
            j0Var.d(appId);
            I(env);
            f69159g = false;
        }
    }

    public final void I(com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        ob0.u2 u2Var = (ob0.u2) i95.n0.c(ob0.u2.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((com.tencent.mm.feature.performance.s) u2Var).getClass();
        java.lang.String c17 = com.tencent.mm.app.t4.c(context, "com.tencent.mm_isolated_process2", "wva_sandbox_crash");
        kotlin.jvm.internal.o.f(c17, "buildIsolatedJavaCrashPath(...)");
        ob0.u2 u2Var2 = (ob0.u2) i95.n0.c(ob0.u2.class);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((com.tencent.mm.feature.performance.s) u2Var2).getClass();
        java.lang.String d17 = com.tencent.mm.app.t4.d(context2, "com.tencent.mm_isolated_process2", "wva_sandbox_crash");
        kotlin.jvm.internal.o.f(d17, "buildIsolatedNativeCrashPath(...)");
        ix5.h hVar = ix5.h.f295631b;
        com.tencent.shadow.dynamic.host.HostOpenPathDelegate.addHostOpenPath("javaDump", c17);
        com.tencent.shadow.dynamic.host.HostOpenPathDelegate.addHostOpenPath("nativeDump", d17);
        com.tencent.mm.app.MMCrashReportContents.T.f(new com.tencent.mm.minigame.w(this));
        com.tencent.mm.app.MMBugReportContents.f53230k.f53734x.f(new com.tencent.mm.minigame.x(this));
        try {
            java.lang.String jSONObject = new org.json.JSONObject().put("appbrand", "weapp_id:" + c0Var.getAppId() + ";weapp_name:" + c0Var.t3().n0() + ";weapp_version:" + c0Var.t3().d2()).put("wva", E()).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(c17.concat(".ext"));
            r6Var.k();
            com.tencent.mm.vfs.s6.d(r6Var, jSONObject, null, 2, null);
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(d17.concat(".ext"));
            r6Var2.k();
            com.tencent.mm.vfs.s6.d(r6Var2, jSONObject, null, 2, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("WVA.JsApiOperateWVA", e17, "prepareForCrashReport", new java.lang.Object[0]);
        }
    }
}
