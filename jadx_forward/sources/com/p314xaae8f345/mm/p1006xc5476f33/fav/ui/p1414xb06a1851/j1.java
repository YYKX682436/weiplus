package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class j1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.k1 f182279d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.k1 k1Var) {
        this.f182279d = k1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.k1 k1Var = this.f182279d;
        if (itemId == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13592x95a8d706 activityC13592x95a8d706 = k1Var.f182283d;
            activityC13592x95a8d706.X6(activityC13592x95a8d706.f182174r.f67645x88be67a1, 1, 0);
            android.content.Intent intent = new android.content.Intent();
            o72.r3.b(intent, k1Var.f182283d.f182174r);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("scene_from", 1);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("select_fav_local_id", k1Var.f182283d.f182174r.f67645x88be67a1);
            j45.l.v(k1Var.f182283d.mo55332x76847179(), ".ui.transmit.SelectConversationUI", intent, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13592x95a8d706 activityC13592x95a8d7062 = k1Var.f182283d;
            activityC13592x95a8d7062.f182133g.f425020l++;
            activityC13592x95a8d7062.U6(3);
            return;
        }
        if (itemId == 2) {
            db5.e1.u(k1Var.f182283d.mo55332x76847179(), k1Var.f182283d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571902t2), "", new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.i1(this), null);
            k1Var.f182283d.U6(6);
            return;
        }
        if (itemId != 3) {
            if (itemId != 4) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13592x95a8d706 activityC13592x95a8d7063 = k1Var.f182283d;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b4.b(activityC13592x95a8d7063, activityC13592x95a8d7063.f182176t, activityC13592x95a8d7063.f182133g);
            k1Var.f182283d.U6(5);
            return;
        }
        k1Var.f182283d.f182133g.f425023o++;
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_fav_scene", 2);
        intent2.putExtra("key_fav_item_id", k1Var.f182283d.f182174r.f67645x88be67a1);
        o72.x1.L0(k1Var.f182283d.mo55332x76847179(), ".ui.FavTagEditUI", intent2, null);
        k1Var.f182283d.U6(7);
    }
}
