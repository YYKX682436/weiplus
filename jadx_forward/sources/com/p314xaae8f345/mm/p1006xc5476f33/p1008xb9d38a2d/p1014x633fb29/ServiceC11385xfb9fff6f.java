package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1014x633fb29;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.plugin.account.model.AccountAuthenticatorService */
/* loaded from: classes8.dex */
public class ServiceC11385xfb9fff6f extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public static v61.a f154722d;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            return null;
        }
        if (f154722d == null) {
            f154722d = new v61.a(this);
        }
        return f154722d.getIBinder();
    }
}
