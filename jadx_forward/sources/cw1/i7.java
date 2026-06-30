package cw1;

/* loaded from: classes3.dex */
public final class i7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.j7 f304538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f304539f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304540g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f304541h;

    public i7(android.widget.TextView textView, cw1.j7 j7Var, int i17, android.widget.TextView textView2, int i18) {
        this.f304537d = textView;
        this.f304538e = j7Var;
        this.f304539f = i17;
        this.f304540g = textView2;
        this.f304541h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw1.j7 j7Var = this.f304538e;
        java.lang.String format = java.lang.String.format(j7Var.f304580a, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f304539f)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        this.f304537d.setText(format);
        java.lang.String format2 = java.lang.String.format(j7Var.f304581b, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f304541h)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        this.f304540g.setText(format2);
    }
}
