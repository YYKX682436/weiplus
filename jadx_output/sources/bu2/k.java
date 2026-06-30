package bu2;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f24538a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24539b;

    public k(long j17, long j18) {
        this.f24538a = j17;
        this.f24539b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu2.k)) {
            return false;
        }
        bu2.k kVar = (bu2.k) obj;
        return this.f24538a == kVar.f24538a && this.f24539b == kVar.f24539b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f24538a) * 31) + java.lang.Long.hashCode(this.f24539b);
    }

    public java.lang.String toString() {
        return "CacheKey(feedId=" + this.f24538a + ", refCommentId=" + this.f24539b + ')';
    }
}
