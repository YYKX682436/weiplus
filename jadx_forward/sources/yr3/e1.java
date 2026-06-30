package yr3;

/* loaded from: classes11.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f546329a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f546330b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f546331c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f546332d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f546333e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f546334f;

    public e1(android.view.View mainView, android.widget.ImageView coverView, android.widget.ImageView featuredView, android.widget.TextView descView, android.widget.TextView recView, android.view.View descAreaView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainView, "mainView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverView, "coverView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(featuredView, "featuredView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descView, "descView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recView, "recView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descAreaView, "descAreaView");
        this.f546329a = mainView;
        this.f546330b = coverView;
        this.f546331c = featuredView;
        this.f546332d = descView;
        this.f546333e = recView;
        this.f546334f = descAreaView;
    }

    /* renamed from: equals */
    public boolean m177561xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr3.e1)) {
            return false;
        }
        yr3.e1 e1Var = (yr3.e1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546329a, e1Var.f546329a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546330b, e1Var.f546330b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546331c, e1Var.f546331c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546332d, e1Var.f546332d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546333e, e1Var.f546333e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546334f, e1Var.f546334f);
    }

    /* renamed from: hashCode */
    public int m177562x8cdac1b() {
        return (((((((((this.f546329a.hashCode() * 31) + this.f546330b.hashCode()) * 31) + this.f546331c.hashCode()) * 31) + this.f546332d.hashCode()) * 31) + this.f546333e.hashCode()) * 31) + this.f546334f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177563x9616526c() {
        return "PicViewGroup(mainView=" + this.f546329a + ", coverView=" + this.f546330b + ", featuredView=" + this.f546331c + ", descView=" + this.f546332d + ", recView=" + this.f546333e + ", descAreaView=" + this.f546334f + ')';
    }
}
