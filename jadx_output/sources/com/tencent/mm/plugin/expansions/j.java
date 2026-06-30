package com.tencent.mm.plugin.expansions;

/* loaded from: classes13.dex */
public class j implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.IBinder f99755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f99756e;

    public j(com.tencent.mm.plugin.expansions.k kVar, android.os.IBinder iBinder, java.lang.Integer num) {
        this.f99755d = iBinder;
        this.f99756e = num;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            new android.os.Messenger(this.f99755d).send(android.os.Message.obtain((android.os.Handler) null, this.f99756e.intValue()));
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.exp.ExpansionsGlobal", "send message error: " + e17.getMessage());
        }
        return null;
    }
}
