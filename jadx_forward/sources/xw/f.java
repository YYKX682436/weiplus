package xw;

/* loaded from: classes4.dex */
public final class f implements ct1.x {
    @Override // ct1.x
    public void pi(java.util.LinkedList linkedList, boolean z17) {
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.tr trVar = (r45.tr) it.next();
                if (trVar.f468253e == 1) {
                    r45.w3 w3Var = new r45.w3();
                    w3Var.mo11468x92b714fd(trVar.f468254f.f273689a);
                    r45.j4 j4Var = w3Var.f470359d;
                    if (j4Var.f459093g == 10002) {
                        com.p314xaae8f345.mm.p944x882e457a.p0 p0Var = new com.p314xaae8f345.mm.p944x882e457a.p0(j4Var, false, false, false);
                        java.lang.String g17 = x51.j1.g(j4Var.f459094h);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizMergeNotification", "null msg content");
                        } else {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
                            int L = r26.n0.L(g17, "<appmsg", 0, false, 6, null);
                            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                            if (L != -1) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMergeNotification", "msgContent start with <appmsg");
                                java.lang.String substring = g17.substring(L);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                                java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(substring, "appmsg", null);
                                h0Var.f391656d = d17;
                                if (d17 == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizMergeNotification", "XmlParser values is null, msgContent %s", g17);
                                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) d17.get(".appmsg.title"), "bizMergeMsgNotifyV2")) {
                                    yq1.n.a("BrandServiceWorkerThread", new xw.e(h0Var, p0Var), 0L);
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMergeNotification", "msgContent start with <appmsg, subType is not MM_DATA_SYSCMD_NEWXML_SUBTYPE_BIZ_MERGE_NOTIFY");
                                }
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizMergeNotification", "msgContent not start with <appmsg");
                            }
                        }
                    }
                }
            }
        }
    }
}
