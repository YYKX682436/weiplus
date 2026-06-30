package zt3;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f557118a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f557119b;

    public b(int i17, android.os.Bundle bundle) {
        this.f557118a = i17;
        this.f557119b = bundle;
    }

    /* renamed from: equals */
    public boolean m179451xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt3.b)) {
            return false;
        }
        zt3.b bVar = (zt3.b) obj;
        return this.f557118a == bVar.f557118a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557119b, bVar.f557119b);
    }

    /* renamed from: hashCode */
    public int m179452x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f557118a) * 31;
        android.os.Bundle bundle = this.f557119b;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m179453x9616526c() {
        return "EventState(event=" + this.f557118a + ", extra=" + this.f557119b + ')';
    }
}
