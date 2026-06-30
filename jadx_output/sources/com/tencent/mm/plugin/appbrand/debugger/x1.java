package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class x1 {

    /* renamed from: a, reason: collision with root package name */
    public tk1.c f77843a;

    /* renamed from: b, reason: collision with root package name */
    public final javax.net.ssl.SSLSocketFactory f77844b;

    public x1(uh1.a aVar) {
        javax.net.ssl.SSLContext p17 = uh1.j0.p(aVar);
        if (p17 != null) {
            this.f77844b = p17.getSocketFactory();
        }
    }

    public void a(java.lang.String str, uh1.o0 o0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugSocket", "connectSocket url is %s", str);
        try {
            java.net.URI uri = new java.net.URI(str);
            java.util.HashMap hashMap = new java.util.HashMap();
            if (str.startsWith("ws://localhost:")) {
                hashMap.put("Sec-WebSocket-Protocol", "client");
            }
            try {
                this.f77843a = new com.tencent.mm.plugin.appbrand.debugger.w1(this, uri, new uk1.f(), hashMap, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, o0Var);
                if (nf.z.d(str, "ws://")) {
                    this.f77843a.s(new java.net.Socket(java.net.Proxy.NO_PROXY));
                    this.f77843a.i();
                } else {
                    javax.net.ssl.SSLSocketFactory sSLSocketFactory = this.f77844b;
                    if (sSLSocketFactory == null) {
                        sSLSocketFactory = (javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault();
                    }
                    this.f77843a.s(sSLSocketFactory.createSocket());
                    this.f77843a.i();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugSocket", "onSocketMessage %s", android.util.Log.getStackTraceString(e17));
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugSocket", "connect fail : %s ", e18.toString());
            ((com.tencent.mm.plugin.appbrand.debugger.e1) o0Var).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "onSocketConnectFail reason:%s ", "url not well format");
        }
    }

    public boolean b(r45.k47 k47Var) {
        java.nio.ByteBuffer allocate;
        tk1.c cVar = this.f77843a;
        if (!(cVar == null ? false : cVar.isOpen())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugSocket", "sendSocketMsg fail, not open");
            return false;
        }
        if (k47Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugSocket", "sendSocketMsg fail");
            return false;
        }
        try {
            allocate = java.nio.ByteBuffer.wrap(k47Var.toByteArray());
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugUtil", e17.getMessage());
            allocate = java.nio.ByteBuffer.allocate(0);
        }
        this.f77843a.e(allocate);
        return true;
    }
}
