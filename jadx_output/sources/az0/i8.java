package az0;

/* loaded from: classes16.dex */
public final class i8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.material.g f15586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(az0.s9 s9Var, com.tencent.maas.material.g gVar) {
        super(1);
        this.f15585d = s9Var;
        this.f15586e = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        final yz5.p cb6 = (yz5.p) obj;
        kotlin.jvm.internal.o.g(cb6, "cb");
        this.f15585d.f15891d.l(this.f15586e, new com.tencent.maas.camstudio.s(cb6) { // from class: az0.w8

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.p f16024a;

            {
                kotlin.jvm.internal.o.g(cb6, "function");
                this.f16024a = cb6;
            }

            @Override // com.tencent.maas.camstudio.s
            public final /* synthetic */ void a(com.tencent.maas.material.MJMaterialPack mJMaterialPack, com.tencent.maas.instamovie.base.MJError mJError) {
                this.f16024a.invoke(mJMaterialPack, mJError);
            }
        });
        return jz5.f0.f302826a;
    }
}
