package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class s7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.t7 f72803d;

    public s7(com.tencent.mm.plugin.aa.ui.t7 t7Var) {
        this.f72803d = t7Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.util.LinkedList linkedList;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.aa.ui.t7 t7Var = this.f72803d;
        if (itemId == 1) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(t7Var.f72817e.I)) {
                if (com.tencent.mm.storage.z3.n4(t7Var.f72817e.I)) {
                    db5.e1.E(t7Var.f72817e.getContext(), t7Var.f72817e.getString(com.tencent.mm.R.string.kzd), "", t7Var.f72817e.getString(com.tencent.mm.R.string.l_e), false, new com.tencent.mm.plugin.aa.ui.q7(this));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "click OptionsMenu launchAAUI");
                    android.content.Intent intent = new android.content.Intent(t7Var.f72817e.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.aa.ui.LaunchAAUI.class);
                    intent.putExtra("enter_scene", 3);
                    intent.putExtra("chatroom_name", t7Var.f72817e.I);
                    com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = t7Var.f72817e;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(paylistAAUI, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/PaylistAAUI$6$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    paylistAAUI.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(paylistAAUI, "com/tencent/mm/plugin/aa/ui/PaylistAAUI$6$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            int i18 = t7Var.f72816d.f371968t;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 7, java.lang.Integer.valueOf(i18 == 2 ? 1 : i18 == 1 ? 2 : 3));
        } else if (itemId == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "click OptionsMenu stop AA");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 4, 5, java.lang.Integer.valueOf(t7Var.f72817e.R));
            db5.e1.j(t7Var.f72817e, com.tencent.mm.R.string.f489723w, -1, com.tencent.mm.R.string.f489725y, com.tencent.mm.R.string.f490347sg, new com.tencent.mm.plugin.aa.ui.r7(this), null);
        }
        if (menuItem.getItemId() < 4 || (linkedList = t7Var.f72816d.I) == null || linkedList.size() <= 0) {
            return;
        }
        java.util.LinkedList linkedList2 = t7Var.f72816d.I;
        if (menuItem.getItemId() - 4 > linkedList2.size() - 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "oversize  : %s ,size :%s", java.lang.Integer.valueOf(menuItem.getItemId()), java.lang.Integer.valueOf(linkedList2.size()));
            return;
        }
        r45.h0 h0Var = (r45.h0) linkedList2.get(menuItem.getItemId() - 4);
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "click option item : %s ,type:%s", h0Var.f375698d, java.lang.Integer.valueOf(h0Var.f375699e.f375694d));
        r45.h hVar = h0Var.f375699e;
        int i19 = hVar.f375694d;
        if (i19 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "textInfo.jumpInfo.url ：%s", hVar.f375695e);
            com.tencent.mm.wallet_core.ui.r1.V(t7Var.f72817e.getContext(), h0Var.f375699e.f375695e, false);
        } else if (i19 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "textInfo.jumpInfo.username ：%s", hVar.f375696f);
            r45.h hVar2 = h0Var.f375699e;
            com.tencent.mm.wallet_core.ui.r1.b0(hVar2.f375696f, hVar2.f375697g, 0, 1000);
        } else if (i19 != 3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Aa.PaylistAAUI", "unknow text info type");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Aa.PaylistAAUI", "text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
        }
    }
}
