package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes8.dex */
public class x0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19105x556d812f f262318d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19105x556d812f activityC19105x556d812f) {
        this.f262318d = activityC19105x556d812f;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19105x556d812f activityC19105x556d812f = this.f262318d;
        intent.putExtra("bank_card_acc_name", activityC19105x556d812f.f261387e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WalletBankCardTypeSelectUI", "item bank: %s", activityC19105x556d812f.f261387e);
        activityC19105x556d812f.setResult(-1, intent);
        activityC19105x556d812f.finish();
        return true;
    }
}
