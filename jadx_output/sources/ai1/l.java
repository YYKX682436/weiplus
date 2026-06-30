package ai1;

/* loaded from: classes8.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh1.a1 f5093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel f5094e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(zh1.a1 a1Var, com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel) {
        super(0);
        this.f5093d = a1Var;
        this.f5094e = materialModel;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zh1.a1 a1Var = this.f5093d;
        if (a1Var != null) {
            a1Var.a(false, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection.a(this.f5094e));
        }
        return jz5.f0.f302826a;
    }
}
