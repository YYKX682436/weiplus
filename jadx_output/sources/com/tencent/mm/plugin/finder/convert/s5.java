package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class s5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f104524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104525g;

    public s5(android.view.View view, in5.s0 s0Var, android.widget.TextView textView, java.lang.String str) {
        this.f104522d = view;
        this.f104523e = s0Var;
        this.f104524f = textView;
        this.f104525g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int width = this.f104522d.getWidth();
        if (width > 0) {
            int b17 = i65.a.b(this.f104523e.f293121e, 20);
            android.widget.TextView textView = this.f104524f;
            android.text.TextPaint paint = textView.getPaint();
            java.lang.String str = this.f104525g;
            if (b17 + paint.measureText(str) > width) {
                textView.setText(android.text.TextUtils.ellipsize(str, textView.getPaint(), width - b17, android.text.TextUtils.TruncateAt.END));
            }
        }
    }
}
