package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class l8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11448x932bffb8 f155539d;

    public l8(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11448x932bffb8 activityC11448x932bffb8) {
        this.f155539d = activityC11448x932bffb8;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11448x932bffb8 activityC11448x932bffb8 = this.f155539d;
        activityC11448x932bffb8.f154974e = android.app.ProgressDialog.show(activityC11448x932bffb8, activityC11448x932bffb8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC11448x932bffb8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8e), true);
        activityC11448x932bffb8.f154974e.setOnCancelListener(activityC11448x932bffb8.f154975f);
        gm0.j1.d().g(new r61.f1(3));
    }
}
