package com.tencent.mm.console;

/* loaded from: classes11.dex */
public class b3 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("value", 0);
        boolean z17 = x51.o1.f452042a;
        com.tencent.mars.xlog.Log.w("MicroMsg.Shell", "dkdnstd set Test.netDnsSimulateFault=%s", java.lang.Integer.toBinaryString(intExtra));
    }
}
