package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class h3 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f290305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.j3 f290306b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(com.p314xaae8f345.mm.ui.j3 j3Var, android.os.Looper looper) {
        super(looper);
        this.f290306b = j3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (this.f290305a) {
            return;
        }
        synchronized (this.f290306b) {
            com.p314xaae8f345.mm.ui.j3 j3Var = this.f290306b;
            j3Var.f290527d = j3Var.d();
            com.p314xaae8f345.mm.ui.j3 j3Var2 = this.f290306b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j3Var2.f290528e.f290550d, "newcursor updateWorkerRefresh status:%d, what:%s", java.lang.Integer.valueOf(j3Var2.f290527d), java.lang.Integer.valueOf(message.what));
        }
        int i17 = message.what;
        if (i17 == 1) {
            this.f290306b.f290528e.l();
        } else if (i17 == 2) {
            this.f290306b.f290528e.m((com.p314xaae8f345.mm.ui.f3) message.obj, false, true);
        }
    }
}
