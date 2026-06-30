package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class a1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 f279890a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 v0Var, android.os.Looper looper) {
        super(looper);
        this.f279890a = v0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 v0Var = this.f279890a;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "reset speaker");
            boolean z17 = true;
            v0Var.F(true);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar = v0Var.f284306s;
            if (roVar != null ? roVar.f281398e : v0Var.M) {
                z17 = false;
            }
            v0Var.f284308u = z17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AutoPlay", e17, "", new java.lang.Object[0]);
        }
    }
}
