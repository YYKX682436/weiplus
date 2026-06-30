package cj;

/* loaded from: classes12.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.resource.watcher.f f41831d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.matrix.resource.watcher.f fVar) {
        super(0);
        this.f41831d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            android.content.Context context = this.f41831d.f395858d;
            kotlin.jvm.internal.o.f(context, "watcher.context");
            java.io.File file = new java.io.File(context.getCacheDir(), "matrix_res_process_retry");
            if (!file.isDirectory()) {
                cj.l.a(file);
                file.mkdirs();
            }
            return new cj.z(file);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.LeakProcessor.NativeForkAnalyze", th6, "Failed to initialize retry repository", new java.lang.Object[0]);
            return null;
        }
    }
}
