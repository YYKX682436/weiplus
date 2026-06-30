package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final class b5 extends com.tencent.matrix.lifecycle.h {
    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MatrixLifecycleForegroundMonitor", "onEnterForeground called by AppUIForegroundOwner");
        com.tencent.mm.app.d5.b(com.tencent.mm.app.d5.f53384a);
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MatrixLifecycleForegroundMonitor", "onExitForeground called by AppUIForegroundOwner");
        com.tencent.mm.app.d5.a(com.tencent.mm.app.d5.f53384a);
    }
}
