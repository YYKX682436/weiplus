package az0;

/* loaded from: classes5.dex */
public final class h0 implements com.tencent.maas.camstudio.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f15519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f15520b;

    public h0(kotlin.coroutines.Continuation continuation, long j17) {
        this.f15519a = continuation;
        this.f15520b = j17;
    }

    @Override // com.tencent.maas.camstudio.k0
    public final void a(com.tencent.maas.camstudio.MJCamUseTemplateFinishInfo mJCamUseTemplateFinishInfo, com.tencent.maas.instamovie.base.MJError mJError) {
        java.lang.Object m521constructorimpl;
        long j17 = this.f15520b;
        bz0.b bVar = bz0.b.f36724a;
        if (mJError == null) {
            bVar.c("1047", java.lang.System.currentTimeMillis() - j17, bz0.a.f36723b);
            m521constructorimpl = kotlin.Result.m521constructorimpl(mJCamUseTemplateFinishInfo);
        } else {
            bz0.b.b(bVar, "1047", mJError, java.lang.System.currentTimeMillis() - j17, 0, 8, null);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(mJError.message)));
        }
        this.f15519a.resumeWith(kotlin.Result.m521constructorimpl(kotlin.Result.m520boximpl(m521constructorimpl)));
    }
}
