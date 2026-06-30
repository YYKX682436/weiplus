package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes.dex */
public class b4 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("key");
        int intExtra = intent.getIntExtra("ivalue", -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "setRepairer() called key:" + stringExtra + " value:" + intExtra);
        if ((stringExtra == null || r26.n0.N(stringExtra)) || intExtra == -1) {
            return;
        }
        bm5.o1.f104252a.p(stringExtra, java.lang.Integer.valueOf(intExtra));
    }
}
