package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class i4 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        x51.o1.f452068u = intent.getStringExtra("acc");
        x51.o1.f452069v = intent.getStringExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS);
        com.tencent.mars.xlog.Log.w("MicroMsg.Shell", "dkwt shell [%s %s]", x51.o1.f452068u, x51.o1.f452069v);
    }
}
