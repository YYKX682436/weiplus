package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e f255973d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e c18612x3f06d82e) {
        this.f255973d = c18612x3f06d82e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e c18612x3f06d82e = this.f255973d;
        android.view.ViewGroup rootView = c18612x3f06d82e.getRootView();
        if (rootView != null) {
            rootView.requestLayout();
        }
        android.widget.TextView tvLongText = c18612x3f06d82e.getTvLongText();
        if (tvLongText != null) {
            tvLongText.requestLayout();
        }
    }
}
