package bp4;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f23302a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23303b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23304c;

    public o(int i17, long j17, long j18) {
        this.f23302a = i17;
        this.f23303b = j17;
        this.f23304c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp4.o)) {
            return false;
        }
        bp4.o oVar = (bp4.o) obj;
        return this.f23302a == oVar.f23302a && this.f23303b == oVar.f23303b && this.f23304c == oVar.f23304c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f23302a) * 31) + java.lang.Long.hashCode(this.f23303b)) * 31) + java.lang.Long.hashCode(this.f23304c);
    }

    public java.lang.String toString() {
        return "TrackState(transOrder=" + this.f23302a + ", trackStartTimeMs=" + this.f23303b + ", trackEndTimeMs=" + this.f23304c + ')';
    }
}
