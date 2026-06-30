package com.p314xaae8f345.mm.p874xaefb6cc9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/minigame/c;", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/minigame/AppBrandProcessWVARunningNotifyTask$Args;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class c extends com.p314xaae8f345.mm.p794xb0fa9b5e.g<com.p314xaae8f345.mm.p874xaefb6cc9.C10914xa02a8a2d, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p874xaefb6cc9.C10914xa02a8a2d data = (com.p314xaae8f345.mm.p874xaefb6cc9.C10914xa02a8a2d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandProcessWVARunningNotifyTask", "execute notify wva running, in main process");
        java.util.Iterator it = ((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().h(new com.p314xaae8f345.mm.p874xaefb6cc9.b(data.f150519d))).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) it.next();
            kVar.f170616n = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandProcessWVARunningNotifyTask", "execute notify wva running, set " + kVar.i() + " -> isRunningWVA = true");
        }
    }
}
