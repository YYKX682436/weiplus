package com.tencent.mm.plugin.account.model;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class AccountAuthenticatorService extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public static v61.a f73189d;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            return null;
        }
        if (f73189d == null) {
            f73189d = new v61.a(this);
        }
        return f73189d.getIBinder();
    }
}
