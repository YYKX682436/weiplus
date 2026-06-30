package com.tencent.mm.console;

/* loaded from: classes8.dex */
public class m3 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("errmsg");
        x51.o1.f452067t = stringExtra;
        com.tencent.mars.xlog.Log.w("MicroMsg.Shell", "tiger set tigerIDCErrMsg =%s", stringExtra);
    }
}
