package be1;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    private static final int CTRL_INDEX = -1;
    private static final java.lang.String NAME = "onNetworkWeakChange";

    public static void x(com.tencent.mm.plugin.appbrand.jsapi.l lVar, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = be1.z.E(com.tencent.mm.sdk.platformtools.x2.f193071a).f19540d;
        hashMap.put("networkType", str);
        hashMap.put("weakNet", java.lang.Boolean.valueOf(z17));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOnNetworkWeakChangeEvent", "networkType = %s,weakNet = %b", str, java.lang.Boolean.valueOf(z17));
        be1.b bVar = new be1.b();
        bVar.u(lVar);
        bVar.t(hashMap);
        bVar.m();
    }
}
