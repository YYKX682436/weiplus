package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView f77775d;

    public j1(com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView remoteDebugMoveView) {
        this.f77775d = remoteDebugMoveView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView remoteDebugMoveView = this.f77775d;
        int i17 = remoteDebugMoveView.f77587d;
        int width = remoteDebugMoveView.getWidth();
        if (width <= 0) {
            width = i65.a.b(remoteDebugMoveView.getContext(), 200);
        }
        remoteDebugMoveView.setX(i17 - width);
        remoteDebugMoveView.setY((int) (i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a) * 120.0f));
    }
}
