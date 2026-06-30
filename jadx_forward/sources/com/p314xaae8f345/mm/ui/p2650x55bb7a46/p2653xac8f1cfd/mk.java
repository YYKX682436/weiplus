package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class mk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f281047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk f281048e;

    public mk(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk lkVar, android.content.Intent intent) {
        this.f281048e = lkVar;
        this.f281047d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        int intExtra = this.f281047d.getIntExtra("key_quote_msg_target", 0);
        if (intExtra == 1 || intExtra == 2) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f281048e.f280113d.f542241c.a(sb5.s0.class))).f280796e.v1(false, true);
        }
    }
}
