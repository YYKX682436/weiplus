package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* loaded from: classes13.dex */
public class j implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.IBinder f181288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f181289e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.k kVar, android.os.IBinder iBinder, java.lang.Integer num) {
        this.f181288d = iBinder;
        this.f181289e = num;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            new android.os.Messenger(this.f181288d).send(android.os.Message.obtain((android.os.Handler) null, this.f181289e.intValue()));
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exp.ExpansionsGlobal", "send message error: " + e17.getMessage());
        }
        return null;
    }
}
