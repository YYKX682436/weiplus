package x1;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources.Theme f532878a;

    /* renamed from: b, reason: collision with root package name */
    public final int f532879b;

    public d(android.content.res.Resources.Theme theme, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(theme, "theme");
        this.f532878a = theme;
        this.f532879b = i17;
    }

    /* renamed from: equals */
    public boolean m174897xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1.d)) {
            return false;
        }
        x1.d dVar = (x1.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532878a, dVar.f532878a) && this.f532879b == dVar.f532879b;
    }

    /* renamed from: hashCode */
    public int m174898x8cdac1b() {
        return (this.f532878a.hashCode() * 31) + java.lang.Integer.hashCode(this.f532879b);
    }

    /* renamed from: toString */
    public java.lang.String m174899x9616526c() {
        return "Key(theme=" + this.f532878a + ", id=" + this.f532879b + ')';
    }
}
