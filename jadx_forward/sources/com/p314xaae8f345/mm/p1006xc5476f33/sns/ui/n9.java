package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class n9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f251516a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 f251517b;

    public n9() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f251516a = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6216x1b036291>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1
            {
                this.f39173x3fe91575 = 1480328353;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6216x1b036291 c6216x1b036291) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6216x1b036291 event = c6216x1b036291;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m9(event, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9.this));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1");
                return true;
            }
        };
    }

    public static final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9 n9Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSightWidgetCallback$p", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 o9Var = n9Var.f251517b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSightWidgetCallback$p", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
        return o9Var;
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("aliveRemuxEventListener", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "alive event listener");
        this.f251516a.mo48813x58998cd();
        this.f251517b = callback;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("aliveRemuxEventListener", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
    }

    public void c(java.lang.String workTagId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteWork", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "deleteWork >> ".concat(workTagId));
        if (workTagId.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightWidgetBackgroundVideoHandler", "deleteWork tagId is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteWork", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
            return;
        }
        wp4.x xVar = (wp4.x) ((n55.f) i95.n0.c(n55.f.class));
        xVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f529986d, "deleteWork >> workTagId: ".concat(workTagId));
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new wp4.l(workTagId, xVar, null), 2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteWork", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroyRemuxEventListener", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "destroy event listener");
        this.f251516a.mo48814x2efc64();
        this.f251517b = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroyRemuxEventListener", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
    }

    public void e(java.lang.String workTagId, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRemuxVideoWork", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "getRemuxVideoWork >> workTagId: ".concat(workTagId));
        ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).wi(workTagId, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k9(callback, workTagId));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRemuxVideoWork", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
    }
}
