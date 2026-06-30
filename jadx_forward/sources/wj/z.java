package wj;

/* loaded from: classes12.dex */
public final class z implements java.util.function.BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wj.a0 f528086a;

    public z(wj.a0 a0Var) {
        this.f528086a = a0Var;
    }

    @Override // java.util.function.BiFunction
    public java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Set jobs = (java.util.Set) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((wj.t0) obj, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jobs, "jobs");
        jobs.remove(this.f528086a);
        if (jobs.isEmpty()) {
            return null;
        }
        return jobs;
    }
}
