package com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f;

/* loaded from: classes11.dex */
public class t0 implements hm0.q {

    /* renamed from: d, reason: collision with root package name */
    public static java.util.Locale f146557d;

    @Override // hm0.q
    /* renamed from: onConfigurationChanged */
    public void mo43788x50e1c15d(android.content.res.Configuration configuration) {
        if (f146557d == null) {
            return;
        }
        java.util.Locale m78472x26f04c88 = com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78472x26f04c88(com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a().getBaseContext());
        f146557d.toString();
        m78472x26f04c88.toString();
        if (m78472x26f04c88.equals(f146557d)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ToolsProfileAppStatusCallback", "language changed, restart process");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(-1);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/feature/app/extension/ToolsProfileAppStatusCallback", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/feature/app/extension/ToolsProfileAppStatusCallback", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "java/lang/System_EXEC_", "exit", "(I)V");
    }

    @Override // hm0.q
    /* renamed from: onLowMemory */
    public void mo43789xb5d8ba56() {
    }

    @Override // hm0.q
    /* renamed from: onTerminate */
    public void mo43790x7784fb42() {
    }

    @Override // hm0.q
    /* renamed from: onTrimMemory */
    public void mo43791x29685b02(int i17) {
    }
}
