package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes10.dex */
public final class fc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f282043d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ScrollView f282044e;

    /* renamed from: f, reason: collision with root package name */
    public final int f282045f;

    /* renamed from: g, reason: collision with root package name */
    public final int f282046g;

    public fc(android.widget.TextView textView, android.widget.ScrollView scrollView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scrollView, "scrollView");
        this.f282043d = textView;
        this.f282044e = scrollView;
        this.f282045f = i17;
        this.f282046g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f282043d;
        android.text.Layout layout = textView.getLayout();
        if (layout == null) {
            textView.postDelayed(this, 100L);
            return;
        }
        int lineForOffset = layout.getLineForOffset(this.f282045f);
        int lineForOffset2 = layout.getLineForOffset(this.f282046g);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        textView.getLocationInWindow(iArr);
        android.widget.ScrollView scrollView = this.f282044e;
        scrollView.getLocationInWindow(iArr2);
        int i17 = iArr[1] - iArr2[1];
        int lineTop = (layout.getLineTop(lineForOffset) + layout.getLineBottom(lineForOffset2)) / 2;
        scrollView.scrollTo(0, java.lang.Math.max(0, java.lang.Math.min((lineTop - (scrollView.getHeight() / 2)) + i17, (layout.getHeight() + i17) - scrollView.getHeight())));
    }
}
