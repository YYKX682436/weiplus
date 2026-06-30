package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f94468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zq1.h0 f94469e;

    public w2(long j17, zq1.h0 h0Var) {
        this.f94468d = j17;
        this.f94469e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94193b.put(java.lang.Long.valueOf(this.f94468d), new java.lang.ref.WeakReference(this.f94469e));
    }
}
