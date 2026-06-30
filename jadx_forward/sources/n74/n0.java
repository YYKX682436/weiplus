package n74;

/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n74.n0 f416932a = new n74.n0();

    public final void a(java.lang.String str, java.util.Map values, com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceiveMsg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdPushMsgHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        int i17 = 0;
        int i18 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".sysmsg.msgList.msgItem");
            sb6.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
            java.lang.String keyPrefix = sb6.toString();
            if (!values.containsKey(keyPrefix)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceiveMsg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdPushMsgHandler");
                return;
            }
            i18++;
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(keyPrefix + ".actionType"), i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdPushMsgHandler", "onReceiveMsg, msgType=" + str + ", actionType=" + D1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchMsg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdPushMsgHandler");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyPrefix, "keyPrefix");
            if (D1 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleDelAdMsg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdPushMsgHandler");
                java.lang.String concat = keyPrefix.concat(".deleteAdInfo");
                java.lang.String str2 = (java.lang.String) values.get(concat + ".snsId");
                int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(concat + ".deleteLevel"), i17);
                if (((str2 == null || str2.length() == 0) ? 1 : i17) != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdPushMsgHandler", "handleDelAdMsg, snsId is null, deleteLevel=" + D12);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleDelAdMsg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdPushMsgHandler");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(ca4.z0.F0(str2));
                    l44.t5 b17 = l44.t5.b();
                    if (y07 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdPushMsgHandler", "handleDelAdMsg, snsId=" + str2 + ", deleteLevel=" + D12 + ", delRet=1");
                        b17.a("", str2, 6, 1);
                    } else {
                        int a17 = l44.i3.a(y07, 8, D12, "");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdPushMsgHandler", "handleDelAdMsg, snsId=" + str2 + ", deleteLevel=" + D12 + ", delRet=" + a17);
                        b17.a(y07.m70299x10413e67().f38104xce64ddf1, str2, 6, a17);
                    }
                    b17.c();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleDelAdMsg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdPushMsgHandler");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchMsg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdPushMsgHandler");
            i17 = 0;
        }
    }
}
