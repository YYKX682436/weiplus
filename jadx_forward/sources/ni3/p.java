package ni3;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f419199a;

    /* renamed from: b, reason: collision with root package name */
    public long f419200b;

    /* renamed from: c, reason: collision with root package name */
    public long f419201c;

    /* renamed from: d, reason: collision with root package name */
    public int f419202d;

    public p(int i17, long j17, long j18, int i18) {
        this.f419199a = i17;
        this.f419200b = j17;
        this.f419201c = j18;
        this.f419202d = i18;
    }

    /* renamed from: equals */
    public boolean m149662xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.p)) {
            return false;
        }
        ni3.p pVar = (ni3.p) obj;
        return this.f419199a == pVar.f419199a && this.f419200b == pVar.f419200b && this.f419201c == pVar.f419201c && this.f419202d == pVar.f419202d;
    }

    /* renamed from: hashCode */
    public int m149663x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f419199a) * 31) + java.lang.Long.hashCode(this.f419200b)) * 31) + java.lang.Long.hashCode(this.f419201c)) * 31) + java.lang.Integer.hashCode(this.f419202d);
    }

    /* renamed from: toString */
    public java.lang.String m149664x9616526c() {
        return "CgiActionInfo(tabType=" + this.f419199a + ", startTimeMs=" + this.f419200b + ", endTimeMs=" + this.f419201c + ", respItemSize=" + this.f419202d + ')';
    }
}
