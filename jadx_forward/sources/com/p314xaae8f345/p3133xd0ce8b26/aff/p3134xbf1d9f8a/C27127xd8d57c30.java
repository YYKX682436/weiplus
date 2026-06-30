package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.affroam.ZIDL_esFfH6f8KE */
/* loaded from: classes5.dex */
public class C27127xd8d57c30 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f297265a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_FI */
    private void m110743x1964d20b(boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f297265a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamDeviceManagerKE", "onConnectivityChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("RoamDeviceManagerKE", "onConnectivityChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.o oVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.o) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k1) entry.getValue());
            oVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
            boolean Ui = ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onConnectivityChanged] deviceId=");
            java.lang.String str = oVar.f174198a;
            sb6.append(str);
            sb6.append(", isConnect=");
            sb6.append(z17);
            sb6.append(", isRoamEnable=");
            sb6.append(Ui);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", sb6.toString());
            lo1.i.f401635a.b(str, z17);
        }
    }
}
