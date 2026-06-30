package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f268266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f268267e;

    public o8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, android.os.Bundle bundle) {
        this.f268266d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f268267e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268266d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing() || (bundle = this.f268267e) == null) {
            return;
        }
        java.lang.String string = bundle.getString("key_bag_icon");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef c16092xbbe22aef = viewOnCreateContextMenuListenerC19337x37f3384d.f265397v2;
            if (c16092xbbe22aef != null) {
                c16092xbbe22aef.m65137x764b6bfb(string == null ? "" : string);
            }
            vx4.d dVar = viewOnCreateContextMenuListenerC19337x37f3384d.F2;
            if (dVar != null) {
                dVar.K(string);
            }
            viewOnCreateContextMenuListenerC19337x37f3384d.f265407y2.X(string);
        }
        java.lang.String string2 = bundle.getString("key_brand_name");
        java.lang.String string3 = bundle.getString("key_brand_user_name");
        java.lang.String string4 = bundle.getString("key_title");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
            viewOnCreateContextMenuListenerC19337x37f3384d.getIntent().putExtra("srcUsername", string3);
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.getIntent().putExtra("show_forward_mp", bundle.getBoolean("show_forward_mp"));
        viewOnCreateContextMenuListenerC19337x37f3384d.getIntent().putExtra("show_mp_page_new_font", bundle.getBoolean("key_mp_page_new_font"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FloatBall", "currentMpInfo, brandName:%s, title:%s", string2, string4);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265399w2;
        if (ldVar != null) {
            java.lang.String string5 = bundle.getString("key_url");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string5)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUIStyleHelper", "updateCurrentInfo url is null");
            } else {
                java.lang.String f17 = ldVar.f(string5);
                java.util.HashMap hashMap = (java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld.f267182s;
                android.os.Bundle bundle2 = (android.os.Bundle) hashMap.get(f17);
                if (bundle2 == null) {
                    hashMap.put(f17, bundle);
                } else {
                    bundle.putBoolean("key_current_info_show", bundle2.getBoolean("key_current_info_show"));
                    hashMap.put(f17, bundle);
                }
                if (bundle.getBoolean("key_show_live_top_bar", true) && ldVar.k() && ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(string5)) {
                    if (ldVar.i(bundle)) {
                        ldVar.q();
                    }
                    ldVar.r(bundle.getString("key_brand_user_name"));
                } else {
                    ldVar.n();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var = viewOnCreateContextMenuListenerC19337x37f3384d.f265379p2;
        if (b5Var != null) {
            ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.f265461u).put(b5Var.m(b5Var.f265474i), java.lang.Boolean.valueOf(bundle.getBoolean("key_forbidForward")));
            boolean z17 = bundle.getBoolean("key_enable_share_image_watermark", false);
            if (b5Var.f265474i.isEmpty()) {
                b5Var.f265474i = b5Var.j();
            }
            ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.f265462v).put(b5Var.m(b5Var.f265474i), new r01.h0(b5Var.m(b5Var.f265474i), z17, bundle.getString("key_brand_name", ""), bundle.getString("key_alias", ""), bundle.getInt("key_brand_service_type", 0), bundle.getInt("key_image_watermark_type", 0), bundle.getString("key_share_image_watermark_params", ""), bundle.getString("key_brand_user_name", ""), bundle.getString("key_title", ""), bundle.getInt("key_item_show_type", -1)));
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.b7();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4) && viewOnCreateContextMenuListenerC19337x37f3384d.m78518x4c0ad082() != null) {
            string4 = viewOnCreateContextMenuListenerC19337x37f3384d.m78518x4c0ad082().toString();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = viewOnCreateContextMenuListenerC19337x37f3384d.f265407y2.f174665d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c12886x91aa2b6d != null ? c12886x91aa2b6d.f174596x : null)) {
                viewOnCreateContextMenuListenerC19337x37f3384d.f265407y2.Z(string2);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnCreateContextMenuListenerC19337x37f3384d.F2.C.m75945x2fec8307(4))) {
                viewOnCreateContextMenuListenerC19337x37f3384d.F2.L(string2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef c16092xbbe22aef2 = viewOnCreateContextMenuListenerC19337x37f3384d.f265397v2;
            if (c16092xbbe22aef2 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16092xbbe22aef2.getTitle()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                viewOnCreateContextMenuListenerC19337x37f3384d.f265397v2.m65139x53bfe316(string2);
            }
        } else {
            vx4.d dVar2 = viewOnCreateContextMenuListenerC19337x37f3384d.F2;
            if (dVar2 != null) {
                dVar2.L(string4);
            }
            viewOnCreateContextMenuListenerC19337x37f3384d.f265407y2.Z(string4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef c16092xbbe22aef3 = viewOnCreateContextMenuListenerC19337x37f3384d.f265397v2;
            if (c16092xbbe22aef3 != null) {
                c16092xbbe22aef3.m65139x53bfe316(string4);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            vx4.d dVar3 = viewOnCreateContextMenuListenerC19337x37f3384d.F2;
            if (dVar3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = dVar3.f381610a;
                r45.lr4 v07 = c16601x7ed0e40c != null ? c16601x7ed0e40c.v0() : null;
                if (v07 != null) {
                    v07.set(0, string2);
                }
                dVar3.I();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef c16092xbbe22aef4 = viewOnCreateContextMenuListenerC19337x37f3384d.f265397v2;
            if (c16092xbbe22aef4 != null) {
                c16092xbbe22aef4.m65037x82d0cf66(string2);
            }
        }
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265397v2 != null) {
            ((d73.i) i95.n0.c(d73.i.class)).Jc(viewOnCreateContextMenuListenerC19337x37f3384d.f265397v2);
        }
        java.lang.String string6 = bundle.getString("key_menu_recent_read_url", "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string6)) {
            viewOnCreateContextMenuListenerC19337x37f3384d.f265382q2.f265602z = string6;
        }
        java.lang.String string7 = bundle.getString("key_menu_underline_url", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string7)) {
            return;
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.f265382q2.A = string7;
    }
}
