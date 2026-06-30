package po1;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final po1.g f438836a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.w f438837b;

    /* renamed from: c, reason: collision with root package name */
    public final int f438838c;

    public e(po1.g unifyType, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.w affType, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unifyType, "unifyType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(affType, "affType");
        this.f438836a = unifyType;
        this.f438837b = affType;
        this.f438838c = i17;
    }

    /* renamed from: equals */
    public boolean m158785xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po1.e)) {
            return false;
        }
        po1.e eVar = (po1.e) obj;
        return this.f438836a == eVar.f438836a && this.f438837b == eVar.f438837b && this.f438838c == eVar.f438838c;
    }

    /* renamed from: hashCode */
    public int m158786x8cdac1b() {
        return (((this.f438836a.hashCode() * 31) + this.f438837b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f438838c);
    }

    /* renamed from: toString */
    public java.lang.String m158787x9616526c() {
        return "MappingType(unifyType=" + this.f438836a + ", affType=" + this.f438837b + ", productType=" + this.f438838c + ')';
    }
}
