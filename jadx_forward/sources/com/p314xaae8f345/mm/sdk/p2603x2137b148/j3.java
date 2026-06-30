package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class j3 extends xu5.o {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f274292h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 f274293i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f274294j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, xu5.b bVar, android.os.Handler.Callback callback, long j17, com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 k3Var) {
        super(bVar, callback);
        this.f274294j = n3Var;
        this.f274292h = j17;
        this.f274293i = k3Var;
    }

    @Override // xu5.o
    public void b(android.os.Message message) {
        this.f274294j.mo1038x5b586cbf(message);
    }

    @Override // xu5.o, qu5.a
    /* renamed from: dispatchMessage */
    public void mo50277x8245362d(android.os.Message message) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f274294j;
        n3Var.f39191xa314cd42 = message;
        super.mo50277x8245362d(message);
        n3Var.f39191xa314cd42 = null;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        if (this.f274292h == currentThread.getId()) {
            if (currentTimeMillis2 < 300) {
                return;
            }
        } else if (currentTimeMillis2 < 5000) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Handler#Monitor", "This msg handle so slow[%sms]! runnable=%s callback=%s thread=%s", java.lang.Long.valueOf(currentTimeMillis2), message.getCallback(), this.f274293i, currentThread.getName());
    }
}
