package com.tencent.mm.console;

/* loaded from: classes7.dex */
public class f2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        int intExtra = intent.getIntExtra(ya.b.LEVEL, 0);
        com.tencent.mars.xlog.Log.w("MicroMsg.Shell", "kiro set Log.level=%d", java.lang.Integer.valueOf(com.tencent.mars.xlog.Log.getLogLevel()));
        com.tencent.mars.xlog.Log.setLevel(intExtra, false);
    }
}
