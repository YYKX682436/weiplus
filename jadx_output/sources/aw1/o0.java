package aw1;

/* loaded from: classes10.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f14624a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14625b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14626c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14627d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14628e;

    public o0(long j17, long j18, long j19, long j27, long j28) {
        this.f14624a = j17;
        this.f14625b = j18;
        this.f14626c = j19;
        this.f14627d = j27;
        this.f14628e = j28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw1.o0)) {
            return false;
        }
        aw1.o0 o0Var = (aw1.o0) obj;
        return this.f14624a == o0Var.f14624a && this.f14625b == o0Var.f14625b && this.f14626c == o0Var.f14626c && this.f14627d == o0Var.f14627d && this.f14628e == o0Var.f14628e;
    }

    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.f14624a) * 31) + java.lang.Long.hashCode(this.f14625b)) * 31) + java.lang.Long.hashCode(this.f14626c)) * 31) + java.lang.Long.hashCode(this.f14627d)) * 31) + java.lang.Long.hashCode(this.f14628e);
    }

    public java.lang.String toString() {
        return "LastTaskCompressedResult(compressedSize=" + this.f14624a + ", sendCompressedSize=" + this.f14625b + ", recvCompressedSize=" + this.f14626c + ", sendExpectedSize=" + this.f14627d + ", recvExpectedSize=" + this.f14628e + ')';
    }
}
