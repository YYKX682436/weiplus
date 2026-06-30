package aq3;

/* loaded from: classes12.dex */
public final class i implements ku5.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13177a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f13178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aq3.l f13179c;

    public i(aq3.l lVar) {
        this.f13179c = lVar;
        boolean l17 = j62.e.g().l("clicfg_threadpool_hook_looper_enable", true, true, true);
        com.tencent.mars.xlog.Log.w("ThreadPool.Profiler", "[isHookResetLooper] " + l17);
        this.f13177a = l17;
        this.f13178b = new java.util.concurrent.ConcurrentHashMap();
    }

    @Override // ku5.t
    public void a(java.lang.Thread thread, java.lang.String task) {
        kotlin.jvm.internal.o.g(thread, "thread");
        kotlin.jvm.internal.o.g(task, "task");
        if (this.f13179c.f13185g) {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[0-9]\\d*");
            kotlin.jvm.internal.o.f(compile, "compile(...)");
            java.lang.String replaceAll = compile.matcher(task).replaceAll("?");
            kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f13178b;
            if (concurrentHashMap.contains(replaceAll)) {
                return;
            }
            java.lang.String str = "task=" + replaceAll + ' ' + thread;
            com.tencent.mars.xlog.Log.w("ThreadPool.Profiler", "[onLooperPreparedAtTask] " + str);
            jx3.f fVar = jx3.f.INSTANCE;
            aq3.e[] eVarArr = aq3.e.f13170d;
            fVar.d(18762, 16, str, task, 17, bm5.f1.a());
            concurrentHashMap.put(replaceAll, java.lang.String.valueOf(thread));
        }
    }

    @Override // ku5.t
    public boolean b() {
        return this.f13177a;
    }

    @Override // ku5.t
    public boolean c() {
        return false;
    }

    @Override // ku5.t
    public boolean d() {
        return true;
    }
}
