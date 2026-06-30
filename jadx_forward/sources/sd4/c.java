package sd4;

/* loaded from: classes14.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String name, java.lang.String state) {
        f4.u uVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addState", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMetricsStateHolder", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        sd4.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.AbstractActivityC18370x899ce1db.f251462s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMetricsStateHolder$cp", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        f4.s sVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.AbstractActivityC18370x899ce1db.f251463t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMetricsStateHolder$cp", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMetricsStateHolder", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        if (sVar != null && (uVar = sVar.f340937a) != null) {
            synchronized (uVar.f340942b) {
                long nanoTime = java.lang.System.nanoTime();
                uVar.d(name, uVar.f340941a, nanoTime);
                ((java.util.ArrayList) uVar.f340941a).add(new f4.t(nanoTime, -1L, new f4.v(name, state)));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addState", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
    }

    public final void b(java.lang.String name) {
        f4.u uVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeState", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMetricsStateHolder", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        sd4.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.AbstractActivityC18370x899ce1db.f251462s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMetricsStateHolder$cp", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        f4.s sVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.AbstractActivityC18370x899ce1db.f251463t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMetricsStateHolder$cp", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMetricsStateHolder", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        if (sVar != null && (uVar = sVar.f340937a) != null) {
            uVar.d(name, uVar.f340941a, java.lang.System.nanoTime());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeState", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
    }
}
