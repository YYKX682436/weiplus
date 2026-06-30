package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class i implements android.content.ServiceConnection {
    public final void a(java.lang.String str) {
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unbindService(this);
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
        int i17 = bj1.b.f21139d;
        if (iBinder == null) {
            aVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCall");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof bj1.c)) ? new bj1.a(iBinder) : (bj1.c) queryLocalInterface;
        }
        if (aVar != null) {
            ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.appbrand.task.h(aVar, this));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        a("onServiceDisconnected");
    }
}
