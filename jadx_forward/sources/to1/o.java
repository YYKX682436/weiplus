package to1;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f502460a;

    /* renamed from: b, reason: collision with root package name */
    public final long f502461b;

    public o(long j17, long j18) {
        this.f502460a = j17;
        this.f502461b = j18;
    }

    /* renamed from: equals */
    public boolean m166825xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to1.o)) {
            return false;
        }
        to1.o oVar = (to1.o) obj;
        return this.f502460a == oVar.f502460a && this.f502461b == oVar.f502461b;
    }

    /* renamed from: hashCode */
    public int m166826x8cdac1b() {
        return (java.lang.Long.hashCode(this.f502460a) * 31) + java.lang.Long.hashCode(this.f502461b);
    }

    /* renamed from: toString */
    public java.lang.String m166827x9616526c() {
        return "StateInfo(length=" + this.f502460a + ", lastModified=" + this.f502461b + ')';
    }
}
