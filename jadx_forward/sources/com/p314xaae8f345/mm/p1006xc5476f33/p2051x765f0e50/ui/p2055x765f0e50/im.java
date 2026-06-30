package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class im implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f242700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea f242701e;

    public im(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea, android.content.Intent intent) {
        this.f242701e = activityC17463xb337a9ea;
        this.f242700d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea = this.f242701e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rm) activityC17463xb337a9ea.f242234x).a(this.f242700d.getStringExtra("SWITCH_TO_USERNAME"));
        db5.t7.m123883x26a183b(activityC17463xb337a9ea.mo55332x76847179(), activityC17463xb337a9ea.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ixe), 1).show();
    }
}
