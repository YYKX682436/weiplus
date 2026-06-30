package com.tencent.mm.console;

/* loaded from: classes9.dex */
public class e1 implements com.tencent.mm.console.h5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!intent.hasExtra("process_suffix")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "[-] WCPRB: process suffix was missing.");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("process_suffix");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (bm5.f1.b().equals(stringExtra)) {
            java.lang.String stringExtra2 = intent.getStringExtra("op");
            if (stringExtra2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "[-] WCPRB: op is null or empty.");
            } else {
                if (!stringExtra2.equals("report")) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "[-] WCPRB: unknown op: %s", stringExtra2);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "[+] WCPRB: execute op: %s", stringExtra2);
                w04.l.INSTANCE.f7(540999682, 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "[+] WCPRB: execute op: %s done", stringExtra2);
            }
        }
    }
}
