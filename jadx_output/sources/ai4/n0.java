package ai4;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5176a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f5177b;

    public n0(int i17, java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f5176a = i17;
        this.f5177b = userName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai4.n0)) {
            return false;
        }
        ai4.n0 n0Var = (ai4.n0) obj;
        return this.f5176a == n0Var.f5176a && kotlin.jvm.internal.o.b(this.f5177b, n0Var.f5177b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f5176a) * 31) + this.f5177b.hashCode();
    }

    public java.lang.String toString() {
        return "UnReadNotifyInfo(createTime=" + this.f5176a + ", userName=" + this.f5177b + ')';
    }
}
