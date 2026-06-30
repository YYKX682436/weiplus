package gf;

/* loaded from: classes5.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f352572a;

    /* renamed from: b, reason: collision with root package name */
    public final long f352573b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f352574c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f352575d;

    public e2(boolean z17, long j17, java.lang.String str, java.util.List pathWhiteList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathWhiteList, "pathWhiteList");
        this.f352572a = z17;
        this.f352573b = j17;
        this.f352574c = str;
        this.f352575d = pathWhiteList;
    }

    /* renamed from: equals */
    public boolean m131386xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf.e2)) {
            return false;
        }
        gf.e2 e2Var = (gf.e2) obj;
        return this.f352572a == e2Var.f352572a && this.f352573b == e2Var.f352573b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352574c, e2Var.f352574c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352575d, e2Var.f352575d);
    }

    /* renamed from: hashCode */
    public int m131387x8cdac1b() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f352572a) * 31) + java.lang.Long.hashCode(this.f352573b)) * 31;
        java.lang.String str = this.f352574c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f352575d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m131388x9616526c() {
        return "SkylineExptParam(isEnabled=" + this.f352572a + ", exptGroupId=" + this.f352573b + ", exptParam=" + this.f352574c + ", pathWhiteList=" + this.f352575d + ')';
    }

    public /* synthetic */ e2(boolean z17, long j17, java.lang.String str, java.util.List list, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, (i17 & 2) != 0 ? 0L : j17, (i17 & 4) != 0 ? null : str, (i17 & 8) != 0 ? kz5.p0.f395529d : list);
    }
}
