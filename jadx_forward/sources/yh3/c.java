package yh3;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f543932a;

    /* renamed from: b, reason: collision with root package name */
    public final long f543933b;

    public c(long j17, long j18) {
        this.f543932a = j17;
        this.f543933b = j18;
    }

    /* renamed from: equals */
    public boolean m177176xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh3.c)) {
            return false;
        }
        yh3.c cVar = (yh3.c) obj;
        return this.f543932a == cVar.f543932a && this.f543933b == cVar.f543933b;
    }

    /* renamed from: hashCode */
    public int m177177x8cdac1b() {
        return (java.lang.Long.hashCode(this.f543932a) * 31) + java.lang.Long.hashCode(this.f543933b);
    }

    /* renamed from: toString */
    public java.lang.String m177178x9616526c() {
        return "RePlayOnMoovReady(offset=" + this.f543932a + ", length=" + this.f543933b + ')';
    }
}
