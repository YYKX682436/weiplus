package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class qb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f145994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.sb f145995e;

    public qb(com.p314xaae8f345.mm.p648x55baa833.ui.sb sbVar, int i17) {
        this.f145995e = sbVar;
        this.f145994d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c activityC10365x4886147c = this.f145995e.f146046d;
        com.p314xaae8f345.mm.p648x55baa833.ui.cc ccVar = activityC10365x4886147c.f145469e;
        int i18 = this.f145994d;
        if (ccVar.getItem(i18).f146224a == 1) {
            java.lang.String d17 = activityC10365x4886147c.f145469e.getItem(i18).f146225b.d1();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            if (str.equals(d17)) {
                db5.e1.i(activityC10365x4886147c.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.i4t, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            } else {
                activityC10365x4886147c.T6(d17);
            }
        }
    }
}
