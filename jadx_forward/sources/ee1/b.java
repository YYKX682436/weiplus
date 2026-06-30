package ee1;

/* loaded from: classes4.dex */
public final class b extends ee1.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f333104a;

    /* renamed from: b, reason: collision with root package name */
    public final int f333105b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f333106c;

    public b(int i17, int i18, java.lang.String str) {
        super(null);
        this.f333104a = i17;
        this.f333105b = i18;
        this.f333106c = str;
    }

    /* renamed from: equals */
    public boolean m127504xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee1.b)) {
            return false;
        }
        ee1.b bVar = (ee1.b) obj;
        return this.f333104a == bVar.f333104a && this.f333105b == bVar.f333105b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f333106c, bVar.f333106c);
    }

    /* renamed from: hashCode */
    public int m127505x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f333104a) * 31) + java.lang.Integer.hashCode(this.f333105b)) * 31;
        java.lang.String str = this.f333106c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m127506x9616526c() {
        return "NetworkError(errType=" + this.f333104a + ", errCode=" + this.f333105b + ", errMsg=" + this.f333106c + ')';
    }
}
