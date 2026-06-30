package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class z5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 f274667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.w5 f274668e;

    public z5(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.mm.sdk.p2603x2137b148.w5 w5Var) {
        this.f274667d = interfaceC26164x73fc6bc6;
        this.f274668e = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.y5 y5Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.w5 w5Var = this.f274668e;
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f274667d;
        try {
            if (interfaceC26164x73fc6bc6 != null) {
                try {
                    interfaceC26164x73fc6bc6.mo100977x5f82bb9a();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PlaySoundNew", e17, "onCompletion release player error", new java.lang.Object[0]);
                    y5Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.y5(w5Var);
                }
            }
            if (interfaceC26164x73fc6bc6 != null) {
                interfaceC26164x73fc6bc6.mo100933x41012807();
            }
            y5Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.y5(w5Var);
            d75.b.g(y5Var);
        } catch (java.lang.Throwable th6) {
            d75.b.g(new com.p314xaae8f345.mm.sdk.p2603x2137b148.y5(w5Var));
            throw th6;
        }
    }
}
