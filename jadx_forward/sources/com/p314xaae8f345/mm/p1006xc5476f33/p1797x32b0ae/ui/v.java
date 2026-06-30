package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 f226019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f226020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f226021f;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 c16238x79483a39, int i17, int i18) {
        this.f226019d = c16238x79483a39;
        this.f226020e = i17;
        this.f226021f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 c16238x79483a39 = this.f226019d;
        if (c16238x79483a39.m29017x19263085() != null) {
            android.app.Activity m29017x19263085 = c16238x79483a39.m29017x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m29017x19263085);
            i17 = com.p314xaae8f345.mm.ui.bk.m(m29017x19263085).left;
        } else {
            i17 = 0;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((this.f226020e / 2) + i17, this.f226021f);
        android.widget.FrameLayout contentView = c16238x79483a39.getContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(contentView);
        int width = contentView.getWidth() / 2;
        android.widget.FrameLayout contentView2 = c16238x79483a39.getContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(contentView2);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(width, contentView2.getHeight());
        layoutParams2.setMarginStart(i17);
        c16238x79483a39.f127576g.setLayoutParams(layoutParams2);
        android.view.View landscapeMarginView = c16238x79483a39.getLandscapeMarginView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(landscapeMarginView);
        android.widget.FrameLayout contentView3 = c16238x79483a39.getContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(contentView3);
        landscapeMarginView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, contentView3.getHeight()));
        android.widget.FrameLayout landscapeContentView = c16238x79483a39.getLandscapeContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(landscapeContentView);
        landscapeContentView.setLayoutParams(layoutParams);
        c16238x79483a39.e();
    }
}
