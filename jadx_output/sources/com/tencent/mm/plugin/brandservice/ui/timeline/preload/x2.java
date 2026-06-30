package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f94471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f94472e;

    public x2(long j17, java.util.List list) {
        this.f94471d = j17;
        this.f94472e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94194c;
        long j17 = this.f94471d;
        if (!hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            hashMap.put(java.lang.Long.valueOf(j17), new java.util.HashMap());
        }
        for (ys1.b bVar : this.f94472e) {
            java.util.HashMap hashMap2 = (java.util.HashMap) com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94194c.get(java.lang.Long.valueOf(j17));
            if (hashMap2 != null) {
            }
        }
    }
}
