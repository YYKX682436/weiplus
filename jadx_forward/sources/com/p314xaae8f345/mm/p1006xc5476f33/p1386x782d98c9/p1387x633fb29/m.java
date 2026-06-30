package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3 f180524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o f180525e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3 o3Var) {
        this.f180525e = oVar;
        this.f180524d = o3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o oVar = this.f180525e;
        boolean z17 = true;
        if (oVar.f180539a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.ExDeviceTaskService", "dispathcer is null, now try to reset it");
            if (oVar.f180540b != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceTaskService", "prepare dispatcher is not null. not prepare it");
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 d0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.t) oVar.f180540b).f180596a;
                if (d0Var.f180398a == null) {
                    u32.r rVar = new u32.r();
                    d0Var.f180398a = rVar;
                    rVar.f505889d = null;
                }
                d0Var.f180398a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l(oVar), true).c(100L, 100L);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceTaskService", "prepare dispatcher is null");
            }
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3 o3Var = this.f180524d;
        if (z17) {
            o3Var.a(oVar.f180539a, oVar);
        } else {
            oVar.f180541c.add(o3Var);
        }
    }
}
