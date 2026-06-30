package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class s7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.t7 f154336d;

    public s7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.t7 t7Var) {
        this.f154336d = t7Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.util.LinkedList linkedList;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.t7 t7Var = this.f154336d;
        if (itemId == 1) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t7Var.f154350e.I)) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.n4(t7Var.f154350e.I)) {
                    db5.e1.E(t7Var.f154350e.mo55332x76847179(), t7Var.f154350e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kzd), "", t7Var.f154350e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), false, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.q7(this));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "click OptionsMenu launchAAUI");
                    android.content.Intent intent = new android.content.Intent(t7Var.f154350e.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.class);
                    intent.putExtra("enter_scene", 3);
                    intent.putExtra("chatroom_name", t7Var.f154350e.I);
                    com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda = t7Var.f154350e;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activityC11355x7bcfecda, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/PaylistAAUI$6$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC11355x7bcfecda.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activityC11355x7bcfecda, "com/tencent/mm/plugin/aa/ui/PaylistAAUI$6$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            int i18 = t7Var.f154349d.f453501t;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 7, java.lang.Integer.valueOf(i18 == 2 ? 1 : i18 == 1 ? 2 : 3));
        } else if (itemId == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "click OptionsMenu stop AA");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 4, 5, java.lang.Integer.valueOf(t7Var.f154350e.R));
            db5.e1.j(t7Var.f154350e, com.p314xaae8f345.mm.R.C30867xcad56011.f571256w, -1, com.p314xaae8f345.mm.R.C30867xcad56011.f571258y, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.r7(this), null);
        }
        if (menuItem.getItemId() < 4 || (linkedList = t7Var.f154349d.I) == null || linkedList.size() <= 0) {
            return;
        }
        java.util.LinkedList linkedList2 = t7Var.f154349d.I;
        if (menuItem.getItemId() - 4 > linkedList2.size() - 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "oversize  : %s ,size :%s", java.lang.Integer.valueOf(menuItem.getItemId()), java.lang.Integer.valueOf(linkedList2.size()));
            return;
        }
        r45.h0 h0Var = (r45.h0) linkedList2.get(menuItem.getItemId() - 4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "click option item : %s ,type:%s", h0Var.f457231d, java.lang.Integer.valueOf(h0Var.f457232e.f457227d));
        r45.h hVar = h0Var.f457232e;
        int i19 = hVar.f457227d;
        if (i19 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "textInfo.jumpInfo.url ：%s", hVar.f457228e);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(t7Var.f154350e.mo55332x76847179(), h0Var.f457232e.f457228e, false);
        } else if (i19 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "textInfo.jumpInfo.username ：%s", hVar.f457229f);
            r45.h hVar2 = h0Var.f457232e;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(hVar2.f457229f, hVar2.f457230g, 0, 1000);
        } else if (i19 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.PaylistAAUI", "unknow text info type");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.PaylistAAUI", "text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
        }
    }
}
