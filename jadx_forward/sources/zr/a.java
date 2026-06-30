package zr;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f556636a;

    /* renamed from: b, reason: collision with root package name */
    public final int f556637b;

    public a(int i17, int i18) {
        this.f556636a = i17;
        this.f556637b = i18;
    }

    /* renamed from: equals */
    public boolean m179355xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr.a)) {
            return false;
        }
        zr.a aVar = (zr.a) obj;
        return this.f556636a == aVar.f556636a && this.f556637b == aVar.f556637b;
    }

    /* renamed from: hashCode */
    public int m179356x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f556636a) * 31) + java.lang.Integer.hashCode(this.f556637b);
    }

    /* renamed from: toString */
    public java.lang.String m179357x9616526c() {
        return "MainTabClickData(type=" + this.f556636a + ", unread=" + this.f556637b + ')';
    }
}
