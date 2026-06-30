package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/s;", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandProcessSuicideNotifyTask$Args;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class s extends com.p314xaae8f345.mm.p794xb0fa9b5e.g<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12613xc3a4304e, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12613xc3a4304e data = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12613xc3a4304e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String str = data.f170580d;
        int i17 = data.f170582f;
        try {
            java.util.List h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.r(str));
            java.util.ArrayList arrayList = (java.util.ArrayList) h17;
            java.util.Iterator it = arrayList.iterator();
            long j17 = 0;
            while (it.hasNext()) {
                j17 = java.lang.Math.max(j17, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) it.next()).v());
            }
            long j18 = data.f170581e;
            boolean z17 = false;
            if (j17 <= j18) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) kz5.n0.X(h17)).m();
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) it6.next();
                    kVar.getClass();
                    kVar.f129175c = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129161g;
                    kVar.a();
                    kVar.j();
                    kVar.f170616n = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(365, i17);
                z17 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessSuicideNotifyTask", "executeAsync in main process, processName:" + str + ", killed:" + z17 + ", timestamp:(" + j17 + " , " + j18 + ')');
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessSuicideNotifyTask", "executeAsync in main process, processName:" + str + ", get exception:" + e17);
        }
    }
}
