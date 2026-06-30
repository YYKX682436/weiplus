package az0;

/* loaded from: classes5.dex */
public final class y4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJMovieSession f16071d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(com.tencent.maas.instamovie.MJMovieSession mJMovieSession) {
        super(1);
        this.f16071d = mJMovieSession;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.MJMovieSession.OnComplete it = (com.tencent.maas.instamovie.MJMovieSession.OnComplete) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return this.f16071d.tearDown(it);
    }
}
