package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class ri implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f217331d;

    public ri(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar) {
        this.f217331d = blVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View mo144222x4ff8c0f0 = this.f217331d.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nuq);
        if (mo144222x4ff8c0f0 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = mo144222x4ff8c0f0.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = 0;
            mo144222x4ff8c0f0.setLayoutParams(layoutParams2);
        }
    }
}
