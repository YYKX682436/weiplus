package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class y implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f225361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f225362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a0 f225363c;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a0 a0Var, android.app.Activity activity, android.content.Intent intent) {
        this.f225363c = a0Var;
        this.f225361a = activity;
        this.f225362b = intent;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a0 a0Var = this.f225363c;
        if (i17 != 64) {
            a0Var.f224976f.a("wrong request code");
            return;
        }
        if (strArr.length != 1 || !strArr[0].equals("android.permission.ACCESS_FINE_LOCATION")) {
            a0Var.f224976f.a("wrong permission");
            return;
        }
        if (iArr.length != 1) {
            a0Var.f224976f.a("wrong grant results");
            return;
        }
        int i18 = iArr[0];
        final android.app.Activity activity = this.f225361a;
        if (i18 != 0) {
            a0Var.f224976f.a("permission not granted");
            db5.e1.C(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mta), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mt_), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbp), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbl), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.lite.jsapi.comms.y$$a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                    dialogInterface.dismiss();
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                    j35.u.g(activity);
                }
            }, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.DialogInterfaceOnClickListenerC16215x378cc9());
        } else {
            a0Var.getClass();
            nf.g.a(activity).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.z(a0Var));
            j45.l.n(activity, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", this.f225362b, a0Var.f225029g);
        }
    }
}
