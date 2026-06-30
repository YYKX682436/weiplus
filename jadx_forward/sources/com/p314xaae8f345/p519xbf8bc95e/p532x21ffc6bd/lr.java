package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class lr extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lq {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f131886b = "URLNetImpl";

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f131887c = false;

    /* renamed from: d, reason: collision with root package name */
    private java.net.HttpURLConnection f131888d;

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        private static final int f131891c = 3;

        /* renamed from: a, reason: collision with root package name */
        int f131892a;

        /* renamed from: b, reason: collision with root package name */
        boolean f131893b = true;

        public a(int i17) {
            this.f131892a = i17;
            if (i17 > 3) {
                this.f131892a = 3;
            }
            if (this.f131892a <= 0) {
                this.f131892a = 1;
            }
        }

        private boolean b() {
            return this.f131893b && this.f131892a > 0;
        }

        private void c() {
            this.f131893b = false;
        }

        public final void a() {
            this.f131892a--;
        }
    }

    public static /* synthetic */ java.net.HttpURLConnection a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lr lrVar) {
        lrVar.f131888d = null;
        return null;
    }

    private static void b() {
        if (java.lang.Integer.parseInt(android.os.Build.VERSION.SDK) < 8) {
            java.lang.System.setProperty("http.keepAlive", "false");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 r19) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lr.c(com.tencent.map.tools.net.NetRequest):com.tencent.map.tools.net.NetResponse");
    }

    private static void d(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        for (com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4348x36316c72 interfaceC4348x36316c72 : c4329xa3f02252.f16968x192a4621) {
            if (interfaceC4348x36316c72 instanceof com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4349x3c5d2ee3) {
                ((com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4349x3c5d2ee3) interfaceC4348x36316c72).mo36059x90f4f3b0(c4329xa3f02252);
            }
        }
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312
    /* renamed from: cancel */
    public final boolean mo35893xae7a2e7a() {
        java.net.HttpURLConnection httpURLConnection = this.f131888d;
        if (httpURLConnection == null) {
            return false;
        }
        httpURLConnection.disconnect();
        return true;
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312
    /* renamed from: doRequest */
    public final com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde mo35896x99e55b84(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        c4329xa3f02252.m35975xb68718f1(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.me());
        return c(c4329xa3f02252);
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312
    /* renamed from: openStream */
    public final com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde mo35905x14c7026a(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        c4329xa3f02252.m35975xb68718f1(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ml());
        return c(c4329xa3f02252);
    }

    private static void a(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde) {
        java.util.List<com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4348x36316c72> m36025x76afe17 = c4330xdd3bdcde.m36025x76afe17();
        java.util.Collections.reverse(m36025x76afe17);
        for (com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4348x36316c72 interfaceC4348x36316c72 : m36025x76afe17) {
            if (interfaceC4348x36316c72 instanceof com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4350x369ad131) {
                ((com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4350x369ad131) interfaceC4348x36316c72).mo36060x90d13740(c4330xdd3bdcde);
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lq
    public final com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde b(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        c4329xa3f02252.m35979x8e7d2e9c(com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe.POST);
        return mo35896x99e55b84(c4329xa3f02252);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lq
    public final com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde a(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        c4329xa3f02252.m35979x8e7d2e9c(com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe.GET);
        return mo35896x99e55b84(c4329xa3f02252);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lq
    public final void a() {
        if (java.lang.Integer.parseInt(android.os.Build.VERSION.SDK) < 8) {
            java.lang.System.setProperty("http.keepAlive", "false");
        }
    }
}
