package rp1;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f480018a;

    /* renamed from: b, reason: collision with root package name */
    public final wu5.c f480019b;

    public n0(long j17, wu5.c futureTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(futureTask, "futureTask");
        this.f480018a = j17;
        this.f480019b = futureTask;
    }

    /* renamed from: equals */
    public boolean m162836xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp1.n0)) {
            return false;
        }
        rp1.n0 n0Var = (rp1.n0) obj;
        return this.f480018a == n0Var.f480018a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f480019b, n0Var.f480019b);
    }

    /* renamed from: hashCode */
    public int m162837x8cdac1b() {
        return (java.lang.Long.hashCode(this.f480018a) * 31) + this.f480019b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m162838x9616526c() {
        return "CheckIdleStateTask(taskId=" + this.f480018a + ", futureTask=" + this.f480019b + ')';
    }
}
