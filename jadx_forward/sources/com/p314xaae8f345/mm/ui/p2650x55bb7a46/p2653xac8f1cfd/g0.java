package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public final class g0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h0 f280605d;

    public g0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h0 h0Var) {
        this.f280605d = h0Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h0 h0Var = this.f280605d;
        if (itemId == 6) {
            h0Var.getClass();
            try {
                android.app.Activity g17 = h0Var.f280113d.g();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
                sw.a.a(g17, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsComponent", "openBrandEcsNotifySettingUI success");
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                if (rVar == null) {
                    return true;
                }
                ((cy1.a) rVar).Bj("ecs_tl_notification_setting", "view_clk", kz5.q0.f395534d, 12, false);
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandEcsComponent", "openBrandEcsNotifySettingUI failed: " + e17.getMessage());
                return true;
            }
        }
        if (itemId != 7) {
            return false;
        }
        h0Var.getClass();
        try {
            android.app.Activity context = h0Var.f280113d.g();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsComponent", "openBrandServiceConversationList");
            ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
            if (c20976x6ba6452a == null) {
                return true;
            }
            v65.i.c(c20976x6ba6452a, null, new zv.z1(context, null), 1, null);
            return true;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandEcsComponent", "openBrandServiceConversationList failed: " + e18.getMessage());
            return true;
        }
    }
}
