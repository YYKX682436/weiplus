package tr5;

/* loaded from: classes13.dex */
public class z implements java.io.Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final tr5.z f503041g;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f503042d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f503043e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String[] f503044f;

    static {
        java.lang.String[] strArr = tr5.c.f502988a;
        f503041g = new tr5.z(strArr, strArr);
    }

    public z(java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (strArr == null) {
            throw new java.lang.IllegalArgumentException("v4Ips".concat(" can not be null"));
        }
        if (strArr2 != null) {
            this.f503042d = strArr;
            this.f503043e = strArr2;
            this.f503044f = null;
            return;
        }
        throw new java.lang.IllegalArgumentException("v6Ips".concat(" can not be null"));
    }

    /* renamed from: toString */
    public java.lang.String m166991x9616526c() {
        return "IpSet{v4Ips=" + java.util.Arrays.toString(this.f503042d) + ", v6Ips=" + java.util.Arrays.toString(this.f503043e) + ", ips=" + java.util.Arrays.toString(this.f503044f) + '}';
    }

    public z(java.lang.String[] strArr) {
        if (strArr != null) {
            this.f503044f = strArr;
            this.f503042d = null;
            this.f503043e = null;
            return;
        }
        throw new java.lang.IllegalArgumentException("ips".concat(" can not be null"));
    }
}
