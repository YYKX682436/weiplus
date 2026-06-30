package ty2;

/* loaded from: classes9.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f504659a;

    /* renamed from: b, reason: collision with root package name */
    public final int f504660b;

    /* renamed from: c, reason: collision with root package name */
    public final int f504661c;

    /* renamed from: d, reason: collision with root package name */
    public final int f504662d;

    /* renamed from: e, reason: collision with root package name */
    public final int f504663e;

    /* renamed from: f, reason: collision with root package name */
    public final ty2.c f504664f;

    public z(int i17, int i18, int i19, int i27, int i28, ty2.c cVar) {
        this.f504659a = i17;
        this.f504660b = i18;
        this.f504661c = i19;
        this.f504662d = i27;
        this.f504663e = i28;
        this.f504664f = cVar;
    }

    public static ty2.z a(ty2.z zVar, int i17, int i18, int i19, int i27, int i28, ty2.c cVar, int i29, java.lang.Object obj) {
        if ((i29 & 1) != 0) {
            i17 = zVar.f504659a;
        }
        if ((i29 & 2) != 0) {
            i18 = zVar.f504660b;
        }
        int i37 = i18;
        if ((i29 & 4) != 0) {
            i19 = zVar.f504661c;
        }
        int i38 = i19;
        if ((i29 & 8) != 0) {
            i27 = zVar.f504662d;
        }
        int i39 = i27;
        if ((i29 & 16) != 0) {
            i28 = zVar.f504663e;
        }
        int i47 = i28;
        if ((i29 & 32) != 0) {
            cVar = zVar.f504664f;
        }
        zVar.getClass();
        return new ty2.z(i17, i37, i38, i39, i47, cVar);
    }

    /* renamed from: equals */
    public boolean m167243xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty2.z)) {
            return false;
        }
        ty2.z zVar = (ty2.z) obj;
        return this.f504659a == zVar.f504659a && this.f504660b == zVar.f504660b && this.f504661c == zVar.f504661c && this.f504662d == zVar.f504662d && this.f504663e == zVar.f504663e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504664f, zVar.f504664f);
    }

    /* renamed from: hashCode */
    public int m167244x8cdac1b() {
        int hashCode = ((((((((java.lang.Integer.hashCode(this.f504659a) * 31) + java.lang.Integer.hashCode(this.f504660b)) * 31) + java.lang.Integer.hashCode(this.f504661c)) * 31) + java.lang.Integer.hashCode(this.f504662d)) * 31) + java.lang.Integer.hashCode(this.f504663e)) * 31;
        ty2.c cVar = this.f504664f;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m167245x9616526c() {
        return "ProductSubViewConfig(marginTop=" + this.f504659a + ", marginLeft=" + this.f504660b + ", marginRight=" + this.f504661c + ", marginBottom=" + this.f504662d + ", maxWidthPx=" + this.f504663e + ", ext=" + this.f504664f + ')';
    }

    public /* synthetic */ z(int i17, int i18, int i19, int i27, int i28, ty2.c cVar, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i29 & 1) != 0 ? 0 : i17, (i29 & 2) != 0 ? 0 : i18, (i29 & 4) != 0 ? 0 : i19, (i29 & 8) != 0 ? 0 : i27, (i29 & 16) == 0 ? i28 : 0, (i29 & 32) != 0 ? null : cVar);
    }
}
