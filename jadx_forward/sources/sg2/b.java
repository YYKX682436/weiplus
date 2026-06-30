package sg2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f489418a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f489419b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f489420c;

    public b(java.lang.String f_color_png, java.lang.String f_darkmode_png, java.lang.String f_lightmode_png) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f_color_png, "f_color_png");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f_darkmode_png, "f_darkmode_png");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f_lightmode_png, "f_lightmode_png");
        this.f489418a = f_color_png;
        this.f489419b = f_darkmode_png;
        this.f489420c = f_lightmode_png;
    }

    /* renamed from: equals */
    public boolean m164537xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg2.b)) {
            return false;
        }
        sg2.b bVar = (sg2.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489418a, bVar.f489418a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489419b, bVar.f489419b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489420c, bVar.f489420c);
    }

    /* renamed from: hashCode */
    public int m164538x8cdac1b() {
        return (((this.f489418a.hashCode() * 31) + this.f489419b.hashCode()) * 31) + this.f489420c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164539x9616526c() {
        return "GestureIconStatus(f_color_png=" + this.f489418a + ", f_darkmode_png=" + this.f489419b + ", f_lightmode_png=" + this.f489420c + ')';
    }
}
