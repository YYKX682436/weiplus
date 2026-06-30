package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class a0 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Application f134351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f134352e;

    public a0(android.app.Application application, android.content.Intent intent) {
        this.f134351d = application;
        this.f134352e = intent;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134318f.a().post(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.x(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0 d0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k;
        if (d0Var.d()) {
            oj.j.b(d0Var.b(), "self disconnected", new java.lang.Object[0]);
            boolean z17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134338i;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134339m = true;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134318f.a().post(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.z(this, componentName));
    }
}
