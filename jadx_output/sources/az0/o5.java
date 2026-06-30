package az0;

/* loaded from: classes5.dex */
public final class o5 implements com.tencent.maas.instamovie.MJMovieSession.OnTemplateBuildComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f15772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJMovieSession.OnComplete f15773b;

    public o5(yz5.p pVar, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        this.f15772a = pVar;
        this.f15773b = onComplete;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnTemplateBuildComplete
    public final void onTemplateBuildComplete(com.tencent.maas.model.MJTemplateBuildResult mJTemplateBuildResult, com.tencent.maas.instamovie.base.MJError mJError) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildTemplate onComplete: err:");
        sb6.append(mJError != null ? mJError.message : null);
        sb6.append(", ");
        sb6.append(mJTemplateBuildResult != null ? mJTemplateBuildResult.getTemplateId() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", sb6.toString());
        this.f15772a.invoke(mJTemplateBuildResult, mJError);
        this.f15773b.onComplete(mJError);
    }
}
