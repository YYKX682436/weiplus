package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes5.dex */
public class o0 implements xg.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47510b;

    public o0(com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var, java.lang.String str, java.lang.String str2) {
        this.f47509a = str;
        this.f47510b = str2;
    }

    @Override // xg.e
    public void loadLibrary(java.lang.String str) {
        if (str.equals("magicar")) {
            java.lang.String str2 = this.f47509a;
            com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "load libmagciar.so by path: %s", str2);
            fp.d0.s(str2);
        } else {
            if (str.equals("weslam")) {
                java.lang.String str3 = this.f47510b;
                com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "load libweslam.so by path: %s", str3);
                fp.d0.s(str3);
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/luggage/sdk/jsapi/component/service/BaseAppBrandServiceLogic$7", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/luggage/sdk/jsapi/component/service/BaseAppBrandServiceLogic$7", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
    }
}
