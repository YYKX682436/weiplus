package gc;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f351613a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f351614b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f351615c;

    public a(int i17, java.lang.String username, android.graphics.Rect rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        this.f351613a = i17;
        this.f351614b = username;
        this.f351615c = rect;
    }

    /* renamed from: equals */
    public boolean m131190xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc.a)) {
            return false;
        }
        gc.a aVar = (gc.a) obj;
        return this.f351613a == aVar.f351613a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f351614b, aVar.f351614b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f351615c, aVar.f351615c);
    }

    /* renamed from: hashCode */
    public int m131191x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f351613a) * 31) + this.f351614b.hashCode()) * 31) + this.f351615c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m131192x9616526c() {
        return "LayoutInfo(idx=" + this.f351613a + ", username=" + this.f351614b + ", rect=" + this.f351615c + ')';
    }
}
