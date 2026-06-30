package com.tencent.mm.booter;

/* loaded from: classes.dex */
public class d0 implements com.tencent.mm.booter.g0 {
    @Override // com.tencent.mm.booter.g0
    public void a(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SandBoxProcessReceiver", "onReceive");
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.booter.c0(this), 5000L);
    }
}
