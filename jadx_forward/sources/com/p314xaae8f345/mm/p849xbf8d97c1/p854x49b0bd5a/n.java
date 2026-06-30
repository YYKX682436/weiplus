package com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a;

/* loaded from: classes12.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f150317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[] f150318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f150319f;

    public n(long j17, com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[] c4720x9bbc2403Arr, int i17) {
        this.f150317d = j17;
        this.f150318e = c4720x9bbc2403Arr;
        this.f150319f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj.j.b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum debug-pss > " + this.f150317d, new java.lang.Object[0]);
        com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0.a(com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0.f150306a, this.f150318e, 26, this.f150319f, com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0.f150307b);
    }
}
