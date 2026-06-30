package e04;

/* loaded from: classes5.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final wu5.c f327618a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Runnable f327619b;

    public s1(wu5.c task, java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        this.f327618a = task;
        this.f327619b = runnable;
    }

    /* renamed from: equals */
    public boolean m126592xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e04.s1)) {
            return false;
        }
        e04.s1 s1Var = (e04.s1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f327618a, s1Var.f327618a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f327619b, s1Var.f327619b);
    }

    /* renamed from: hashCode */
    public int m126593x8cdac1b() {
        return (this.f327618a.hashCode() * 31) + this.f327619b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m126594x9616526c() {
        return "ScanCameraFutureTask(task=" + this.f327618a + ", runnable=" + this.f327619b + ')';
    }
}
