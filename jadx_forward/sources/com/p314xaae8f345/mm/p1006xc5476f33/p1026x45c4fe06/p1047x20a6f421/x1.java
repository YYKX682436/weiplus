package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class x1 {

    /* renamed from: a, reason: collision with root package name */
    public tk1.c f159376a;

    /* renamed from: b, reason: collision with root package name */
    public final javax.net.ssl.SSLSocketFactory f159377b;

    public x1(uh1.a aVar) {
        javax.net.ssl.SSLContext p17 = uh1.j0.p(aVar);
        if (p17 != null) {
            this.f159377b = p17.getSocketFactory();
        }
    }

    public void a(java.lang.String str, uh1.o0 o0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugSocket", "connectSocket url is %s", str);
        try {
            java.net.URI uri = new java.net.URI(str);
            java.util.HashMap hashMap = new java.util.HashMap();
            if (str.startsWith("ws://localhost:")) {
                hashMap.put("Sec-WebSocket-Protocol", "client");
            }
            try {
                this.f159376a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.w1(this, uri, new uk1.f(), hashMap, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8, o0Var);
                if (nf.z.d(str, "ws://")) {
                    this.f159376a.s(new java.net.Socket(java.net.Proxy.NO_PROXY));
                    this.f159376a.i();
                } else {
                    javax.net.ssl.SSLSocketFactory sSLSocketFactory = this.f159377b;
                    if (sSLSocketFactory == null) {
                        sSLSocketFactory = (javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault();
                    }
                    this.f159376a.s(sSLSocketFactory.createSocket());
                    this.f159376a.i();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugSocket", "onSocketMessage %s", android.util.Log.getStackTraceString(e17));
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugSocket", "connect fail : %s ", e18.toString());
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e1) o0Var).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "onSocketConnectFail reason:%s ", "url not well format");
        }
    }

    public boolean b(r45.k47 k47Var) {
        java.nio.ByteBuffer allocate;
        tk1.c cVar = this.f159376a;
        if (!(cVar == null ? false : cVar.m166713xb9a70294())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugSocket", "sendSocketMsg fail, not open");
            return false;
        }
        if (k47Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugSocket", "sendSocketMsg fail");
            return false;
        }
        try {
            allocate = java.nio.ByteBuffer.wrap(k47Var.mo14344x5f01b1f6());
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugUtil", e17.getMessage());
            allocate = java.nio.ByteBuffer.allocate(0);
        }
        this.f159376a.e(allocate);
        return true;
    }
}
