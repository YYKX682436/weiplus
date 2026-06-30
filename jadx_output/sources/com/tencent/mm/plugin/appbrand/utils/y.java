package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f90620a = {"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"};

    public static final kotlinx.coroutines.y0 a(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(lVar, "<this>");
        androidx.lifecycle.y lifecycleOwner = lVar.getLifecycleOwner();
        return (lifecycleOwner == null || (mo133getLifecycle = lifecycleOwner.mo133getLifecycle()) == null) ? v65.m.f433580a : androidx.lifecycle.w.a(mo133getLifecycle);
    }

    public static final void b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String permission, int i17, java.lang.String reasonTitle, java.lang.String reasonMsg, com.tencent.mm.plugin.appbrand.utils.y3 callback) {
        kotlin.jvm.internal.o.g(lVar, "<this>");
        kotlin.jvm.internal.o.g(permission, "permission");
        kotlin.jvm.internal.o.g(reasonTitle, "reasonTitle");
        kotlin.jvm.internal.o.g(reasonMsg, "reasonMsg");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (nf.t.b(com.tencent.mm.sdk.platformtools.x2.f193071a, lVar, permission)) {
            callback.a(com.tencent.mm.plugin.appbrand.utils.i4.f90479e);
            return;
        }
        if (kz5.z.G(f90620a, permission) && fp.h.a(31)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEnvExt", "requestPermissionAsync, request " + permission + " is blocked");
            callback.a(nf.t.b(lVar.getContext(), lVar, permission) ? com.tencent.mm.plugin.appbrand.utils.i4.f90479e : com.tencent.mm.plugin.appbrand.utils.i4.f90478d);
            return;
        }
        android.content.Context context = lVar.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandEnvExt", "requestPermissionAsync, activity is null");
            callback.a(com.tencent.mm.plugin.appbrand.utils.i4.f90478d);
            return;
        }
        java.lang.String appId = lVar.getAppId();
        if (appId == null) {
            appId = "";
        }
        com.tencent.mm.plugin.appbrand.utils.v vVar = new com.tencent.mm.plugin.appbrand.utils.v(i17, appId, permission, callback);
        si1.e1.a(appId, vVar);
        if (nf.t.a(activity, lVar, permission, i17, reasonTitle, reasonMsg)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEnvExt", "requestPermissionAsync, not need");
            si1.e1.b(appId, vVar);
            callback.a(com.tencent.mm.plugin.appbrand.utils.i4.f90479e);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEnvExt", "requestPermissionAsync, do request, myRequestCode: " + i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0064 -> B:11:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0069 -> B:11:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a7 -> B:10:0x00b2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.tencent.mm.plugin.appbrand.jsapi.l r14, java.lang.String[] r15, int r16, java.lang.String r17, java.lang.String r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.utils.y.c(com.tencent.mm.plugin.appbrand.jsapi.l, java.lang.String[], int, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
