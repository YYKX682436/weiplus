package fk4;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f345181a;

    /* renamed from: b, reason: collision with root package name */
    public final long f345182b;

    /* renamed from: c, reason: collision with root package name */
    public final long f345183c;

    /* renamed from: d, reason: collision with root package name */
    public final long f345184d;

    public o(long j17, long j18, long j19, long j27) {
        this.f345181a = j17;
        this.f345182b = j18;
        this.f345183c = j19;
        this.f345184d = j27;
    }

    /* renamed from: equals */
    public boolean m129642xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk4.o)) {
            return false;
        }
        fk4.o oVar = (fk4.o) obj;
        return this.f345181a == oVar.f345181a && this.f345182b == oVar.f345182b && this.f345183c == oVar.f345183c && this.f345184d == oVar.f345184d;
    }

    /* renamed from: hashCode */
    public int m129643x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f345181a) * 31) + java.lang.Long.hashCode(this.f345182b)) * 31) + java.lang.Long.hashCode(this.f345183c)) * 31) + java.lang.Long.hashCode(this.f345184d);
    }

    /* renamed from: toString */
    public java.lang.String m129644x9616526c() {
        return "Stat(progress=" + this.f345181a + ", totalLength=" + this.f345182b + ", moovOffset=" + this.f345183c + ", moovLength=" + this.f345184d + ')';
    }
}
