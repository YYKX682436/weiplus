package i45;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f369924a;

    /* renamed from: b, reason: collision with root package name */
    public final int f369925b;

    /* renamed from: c, reason: collision with root package name */
    public final int f369926c;

    /* renamed from: d, reason: collision with root package name */
    public final int f369927d;

    /* renamed from: e, reason: collision with root package name */
    public final int f369928e;

    public b(java.lang.String content, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f369924a = content;
        this.f369925b = i17;
        this.f369926c = i18;
        this.f369927d = i19;
        this.f369928e = i27;
    }

    /* renamed from: equals */
    public boolean m134710xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i45.b)) {
            return false;
        }
        i45.b bVar = (i45.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f369924a, bVar.f369924a) && this.f369925b == bVar.f369925b && this.f369926c == bVar.f369926c && this.f369927d == bVar.f369927d && this.f369928e == bVar.f369928e;
    }

    /* renamed from: hashCode */
    public int m134711x8cdac1b() {
        return (((((((this.f369924a.hashCode() * 31) + java.lang.Integer.hashCode(this.f369925b)) * 31) + java.lang.Integer.hashCode(this.f369926c)) * 31) + java.lang.Integer.hashCode(this.f369927d)) * 31) + java.lang.Integer.hashCode(this.f369928e);
    }

    /* renamed from: toString */
    public java.lang.String m134712x9616526c() {
        return "WeTypeFullTextGuide(content=" + this.f369924a + ", interval=" + this.f369925b + ", maxTime=" + this.f369926c + ", aliveTime=" + this.f369927d + ", exitCondition=" + this.f369928e + ')';
    }
}
