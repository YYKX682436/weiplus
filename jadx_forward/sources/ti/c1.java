package ti;

/* loaded from: classes12.dex */
public final class c1 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f501032d;

    /* renamed from: e, reason: collision with root package name */
    public final ti.b1 f501033e;

    /* renamed from: f, reason: collision with root package name */
    public final ti.a1 f501034f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f501035g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f501036h;

    /* renamed from: i, reason: collision with root package name */
    public final ti.v0 f501037i;

    public c1(java.lang.String str, ti.b1 b1Var, ti.a1 a1Var, java.lang.String str2, java.lang.String str3, ti.v0 v0Var, java.util.List list) {
        this.f501032d = str;
        this.f501033e = b1Var;
        this.f501034f = a1Var;
        this.f501035g = str2;
        this.f501036h = str3;
        this.f501037i = v0Var;
        java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
    }

    public final java.lang.String a(boolean z17) {
        java.lang.String str;
        java.lang.String str2 = this.f501033e == ti.b1.STATIC_FIELD ? "static " : "";
        ti.a1 a1Var = ti.a1.ARRAY;
        ti.a1 a1Var2 = this.f501034f;
        if (a1Var2 == a1Var || a1Var2 == ti.a1.THREAD) {
            str2 = str2 + a1Var2.name().toLowerCase(java.util.Locale.US) + " ";
        }
        java.lang.String str3 = str2 + this.f501035g;
        java.lang.String str4 = this.f501032d;
        if (str4 == null) {
            str = str3 + " instance";
        } else if (z17 && a1Var2 == a1Var) {
            str = str3 + " [*]";
        } else {
            str = str3 + " " + str4;
        }
        java.lang.String str5 = this.f501036h;
        if (str5 != null) {
            str = str + " " + str5;
        }
        ti.v0 v0Var = this.f501037i;
        if (v0Var == null) {
            return str;
        }
        return str + " , matching exclusion " + v0Var.f501052e;
    }

    /* renamed from: toString */
    public java.lang.String m166618x9616526c() {
        return a(false);
    }
}
