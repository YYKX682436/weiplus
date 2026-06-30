package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class z8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.z8 f90369a = new com.tencent.mm.plugin.appbrand.ui.z8();

    public final void a(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.lang.String str3 = str2 == null ? "null" : str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIEnterAnimationCompleteIPCNotify", "doNotify current:" + bm5.f1.a() + ", target:" + str + ", activity:" + str2);
        com.tencent.mm.ipcinvoker.extension.l.a(str, new com.tencent.mm.ipcinvoker.type.IPCString(str3), com.tencent.mm.plugin.appbrand.ui.y8.class, null);
    }
}
