package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes.dex */
public class l4 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l4 f264535b = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l4();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f264536a = new java.util.HashMap();

    public l4() {
        java.lang.String c17 = c();
        if (com.p314xaae8f345.mm.vfs.w6.j(c17) || com.p314xaae8f345.mm.vfs.w6.u(c17)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewJSSDKFileItemManager", "checkJSSDKFileTempDirectory mkdirs failed");
    }

    public static java.lang.String c() {
        if (!gm0.j1.a()) {
            return new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a("wcf://temp")), "jsapi_temp/").o();
        }
        return gm0.j1.u().d() + "jsapi_temp/";
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 abstractC19284xdca64a7) {
        if (abstractC19284xdca64a7 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractC19284xdca64a7.f264269e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewJSSDKFileItemManager", "item is null or local id is null, ignore this add");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewJSSDKFileItemManager", "add jssdk file item, local id : %s, file path : %s", abstractC19284xdca64a7.f264269e, abstractC19284xdca64a7.f264271g);
            this.f264536a.put(abstractC19284xdca64a7.f264269e, abstractC19284xdca64a7);
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7) this.f264536a.get(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewJSSDKFileItemManager", "get by local id error, local id is null or nil");
        return null;
    }
}
