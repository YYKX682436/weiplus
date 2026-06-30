package af;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f4442a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f4443b = new java.util.LinkedList();

    public final void a(af.b preFetchLaunchTask) {
        kotlin.jvm.internal.o.g(preFetchLaunchTask, "preFetchLaunchTask");
        this.f4442a.put(java.lang.Integer.valueOf(preFetchLaunchTask.b()), preFetchLaunchTask);
        preFetchLaunchTask.f4437a = new java.util.concurrent.FutureTask(new af.a(preFetchLaunchTask));
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.util.concurrent.FutureTask futureTask = preFetchLaunchTask.f4437a;
        if (futureTask != null) {
            ((ku5.t0) u0Var).g(futureTask);
        } else {
            kotlin.jvm.internal.o.o("futureTask");
            throw null;
        }
    }
}
