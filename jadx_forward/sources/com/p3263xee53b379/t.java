package com.p3263xee53b379;

/* loaded from: classes13.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p3263xee53b379.ActivityC28074x3a8f05c8 f302259d;

    public t(com.p3263xee53b379.ActivityC28074x3a8f05c8 activityC28074x3a8f05c8) {
        this.f302259d = activityC28074x3a8f05c8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17 = com.p3263xee53b379.ActivityC28074x3a8f05c8.f302198o;
        com.p3263xee53b379.ActivityC28074x3a8f05c8 activityC28074x3a8f05c8 = this.f302259d;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activityC28074x3a8f05c8);
        activityC28074x3a8f05c8.f302201f = builder.create();
        builder.setMessage(qy5.h.a().f449327a);
        builder.setTitle(qy5.h.a().f449330d);
        builder.setPositiveButton(qy5.h.a().f449328b, new com.p3263xee53b379.u(activityC28074x3a8f05c8));
        builder.setNegativeButton(qy5.h.a().f449329c, new com.p3263xee53b379.v(activityC28074x3a8f05c8));
        builder.create().show();
    }
}
