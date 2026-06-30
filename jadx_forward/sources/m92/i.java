package m92;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f406520a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f406521b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f406522c;

    public i(int i17, java.lang.String str, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        str = (i18 & 2) != 0 ? null : str;
        z17 = (i18 & 4) != 0 ? false : z17;
        this.f406520a = i17;
        this.f406521b = str;
        this.f406522c = z17;
    }

    /* renamed from: equals */
    public boolean m147071xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m92.i)) {
            return false;
        }
        m92.i iVar = (m92.i) obj;
        return this.f406520a == iVar.f406520a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f406521b, iVar.f406521b) && this.f406522c == iVar.f406522c;
    }

    /* renamed from: hashCode */
    public int m147072x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f406520a) * 31;
        java.lang.String str = this.f406521b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f406522c);
    }

    /* renamed from: toString */
    public java.lang.String m147073x9616526c() {
        return "FinderUserLogOutInfo(logOutFlag=" + this.f406520a + ", logOutUrl=" + this.f406521b + ", hasLogOut=" + this.f406522c + ')';
    }
}
