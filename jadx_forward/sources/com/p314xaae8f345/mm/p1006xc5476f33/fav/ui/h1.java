package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 f182658d;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722) {
        this.f182658d = activityC13563x72179722;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722 = this.f182658d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = activityC13563x72179722.f181840e;
        if (cVar != null) {
            cVar.a();
        }
        activityC13563x72179722.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavCleanUI", "on storage change, try refresh job");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = activityC13563x72179722.f181845m;
        java.lang.Runnable runnable = activityC13563x72179722.D;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50293x3498a0(runnable);
    }
}
