package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public final class od implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f228807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd f228808e;

    public od(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd qdVar) {
        this.f228807d = z17;
        this.f228808e = qdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f228807d) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd qdVar = this.f228808e;
        android.widget.ImageView imageView = (android.widget.ImageView) qdVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.udz);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) qdVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f567312ue0);
        if (imageView2 != null) {
            imageView2.setImageBitmap(null);
        }
    }
}
