package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class y9 {
    public y9(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "<this>");
        int requestedOrientation = activity.getRequestedOrientation();
        if (requestedOrientation != -1) {
            if (requestedOrientation != 1) {
                return false;
            }
        } else if (1 != activity.getResources().getConfiguration().orientation) {
            return false;
        }
        return true;
    }

    public final boolean b(com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI, com.tencent.mm.plugin.appbrand.ui.x9 x9Var) {
        java.lang.Class cls;
        android.graphics.Bitmap Y1;
        java.lang.String a17 = bm5.f1.a();
        kotlin.jvm.internal.o.f(a17, "getProcessName(...)");
        boolean z17 = false;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            cls = com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUIMM.class;
        } else if (r26.i0.n(a17, ":appbrand4", false)) {
            cls = com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI4.class;
        } else if (r26.i0.n(a17, ":appbrand3", false)) {
            cls = com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI3.class;
        } else if (r26.i0.n(a17, ":appbrand2", false)) {
            cls = com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI2.class;
        } else {
            if (!r26.i0.n(a17, ":appbrand1", false)) {
                if (r26.i0.n(a17, ":appbrand0", false)) {
                    cls = com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI0.class;
                }
                return false;
            }
            cls = com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI1.class;
        }
        com.tencent.mm.plugin.appbrand.hc q76 = appBrandUI.q7();
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = q76 != null ? q76.getActiveRuntime() : null;
        com.tencent.mm.plugin.appbrand.o6 o6Var = activeRuntime instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) activeRuntime : null;
        if (o6Var != null && (Y1 = o6Var.Y1()) != null && !Y1.isRecycled() && Y1.getWidth() > 0 && Y1.getHeight() > 0) {
            int hashCode = appBrandUI.hashCode();
            com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI.f89438h.put(hashCode, Y1);
            com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI.f89439i.put(hashCode, appBrandUI);
            android.content.Intent addFlags = new android.content.Intent(appBrandUI, (java.lang.Class<?>) cls).addFlags(268435456);
            android.view.Window window = appBrandUI.getWindow();
            if (window != null && window.getDecorView() != null && (window.getDecorView().getSystemUiVisibility() & 8192) != 0) {
                z17 = true;
            }
            addFlags.putExtra("KEY_LIGHT_STATUS_BAR_BOOL", z17);
            addFlags.putExtra("KEY_NAVIGATION_BAR_COLOR_INT", appBrandUI.getWindow().getNavigationBarColor());
            addFlags.putExtra("KEY_FULLSCREEN_BOOL", com.tencent.mm.plugin.appbrand.ui.na.j(appBrandUI));
            addFlags.putExtra("KEY_REQUESTED_ORIENTATION_INT", appBrandUI.getRequestedOrientation());
            addFlags.putExtra("KEY_ACTIVITY_HASH_INT", hashCode);
            addFlags.putExtra("KEY_WORKAROUND_SCENE", x9Var.ordinal());
            appBrandUI.H7(addFlags, -1, null);
            return true;
        }
        return false;
    }
}
