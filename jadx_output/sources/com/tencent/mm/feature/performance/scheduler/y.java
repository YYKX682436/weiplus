package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class y implements com.tencent.mm.feature.performance.scheduler.n, yz5.l {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.scheduler.x f67720h = new com.tencent.mm.feature.performance.scheduler.x(null);

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.ArrayList f67721i = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f67722d;

    /* renamed from: e, reason: collision with root package name */
    public final long f67723e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f67724f;

    /* renamed from: g, reason: collision with root package name */
    public volatile wu5.c f67725g;

    static {
        try {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(new com.tencent.mm.feature.performance.scheduler.v(), intentFilter);
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.BgScheduler", th6, "", new java.lang.Object[0]);
        }
    }

    public y(boolean z17, long j17) {
        this.f67722d = z17;
        this.f67723e = j17;
        this.f67724f = z17;
        f67721i.add(this);
    }

    @Override // com.tencent.mm.feature.performance.scheduler.n
    public boolean R0() {
        return this.f67722d ^ this.f67724f;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f67724f = ((java.lang.Boolean) obj).booleanValue();
        return jz5.f0.f302826a;
    }
}
