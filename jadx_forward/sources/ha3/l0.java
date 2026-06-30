package ha3;

/* loaded from: classes11.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public int f361428a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.StringBuilder f361429b = new java.lang.StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f361430c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f361431d = new java.util.LinkedHashMap();

    public final void a(java.lang.String str) {
        if (str.length() == 0) {
            return;
        }
        java.lang.StringBuilder sb6 = this.f361429b;
        sb6.append(str);
        sb6.append("\n");
    }

    public final ha3.m0 b(int i17) {
        if (i17 < 0) {
            return null;
        }
        java.util.List list = this.f361430c;
        if (i17 >= ((java.util.ArrayList) list).size()) {
            return null;
        }
        java.lang.String str = ((ha3.m0) ((java.util.ArrayList) list).get(i17)).f361435c;
        if (str == null) {
            str = "";
        }
        return (ha3.m0) ((java.util.LinkedHashMap) this.f361431d).get(str);
    }
}
