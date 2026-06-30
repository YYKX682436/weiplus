package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public final class i implements android.content.ServiceConnection {
    public final void a(java.lang.String str) {
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unbindService(this);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(android.content.ComponentName componentName) {
        a("onBindingDied");
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(android.content.ComponentName componentName) {
        a("onNullBinding");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        bj1.c aVar;
        int i17 = bj1.b.f102672d;
        if (iBinder == null) {
            aVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCall");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof bj1.c)) ? new bj1.a(iBinder) : (bj1.c) queryLocalInterface;
        }
        if (aVar != null) {
            ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.h(aVar, this));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        a("onServiceDisconnected");
    }
}
