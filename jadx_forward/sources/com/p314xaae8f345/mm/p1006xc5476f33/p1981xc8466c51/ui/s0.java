package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class s0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.t0 f237012d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.t0 t0Var) {
        this.f237012d = t0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.t0 t0Var = this.f237012d;
        if (itemId == 0) {
            if (((java.lang.Boolean) c01.d9.b().p().l(327714, java.lang.Boolean.FALSE)).booleanValue()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15.i7(t0Var.f237019e);
            } else {
                c01.d9.b().p().w(327714, java.lang.Boolean.TRUE);
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c15 = t0Var.f237019e;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                aVar.f293262s = t0Var.f237019e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574313hu2);
                aVar.f293242a = t0Var.f237019e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                aVar.f293265v = of5.b.a(activityC16966x2b279c15).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1);
                aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.r0(this);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(activityC16966x2b279c15, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                j0Var.e(aVar);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f293370r);
                }
                j0Var.show();
            }
            com.p314xaae8f345.mm.p959x883644fd.b.b(t0Var.f237019e.f236811w, 2);
            return;
        }
        if (itemId == 2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c152 = t0Var.f237019e;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.i(c5303xc75d2f73, activityC16966x2b279c152.f236812x, activityC16966x2b279c152.f236813y);
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87860m = 9;
            c4Var.f87856i = t0Var.f237019e;
            c5303xc75d2f73.e();
            return;
        }
        if (itemId != 3) {
            return;
        }
        android.content.Intent putExtra = new android.content.Intent(t0Var.f237019e, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class).putExtra("msg_local_id", t0Var.f237019e.f236812x).putExtra("finish_direct", true).putExtra("show_search_chat_content_result", true).putExtra("need_hight_item", true).putExtra("Chat_User", t0Var.f237019e.f236811w.Q0());
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c153 = t0Var.f237019e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16966x2b279c153, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgDetailUI$4$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16966x2b279c153.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16966x2b279c153, "com/tencent/mm/plugin/record/ui/RecordMsgDetailUI$4$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
