package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21340x254df46b f292593d;

    public u(com.p314xaae8f345.mm.ui.ActivityC21340x254df46b activityC21340x254df46b) {
        this.f292593d = activityC21340x254df46b;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.ActivityC21340x254df46b activityC21340x254df46b = this.f292593d;
        if (activityC21340x254df46b.getWindow() == null || activityC21340x254df46b.isDestroyed()) {
            return;
        }
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.AlertActivity", "showSnackBar, finish AlertActivity", new java.lang.Object[0]);
        activityC21340x254df46b.finish();
    }
}
