package qp1;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f447247a;

    /* renamed from: b, reason: collision with root package name */
    public final wu5.c f447248b;

    public d(long j17, wu5.c futureTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(futureTask, "futureTask");
        this.f447247a = j17;
        this.f447248b = futureTask;
    }

    /* renamed from: equals */
    public boolean m160675xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp1.d)) {
            return false;
        }
        qp1.d dVar = (qp1.d) obj;
        return this.f447247a == dVar.f447247a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447248b, dVar.f447248b);
    }

    /* renamed from: hashCode */
    public int m160676x8cdac1b() {
        return (java.lang.Long.hashCode(this.f447247a) * 31) + this.f447248b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m160677x9616526c() {
        return "DelayAutoCollapseTask(taskId=" + this.f447247a + ", futureTask=" + this.f447248b + ')';
    }
}
