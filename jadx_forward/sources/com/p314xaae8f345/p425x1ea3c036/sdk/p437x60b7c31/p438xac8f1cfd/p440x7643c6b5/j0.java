package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes.dex */
public class j0 implements ym0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f128989a;

    public j0(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var, java.lang.String str) {
        this.f128989a = str;
    }

    @Override // ym0.e
    /* renamed from: loadLibrary */
    public void mo32124xeb57c8f5(java.lang.String str) {
        if (str.equals("mmwebrtc")) {
            java.lang.String str2 = this.f128989a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.BaseAppBrandServiceLogic", "load libmmwebrtc.so by path: %s", str2);
            com.p314xaae8f345.cso.C2941xefde02d2.g(str2);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/luggage/sdk/jsapi/component/service/BaseAppBrandServiceLogic$2", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/luggage/sdk/jsapi/component/service/BaseAppBrandServiceLogic$2", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }
}
