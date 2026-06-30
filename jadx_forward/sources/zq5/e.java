package zq5;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final zq5.e f556593e = new zq5.e(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f556594a;

    /* renamed from: b, reason: collision with root package name */
    public final int f556595b;

    /* renamed from: c, reason: collision with root package name */
    public final int f556596c;

    /* renamed from: d, reason: collision with root package name */
    public final int f556597d;

    public e(int i17, int i18, int i19, int i27) {
        this.f556594a = i17;
        this.f556595b = i18;
        this.f556596c = i19;
        this.f556597d = i27;
    }

    public final boolean a() {
        return this.f556594a >= this.f556596c || this.f556595b >= this.f556597d;
    }

    public final boolean b(zq5.e other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return this.f556596c > other.f556594a && other.f556596c > this.f556594a && this.f556597d > other.f556595b && other.f556597d > this.f556595b;
    }

    /* renamed from: equals */
    public boolean m179315xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq5.e)) {
            return false;
        }
        zq5.e eVar = (zq5.e) obj;
        return this.f556594a == eVar.f556594a && this.f556595b == eVar.f556595b && this.f556596c == eVar.f556596c && this.f556597d == eVar.f556597d;
    }

    /* renamed from: hashCode */
    public int m179316x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f556594a) * 31) + java.lang.Integer.hashCode(this.f556595b)) * 31) + java.lang.Integer.hashCode(this.f556596c)) * 31) + java.lang.Integer.hashCode(this.f556597d);
    }

    /* renamed from: toString */
    public java.lang.String m179317x9616526c() {
        return "IntRectCompat.fromLTRB(" + this.f556594a + ", " + this.f556595b + ", " + this.f556596c + ", " + this.f556597d + ')';
    }
}
