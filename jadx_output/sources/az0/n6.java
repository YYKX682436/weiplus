package az0;

/* loaded from: classes5.dex */
public final class n6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15741d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(az0.n7 n7Var) {
        super(1);
        this.f15741d = n7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.MJMovieSession.OnComplete it = (com.tencent.maas.instamovie.MJMovieSession.OnComplete) obj;
        kotlin.jvm.internal.o.g(it, "it");
        az0.i5 i5Var = az0.i5.f15557a;
        if (az0.i5.f15571o) {
            return this.f15741d.f15742a.cancelRecreation(it);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "recreateWithMusicID: skip cancelRecreation, session released");
        return null;
    }
}
