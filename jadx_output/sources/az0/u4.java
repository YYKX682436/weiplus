package az0;

/* loaded from: classes5.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJMoviePlayer f15937d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer) {
        super(1);
        this.f15937d = mJMoviePlayer;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete = (com.tencent.maas.instamovie.MJMoviePlayer.OnComplete) obj;
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseMJMoviePlayer[");
        com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer = this.f15937d;
        sb6.append(mJMoviePlayer.hashCode());
        sb6.append("]: ready tearDown");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", sb6.toString());
        return mJMoviePlayer.tearDown(onComplete);
    }
}
