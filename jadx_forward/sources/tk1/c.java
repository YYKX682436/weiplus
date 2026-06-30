package tk1;

/* loaded from: classes7.dex */
public abstract class c extends sk1.f implements java.lang.Runnable, wu5.d, wu5.g, sk1.e {

    /* renamed from: e, reason: collision with root package name */
    public final java.net.URI f501428e;

    /* renamed from: f, reason: collision with root package name */
    public final sk1.g f501429f;

    /* renamed from: h, reason: collision with root package name */
    public java.io.InputStream f501431h;

    /* renamed from: i, reason: collision with root package name */
    public java.io.OutputStream f501432i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f501434n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f501435o;

    /* renamed from: r, reason: collision with root package name */
    public final int f501438r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f501439s;

    /* renamed from: u, reason: collision with root package name */
    public java.util.concurrent.Future f501441u;

    /* renamed from: g, reason: collision with root package name */
    public java.net.Socket f501430g = null;

    /* renamed from: m, reason: collision with root package name */
    public final java.net.Proxy f501433m = java.net.Proxy.NO_PROXY;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f501436p = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f501437q = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: t, reason: collision with root package name */
    public java.util.Timer f501440t = null;

    public c(java.net.URI uri, uk1.b bVar, java.util.Map map, int i17) {
        this.f501428e = null;
        this.f501429f = null;
        this.f501438r = 0;
        if (uri == null) {
            throw new java.lang.IllegalArgumentException();
        }
        if (bVar == null) {
            throw new java.lang.IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
        this.f501428e = uri;
        this.f501435o = map;
        this.f501438r = i17;
        this.f501429f = new sk1.g(this, bVar);
        this.f490470d = false;
    }

    public static void h(tk1.c cVar) {
        cVar.getClass();
        try {
            java.net.Socket socket = cVar.f501430g;
            if (socket != null) {
                socket.close();
            }
        } catch (java.io.IOException e17) {
            cVar.l(e17);
        }
    }

    private int j() {
        java.net.URI uri = this.f501428e;
        int port = uri.getPort();
        if (port != -1) {
            return port;
        }
        java.lang.String scheme = uri.getScheme();
        if (scheme.equals("wss")) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33726x366c91de;
        }
        if (scheme.equals("ws")) {
            return 80;
        }
        throw new java.lang.RuntimeException("unkonow scheme".concat(scheme));
    }

    public void a(java.lang.String str, int i17) {
        if (this.f501434n != null) {
            this.f501429f.a(i17, str, false);
        }
    }

    public void b(java.util.Timer timer) {
        this.f501440t = timer;
    }

    public java.util.Timer c() {
        return this.f501440t;
    }

    /* renamed from: close */
    public void m166711x5a5ddf8() {
        if (this.f501434n != null) {
            this.f501429f.a(1000, "", false);
        }
    }

    public void d(java.lang.String str) {
        sk1.g gVar = this.f501429f;
        if (str == null) {
            gVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "Cannot send 'null' data to a WebSocketImpl.");
            return;
        }
        ((uk1.d) gVar.f490476h).getClass();
        wk1.f fVar = new wk1.f();
        try {
            fVar.f528465c = java.nio.ByteBuffer.wrap(yk1.c.b(str));
        } catch (vk1.b e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetWork.Draft_10", "createFrames setPayload exception" + e17.toString());
        }
        fVar.f528463a = true;
        fVar.f528464b = wk1.d.TEXT;
        gVar.g(java.util.Collections.singletonList(fVar));
    }

    public void e(java.nio.ByteBuffer byteBuffer) {
        sk1.g gVar = this.f501429f;
        if (byteBuffer == null) {
            gVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "Cannot send 'null' data to a WebSocketImpl.");
            return;
        }
        ((uk1.d) gVar.f490476h).getClass();
        wk1.f fVar = new wk1.f();
        try {
            fVar.f528465c = byteBuffer;
        } catch (vk1.b e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetWork.Draft_10", "createFrames setPayload exception" + e17.toString());
        }
        fVar.f528463a = true;
        fVar.f528464b = wk1.d.BINARY;
        gVar.g(java.util.Collections.singletonList(fVar));
    }

    @Override // wu5.d
    public void f(java.util.concurrent.Future future) {
        this.f501441u = future;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "WebsocketWriteThread";
    }

    /* renamed from: getTaskId */
    public java.lang.String m166712x30961476() {
        return this.f501439s;
    }

    public void i() {
        if (this.f501434n != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetWork.WebSocketClient", "WebSocketClient objects are not reuseable");
            return;
        }
        this.f501434n = this;
        ((ku5.t0) ku5.t0.f394148d).g(this.f501434n);
    }

    /* renamed from: isOpen */
    public boolean m166713xb9a70294() {
        return this.f501429f.f490474f == sk1.c.OPEN;
    }

    public abstract void k(int i17, java.lang.String str, boolean z17);

    public abstract void l(java.lang.Exception exc);

    public abstract void m(wk1.e eVar);

    public abstract void n(java.lang.String str);

    public abstract void o(java.nio.ByteBuffer byteBuffer);

    public abstract void p(xk1.g gVar);

    public final void q(sk1.e eVar, int i17, java.lang.String str, boolean z17) {
        this.f501436p.countDown();
        this.f501437q.countDown();
        java.util.concurrent.Future future = this.f501441u;
        if (future != null) {
            future.cancel(false);
        }
        java.lang.Runnable runnable = this.f501434n;
        if (runnable != null && (runnable instanceof tk1.b)) {
            ((tk1.b) runnable).f501426d = true;
        }
        try {
            java.net.Socket socket = this.f501430g;
            if (socket != null) {
                socket.close();
            }
        } catch (java.io.IOException e17) {
            l(e17);
        }
        k(i17, str, z17);
    }

    public final void r() {
        byte[] bArr;
        java.net.URI uri = this.f501428e;
        java.lang.String rawPath = uri.getRawPath();
        java.lang.String rawQuery = uri.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + "?" + rawQuery;
        }
        int j17 = j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(uri.getHost());
        sb6.append(j17 != 80 ? ":" + j17 : "");
        java.lang.String sb7 = sb6.toString();
        xk1.c cVar = new xk1.c();
        if (rawPath == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetWork.HandshakeImpl1Client", "http resource descriptor must not be null");
        } else {
            cVar.f536537b = rawPath;
        }
        cVar.b("Host", sb7);
        java.util.Map map = this.f501435o;
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                cVar.b((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        sk1.g gVar = this.f501429f;
        sk1.h hVar = gVar.f490475g;
        xk1.b d17 = gVar.f490476h.d(cVar);
        gVar.f490480o = d17;
        if (cVar.f536537b == null) {
            return;
        }
        try {
            hVar.g(gVar, d17);
            uk1.b bVar = gVar.f490476h;
            xk1.e eVar = gVar.f490480o;
            bVar.getClass();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(100);
            if (eVar instanceof xk1.a) {
                sb8.append("GET ");
                sb8.append(((xk1.c) eVar).f536537b);
                sb8.append(" HTTP/1.1");
            } else if (eVar instanceof xk1.g) {
                sb8.append("HTTP/1.1 101 " + ((xk1.d) ((xk1.g) eVar)).f536539c);
            } else {
                sb8.append("GET ");
                sb8.append(((xk1.c) eVar).f536537b);
                sb8.append(" HTTP/1.1");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetWork.Draft", "unknow role");
            }
            sb8.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            xk1.f fVar = (xk1.f) eVar;
            for (java.lang.String str : java.util.Collections.unmodifiableSet(fVar.f536540a.keySet())) {
                java.lang.String a17 = fVar.a(str);
                sb8.append(str);
                sb8.append(": ");
                sb8.append(a17);
                sb8.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            }
            sb8.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            java.lang.String sb9 = sb8.toString();
            java.nio.charset.CodingErrorAction codingErrorAction = yk1.c.f544312a;
            try {
                bArr = sb9.getBytes("ASCII");
            } catch (java.io.UnsupportedEncodingException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetWork.Charsetfunctions", e17.toString());
                bArr = new byte[0];
            }
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bArr.length + 0);
            allocate.put(bArr);
            allocate.flip();
            java.util.Iterator it = java.util.Collections.singletonList(allocate).iterator();
            while (it.hasNext()) {
                gVar.f490472d.add((java.nio.ByteBuffer) it.next());
                gVar.f490475g.getClass();
            }
        } catch (java.lang.RuntimeException e18) {
            ((tk1.c) hVar).l(e18);
            throw new vk1.d("rejected because of" + e18);
        } catch (vk1.b unused) {
            throw new vk1.d("Handshake data rejected by client.");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int read;
        try {
            java.net.Socket socket = this.f501430g;
            if (socket == null) {
                this.f501430g = new java.net.Socket(this.f501433m);
            } else if (socket.isClosed()) {
                throw new java.io.IOException();
            }
            this.f501430g.setTcpNoDelay(this.f490470d);
            if (!this.f501430g.isBound()) {
                this.f501430g.connect(new java.net.InetSocketAddress(this.f501428e.getHost(), j()), this.f501438r);
            }
            this.f501431h = this.f501430g.getInputStream();
            this.f501432i = this.f501430g.getOutputStream();
            r();
            this.f501434n = new tk1.b(this, null);
            ((ku5.t0) ku5.t0.f394148d).g(this.f501434n);
            int i17 = sk1.g.f490471s;
            byte[] bArr = new byte[16384];
            while (true) {
                try {
                    sk1.c cVar = this.f501429f.f490474f;
                    boolean z17 = true;
                    if (!(cVar == sk1.c.CLOSING)) {
                        if (cVar != sk1.c.CLOSED) {
                            z17 = false;
                        }
                        if (z17 || (read = this.f501431h.read(bArr)) == -1) {
                            break;
                        } else {
                            this.f501429f.c(java.nio.ByteBuffer.wrap(bArr, 0, read));
                        }
                    } else {
                        break;
                    }
                } catch (java.io.IOException unused) {
                    this.f501429f.e();
                    return;
                } catch (java.lang.RuntimeException e17) {
                    l(e17);
                    this.f501429f.b(1006, e17.getMessage(), false);
                    return;
                }
            }
            this.f501429f.e();
        } catch (java.lang.Exception e18) {
            this.f501429f.b(-1, e18.getMessage(), false);
        }
    }

    public void s(java.net.Socket socket) {
        if (this.f501430g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetWork.WebSocketClient", "socket has already been set");
        } else {
            this.f501430g = socket;
        }
    }
}
