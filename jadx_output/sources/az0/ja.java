package az0;

/* loaded from: classes5.dex */
public final class ja implements com.tencent.maas.camstudio.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f15611a;

    public ja(kotlinx.coroutines.q qVar) {
        this.f15611a = qVar;
    }

    @Override // com.tencent.maas.camstudio.r
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f15611a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(mJError == null)));
    }
}
