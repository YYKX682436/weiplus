package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class nc implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f290944d;

    public nc(android.app.Activity activity) {
        this.f290944d = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 37L, 1L, true);
        android.app.Activity activity = this.f290944d;
        activity.finish();
        com.p314xaae8f345.mm.ui.vb.c(activity);
    }
}
