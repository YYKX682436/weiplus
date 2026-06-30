package q12;

/* loaded from: classes4.dex */
public final class e0 implements ct1.x {
    @Override // ct1.x
    public void pi(java.util.LinkedList linkedList, boolean z17) {
        java.lang.String str;
        java.lang.Integer h17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("storeunique_byp", "EmoticonBypMsgSyncHandler receive");
        if (linkedList != null) {
            try {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.tr trVar = (r45.tr) it.next();
                    int i17 = 1;
                    if (trVar.f468253e != 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("storeunique_byp", "item_type wrong " + trVar.f468253e);
                    } else {
                        r45.w3 w3Var = new r45.w3();
                        w3Var.mo11468x92b714fd(trVar.f468254f.f273689a);
                        r45.j4 j4Var = w3Var.f470359d;
                        if (j4Var == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("storeunique_byp", "addBypMsg  msg is null");
                        } else if (j4Var.f459093g != 10002) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("storeunique_byp", "MsgType wrong " + w3Var.f470359d.f459093g);
                        } else {
                            java.lang.String g17 = x51.j1.g(j4Var.f459094h);
                            if (g17 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("storeunique_byp", "xml is null ");
                            } else {
                                java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
                                java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.$type");
                                if (str2 == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("storeunique_byp", "subType is null");
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("storeunique_byp", "addBypMsg content " + g17 + " subType " + str2);
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("panel_emoji_update", str2) && (str = (java.lang.String) d17.get(".sysmsg.md5")) != null) {
                                        java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.storeunique");
                                        int intValue = (str3 == null || (h17 = r26.h0.h(str3)) == null) ? 1 : h17.intValue();
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("storeunique_byp", "md5 " + str + " update storeUnique is " + intValue);
                                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                                        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(str);
                                        if (u17 != null) {
                                            if (intValue <= 0) {
                                                i17 = 0;
                                            }
                                            u17.f68683x1d5dc4d = i17;
                                            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("storeunique_byp", "update ret " + com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().G2(u17));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("storeunique_byp", "parse failed " + e17);
            }
        }
    }
}
