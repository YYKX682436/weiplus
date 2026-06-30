package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public final class r0 extends android.os.Handler {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f90142b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90143a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        super(android.os.Looper.getMainLooper());
        this.f90143a = appBrandLauncherRecentsList;
    }

    public final void a() {
        removeMessages(1);
        removeMessages(2);
        removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 != 1) {
            if (i17 == 2) {
                ((java.lang.Runnable) message.obj).run();
                return;
            } else {
                super.handleMessage(message);
                return;
            }
        }
        ((java.lang.Runnable) message.obj).run();
        removeMessages(2);
        synchronized (this.f90143a.R) {
            this.f90143a.R.notifyAll();
        }
    }
}
