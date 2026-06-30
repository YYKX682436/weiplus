package c00;

/* loaded from: classes9.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f36992a;

    /* renamed from: b, reason: collision with root package name */
    public final c00.e4 f36993b;

    public j3(java.lang.String talkerUsername, c00.e4 talkerUserInfo) {
        kotlin.jvm.internal.o.g(talkerUsername, "talkerUsername");
        kotlin.jvm.internal.o.g(talkerUserInfo, "talkerUserInfo");
        this.f36992a = talkerUsername;
        this.f36993b = talkerUserInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c00.j3)) {
            return false;
        }
        c00.j3 j3Var = (c00.j3) obj;
        return kotlin.jvm.internal.o.b(this.f36992a, j3Var.f36992a) && kotlin.jvm.internal.o.b(this.f36993b, j3Var.f36993b);
    }

    public int hashCode() {
        return (this.f36992a.hashCode() * 31) + this.f36993b.hashCode();
    }

    public java.lang.String toString() {
        return "GiftSender(talkerUsername=" + this.f36992a + ", talkerUserInfo=" + this.f36993b + ')';
    }
}
