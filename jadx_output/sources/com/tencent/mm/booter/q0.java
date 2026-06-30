package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class q0 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f63553d;

    public q0(com.tencent.mm.booter.NotifyReceiver notifyReceiver, java.util.ArrayList arrayList) {
        this.f63553d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f63553d;
        try {
            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
            iDKey.SetID(1042);
            iDKey.SetKey(61);
            iDKey.SetValue(1L);
            arrayList.add(iDKey);
            jx3.f.INSTANCE.b(arrayList, false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NotifyReceiver", th6, "", new java.lang.Object[0]);
        }
    }
}
