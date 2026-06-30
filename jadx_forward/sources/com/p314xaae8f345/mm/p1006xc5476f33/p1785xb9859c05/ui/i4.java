package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes4.dex */
public class i4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144 f224405d;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144 activityC16145xcc3dc144) {
        this.f224405d = activityC16145xcc3dc144;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        try {
            this.f224405d.finish();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallShareCouponCardUI", "loadFromSystemAddressBook error: %s", e17.getMessage());
        }
    }
}
