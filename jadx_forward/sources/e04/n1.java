package e04;

/* loaded from: classes5.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f327562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu5.c f327563e;

    public n1(java.lang.Runnable runnable, wu5.c cVar) {
        this.f327562d = runnable;
        this.f327563e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object valueOf;
        java.lang.Runnable runnable = this.f327562d;
        if (runnable instanceof st5.c) {
            valueOf = "open_" + ((st5.c) runnable).hashCode();
        } else if (runnable instanceof st5.a) {
            valueOf = "preview_" + ((st5.a) runnable).hashCode();
        } else {
            valueOf = java.lang.Integer.valueOf(runnable.hashCode());
        }
        java.util.HashMap hashMap = e04.t1.f327636k;
        java.lang.String obj = valueOf.toString();
        wu5.c futureTask = this.f327563e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(futureTask, "$futureTask");
        hashMap.put(obj, new e04.s1(futureTask, runnable));
    }
}
