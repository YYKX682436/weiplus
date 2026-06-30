package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes3.dex */
public class o1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.du4 f259830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b f259831e;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b, r45.du4 du4Var) {
        this.f259831e = activityC19013x23c3e97b;
        this.f259830d = du4Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        r45.du4 du4Var = this.f259830d;
        int i17 = du4Var.f454285h;
        if (i17 != 1) {
            if (i17 == 2) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du4Var.f454283f)) {
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.X(this.f259831e, du4Var.f454283f, false);
                }
            } else if (i17 == 3 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du4Var.f454286i) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du4Var.f454283f)) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(du4Var.f454286i, du4Var.f454283f, 0, 1061);
            }
        }
        return false;
    }
}
