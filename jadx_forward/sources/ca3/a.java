package ca3;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a f121309a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f121310b;

    /* renamed from: c, reason: collision with root package name */
    public double f121311c;

    /* renamed from: d, reason: collision with root package name */
    public double f121312d;

    /* renamed from: e, reason: collision with root package name */
    public double f121313e;

    /* renamed from: f, reason: collision with root package name */
    public double f121314f;

    /* renamed from: g, reason: collision with root package name */
    public double f121315g;

    /* renamed from: h, reason: collision with root package name */
    public double f121316h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f121317i;

    public a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f121310b = imageView;
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.db8);
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
    }

    public final double a(double d17, double d18, double d19, double d27) {
        if (!(d17 == 0.0d)) {
            if (!(d18 == 0.0d)) {
                return (java.lang.Math.atan2(d19 - d17, d27 - d18) * 180) / 3.141592d;
            }
        }
        return 0.0d;
    }
}
