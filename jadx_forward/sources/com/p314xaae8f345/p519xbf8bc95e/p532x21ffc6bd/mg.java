package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class mg implements com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4349x3c5d2ee3 {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List<com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4345x442d4ec2> f131951a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f131952b = false;

    private mg(java.util.List<com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4345x442d4ec2> list) {
        this.f131951a = list;
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mg a(java.util.List<com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4345x442d4ec2> list) {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mg(list);
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mg b(java.util.List<com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4345x442d4ec2> list) {
        return a(list);
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4349x3c5d2ee3
    /* renamed from: onRequest */
    public final void mo36059x90f4f3b0(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4344x815606a6 c4344x815606a6;
        java.lang.String str = c4329xa3f02252.url;
        boolean z17 = this.f131952b;
        java.util.List<com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4345x442d4ec2> list = this.f131951a;
        if (list != null && !list.isEmpty()) {
            java.lang.String str2 = str;
            boolean z18 = false;
            for (int i17 = 0; i17 < this.f131951a.size(); i17++) {
                com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4345x442d4ec2 c4345x442d4ec2 = this.f131951a.get(i17);
                if (c4345x442d4ec2.m36055x62dd9c5(str)) {
                    str2 = c4345x442d4ec2.m36056x199ea27c(str);
                    z18 = true;
                }
            }
            if (z18) {
                android.net.Uri parse = android.net.Uri.parse(str2);
                java.lang.String host = parse.getHost();
                int port = parse.getPort();
                if (port < 0 || port > 65535) {
                    port = "https".equals(parse.getScheme()) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33726x366c91de : 80;
                }
                c4344x815606a6 = new com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4344x815606a6(new java.net.Proxy(java.net.Proxy.Type.HTTP, new java.net.InetSocketAddress(host, port)), str2, z17);
                c4329xa3f02252.f16969x65fca6e = c4344x815606a6;
            }
        }
        c4344x815606a6 = null;
        c4329xa3f02252.f16969x65fca6e = c4344x815606a6;
    }

    private com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4344x815606a6 a(java.lang.String str, boolean z17) {
        java.util.List<com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4345x442d4ec2> list = this.f131951a;
        if (list != null && !list.isEmpty()) {
            java.lang.String str2 = str;
            boolean z18 = false;
            for (int i17 = 0; i17 < this.f131951a.size(); i17++) {
                com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4345x442d4ec2 c4345x442d4ec2 = this.f131951a.get(i17);
                if (c4345x442d4ec2.m36055x62dd9c5(str)) {
                    str2 = c4345x442d4ec2.m36056x199ea27c(str);
                    z18 = true;
                }
            }
            if (z18) {
                android.net.Uri parse = android.net.Uri.parse(str2);
                java.lang.String host = parse.getHost();
                int port = parse.getPort();
                if (port < 0 || port > 65535) {
                    port = "https".equals(parse.getScheme()) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33726x366c91de : 80;
                }
                return new com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4344x815606a6(new java.net.Proxy(java.net.Proxy.Type.HTTP, new java.net.InetSocketAddress(host, port)), str2, z17);
            }
        }
        return null;
    }
}
