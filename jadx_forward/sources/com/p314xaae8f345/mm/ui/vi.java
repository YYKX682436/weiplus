package com.p314xaae8f345.mm.ui;

/* loaded from: classes4.dex */
public class vi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f292693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 f292694e;

    public vi(com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2, int i17) {
        this.f292694e = activityC21437xf483c2;
        this.f292693d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2 = this.f292694e;
        android.view.View x17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.b) activityC21437xf483c2.f278603d).x(this.f292693d, activityC21437xf483c2.m79335xcc101dd9());
        if (x17 != null) {
            zg5.a.a(activityC21437xf483c2.mo55332x76847179(), x17);
        }
    }
}
