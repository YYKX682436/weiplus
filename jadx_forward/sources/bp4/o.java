package bp4;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f104835a;

    /* renamed from: b, reason: collision with root package name */
    public final long f104836b;

    /* renamed from: c, reason: collision with root package name */
    public final long f104837c;

    public o(int i17, long j17, long j18) {
        this.f104835a = i17;
        this.f104836b = j17;
        this.f104837c = j18;
    }

    /* renamed from: equals */
    public boolean m10997xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp4.o)) {
            return false;
        }
        bp4.o oVar = (bp4.o) obj;
        return this.f104835a == oVar.f104835a && this.f104836b == oVar.f104836b && this.f104837c == oVar.f104837c;
    }

    /* renamed from: hashCode */
    public int m10998x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f104835a) * 31) + java.lang.Long.hashCode(this.f104836b)) * 31) + java.lang.Long.hashCode(this.f104837c);
    }

    /* renamed from: toString */
    public java.lang.String m10999x9616526c() {
        return "TrackState(transOrder=" + this.f104835a + ", trackStartTimeMs=" + this.f104836b + ", trackEndTimeMs=" + this.f104837c + ')';
    }
}
