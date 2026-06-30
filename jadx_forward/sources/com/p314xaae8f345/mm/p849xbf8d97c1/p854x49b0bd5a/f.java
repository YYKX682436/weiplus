package com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f150285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[] f150286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f150287f;

    public f(long j17, com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[] c4720x9bbc2403Arr, int i17) {
        this.f150285d = j17;
        this.f150286e = c4720x9bbc2403Arr;
        this.f150287f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj.j.b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum pss > " + this.f150285d, new java.lang.Object[0]);
        com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0.a(com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0.f150306a, this.f150286e, 19, this.f150287f, com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0.f150307b);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1832L, 11L);
    }
}
