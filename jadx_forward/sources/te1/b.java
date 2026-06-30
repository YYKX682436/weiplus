package te1;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final te1.b f499301c = new te1.b(com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a);

    /* renamed from: d, reason: collision with root package name */
    public static final te1.b f499302d = new te1.b("application/octet-stream");

    /* renamed from: e, reason: collision with root package name */
    public static final te1.b f499303e = new te1.b(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54280xf59ed10d);

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f499304f = {117, 110, 107, 110, 111, 119, 110};

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f499305g = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f499306a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f499307b;

    public b(java.lang.String str) {
        this.f499306a = str;
    }

    public static te1.b a(java.lang.String str) {
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        te1.b bVar = f499301c;
        return isEmpty ? bVar : str.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54280xf59ed10d) ? f499303e : str.equals(com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a) ? bVar : new te1.b(str);
    }

    /* renamed from: equals */
    public boolean m166294xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || te1.b.class != obj.getClass()) {
            return false;
        }
        java.lang.String str = ((te1.b) obj).f499306a;
        java.lang.String str2 = this.f499306a;
        if (str2 != null) {
            if (str2.equals(str)) {
                return true;
            }
        } else if (str == null) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m166295x8cdac1b() {
        java.lang.String str = this.f499306a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m166296x9616526c() {
        return this.f499306a;
    }
}
