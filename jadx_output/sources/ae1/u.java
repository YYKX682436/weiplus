package ae1;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final jc1.d f3411a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f3412b;

    public u(jc1.d errors, java.util.Map resultPack) {
        kotlin.jvm.internal.o.g(errors, "errors");
        kotlin.jvm.internal.o.g(resultPack, "resultPack");
        this.f3411a = errors;
        this.f3412b = resultPack;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae1.u)) {
            return false;
        }
        ae1.u uVar = (ae1.u) obj;
        return kotlin.jvm.internal.o.b(this.f3411a, uVar.f3411a) && kotlin.jvm.internal.o.b(this.f3412b, uVar.f3412b);
    }

    public int hashCode() {
        return (this.f3411a.hashCode() * 31) + this.f3412b.hashCode();
    }

    public java.lang.String toString() {
        return "SmCryptoOperateResult(errors=" + this.f3411a + ", resultPack=" + this.f3412b + ')';
    }

    public /* synthetic */ u(jc1.d dVar, java.util.Map map, int i17, kotlin.jvm.internal.i iVar) {
        this(dVar, (i17 & 2) != 0 ? kz5.q0.f314001d : map);
    }
}
