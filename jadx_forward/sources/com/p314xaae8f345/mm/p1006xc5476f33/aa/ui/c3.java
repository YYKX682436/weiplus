package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class c3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p13.c f154123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154124e;

    public c3(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907, p13.c cVar) {
        this.f154124e = activityC11351x975a7907;
        this.f154123d = cVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154124e;
        android.app.Dialog dialog = activityC11351x975a7907.A1;
        if (dialog != null && dialog.isShowing()) {
            activityC11351x975a7907.A1.dismiss();
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f154123d);
        activityC11351x975a7907.B1 = false;
    }
}
