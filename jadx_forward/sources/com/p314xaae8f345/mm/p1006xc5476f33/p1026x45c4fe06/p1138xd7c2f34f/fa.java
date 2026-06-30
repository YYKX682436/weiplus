package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class fa extends ph1.q {
    @Override // ph1.q
    public void a(java.lang.String transactionKey) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ea eaVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transactionKey, "transactionKey");
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ea.f166130d;
        java.util.Map map2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ea.f166130d;
        if (map2 instanceof java.util.concurrent.ConcurrentHashMap) {
            eaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ea) ((java.util.concurrent.ConcurrentHashMap) map2).remove(transactionKey);
        } else {
            synchronized (map2) {
                eaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ea) ((java.util.concurrent.ConcurrentHashMap) map2).remove(transactionKey);
            }
        }
        if (eaVar != null) {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = eaVar.f166132b;
            if (concurrentLinkedQueue.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ModularizingPkgBatchLoadTransaction", "commit for key:" + eaVar.f166131a + " but no requests");
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(concurrentLinkedQueue, 10));
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ma maVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ma) it.next();
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12347x4c8da058(maVar.f166320c, (com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h) ((jz5.n) maVar.f166323f).mo141623x754a37bb()));
            }
            ((ph1.n) ph1.o.f435880c).execute(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.da(eaVar, arrayList));
        }
    }

    @Override // ph1.q
    public ph1.r b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime, java.lang.String requestModuleName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestModuleName, "requestModuleName");
        return !(str == null || str.length() == 0) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ma(runtime, requestModuleName, str) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.va(runtime, requestModuleName);
    }
}
