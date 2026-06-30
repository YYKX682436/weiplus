package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f225926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 f225927e;

    public d2(java.lang.ref.WeakReference weakReference, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 activityC16262x8382bfc0) {
        this.f225926d = weakReference;
        this.f225927e = activityC16262x8382bfc0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0) this.f225926d.get()) != null) {
            super/*com.tencent.mm.hellhoundlib.activities.HellActivity*/.finish();
        }
    }
}
