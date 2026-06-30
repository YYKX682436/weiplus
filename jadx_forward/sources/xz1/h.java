package xz1;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xz1.k f539713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.LocalSocket f539714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz1.h f539715f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz1.i f539716g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f539717h;

    public h(xz1.k kVar, android.net.LocalSocket localSocket, yz1.h hVar, yz1.i iVar, java.lang.String str) {
        this.f539713d = kVar;
        this.f539714e = localSocket;
        this.f539715f = hVar;
        this.f539716g = iVar;
        this.f539717h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xz1.k kVar = this.f539713d;
        android.net.LocalSocket localSocket = this.f539714e;
        yz1.h hVar = this.f539715f;
        yz1.i iVar = this.f539716g;
        java.lang.String str = this.f539717h;
        if (!("websocket".equalsIgnoreCase(yz1.n.a(hVar, "Upgrade")) && "Upgrade".equals(yz1.n.a(hVar, "Connection")) && "13".equals(yz1.n.a(hVar, "Sec-WebSocket-Version")))) {
            iVar.f550038c = 501;
            iVar.f550039d = "Not Implemented";
            iVar.f550040e = yz1.f.a("Not a supported WebSocket upgrade request\n", "text/plain");
            return;
        }
        iVar.f550038c = 101;
        iVar.f550039d = "Switching Protocols";
        iVar.a("Upgrade", "websocket");
        iVar.a("Connection", "Upgrade");
        iVar.f550040e = null;
        java.lang.String a17 = yz1.n.a(hVar, "Sec-WebSocket-Key");
        if (a17 != null) {
            try {
                java.lang.String concat = a17.concat("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-1");
                int i17 = yz1.m.f550044a;
                try {
                    messageDigest.update(concat.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                    iVar.a("Sec-WebSocket-Accept", android.util.Base64.encodeToString(messageDigest.digest(), 2));
                } catch (java.io.UnsupportedEncodingException e17) {
                    throw new java.lang.RuntimeException(e17);
                }
            } catch (java.security.NoSuchAlgorithmException e18) {
                throw new java.lang.RuntimeException(e18);
            }
        }
        java.io.InputStream inputStream = localSocket.getInputStream();
        java.io.OutputStream outputStream = localSocket.getOutputStream();
        yz1.d dVar = new yz1.d(new java.io.BufferedOutputStream(outputStream));
        xz1.d dVar2 = xz1.k.f539720i;
        dVar2.e(iVar, dVar);
        yz1.q qVar = new yz1.q(inputStream, outputStream, kVar, str);
        if (!qVar.f550051e.getAndSet(true)) {
            xz1.k kVar2 = (xz1.k) qVar.f550049c;
            synchronized (kVar2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DevTools.DevToolsService", "onOpen " + qVar.f550050d);
                qk.u6 u6Var = (qk.u6) kVar2.f539726g.get(qVar.f550050d);
                if (u6Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DevTools.DevToolsService", "onOpen without attachable");
                } else {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = kVar2.f539727h;
                    java.lang.String str2 = qVar.f550050d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getKey(...)");
                    concurrentHashMap.put(str2, qVar);
                    u6Var.c();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DevTools.DevToolsService", "onOpen after " + dVar2.d(u6Var));
                }
            }
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DevTools.WebSocketSession", "readloop");
            qVar.f550047a.a(qVar.f550053g);
        } catch (java.io.EOFException unused) {
            qVar.b(1011, "EOF while reading");
        } catch (java.io.IOException e19) {
            qVar.b(1006, null);
            throw e19;
        }
    }
}
