package az0;

/* loaded from: classes16.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.material.g f15960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(az0.f2 f2Var, com.tencent.maas.material.g gVar) {
        super(1);
        this.f15959d = f2Var;
        this.f15960e = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        final yz5.p it = (yz5.p) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f15959d.f15461e.l(this.f15960e, new com.tencent.maas.camstudio.s(it) { // from class: az0.h1

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.p f15521a;

            {
                kotlin.jvm.internal.o.g(it, "function");
                this.f15521a = it;
            }

            @Override // com.tencent.maas.camstudio.s
            public final /* synthetic */ void a(com.tencent.maas.material.MJMaterialPack mJMaterialPack, com.tencent.maas.instamovie.base.MJError mJError) {
                this.f15521a.invoke(mJMaterialPack, mJError);
            }
        });
        return jz5.f0.f302826a;
    }
}
