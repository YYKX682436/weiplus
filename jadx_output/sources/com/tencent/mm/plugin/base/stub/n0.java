package com.tencent.mm.plugin.base.stub;

/* loaded from: classes14.dex */
public class n0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.o0 f93775d;

    public n0(com.tencent.mm.plugin.base.stub.o0 o0Var) {
        this.f93775d = o0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        if (!gm0.j1.i().f273208a.f273299d) {
            return true;
        }
        synchronized (this.f93775d.f93779a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "The lock was released.");
            this.f93775d.f93780b = true;
            this.f93775d.f93779a.notifyAll();
        }
        return false;
    }
}
