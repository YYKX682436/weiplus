package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class i3 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f274266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 f274267b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f274268c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, android.os.Looper looper, android.os.Handler.Callback callback, long j17, com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 k3Var) {
        super(looper, callback);
        this.f274268c = n3Var;
        this.f274266a = j17;
        this.f274267b = k3Var;
    }

    @Override // android.os.Handler
    public void dispatchMessage(android.os.Message message) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f274268c;
        n3Var.f39191xa314cd42 = message;
        n3Var.mo77779x9394e0ae(message);
        java.lang.Runnable callback = message.getCallback();
        if (callback != null) {
            bm5.u1.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a(), callback.getClass().getSimpleName());
        }
        super.dispatchMessage(message);
        n3Var.mo77778x5520f4b1(message);
        n3Var.f39191xa314cd42 = null;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        if (this.f274266a == currentThread.getId()) {
            if (currentTimeMillis2 < 300) {
                return;
            }
        } else if (currentTimeMillis2 < 5000) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Handler#Monitor", "This msg handle so slow[%sms]! runnable=%s callback=%s thread=%s", java.lang.Long.valueOf(currentTimeMillis2), message.getCallback(), this.f274267b, currentThread.getName());
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        this.f274268c.mo1038x5b586cbf(message);
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(android.os.Message message, long j17) {
        this.f274268c.mo77780x6839d260(message, j17);
        return super.sendMessageAtTime(message, j17);
    }
}
