package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class wu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yu f186439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f186440e;

    public wu(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yu yuVar, android.widget.ImageView imageView) {
        this.f186439d = yuVar;
        this.f186440e = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f186439d.f186591v;
        if (textView != null) {
            android.widget.ImageView imageView = this.f186440e;
            if (imageView.getRight() > textView.getLeft()) {
                imageView.setVisibility(8);
            }
        }
    }
}
