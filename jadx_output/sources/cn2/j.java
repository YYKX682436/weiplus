package cn2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f43541a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43542b;

    /* renamed from: c, reason: collision with root package name */
    public long f43543c;

    /* renamed from: d, reason: collision with root package name */
    public final long f43544d;

    public j(long j17, int i17, long j18, long j19, int i18, kotlin.jvm.internal.i iVar) {
        j17 = (i18 & 1) != 0 ? 500L : j17;
        i17 = (i18 & 2) != 0 ? -500 : i17;
        j18 = (i18 & 4) != 0 ? 2000L : j18;
        j19 = (i18 & 8) != 0 ? 500L : j19;
        this.f43541a = j17;
        this.f43542b = i17;
        this.f43543c = j18;
        this.f43544d = j19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn2.j)) {
            return false;
        }
        cn2.j jVar = (cn2.j) obj;
        return this.f43541a == jVar.f43541a && this.f43542b == jVar.f43542b && this.f43543c == jVar.f43543c && this.f43544d == jVar.f43544d;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f43541a) * 31) + java.lang.Integer.hashCode(this.f43542b)) * 31) + java.lang.Long.hashCode(this.f43543c)) * 31) + java.lang.Long.hashCode(this.f43544d);
    }

    public java.lang.String toString() {
        return "NormalAnimParams(startDuration=" + this.f43541a + ", startFromTranslationX=" + this.f43542b + ", beforeNextCheckDuration=" + this.f43543c + ", alphaOutDuration=" + this.f43544d + ')';
    }
}
