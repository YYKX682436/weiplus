package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f260542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19041xb051660 f260543e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19041xb051660 activityC19041xb051660, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar) {
        this.f260543e = activityC19041xb051660;
        this.f260542d = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19041xb051660 activityC19041xb051660 = this.f260543e;
        android.app.Dialog e17 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(activityC19041xb051660.mo55332x76847179(), false, false, null);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5274xb33ae62e c5274xb33ae62e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5274xb33ae62e();
        c5274xb33ae62e.f135598g.f87965a = ((mz2.a) activityC19041xb051660.f260371u).a() ? 1 : 2;
        c5274xb33ae62e.f273897d = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.h(this, c5274xb33ae62e, e17);
        c5274xb33ae62e.b(activityC19041xb051660.getMainLooper());
        activityC19041xb051660.X6();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260542d).notifyDataSetChanged();
    }
}
