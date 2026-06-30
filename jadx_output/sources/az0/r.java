package az0;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f15852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(az0.a0 a0Var) {
        super(1);
        this.f15852d = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete = (com.tencent.maas.instamovie.MJMoviePlayer.OnComplete) obj;
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        az0.a0 a0Var = this.f15852d;
        com.tencent.mars.xlog.Log.i(a0Var.f15311c, "shutdownPlayback: ready");
        return a0Var.f15309a.shutdownPlayback(onComplete);
    }
}
