package com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746;

/* loaded from: classes13.dex */
public final /* synthetic */ class g implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56 f128612a;

    /* renamed from: b, reason: collision with root package name */
    private final android.view.Surface f128613b;

    /* renamed from: c, reason: collision with root package name */
    private final int f128614c;

    /* renamed from: d, reason: collision with root package name */
    private final int f128615d;

    /* renamed from: e, reason: collision with root package name */
    private final android.media.projection.MediaProjection f128616e;

    /* renamed from: f, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.VirtualDisplayListener f128617f;

    private g(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56 c3844x7a121c56, android.view.Surface surface, int i17, int i18, android.media.projection.MediaProjection mediaProjection, com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.VirtualDisplayListener virtualDisplayListener) {
        this.f128612a = c3844x7a121c56;
        this.f128613b = surface;
        this.f128614c = i17;
        this.f128615d = i18;
        this.f128616e = mediaProjection;
        this.f128617f = virtualDisplayListener;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56 c3844x7a121c56, android.view.Surface surface, int i17, int i18, android.media.projection.MediaProjection mediaProjection, com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.VirtualDisplayListener virtualDisplayListener) {
        return new com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.g(c3844x7a121c56, surface, i17, i18, mediaProjection, virtualDisplayListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.a(this.f128612a, this.f128613b, this.f128614c, this.f128615d, this.f128616e, this.f128617f);
    }
}
