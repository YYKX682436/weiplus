package az0;

/* loaded from: classes5.dex */
public final class fc implements com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u26.r0 f15479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15480b;

    public fc(u26.r0 r0Var, java.lang.String str) {
        this.f15479a = r0Var;
        this.f15480b = str;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress
    public final void onTaskProgress(float f17, com.tencent.maas.instamovie.MJTaskTrace mJTaskTrace) {
        if (((u26.x) this.f15479a).e(java.lang.Float.valueOf(f17)) instanceof u26.b0) {
            com.tencent.mars.xlog.Log.e("MaasFuncUtils", this.f15480b + " try send error " + f17);
        }
    }
}
