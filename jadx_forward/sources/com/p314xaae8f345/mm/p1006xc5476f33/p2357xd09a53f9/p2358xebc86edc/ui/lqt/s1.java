package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class s1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.t1 f259896d;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.t1 t1Var) {
        this.f259896d = t1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.du4 du4Var;
        int i18;
        java.lang.String string;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.t1 t1Var = this.f259896d;
        if (itemId == -1) {
            r45.zg5 zg5Var = t1Var.f259904d.f259485f;
            if (!zg5Var.B) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zg5Var.I)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b = t1Var.f259904d;
                    string = activityC19013x23c3e97b.f259485f.C == 0 ? activityC19013x23c3e97b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.koz) : activityC19013x23c3e97b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.koj);
                } else {
                    string = t1Var.f259904d.f259485f.I;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b2 = t1Var.f259904d;
                db5.e1.y(activityC19013x23c3e97b2, string, "", activityC19013x23c3e97b2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9a), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.r1(this));
                return;
            }
        }
        java.util.LinkedList linkedList = t1Var.f259904d.f259485f.U;
        if (linkedList == null || linkedList.size() <= 0 || menuItem.getItemId() >= t1Var.f259904d.f259485f.U.size() || (i18 = (du4Var = (r45.du4) t1Var.f259904d.f259485f.U.get(menuItem.getItemId())).f454285h) == 1) {
            return;
        }
        if (i18 == 2) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du4Var.f454283f)) {
                return;
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.X(t1Var.f259904d, du4Var.f454283f, false);
        } else {
            if (i18 != 3 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du4Var.f454286i) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du4Var.f454283f)) {
                return;
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(du4Var.f454286i, du4Var.f454283f, 0, 1061);
        }
    }
}
