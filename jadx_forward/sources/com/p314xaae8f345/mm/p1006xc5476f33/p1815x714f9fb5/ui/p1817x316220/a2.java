package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes8.dex */
public class a2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 f226282d;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 y1Var) {
        this.f226282d = y1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 y1Var = this.f226282d;
        if (itemId != 2) {
            if (java.util.Objects.equals(menuItem.getTitle(), y1Var.f226261d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bry))) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Retr_Msg_content", va3.w.b(y1Var.f226264g));
                intent.putExtra("Retr_Msg_Id", y1Var.f226409y);
                intent.putExtra("Retr_Msg_Type", 48);
                intent.putExtra("Retr_MsgTalker", y1Var.f226273s);
                j45.l.u(y1Var.f226261d, ".ui.chatting.ChattingSendDataToDeviceUI", intent, null);
                return;
            }
            java.util.Map map = y1Var.X;
            if (map != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    if (((java.lang.String) entry.getValue()).equals(menuItem.getTitle())) {
                        y1Var.f226262e.g(y1Var.f226264g, y1Var.f226265h, (java.lang.String) entry.getKey(), false, true);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 4, entry.getKey());
                        return;
                    }
                }
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackMapUI", "click tencent map: %s", java.lang.Boolean.valueOf(y1Var.X.containsKey("com.tencent.map")));
        boolean containsKey = y1Var.X.containsKey("com.tencent.map");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackMapUI", "install tencent map: %s.", java.lang.Boolean.valueOf(containsKey));
        if (containsKey) {
            y1Var.f226262e.g(y1Var.f226264g, y1Var.f226265h, "com.tencent.map", false, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 4, "com.tencent.map");
            return;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_tencent_map_show_max_limit, 99);
        int i18 = y1Var.Y;
        if (i18 < Ni) {
            y1Var.Y = i18 + 1;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TENCENT_MAP_COUNT_INT, java.lang.Integer.valueOf(y1Var.Y));
        }
        boolean z17 = 1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_tencent_map_download_page_direct, 0);
        android.app.Activity activity = y1Var.f226261d;
        if (z17) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.n2(activity, y1Var.f226484p1).execute(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1.f226481y1);
            return;
        }
        gw4.f fVar = new gw4.f(activity);
        fVar.f357690b = "mmdownloadapp_JjNedmtv7FDUquSYR5";
        ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 5);
    }
}
