package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes3.dex */
public final class y3 {
    public y3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (android.os.Build.VERSION.SDK_INT > 28) {
            try {
                java.lang.Object invoke = java.lang.Class.forName("android.view.WindowManagerGlobal").getMethod("getWindowManagerService", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                java.lang.Class<?> cls = invoke.getClass();
                java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cls2);
                java.lang.Object invoke2 = cls.getMethod("hasNavigationBar", cls2).invoke(invoke, context.getClass().getMethod("getDisplayId", new java.lang.Class[0]).invoke(context, new java.lang.Object[0]));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke2, "null cannot be cast to non-null type kotlin.Boolean");
                return ((java.lang.Boolean) invoke2).booleanValue();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewBottomNavigatorHelper", "checkDeviceHasNavigationBar Q ex:%s", th6.getMessage());
            }
        } else {
            try {
                java.lang.Object invoke3 = java.lang.Class.forName("android.view.WindowManagerGlobal").getMethod("getWindowManagerService", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                java.lang.Object invoke4 = invoke3.getClass().getMethod("hasNavigationBar", new java.lang.Class[0]).invoke(invoke3, new java.lang.Object[0]);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke4, "null cannot be cast to non-null type kotlin.Boolean");
                return ((java.lang.Boolean) invoke4).booleanValue();
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewBottomNavigatorHelper", "checkDeviceHasNavigationBar ex:%s", th7.getMessage());
            }
        }
        return false;
    }

    public final boolean b(android.content.Context context) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        boolean z17 = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            java.lang.Object invoke = cls.getMethod("get", java.lang.String.class).invoke(cls, "qemu.hw.mainkeys");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type kotlin.String");
            str = (java.lang.String) invoke;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewBottomNavigatorHelper", "hasNavigationBar ex:%s", th6.getMessage());
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("1", str)) {
            return false;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("0", str)) {
            return true;
        }
        return z17;
    }
}
