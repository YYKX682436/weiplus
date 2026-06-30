package ua;

/* loaded from: classes16.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f507430a;

    /* renamed from: b, reason: collision with root package name */
    public final ua.e f507431b;

    /* renamed from: c, reason: collision with root package name */
    public ua.e f507432c;

    public f(java.lang.String str, ua.d dVar) {
        ua.e eVar = new ua.e(null);
        this.f507431b = eVar;
        this.f507432c = eVar;
        str.getClass();
        this.f507430a = str;
    }

    /* renamed from: toString */
    public java.lang.String m167743x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(32);
        sb6.append(this.f507430a);
        sb6.append('{');
        ua.e eVar = this.f507431b.f507429c;
        java.lang.String str = "";
        while (eVar != null) {
            java.lang.Object obj = eVar.f507428b;
            sb6.append(str);
            java.lang.String str2 = eVar.f507427a;
            if (str2 != null) {
                sb6.append(str2);
                sb6.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb6.append(obj);
            } else {
                java.lang.String deepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                sb6.append((java.lang.CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            eVar = eVar.f507429c;
            str = ", ";
        }
        sb6.append('}');
        return sb6.toString();
    }
}
