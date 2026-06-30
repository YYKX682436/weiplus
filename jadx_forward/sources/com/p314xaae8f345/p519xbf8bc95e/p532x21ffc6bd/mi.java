package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class mi extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.me implements com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4349x3c5d2ee3 {
    @Override // com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4349x3c5d2ee3
    /* renamed from: onRequest */
    public final void mo36059x90f4f3b0(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        c4329xa3f02252.m35982xbeee7bd4("User-ReturnCode");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.me, com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4350x369ad131
    /* renamed from: onResponse */
    public final void mo36060x90d13740(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde) {
        java.lang.String m36023x1f05a537 = c4330xdd3bdcde.m36023x1f05a537("User-ReturnCode");
        int parseInt = java.lang.Integer.parseInt(m36023x1f05a537);
        if (parseInt != 0) {
            if (parseInt == -2) {
                c4330xdd3bdcde.m36019x584fd04f(new com.p314xaae8f345.map.p511x696c9db.net.p515x584fd04f.C4334x92c9d7dd());
            }
            c4330xdd3bdcde.m36019x584fd04f(new java.lang.Exception("FileUploader user error:".concat(java.lang.String.valueOf(m36023x1f05a537))));
        }
    }
}
