package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class r implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16002xae5f607f f222840d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16002xae5f607f activityC16002xae5f607f) {
        this.f222840d = activityC16002xae5f607f;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16002xae5f607f activityC16002xae5f607f = this.f222840d;
        if (!activityC16002xae5f607f.isDestroyed() && !activityC16002xae5f607f.isFinishing()) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16002xae5f607f.f222650r;
            activityC16002xae5f607f.m78735x28280f95().m81450x8e764904(false);
            android.view.View findViewById = activityC16002xae5f607f.findViewById(com.p314xaae8f345.mm.R.id.nsv);
            if (findViewById != null) {
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab) findViewById).m81450x8e764904(false);
            }
        }
        return false;
    }
}
