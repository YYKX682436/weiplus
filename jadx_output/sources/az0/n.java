package az0;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f15725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJAsyncTaskInfo f15726e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(az0.a0 a0Var, com.tencent.maas.instamovie.MJAsyncTaskInfo mJAsyncTaskInfo) {
        super(1);
        this.f15725d = a0Var;
        this.f15726e = mJAsyncTaskInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.MJMoviePlayer.OnComplete it = (com.tencent.maas.instamovie.MJMoviePlayer.OnComplete) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = this.f15725d.f15311c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startWithClipBundleId: cancel, ");
        com.tencent.maas.instamovie.MJAsyncTaskInfo mJAsyncTaskInfo = this.f15726e;
        sb6.append(mJAsyncTaskInfo != null ? java.lang.Long.valueOf(mJAsyncTaskInfo.f48105b) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        return null;
    }
}
