package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.l f223110d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.l lVar) {
        this.f223110d = lVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        m53.t1 t1Var;
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMsgCenterUI", "bottomSheet itemId:%d", java.lang.Integer.valueOf(menuItem.getItemId()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.l lVar = this.f223110d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(lVar.f223112d.mo55332x76847179());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.A = false;
        i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        aVar.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.f(this);
        java.util.HashMap hashMap = new java.util.HashMap();
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.ActivityC16014x161f98d8 activityC16014x161f98d8 = lVar.f223112d;
        if (itemId == 0) {
            i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.flc);
            i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl);
            aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.h(this, hashMap);
            aVar.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.g(this, hashMap);
            i0Var.a().show();
            hashMap.put("tab", "1");
            hashMap.put("actionstatus", "2");
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(activityC16014x161f98d8.mo55332x76847179(), 13, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.z.f34529x366c91de, 1, 2, activityC16014x161f98d8.f223013d, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.b(hashMap));
            return;
        }
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.fle);
            i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl);
            aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.j(this, hashMap);
            aVar.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.i(this, hashMap);
            i0Var.a().show();
            hashMap.put("tab", "2");
            hashMap.put("actionstatus", "2");
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(activityC16014x161f98d8.mo55332x76847179(), 13, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.z.f34529x366c91de, 1, 2, activityC16014x161f98d8.f223013d, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.b(hashMap));
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.e() != null) {
            t1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a.f36957xece5c2e4;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.s();
            t1Var = null;
        }
        if (t1Var != null) {
            java.util.LinkedList linkedList = t1Var.f405602d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    m53.o3 o3Var = (m53.o3) it.next();
                    if (o3Var.f405471d == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o3Var.f405473f)) {
                        str = o3Var.f405473f;
                        break;
                    }
                }
            }
        }
        str = "https://game.weixin.qq.com/cgi-bin/h5/static/gamecenter/subscription_list.html?wechat_pkgid=gamecenter_subscription_list&ssid=5";
        r53.f.u(activityC16014x161f98d8.mo55332x76847179(), str);
        hashMap.put("tab", "2");
        hashMap.put("actionstatus", "1");
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(activityC16014x161f98d8.mo55332x76847179(), 13, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.z.f34529x366c91de, 1, 2, activityC16014x161f98d8.f223013d, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.b(hashMap));
    }
}
