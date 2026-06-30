package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes9.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k f180412d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k kVar) {
        this.f180412d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k kVar = this.f180412d;
        for (java.lang.String str : kVar.f180483g.keySet()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", "start send pending " + str);
            com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = (com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2) kVar.f180483g.get(str);
            if (c10597xb1f0d2 != null) {
                kVar.b(kVar.f180484h, c10597xb1f0d2, kVar.f180489m);
            }
        }
        kVar.f180483g.clear();
    }
}
