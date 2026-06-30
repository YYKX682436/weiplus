package ai4;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5131a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f5132b;

    public c0(int i17, java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f5131a = i17;
        this.f5132b = userName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai4.c0)) {
            return false;
        }
        ai4.c0 c0Var = (ai4.c0) obj;
        return this.f5131a == c0Var.f5131a && kotlin.jvm.internal.o.b(this.f5132b, c0Var.f5132b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f5131a) * 31) + this.f5132b.hashCode();
    }

    public java.lang.String toString() {
        return "UnReadNotifyInfo(createTime=" + this.f5131a + ", userName=" + this.f5132b + ')';
    }
}
