package vo1;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f520038a;

    /* renamed from: b, reason: collision with root package name */
    public final int f520039b;

    /* renamed from: c, reason: collision with root package name */
    public final int f520040c;

    /* renamed from: d, reason: collision with root package name */
    public final int f520041d;

    /* renamed from: e, reason: collision with root package name */
    public final int f520042e;

    public d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f520038a = holder;
        this.f520039b = i17;
        this.f520040c = i18;
        this.f520041d = i19;
        this.f520042e = i27;
    }

    /* renamed from: equals */
    public boolean m172364xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo1.d)) {
            return false;
        }
        vo1.d dVar = (vo1.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520038a, dVar.f520038a) && this.f520039b == dVar.f520039b && this.f520040c == dVar.f520040c && this.f520041d == dVar.f520041d && this.f520042e == dVar.f520042e;
    }

    /* renamed from: hashCode */
    public int m172365x8cdac1b() {
        return (((((((this.f520038a.hashCode() * 31) + java.lang.Integer.hashCode(this.f520039b)) * 31) + java.lang.Integer.hashCode(this.f520040c)) * 31) + java.lang.Integer.hashCode(this.f520041d)) * 31) + java.lang.Integer.hashCode(this.f520042e);
    }

    /* renamed from: toString */
    public java.lang.String m172366x9616526c() {
        return "MoveInfo(holder=" + this.f520038a + ", fromX=" + this.f520039b + ", fromY=" + this.f520040c + ", toX=" + this.f520041d + ", toY=" + this.f520042e + ')';
    }
}
