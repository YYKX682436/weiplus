package az0;

/* loaded from: classes5.dex */
public final class s5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f15883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15884e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(java.lang.Integer num, az0.n7 n7Var) {
        super(1);
        this.f15883d = num;
        this.f15884e = n7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.MJMovieSession.OnComplete it = (com.tencent.maas.instamovie.MJMovieSession.OnComplete) obj;
        kotlin.jvm.internal.o.g(it, "it");
        az0.i5 i5Var = az0.i5.f15557a;
        if (!az0.i5.f15571o) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "recreateWithMusicID: skip cancelRecreation, session released");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "start cancelBuildTemplate, musicTask:" + this.f15883d);
        az0.n7 n7Var = this.f15884e;
        java.lang.Integer num = this.f15883d;
        if (num == null) {
            n7Var.getClass();
        } else {
            n7Var.f15742a.cancelMusicRecommend(num.intValue());
        }
        return this.f15884e.f15742a.cancelBuildTemplate(it);
    }
}
