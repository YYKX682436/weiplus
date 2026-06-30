package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class x2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16141x4dcd32b5 f224602d;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16141x4dcd32b5 activityC16141x4dcd32b5) {
        this.f224602d = activityC16141x4dcd32b5;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16141x4dcd32b5 activityC16141x4dcd32b5 = this.f224602d;
        try {
            if (activityC16141x4dcd32b5.f224180i != null) {
                c01.d9.e().d(activityC16141x4dcd32b5.f224180i);
            }
            activityC16141x4dcd32b5.finish();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallPackageUI", "cancel getPackageProductListNetScene error: %s", e17.getMessage());
        }
    }
}
