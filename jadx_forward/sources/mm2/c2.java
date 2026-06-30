package mm2;

/* loaded from: classes3.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public int f410463a;

    /* renamed from: b, reason: collision with root package name */
    public int f410464b;

    public c2(int i17, int i18) {
        this.f410463a = i17;
        this.f410464b = i18;
    }

    /* renamed from: equals */
    public boolean m147913xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.c2)) {
            return false;
        }
        mm2.c2 c2Var = (mm2.c2) obj;
        return this.f410463a == c2Var.f410463a && this.f410464b == c2Var.f410464b;
    }

    /* renamed from: hashCode */
    public int m147914x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f410463a) * 31) + java.lang.Integer.hashCode(this.f410464b);
    }

    /* renamed from: toString */
    public java.lang.String m147915x9616526c() {
        return "DanmakuSpeed(landscapeDuration=" + this.f410463a + ", landscapeInterval=" + this.f410464b + ')';
    }
}
