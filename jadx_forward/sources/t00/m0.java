package t00;

/* loaded from: classes9.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f495848a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f495849b;

    /* renamed from: c, reason: collision with root package name */
    public final int f495850c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f495851d;

    public m0(boolean z17, boolean z18, int i17, java.util.ArrayList arrayList) {
        this.f495848a = z17;
        this.f495849b = z18;
        this.f495850c = i17;
        this.f495851d = arrayList;
    }

    /* renamed from: equals */
    public boolean m165564xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t00.m0)) {
            return false;
        }
        t00.m0 m0Var = (t00.m0) obj;
        return this.f495848a == m0Var.f495848a && this.f495849b == m0Var.f495849b && this.f495850c == m0Var.f495850c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f495851d, m0Var.f495851d);
    }

    /* renamed from: hashCode */
    public int m165565x8cdac1b() {
        int hashCode = ((((java.lang.Boolean.hashCode(this.f495848a) * 31) + java.lang.Boolean.hashCode(this.f495849b)) * 31) + java.lang.Integer.hashCode(this.f495850c)) * 31;
        java.util.ArrayList arrayList = this.f495851d;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m165566x9616526c() {
        return "EcsGetPreloadDataParseModel(isValid=" + this.f495848a + ", isAsync=" + this.f495849b + ", timeoutMS=" + this.f495850c + ", keys=" + this.f495851d + ')';
    }

    public /* synthetic */ m0(boolean z17, boolean z18, int i17, java.util.ArrayList arrayList, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, z18, i17, (i18 & 8) != 0 ? null : arrayList);
    }
}
