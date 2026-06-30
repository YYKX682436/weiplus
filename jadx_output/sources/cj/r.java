package cj;

/* loaded from: classes12.dex */
public class r extends cj.c {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f41842e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f41843f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.matrix.resource.watcher.f watcher) {
        super(watcher);
        kotlin.jvm.internal.o.g(watcher, "watcher");
        this.f41842e = jz5.h.b(cj.n.f41838d);
        this.f41843f = jz5.h.b(new cj.m(this));
        jz5.g b17 = jz5.h.b(new cj.q(this, watcher));
        android.content.Context context = watcher.f395858d;
        if (oj.m.c(context)) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            try {
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                if (android.os.Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 34) {
                    context.registerReceiver((com.tencent.matrix.resource.processor.NativeLazyForkAnalyzeProcessor$receiver$2$1) ((jz5.n) b17).getValue(), intentFilter);
                } else {
                    context.registerReceiver((com.tencent.matrix.resource.processor.NativeLazyForkAnalyzeProcessor$receiver$2$1) ((jz5.n) b17).getValue(), intentFilter, 4);
                }
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.LeakProcessor.NativeLazyForkAnalyze", th6, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // cj.c
    public boolean b(com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo destroyedActivityInfo) {
        java.io.File file;
        kotlin.jvm.internal.o.g(destroyedActivityInfo, "destroyedActivityInfo");
        c(0, wi.b.NO_DUMP, destroyedActivityInfo.mActivityName, destroyedActivityInfo.mKey, "no dump", "0");
        try {
            xi.k kVar = xi.k.f454661e;
            java.lang.String str = destroyedActivityInfo.mKey;
            kotlin.jvm.internal.o.f(str, "destroyedActivityInfo.mKey");
            file = kVar.e("NFLAP", str, true);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.LeakProcessor.NativeLazyForkAnalyze", th6, "", new java.lang.Object[0]);
            file = null;
        }
        if (file == null) {
            c(0, wi.b.FORK_ANALYSE, destroyedActivityInfo.mActivityName, "[unknown]", "Failed to create hprof file.", "0");
            return true;
        }
        oj.j.c("Matrix.LeakProcessor.NativeLazyForkAnalyze", "fork dump", new java.lang.Object[0]);
        java.lang.String absolutePath = file.getAbsolutePath();
        kotlin.jvm.internal.o.f(absolutePath, "hprof.absolutePath");
        oj.j.c("Matrix.LeakProcessor.NativeLazyForkAnalyze", "fork dump result = " + com.tencent.matrix.resource.MemoryUtil.h(absolutePath, 600L), new java.lang.Object[0]);
        return true;
    }

    public void f(ti.a result, java.lang.String activityName, java.lang.String key, int i17, java.io.File file) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(activityName, "activityName");
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.String aVar = result.toString();
        d(0, wi.b.LAZY_FORK_ANALYZE, activityName, key, aVar, java.lang.String.valueOf(result.f419488g), i17);
        oj.j.c("Matrix.LeakProcessor.NativeLazyForkAnalyze", "leak found: " + aVar, new java.lang.Object[0]);
    }
}
