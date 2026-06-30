package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/scanner/e;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiDetectImageCode$CheckWXAppInfoDataList;", "Lcom/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiDetectImageCode$A8KeyRespDataList;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12229xdad69a3e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12227x987203f0> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12229xdad69a3e c12229xdad69a3e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12229xdad69a3e) obj;
        if (c12229xdad69a3e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiDetectImageCode", "BatchGetA8KeyIPCTask invoke data is null");
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12227x987203f0(new java.util.ArrayList()));
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BatchGetA8KeyIPCTask invoke size=");
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12228xb5493580> list = c12229xdad69a3e.f164468d;
        sb6.append(list.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDetectImageCode", sb6.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12228xb5493580 c12228xb5493580 : list) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12226xbf714832(-1, ""));
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(list.size());
        int i17 = 0;
        for (java.lang.Object obj2 : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12228xb5493580 c12228xb54935802 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12228xb5493580) obj2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDetectImageCode", "it index=" + i17 + ", result=" + c12228xb54935802.f164465d);
            w60.k wi6 = ((v60.u) ((w60.j) i95.n0.c(w60.j.class))).wi(c12228xb54935802.f164465d, null, 36, 0, c12228xb54935802.f164466e, c12228xb54935802.f164467f, null, o45.cg.a(), new byte[0]);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("RunCgi index=");
            sb7.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDetectImageCode", sb7.toString());
            com.p314xaae8f345.mm.p944x882e457a.z2.d(((com.p314xaae8f345.mm.p957x53236a1b.k0) wi6).f152889e, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.d(arrayList, wi6, i17, atomicInteger, rVar), true);
            i17 = i18;
        }
    }
}
