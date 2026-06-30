package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes11.dex */
public class bi implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11469xa6b63310 f155290d;

    public bi(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11469xa6b63310 activityC11469xa6b63310) {
        this.f155290d = activityC11469xa6b63310;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11469xa6b63310 activityC11469xa6b63310 = this.f155290d;
        android.content.Intent intent = new android.content.Intent(activityC11469xa6b63310.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11448x932bffb8.class);
        intent.putExtra("is_force_unbind", true);
        activityC11469xa6b63310.mo55332x76847179().startActivityForResult(intent, 0);
    }
}
