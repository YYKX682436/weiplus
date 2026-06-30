package bg2;

/* loaded from: classes2.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.t12 f20296a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20297b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20298c;

    public m1(r45.t12 msg, long j17, int i17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f20296a = msg;
        this.f20297b = j17;
        this.f20298c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg2.m1)) {
            return false;
        }
        bg2.m1 m1Var = (bg2.m1) obj;
        return kotlin.jvm.internal.o.b(this.f20296a, m1Var.f20296a) && this.f20297b == m1Var.f20297b && this.f20298c == m1Var.f20298c;
    }

    public int hashCode() {
        return (((this.f20296a.hashCode() * 31) + java.lang.Long.hashCode(this.f20297b)) * 31) + java.lang.Integer.hashCode(this.f20298c);
    }

    public java.lang.String toString() {
        return "FinderLiveMsgWrapper(msg=" + this.f20296a + ", time=" + this.f20297b + ", length=" + this.f20298c + ')';
    }
}
