package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2;

/* renamed from: com.google.android.gms.auth.api.signin.RevocationBoundService */
/* loaded from: classes11.dex */
public final class ServiceC1686x655e2a35 extends android.app.Service {
    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            if (android.util.Log.isLoggable("RevocationService", 2)) {
                java.lang.String valueOf = java.lang.String.valueOf(intent.getAction());
                if (valueOf.length() != 0) {
                    "RevocationBoundService handling ".concat(valueOf);
                }
            }
            return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzx(this);
        }
        java.lang.String valueOf2 = java.lang.String.valueOf(intent.getAction());
        if (valueOf2.length() == 0) {
            return null;
        }
        "Unknown action sent to RevocationBoundService: ".concat(valueOf2);
        return null;
    }
}
