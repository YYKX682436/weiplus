package ja1;

/* loaded from: classes7.dex */
public class a implements ah.c {
    @Override // ah.c
    public java.lang.String a(java.lang.String str) {
        int i17 = com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad.f130119q;
        return str.equals("mmbox2d") ? com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t1.a("libmmbox2d_v8_13_2") : str.equals("mmphysx") ? com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t1.a("libmmphysx_v8_13_2") : fp.d0.g(str);
    }

    @Override // ah.c
    /* renamed from: loadLibrary */
    public void mo1152xeb57c8f5(java.lang.String str) {
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean z17 = true;
        if (z65.c.a() && "magicbrush".equals(str)) {
            java.util.HashMap hashMap = ha1.l.f361310f;
            java.lang.Object obj = ha1.l.f361310f.get("localso");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            if (((java.lang.Boolean) ((ha1.l) obj).e()).booleanValue()) {
                if (ja1.e.f380136a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "load custom local so libName: %s, skip", "magicbrush");
                    return;
                }
                ja1.e.f380136a = true;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "load custom local so libName: %s", "magicbrush");
                    com.p314xaae8f345.cso.C2941xefde02d2.g(ja1.e.a("libmagicbrush.so", "/sdcard/magicbrush/libmagicbrush.so").o());
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WAGame.MBLoadDelegateRegistryWC", e17, "load local so failed", new java.lang.Object[0]);
                    z17 = false;
                }
                dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, z17 ? "local so succeed: magicbrush" : "local so failed: magicbrush", 0).show();
                return;
            }
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "loadLibrary libName:%s", str);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            int i17 = com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad.f130119q;
            if (str.equals("mmbox2d")) {
                java.lang.String a17 = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t1.a("libmmbox2d_v8_13_2");
                if (a17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "libmmbox2d.so path is null");
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "load libmmbox2d.so by path: %s", a17);
                    com.p314xaae8f345.cso.C2941xefde02d2.h(a17);
                }
            } else if (str.equals("mmphysx")) {
                if (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t1.a("libmmphysx_v8_13_2") == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "libmmphysx.so path is null, try download it here");
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t1.f129073a.b("libmmphysx_v8_13_2", com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, "ilinkres_ae0cf48a");
                }
                java.lang.String a18 = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t1.a("libmmphysx_v8_13_2");
                if (a18 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "load libmmphysx.so by path: %s", a18);
                    com.p314xaae8f345.cso.C2941xefde02d2.h(a18);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "fail to download libmmphysx.so");
                    va1.f.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                }
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/game/handler/MBLoadDelegateRegistryWC", "loadSoImpl", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                yj0.a.f(obj2, "com/tencent/mm/plugin/appbrand/game/handler/MBLoadDelegateRegistryWC", "loadSoImpl", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "hy: loading library %s using %d ms", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WAGame.MBLoadDelegateRegistryWC", e18, "hy: link %s error!!", str);
            va1.f.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
    }
}
