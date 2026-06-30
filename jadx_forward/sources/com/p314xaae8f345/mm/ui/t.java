package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f291397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21340x254df46b f291398e;

    public t(com.p314xaae8f345.mm.ui.ActivityC21340x254df46b activityC21340x254df46b, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var) {
        this.f291398e = activityC21340x254df46b;
        this.f291397d = f4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var;
        com.p314xaae8f345.mm.ui.ActivityC21340x254df46b activityC21340x254df46b = this.f291398e;
        if (activityC21340x254df46b.getWindow() == null || activityC21340x254df46b.isDestroyed() || (f4Var = this.f291397d) == null || !f4Var.isShowing()) {
            return;
        }
        f4Var.dismiss();
    }
}
