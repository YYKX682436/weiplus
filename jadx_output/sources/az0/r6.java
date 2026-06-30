package az0;

/* loaded from: classes5.dex */
public final class r6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15862d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(az0.n7 n7Var) {
        super(1);
        this.f15862d = n7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.MJMovieSession.OnComplete it = (com.tencent.maas.instamovie.MJMovieSession.OnComplete) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return this.f15862d.f15742a.cancelMovieCreation(it);
    }
}
