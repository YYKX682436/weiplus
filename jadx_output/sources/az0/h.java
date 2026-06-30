package az0;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f15516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f15518f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kotlin.coroutines.Continuation continuation, java.lang.String str, long j17) {
        super(1);
        this.f15516d = continuation;
        this.f15517e = str;
        this.f15518f = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.base.MJError mJError = (com.tencent.maas.instamovie.base.MJError) obj;
        bz0.b bVar = bz0.b.f36724a;
        long j17 = this.f15518f;
        kotlin.coroutines.Continuation continuation = this.f15516d;
        if (mJError != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MaasFuncUtils", mJError.f48175ec + ' ' + mJError.message, new java.lang.Throwable());
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
            bz0.b.b(bVar, this.f15517e, mJError, java.lang.System.currentTimeMillis() - j17, 0, 8, null);
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
            bz0.b.d(bVar, this.f15517e, java.lang.System.currentTimeMillis() - j17, 0, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
