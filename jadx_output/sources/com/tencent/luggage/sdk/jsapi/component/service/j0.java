package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes.dex */
public class j0 implements ym0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47456a;

    public j0(com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var, java.lang.String str) {
        this.f47456a = str;
    }

    @Override // ym0.e
    public void loadLibrary(java.lang.String str) {
        if (str.equals("mmwebrtc")) {
            java.lang.String str2 = this.f47456a;
            com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "load libmmwebrtc.so by path: %s", str2);
            com.tencent.cso.CsoLoader.g(str2);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/luggage/sdk/jsapi/component/service/BaseAppBrandServiceLogic$2", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/luggage/sdk/jsapi/component/service/BaseAppBrandServiceLogic$2", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }
}
