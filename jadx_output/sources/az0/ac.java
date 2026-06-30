package az0;

/* loaded from: classes5.dex */
public final class ac implements com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u26.r0 f15333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15334b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15335c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f15336d;

    public ac(u26.r0 r0Var, java.lang.String str, boolean z17, kotlinx.coroutines.q qVar) {
        this.f15333a = r0Var;
        this.f15334b = str;
        this.f15335c = z17;
        this.f15336d = qVar;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress
    public final void onTaskProgress(float f17, com.tencent.maas.instamovie.MJTaskTrace mJTaskTrace) {
        java.lang.Object e17 = ((u26.x) this.f15333a).e(java.lang.Float.valueOf(f17));
        if (e17 instanceof u26.b0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str = this.f15334b;
            sb6.append(str);
            sb6.append(" try send error ");
            sb6.append(f17);
            sb6.append(", ");
            sb6.append(u26.c0.a(e17));
            com.tencent.mars.xlog.Log.e("MaasFuncUtils", sb6.toString());
            if (this.f15335c && (u26.c0.a(e17) instanceof java.util.concurrent.CancellationException)) {
                com.tencent.mars.xlog.Log.w("MaasFuncUtils", str + " handleCancelExceptionOnProgress");
                kotlinx.coroutines.p.a(this.f15336d, null, 1, null);
            }
        }
    }
}
