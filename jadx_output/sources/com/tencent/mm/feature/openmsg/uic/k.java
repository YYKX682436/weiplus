package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.n f67343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.feature.openmsg.uic.n nVar) {
        super(1);
        this.f67343d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        hb0.a state = (hb0.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        boolean z17 = state.f280013f;
        com.tencent.mm.feature.openmsg.uic.n nVar = this.f67343d;
        nVar.f67353e = z17;
        nVar.f67352d = state.f280016i;
        nVar.f67356h = state.f280012e;
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof eb0.a)) {
            eb0.a aVar = (eb0.a) dVar;
            nVar.f67355g = aVar.f250699d;
            nVar.f67354f = aVar.f250700e;
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = aVar.f250698c;
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = aVar.f250697b;
            if (z17) {
                com.tencent.mm.feature.openmsg.uic.j jVar = new com.tencent.mm.feature.openmsg.uic.j(nVar, aVar);
                if (appBrandOpenMaterialDetailModel.f86259h) {
                    androidx.appcompat.app.AppCompatActivity activity = nVar.getActivity();
                    java.lang.String unstatedWording = appBrandOpenMaterialCollection.f86254i;
                    kotlin.jvm.internal.o.f(unstatedWording, "unstatedWording");
                    java.lang.String format = java.lang.String.format(unstatedWording, java.util.Arrays.copyOf(new java.lang.Object[]{appBrandOpenMaterialDetailModel.f86260i}, 1));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    db5.e1.E(activity, format, "", nVar.getActivity().getResources().getString(com.tencent.mm.R.string.l_e), false, new com.tencent.mm.feature.openmsg.uic.i(jVar));
                } else {
                    jVar.invoke();
                }
            } else {
                com.tencent.mm.feature.openmsg.uic.n.T6(nVar, appBrandOpenMaterialDetailModel, appBrandOpenMaterialCollection);
            }
        }
        return jz5.f0.f302826a;
    }
}
