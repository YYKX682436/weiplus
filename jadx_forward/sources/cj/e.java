package cj;

/* loaded from: classes12.dex */
public final class e extends cj.r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f watcher) {
        super(watcher);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(watcher, "watcher");
    }

    @Override // cj.r
    public void f(ti.a result, java.lang.String activityName, java.lang.String key, int i17, java.io.File file) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityName, "activityName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        wi.b bVar = wi.b.MANUAL_DUMP;
        java.lang.String m166611x9616526c = result.m166611x9616526c();
        java.lang.String valueOf = java.lang.String.valueOf(result.f501021g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(file);
        e(0, bVar, activityName, key, m166611x9616526c, valueOf, 0, file.getAbsolutePath());
        oj.j.c("Matrix.LeakProcessor.ManualDumpLazy", "leak found: " + result, new java.lang.Object[0]);
    }
}
