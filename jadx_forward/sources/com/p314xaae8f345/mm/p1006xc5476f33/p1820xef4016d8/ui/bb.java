package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class bb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f228284d;

    public bb(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13) {
        this.f228284d = activityC16373x8a110f13;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f228284d;
        int i18 = activityC16373x8a110f13.T;
        gb3.p pVar = gb3.p.f351575a;
        if (itemId == 1) {
            activityC16373x8a110f13.T = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(activityC16373x8a110f13.k7()), 2);
            activityC16373x8a110f13.f227781d2 = 3;
            gb3.p.f351579e = 2;
            pVar.a(12);
        } else if (itemId == 2) {
            activityC16373x8a110f13.T = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(activityC16373x8a110f13.k7()), 3);
            activityC16373x8a110f13.f227781d2 = 2;
            gb3.p.f351579e = 1;
            pVar.a(13);
        } else if (itemId == 3) {
            activityC16373x8a110f13.T = 3;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(activityC16373x8a110f13.k7()), 13);
            activityC16373x8a110f13.f227781d2 = 4;
            gb3.p.f351579e = 3;
            pVar.a(14);
        }
        if (activityC16373x8a110f13.W1 && i18 != activityC16373x8a110f13.T) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22237, 2);
            activityC16373x8a110f13.X1 = true;
        }
        activityC16373x8a110f13.A7(i18);
    }
}
