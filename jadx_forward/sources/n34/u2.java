package n34;

/* loaded from: classes10.dex */
public class u2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public u2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5845xa0f7b469 c5845xa0f7b469 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5845xa0f7b469) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PostSnsTagMemberOptionListener", "PostSnsTagMemberOptionEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
        } else if (c5845xa0f7b469 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5845xa0f7b469) {
            am.oo ooVar = c5845xa0f7b469.f136154g;
            java.util.List list = ooVar.f89103e;
            if (list == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PostSnsTagMemberOptionListener", "event.data.list is null!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
            } else {
                boolean z18 = ooVar.f89102d;
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PostSnsTagMemberOptionListener", "tag list is local %s", java.lang.Boolean.valueOf(z18));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 D0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().D0(ooVar.f89100b);
                    D0.f69153x29d92ad0 = ooVar.f89100b;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D0.f69152x693306bd)) {
                        arrayList.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(D0.f69152x693306bd.split(",")));
                    }
                    java.util.Iterator it = ooVar.f89103e.iterator();
                    while (it.hasNext()) {
                        arrayList.add((java.lang.String) it.next());
                    }
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        java.lang.String str = (java.lang.String) it6.next();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                            stringBuffer.append(str + ",");
                        }
                    }
                    D0.f69152x693306bd = stringBuffer.toString();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().d1(D0);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.e3(ooVar.f89099a, ooVar.f89100b, "", list.size(), ooVar.f89103e, ooVar.f89101c);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PostSnsTagMemberOptionListener", "opCode " + ooVar.f89099a + " memberList " + ooVar.f89103e.size() + " scene " + ooVar.f89101c);
                    gm0.j1.n().f354821b.g(e3Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
                }
                z17 = true;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.PostSnsTagMemberOptionListener", "mismatched event");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
        return z17;
    }
}
