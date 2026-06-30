package yc0;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f542285a;

    /* renamed from: b, reason: collision with root package name */
    public final int f542286b;

    public e(boolean z17, int i17) {
        this.f542285a = z17;
        this.f542286b = i17;
    }

    /* renamed from: equals */
    public boolean m176777xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc0.e)) {
            return false;
        }
        yc0.e eVar = (yc0.e) obj;
        return this.f542285a == eVar.f542285a && this.f542286b == eVar.f542286b;
    }

    /* renamed from: hashCode */
    public int m176778x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f542285a) * 31) + java.lang.Integer.hashCode(this.f542286b);
    }

    /* renamed from: toString */
    public java.lang.String m176779x9616526c() {
        return "RemuxResult(result=" + this.f542285a + ", errCode=" + this.f542286b + ')';
    }
}
