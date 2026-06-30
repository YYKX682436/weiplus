package com.tencent.mm.plugin.appbrand;

/* loaded from: classes5.dex */
public class v implements java.lang.Runnable {
    public v(com.tencent.mm.plugin.appbrand.p pVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/AppBrandCommand$6", "run", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/plugin/appbrand/AppBrandCommand$6", "run", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
    }
}
