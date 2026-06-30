package mz0;

/* loaded from: classes3.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f414535a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Boolean f414536b;

    public m2(java.lang.String str, java.lang.Boolean bool) {
        this.f414535a = str;
        this.f414536b = bool;
    }

    /* renamed from: equals */
    public boolean m148621xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz0.m2)) {
            return false;
        }
        mz0.m2 m2Var = (mz0.m2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f414535a, m2Var.f414535a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f414536b, m2Var.f414536b);
    }

    /* renamed from: hashCode */
    public int m148622x8cdac1b() {
        java.lang.String str = this.f414535a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Boolean bool = this.f414536b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m148623x9616526c() {
        return "SnsBgmExportData(listenId=" + this.f414535a + ", isMajorOwned=" + this.f414536b + ')';
    }
}
