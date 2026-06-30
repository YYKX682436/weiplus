package nw4;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public long f422404a;

    /* renamed from: b, reason: collision with root package name */
    public int f422405b;

    public l(long j17, int i17) {
        this.f422404a = j17;
        this.f422405b = i17;
    }

    /* renamed from: equals */
    public boolean m150197xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw4.l)) {
            return false;
        }
        nw4.l lVar = (nw4.l) obj;
        return this.f422404a == lVar.f422404a && this.f422405b == lVar.f422405b;
    }

    /* renamed from: hashCode */
    public int m150198x8cdac1b() {
        return (java.lang.Long.hashCode(this.f422404a) * 31) + java.lang.Integer.hashCode(this.f422405b);
    }

    /* renamed from: toString */
    public java.lang.String m150199x9616526c() {
        return "JsApiCallInfo(time=" + this.f422404a + ", count=" + this.f422405b + ')';
    }
}
