package af;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f85975a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f85976b = new java.util.LinkedList();

    public final void a(af.b preFetchLaunchTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preFetchLaunchTask, "preFetchLaunchTask");
        this.f85975a.put(java.lang.Integer.valueOf(preFetchLaunchTask.b()), preFetchLaunchTask);
        preFetchLaunchTask.f85970a = new java.util.concurrent.FutureTask(new af.a(preFetchLaunchTask));
        ku5.u0 u0Var = ku5.t0.f394148d;
        java.util.concurrent.FutureTask futureTask = preFetchLaunchTask.f85970a;
        if (futureTask != null) {
            ((ku5.t0) u0Var).g(futureTask);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("futureTask");
            throw null;
        }
    }
}
