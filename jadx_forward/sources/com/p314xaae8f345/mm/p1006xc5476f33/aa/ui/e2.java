package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class e2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11346x37ff56a6 f154156d;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11346x37ff56a6 activityC11346x37ff56a6) {
        this.f154156d = activityC11346x37ff56a6;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11346x37ff56a6 activityC11346x37ff56a6 = this.f154156d;
        android.app.Dialog dialog = activityC11346x37ff56a6.f154008d;
        if (dialog != null && dialog.isShowing()) {
            activityC11346x37ff56a6.f154008d.dismiss();
        }
        activityC11346x37ff56a6.finish();
    }
}
