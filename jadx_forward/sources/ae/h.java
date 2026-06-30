package ae;

/* loaded from: classes7.dex */
public class h implements ah.c {
    public h(ae.a aVar) {
    }

    @Override // ah.c
    public java.lang.String a(java.lang.String str) {
        int i17 = com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad.f130119q;
        return str.equals("mmbox2d") ? com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t1.a("libmmbox2d_v8_13_2") : str.equals("mmphysx") ? com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t1.a("libmmphysx_v8_13_2") : fp.d0.g(str);
    }

    @Override // ah.c
    /* renamed from: loadLibrary */
    public void mo1152xeb57c8f5(java.lang.String str) {
        int i17 = com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad.f130119q;
        if (str.equals("mmbox2d")) {
            java.lang.String a17 = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t1.a("libmmbox2d_v8_13_2");
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandGameServiceLogicImp", "libmmbox2d.so path is null");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "load libmmbox2d.so by path: %s", a17);
            com.p314xaae8f345.cso.C2941xefde02d2 c2941xefde02d2 = com.p314xaae8f345.cso.C2941xefde02d2.f127467a;
            com.p314xaae8f345.cso.C2941xefde02d2.h(a17);
            return;
        }
        if (str.equals("mmphysx")) {
            java.lang.String a18 = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t1.a("libmmphysx_v8_13_2");
            if (a18 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandGameServiceLogicImp", "libmmphysx.so path is null");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "load libmmphysx.so by path: %s", a18);
            com.p314xaae8f345.cso.C2941xefde02d2 c2941xefde02d22 = com.p314xaae8f345.cso.C2941xefde02d2.f127467a;
            com.p314xaae8f345.cso.C2941xefde02d2.h(a18);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/luggage/game/jsapi/component/service/AppBrandGameServiceLogicImp$6", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/luggage/game/jsapi/component/service/AppBrandGameServiceLogicImp$6", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }
}
