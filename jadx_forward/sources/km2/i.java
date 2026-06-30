package km2;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f390641a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.Bundle f390642b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f390643c;

    public i(java.lang.String str, android.os.Bundle bundle, java.lang.Object obj) {
        this.f390641a = str;
        this.f390642b = bundle;
        this.f390643c = obj;
    }

    /* renamed from: equals */
    public boolean m143661xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.i)) {
            return false;
        }
        km2.i iVar = (km2.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390641a, iVar.f390641a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390642b, iVar.f390642b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390643c, iVar.f390643c);
    }

    /* renamed from: hashCode */
    public int m143662x8cdac1b() {
        java.lang.String str = this.f390641a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        android.os.Bundle bundle = this.f390642b;
        int hashCode2 = (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        java.lang.Object obj = this.f390643c;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m143663x9616526c() {
        return "StateWrapper:" + this.f390641a + ',' + this.f390642b;
    }
}
