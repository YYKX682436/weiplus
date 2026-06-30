package co5;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f43842a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f43843b;

    /* renamed from: c, reason: collision with root package name */
    public final long f43844c;

    public j(java.lang.String username, boolean z17, long j17) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f43842a = username;
        this.f43843b = z17;
        this.f43844c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co5.j)) {
            return false;
        }
        co5.j jVar = (co5.j) obj;
        return kotlin.jvm.internal.o.b(this.f43842a, jVar.f43842a) && this.f43843b == jVar.f43843b && this.f43844c == jVar.f43844c;
    }

    public int hashCode() {
        return (((this.f43842a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f43843b)) * 31) + java.lang.Long.hashCode(this.f43844c);
    }

    public java.lang.String toString() {
        return "UserSdkInfo(username=" + this.f43842a + ", isILinkMode=" + this.f43843b + ", valuedTime=" + this.f43844c + ')';
    }
}
