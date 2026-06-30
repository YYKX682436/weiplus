package zt3;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f557125a;

    /* renamed from: b, reason: collision with root package name */
    public final int f557126b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f557127c;

    public d(int i17, int i18, android.os.Bundle bundle) {
        this.f557125a = i17;
        this.f557126b = i18;
        this.f557127c = bundle;
    }

    /* renamed from: equals */
    public boolean m179457xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt3.d)) {
            return false;
        }
        zt3.d dVar = (zt3.d) obj;
        return this.f557125a == dVar.f557125a && this.f557126b == dVar.f557126b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557127c, dVar.f557127c);
    }

    /* renamed from: hashCode */
    public int m179458x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f557125a) * 31) + java.lang.Integer.hashCode(this.f557126b)) * 31;
        android.os.Bundle bundle = this.f557127c;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m179459x9616526c() {
        return "ViewState(type=" + this.f557125a + ", visible=" + this.f557126b + ", extra=" + this.f557127c + ')';
    }
}
