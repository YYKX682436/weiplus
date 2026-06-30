package com.p159x477cd522.p160x333422.p164x6a710b1;

/* renamed from: com.eclipsesource.mmv8.utils.V8Thread */
/* loaded from: classes7.dex */
public class C1529xd48034c extends java.lang.Thread {

    /* renamed from: runtime */
    private com.p159x477cd522.p160x333422.V8 f5062x5c71cfd8;

    /* renamed from: target */
    private final com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1528xb4ee7fdf f5063xcb7e7191;

    public C1529xd48034c(com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1528xb4ee7fdf interfaceC1528xb4ee7fdf) {
        this.f5063xcb7e7191 = interfaceC1528xb4ee7fdf;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        com.p159x477cd522.p160x333422.V8 m16056x79233d5a = com.p159x477cd522.p160x333422.V8.m16056x79233d5a();
        this.f5062x5c71cfd8 = m16056x79233d5a;
        try {
            this.f5063xcb7e7191.run(m16056x79233d5a);
            synchronized (this) {
                if (this.f5062x5c71cfd8.m16208x23ad560e().m16433x2986eee5()) {
                    this.f5062x5c71cfd8.mo15825x41012807();
                    this.f5062x5c71cfd8 = null;
                }
            }
        } catch (java.lang.Throwable th6) {
            synchronized (this) {
                if (this.f5062x5c71cfd8.m16208x23ad560e().m16433x2986eee5()) {
                    this.f5062x5c71cfd8.mo15825x41012807();
                    this.f5062x5c71cfd8 = null;
                }
                throw th6;
            }
        }
    }
}
