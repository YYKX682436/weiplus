package mf1;

/* loaded from: classes7.dex */
public class f implements mf1.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f407572d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f407573e;

    /* renamed from: f, reason: collision with root package name */
    public final java.net.URI f407574f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f407575g;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.p3132xf2511bc7.C27056x4979ef19 f407578m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f407579n;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f407582q;

    /* renamed from: r, reason: collision with root package name */
    public mf1.j f407583r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.p3132xf2511bc7.a f407584s;

    /* renamed from: u, reason: collision with root package name */
    public final javax.net.ssl.X509TrustManager f407586u;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f407576h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f407577i = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public int f407580o = -1;

    /* renamed from: p, reason: collision with root package name */
    public java.util.Timer f407581p = null;

    /* renamed from: t, reason: collision with root package name */
    public mf1.e f407585t = mf1.e.NOT_YET_CONNECTED;

    public f(java.lang.String str, java.lang.String str2, java.net.URI uri, java.util.Map map, com.p314xaae8f345.p3132xf2511bc7.C27056x4979ef19 c27056x4979ef19, java.util.ArrayList arrayList, uh1.a aVar) {
        this.f407572d = str;
        this.f407573e = str2;
        this.f407574f = uri;
        this.f407575g = map;
        this.f407578m = c27056x4979ef19;
        this.f407582q = arrayList;
        this.f407586u = uh1.j0.r(aVar);
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandWcWssSocket", "header is null");
            return;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            this.f407576h.add(entry.getKey());
            this.f407577i.add(entry.getValue());
        }
    }

    public static xk1.e f(mf1.f fVar, int i17, java.lang.String[] strArr, java.lang.String[] strArr2) {
        int i18 = 0;
        if (i17 != 1) {
            fVar.getClass();
            if (i17 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWcWssSocket", "buildHandshake unknow type:%s", java.lang.Integer.valueOf(i17));
                return null;
            }
            xk1.d dVar = new xk1.d();
            if (strArr == null || strArr2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWcWssSocket", "buildHandshake header args is null type:%s", java.lang.Integer.valueOf(i17));
                return dVar;
            }
            if (strArr.length != strArr2.length) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWcWssSocket", "buildHandshake headerKey != headerValue type:%s", java.lang.Integer.valueOf(i17));
                return dVar;
            }
            while (i18 < strArr.length) {
                dVar.b(strArr[i18], strArr2[i18]);
                i18++;
            }
            return dVar;
        }
        java.net.URI uri = fVar.f407574f;
        java.lang.String path = uri.getPath();
        java.lang.String query = uri.getQuery();
        if (path == null || path.length() == 0) {
            path = "/";
        }
        if (query != null) {
            path = path + "?" + query;
        }
        int port = uri.getPort();
        if (port == -1) {
            java.lang.String scheme = uri.getScheme();
            if (scheme.equals("wss")) {
                port = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33726x366c91de;
            } else if (scheme.equals("ws")) {
                port = 80;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandWcWssSocket", "getPort unkonow scheme:%s", scheme);
            }
        }
        java.lang.String host = (port == -1 || port == 80) ? uri.getHost() : uri.getHost() + ":" + port;
        xk1.c cVar = new xk1.c();
        if (path == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetWork.HandshakeImpl1Client", "http resource descriptor must not be null");
        } else {
            cVar.f536537b = path;
        }
        cVar.b("Host", host);
        if (strArr != null && strArr2 != null) {
            if (strArr.length != strArr2.length) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWcWssSocket", "buildHandshake headerKey != headerValue type:%s", java.lang.Integer.valueOf(i17));
                return cVar;
            }
            while (i18 < strArr.length) {
                cVar.b(strArr[i18], strArr2[i18]);
                i18++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWcWssSocket", "buildHandshake headerKey.length:%s, type:%s", java.lang.Integer.valueOf(strArr.length), java.lang.Integer.valueOf(i17));
            return cVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWcWssSocket", "buildHandshake header args is null type:%s", java.lang.Integer.valueOf(i17));
        java.util.Map map = fVar.f407575g;
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWcWssSocket", "buildHandshake mHeaders is null type:%s", java.lang.Integer.valueOf(i17));
            return cVar;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            cVar.b((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        return cVar;
    }

    @Override // mf1.k
    public void a(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWcWssSocket", "close reason:%s,code:%s", str, java.lang.Integer.valueOf(i17));
        int i18 = this.f407580o;
        if (i18 < 0) {
            ((mf1.a) this.f407583r).a("error socket id");
            return;
        }
        mf1.e eVar = this.f407585t;
        mf1.e eVar2 = mf1.e.CLOSING;
        if (eVar != eVar2 && eVar != mf1.e.CLOSED) {
            this.f407585t = eVar2;
        }
        com.p314xaae8f345.p3132xf2511bc7.C27055x4f8528b.m108915xa028f8b(this.f407572d, i18, i17, str);
    }

    @Override // mf1.k
    public void b(java.util.Timer timer) {
        this.f407581p = timer;
    }

    @Override // mf1.k
    public java.util.Timer c() {
        return this.f407581p;
    }

    @Override // mf1.k
    /* renamed from: close */
    public void mo147252x5a5ddf8() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWcWssSocket", "close");
        a("default_close", 1000);
    }

    @Override // mf1.k
    public void d(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWcWssSocket", "send text");
        if (this.f407580o < 0) {
            ((mf1.a) this.f407583r).a("error socket id");
            return;
        }
        try {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(str.getBytes("UTF8"));
            byte[] bArr = new byte[wrap.remaining()];
            wrap.get(bArr);
            com.p314xaae8f345.p3132xf2511bc7.C27055x4f8528b.m108926xffee89e8(this.f407572d, this.f407580o, bArr, true);
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandWcWssSocket", e17, "unsupport encoding UnsupportedEncodingException", new java.lang.Object[0]);
            ((mf1.a) this.f407583r).a("unsupport encoding");
        }
    }

    @Override // mf1.k
    public void e(java.nio.ByteBuffer byteBuffer) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWcWssSocket", "send bytes");
        if (this.f407580o < 0) {
            ((mf1.a) this.f407583r).a("error socket id");
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        com.p314xaae8f345.p3132xf2511bc7.C27055x4f8528b.m108926xffee89e8(this.f407572d, this.f407580o, bArr, false);
    }

    @Override // mf1.k
    /* renamed from: getTaskId */
    public java.lang.String mo147253x30961476() {
        return this.f407579n;
    }

    @Override // mf1.k
    /* renamed from: isOpen */
    public boolean mo147254xb9a70294() {
        return this.f407585t == mf1.e.OPEN;
    }
}
