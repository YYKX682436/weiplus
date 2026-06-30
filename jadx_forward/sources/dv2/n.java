package dv2;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f325437a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f325438b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f325439c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f325440d;

    public n(boolean z17, java.lang.String followOnlyTitle, java.lang.String str, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(followOnlyTitle, "followOnlyTitle");
        this.f325437a = z17;
        this.f325438b = followOnlyTitle;
        this.f325439c = str;
        this.f325440d = str2;
    }

    /* renamed from: equals */
    public boolean m126290xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv2.n)) {
            return false;
        }
        dv2.n nVar = (dv2.n) obj;
        return this.f325437a == nVar.f325437a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325438b, nVar.f325438b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325439c, nVar.f325439c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325440d, nVar.f325440d);
    }

    /* renamed from: hashCode */
    public int m126291x8cdac1b() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f325437a) * 31) + this.f325438b.hashCode()) * 31;
        java.lang.String str = this.f325439c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f325440d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m126292x9616526c() {
        return "UIState(isFollowOnly=" + this.f325437a + ", followOnlyTitle=" + this.f325438b + ", followSubtitle=" + this.f325439c + ", recentSubtitle=" + this.f325440d + ')';
    }
}
