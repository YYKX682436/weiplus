package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final class c5 extends com.tencent.matrix.lifecycle.g {
    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MatrixLifecycleForegroundMonitor", "onEnterBackground called by AppExplicitBackgroundOwner");
        if (com.tencent.mm.app.d5.f53387d) {
            com.tencent.mm.app.d5.a(com.tencent.mm.app.d5.f53384a);
        }
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MatrixLifecycleForegroundMonitor", "onExitBackground called by AppExplicitBackgroundOwner");
        if (com.tencent.mm.app.d5.f53387d) {
            return;
        }
        com.tencent.mm.app.d5.b(com.tencent.mm.app.d5.f53384a);
    }
}
