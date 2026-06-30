package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes.dex */
public final class z7 implements com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f229302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f229303b;

    public z7(android.app.Dialog dialog, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        this.f229302a = dialog;
        this.f229303b = activityC16371xf216ae6d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c1
    /* renamed from: call */
    public final void mo66254x2e7a5e(java.lang.Object obj) {
        java.lang.String string;
        android.app.Dialog dialog = this.f229302a;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[fetchLqtDetail] interrupt-failed: %s", obj);
        if (obj != null) {
            boolean z17 = obj instanceof java.lang.String;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f229303b;
            if (z17) {
                string = obj.toString();
            } else {
                string = activityC16371xf216ae6d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kpu);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            }
            dp.a.m125854x26a183b(activityC16371xf216ae6d.mo55332x76847179(), string, 1).show();
        }
    }
}
