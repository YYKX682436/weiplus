package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class o implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11339x6e0beaf2 f154284d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11339x6e0beaf2 activityC11339x6e0beaf2) {
        this.f154284d = activityC11339x6e0beaf2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11339x6e0beaf2 activityC11339x6e0beaf2 = this.f154284d;
        android.app.Dialog dialog = activityC11339x6e0beaf2.f153968i;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        activityC11339x6e0beaf2.f153968i.dismiss();
    }
}
