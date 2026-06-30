package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class n implements h45.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde f260321a;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde activityC19033x1e329dde) {
        this.f260321a = activityC19033x1e329dde;
    }

    public void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde activityC19033x1e329dde = this.f260321a;
        if (str == null || str2 == null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("is_new_cashier", true);
            activityC19033x1e329dde.setResult(0, intent);
            activityC19033x1e329dde.finish();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("token", str);
        intent2.putExtra("bind_serial", str2);
        intent2.putExtra("is_new_cashier", true);
        activityC19033x1e329dde.setResult(-1, intent2);
        activityC19033x1e329dde.finish();
    }
}
