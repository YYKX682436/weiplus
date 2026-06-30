package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class l2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.v2 f260563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19055xad52aa6b f260564e;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19055xad52aa6b activityC19055xad52aa6b, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.v2 v2Var) {
        this.f260564e = activityC19055xad52aa6b;
        this.f260563d = v2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.v2 v2Var = this.f260563d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.u2 u2Var = v2Var.f260630d;
        int i18 = u2Var.f260619b;
        if (i18 == 1) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.X(this.f260564e.mo55332x76847179(), v2Var.f260630d.f260620c, true);
        } else if (i18 == 2) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(u2Var.f260621d, u2Var.f260622e, 0, 1000);
        } else {
            dialogInterface.dismiss();
        }
    }
}
