package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class v8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f292644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f292645e;

    public v8(com.p314xaae8f345.mm.ui.z8 z8Var, int i17, android.app.Activity activity) {
        this.f292644d = i17;
        this.f292645e = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = this.f292644d;
        if (i18 == 32) {
            jx3.f.INSTANCE.mo68477x336bdfd8(462L, 3L, 1L, true);
        } else if (i18 == 96) {
            jx3.f.INSTANCE.mo68477x336bdfd8(462L, 4L, 1L, true);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(462L, 5L, 1L, true);
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        android.app.Activity activity = this.f292645e;
        j35.u.g(activity);
        dialogInterface.dismiss();
        activity.finish();
    }
}
