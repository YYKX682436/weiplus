package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class p implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f225988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 f225989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 f225990f;

    public p(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 c16238x79483a39, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 c16238x79483a392) {
        this.f225988d = z17;
        this.f225989e = c16238x79483a39;
        this.f225990f = c16238x79483a392;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGlobalLayout ");
        sb6.append(this.f225988d);
        sb6.append(' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 c16238x79483a39 = this.f225989e;
        sb6.append(c16238x79483a39.getMeasuredWidth());
        sb6.append(" w2=");
        android.widget.FrameLayout contentView = c16238x79483a39.getContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(contentView);
        sb6.append(contentView.getWidth());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScrollableFrameLayout", sb6.toString());
        if (c16238x79483a39.m29017x19263085() != null) {
            android.app.Activity m29017x19263085 = c16238x79483a39.m29017x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m29017x19263085);
            i17 = com.p314xaae8f345.mm.ui.bk.m(m29017x19263085).left;
        } else {
            i17 = 0;
        }
        android.widget.FrameLayout contentView2 = c16238x79483a39.getContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(contentView2);
        int width = (contentView2.getWidth() / 2) + i17;
        android.widget.FrameLayout contentView3 = c16238x79483a39.getContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(contentView3);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(width, contentView3.getHeight());
        android.widget.FrameLayout contentView4 = c16238x79483a39.getContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(contentView4);
        int width2 = contentView4.getWidth() / 2;
        android.widget.FrameLayout contentView5 = c16238x79483a39.getContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(contentView5);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(width2, contentView5.getHeight());
        layoutParams2.setMarginStart(i17);
        c16238x79483a39.f127576g.setLayoutParams(layoutParams2);
        android.view.View landscapeMarginView = c16238x79483a39.getLandscapeMarginView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(landscapeMarginView);
        android.widget.FrameLayout contentView6 = c16238x79483a39.getContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(contentView6);
        landscapeMarginView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, contentView6.getHeight()));
        android.widget.FrameLayout landscapeContentView = c16238x79483a39.getLandscapeContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(landscapeContentView);
        landscapeContentView.setLayoutParams(layoutParams);
        android.widget.FrameLayout contentView7 = c16238x79483a39.getContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(contentView7);
        contentView7.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f225990f.e();
    }
}
