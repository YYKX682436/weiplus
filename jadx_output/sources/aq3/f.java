package aq3;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f13171a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13172b;

    /* renamed from: c, reason: collision with root package name */
    public long f13173c;

    /* renamed from: d, reason: collision with root package name */
    public ku5.q f13174d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f13175e;

    public f(long j17, long j18, long j19, ku5.q state, java.lang.String str) {
        kotlin.jvm.internal.o.g(state, "state");
        this.f13171a = j17;
        this.f13172b = j18;
        this.f13173c = j19;
        this.f13174d = state;
        this.f13175e = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq3.f)) {
            return false;
        }
        aq3.f fVar = (aq3.f) obj;
        return this.f13171a == fVar.f13171a && this.f13172b == fVar.f13172b && this.f13173c == fVar.f13173c && this.f13174d == fVar.f13174d && kotlin.jvm.internal.o.b(this.f13175e, fVar.f13175e);
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Long.hashCode(this.f13171a) * 31) + java.lang.Long.hashCode(this.f13172b)) * 31) + java.lang.Long.hashCode(this.f13173c)) * 31) + this.f13174d.hashCode()) * 31;
        java.lang.String str = this.f13175e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "TaskStatusInfo(startTime=" + this.f13171a + ", delayTime=" + this.f13172b + ", runningTime=" + this.f13173c + ", state=" + this.f13174d + ", pool=" + this.f13175e + ')';
    }
}
