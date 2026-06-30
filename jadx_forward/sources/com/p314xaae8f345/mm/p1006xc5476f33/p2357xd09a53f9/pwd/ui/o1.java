package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class o1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19052xb1f1fd70 f260575d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19052xb1f1fd70 activityC19052xb1f1fd70) {
        this.f260575d = activityC19052xb1f1fd70;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.app.Dialog dialog = this.f260575d.f260469y;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
