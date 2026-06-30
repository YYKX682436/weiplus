package i04;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f368092a;

    /* renamed from: b, reason: collision with root package name */
    public final int f368093b;

    public m(boolean z17, int i17) {
        this.f368092a = z17;
        this.f368093b = i17;
    }

    /* renamed from: equals */
    public boolean m134340xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i04.m)) {
            return false;
        }
        i04.m mVar = (i04.m) obj;
        return this.f368092a == mVar.f368092a && this.f368093b == mVar.f368093b;
    }

    /* renamed from: hashCode */
    public int m134341x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f368092a) * 31) + java.lang.Integer.hashCode(this.f368093b);
    }

    /* renamed from: toString */
    public java.lang.String m134342x9616526c() {
        return "UserStats(disable=" + this.f368092a + ", time=" + this.f368093b + ')';
    }
}
