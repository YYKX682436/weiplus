package a2;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final a2.t f812a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.s f813b;

    public u(a2.t tVar, a2.s sVar) {
        this.f812a = tVar;
        this.f813b = sVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.u)) {
            return false;
        }
        a2.u uVar = (a2.u) obj;
        return kotlin.jvm.internal.o.b(this.f813b, uVar.f813b) && kotlin.jvm.internal.o.b(this.f812a, uVar.f812a);
    }

    public int hashCode() {
        a2.t tVar = this.f812a;
        int hashCode = (tVar != null ? tVar.hashCode() : 0) * 31;
        a2.s sVar = this.f813b;
        return hashCode + (sVar != null ? sVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f812a + ", paragraphSyle=" + this.f813b + ')';
    }
}
