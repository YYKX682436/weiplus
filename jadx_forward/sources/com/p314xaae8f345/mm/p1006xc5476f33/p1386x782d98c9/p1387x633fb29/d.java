package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes9.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k f180396d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k kVar) {
        this.f180396d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k kVar = this.f180396d;
        for (java.lang.String str : kVar.f180483g.keySet()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", "start send pending " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p.l(str, "send_data_failed");
        }
        kVar.f180483g.clear();
    }
}
