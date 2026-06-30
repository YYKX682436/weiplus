package ec4;

@j95.b
/* loaded from: classes4.dex */
public final class j0 extends i95.w implements fe0.i4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f332702d = "MicroMsg.SnsFakeVideoResultApi";

    public void wi(int i17, java.lang.String videoPath, java.lang.String thumbPath, byte[] extInfo, int i18) {
        ec4.j b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyPublishRemuxWorkResult", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        java.lang.String str = "notifyPublishRemuxWorkResult >> snsLocalId: " + i17 + ", workType: " + i18 + ", videoPath: " + videoPath + ", extInfoSize: " + extInfo.length;
        java.lang.String str2 = this.f332702d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (i18 == 4007 && com.p314xaae8f345.mm.vfs.w6.j(videoPath)) {
            if (!(extInfo.length == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "notifyPublishRemuxWorkResult >> go to commit");
                ec4.j d17 = new ec4.j().d(i17, extInfo);
                if (d17 != null && (b17 = d17.b(videoPath, thumbPath)) != null) {
                    b17.c();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyPublishRemuxWorkResult", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApi");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "remux is error, snsLocalId: " + i17 + ", workType: " + i18 + ", videoPath: " + videoPath + ", extInfoSize: " + extInfo.length);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFakeVideoFeedToDie", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateFakeVideoFeedToDie >> localId ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(i17);
        if (i19 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsTimeLineFakeViewHandler", "updateFakeVideoFeedToDie: failed, info null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFakeVideoFeedToDie", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().l(i19, -1, 7, "sns BackVideo is remux error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFakeVideoFeedToDie", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyPublishRemuxWorkResult", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApi");
    }
}
