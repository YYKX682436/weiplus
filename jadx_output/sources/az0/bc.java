package az0;

/* loaded from: classes5.dex */
public final class bc implements com.tencent.maas.instamovie.MJMovieSession.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f15369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15371c;

    public bc(kotlinx.coroutines.q qVar, java.lang.String str, long j17) {
        this.f15369a = qVar;
        this.f15370b = str;
        this.f15371c = j17;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnComplete
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        kotlinx.coroutines.q qVar = this.f15369a;
        if (!((kotlinx.coroutines.r) qVar).n()) {
            com.tencent.mars.xlog.Log.e("MaasFuncUtils", this.f15370b + " already resumed");
            return;
        }
        long j17 = this.f15371c;
        bz0.b bVar = bz0.b.f36724a;
        if (mJError != null) {
            bz0.b.b(bVar, this.f15370b, mJError, java.lang.System.currentTimeMillis() - j17, 0, 8, null);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new az0.p7(mJError))));
        } else {
            ((kotlinx.coroutines.r) qVar).s(jz5.f0.f302826a, null);
            bz0.b.d(bVar, this.f15370b, java.lang.System.currentTimeMillis() - j17, 0, 4, null);
        }
    }
}
