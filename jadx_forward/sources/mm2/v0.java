package mm2;

/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f411001a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f411002b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f411003c;

    /* renamed from: d, reason: collision with root package name */
    public int f411004d;

    /* renamed from: e, reason: collision with root package name */
    public int f411005e;

    public v0(boolean z17, java.util.List cheerIconInfos, java.lang.String str, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i19 & 1) != 0 ? false : z17;
        if ((i19 & 2) != 0) {
            cheerIconInfos = java.util.Collections.synchronizedList(new java.util.LinkedList());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cheerIconInfos, "synchronizedList(...)");
        }
        str = (i19 & 4) != 0 ? null : str;
        i17 = (i19 & 8) != 0 ? 0 : i17;
        i18 = (i19 & 16) != 0 ? 0 : i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cheerIconInfos, "cheerIconInfos");
        this.f411001a = z17;
        this.f411002b = cheerIconInfos;
        this.f411003c = str;
        this.f411004d = i17;
        this.f411005e = i18;
    }

    /* renamed from: equals */
    public boolean m148021xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.v0)) {
            return false;
        }
        mm2.v0 v0Var = (mm2.v0) obj;
        return this.f411001a == v0Var.f411001a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f411002b, v0Var.f411002b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f411003c, v0Var.f411003c) && this.f411004d == v0Var.f411004d && this.f411005e == v0Var.f411005e;
    }

    /* renamed from: hashCode */
    public int m148022x8cdac1b() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f411001a) * 31) + this.f411002b.hashCode()) * 31;
        java.lang.String str = this.f411003c;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f411004d)) * 31) + java.lang.Integer.hashCode(this.f411005e);
    }

    /* renamed from: toString */
    public java.lang.String m148023x9616526c() {
        return "CheerInfo(hasChanged=" + this.f411001a + ", cheerIconInfos=" + this.f411002b + ", cheerIconUrl=" + this.f411003c + ", enable=" + this.f411004d + ", cheerType=" + this.f411005e + ')';
    }
}
