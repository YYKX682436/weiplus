package c00;

/* loaded from: classes9.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f36967a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f36968b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36969c;

    public e4(java.lang.String str, java.lang.String str2, int i17) {
        this.f36967a = str;
        this.f36968b = str2;
        this.f36969c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c00.e4)) {
            return false;
        }
        c00.e4 e4Var = (c00.e4) obj;
        return kotlin.jvm.internal.o.b(this.f36967a, e4Var.f36967a) && kotlin.jvm.internal.o.b(this.f36968b, e4Var.f36968b) && this.f36969c == e4Var.f36969c;
    }

    public int hashCode() {
        java.lang.String str = this.f36967a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f36968b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f36969c);
    }

    public java.lang.String toString() {
        return "EcsUserInfo(displayNickname=" + this.f36967a + ", remoteAvatarUrl=" + this.f36968b + ", sex=" + this.f36969c + ')';
    }
}
