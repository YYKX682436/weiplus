package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44;

/* renamed from: com.tencent.kinda.framework.widget.PlatformWrapLayout */
/* loaded from: classes15.dex */
public class C3280xf4562507 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a {
    public C3280xf4562507(com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda c1589x9549ddda) {
        m27112x76516a27(c1589x9549ddda);
    }

    /* renamed from: unwrapProxyObj */
    private java.lang.Object m26015xcefb672c(java.lang.Object obj) {
        if (!(obj instanceof java.lang.reflect.Proxy)) {
            return obj;
        }
        try {
            java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(obj);
            return invocationHandler instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5 ? ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5) invocationHandler).m24887x30959487() : obj;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a, com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: addView */
    public void mo26016xbb8aeee6(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190) {
        java.lang.Object m26015xcefb672c = m26015xcefb672c(interfaceC3545x4499190);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKViewLayout", "PlatformWrapLayout addView: %s %s", interfaceC3545x4499190, m26015xcefb672c);
        if (m26015xcefb672c != null) {
            interfaceC3545x4499190 = (com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190) m26015xcefb672c;
        }
        super.mo26016xbb8aeee6(interfaceC3545x4499190);
    }
}
