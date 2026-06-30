package com.p314xaae8f345.mm.app;

/* loaded from: classes11.dex */
public class h5 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.i5 f134972a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(com.p314xaae8f345.mm.app.i5 i5Var, android.os.Looper looper) {
        super(looper);
        this.f134972a = i5Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        if (i17 != -1999) {
            if (i17 == -2999) {
                com.p314xaae8f345.mm.app.i5 i5Var = this.f134972a;
                if (i5Var.f134990a) {
                    return;
                }
                i5Var.getClass();
                com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
                if (m78443x9cf0d20b != null) {
                    java.util.HashMap hashMap = m78443x9cf0d20b.f7().f278468o;
                    if (hashMap.containsKey(0)) {
                        ((com.p314xaae8f345.mm.ui.y7) hashMap.get(0)).E();
                    }
                }
                if (gm0.j1.b().m()) {
                    if (i01.b.f368030g == null) {
                        synchronized (i01.b.class) {
                            if (i01.b.f368030g == null) {
                                i01.b.f368030g = new i01.b();
                            }
                        }
                    }
                    i01.b bVar = i01.b.f368030g;
                    bVar.getClass();
                    gm0.j1.e().j(new i01.a(bVar));
                }
                java.lang.System.gc();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.app.i5 i5Var2 = this.f134972a;
        if (i5Var2.f134990a) {
            return;
        }
        i5Var2.getClass();
        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b2 = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
        if (m78443x9cf0d20b2 != null && m78443x9cf0d20b2.f278365o) {
            m78443x9cf0d20b2.f7().o("tab_main");
            com.p314xaae8f345.mm.ui.C21374x812c2fd3 m78446x1cde66a9 = m78443x9cf0d20b2.m78446x1cde66a9();
            if (m78446x1cde66a9.f278275a) {
                m78446x1cde66a9.f278276b = true;
            }
            p94.k0 d17 = p94.w0.d();
            if (d17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1) d17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                i1Var.g();
                i1Var.f245797m = 0L;
                i1Var.f245798n = 0L;
                i1Var.f245791g.clear();
                i1Var.f245792h = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            }
            for (p012xc85e97e9.p093xedfae76a.m1 m1Var : m78443x9cf0d20b2.f7().f278468o.values()) {
                if (!(m1Var instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d)) {
                    ((com.p314xaae8f345.mm.ui.y7) m1Var).E();
                }
            }
        }
        java.lang.System.gc();
    }
}
