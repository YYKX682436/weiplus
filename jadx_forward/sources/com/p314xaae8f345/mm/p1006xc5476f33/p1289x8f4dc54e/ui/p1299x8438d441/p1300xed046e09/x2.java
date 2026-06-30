package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f176004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f176005e;

    public x2(long j17, java.util.List list) {
        this.f176004d = j17;
        this.f176005e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175727c;
        long j17 = this.f176004d;
        if (!hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            hashMap.put(java.lang.Long.valueOf(j17), new java.util.HashMap());
        }
        for (ys1.b bVar : this.f176005e) {
            java.util.HashMap hashMap2 = (java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175727c.get(java.lang.Long.valueOf(j17));
            if (hashMap2 != null) {
            }
        }
    }
}
