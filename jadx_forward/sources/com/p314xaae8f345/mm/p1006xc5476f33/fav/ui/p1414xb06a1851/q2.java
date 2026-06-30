package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class q2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.r2 f182316d;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.r2 r2Var) {
        this.f182316d = r2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.r2 r2Var = this.f182316d;
        if (itemId == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 2);
            intent.putExtra("key_fav_item_id", r2Var.f182322d.f182210m.f67645x88be67a1);
            o72.x1.L0(r2Var.f182322d.mo55332x76847179(), ".ui.FavTagEditUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13596x43b3799b activityC13596x43b3799b = r2Var.f182322d;
            activityC13596x43b3799b.f182133g.f425023o++;
            activityC13596x43b3799b.U6(7);
            return;
        }
        if (itemId == 1) {
            db5.e1.u(r2Var.f182322d.mo55332x76847179(), r2Var.f182322d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571902t2), "", new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.p2(this), null);
            r2Var.f182322d.U6(6);
        } else {
            if (itemId != 2) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13596x43b3799b activityC13596x43b3799b2 = r2Var.f182322d;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b4.b(activityC13596x43b3799b2, activityC13596x43b3799b2.f182211n, activityC13596x43b3799b2.f182133g);
            r2Var.f182322d.U6(5);
        }
    }
}
