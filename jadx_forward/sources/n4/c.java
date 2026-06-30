package n4;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f416389a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f416390b;

    /* renamed from: c, reason: collision with root package name */
    public final int f416391c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f416392d;

    /* renamed from: e, reason: collision with root package name */
    public final int f416393e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f416394f;

    /* renamed from: g, reason: collision with root package name */
    public final int f416395g;

    public c(java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.String str3, int i18) {
        this.f416389a = str;
        this.f416390b = str2;
        this.f416392d = z17;
        this.f416393e = i17;
        int i19 = 5;
        if (str2 != null) {
            java.lang.String upperCase = str2.toUpperCase(java.util.Locale.US);
            if (upperCase.contains("INT")) {
                i19 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i19 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i19 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.f416391c = i19;
        this.f416394f = str3;
        this.f416395g = i18;
    }

    /* renamed from: equals */
    public boolean m149075xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n4.c.class != obj.getClass()) {
            return false;
        }
        n4.c cVar = (n4.c) obj;
        if (this.f416393e != cVar.f416393e || !this.f416389a.equals(cVar.f416389a) || this.f416392d != cVar.f416392d) {
            return false;
        }
        java.lang.String str = this.f416394f;
        int i17 = this.f416395g;
        int i18 = cVar.f416395g;
        java.lang.String str2 = cVar.f416394f;
        if (i17 == 1 && i18 == 2 && str != null && !str.equals(str2)) {
            return false;
        }
        if (i17 != 2 || i18 != 1 || str2 == null || str2.equals(str)) {
            return (i17 == 0 || i17 != i18 || (str == null ? str2 == null : str.equals(str2))) && this.f416391c == cVar.f416391c;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m149076x8cdac1b() {
        return (((((this.f416389a.hashCode() * 31) + this.f416391c) * 31) + (this.f416392d ? 1231 : 1237)) * 31) + this.f416393e;
    }

    /* renamed from: toString */
    public java.lang.String m149077x9616526c() {
        return "Column{name='" + this.f416389a + "', type='" + this.f416390b + "', affinity='" + this.f416391c + "', notNull=" + this.f416392d + ", primaryKeyPosition=" + this.f416393e + ", defaultValue='" + this.f416394f + "'}";
    }
}
