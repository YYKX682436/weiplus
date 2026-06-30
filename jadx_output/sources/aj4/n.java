package aj4;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f5339a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5340b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f5341c;

    public n(java.util.List items, long j17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f5339a = items;
        this.f5340b = j17;
        this.f5341c = errMsg;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj4.n)) {
            return false;
        }
        aj4.n nVar = (aj4.n) obj;
        return kotlin.jvm.internal.o.b(this.f5339a, nVar.f5339a) && this.f5340b == nVar.f5340b && kotlin.jvm.internal.o.b(this.f5341c, nVar.f5341c);
    }

    public int hashCode() {
        return (((this.f5339a.hashCode() * 31) + java.lang.Long.hashCode(this.f5340b)) * 31) + this.f5341c.hashCode();
    }

    public java.lang.String toString() {
        return "Result(items=" + this.f5339a + ", errCode=" + this.f5340b + ", errMsg=" + this.f5341c + ')';
    }

    public /* synthetic */ n(java.util.List list, long j17, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(list, (i17 & 2) != 0 ? 0L : j17, (i17 & 4) != 0 ? "" : str);
    }
}
