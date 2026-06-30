package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class y0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 f182350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c f182351e;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var) {
        this.f182351e = activityC13591xdaafa82c;
        this.f182350d = a1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var = this.f182350d;
        java.lang.String x17 = o72.x1.x(a1Var.f182216a);
        if (!com.p314xaae8f345.mm.vfs.w6.j(x17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteImgDetailUI", "file not exists");
            return;
        }
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c = this.f182351e;
        if (itemId == 1) {
            o72.x1.K0(x17, activityC13591xdaafa82c.mo55332x76847179());
            activityC13591xdaafa82c.X6(activityC13591xdaafa82c.f182160o.f67645x88be67a1, 0, 0);
            return;
        }
        if (itemId == 2) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(x17)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("select_is_ret", true);
                j45.l.v(activityC13591xdaafa82c, ".ui.transmit.SelectConversationUI", intent, 1);
            } else {
                o72.x1.J0(x17, activityC13591xdaafa82c.mo55332x76847179(), a1Var.f182216a.f456964q2);
            }
            activityC13591xdaafa82c.X6(activityC13591xdaafa82c.f182160o.f67645x88be67a1, 1, 0);
            return;
        }
        if (itemId != 3) {
            return;
        }
        java.lang.String string = activityC13591xdaafa82c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccq);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13591xdaafa82c.mo55332x76847179();
        java.lang.String str = a1Var.f182216a.f456964q2;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c.f182157w;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteImgDetailUI", "save image fail, path is null");
            return;
        }
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(mo55332x76847179, x17, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.i0(mo55332x76847179, str, string));
    }
}
