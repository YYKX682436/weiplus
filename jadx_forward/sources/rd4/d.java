package rd4;

/* loaded from: classes4.dex */
public final class d extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9 {

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f475784c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 f475785d;

    public d() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f475784c = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6159x3bba2a8a>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1
            {
                this.f39173x3fe91575 = 399773850;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6159x3bba2a8a c6159x3bba2a8a) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6159x3bba2a8a event = c6159x3bba2a8a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new rd4.c(event, rd4.d.this));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1");
                return true;
            }
        };
    }

    public static final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 f(rd4.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSightWidgetCallback$p", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 o9Var = dVar.f475785d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSightWidgetCallback$p", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
        return o9Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("aliveRemuxEventListener", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "alive event listener");
        this.f475784c.mo48813x58998cd();
        this.f475785d = callback;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("aliveRemuxEventListener", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9
    public void c(java.lang.String workTagId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteWork", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "deleteWork >> ".concat(workTagId));
        if (workTagId.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "deleteWork tagId is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteWork", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
            return;
        }
        yy0.g8 g8Var = (yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class));
        g8Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g8Var.f549645d, "deleteWork >> workTagId: ".concat(workTagId));
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new yy0.u7(workTagId, g8Var, null), 2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteWork", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroyRemuxEventListener", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "destroy event listener");
        this.f475784c.mo48814x2efc64();
        this.f475785d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroyRemuxEventListener", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9
    public void e(java.lang.String workTagId, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRemuxVideoWork", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "getRemuxVideoWork >> workTagId: ".concat(workTagId));
        ((yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class))).Ai(workTagId, new rd4.a(callback, workTagId));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRemuxVideoWork", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler");
    }
}
