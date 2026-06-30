package yc5;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f542418a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f542419b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f542420c;

    public a(boolean z17, boolean z18, boolean z19) {
        this.f542418a = z17;
        this.f542419b = z18;
        this.f542420c = z19;
    }

    /* renamed from: equals */
    public boolean m176820xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc5.a)) {
            return false;
        }
        yc5.a aVar = (yc5.a) obj;
        return this.f542418a == aVar.f542418a && this.f542419b == aVar.f542419b && this.f542420c == aVar.f542420c;
    }

    /* renamed from: hashCode */
    public int m176821x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f542418a) * 31) + java.lang.Boolean.hashCode(this.f542419b)) * 31) + java.lang.Boolean.hashCode(this.f542420c);
    }

    /* renamed from: toString */
    public java.lang.String m176822x9616526c() {
        return "BatchResult(hasSuccess=" + this.f542418a + ", hasExpired=" + this.f542419b + ", hasFailed=" + this.f542420c + ')';
    }
}
