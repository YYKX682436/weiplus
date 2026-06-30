package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes.dex */
public class r3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 f224528d;

    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980) {
        this.f224528d = activityC16143x7673980;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980 = this.f224528d;
        try {
            if (activityC16143x7673980.f224200w != null) {
                c01.d9.e().d(activityC16143x7673980.f224200w);
            }
            activityC16143x7673980.finish();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallRechargeUI", "cancel getProductListScene error: %s", e17.getMessage());
        }
    }
}
