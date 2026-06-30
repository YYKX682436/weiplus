package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class p1 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f94406d;

    public p1(int i17) {
        this.f94406d = i17;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Looper.myQueue().removeIdleHandler(this);
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a.p(this.f94406d);
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94436b.set(false);
        return false;
    }
}
