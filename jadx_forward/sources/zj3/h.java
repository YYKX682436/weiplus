package zj3;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f554858a;

    /* renamed from: b, reason: collision with root package name */
    public long f554859b;

    /* renamed from: c, reason: collision with root package name */
    public int f554860c;

    public h(int i17, long j17, int i18) {
        this.f554858a = i17;
        this.f554859b = j17;
        this.f554860c = i18;
    }

    /* renamed from: equals */
    public boolean m179052xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj3.h)) {
            return false;
        }
        zj3.h hVar = (zj3.h) obj;
        return this.f554858a == hVar.f554858a && this.f554859b == hVar.f554859b && this.f554860c == hVar.f554860c;
    }

    /* renamed from: hashCode */
    public int m179053x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f554858a) * 31) + java.lang.Long.hashCode(this.f554859b)) * 31) + java.lang.Integer.hashCode(this.f554860c);
    }

    /* renamed from: toString */
    public java.lang.String m179054x9616526c() {
        return "CostInfo(idx=" + this.f554858a + ", totalCost=" + this.f554859b + ", times=" + this.f554860c + ')';
    }
}
