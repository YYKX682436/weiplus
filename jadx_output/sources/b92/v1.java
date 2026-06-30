package b92;

@j95.b
/* loaded from: classes10.dex */
public final class v1 extends i95.w implements zy2.z7 {

    /* renamed from: e, reason: collision with root package name */
    public long f18523e;

    /* renamed from: o, reason: collision with root package name */
    public int f18530o;

    /* renamed from: r, reason: collision with root package name */
    public long f18533r;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.FinderLiveDNSParseService$mainUiIndexChangeListener$1 f18535t;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f18522d = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f18524f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f18525g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f18526h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f18527i = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f18528m = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f18529n = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f18531p = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new b92.n1(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f18532q = jz5.h.b(b92.i1.f18440d);

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.FinderLiveDNSParseService$networkChangeReceiver$1 f18534s = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.finder.FinderLiveDNSParseService$networkChangeReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            b92.v1.this.Vi("networkChangeReceiver");
        }
    };

    /* JADX WARN: Type inference failed for: r0v10, types: [com.tencent.mm.plugin.finder.FinderLiveDNSParseService$networkChangeReceiver$1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.tencent.mm.plugin.finder.FinderLiveDNSParseService$mainUiIndexChangeListener$1] */
    public v1() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f18535t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HomeUITabChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.FinderLiveDNSParseService$mainUiIndexChangeListener$1
            {
                this.__eventId = -1095690568;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.HomeUITabChangeEvent homeUITabChangeEvent) {
                com.tencent.mm.autogen.events.HomeUITabChangeEvent event = homeUITabChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = event.f54438g.f7425a;
                b92.v1 v1Var = b92.v1.this;
                if (i17 == 2) {
                    v1Var.f18529n.set(true);
                } else {
                    v1Var.f18529n.set(false);
                }
                v1Var.Zi("mainUiTabChange");
                return false;
            }
        };
    }

    public static final java.lang.String wi(b92.v1 v1Var, java.lang.String str, java.lang.String str2) {
        v1Var.getClass();
        if (str.length() == 0) {
            return "";
        }
        try {
            java.net.InetAddress byName = java.net.InetAddress.getByName(str);
            java.lang.String hostAddress = byName.getHostAddress();
            if (hostAddress == null) {
                hostAddress = "";
            }
            com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "getLocalIP: success, source=" + str2 + ", host=" + str + ", ip=" + hostAddress + ", address=" + byName);
            return hostAddress;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveDNSParseService", th6, "getLocalIP: source=" + str2, new java.lang.Object[0]);
            return "";
        }
    }

    public java.lang.String Ai(java.lang.String source, java.lang.String url, long j17) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(url, "url");
        if (!Di(url)) {
            com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "appendTimestampToIPUrl: is not ip url, source=" + source + ", url=" + url);
            return url;
        }
        android.net.Uri parse = android.net.Uri.parse(url);
        java.lang.String queryParameter = parse.getQueryParameter("local_request_ts");
        boolean z17 = false;
        if (queryParameter != null) {
            if (queryParameter.length() > 0) {
                z17 = true;
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "appendTimestampToIPUrl: already has ts param, source=" + source + ", requestTimestamp=" + j17 + ", url=" + url);
            return url;
        }
        java.lang.String uri = parse.buildUpon().appendQueryParameter("local_request_ts", java.lang.String.valueOf(j17)).build().toString();
        kotlin.jvm.internal.o.f(uri, "toString(...)");
        com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "appendTimestampToIPUrl: source=" + source + ", requestTimestamp=" + j17 + ", newUrl=" + uri);
        return uri;
    }

    public final java.lang.String Bi(java.lang.String str) {
        java.lang.String str2;
        android.net.Uri parse = android.net.Uri.parse(str);
        boolean z17 = false;
        if (!(r26.i0.y(str, "http://[", false) || r26.i0.y(str, "https://[", false))) {
            return parse.getHost();
        }
        java.lang.String host = parse.getHost();
        if (host != null && r26.n0.B(host, "[", false)) {
            if (host != null && r26.n0.B(host, "]", false)) {
                z17 = true;
            }
            if (z17) {
                return host;
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "getIPHost: direct get host error, errorHost=" + host + ", originString=" + str);
        int K = r26.n0.K(str, '[', 0, false, 6, null);
        int K2 = r26.n0.K(str, ']', 0, false, 6, null) + 1;
        if (!(1 <= K && K < K2) || K2 >= str.length()) {
            str2 = null;
        } else {
            str2 = str.substring(K, K2);
            kotlin.jvm.internal.o.f(str2, "substring(...)");
        }
        com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "safeGetIPv6FromUri: host=" + str2 + ", originString=" + str);
        return str2;
    }

    public final boolean Di(java.lang.String str) {
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.e("FinderLiveDNSParseService", "isIPUrl: url is empty");
            return false;
        }
        if (r26.i0.y(str, "http://[", false) || r26.i0.y(str, "https://[", false)) {
            com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "isIPUrl: isIPv6, url=".concat(str));
            return true;
        }
        java.lang.String Bi = Bi(str);
        boolean a17 = com.tencent.mm.sdk.platformtools.a2.a(Bi);
        com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "isIPUrl: isIPv4Addr=" + a17 + ", host=" + Bi + ", url=" + str);
        return a17;
    }

    public boolean Ni(java.lang.String source, java.lang.String ipUrl) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(ipUrl, "ipUrl");
        if ((ipUrl.length() == 0) || !Di(ipUrl)) {
            com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "markIPUrlInvalid: url do not contain ip, source=" + source + ", ipUrl=" + ipUrl);
            return false;
        }
        java.lang.String Bi = Bi(ipUrl);
        str = "";
        if (Bi == null) {
            Bi = "";
        }
        if (Bi.length() > 0) {
            java.lang.String Bi2 = Bi(r26.i0.t(ipUrl, Bi.concat("/"), "", false));
            str = Bi2 != null ? Bi2 : "";
            this.f18526h.put(Bi, str);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "markIPUrlInvalid: source=" + source + ", ip=" + Bi + ", host=" + str + ", ipUrl=" + ipUrl);
        return Bi.length() > 0;
    }

    public void Ri(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "onChattingChange: isEnterChatting=" + z17);
        this.f18528m.set(z17);
        Zi("onChattingChange");
    }

    public void Ui(boolean z17) {
        if (z17) {
            this.f18530o++;
        } else {
            this.f18530o--;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "onFinderChange: isEnterFinder=" + z17 + ", curEnterFinderUICnt=" + this.f18530o);
        Zi("onFinderChange");
    }

    public void Vi(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f18533r = android.os.SystemClock.elapsedRealtime();
        this.f18525g.clear();
        this.f18523e = 0L;
        com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "reloadDNS: source=" + source + ", networkChangeTimestamp=" + this.f18533r);
        this.f18531p.removeCallbacksAndMessages(null);
        pm0.v.O("FinderLiveDNSParseService", new b92.s1(this));
    }

    public final void Zi(java.lang.String str) {
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3750g1).getValue()).r()).intValue() == 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "triggerDNSTimer: switch is off, source=" + str);
            return;
        }
        boolean z17 = this.f18527i.get();
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f18531p;
        if (z17) {
            n3Var.removeCallbacksAndMessages(null);
            com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "triggerDNSTimer: isBackground, source=" + str);
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f18529n;
        boolean z18 = atomicBoolean.get();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = this.f18528m;
        if (!z18 && !atomicBoolean2.get() && this.f18530o <= 0) {
            n3Var.removeCallbacksAndMessages(null);
            com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "triggerDNSTimer: source=" + str + ", remove message");
            return;
        }
        i95.n0.c(nz.e.class);
        if (n3Var.hasMessages(999)) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f18523e;
        android.os.Message obtainMessage = n3Var.obtainMessage(999, str);
        jz5.g gVar = this.f18532q;
        long intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() - elapsedRealtime;
        if (intValue <= 0) {
            n3Var.sendMessage(obtainMessage);
        } else {
            long intValue2 = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
            if (intValue <= intValue2) {
                intValue2 = intValue;
            }
            n3Var.sendMessageDelayed(obtainMessage, intValue2);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "triggerDNSTimer: source=" + str + ", postDelay=" + intValue + ", isInFindTab=" + atomicBoolean + ", isInChatting=" + atomicBoolean2 + ", enterFinderUiCnt=" + this.f18530o);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this.f18534s, intentFilter);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveDNSParseService", e17, "registerNetworkChangeReceiver: ", new java.lang.Object[0]);
        }
        alive();
        com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.addLifecycleCallback(new b92.q1(this));
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(this.f18534s);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveDNSParseService", e17, "unRegisterNetworkChangeReceiver: ", new java.lang.Object[0]);
        }
        dead();
    }
}
