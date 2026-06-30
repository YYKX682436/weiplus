package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class o1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf f236995d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf) {
        this.f236995d = activityC16972xc3ec91bf;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf = this.f236995d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r V6 = activityC16972xc3ec91bf.V6();
        if (V6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShowImageUI", "onMMMenuItemSelected: dataItem is null");
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 1) {
                activityC16972xc3ec91bf.T6();
                return;
            }
            if (itemId != 2) {
                return;
            }
            java.lang.String j17 = V6.j();
            activityC16972xc3ec91bf.getClass();
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Bi(activityC16972xc3ec91bf.mo55332x76847179(), j17, new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1(activityC16972xc3ec91bf, j17));
            return;
        }
        java.lang.String w17 = V6.w();
        java.lang.String j18 = V6.j();
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.c cVar = new jd5.c();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (w17 == null) {
            w17 = "";
        }
        cVar.o(w17);
        if (j18 == null) {
            j18 = "";
        }
        cVar.r(j18);
        cVar.q(V6.m());
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16972xc3ec91bf.mo55332x76847179();
        n13.r a17 = n13.r.a(1);
        a17.f415653d.f415672a = 9;
        ((dk5.b0) b0Var).Bi(mo55332x76847179, cVar, a17);
    }
}
