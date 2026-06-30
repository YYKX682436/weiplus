package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 f182956d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722) {
        this.f182956d = activityC13563x72179722;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722 = this.f182956d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = activityC13563x72179722.f181840e;
        if (cVar == null) {
            return;
        }
        if (!cVar.isEmpty() && android.os.SystemClock.elapsedRealtime() - activityC13563x72179722.C < 1000) {
            android.os.SystemClock.elapsedRealtime();
            activityC13563x72179722.f181845m.mo50297x7c4d7ca2(this, 500L);
        } else {
            activityC13563x72179722.f181841f = false;
            activityC13563x72179722.C = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722.T6(activityC13563x72179722);
        }
    }
}
