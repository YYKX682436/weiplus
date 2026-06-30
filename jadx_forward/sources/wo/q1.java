package wo;

/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f529323a;

    /* renamed from: b, reason: collision with root package name */
    public final int f529324b;

    public q1(int i17, int i18) {
        this.f529323a = i17;
        this.f529324b = i18;
    }

    /* renamed from: equals */
    public boolean m174197xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo.q1)) {
            return false;
        }
        wo.q1 q1Var = (wo.q1) obj;
        return this.f529323a == q1Var.f529323a && this.f529324b == q1Var.f529324b;
    }

    /* renamed from: hashCode */
    public int m174198x8cdac1b() {
        int i17 = this.f529323a;
        return ((i17 >>> 16) | (i17 << 16)) ^ this.f529324b;
    }

    /* renamed from: toString */
    public java.lang.String m174199x9616526c() {
        return this.f529323a + "x" + this.f529324b;
    }
}
