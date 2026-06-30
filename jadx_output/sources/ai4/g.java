package ai4;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5143a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f5144b;

    public g(java.lang.String statusId, java.lang.String userName) {
        kotlin.jvm.internal.o.g(statusId, "statusId");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f5143a = statusId;
        this.f5144b = userName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai4.g)) {
            return false;
        }
        ai4.g gVar = (ai4.g) obj;
        return kotlin.jvm.internal.o.b(this.f5143a, gVar.f5143a) && kotlin.jvm.internal.o.b(this.f5144b, gVar.f5144b);
    }

    public int hashCode() {
        return (this.f5143a.hashCode() * 31) + this.f5144b.hashCode();
    }

    public java.lang.String toString() {
        return "DeleteFingerprint(statusId=" + this.f5143a + ", userName=" + this.f5144b + ')';
    }
}
