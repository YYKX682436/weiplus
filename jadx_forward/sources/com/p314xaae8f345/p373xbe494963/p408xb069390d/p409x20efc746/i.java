package com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final /* synthetic */ class i implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56 f128620a;

    /* renamed from: b, reason: collision with root package name */
    private final android.media.projection.MediaProjection f128621b;

    private i(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56 c3844x7a121c56, android.media.projection.MediaProjection mediaProjection) {
        this.f128620a = c3844x7a121c56;
        this.f128621b = mediaProjection;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56 c3844x7a121c56, android.media.projection.MediaProjection mediaProjection) {
        return new com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.i(c3844x7a121c56, mediaProjection);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.a(this.f128620a, this.f128621b);
    }
}
