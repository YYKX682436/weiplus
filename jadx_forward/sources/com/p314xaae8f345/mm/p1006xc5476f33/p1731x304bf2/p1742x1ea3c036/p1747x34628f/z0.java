package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f221493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.c1 f221494e;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.c1 c1Var, android.os.Bundle bundle) {
        this.f221494e = c1Var;
        this.f221493d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.c1 c1Var = this.f221494e;
        c1Var.f488188i.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.y0(this));
        java.lang.String string = this.f221493d.getString("KGamePreloadData");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadGameWebPage", "preloadData:%s", string);
            c1Var.o(java.lang.String.format("javascript:(function() {window.__game_center_present_custom_data__=\"%s\";})();", string), null);
        }
        c1Var.o("javascript:(function() {window.__game_center_preload_page_present__=true;})();", null);
    }
}
