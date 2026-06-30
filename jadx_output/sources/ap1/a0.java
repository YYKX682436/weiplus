package ap1;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f12600a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12601b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12602c;

    public a0(java.lang.String username, long j17, long j18) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f12600a = username;
        this.f12601b = j17;
        this.f12602c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1.a0)) {
            return false;
        }
        ap1.a0 a0Var = (ap1.a0) obj;
        return kotlin.jvm.internal.o.b(this.f12600a, a0Var.f12600a) && this.f12601b == a0Var.f12601b && this.f12602c == a0Var.f12602c;
    }

    public int hashCode() {
        return (((this.f12600a.hashCode() * 31) + java.lang.Long.hashCode(this.f12601b)) * 31) + java.lang.Long.hashCode(this.f12602c);
    }

    public java.lang.String toString() {
        return "ContactInfo(username=" + this.f12600a + ", lastMsgTime=" + this.f12601b + ", size=" + this.f12602c + ')';
    }
}
