package aq3;

/* loaded from: classes12.dex */
public final class i implements ku5.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f94710a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f94711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aq3.l f94712c;

    public i(aq3.l lVar) {
        this.f94712c = lVar;
        boolean l17 = j62.e.g().l("clicfg_threadpool_hook_looper_enable", true, true, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ThreadPool.Profiler", "[isHookResetLooper] " + l17);
        this.f94710a = l17;
        this.f94711b = new java.util.concurrent.ConcurrentHashMap();
    }

    @Override // ku5.t
    public void a(java.lang.Thread thread, java.lang.String task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thread, "thread");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (this.f94712c.f94718g) {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[0-9]\\d*");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
            java.lang.String replaceAll = compile.matcher(task).replaceAll("?");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f94711b;
            if (concurrentHashMap.contains(replaceAll)) {
                return;
            }
            java.lang.String str = "task=" + replaceAll + ' ' + thread;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ThreadPool.Profiler", "[onLooperPreparedAtTask] " + str);
            jx3.f fVar = jx3.f.INSTANCE;
            aq3.e[] eVarArr = aq3.e.f94703d;
            fVar.d(18762, 16, str, task, 17, bm5.f1.a());
            concurrentHashMap.put(replaceAll, java.lang.String.valueOf(thread));
        }
    }

    @Override // ku5.t
    public boolean b() {
        return this.f94710a;
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
