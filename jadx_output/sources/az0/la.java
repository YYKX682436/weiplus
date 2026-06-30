package az0;

/* loaded from: classes16.dex */
public final class la extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.xb f15675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.material.g f15676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(az0.xb xbVar, com.tencent.maas.material.g gVar) {
        super(1);
        this.f15675d = xbVar;
        this.f15676e = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        final yz5.p it = (yz5.p) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f15675d.f16060i;
        if (mJCamoSession != null) {
            mJCamoSession.D(this.f15676e, new com.tencent.maas.camstudio.s(it) { // from class: az0.ya

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ yz5.p f16089a;

                {
                    kotlin.jvm.internal.o.g(it, "function");
                    this.f16089a = it;
                }

                @Override // com.tencent.maas.camstudio.s
                public final /* synthetic */ void a(com.tencent.maas.material.MJMaterialPack mJMaterialPack, com.tencent.maas.instamovie.base.MJError mJError) {
                    this.f16089a.invoke(mJMaterialPack, mJError);
                }
            });
        }
        return jz5.f0.f302826a;
    }
}
