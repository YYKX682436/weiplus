package cj;

/* loaded from: classes12.dex */
public class r extends cj.c {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f123375e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f123376f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f watcher) {
        super(watcher);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(watcher, "watcher");
        this.f123375e = jz5.h.b(cj.n.f123371d);
        this.f123376f = jz5.h.b(new cj.m(this));
        jz5.g b17 = jz5.h.b(new cj.q(this, watcher));
        android.content.Context context = watcher.f477391d;
        if (oj.m.c(context)) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            try {
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                if (android.os.Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 34) {
                    context.registerReceiver((com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p583xbebf4c92.C4708xf23df29b) ((jz5.n) b17).mo141623x754a37bb(), intentFilter);
                } else {
                    context.registerReceiver((com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p583xbebf4c92.C4708xf23df29b) ((jz5.n) b17).mo141623x754a37bb(), intentFilter, 4);
                }
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.LeakProcessor.NativeLazyForkAnalyze", th6, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // cj.c
    public boolean b(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p581xc2f04ca6.p582x633fb29.C4706x164388f6 destroyedActivityInfo) {
        java.io.File file;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destroyedActivityInfo, "destroyedActivityInfo");
        c(0, wi.b.NO_DUMP, destroyedActivityInfo.f20017xf8a7db47, destroyedActivityInfo.f20020x32b2b2, "no dump", "0");
        try {
            xi.k kVar = xi.k.f536194e;
            java.lang.String str = destroyedActivityInfo.f20020x32b2b2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "destroyedActivityInfo.mKey");
            file = kVar.e("NFLAP", str, true);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.LeakProcessor.NativeLazyForkAnalyze", th6, "", new java.lang.Object[0]);
            file = null;
        }
        if (file == null) {
            c(0, wi.b.FORK_ANALYSE, destroyedActivityInfo.f20017xf8a7db47, "[unknown]", "Failed to create hprof file.", "0");
            return true;
        }
        oj.j.c("Matrix.LeakProcessor.NativeLazyForkAnalyze", "fork dump", new java.lang.Object[0]);
        java.lang.String absolutePath = file.getAbsolutePath();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(absolutePath, "hprof.absolutePath");
        oj.j.c("Matrix.LeakProcessor.NativeLazyForkAnalyze", "fork dump result = " + com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3.h(absolutePath, 600L), new java.lang.Object[0]);
        return true;
    }

    public void f(ti.a result, java.lang.String activityName, java.lang.String key, int i17, java.io.File file) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityName, "activityName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.String m166611x9616526c = result.m166611x9616526c();
        d(0, wi.b.LAZY_FORK_ANALYZE, activityName, key, m166611x9616526c, java.lang.String.valueOf(result.f501021g), i17);
        oj.j.c("Matrix.LeakProcessor.NativeLazyForkAnalyze", "leak found: " + m166611x9616526c, new java.lang.Object[0]);
    }
}
