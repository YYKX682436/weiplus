package mn0;

/* loaded from: classes10.dex */
public final class i0 implements com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 {
    public static long I;
    public static p3325xe03a0797.p3326xc267989b.r2 L;
    public final mn0.m0 A;
    public boolean B;
    public java.lang.String C;
    public int D;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 E;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 F;
    public com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 G;

    /* renamed from: d, reason: collision with root package name */
    public final mn0.b0 f411274d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f411275e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f411276f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6512x127c24de f411277g;

    /* renamed from: h, reason: collision with root package name */
    public long f411278h;

    /* renamed from: i, reason: collision with root package name */
    public long f411279i;

    /* renamed from: m, reason: collision with root package name */
    public long f411280m;

    /* renamed from: n, reason: collision with root package name */
    public long f411281n;

    /* renamed from: o, reason: collision with root package name */
    public long f411282o;

    /* renamed from: p, reason: collision with root package name */
    public long f411283p;

    /* renamed from: q, reason: collision with root package name */
    public long f411284q;

    /* renamed from: r, reason: collision with root package name */
    public int f411285r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f411286s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f411287t;

    /* renamed from: u, reason: collision with root package name */
    public long f411288u;

    /* renamed from: v, reason: collision with root package name */
    public long f411289v;

    /* renamed from: w, reason: collision with root package name */
    public mn0.d0 f411290w;

    /* renamed from: x, reason: collision with root package name */
    public mn0.l0 f411291x;

    /* renamed from: y, reason: collision with root package name */
    public mn0.k0 f411292y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f411293z;
    public static final mn0.g0 H = new mn0.g0(null);

    /* renamed from: J, reason: collision with root package name */
    public static final java.util.Map f411273J = java.util.Collections.synchronizedMap(new java.util.HashMap());
    public static final java.util.Map K = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public i0(mn0.b0 player, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        this.f411274d = player;
        this.f411275e = z17;
        this.f411276f = "LiveTXPlayerTicker_" + hashCode();
        this.f411277g = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6512x127c24de();
        this.f411285r = 1;
        this.f411286s = "";
        this.f411287t = "";
        this.f411290w = mn0.d0.f411242e;
        this.A = new mn0.m0(0, 0, "", 0);
        this.C = "";
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(0);
        this.E = a17;
        this.F = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.b(a17);
    }

    public final void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f411276f, "recordFirstFrame: source=" + str + ", firstIFrameStamp=" + this.f411282o);
        if (this.f411282o == 0) {
            this.f411282o = android.os.SystemClock.elapsedRealtime();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "Local")) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("api", "externalNotifyCustomRenderFirstFrameEvent");
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                this.f411274d.mo148052xd33a8dd4(jSONObject2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x004a, code lost:
    
        if (r2 > r11) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn0.i0.b():void");
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
        int i17;
        java.lang.String str;
        java.lang.String str2;
        b92.m2 m2Var;
        long j17;
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1 = this.G;
        if (interfaceC25479x1853e9c1 != null) {
            interfaceC25479x1853e9c1.mo15382x3bee38d0(bundle);
        }
        if (bundle != null) {
            bundle.putLong("NET_STATUS_START_TIME", this.f411280m);
        }
        zy2.n8 n8Var = (zy2.n8) i95.n0.c(zy2.n8.class);
        long hashCode = hashCode();
        long j18 = this.f411288u;
        long j19 = this.f411289v;
        java.lang.String sessionId = this.f411286s;
        java.lang.String commentScene = this.f411287t;
        java.lang.String tagName = this.C;
        int i18 = this.D;
        b92.m2 m2Var2 = (b92.m2) n8Var;
        m2Var2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        if (j18 == 0 || bundle == null) {
            return;
        }
        if (!m2Var2.f100014d.containsKey(java.lang.Long.valueOf(hashCode))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveQosReportService", "onNetStatus: this live is not playing, commentScene=" + commentScene + ", sessionId=" + sessionId + ", objectId=" + pm0.v.u(j18) + ", liveId=" + pm0.v.u(j19) + ", tickerHashCode=" + hashCode);
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m2Var2.f100014d.get(java.lang.Long.valueOf(hashCode)), java.lang.Boolean.TRUE)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveQosReportService", "onNetStatus: this live has not render first frame, commentScene=" + commentScene + ", sessionId=" + sessionId + ", objectId=" + pm0.v.u(j18) + ", liveId=" + pm0.v.u(j19) + ", tickerHashCode=" + hashCode);
            return;
        }
        int i19 = bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46330x1cbced5a);
        int i27 = bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46334x273a7a5);
        int i28 = bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46335x92586c22);
        int i29 = bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46333xf6c71e4a);
        int i37 = bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46326xef5b01ae);
        int i38 = bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46322x5607fd5a);
        ae2.in inVar = ae2.in.f85221a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.K).mo141623x754a37bb()).r()).intValue();
        boolean z17 = intValue > 0 && ((j19 != 0 && m2Var2.f100022o.contains(java.lang.Long.valueOf(j19))) || r26.n0.B(sessionId, "FinderTab_", false));
        int i39 = bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46327xe105b3b3);
        if (ln0.p.f401204l == null) {
            ln0.p.f401204l = new ln0.p();
        }
        ln0.p pVar = ln0.p.f401204l;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pVar);
        java.lang.Long valueOf = java.lang.Long.valueOf(j19);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i39);
        if (pVar.f401208d.get() || valueOf == null || valueOf2 == null) {
            i17 = i18;
            str = tagName;
            str2 = commentScene;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            java.lang.String m21224xed96f0e5 = com.p307xc6797c64.qvb.C2852x293225.m21224xed96f0e5(pVar.f401207c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m21224xed96f0e5, "proxyOf(...)");
            h0Var.f391656d = m21224xed96f0e5;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m21224xed96f0e5, pVar.f401207c)) {
                java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f391656d;
                if (!(charSequence == null || charSequence.length() == 0)) {
                    java.util.Map p2pParamsMap = pVar.f401205a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p2pParamsMap, "p2pParamsMap");
                    synchronized (p2pParamsMap) {
                        java.util.Map p2pParamsMap2 = pVar.f401205a;
                        i17 = i18;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p2pParamsMap2, "p2pParamsMap");
                        java.util.Iterator it = p2pParamsMap2.entrySet().iterator();
                        while (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            java.util.Iterator it6 = it;
                            java.lang.String str5 = (java.lang.String) entry.getKey();
                            ln0.q qVar = (ln0.q) entry.getValue();
                            java.lang.String str6 = tagName;
                            java.lang.String str7 = commentScene;
                            if (qVar.L == valueOf.longValue() && qVar.f401231o != 0 && qVar.f401217a != 0) {
                                ((ku5.t0) ku5.t0.f394148d).h(new ln0.o(pVar, h0Var, "buffer?xresid=" + str5 + "&bufms=" + valueOf2), pVar.f401211g);
                            }
                            tagName = str6;
                            it = it6;
                            commentScene = str7;
                        }
                        str = tagName;
                        str2 = commentScene;
                    }
                }
            }
            i17 = i18;
            str = tagName;
            str2 = commentScene;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper video cache proxy " + ((java.lang.String) h0Var.f391656d));
        }
        if (z17) {
            m2Var = m2Var2;
            str3 = str2;
            str4 = sessionId;
            j17 = j19;
            pm0.v.O("FinderLiveQosReportService", new b92.k2(m2Var2, intValue, j19, bundle, i19, i38, str, i17));
        } else {
            m2Var = m2Var2;
            j17 = j19;
            str3 = str2;
            str4 = sessionId;
        }
        pm0.v.X(new b92.l2(m2Var, hashCode, i19, i27, i28, i29, i37, i38, str3, str4, z17, intValue, j18, j17));
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        java.lang.String str = this.f411276f;
        if (i17 == 2003) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "PLAY_EVT_RCV_FIRST_I_FRAME " + this.G);
            mn0.k0 k0Var = this.f411292y;
            if (k0Var != null) {
                k0Var.f411301e = true;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                k0Var.f411299c = elapsedRealtime;
                k0Var.a("FirstFrame", elapsedRealtime);
                long j17 = k0Var.f411298b;
                if (j17 > 0) {
                    k0Var.f411300d = k0Var.f411299c - j17;
                    k0Var.f411298b = 0L;
                }
            }
        }
        mn0.b0 b0Var = this.f411274d;
        mn0.m0 m0Var = this.A;
        if (i17 == -2307) {
            m0Var.f411318a = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46347x98b201af;
            m0Var.f411319b = 0;
            java.lang.String str2 = ((mn0.y) b0Var).f411348q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
            m0Var.f411320c = str2;
        } else if (i17 == -2304) {
            m0Var.f411318a = -2304;
            m0Var.f411319b = 0;
            java.lang.String str3 = ((mn0.y) b0Var).f411348q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
            m0Var.f411320c = str3;
        } else if (i17 == -2301) {
            m0Var.f411318a = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46346xb4fc09c3;
            m0Var.f411319b = bundle != null ? bundle.getInt("disconnected_code") : 0;
            java.lang.String str4 = ((mn0.y) b0Var).f411348q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str4, "<set-?>");
            m0Var.f411320c = str4;
        } else if (i17 != 2001) {
            boolean z17 = this.f411275e;
            if (i17 == 2033) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onPlayEvent: PLAY_EVT_RENDER_FIRST_FRAME_ON_VIEW, useCustomRender=" + z17 + ", firstFrameRenderTimeStamp=" + this.f411283p);
                if (this.f411283p == 0) {
                    this.f411283p = android.os.SystemClock.elapsedRealtime();
                    b();
                }
                mn0.k0 k0Var2 = this.f411292y;
                if (k0Var2 != null) {
                    k0Var2.a("FirstRender", android.os.SystemClock.elapsedRealtime());
                }
            } else if (i17 == 2103) {
                m0Var.f411318a = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46375x82913de9;
                m0Var.f411319b = bundle != null ? bundle.getInt("disconnected_code") : 0;
                java.lang.String str5 = ((mn0.y) b0Var).f411348q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "<set-?>");
                m0Var.f411320c = str5;
            } else if (i17 == 999999) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onPlayEvent: PLAY_EVT_LOCAL_AFTER_RENDER_FIRST_FRAME, useCustomRender=" + z17);
                if (z17) {
                    a("Local");
                }
            } else if (i17 == 2003) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onPlayEvent: PLAY_EVT_RCV_FIRST_I_FRAME, useCustomRender" + z17);
                if (!z17) {
                    a("sdk");
                    b();
                }
                this.f411293z = true;
            } else if (i17 == 2004) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onPlayEvent: PLAY_EVT_PLAY_BEGIN");
                mn0.k0 k0Var3 = this.f411292y;
                if (k0Var3 != null) {
                    k0Var3.a("playBegin", android.os.SystemClock.elapsedRealtime());
                }
                this.f411284q = android.os.SystemClock.elapsedRealtime();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onPlayEvent: PLAY_EVT_CONNECT_SUCC");
            mn0.k0 k0Var4 = this.f411292y;
            if (k0Var4 != null) {
                k0Var4.a("connectSuc", android.os.SystemClock.elapsedRealtime());
            }
            this.f411281n = android.os.SystemClock.elapsedRealtime();
        }
        if (i17 != 999999) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.E).k(java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1 = this.G;
            if (interfaceC25479x1853e9c1 != null) {
                interfaceC25479x1853e9c1.mo15376x8cd414a7(i17, bundle);
            }
        }
        if (i17 != 2012) {
            ko0.t tVar = ko0.t.f391436a;
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onPlayEvent:" + i17 + ' ');
        }
    }
}
