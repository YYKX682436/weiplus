package com.tencent.mm.app;

/* loaded from: classes11.dex */
public class h5 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.i5 f53439a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(com.tencent.mm.app.i5 i5Var, android.os.Looper looper) {
        super(looper);
        this.f53439a = i5Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 != -1999) {
            if (i17 == -2999) {
                com.tencent.mm.app.i5 i5Var = this.f53439a;
                if (i5Var.f53457a) {
                    return;
                }
                i5Var.getClass();
                com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
                if (launcherUI != null) {
                    java.util.HashMap hashMap = launcherUI.f7().f196935o;
                    if (hashMap.containsKey(0)) {
                        ((com.tencent.mm.ui.y7) hashMap.get(0)).E();
                    }
                }
                if (gm0.j1.b().m()) {
                    if (i01.b.f286497g == null) {
                        synchronized (i01.b.class) {
                            if (i01.b.f286497g == null) {
                                i01.b.f286497g = new i01.b();
                            }
                        }
                    }
                    i01.b bVar = i01.b.f286497g;
                    bVar.getClass();
                    gm0.j1.e().j(new i01.a(bVar));
                }
                java.lang.System.gc();
                return;
            }
            return;
        }
        com.tencent.mm.app.i5 i5Var2 = this.f53439a;
        if (i5Var2.f53457a) {
            return;
        }
        i5Var2.getClass();
        com.tencent.mm.ui.LauncherUI launcherUI2 = com.tencent.mm.ui.LauncherUI.getInstance();
        if (launcherUI2 != null && launcherUI2.f196832o) {
            launcherUI2.f7().o("tab_main");
            com.tencent.mm.ui.HomeUI homeUI = launcherUI2.getHomeUI();
            if (homeUI.f196742a) {
                homeUI.f196743b = true;
            }
            p94.k0 d17 = p94.w0.d();
            if (d17 != null) {
                com.tencent.mm.plugin.sns.model.i1 i1Var = (com.tencent.mm.plugin.sns.model.i1) d17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                i1Var.g();
                i1Var.f164264m = 0L;
                i1Var.f164265n = 0L;
                i1Var.f164258g.clear();
                i1Var.f164259h = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            }
            for (androidx.lifecycle.m1 m1Var : launcherUI2.f7().f196935o.values()) {
                if (!(m1Var instanceof com.tencent.mm.ui.conversation.MainUI)) {
                    ((com.tencent.mm.ui.y7) m1Var).E();
                }
            }
        }
        java.lang.System.gc();
    }
}
