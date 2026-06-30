package cj;

/* loaded from: classes12.dex */
public class x extends cj.c {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f41849e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f41850f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.matrix.resource.watcher.f watcher) {
        super(watcher);
        kotlin.jvm.internal.o.g(watcher, "watcher");
        this.f41849e = jz5.h.b(cj.t.f41845d);
        this.f41850f = jz5.h.b(new cj.s(this));
        jz5.g b17 = jz5.h.b(new cj.w(this, watcher));
        android.content.Context context = watcher.f395858d;
        if (oj.m.c(context)) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            try {
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                if (android.os.Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 34) {
                    context.registerReceiver((com.tencent.matrix.resource.processor.NativeLazyForkAnalyzeProcessorV2$receiver$2$1) ((jz5.n) b17).getValue(), intentFilter);
                } else {
                    context.registerReceiver((com.tencent.matrix.resource.processor.NativeLazyForkAnalyzeProcessorV2$receiver$2$1) ((jz5.n) b17).getValue(), intentFilter, 4);
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
        com.tencent.matrix.resource.watcher.f watcher = this.f41825a;
        watcher.d();
        if (destroyedActivityInfo.mActivityRef.get() == null) {
            oj.j.c("Matrix.LeakProcessor.NativeLazyForkAnalyze", "last check: finally recycled... skip processing", new java.lang.Object[0]);
            return true;
        }
        c(0, wi.b.NO_DUMP, destroyedActivityInfo.mActivityName, destroyedActivityInfo.mKey, "no dump", "0");
        try {
            kotlin.jvm.internal.o.f(watcher, "watcher");
            com.tencent.matrix.resource.x xVar = watcher.f52980e;
            kotlin.jvm.internal.o.f(xVar, "watcher.resourcePlugin");
            wi.c cVar = xVar.f53000h;
            kotlin.jvm.internal.o.f(cVar, "watcher.resourcePlugin.config");
            int i17 = cVar.f446130f;
            xi.k kVar = xi.k.f454661e;
            java.lang.String str = "NFLAP-" + i17;
            java.lang.String str2 = destroyedActivityInfo.mKey;
            kotlin.jvm.internal.o.f(str2, "destroyedActivityInfo.mKey");
            file = kVar.e(str, str2, true);
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
}
