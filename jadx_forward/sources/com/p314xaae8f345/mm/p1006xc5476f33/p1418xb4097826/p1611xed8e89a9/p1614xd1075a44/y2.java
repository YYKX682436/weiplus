package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class y2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.z2 f206360d;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.z2 z2Var) {
        this.f206360d = z2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.z2 z2Var = this.f206360d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.i(d2Var, z2Var.f206378a, "profile_cluster_nodisplay", "view_clk", false, z2Var.b(), 8, null);
            z2Var.c().setVisibility(8);
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ((cq.k) c17).f302759g.f323818b;
            if (o4Var != null) {
                o4Var.G("KEY_FINDER_PROFILE_POST_PLAY_BANNER_STATUS", false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HeaderPostPlayBannerWidget", "hide post play banner");
        }
    }
}
