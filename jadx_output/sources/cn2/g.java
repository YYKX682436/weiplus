package cn2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f43516a;

    /* renamed from: b, reason: collision with root package name */
    public final long f43517b;

    /* renamed from: c, reason: collision with root package name */
    public final long f43518c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f43519d;

    public g(long j17, long j18, long j19, java.lang.Object obj, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 1) != 0 ? 200L : j17;
        j18 = (i17 & 2) != 0 ? 0L : j18;
        j19 = (i17 & 4) != 0 ? 5000L : j19;
        obj = (i17 & 8) != 0 ? null : obj;
        this.f43516a = j17;
        this.f43517b = j18;
        this.f43518c = j19;
        this.f43519d = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn2.g)) {
            return false;
        }
        cn2.g gVar = (cn2.g) obj;
        return this.f43516a == gVar.f43516a && this.f43517b == gVar.f43517b && this.f43518c == gVar.f43518c && kotlin.jvm.internal.o.b(this.f43519d, gVar.f43519d);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Long.hashCode(this.f43516a) * 31) + java.lang.Long.hashCode(this.f43517b)) * 31) + java.lang.Long.hashCode(this.f43518c)) * 31;
        java.lang.Object obj = this.f43519d;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public java.lang.String toString() {
        return "FloatCoverConfig(floatCoverTranslationDuration=" + this.f43516a + ", floatCoverTranslationDelay=" + this.f43517b + ", floatCoverDuration=" + this.f43518c + ", replaceImg=" + this.f43519d + ')';
    }
}
