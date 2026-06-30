package xv0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final xv0.b f538903a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f538904b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f538905c;

    /* renamed from: d, reason: collision with root package name */
    public float f538906d;

    public a(xv0.b type, float f17, android.view.View rootView, android.widget.TextView valueTv) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueTv, "valueTv");
        this.f538903a = type;
        this.f538904b = rootView;
        this.f538905c = valueTv;
        this.f538906d = f17;
        a(f17);
    }

    public final void a(float f17) {
        this.f538906d = f17;
        if (java.lang.Math.abs(f17) <= 0.01d) {
            this.f538906d = 0.0f;
        }
        int compare = java.lang.Float.compare(this.f538906d, 0);
        android.widget.TextView textView = this.f538905c;
        if (compare == 0) {
            textView.setText("");
            return;
        }
        java.lang.String format = java.lang.String.format("%+d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) (this.f538906d * 100))}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        textView.setText(format);
    }
}
