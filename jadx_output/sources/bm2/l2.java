package bm2;

/* loaded from: classes3.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ty1 f22063a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22064b;

    public l2(r45.ty1 item, boolean z17) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f22063a = item;
        this.f22064b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.l2)) {
            return false;
        }
        bm2.l2 l2Var = (bm2.l2) obj;
        return kotlin.jvm.internal.o.b(this.f22063a, l2Var.f22063a) && this.f22064b == l2Var.f22064b;
    }

    public int hashCode() {
        return (this.f22063a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f22064b);
    }

    public java.lang.String toString() {
        return "selectItem(item=" + this.f22063a + ", isCheck=" + this.f22064b + ')';
    }
}
