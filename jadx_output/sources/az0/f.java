package az0;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f15454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f15456f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kotlin.coroutines.Continuation continuation, java.lang.String str, long j17) {
        super(2);
        this.f15454d = continuation;
        this.f15455e = str;
        this.f15456f = j17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.instamovie.base.MJError mJError = (com.tencent.maas.instamovie.base.MJError) obj2;
        bz0.b bVar = bz0.b.f36724a;
        long j17 = this.f15456f;
        kotlin.coroutines.Continuation continuation = this.f15454d;
        if (mJError != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MaasFuncUtils", mJError.f48175ec + ' ' + mJError.message, new java.lang.Throwable());
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
            bz0.b.b(bVar, this.f15455e, mJError, java.lang.System.currentTimeMillis() - j17, 0, 8, null);
        } else {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(obj));
            bz0.b.d(bVar, this.f15455e, java.lang.System.currentTimeMillis() - j17, 0, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
