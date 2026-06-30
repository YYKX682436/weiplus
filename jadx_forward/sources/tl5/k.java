package tl5;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f501900a;

    /* renamed from: b, reason: collision with root package name */
    public final float f501901b;

    public k(boolean z17, float f17) {
        this.f501900a = z17;
        this.f501901b = f17;
    }

    /* renamed from: equals */
    public boolean m166768xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl5.k)) {
            return false;
        }
        tl5.k kVar = (tl5.k) obj;
        return this.f501900a == kVar.f501900a && java.lang.Float.compare(this.f501901b, kVar.f501901b) == 0;
    }

    /* renamed from: hashCode */
    public int m166769x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f501900a) * 31) + java.lang.Float.hashCode(this.f501901b);
    }

    /* renamed from: toString */
    public java.lang.String m166770x9616526c() {
        return "PendingEndRequest(applied=" + this.f501900a + ", finalProgress=" + this.f501901b + ')';
    }
}
