package b92;

@j95.b
/* loaded from: classes10.dex */
public final class v1 extends i95.w implements zy2.z7 {

    /* renamed from: e, reason: collision with root package name */
    public long f100056e;

    /* renamed from: o, reason: collision with root package name */
    public int f100063o;

    /* renamed from: r, reason: collision with root package name */
    public long f100066r;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.C13633x4f3f524b f100068t;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f100055d = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f100057f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f100058g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f100059h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f100060i = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f100061m = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f100062n = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f100064p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper(), new b92.n1(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f100065q = jz5.h.b(b92.i1.f99973d);

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.C13634xc434b8cf f100067s = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.finder.FinderLiveDNSParseService$networkChangeReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            b92.v1.this.Vi("networkChangeReceiver");
        }
    };

    /* JADX WARN: Type inference failed for: r0v10, types: [com.tencent.mm.plugin.finder.FinderLiveDNSParseService$networkChangeReceiver$1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.tencent.mm.plugin.finder.FinderLiveDNSParseService$mainUiIndexChangeListener$1] */
    public v1() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f100068t = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8>(a0Var) { // from class: com.tencent.mm.plugin.finder.FinderLiveDNSParseService$mainUiIndexChangeListener$1
            {
                this.f39173x3fe91575 = -1095690568;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8 c5643xca5254a8) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8 event = c5643xca5254a8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i17 = event.f135971g.f88958a;
                b92.v1 v1Var = b92.v1.this;
                if (i17 == 2) {
                    v1Var.f100062n.set(true);
                } else {
                    v1Var.f100062n.set(false);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "getLocalIP: success, source=" + str2 + ", host=" + str + ", ip=" + hostAddress + ", address=" + byName);
            return hostAddress;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderLiveDNSParseService", th6, "getLocalIP: source=" + str2, new java.lang.Object[0]);
            return "";
        }
    }

    public java.lang.String Ai(java.lang.String source, java.lang.String url, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (!Di(url)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "appendTimestampToIPUrl: is not ip url, source=" + source + ", url=" + url);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "appendTimestampToIPUrl: already has ts param, source=" + source + ", requestTimestamp=" + j17 + ", url=" + url);
            return url;
        }
        java.lang.String uri = parse.buildUpon().appendQueryParameter("local_request_ts", java.lang.String.valueOf(j17)).build().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "appendTimestampToIPUrl: source=" + source + ", requestTimestamp=" + j17 + ", newUrl=" + uri);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "getIPHost: direct get host error, errorHost=" + host + ", originString=" + str);
        int K = r26.n0.K(str, '[', 0, false, 6, null);
        int K2 = r26.n0.K(str, ']', 0, false, 6, null) + 1;
        if (!(1 <= K && K < K2) || K2 >= str.length()) {
            str2 = null;
        } else {
            str2 = str.substring(K, K2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "safeGetIPv6FromUri: host=" + str2 + ", originString=" + str);
        return str2;
    }

    public final boolean Di(java.lang.String str) {
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveDNSParseService", "isIPUrl: url is empty");
            return false;
        }
        if (r26.i0.y(str, "http://[", false) || r26.i0.y(str, "https://[", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "isIPUrl: isIPv6, url=".concat(str));
            return true;
        }
        java.lang.String Bi = Bi(str);
        boolean a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a2.a(Bi);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "isIPUrl: isIPv4Addr=" + a17 + ", host=" + Bi + ", url=" + str);
        return a17;
    }

    public boolean Ni(java.lang.String source, java.lang.String ipUrl) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ipUrl, "ipUrl");
        if ((ipUrl.length() == 0) || !Di(ipUrl)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "markIPUrlInvalid: url do not contain ip, source=" + source + ", ipUrl=" + ipUrl);
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
            this.f100059h.put(Bi, str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "markIPUrlInvalid: source=" + source + ", ip=" + Bi + ", host=" + str + ", ipUrl=" + ipUrl);
        return Bi.length() > 0;
    }

    public void Ri(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "onChattingChange: isEnterChatting=" + z17);
        this.f100061m.set(z17);
        Zi("onChattingChange");
    }

    public void Ui(boolean z17) {
        if (z17) {
            this.f100063o++;
        } else {
            this.f100063o--;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "onFinderChange: isEnterFinder=" + z17 + ", curEnterFinderUICnt=" + this.f100063o);
        Zi("onFinderChange");
    }

    public void Vi(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f100066r = android.os.SystemClock.elapsedRealtime();
        this.f100058g.clear();
        this.f100056e = 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "reloadDNS: source=" + source + ", networkChangeTimestamp=" + this.f100066r);
        this.f100064p.mo50302x6b17ad39(null);
        pm0.v.O("FinderLiveDNSParseService", new b92.s1(this));
    }

    public final void Zi(java.lang.String str) {
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85283g1).mo141623x754a37bb()).r()).intValue() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "triggerDNSTimer: switch is off, source=" + str);
            return;
        }
        boolean z17 = this.f100060i.get();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f100064p;
        if (z17) {
            n3Var.mo50302x6b17ad39(null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "triggerDNSTimer: isBackground, source=" + str);
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f100062n;
        boolean z18 = atomicBoolean.get();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = this.f100061m;
        if (!z18 && !atomicBoolean2.get() && this.f100063o <= 0) {
            n3Var.mo50302x6b17ad39(null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "triggerDNSTimer: source=" + str + ", remove message");
            return;
        }
        i95.n0.c(nz.e.class);
        if (n3Var.mo50285x8fc9be06(999)) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f100056e;
        android.os.Message mo50292x733c63a2 = n3Var.mo50292x733c63a2(999, str);
        jz5.g gVar = this.f100065q;
        long intValue = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() - elapsedRealtime;
        if (intValue <= 0) {
            n3Var.mo50308x2936bf5f(mo50292x733c63a2);
        } else {
            long intValue2 = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
            if (intValue <= intValue2) {
                intValue2 = intValue;
            }
            n3Var.mo50311x7ab51103(mo50292x733c63a2, intValue2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "triggerDNSTimer: source=" + str + ", postDelay=" + intValue + ", isInFindTab=" + atomicBoolean + ", isInChatting=" + atomicBoolean2 + ", enterFinderUiCnt=" + this.f100063o);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(this.f100067s, intentFilter);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderLiveDNSParseService", e17, "registerNetworkChangeReceiver: ", new java.lang.Object[0]);
        }
        mo48813x58998cd();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495.mo40973x40b15f2e(new b92.q1(this));
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(this.f100067s);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderLiveDNSParseService", e17, "unRegisterNetworkChangeReceiver: ", new java.lang.Object[0]);
        }
        mo48814x2efc64();
    }
}
