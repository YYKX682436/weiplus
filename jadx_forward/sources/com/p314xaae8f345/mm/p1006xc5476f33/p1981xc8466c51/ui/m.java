package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class m implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.n f236982d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.n nVar) {
        this.f236982d = nVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.n nVar = this.f236982d;
        if (itemId != 0) {
            if (itemId == 2) {
                db5.e1.u(nVar.f236988d.mo55332x76847179(), nVar.f236988d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571902t2), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l(this), null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16963xe302cdf1 activityC16963xe302cdf1 = nVar.f236988d;
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16963xe302cdf1.C;
                activityC16963xe302cdf1.U6(6);
                return;
            }
            if (itemId == 3) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_fav_scene", 2);
                intent.putExtra("key_fav_item_id", nVar.f236988d.f236791v);
                o72.x1.L0(nVar.f236988d.mo55332x76847179(), ".ui.FavTagEditUI", intent, null);
                nVar.f236988d.U6(7);
                return;
            }
            if (itemId == 4) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_fav_scene", 1);
                intent2.putExtra("key_fav_item_id", nVar.f236988d.f236793x.f67645x88be67a1);
                o72.x1.L0(nVar.f236988d.mo55332x76847179(), ".ui.FavTagEditUI", intent2, null);
                return;
            }
            if (itemId != 5) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16963xe302cdf1 activityC16963xe302cdf12 = nVar.f236988d;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b4.b(activityC16963xe302cdf12, activityC16963xe302cdf12.f236791v, activityC16963xe302cdf12.f182133g);
            nVar.f236988d.U6(5);
            return;
        }
        long i27 = ip.c.i();
        if (nVar.f236988d.f236793x.f67657x2262335f == 18) {
            i27 = ip.c.h();
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.c_t;
        } else {
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.c_u;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16963xe302cdf1 activityC16963xe302cdf13 = nVar.f236988d;
        long j17 = activityC16963xe302cdf13.f236793x.f67645x88be67a1;
        activityC16963xe302cdf13.getClass();
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
        long j18 = F != null ? F.f67637x73e2be56 : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavRecordDetailUI", "checkIfOverTotalSizeLimit, totalSize:%s", java.lang.Long.valueOf(j18));
        if (j18 > i27) {
            db5.e1.T(nVar.f236988d.mo55332x76847179(), nVar.f236988d.getString(i18, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(i27)));
            return;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        co.a a17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i3.f182693a.a(nVar.f236988d.f236793x);
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16963xe302cdf1 activityC16963xe302cdf14 = nVar.f236988d;
        n13.r a18 = n13.r.a(4097);
        a18.f415653d.f415672a = 6;
        ((dk5.b0) b0Var).Bi(activityC16963xe302cdf14, a17, a18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16963xe302cdf1 activityC16963xe302cdf15 = nVar.f236988d;
        activityC16963xe302cdf15.X6(activityC16963xe302cdf15.f236793x.f67645x88be67a1, 1, 0);
        nVar.f236988d.U6(3);
    }
}
