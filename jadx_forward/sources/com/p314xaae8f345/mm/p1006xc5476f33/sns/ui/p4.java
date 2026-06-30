package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class p4 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9
    public void c(java.lang.String workTagId, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onProgress", "com.tencent.mm.plugin.sns.ui.GlobalSightExportProgressManager$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q4.a().put(workTagId, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onProgress", "com.tencent.mm.plugin.sns.ui.GlobalSightExportProgressManager$2");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9
    public void d(int i17, o55.a aVar, java.lang.String workTagId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinish", "com.tencent.mm.plugin.sns.ui.GlobalSightExportProgressManager$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q4.a().put(workTagId, 100);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalSightExportProgressManager", "SightWidgetTemplateBackgroundVideoHandler finish:".concat(workTagId));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ui.GlobalSightExportProgressManager$2");
    }
}
