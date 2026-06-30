package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51;

/* loaded from: classes15.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f167342a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f167343b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f167344c = false;

    public static void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.l lVar;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AppBrandRecordClientService", "onDestroy destroyAppId:%s", str);
        java.util.ArrayList arrayList = f167343b;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (str2.equalsIgnoreCase(str) && (abstractC20980x9b9ad01d = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) ((java.util.HashMap) f167342a).remove(str2)) != null) {
                abstractC20980x9b9ad01d.mo48814x2efc64();
            }
        }
        arrayList.remove(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0.g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = g17.f167315d;
        java.lang.String str3 = (c12420xb1146e9c == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c12420xb1146e9c.f167377p)) ? "" : g17.f167315d.f167377p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "destroy currentAppId:%s, appId:%s", str3, str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || !str.equalsIgnoreCase(str3)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z zVar = g17.f167316e;
        if (zVar == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z.START || zVar == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z.RESUME || zVar == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.z.ERROR) {
            g17.m();
        }
        if (g17.f167327p) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c2 = g17.f167315d;
            if (c12420xb1146e9c2 != null && (lVar = c12420xb1146e9c2.f167379r) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.i0) lVar;
                i0Var.f167345a = null;
                if (i0Var.f167349e) {
                    i0Var.f167349e = false;
                    if (i0Var.f167348d == null) {
                        i0Var.f167348d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.C12419xd21a0a99();
                    }
                    i0Var.f167348d.s();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordVoIPInterruptListener", "not start listen");
                }
            }
            g17.f167327p = false;
        }
    }
}
