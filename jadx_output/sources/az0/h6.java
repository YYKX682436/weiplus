package az0;

/* loaded from: classes5.dex */
public final class h6 implements com.tencent.maas.instamovie.MJMovieSession.OnRecommendComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f15529a;

    public h6(kotlinx.coroutines.q qVar) {
        this.f15529a = qVar;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnRecommendComplete
    public final void onRecommendComplete(com.tencent.maas.model.MJTemplateRecommendResult mJTemplateRecommendResult, com.tencent.maas.instamovie.base.MJError mJError) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recommendNext: onRecommend result, err:");
        sb6.append(mJError != null ? mJError.message : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", sb6.toString());
        kotlinx.coroutines.q qVar = this.f15529a;
        if (mJError == null) {
            ((kotlinx.coroutines.r) qVar).s(mJTemplateRecommendResult, null);
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("recommend error"))));
        }
    }
}
