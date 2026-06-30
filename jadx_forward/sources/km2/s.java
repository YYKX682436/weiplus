package km2;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f390750a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f390751b;

    /* renamed from: c, reason: collision with root package name */
    public final int f390752c;

    /* renamed from: d, reason: collision with root package name */
    public int f390753d;

    /* renamed from: e, reason: collision with root package name */
    public int f390754e;

    public s(int i17, java.lang.String str, int i18, int i19, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i28 & 2) != 0 ? "" : str;
        i27 = (i28 & 16) != 0 ? 0 : i27;
        this.f390750a = i17;
        this.f390751b = str;
        this.f390752c = i18;
        this.f390753d = i19;
        this.f390754e = i27;
    }

    /* renamed from: equals */
    public boolean m143689xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.s)) {
            return false;
        }
        km2.s sVar = (km2.s) obj;
        return this.f390750a == sVar.f390750a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390751b, sVar.f390751b) && this.f390752c == sVar.f390752c && this.f390753d == sVar.f390753d && this.f390754e == sVar.f390754e;
    }

    /* renamed from: hashCode */
    public int m143690x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f390750a) * 31;
        java.lang.String str = this.f390751b;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f390752c)) * 31) + java.lang.Integer.hashCode(this.f390753d)) * 31) + java.lang.Integer.hashCode(this.f390754e);
    }

    /* renamed from: toString */
    public java.lang.String m143691x9616526c() {
        return "subtitle:" + this.f390751b + ",index:" + this.f390752c + ",duration:" + this.f390753d;
    }
}
