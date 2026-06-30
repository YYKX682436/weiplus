package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f175998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f175999e;

    public v2(long j17, boolean z17) {
        this.f175998d = j17;
        this.f175999e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zq1.h0 h0Var;
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175726b;
        long j17 = this.f175998d;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.remove(java.lang.Long.valueOf(j17));
        if (weakReference != null && (h0Var = (zq1.h0) weakReference.get()) != null) {
            java.util.HashMap hashMap2 = (java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175728d.remove(java.lang.Long.valueOf(j17));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (hashMap2 != null) {
                java.util.Iterator it = hashMap2.entrySet().iterator();
                while (it.hasNext()) {
                    zq1.k0 k0Var = (zq1.k0) ((java.util.Map.Entry) it.next()).getValue();
                    java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                    boolean z17 = this.f175999e;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherCallbackManager", "notifyCallback session: %d, timeout: %s, url: %s, result: %d", valueOf, java.lang.Boolean.valueOf(z17), k0Var.f556542a.f556516a, java.lang.Integer.valueOf(k0Var.f556543b));
                    if (z17 || k0Var.f556543b == 1) {
                        k0Var.f556543b = 8;
                        arrayList.add(k0Var);
                    } else {
                        arrayList.add(k0Var);
                    }
                }
            }
            h0Var.a(arrayList);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175725a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175727c.remove(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175728d.remove(java.lang.Long.valueOf(j17));
    }
}
