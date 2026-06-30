package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class s5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f186055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f186057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186058g;

    public s5(android.view.View view, in5.s0 s0Var, android.widget.TextView textView, java.lang.String str) {
        this.f186055d = view;
        this.f186056e = s0Var;
        this.f186057f = textView;
        this.f186058g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int width = this.f186055d.getWidth();
        if (width > 0) {
            int b17 = i65.a.b(this.f186056e.f374654e, 20);
            android.widget.TextView textView = this.f186057f;
            android.text.TextPaint paint = textView.getPaint();
            java.lang.String str = this.f186058g;
            if (b17 + paint.measureText(str) > width) {
                textView.setText(android.text.TextUtils.ellipsize(str, textView.getPaint(), width - b17, android.text.TextUtils.TruncateAt.END));
            }
        }
    }
}
