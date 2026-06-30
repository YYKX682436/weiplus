package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public final class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17398x2eb064cd f243257d;

    public x4(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17398x2eb064cd activityC17398x2eb064cd) {
        this.f243257d = activityC17398x2eb064cd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17398x2eb064cd activityC17398x2eb064cd = this.f243257d;
        java.util.concurrent.Future future = activityC17398x2eb064cd.f241771d;
        if (future != null) {
            future.cancel(false);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC17398x2eb064cd.f241775h;
        if (u3Var != null) {
            u3Var.hide();
        }
    }
}
