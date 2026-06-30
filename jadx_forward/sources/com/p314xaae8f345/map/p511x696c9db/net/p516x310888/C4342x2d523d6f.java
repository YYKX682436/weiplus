package com.p314xaae8f345.map.p511x696c9db.net.p516x310888;

/* renamed from: com.tencent.map.tools.net.http.HttpCanceler */
/* loaded from: classes13.dex */
public class C4342x2d523d6f {

    /* renamed from: mCancelCallback */
    private com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<java.lang.Boolean> f17016x8952a2ac;

    /* renamed from: mCanceled */
    private boolean f17017x1da62c26;

    /* renamed from: mConnection */
    private com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312 f17018xadf6772b;

    /* renamed from: cancel */
    public void m36046xae7a2e7a() {
        com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312 interfaceC4325x1e0dd312 = this.f17018xadf6772b;
        if (interfaceC4325x1e0dd312 != null && interfaceC4325x1e0dd312.mo35893xae7a2e7a()) {
            this.f17017x1da62c26 = true;
        }
        com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<java.lang.Boolean> interfaceC4308xf9968465 = this.f17016x8952a2ac;
        if (interfaceC4308xf9968465 != null) {
            interfaceC4308xf9968465.mo35806xf5bc2045(java.lang.Boolean.valueOf(this.f17017x1da62c26));
        }
    }

    /* renamed from: isCanceled */
    public boolean m36047xc9602be3() {
        return this.f17017x1da62c26;
    }

    /* renamed from: setHttpAccessRequest */
    public void m36048x1a2894a1(com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312 interfaceC4325x1e0dd312, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<java.lang.Boolean> interfaceC4308xf9968465) {
        this.f17018xadf6772b = interfaceC4325x1e0dd312;
        this.f17016x8952a2ac = interfaceC4308xf9968465;
    }
}
