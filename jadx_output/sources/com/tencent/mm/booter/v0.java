package com.tencent.mm.booter;

/* loaded from: classes11.dex */
public class v0 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f63584d;

    public v0(com.tencent.mm.booter.NotifyReceiver.NotifyReceiverService notifyReceiverService, java.util.ArrayList arrayList) {
        this.f63584d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(1042);
        iDKey.SetKey(63);
        iDKey.SetValue(1L);
        java.util.ArrayList arrayList = this.f63584d;
        arrayList.add(iDKey);
        jx3.f.INSTANCE.b(arrayList, false);
    }
}
