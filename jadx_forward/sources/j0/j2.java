package j0;

/* loaded from: classes14.dex */
public final class j2 {

    /* renamed from: e, reason: collision with root package name */
    public static final j0.j2 f377910e = new j0.j2(0, false, 0, 0, 15, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f377911a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f377912b;

    /* renamed from: c, reason: collision with root package name */
    public final int f377913c;

    /* renamed from: d, reason: collision with root package name */
    public final int f377914d;

    public j2(int i17, boolean z17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i27 & 1) != 0 ? 0 : i17;
        z17 = (i27 & 2) != 0 ? true : z17;
        i18 = (i27 & 4) != 0 ? 1 : i18;
        i19 = (i27 & 8) != 0 ? 1 : i19;
        this.f377911a = i17;
        this.f377912b = z17;
        this.f377913c = i18;
        this.f377914d = i19;
    }

    /* renamed from: equals */
    public boolean m140032xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0.j2)) {
            return false;
        }
        j0.j2 j2Var = (j0.j2) obj;
        if (!(this.f377911a == j2Var.f377911a) || this.f377912b != j2Var.f377912b) {
            return false;
        }
        if (this.f377913c == j2Var.f377913c) {
            return this.f377914d == j2Var.f377914d;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m140033x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f377911a) * 31) + java.lang.Boolean.hashCode(this.f377912b)) * 31) + java.lang.Integer.hashCode(this.f377913c)) * 31) + java.lang.Integer.hashCode(this.f377914d);
    }

    /* renamed from: toString */
    public java.lang.String m140034x9616526c() {
        return "KeyboardOptions(capitalization=" + ((java.lang.Object) g2.r.a(this.f377911a)) + ", autoCorrect=" + this.f377912b + ", keyboardType=" + ((java.lang.Object) g2.s.a(this.f377913c)) + ", imeAction=" + ((java.lang.Object) g2.k.a(this.f377914d)) + ')';
    }
}
