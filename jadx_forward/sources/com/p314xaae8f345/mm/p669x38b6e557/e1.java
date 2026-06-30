package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes9.dex */
public class e1 implements com.p314xaae8f345.mm.p669x38b6e557.h5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!intent.hasExtra("process_suffix")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "[-] WCPRB: process suffix was missing.");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("process_suffix");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (bm5.f1.b().equals(stringExtra)) {
            java.lang.String stringExtra2 = intent.getStringExtra("op");
            if (stringExtra2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "[-] WCPRB: op is null or empty.");
            } else {
                if (!stringExtra2.equals("report")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "[-] WCPRB: unknown op: %s", stringExtra2);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "[+] WCPRB: execute op: %s", stringExtra2);
                w04.l.INSTANCE.f7(540999682, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "[+] WCPRB: execute op: %s done", stringExtra2);
            }
        }
    }
}
