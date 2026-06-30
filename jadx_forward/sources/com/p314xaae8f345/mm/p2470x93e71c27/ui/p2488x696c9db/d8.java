package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes4.dex */
public class d8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f273111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 f273112e;

    public d8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05, android.view.Surface surface) {
        this.f273112e = c19749xff44b05;
        this.f273111d = surface;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.Surface surface = this.f273111d;
        if (surface != null) {
            try {
                if (surface.isValid()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "%d release surface [%d]", java.lang.Integer.valueOf(this.f273112e.hashCode()), java.lang.Integer.valueOf(surface.hashCode()));
                    surface.release();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoTextureView", e17, "release Surface error", new java.lang.Object[0]);
            }
        }
    }
}
