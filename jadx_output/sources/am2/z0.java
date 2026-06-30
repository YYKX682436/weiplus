package am2;

/* loaded from: classes3.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f8779a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f8780b;

    public z0(java.lang.String giftId, java.lang.String name) {
        kotlin.jvm.internal.o.g(giftId, "giftId");
        kotlin.jvm.internal.o.g(name, "name");
        this.f8779a = giftId;
        this.f8780b = name;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am2.z0)) {
            return false;
        }
        am2.z0 z0Var = (am2.z0) obj;
        return kotlin.jvm.internal.o.b(this.f8779a, z0Var.f8779a) && kotlin.jvm.internal.o.b(this.f8780b, z0Var.f8780b);
    }

    public int hashCode() {
        return (this.f8779a.hashCode() * 31) + this.f8780b.hashCode();
    }

    public java.lang.String toString() {
        return "GiftInfo(giftId=" + this.f8779a + ", name=" + this.f8780b + ')';
    }
}
