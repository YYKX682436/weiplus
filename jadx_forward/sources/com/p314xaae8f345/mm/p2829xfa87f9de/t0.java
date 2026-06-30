package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes8.dex */
public class t0 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f296421d;

    public t0(java.lang.ref.WeakReference weakReference) {
        this.f296421d = weakReference;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.XWebUpdateHelper", "checkUpdate, queueIdle");
        android.os.Looper.myQueue().removeIdleHandler(this);
        android.content.Context context = (android.content.Context) this.f296421d.get();
        if (context != null) {
            boolean z17 = gm0.m.i() != 0;
            boolean z18 = context instanceof android.app.Activity;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.XWebUpdateHelper", "checkUserLogin: %b, context is Activity: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
            if (z17 || z18) {
                if (com.p314xaae8f345.p3210x3857dc.a3.o(true)) {
                    com.p314xaae8f345.mm.p2829xfa87f9de.u0.a(context, 4);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.XWebUpdateHelper", "checkUpdateIfNeed, no need check update");
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.XWeb.MM.XWebUpdateHelper", "checkUpdate, context has been destructured.");
        }
        return false;
    }
}
