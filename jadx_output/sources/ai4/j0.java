package ai4;

/* loaded from: classes11.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5158a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5159b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5160c;

    public j0(boolean z17, long j17, long j18) {
        this.f5158a = z17;
        this.f5159b = j17;
        this.f5160c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai4.j0)) {
            return false;
        }
        ai4.j0 j0Var = (ai4.j0) obj;
        return this.f5158a == j0Var.f5158a && this.f5159b == j0Var.f5159b && this.f5160c == j0Var.f5160c;
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f5158a) * 31) + java.lang.Long.hashCode(this.f5159b)) * 31) + java.lang.Long.hashCode(this.f5160c);
    }

    public java.lang.String toString() {
        return "StatusAffTransferJobResult(isComplete=" + this.f5158a + ", oldDBCount=" + this.f5159b + ", successCount=" + this.f5160c + ')';
    }
}
