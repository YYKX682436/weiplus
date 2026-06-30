package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class a6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f184392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184393g;

    public a6(android.view.View view, in5.s0 s0Var, android.widget.TextView textView, java.lang.String str) {
        this.f184390d = view;
        this.f184391e = s0Var;
        this.f184392f = textView;
        this.f184393g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int width = this.f184390d.getWidth();
        if (width > 0) {
            int b17 = i65.a.b(this.f184391e.f374654e, 20);
            android.widget.TextView textView = this.f184392f;
            android.text.TextPaint paint = textView.getPaint();
            java.lang.String str = this.f184393g;
            if (b17 + paint.measureText(str) > width) {
                textView.setText(android.text.TextUtils.ellipsize(str, textView.getPaint(), width - b17, android.text.TextUtils.TruncateAt.END));
            }
        }
    }
}
