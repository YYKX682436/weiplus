package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public class q0 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f145086d;

    public q0(com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878 c10296x7f15878, java.util.ArrayList arrayList) {
        this.f145086d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f145086d;
        try {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c344.m40330x4c144dd(1042);
            c4582x424c344.m40331x936762bd(61);
            c4582x424c344.m40332x57b2b64f(1L);
            arrayList.add(c4582x424c344);
            jx3.f.INSTANCE.b(arrayList, false);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NotifyReceiver", th6, "", new java.lang.Object[0]);
        }
    }
}
