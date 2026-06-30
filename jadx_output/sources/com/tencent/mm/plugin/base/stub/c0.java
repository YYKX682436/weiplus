package com.tencent.mm.plugin.base.stub;

/* loaded from: classes8.dex */
public class c0 extends com.tencent.mm.app.s2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "turn onAppBackground");
        com.tencent.mm.plugin.base.stub.e0.f93737g = false;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mm.plugin.base.stub.e0.f93737g = true;
        com.tencent.mm.plugin.base.stub.e0.f93738h = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "turn onAppForeground");
        if (com.tencent.mm.plugin.base.stub.e0.f93732b == null || !gm0.j1.a()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "Safe Launch WXBizEntry onAppForeground, enterId:%d", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.c2.i(com.tencent.mm.plugin.base.stub.e0.f93732b, "__BIZ_ENTRY_ENTER_ID", 0L)));
        com.tencent.mm.plugin.base.stub.e0.e();
    }
}
