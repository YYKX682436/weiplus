package com.tencent.mm.console;

/* loaded from: classes.dex */
public class b4 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("key");
        int intExtra = intent.getIntExtra("ivalue", -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "setRepairer() called key:" + stringExtra + " value:" + intExtra);
        if ((stringExtra == null || r26.n0.N(stringExtra)) || intExtra == -1) {
            return;
        }
        bm5.o1.f22719a.p(stringExtra, java.lang.Integer.valueOf(intExtra));
    }
}
