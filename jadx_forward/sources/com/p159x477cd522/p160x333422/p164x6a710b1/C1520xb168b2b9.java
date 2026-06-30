package com.p159x477cd522.p160x333422.p164x6a710b1;

/* renamed from: com.eclipsesource.mmv8.utils.ConcurrentV8 */
/* loaded from: classes7.dex */
public final class C1520xb168b2b9 {

    /* renamed from: v8, reason: collision with root package name */
    private com.p159x477cd522.p160x333422.V8 f125531v8;

    public C1520xb168b2b9() {
        this.f125531v8 = null;
        com.p159x477cd522.p160x333422.V8 m16056x79233d5a = com.p159x477cd522.p160x333422.V8.m16056x79233d5a();
        this.f125531v8 = m16056x79233d5a;
        m16056x79233d5a.m16208x23ad560e().m16434x41012807();
    }

    /* renamed from: getV8 */
    public com.p159x477cd522.p160x333422.V8 m16637x5db1c78() {
        return this.f125531v8;
    }

    /* renamed from: release */
    public void m16638x41012807() {
        com.p159x477cd522.p160x333422.V8 v86 = this.f125531v8;
        if (v86 == null || v86.mo16335xafdb8087()) {
            return;
        }
        run(new com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1528xb4ee7fdf() { // from class: com.eclipsesource.mmv8.utils.ConcurrentV8.1
            @Override // com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1528xb4ee7fdf
            public void run(com.p159x477cd522.p160x333422.V8 v87) {
                if (v87 == null || v87.mo16335xafdb8087()) {
                    return;
                }
                v87.mo15825x41012807();
            }
        });
    }

    public synchronized void run(com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1528xb4ee7fdf interfaceC1528xb4ee7fdf) {
        try {
            this.f125531v8.m16208x23ad560e().m16430xba9b60d6();
            interfaceC1528xb4ee7fdf.run(this.f125531v8);
        } finally {
            com.p159x477cd522.p160x333422.V8 v86 = this.f125531v8;
            if (v86 != null && v86.m16208x23ad560e() != null && this.f125531v8.m16208x23ad560e().m16433x2986eee5()) {
                this.f125531v8.m16208x23ad560e().m16434x41012807();
            }
        }
    }
}
