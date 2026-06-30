package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class l4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n85 f259792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 f259793e;

    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 activityC19016xf99a44c4, r45.n85 n85Var) {
        this.f259793e = activityC19016xf99a44c4;
        this.f259792d = n85Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        r45.n85 n85Var = this.f259792d;
        r45.dn4 dn4Var = n85Var.f462704o;
        if (dn4Var != null) {
            boolean z17 = dn4Var.f454128d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 activityC19016xf99a44c4 = this.f259793e;
            if (!z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dn4Var.f454129e)) {
                java.util.LinkedList linkedList = n85Var.f462704o.f454130f;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4.D;
                activityC19016xf99a44c4.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanDetailUI", "show operation menu: %s", linkedList);
                if (linkedList != null && !linkedList.isEmpty()) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC19016xf99a44c4.mo55332x76847179(), 1, false);
                    k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.m4(activityC19016xf99a44c4, linkedList);
                    k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.p4(activityC19016xf99a44c4, n85Var);
                    k0Var.v();
                }
            } else {
                db5.e1.y(activityC19016xf99a44c4.mo55332x76847179(), n85Var.f462704o.f454129e, "", activityC19016xf99a44c4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.k4(this));
            }
        }
        return false;
    }
}
