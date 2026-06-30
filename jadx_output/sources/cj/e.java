package cj;

/* loaded from: classes12.dex */
public final class e extends cj.r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.matrix.resource.watcher.f watcher) {
        super(watcher);
        kotlin.jvm.internal.o.g(watcher, "watcher");
    }

    @Override // cj.r
    public void f(ti.a result, java.lang.String activityName, java.lang.String key, int i17, java.io.File file) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(activityName, "activityName");
        kotlin.jvm.internal.o.g(key, "key");
        wi.b bVar = wi.b.MANUAL_DUMP;
        java.lang.String aVar = result.toString();
        java.lang.String valueOf = java.lang.String.valueOf(result.f419488g);
        kotlin.jvm.internal.o.d(file);
        e(0, bVar, activityName, key, aVar, valueOf, 0, file.getAbsolutePath());
        oj.j.c("Matrix.LeakProcessor.ManualDumpLazy", "leak found: " + result, new java.lang.Object[0]);
    }
}
