package a2;

/* loaded from: classes14.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f803a;

    /* renamed from: b, reason: collision with root package name */
    public final long f804b;

    public r(long j17, long j18, int i17, kotlin.jvm.internal.i iVar) {
        this.f803a = j17;
        this.f804b = j18;
        if (!(!p2.u.c(j17))) {
            throw new java.lang.IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
        }
        if (!(!p2.u.c(j18))) {
            throw new java.lang.IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.r)) {
            return false;
        }
        a2.r rVar = (a2.r) obj;
        return p2.t.a(this.f803a, rVar.f803a) && p2.t.a(this.f804b, rVar.f804b);
    }

    public int hashCode() {
        p2.v[] vVarArr = p2.t.f351400b;
        return (((java.lang.Long.hashCode(this.f803a) * 31) + java.lang.Long.hashCode(this.f804b)) * 31) + java.lang.Integer.hashCode(4);
    }

    public java.lang.String toString() {
        return "Placeholder(width=" + ((java.lang.Object) p2.t.d(this.f803a)) + ", height=" + ((java.lang.Object) p2.t.d(this.f804b)) + ", placeholderVerticalAlign=" + ((java.lang.Object) "Center") + ')';
    }
}
