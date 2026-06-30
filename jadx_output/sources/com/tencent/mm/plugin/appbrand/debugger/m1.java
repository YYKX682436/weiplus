package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView f77802d;

    public m1(com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView remoteDebugMoveView) {
        this.f77802d = remoteDebugMoveView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView remoteDebugMoveView = this.f77802d;
        if (remoteDebugMoveView.getY() + remoteDebugMoveView.getHeight() > remoteDebugMoveView.f77588e) {
            remoteDebugMoveView.setY(r2 - remoteDebugMoveView.getHeight());
        }
    }
}
