package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class ze implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14042xca648648 f192334d;

    public ze(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14042xca648648 activityC14042xca648648) {
        this.f192334d = activityC14042xca648648;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14042xca648648 activityC14042xca648648 = this.f192334d;
        if (activityC14042xca648648.getIntent().getBooleanExtra("intent_key_ignore_back", false)) {
            pm0.z.b(xy2.b.f539688b, "intent_key_ignore_back", false, null, null, false, false, null, 124, null);
            activityC14042xca648648.getIntent().removeExtra("intent_key_ignore_back");
        }
    }
}
