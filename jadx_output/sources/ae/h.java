package ae;

/* loaded from: classes7.dex */
public class h implements ah.c {
    public h(ae.a aVar) {
    }

    @Override // ah.c
    public java.lang.String a(java.lang.String str) {
        int i17 = com.tencent.magicbrush.MagicBrush.f48586q;
        return str.equals("mmbox2d") ? com.tencent.luggage.sdk.jsapi.component.service.t1.a("libmmbox2d_v8_13_2") : str.equals("mmphysx") ? com.tencent.luggage.sdk.jsapi.component.service.t1.a("libmmphysx_v8_13_2") : fp.d0.g(str);
    }

    @Override // ah.c
    public void loadLibrary(java.lang.String str) {
        int i17 = com.tencent.magicbrush.MagicBrush.f48586q;
        if (str.equals("mmbox2d")) {
            java.lang.String a17 = com.tencent.luggage.sdk.jsapi.component.service.t1.a("libmmbox2d_v8_13_2");
            if (a17 == null) {
                com.tencent.mars.xlog.Log.e("Luggage.AppBrandGameServiceLogicImp", "libmmbox2d.so path is null");
                return;
            }
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "load libmmbox2d.so by path: %s", a17);
            com.tencent.cso.CsoLoader csoLoader = com.tencent.cso.CsoLoader.f45934a;
            com.tencent.cso.CsoLoader.h(a17);
            return;
        }
        if (str.equals("mmphysx")) {
            java.lang.String a18 = com.tencent.luggage.sdk.jsapi.component.service.t1.a("libmmphysx_v8_13_2");
            if (a18 == null) {
                com.tencent.mars.xlog.Log.e("Luggage.AppBrandGameServiceLogicImp", "libmmphysx.so path is null");
                return;
            }
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "load libmmphysx.so by path: %s", a18);
            com.tencent.cso.CsoLoader csoLoader2 = com.tencent.cso.CsoLoader.f45934a;
            com.tencent.cso.CsoLoader.h(a18);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/luggage/game/jsapi/component/service/AppBrandGameServiceLogicImp$6", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/luggage/game/jsapi/component/service/AppBrandGameServiceLogicImp$6", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }
}
