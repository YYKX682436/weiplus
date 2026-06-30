package ym5;

/* loaded from: classes15.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f544743a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f544744b;

    /* renamed from: c, reason: collision with root package name */
    public long f544745c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View.OnAttachStateChangeListener f544746d;

    /* renamed from: e, reason: collision with root package name */
    public ym5.n0 f544747e;

    /* renamed from: f, reason: collision with root package name */
    public ym5.o0 f544748f;

    /* renamed from: g, reason: collision with root package name */
    public long f544749g;

    /* renamed from: h, reason: collision with root package name */
    public long f544750h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f544751i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f544752j;

    public b1(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f544743a = view;
        this.f544745c = -1L;
    }

    /* renamed from: equals */
    public boolean m177299xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym5.b1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f544743a, ((ym5.b1) obj).f544743a);
    }

    /* renamed from: hashCode */
    public int m177300x8cdac1b() {
        return this.f544743a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177301x9616526c() {
        return "ExposedData(view=" + this.f544743a + ')';
    }
}
