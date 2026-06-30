package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class ol implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f286745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286746e;

    public ol(android.widget.TextView textView, java.lang.String str) {
        this.f286745d = textView;
        this.f286746e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f286745d;
        android.text.TextPaint paint = textView.getPaint();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
        if (paint.measureText(this.f286746e) > (textView.getMeasuredWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()) {
            textView.setMinLines(2);
        } else {
            textView.setMinLines(0);
        }
    }
}
