package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class s implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f67370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.v f67371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection f67372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eb0.b f67373g;

    public s(java.util.ArrayList arrayList, com.tencent.mm.feature.openmsg.uic.v vVar, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection, eb0.b bVar) {
        this.f67370d = arrayList;
        this.f67371e = vVar;
        this.f67372f = appBrandOpenMaterialCollection;
        this.f67373g = bVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        zh1.w0 w0Var;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = ((com.tencent.mm.feature.openmsg.uic.o) this.f67370d.get(i17 - ((in5.n0) adapter).a0())).f67363d;
        com.tencent.mm.feature.openmsg.uic.v vVar = this.f67371e;
        db0.j jVar = vVar.f67378e;
        if (jVar != null && (w0Var = jVar.f227831a) != null) {
            ((di1.f) w0Var).f(appBrandOpenMaterialDetailModel);
        }
        j75.f Q6 = vVar.Q6();
        if (Q6 != null) {
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = this.f67372f;
            kotlin.jvm.internal.o.d(appBrandOpenMaterialCollection);
            eb0.b bVar = this.f67373g;
            Q6.B3(new eb0.a(appBrandOpenMaterialDetailModel, appBrandOpenMaterialCollection, bVar.f250702c, bVar.f250703d));
        }
    }
}
