package f06;

/* loaded from: classes15.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final f06.z f339992c = new f06.z(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final f06.a0 f339993a;

    /* renamed from: b, reason: collision with root package name */
    public final f06.w f339994b;

    public z(f06.a0 a0Var, f06.w wVar) {
        java.lang.String str;
        this.f339993a = a0Var;
        this.f339994b = wVar;
        if ((a0Var == null) == (wVar == null)) {
            return;
        }
        if (a0Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + a0Var + " requires type to be specified.";
        }
        throw new java.lang.IllegalArgumentException(str.toString());
    }

    /* renamed from: equals */
    public boolean m128666xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f06.z)) {
            return false;
        }
        f06.z zVar = (f06.z) obj;
        return this.f339993a == zVar.f339993a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f339994b, zVar.f339994b);
    }

    /* renamed from: hashCode */
    public int m128667x8cdac1b() {
        f06.a0 a0Var = this.f339993a;
        int hashCode = (a0Var == null ? 0 : a0Var.hashCode()) * 31;
        f06.w wVar = this.f339994b;
        return hashCode + (wVar != null ? wVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m128668x9616526c() {
        f06.a0 a0Var = this.f339993a;
        int i17 = a0Var == null ? -1 : f06.y.f339991a[a0Var.ordinal()];
        if (i17 == -1) {
            return "*";
        }
        f06.w wVar = this.f339994b;
        if (i17 == 1) {
            return java.lang.String.valueOf(wVar);
        }
        if (i17 == 2) {
            return "in " + wVar;
        }
        if (i17 != 3) {
            throw new jz5.j();
        }
        return "out " + wVar;
    }
}
