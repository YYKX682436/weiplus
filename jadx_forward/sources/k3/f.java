package k3;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f385313a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f385314b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f385315c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f385316d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f385317e;

    public f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        str.getClass();
        this.f385313a = str;
        str2.getClass();
        this.f385314b = str2;
        str3.getClass();
        this.f385315c = str3;
        list.getClass();
        this.f385316d = list;
        this.f385317e = str + "-" + str2 + "-" + str3;
    }

    /* renamed from: toString */
    public java.lang.String m141866x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("FontRequest {mProviderAuthority: " + this.f385313a + ", mProviderPackage: " + this.f385314b + ", mQuery: " + this.f385315c + ", mCertificates:");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f385316d;
            if (i17 >= list.size()) {
                sb6.append("}mCertificatesArray: 0");
                return sb6.toString();
            }
            sb6.append(" [");
            java.util.List list2 = (java.util.List) list.get(i17);
            for (int i18 = 0; i18 < list2.size(); i18++) {
                sb6.append(" \"");
                sb6.append(android.util.Base64.encodeToString((byte[]) list2.get(i18), 0));
                sb6.append("\"");
            }
            sb6.append(" ]");
            i17++;
        }
    }
}
