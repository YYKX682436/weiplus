package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes9.dex */
public class g implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17114xc078d367 f238201d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17114xc078d367 activityC17114xc078d367) {
        this.f238201d = activityC17114xc078d367;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17114xc078d367 activityC17114xc078d367 = this.f238201d;
        android.app.Dialog dialog = activityC17114xc078d367.f238093g;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        activityC17114xc078d367.f238093g.dismiss();
    }
}
