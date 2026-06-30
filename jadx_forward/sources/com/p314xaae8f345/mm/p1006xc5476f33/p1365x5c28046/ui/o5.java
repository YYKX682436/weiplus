package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class o5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f179645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 f179646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f179647f;

    public o5(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f179645d = str;
        this.f179646e = activityC13326xc73ec7a9;
        this.f179647f = h0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f179645d;
        boolean z17 = str == null || str.length() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9 = this.f179646e;
        if (!z17) {
            java.lang.String str2 = this.f179645d;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9.R;
            or.d.c(str2, 3, activityC13326xc73ec7a9.s7(), 0, 0, (java.lang.String) this.f179647f.f391656d, 16, null);
        }
        activityC13326xc73ec7a9.setResult(0);
        activityC13326xc73ec7a9.finish();
        activityC13326xc73ec7a9.f179307y = 3L;
    }
}
