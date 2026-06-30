package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes5.dex */
public class t4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.y4 f223297a;

    public t4(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.y4 y4Var) {
        this.f223297a = y4Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z
    public void a(int i17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.y4 y4Var;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w4 w4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar;
        if (!z17 || (concurrentHashMap = (y4Var = this.f223297a).f223414q) == null || str == null) {
            return;
        }
        try {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0 c0Var : concurrentHashMap.values()) {
                if (c0Var != null && (bVar = c0Var.f221774a) != null && (bVar.f67370x28d45f97.equals(str) || bVar.f67386xa1e9e82c.equals(str))) {
                    c0Var.a(y4Var.f223411n);
                    c0Var.b();
                }
            }
            for (int i18 = 0; i18 < y4Var.f222886e.size(); i18++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) y4Var.f222886e.get(i18);
                if (bVar2.f221738h2 == 0 && ((bVar2.f67370x28d45f97.equals(str) || bVar2.f67386xa1e9e82c.equals(str)) && (w4Var = y4Var.f223417t) != null)) {
                    w4Var.a(i18);
                    return;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameListAdapter", e17.getMessage());
        }
    }
}
