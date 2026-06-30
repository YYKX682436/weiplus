package ad5;

/* loaded from: classes10.dex */
public final class h extends ad5.j {

    /* renamed from: a, reason: collision with root package name */
    public final int f84793a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f84794b;

    public h(int i17, java.lang.String str) {
        super(null);
        this.f84793a = i17;
        this.f84794b = str;
    }

    /* renamed from: equals */
    public boolean m1104xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5.h)) {
            return false;
        }
        ad5.h hVar = (ad5.h) obj;
        return this.f84793a == hVar.f84793a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f84794b, hVar.f84794b);
    }

    /* renamed from: hashCode */
    public int m1105x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f84793a) * 31;
        java.lang.String str = this.f84794b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m1106x9616526c() {
        return "Failed(errorCode=" + this.f84793a + ", errorMessage=" + this.f84794b + ')';
    }

    public /* synthetic */ h(int i17, java.lang.String str, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17, (i18 & 2) != 0 ? null : str);
    }
}
