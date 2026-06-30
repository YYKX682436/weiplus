package az0;

/* loaded from: classes5.dex */
public final class a6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.MJTemplateBuildResult f15324e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(az0.n7 n7Var, com.tencent.maas.model.MJTemplateBuildResult mJTemplateBuildResult) {
        super(1);
        this.f15323d = n7Var;
        this.f15324e = mJTemplateBuildResult;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.MJMovieSession.OnComplete it = (com.tencent.maas.instamovie.MJMovieSession.OnComplete) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return this.f15323d.f15742a.switchTemplateWithBuildResult(this.f15324e, it);
    }
}
