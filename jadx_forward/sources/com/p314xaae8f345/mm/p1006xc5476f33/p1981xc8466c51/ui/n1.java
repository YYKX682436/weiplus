package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class n1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf f236990d;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf) {
        this.f236990d = activityC16972xc3ec91bf;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf = this.f236990d;
        if (itemId == 0) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf.f236842J;
            activityC16972xc3ec91bf.f236852p = activityC16972xc3ec91bf.W6();
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            jd5.a aVar = new jd5.a();
            java.lang.String str = activityC16972xc3ec91bf.f236852p;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            aVar.p(str != null ? str : "");
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(activityC16972xc3ec91bf, aVar, n13.r.a(1001));
            return;
        }
        if (itemId == 1) {
            activityC16972xc3ec91bf.T6();
            return;
        }
        if (itemId == 2) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf.f236842J;
            activityC16972xc3ec91bf.getClass();
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            java.lang.String W6 = activityC16972xc3ec91bf.W6();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16972xc3ec91bf.mo55332x76847179();
            ((ub0.r) oVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.a(W6, mo55332x76847179, null);
            return;
        }
        if (itemId == 4) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContextTranslate.k(activityC16972xc3ec91bf.mo55332x76847179(), null)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85 c6631xd817ea85 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85();
                c6631xd817ea85.f139850e = 3L;
                c6631xd817ea85.f139851f = 5L;
                int selectedItemPosition = activityC16972xc3ec91bf.f236847h.getSelectedItemPosition();
                if (-1 != selectedItemPosition) {
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = activityC16972xc3ec91bf.f236848i.getItem(selectedItemPosition);
                    c6631xd817ea85.q(item.f());
                    c6631xd817ea85.p(item.e());
                }
                c6631xd817ea85.k();
                activityC16972xc3ec91bf.f236858v.a();
                return;
            }
            return;
        }
        if (itemId != 5) {
            return;
        }
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf.f236842J;
        java.lang.String W62 = activityC16972xc3ec91bf.W6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShowImageUI", "edit image path:%s msgId:%s", W62, java.lang.Long.valueOf(activityC16972xc3ec91bf.f236850n));
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.b(W62, "");
        b17.F = 0;
        com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
        java.util.Map map = c10402x5bc41468.f146312h;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        hashMap.put("plugin_filter", bool);
        hashMap.put("plugin_poi", bool);
        hashMap.put("plugin_tip", bool);
        hashMap.put("plugin_menu", bool);
        b17.f237210o = c10402x5bc41468;
        ut3.m.f512715a.f(activityC16972xc3ec91bf.mo55332x76847179(), 4369, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, -1, b17, 1, 2);
    }
}
