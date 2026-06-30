package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class a6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 f273992d;

    public a6(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        this.f273992d = interfaceC26164x73fc6bc6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f273992d;
        if (interfaceC26164x73fc6bc6 != null) {
            try {
                interfaceC26164x73fc6bc6.mo100977x5f82bb9a();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PlaySoundNew", e17, "onError release player error", new java.lang.Object[0]);
                return;
            }
        }
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100933x41012807();
        }
    }
}
