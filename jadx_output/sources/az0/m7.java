package az0;

/* loaded from: classes5.dex */
public final class m7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJMovieOptions f15711e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(az0.n7 n7Var, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions) {
        super(1);
        this.f15710d = n7Var;
        this.f15711e = mJMovieOptions;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.MJMovieSession.OnComplete it = (com.tencent.maas.instamovie.MJMovieSession.OnComplete) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return this.f15710d.f15742a.updateMovieOptions(this.f15711e, it);
    }
}
