package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes.dex */
public final class j1 implements com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f259195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f259196b;

    public j1(android.app.Activity activity, android.app.Dialog dialog) {
        this.f259195a = activity;
        this.f259196b = dialog;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c1
    /* renamed from: call */
    public final void mo66254x2e7a5e(java.lang.Object obj) {
        boolean z17 = obj instanceof java.lang.Throwable;
        android.app.Activity activity = this.f259195a;
        java.lang.String message = z17 ? ((java.lang.Throwable) obj).getMessage() : obj instanceof java.lang.String ? obj.toString() : activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kpu);
        android.app.Dialog dialog = this.f259196b;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LqtNativeUrlJumpHandler", "fetch detail failed: " + message);
        dp.a.m125854x26a183b(activity, message, 1).show();
    }
}
