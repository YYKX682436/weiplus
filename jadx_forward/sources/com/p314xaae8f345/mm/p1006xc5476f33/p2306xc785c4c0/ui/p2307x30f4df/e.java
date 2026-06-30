package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18739x7e7cc4db f256491d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18739x7e7cc4db activityC18739x7e7cc4db) {
        this.f256491d = activityC18739x7e7cc4db;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18739x7e7cc4db activityC18739x7e7cc4db = this.f256491d;
        if (activityC18739x7e7cc4db.isFinishing()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeAffinityUI", "kill self in background");
        activityC18739x7e7cc4db.finish();
    }
}
