package aw1;

/* loaded from: classes10.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f96157a;

    /* renamed from: b, reason: collision with root package name */
    public final long f96158b;

    /* renamed from: c, reason: collision with root package name */
    public final long f96159c;

    /* renamed from: d, reason: collision with root package name */
    public final long f96160d;

    /* renamed from: e, reason: collision with root package name */
    public final long f96161e;

    public o0(long j17, long j18, long j19, long j27, long j28) {
        this.f96157a = j17;
        this.f96158b = j18;
        this.f96159c = j19;
        this.f96160d = j27;
        this.f96161e = j28;
    }

    /* renamed from: equals */
    public boolean m9144xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw1.o0)) {
            return false;
        }
        aw1.o0 o0Var = (aw1.o0) obj;
        return this.f96157a == o0Var.f96157a && this.f96158b == o0Var.f96158b && this.f96159c == o0Var.f96159c && this.f96160d == o0Var.f96160d && this.f96161e == o0Var.f96161e;
    }

    /* renamed from: hashCode */
    public int m9145x8cdac1b() {
        return (((((((java.lang.Long.hashCode(this.f96157a) * 31) + java.lang.Long.hashCode(this.f96158b)) * 31) + java.lang.Long.hashCode(this.f96159c)) * 31) + java.lang.Long.hashCode(this.f96160d)) * 31) + java.lang.Long.hashCode(this.f96161e);
    }

    /* renamed from: toString */
    public java.lang.String m9146x9616526c() {
        return "LastTaskCompressedResult(compressedSize=" + this.f96157a + ", sendCompressedSize=" + this.f96158b + ", recvCompressedSize=" + this.f96159c + ", sendExpectedSize=" + this.f96160d + ", recvExpectedSize=" + this.f96161e + ')';
    }
}
