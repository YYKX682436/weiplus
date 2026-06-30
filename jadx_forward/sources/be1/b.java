package be1;

/* loaded from: classes7.dex */
public class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0 {

    /* renamed from: CTRL_INDEX */
    private static final int f4208x366c91de = -1;

    /* renamed from: NAME */
    private static final java.lang.String f4209x24728b = "onNetworkWeakChange";

    public static void x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = be1.z.E(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f101073d;
        hashMap.put("networkType", str);
        hashMap.put("weakNet", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOnNetworkWeakChangeEvent", "networkType = %s,weakNet = %b", str, java.lang.Boolean.valueOf(z17));
        be1.b bVar = new be1.b();
        bVar.u(lVar);
        bVar.t(hashMap);
        bVar.m();
    }
}
