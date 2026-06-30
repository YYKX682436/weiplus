package po2;

/* loaded from: classes3.dex */
public final class a implements ct1.x {
    @Override // ct1.x
    public void pi(java.util.LinkedList linkedList, boolean z17) {
        try {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.tr trVar = (r45.tr) it.next();
                    if (trVar.f468253e == 1) {
                        r45.w3 w3Var = new r45.w3();
                        w3Var.mo11468x92b714fd(trVar.f468254f.f273689a);
                        linkedList2.add(w3Var);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BypMsgFinderLiveShopSyncHandler", "[onReceive] msgList.size = " + linkedList2.size());
            qo2.e Zj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Zj();
            Zj.getClass();
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new qo2.d(linkedList2, Zj, null), 2, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("BypMsgFinderLiveShopSyncHandler", e17, "", new java.lang.Object[0]);
        }
    }
}
