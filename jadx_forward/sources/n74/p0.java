package n74;

/* loaded from: classes.dex */
public final class p0 implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map values, com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNewXmlReceived", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTimelinePushMsgReceiver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        try {
            if ("TimelineAdPushMsg".equals(str)) {
                n74.n0.f416932a.a(str, values, addMsgInfo);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdPushMsgHandler", "onReceiveMsg exp=" + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNewXmlReceived", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTimelinePushMsgReceiver");
    }
}
