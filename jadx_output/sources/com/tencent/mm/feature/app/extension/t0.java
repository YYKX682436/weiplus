package com.tencent.mm.feature.app.extension;

/* loaded from: classes11.dex */
public class t0 implements hm0.q {

    /* renamed from: d, reason: collision with root package name */
    public static java.util.Locale f65024d;

    @Override // hm0.q
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        if (f65024d == null) {
            return;
        }
        java.util.Locale initLanguage = com.tencent.mm.ui.MMActivity.initLanguage(com.tencent.mm.sdk.platformtools.i.a().getBaseContext());
        f65024d.toString();
        initLanguage.toString();
        if (initLanguage.equals(f65024d)) {
            return;
        }
        com.tencent.mars.xlog.Log.w("ToolsProfileAppStatusCallback", "language changed, restart process");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(-1);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/feature/app/extension/ToolsProfileAppStatusCallback", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/feature/app/extension/ToolsProfileAppStatusCallback", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "java/lang/System_EXEC_", "exit", "(I)V");
    }

    @Override // hm0.q
    public void onLowMemory() {
    }

    @Override // hm0.q
    public void onTerminate() {
    }

    @Override // hm0.q
    public void onTrimMemory(int i17) {
    }
}
