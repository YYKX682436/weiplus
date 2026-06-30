package az0;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f15820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(az0.a0 a0Var) {
        super(1);
        this.f15820d = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete = (com.tencent.maas.instamovie.MJMoviePlayer.OnComplete) obj;
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        return this.f15820d.f15309a.startupPlayback(onComplete);
    }
}
