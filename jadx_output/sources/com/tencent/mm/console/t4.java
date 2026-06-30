package com.tencent.mm.console;

/* loaded from: classes5.dex */
public class t4 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("flag", 0);
        x51.o1.f452041J = intExtra;
        com.tencent.mars.xlog.Log.w("MicroMsg.Shell", "dkwt shell [%d]", java.lang.Integer.valueOf(intExtra));
    }
}
