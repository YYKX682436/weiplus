package f0;

/* loaded from: classes14.dex */
public final class b implements f0.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f339539a;

    public b(int i17) {
        this.f339539a = i17;
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: equals */
    public boolean m128515xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof f0.b) {
            if (this.f339539a == ((f0.b) obj).f339539a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m128516x8cdac1b() {
        return -this.f339539a;
    }
}
