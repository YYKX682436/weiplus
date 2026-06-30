package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes.dex */
public class t2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16140x55b9c685 f224544d;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16140x55b9c685 activityC16140x55b9c685) {
        this.f224544d = activityC16140x55b9c685;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16140x55b9c685 activityC16140x55b9c685 = this.f224544d;
        try {
            if (activityC16140x55b9c685.f224174h != null) {
                c01.d9.e().d(activityC16140x55b9c685.f224174h);
            }
            activityC16140x55b9c685.finish();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallMyGiftCardUI", "cancel getProductListScene error: %s", e17.getMessage());
        }
    }
}
