package yw4;

/* loaded from: classes7.dex */
public final class q implements nw4.g {

    /* renamed from: a, reason: collision with root package name */
    public final nw4.j f548511a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 f548512b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f548513c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f548514d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f548515e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f548516f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f548517g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f548518h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f548519i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f548520j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f548521k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f548522l;

    static {
        new yw4.k(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        if (r5.intValue() != 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006e, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        if (r5.intValue() != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (r5.intValue() == 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007b, code lost:
    
        if (r5.intValue() == 1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(nw4.j r5, com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 r6, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 r7) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw4.q.<init>(nw4.j, com.tencent.mm.protocal.JsapiPermissionWrapper, com.tencent.mm.ui.widget.MMWebView):void");
    }

    public static final void b(yw4.q qVar) {
        android.content.Context context;
        boolean z17;
        java.util.List list = qVar.f548516f;
        if (((java.util.ArrayList) list).isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "dealMsgQueue fail, resultValueList is empty");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealMsgQueue, pre msgList = ");
        java.util.LinkedList linkedList = qVar.f548517g;
        sb6.append(linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherJsApiHandler", sb6.toString());
        try {
            java.util.List b17 = nw4.z2.b((java.lang.String) ((java.util.ArrayList) list).remove(0), qVar.f548520j, qVar.f548521k);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(b17)) {
                linkedList.addAll(b17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "dealMsgQueue now msg list size : %d", java.lang.Integer.valueOf(linkedList.size()));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebPrefetcherJsApiHandler", e17, "dealMsgQueue exception", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "dealMsgQueue, post msgList = " + linkedList.size());
        do {
            if (linkedList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "dealNextMsg stop, msgList is empty");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "dealNextMsg size: %s", java.lang.Integer.valueOf(linkedList.size()));
                nw4.y2 y2Var = (nw4.y2) linkedList.remove(0);
                if (y2Var != null) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = qVar.f548513c;
                    if (c22633x83752a59 == null || (context = c22633x83752a59.getContext()) == null) {
                        context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    }
                    android.content.Context context2 = context;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3 = qVar.f548512b;
                    if (c19775x58fd37b3 == null) {
                        c19775x58fd37b3 = y2Var.f422549f;
                    }
                    nw4.k kVar = new nw4.k(context2, c19775x58fd37b3, null, qVar, qVar.f548513c);
                    nw4.d3 d3Var = nw4.d3.f422354a;
                    nw4.j jsApiPool = qVar.f548511a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiPool, "jsApiPool");
                    if (jsApiPool.b(kVar, y2Var) && jsApiPool.a(kVar, y2Var)) {
                        z17 = true;
                    }
                }
            }
            z17 = false;
        } while (z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = qVar.f548514d;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(new yw4.l(qVar));
        }
    }

    @Override // nw4.f
    /* renamed from: _getAllHosts */
    public void mo150193xc0afce61(java.lang.String str) {
    }

    @android.webkit.JavascriptInterface
    /* renamed from: _getDgtVerifyRandomStr */
    public final java.lang.String m177959x2cca205b() {
        boolean z17 = this.f548519i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "_getDgtVerifyRandomStr canUpdateRandomStr: %s, canGet: %s, randomStr: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f548522l), this.f548521k);
        if (z17 && !this.f548522l) {
            return "";
        }
        this.f548522l = false;
        return this.f548521k;
    }

    @Override // nw4.f
    /* renamed from: _getHtmlContent */
    public void mo150194xf0849337(java.lang.String str) {
    }

    @android.webkit.JavascriptInterface
    /* renamed from: _isDgtVerifyEnabled */
    public final boolean m177960x71f0cba0() {
        return this.f548520j;
    }

    @Override // nw4.f
    /* renamed from: _ready */
    public void mo150195xa8923ca4(boolean z17) {
    }

    @Override // nw4.f
    @android.webkit.JavascriptInterface
    /* renamed from: _sendMessage */
    public void mo150196x4231da0(java.lang.String str) {
        if (this.f548514d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebPrefetcherJsApiHandler", "_sendMessage msgQueueHandler err");
            return;
        }
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        obtain.obj = str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f548514d;
        if (n3Var != null) {
            n3Var.mo50308x2936bf5f(obtain);
        }
    }

    @Override // nw4.g
    public int d() {
        return 0;
    }

    @Override // nw4.e
    public void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        if (!(str == null || str.length() == 0)) {
            if (!(str == null || str.length() == 0)) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("errMsg", str2 == null ? "" : str2);
                if (!(map == null || map.isEmpty())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "doCallback, retValue size: " + map.size() + ' ');
                    hashMap.putAll(map);
                }
                java.lang.String a17 = nw4.x2.a(str, hashMap, this.f548520j, this.f548521k);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "doCallback, ret = " + str2 + ", cb = " + a17);
                if (a17 == null || this.f548513c == null) {
                    return;
                }
                yw4.n nVar = new yw4.n(this, a17);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                    nVar.run();
                    return;
                } else {
                    ((ku5.t0) ku5.t0.f394148d).B(nVar);
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebPrefetcherJsApiHandler", "doCallback, invalid args, ret = " + str2);
    }

    @Override // nw4.g
    public nw4.j g() {
        return this.f548511a;
    }
}
