package com.tencent.mm.model.newabtest;

/* loaded from: classes8.dex */
public final class o implements l75.q0 {
    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (kotlin.jvm.internal.o.b("event_updated", str)) {
            com.tencent.mm.model.newabtest.s sVar = (com.tencent.mm.model.newabtest.s) i95.n0.c(com.tencent.mm.model.newabtest.s.class);
            com.tencent.mm.storage.e Ai = com.tencent.mm.model.newabtest.z.Ai();
            kotlin.jvm.internal.o.f(Ai, "getABTestStorage(...)");
            sVar.Ai(Ai);
        }
    }
}
