package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class a6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f102857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f102859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102860g;

    public a6(android.view.View view, in5.s0 s0Var, android.widget.TextView textView, java.lang.String str) {
        this.f102857d = view;
        this.f102858e = s0Var;
        this.f102859f = textView;
        this.f102860g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int width = this.f102857d.getWidth();
        if (width > 0) {
            int b17 = i65.a.b(this.f102858e.f293121e, 20);
            android.widget.TextView textView = this.f102859f;
            android.text.TextPaint paint = textView.getPaint();
            java.lang.String str = this.f102860g;
            if (b17 + paint.measureText(str) > width) {
                textView.setText(android.text.TextUtils.ellipsize(str, textView.getPaint(), width - b17, android.text.TextUtils.TruncateAt.END));
            }
        }
    }
}
