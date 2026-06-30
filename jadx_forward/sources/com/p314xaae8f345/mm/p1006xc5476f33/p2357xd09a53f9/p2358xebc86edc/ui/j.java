package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class j implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.k f259438d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.k kVar) {
        this.f259438d = kVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.k kVar = this.f259438d;
        at4.e[] eVarArr = kVar.f259441d.f95375j.f95348a;
        if (eVarArr == null || itemId >= eVarArr.length) {
            return;
        }
        at4.e eVar = eVarArr[itemId];
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "jump type: %s, url: %s", java.lang.Integer.valueOf(eVar.f95360c), eVar.f95361d);
        int i18 = eVar.f95360c;
        if (i18 == 1) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(kVar.f259442e.mo55332x76847179(), eVar.f95361d, true);
        } else {
            if (i18 != 2) {
                return;
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(eVar.f95362e, eVar.f95363f, 0, 1000);
        }
    }
}
