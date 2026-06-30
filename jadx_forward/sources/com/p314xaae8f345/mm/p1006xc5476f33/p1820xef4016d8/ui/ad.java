package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public final class ad implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f228240d;

    public ad(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13) {
        this.f228240d = activityC16373x8a110f13;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f228240d;
        android.widget.TextView textView = (android.widget.TextView) activityC16373x8a110f13.findViewById(com.p314xaae8f345.mm.R.id.j1h);
        android.widget.ImageView imageView = (android.widget.ImageView) activityC16373x8a110f13.findViewById(com.p314xaae8f345.mm.R.id.j1e);
        if (textView == null || imageView == null) {
            return;
        }
        int left = (imageView.getLeft() - i65.a.b(activityC16373x8a110f13.mo55332x76847179(), 8)) - (textView.getRight() + i65.a.b(activityC16373x8a110f13.mo55332x76847179(), 52));
        if (left > 0) {
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
            android.widget.TextView textView2 = activityC16373x8a110f13.M;
            if (textView2 == null) {
                return;
            }
            textView2.setMaxWidth(left);
        }
    }
}
