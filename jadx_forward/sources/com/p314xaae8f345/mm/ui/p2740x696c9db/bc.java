package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class bc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f291837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 f291838e;

    public bc(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72, boolean z17) {
        this.f291838e = activityC22543x95896a72;
        this.f291837d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = this.f291838e;
        if (activityC22543x95896a72.isFinishing() || activityC22543x95896a72.isDestroyed()) {
            return;
        }
        if (this.f291837d) {
            activityC22543x95896a72.f291771z.h();
        } else {
            activityC22543x95896a72.f291771z.i();
        }
        if (activityC22543x95896a72.f291771z.e()) {
            activityC22543x95896a72.f291771z.mo69330x68ac462();
            activityC22543x95896a72.X6();
        } else {
            activityC22543x95896a72.f291771z.mo69303x360802();
            activityC22543x95896a72.f291771z.mo69327xab3268fe(activityC22543x95896a72.f291754f);
        }
    }
}
