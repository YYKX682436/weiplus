package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.v f67374d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.feature.openmsg.uic.v vVar) {
        super(1);
        this.f67374d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        hb0.a state = (hb0.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof eb0.b)) {
            eb0.b bVar = (eb0.b) dVar;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            final com.tencent.mm.feature.openmsg.uic.v vVar = this.f67374d;
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = bVar.f250701b;
            if (appBrandOpenMaterialCollection != null) {
                com.tencent.mm.plugin.appbrand.service.k5 k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class);
                if (k5Var != null && vVar.f67378e == null) {
                    vVar.f67378e = new db0.j(((zh1.p) k5Var).Ui(state.f280020p, state.f280018n, appBrandOpenMaterialCollection, state.f280019o), arrayList.size());
                }
                for (com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel : appBrandOpenMaterialCollection.f86252g) {
                    kotlin.jvm.internal.o.d(appBrandOpenMaterialDetailModel);
                    arrayList.add(new com.tencent.mm.feature.openmsg.uic.o(appBrandOpenMaterialDetailModel));
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgByAppBrandUIC", "fetchOpenMaterialsQuickly dataList:" + arrayList.size() + " collection:" + appBrandOpenMaterialCollection);
            if (arrayList.size() > 0) {
                em.a U6 = vVar.U6();
                if (U6.f254037b == null) {
                    U6.f254037b = (android.widget.TextView) U6.f254036a.findViewById(com.tencent.mm.R.id.ser);
                }
                U6.f254037b.setVisibility(0);
                vVar.U6().b().setVisibility(0);
                int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 32);
                if (bVar.f250704e) {
                    vVar.U6().a().setVisibility(8);
                    com.tencent.mm.feature.openmsg.uic.v.T6(vVar, b17);
                    wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.feature.openmsg.uic.OpenMsgByAppBrandUIC$itemConvertFactory$1
                        @Override // in5.s
                        public in5.r getItemConvert(int type) {
                            db0.e eVar;
                            db0.j jVar = com.tencent.mm.feature.openmsg.uic.v.this.f67378e;
                            if (jVar != null) {
                                if (jVar.f227832b == null) {
                                    jVar.f227832b = new db0.i(jVar);
                                }
                                eVar = jVar.f227832b;
                                kotlin.jvm.internal.o.d(eVar);
                            } else {
                                eVar = null;
                            }
                            return new com.tencent.mm.feature.openmsg.uic.q(eVar);
                        }
                    }, arrayList, false);
                } else if (arrayList.size() <= 3) {
                    vVar.U6().a().setVisibility(8);
                    com.tencent.mm.feature.openmsg.uic.v.T6(vVar, b17);
                    wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.feature.openmsg.uic.OpenMsgByAppBrandUIC$itemConvertFactory$1
                        @Override // in5.s
                        public in5.r getItemConvert(int type) {
                            db0.e eVar;
                            db0.j jVar = com.tencent.mm.feature.openmsg.uic.v.this.f67378e;
                            if (jVar != null) {
                                if (jVar.f227832b == null) {
                                    jVar.f227832b = new db0.i(jVar);
                                }
                                eVar = jVar.f227832b;
                                kotlin.jvm.internal.o.d(eVar);
                            } else {
                                eVar = null;
                            }
                            return new com.tencent.mm.feature.openmsg.uic.q(eVar);
                        }
                    }, arrayList, false);
                } else {
                    vVar.U6().a().setVisibility(0);
                    com.tencent.mm.feature.openmsg.uic.v.T6(vVar, 0);
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.feature.openmsg.uic.OpenMsgByAppBrandUIC$itemConvertFactory$1
                        @Override // in5.s
                        public in5.r getItemConvert(int type) {
                            db0.e eVar;
                            db0.j jVar = com.tencent.mm.feature.openmsg.uic.v.this.f67378e;
                            if (jVar != null) {
                                if (jVar.f227832b == null) {
                                    jVar.f227832b = new db0.i(jVar);
                                }
                                eVar = jVar.f227832b;
                                kotlin.jvm.internal.o.d(eVar);
                            } else {
                                eVar = null;
                            }
                            return new com.tencent.mm.feature.openmsg.uic.q(eVar);
                        }
                    }, new java.util.ArrayList(kz5.n0.K0(arrayList, 3)), false);
                    vVar.U6().a().setOnClickListener(new com.tencent.mm.feature.openmsg.uic.r(vVar, b17, wxRecyclerAdapter2, arrayList));
                    wxRecyclerAdapter = wxRecyclerAdapter2;
                }
                wxRecyclerAdapter.f293105o = new com.tencent.mm.feature.openmsg.uic.s(arrayList, vVar, appBrandOpenMaterialCollection, bVar);
                vVar.U6().b().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(vVar.getContext(), 1, false));
                vVar.U6().b().setAdapter(wxRecyclerAdapter);
            } else {
                em.a U62 = vVar.U6();
                if (U62.f254037b == null) {
                    U62.f254037b = (android.widget.TextView) U62.f254036a.findViewById(com.tencent.mm.R.id.ser);
                }
                U62.f254037b.setVisibility(8);
                vVar.U6().b().setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
