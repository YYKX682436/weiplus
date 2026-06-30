package cj;

/* loaded from: classes12.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f f123364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f fVar) {
        super(0);
        this.f123364d = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        try {
            android.content.Context context = this.f123364d.f477391d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "watcher.context");
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
