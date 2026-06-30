package az0;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f15985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(az0.a0 a0Var) {
        super(1);
        this.f15985d = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete = (com.tencent.maas.instamovie.MJMoviePlayer.OnComplete) obj;
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        az0.a0 a0Var = this.f15985d;
        java.lang.String str = a0Var.f15311c;
        return a0Var.f15309a.stopPlaying(onComplete);
    }
}
