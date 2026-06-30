package az0;

/* loaded from: classes5.dex */
public final class s4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJMoviePlayer f15882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer) {
        super(0);
        this.f15882d = mJMoviePlayer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseMJMoviePlayer[");
        com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer = this.f15882d;
        sb6.append(mJMoviePlayer.hashCode());
        sb6.append("]: ready release");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", sb6.toString());
        mJMoviePlayer.release();
        return null;
    }
}
