package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem f222847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7 f222848e;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7 activityC16011x94b3fdc7, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem) {
        this.f222848e = activityC16011x94b3fdc7;
        this.f222847d = tabItem;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7 activityC16011x94b3fdc7 = this.f222848e;
        if (activityC16011x94b3fdc7.isFinishing() || activityC16011x94b3fdc7.isDestroyed()) {
            return;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7.f222748r;
        activityC16011x94b3fdc7.Y6(this.f222847d, true);
    }
}
