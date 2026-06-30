package com.tencent.mm.console;

/* loaded from: classes11.dex */
public class n1 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.console.p0.c(new com.tencent.mm.vfs.r6(intent.getStringExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)), 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "DU Done");
        }
    }
}
