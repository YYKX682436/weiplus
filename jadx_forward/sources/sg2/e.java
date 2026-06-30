package sg2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f489427a;

    public e(java.lang.String f_tips_icon_png) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f_tips_icon_png, "f_tips_icon_png");
        this.f489427a = f_tips_icon_png;
    }

    /* renamed from: equals */
    public boolean m164544xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg2.e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489427a, ((sg2.e) obj).f489427a);
    }

    /* renamed from: hashCode */
    public int m164545x8cdac1b() {
        return this.f489427a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164546x9616526c() {
        return "TipsIconStatus(f_tips_icon_png=" + this.f489427a + ')';
    }
}
