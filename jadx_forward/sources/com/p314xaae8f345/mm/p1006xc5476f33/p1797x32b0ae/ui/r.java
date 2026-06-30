package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class r implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f225999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 f226000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 f226001f;

    public r(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 c16238x79483a39, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 c16238x79483a392) {
        this.f225999d = z17;
        this.f226000e = c16238x79483a39;
        this.f226001f = c16238x79483a392;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGlobalLayout ");
        sb6.append(this.f225999d);
        sb6.append(' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 c16238x79483a39 = this.f226000e;
        sb6.append(c16238x79483a39.getMeasuredWidth());
        sb6.append(" w2=");
        android.widget.FrameLayout contentView = c16238x79483a39.getContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(contentView);
        sb6.append(contentView.getWidth());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScrollableFrameLayout", sb6.toString());
        android.widget.FrameLayout contentView2 = c16238x79483a39.getContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(contentView2);
        contentView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f226001f.e();
    }
}
