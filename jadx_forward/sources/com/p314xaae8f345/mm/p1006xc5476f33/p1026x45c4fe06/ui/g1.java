package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes5.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12639x67ea3d2c f171256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f171257e;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12639x67ea3d2c activityC12639x67ea3d2c, java.lang.ref.WeakReference weakReference) {
        this.f171256d = activityC12639x67ea3d2c;
        this.f171257e = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "check short link timeout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12639x67ea3d2c activityC12639x67ea3d2c = this.f171256d;
        activityC12639x67ea3d2c.f170865f.set(true);
        db5.t7.m123883x26a183b(activityC12639x67ea3d2c, activityC12639x67ea3d2c.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572195a51), 1).show();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12639x67ea3d2c activityC12639x67ea3d2c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12639x67ea3d2c) this.f171257e.get();
        if (activityC12639x67ea3d2c2 != null) {
            activityC12639x67ea3d2c2.finish();
        }
    }
}
