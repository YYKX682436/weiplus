package mn0;

/* loaded from: classes10.dex */
public abstract class y implements mn0.b0 {
    public final jz5.g A;
    public final jz5.g B;
    public int C;
    public int D;
    public final java.lang.StringBuilder E;
    public mn0.l0 F;
    public boolean G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f411337J;
    public final jz5.g K;
    public final jz5.g L;
    public final jz5.g M;
    public final jz5.g N;
    public r45.p72 P;
    public long Q;
    public long R;
    public com.p314xaae8f345.p2926x359365.C25484xcc963946 S;
    public boolean T;
    public boolean U;
    public final jz5.g V;
    public final jz5.g W;
    public final jz5.g X;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f411338d;

    /* renamed from: e, reason: collision with root package name */
    public final ls5.f f411339e;

    /* renamed from: f, reason: collision with root package name */
    public final ls5.d f411340f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f411341g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f411342h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f411343i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f411344m;

    /* renamed from: n, reason: collision with root package name */
    public long f411345n;

    /* renamed from: o, reason: collision with root package name */
    public int f411346o;

    /* renamed from: p, reason: collision with root package name */
    public final co0.y f411347p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f411348q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f411349r;

    /* renamed from: s, reason: collision with root package name */
    public int f411350s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ka4 f411351t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f411352u;

    /* renamed from: v, reason: collision with root package name */
    public int f411353v;

    /* renamed from: w, reason: collision with root package name */
    public int f411354w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f411355x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p828xce4391d5.p829xc5a27af6.C10834xb010c4ce f411356y;

    /* renamed from: z, reason: collision with root package name */
    public int f411357z;

    public y(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f411338d = context;
        ls5.f fVar = new ls5.f(this);
        this.f411339e = fVar;
        this.f411340f = new ls5.d(fVar.b());
        this.f411341g = new java.util.ArrayList();
        this.f411347p = new co0.y(new mn0.j(this));
        this.f411348q = "";
        this.f411349r = "";
        this.f411352u = jz5.h.b(new mn0.l(this));
        if (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p828xce4391d5.p829xc5a27af6.C10834xb010c4ce.f150097b == null) {
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p828xce4391d5.p829xc5a27af6.C10834xb010c4ce.f150097b = new com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p828xce4391d5.p829xc5a27af6.C10834xb010c4ce();
        }
        this.f411356y = com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p828xce4391d5.p829xc5a27af6.C10834xb010c4ce.f150097b;
        this.A = jz5.h.b(new mn0.g(this));
        this.B = jz5.h.b(new mn0.h(this));
        this.E = new java.lang.StringBuilder("");
        this.f411337J = jz5.h.b(mn0.w.f411335d);
        this.K = jz5.h.b(mn0.k.f411296d);
        this.L = jz5.h.b(mn0.u.f411333d);
        this.M = jz5.h.b(mn0.f.f411264d);
        this.N = jz5.h.b(new mn0.q(this));
        this.V = jz5.h.b(mn0.t.f411332d);
        this.W = jz5.h.b(mn0.v.f411334d);
        this.X = jz5.h.b(new mn0.x(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(mn0.y r4, yz5.l r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            boolean r0 = r6 instanceof mn0.d
            if (r0 == 0) goto L13
            r0 = r6
            mn0.d r0 = (mn0.d) r0
            int r1 = r0.f411241f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411241f = r1
            goto L18
        L13:
            mn0.d r0 = new mn0.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f411239d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f411241f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L48
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            mn0.i0 r4 = r4.n()
            kotlinx.coroutines.flow.f3 r4 = r4.F
            mn0.e r6 = new mn0.e
            r6.<init>(r5)
            r0.f411241f = r3
            kotlinx.coroutines.flow.l2 r4 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) r4
            java.lang.Object r4 = r4.a(r6, r0)
            if (r4 != r1) goto L48
            return r1
        L48:
            jz5.d r4 = new jz5.d
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mn0.y.c(mn0.y, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ void u(mn0.y yVar, java.lang.String str, int i17, r45.ka4 ka4Var, int i18, r45.p72 p72Var, boolean z17, boolean z18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: realStartPlay");
        }
        yVar.t(str, i17, ka4Var, i18, p72Var, (i19 & 32) != 0 ? false : z17, (i19 & 64) != 0 ? false : z18);
    }

    @Override // mn0.b0
    public void A(int i17, int i18) {
    }

    public void E() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", "resumeRender");
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 p17 = p();
        nn0.i iVar = p17 instanceof nn0.i ? (nn0.i) p17 : null;
        if (iVar != null) {
            iVar.c();
        }
    }

    public void F(com.p314xaae8f345.p2926x359365.C25484xcc963946 c25484xcc963946) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", "setConfig config:" + c25484xcc963946);
        this.S = c25484xcc963946;
        p().m94521x78bda44(c25484xcc963946);
    }

    public void G(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f411339e.b(), "BaseLiveTXPlayer setMute: " + z17);
        H(z17, mn0.c.f411235e);
    }

    public final void H(boolean z17, mn0.c cVar) {
        int i17 = z17 ? this.f411346o | cVar.f411238d : this.f411346o & (~cVar.f411238d);
        this.f411346o = i17;
        boolean z18 = i17 != 0;
        p().m94522x764d819b(z18);
        this.f411343i = z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", "setMuteInternal: mute=" + z17 + ", scene=" + cVar + ", muteMask=" + this.f411346o + ", shouldMute=" + z18 + ", isMute=" + this.f411343i);
    }

    @Override // mn0.b0
    public void I(java.lang.String jsonStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonStr, "jsonStr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", "callDecryExperimentalAPI jsonStr:".concat(r26.n0.q0(jsonStr, "encKey", jsonStr)));
        if (jsonStr.length() == 0) {
            return;
        }
        p().m94511xd33a8dd4(jsonStr);
        int hashCode = p().hashCode();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = kn0.c.f391034a;
        if (hashCode != 0) {
            if (!(jsonStr.length() == 0)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var2 = kn0.c.f391034a;
                kn0.b bVar = (kn0.b) r2Var2.get(java.lang.Integer.valueOf(hashCode));
                if (bVar == null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
                    kn0.b bVar2 = new kn0.b(hashCode, true, jsonStr, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCacheInfo", "setDecryptParams new, " + bVar2);
                    return;
                }
                bVar.f391030a = hashCode;
                bVar.f391031b = true;
                bVar.f391032c = jsonStr;
                bVar.f391033d = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCacheInfo", "setDecryptParams reuse, " + bVar);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveCacheInfo", "setDecryptParams error,key:" + hashCode + ",decrypString:" + jsonStr);
    }

    public void J(com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1) {
        n().G = interfaceC25479x1853e9c1;
        p().mo94523xbdb2cd8a(n());
    }

    public void K(mn0.d0 scene, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        mn0.i0 n17 = n();
        n17.getClass();
        n17.f411290w = scene;
        if (!n17.B) {
            n17.B = true;
            java.util.Map map = mn0.i0.f411273J;
            synchronized (map) {
                if (!map.containsKey(scene) || map.get(scene) == null) {
                    map.put(scene, 1);
                } else {
                    java.lang.Integer num = (java.lang.Integer) map.get(scene);
                    map.put(scene, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
            }
            mn0.i0.H.a();
        }
        this.I = i17;
    }

    public void N(mn0.l0 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.F = info;
        r45.nw1 nw1Var = info.f411308f;
        this.G = pm0.v.A(nw1Var != null ? nw1Var.m75942xfb822ef2(32) : 0L, 256L);
        mn0.i0 n17 = n();
        mn0.k0 playStep = l();
        n17.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playStep, "playStep");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n17.f411276f, "setPlayerInfoData info:" + info + ", playStep:" + playStep);
        n17.f411291x = info;
        n17.f411292y = playStep;
    }

    public void O(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, yz5.a aVar) {
        android.view.SurfaceView f150155g;
        android.view.TextureView mo46536x4ee17f0a;
        java.lang.String b17 = this.f411339e.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BaseLiveTXPlayer setPlayerView ");
        sb6.append(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null ? java.lang.Integer.valueOf(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.hashCode()) : null);
        sb6.append(", text:");
        sb6.append((scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null || (mo46536x4ee17f0a = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46536x4ee17f0a()) == null) ? null : java.lang.Integer.valueOf(mo46536x4ee17f0a.hashCode()));
        sb6.append(",surface:");
        sb6.append((scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null || (f150155g = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getF150155g()) == null) ? null : java.lang.Boolean.valueOf(f150155g.hasFocus()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b17, sb6.toString());
        if (p() instanceof nn0.i) {
            com.p314xaae8f345.p2926x359365.C25485x5a0a6891 p17 = p();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p17, "null cannot be cast to non-null type com.tencent.mm.live.core.core.postprocessor.customrender.CustomTXLivePlayer<*>");
            ((nn0.i) p17).d(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, aVar != null ? new mn0.p(aVar) : null);
        } else {
            p().mo94524x9951f728(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
        }
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            android.view.View f150155g2 = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getF150155g();
            if (f150155g2 == null) {
                f150155g2 = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46536x4ee17f0a();
            }
            ls5.d dVar = this.f411340f;
            if (f150155g2 != null) {
                android.app.Activity c17 = dVar.c(f150155g2);
                android.view.View rootView = f150155g2.getRootView();
                java.lang.Object layoutParams = rootView != null ? rootView.getLayoutParams() : null;
                android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
                boolean z17 = (layoutParams2 != null ? layoutParams2.type : 0) > 99;
                if (c17 != null) {
                    dVar.a(dVar.d(c17));
                } else if (z17) {
                    dVar.a("Window");
                } else {
                    f150155g2.getViewTreeObserver().addOnGlobalLayoutListener(new ls5.c(f150155g2, dVar));
                }
            } else {
                dVar.getClass();
            }
            scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.post(new mn0.r(this, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf));
        }
        this.f411342h = new java.lang.ref.WeakReference(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
    }

    public void P(boolean z17) {
        int i17 = z17 ? 2 : 1;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("api", com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15456x9d4eb401);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("mode", i17);
            jSONObject.put("params", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            mo148052xd33a8dd4(jSONObject3);
        } catch (org.json.JSONException unused) {
        }
    }

    public void Q(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f411339e.b(), "BaseLiveTXPlayer setRenderMode " + i17);
        p().mo94525x638e3a5b(i17);
    }

    public void R(java.lang.String url, int i17, r45.ka4 ka4Var, r45.p72 p72Var, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        t(url, i17, ka4Var, 1, p72Var, z17, z18);
        java.lang.String str = this.f411348q;
        if (str == null || str.length() == 0) {
            return;
        }
        this.f411344m = true;
    }

    public void S(r45.nw1 liveInfo, r45.p72 p72Var) {
        r45.ka4 ka4Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveInfo, "liveInfo");
        ko0.t tVar = ko0.t.f391436a;
        r45.ma4 ma4Var = (r45.ma4) liveInfo.m75936x14adae67(23);
        if (ma4Var == null || (gVar = ma4Var.f461833m) == null) {
            ka4Var = null;
        } else {
            r45.na4 na4Var = new r45.na4();
            na4Var.mo11468x92b714fd(gVar.g());
            ka4Var = na4Var.f462730f;
        }
        r45.ka4 ka4Var2 = ka4Var;
        java.lang.String m75945x2fec8307 = liveInfo.m75945x2fec8307(3);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        mn0.b0.D(this, m75945x2fec8307, 1, ka4Var2, p72Var, false, false, 48, null);
    }

    public void T(boolean z17, boolean z18, boolean z19) {
        boolean z27;
        mn0.i0 i0Var;
        int i17;
        java.lang.String str;
        pm0.v.X(new mn0.s(z18, this, z17, z19));
        mn0.i0 n17 = n();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n17.f411276f, "stopPlay needClearLastImg: " + z17 + " hadReceiveFirstFrame: " + n17.f411293z);
        zy2.n8 n8Var = (zy2.n8) i95.n0.c(zy2.n8.class);
        long hashCode = (long) n17.hashCode();
        long j17 = n17.f411288u;
        long j18 = n17.f411289v;
        java.lang.String sessionId = n17.f411286s;
        java.lang.String commentScene = n17.f411287t;
        boolean z28 = n17.f411293z;
        b92.m2 m2Var = (b92.m2) n8Var;
        m2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        if (j17 == 0) {
            i0Var = n17;
            z27 = true;
        } else {
            boolean z29 = m2Var.f100014d.remove(java.lang.Long.valueOf(hashCode)) != null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveQosReportService", "onStopPlay: hadReceiveFirstFrame=" + z28 + ", hasData=" + z29 + ", commentScene=" + commentScene + ", sessionId=" + sessionId + ", objectId=" + pm0.v.u(j17) + ", liveId=" + pm0.v.u(j18) + ", tickerHashCode=" + hashCode);
            if (z28 || !z29) {
                z27 = true;
            } else {
                java.lang.Long l17 = (java.lang.Long) m2Var.f100015e.get(java.lang.Long.valueOf(hashCode));
                if (l17 == null) {
                    l17 = 0L;
                }
                long longValue = l17.longValue();
                if (j17 == 0 || longValue <= 0) {
                    z27 = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveQosReportService", "reportPlayFail: error, startPlayTime=" + longValue + ", commentScene=" + commentScene + ", sessionId=" + sessionId + ", objectId=" + pm0.v.u(j17) + ", liveId=" + pm0.v.u(j18));
                } else {
                    long c17 = c01.id.c();
                    long j19 = c17 - longValue;
                    r45.he2 he2Var = new r45.he2();
                    he2Var.set(2, java.lang.Long.valueOf(longValue));
                    he2Var.set(3, java.lang.Long.valueOf(c17));
                    he2Var.set(0, java.lang.Long.valueOf(j17));
                    he2Var.set(1, java.lang.Long.valueOf(j18));
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    if (!r75.d.f474794h) {
                        i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(context);
                    } else if (r75.d.f474791e == -100) {
                        i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(context);
                        r75.d.f474791e = i17;
                    } else {
                        ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetWorkCache", "getIOSNetTypeFromCache, iosNetworkType = " + r75.d.f474791e);
                        i17 = r75.d.f474791e;
                    }
                    he2Var.set(6, java.lang.Integer.valueOf(i17));
                    he2Var.set(5, commentScene);
                    he2Var.set(4, sessionId);
                    int i18 = (int) j19;
                    he2Var.set(13, java.lang.Integer.valueOf(i18));
                    he2Var.set(14, java.lang.Integer.valueOf(i18));
                    z27 = true;
                    he2Var.set(15, 1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveQosReportService", "reportPlayFail: exitCost=" + j19 + ", commentScene=" + commentScene + ", sessionId=" + sessionId + ", network_type=" + he2Var.m75939xb282bd08(6) + ", objectId=" + pm0.v.u(j17) + ", liveId=" + pm0.v.u(j18));
                    pm0.v.X(new b92.f2(m2Var, he2Var, "reportPlayFail"));
                }
            }
            i0Var = n17;
        }
        mn0.m0 m0Var = i0Var.A;
        m0Var.f411318a = 0;
        m0Var.f411319b = 0;
        m0Var.f411320c = "";
        m0Var.f411321d = 0;
        if (i0Var.f411279i == 0) {
            i0Var.f411279i = android.os.SystemClock.elapsedRealtime();
        }
        if (z17) {
            i0Var.f411293z = false;
        }
        ((com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p825xc53e9ae1.C10831x96690f5a) ms5.f.f412691a.b(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p825xc53e9ae1.C10831x96690f5a.class)).d(this.f411339e);
        ls5.d dVar = this.f411340f;
        java.lang.String str2 = dVar.f402656c;
        if (!((str2 == null || str2.length() == 0) ? z27 : false) && dVar.f402657d > 0 && (str = dVar.f402656c) != null) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new ls5.b(6, str, dVar, null), 2, null);
        }
        ko0.t tVar = ko0.t.f391436a;
        java.lang.String d17 = tVar.d(this.f411349r);
        if (tVar.g(this.f411349r)) {
            if (ln0.p.f401204l == null) {
                ln0.p.f401204l = new ln0.p();
            }
            ln0.p pVar = ln0.p.f401204l;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pVar);
            pVar.b(d17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", "txLivePlayer stopPlay curPlayerUrl=" + this.f411348q + ", realPlayUrl=" + this.f411349r + ", streamId=" + d17);
    }

    public final boolean U() {
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 p17 = p();
        nn0.i iVar = p17 instanceof nn0.i ? (nn0.i) p17 : null;
        return (iVar != null && iVar.f420116a && iVar.f420117b != null) && ((java.lang.Number) this.W.mo141623x754a37bb()).intValue() > 0;
    }

    public void V(int i17, int i18, float f17, float f18) {
        int i19;
        int i27 = this.f411354w;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p828xce4391d5.p829xc5a27af6.C10834xb010c4ce c10834xb010c4ce = this.f411356y;
        if (i27 != i17) {
            long a17 = i17 != 0 ? c10834xb010c4ce.a() : 0L;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("api", "setAudioJitterBufferFactory");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("controllerFactory", a17);
            jSONObject.put("params", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            mo148052xd33a8dd4(jSONObject3);
            this.f411354w = i17;
        }
        jz5.g gVar = this.L;
        java.lang.Integer num = (java.lang.Integer) ((jz5.n) gVar).mo141623x754a37bb();
        qs5.p[] pVarArr = qs5.p.f447992d;
        if (num != null && num.intValue() == 1 && (i19 = this.f411353v) > 0 && i19 < 5000) {
            i18 = 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WaveJBM:", "BaseLiveTXPlayer updateAudioJitterBufferConfigs: waveJbmFlag:" + i17 + ", waveJbmMode:" + i18 + ", waveJbmMinSpeed:" + f17 + ", waveJbmMaxSpeed:" + f18 + ", waveJbmFactoryInstance:" + c10834xb010c4ce);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        jSONObject4.put("api", "SetJitterBufferConfigs");
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        jSONObject5.put("wavejbmMode", i18);
        jSONObject5.put("wavejbmMinSpeedRate", java.lang.Float.valueOf(f17));
        jSONObject5.put("wavejbmMaxSpeedRate", java.lang.Float.valueOf(f18));
        jSONObject5.put("wavejbmLowDelayMode", (java.lang.Integer) ((jz5.n) gVar).mo141623x754a37bb());
        jSONObject5.put("wavejbmInitialDelay", this.f411353v);
        jSONObject4.put("params", jSONObject5);
        java.lang.String jSONObject6 = jSONObject4.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject6, "toString(...)");
        c10834xb010c4ce.c(jSONObject6);
        this.f411355x = true;
    }

    public void a(mn0.c0 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.ArrayList arrayList = this.f411341g;
        arrayList.remove(listener);
        arrayList.add(listener);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f411339e.b(), "addStateChangeListener listener: " + listener);
    }

    public boolean b(boolean z17) {
        boolean m94515xc00617a4;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (z17 && ((java.lang.Number) this.V.mo141623x754a37bb()).intValue() > 0 && currentTimeMillis - this.f411345n < 500) {
            return this.f411344m;
        }
        if (U()) {
            int ordinal = this.f411347p.f125277b.ordinal();
            if (ordinal != 0) {
                m94515xc00617a4 = false;
                if (ordinal != 1 && ordinal != 2) {
                    throw new jz5.j();
                }
            } else {
                m94515xc00617a4 = p().m94515xc00617a4();
            }
        } else {
            m94515xc00617a4 = p().m94515xc00617a4();
        }
        this.f411344m = m94515xc00617a4;
        this.f411345n = currentTimeMillis;
        return m94515xc00617a4;
    }

    @Override // mn0.b0
    /* renamed from: callExperimentalAPI */
    public void mo148052xd33a8dd4(java.lang.String jsonStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonStr, "jsonStr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", "callExperimentalAPI jsonStr:".concat(jsonStr));
        if (jsonStr.length() == 0) {
            return;
        }
        p().m94511xd33a8dd4(jsonStr);
    }

    public final void d(mn0.d0 d0Var) {
        this.f411357z = 0;
        if (d0Var == mn0.d0.f411245h) {
            int i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_live_wave_veq_flag_android, -1) == 1 ? 1 : 0;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_live_wave_veq_level_android, -1);
            int i18 = 10 <= Ni && Ni < 31 ? Ni : 16;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", "AudioVolumeEqualizer, scene:" + d0Var + ", flag:" + i17 + ", level:" + i18);
            if (i17 == 1) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("api", "enableAudioVolumeEqualizer");
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("enable", i17);
                jSONObject2.put(ya.b.f77487x44fa364, i18);
                jSONObject.put("params", jSONObject2);
                java.lang.String jSONObject3 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                mo148052xd33a8dd4(jSONObject3);
                this.f411357z = (i18 * 10) + i17;
                return;
            }
            return;
        }
        int i19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_live_wave_veq_flag2_android, -1) == 1 ? 1 : 0;
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_live_wave_veq_level2_android, -1);
        int i27 = 10 <= Ni2 && Ni2 < 31 ? Ni2 : 16;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", "AudioVolumeEqualizer, scene:" + d0Var + ", flag:" + i19 + ", level:" + i27);
        if (i19 == 1) {
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("api", "enableAudioVolumeEqualizer");
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("enable", i19);
            jSONObject5.put(ya.b.f77487x44fa364, i27);
            jSONObject4.put("params", jSONObject5);
            java.lang.String jSONObject6 = jSONObject4.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject6, "toString(...)");
            mo148052xd33a8dd4(jSONObject6);
            this.f411357z = (i27 * 10) + i19;
        }
    }

    public abstract com.p314xaae8f345.p2926x359365.C25485x5a0a6891 e(android.content.Context context);

    public boolean f(boolean z17) {
        return p().m94513x8ee3e659(z17);
    }

    /* renamed from: finalize */
    public final void m148075xd764dc1e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f411339e.b(), "finalize invoke");
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 p17 = p();
        nn0.x xVar = p17 instanceof nn0.x ? (nn0.x) p17 : null;
        if (xVar != null) {
            ((com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p825xc53e9ae1.C10830xb2ffc6ed) ms5.f.f412691a.b(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p825xc53e9ae1.C10830xb2ffc6ed.class)).d(xVar.f420166e);
            ((nn0.p) xVar.f420117b).mo149804x41012807();
        }
    }

    public final void g() {
        boolean z17 = true;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_live_http_header_content_params_android, "X-Tlive-Hot-Stream", true);
        if (Zi != null && Zi.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", "no http header set!");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
        java.util.List f07 = r26.n0.f0(Zi, new java.lang.String[]{","}, false, 0, 6, null);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = f07.iterator();
        while (it.hasNext()) {
            jSONArray.put((java.lang.String) it.next());
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("api", "enableReportStreamRspInfo");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("ids", jSONArray);
        jSONObject.put("params", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        p().m94511xd33a8dd4(jSONObject3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", "http header set:%s", jSONObject3);
    }

    @Override // ls5.m
    /* renamed from: getEventDetectorAdapter */
    public ls5.k mo58776x51603325() {
        return this.f411340f;
    }

    public void h(java.lang.String commentScene, java.lang.String sessionId, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        try {
            boolean z17 = true;
            if (commentScene.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", "endExternalDataReport but commentScene is empty!");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CommentScene=" + commentScene + ';');
            if (sessionId.length() <= 0) {
                z17 = false;
            }
            if (z17) {
                sb6.append("EnterSessionID=" + sessionId + ';');
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("LiveType=");
            sb7.append(j());
            sb7.append(";PlayerScene=");
            sb7.append(this.I);
            sb7.append(";IsSmallScale=");
            r45.p72 p72Var = this.P;
            sb7.append(p72Var != null ? p72Var.m75939xb282bd08(5) : 0);
            sb7.append(';');
            sb6.append(sb7.toString());
            sb6.append("FirstFrameMS=" + j17 + ';');
            this.E.append(sb6.toString());
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("api", "reportExternalBusinessData");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("endReportData", sb6.toString());
            jSONObject.put("params", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            mo148052xd33a8dd4(jSONObject3);
        } catch (org.json.JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0187 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap i(android.graphics.Bitmap.Config r23, boolean r24, double r25) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn0.y.i(android.graphics.Bitmap$Config, boolean, double):android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        if (r5.G != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() {
        /*
            r5 = this;
            int r0 = r5.H
            r1 = 3
            r2 = 1
            if (r0 != r2) goto L7
            goto L51
        L7:
            mn0.l0 r0 = r5.F
            r3 = 72
            r4 = 0
            if (r0 == 0) goto L1f
            r45.nw1 r0 = r0.f411308f
            if (r0 == 0) goto L1f
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r3)
            r45.q12 r0 = (r45.q12) r0
            if (r0 == 0) goto L1f
            int r0 = r0.m75939xb282bd08(r4)
            goto L20
        L1f:
            r0 = r4
        L20:
            if (r0 == r2) goto L2d
            r2 = 2
            if (r0 == r2) goto L2b
            if (r0 == r1) goto L29
        L27:
            r1 = r4
            goto L51
        L29:
            r1 = 5
            goto L51
        L2b:
            r1 = r2
            goto L51
        L2d:
            mn0.l0 r0 = r5.F
            if (r0 == 0) goto L47
            r45.nw1 r0 = r0.f411308f
            if (r0 == 0) goto L47
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r3)
            r45.q12 r0 = (r45.q12) r0
            if (r0 == 0) goto L47
            int r0 = r0.m75939xb282bd08(r2)
            r1 = 8
            if (r0 != r1) goto L47
            r0 = r2
            goto L48
        L47:
            r0 = r4
        L48:
            if (r0 == 0) goto L4c
            r0 = 4
            return r0
        L4c:
            boolean r0 = r5.G
            if (r0 == 0) goto L27
            goto L2b
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mn0.y.j():int");
    }

    public final int k() {
        return ((java.lang.Number) this.B.mo141623x754a37bb()).intValue();
    }

    public final mn0.k0 l() {
        return (mn0.k0) this.K.mo141623x754a37bb();
    }

    public long m() {
        long j17;
        long j18 = this.R;
        if (j18 == 0) {
            j18 = c01.id.c();
            j17 = this.Q;
        } else {
            j17 = this.Q;
        }
        return j18 - j17;
    }

    public final mn0.i0 n() {
        return (mn0.i0) this.f411352u.mo141623x754a37bb();
    }

    public com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf o() {
        java.lang.ref.WeakReference weakReference = this.f411342h;
        if (weakReference != null) {
            return (com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) weakReference.get();
        }
        return null;
    }

    public com.p314xaae8f345.p2926x359365.C25485x5a0a6891 p() {
        return (com.p314xaae8f345.p2926x359365.C25485x5a0a6891) this.X.mo141623x754a37bb();
    }

    public final void q() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_live_audio_jbm_param_part1_android, -1);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_live_audio_jbm_param_part2_android, -1);
        int i17 = (Ni <= -1 || Ni2 <= -1) ? 0 : (Ni / 10000000) % 10;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WaveJBM:", "BaseLiveTXPlayer init wavejbm configs: Xparams:" + Ni + ',' + Ni2 + ",initWaveJbmFlag:" + i17 + ",initWavejbmMode:1,initWavejbmMinSpeed:0.5,initWavejbmMaxSpeed:1.5");
        V(i17, 1, 0.5f, 1.5f);
    }

    public void r(java.lang.String commentScene, java.lang.String sessionId, int i17, int i18) {
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        try {
            this.G = pm0.v.z(i17, 2);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("api", "reportExternalBusinessData");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CommentScene=" + commentScene + ";EnterSessionID=" + sessionId + ';');
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("LiveType=");
            sb7.append(j());
            sb7.append(";PlayerScene=");
            sb7.append(this.I);
            sb7.append(";IsSmallScale=");
            r45.p72 p72Var = this.P;
            sb7.append(p72Var != null ? p72Var.m75939xb282bd08(5) : 0);
            sb7.append(';');
            sb6.append(sb7.toString());
            if (i17 != 0) {
                sb6.append("AnchorStatus=" + i17 + ';');
            }
            if (i18 > 0) {
                sb6.append("DelayMs=" + i18 + ';');
            }
            mn0.b bVar = (mn0.b) ((jz5.n) this.f411337J).mo141623x754a37bb();
            if (bVar.f411233a <= 0) {
                j17 = 0;
            } else {
                j17 = bVar.f411234b;
                if (j17 <= 0) {
                    j17 = android.os.SystemClock.elapsedRealtime() - bVar.f411233a;
                    bVar.f411234b = j17;
                }
            }
            if (j17 > 0) {
                sb6.append("SwitchFrameMs=" + j17 + ';');
            }
            jSONObject2.put("intervalReportData", sb6.toString());
            jSONObject.put("params", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            mo148052xd33a8dd4(jSONObject3);
        } catch (org.json.JSONException unused) {
        }
    }

    public void s(boolean z17) {
        ls5.f fVar = this.f411339e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.b(), "BaseLiveTXPlayer pause: isInitiative=" + z17 + ", curPlayerUrl=" + this.f411348q);
        if (U()) {
            co0.y yVar = this.f411347p;
            if (yVar.f125277b != co0.u.f125270d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("VisitorPauseStateManager", "onPause: ignore, current state=" + yVar.f125277b);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorPauseStateManager", "onPause");
                yVar.f125277b = co0.u.f125271e;
                co0.v vVar = yVar.f125276a;
                if (vVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", "onExecuteTempPause");
                    mn0.c cVar = mn0.c.f411236f;
                    mn0.y yVar2 = ((mn0.j) vVar).f411294a;
                    yVar2.H(true, cVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", "pauseRender");
                    com.p314xaae8f345.p2926x359365.C25485x5a0a6891 p17 = yVar2.p();
                    nn0.i iVar = p17 instanceof nn0.i ? (nn0.i) p17 : null;
                    if (iVar != null) {
                        iVar.b();
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorPauseStateManager", "startPauseTimeoutTimer: timeout=3000ms");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = yVar.f125278c;
                if (b4Var != null) {
                    b4Var.d();
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("VisitorPauseTimeout", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new co0.x(yVar), false);
                yVar.f125278c = b4Var2;
                b4Var2.c(3000L, 3000L);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.b(), "BaseLiveTXPlayer pause not support temp pause, use default logic");
            mn0.b0.C(this, false, false, false, 6, null);
        }
        this.f411344m = false;
        pm0.v.X(new mn0.i(this));
        if (z17) {
            fn0.g gVar = fn0.g.f345728a;
            if (fn0.g.f345729b != null) {
                dk2.ef.f314905a.c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:419:0x0124, code lost:
    
        if (r15 == xn0.e.f536947h) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0199, code lost:
    
        if (r8 == null) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0b0f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0108 A[Catch: Exception -> 0x0128, TryCatch #2 {Exception -> 0x0128, blocks: (B:55:0x00ed, B:61:0x0108, B:416:0x011e, B:418:0x0122), top: B:54:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(java.lang.String r92, int r93, r45.ka4 r94, int r95, r45.p72 r96, boolean r97, boolean r98) {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn0.y.t(java.lang.String, int, r45.ka4, int, r45.p72, boolean, boolean):void");
    }

    @Override // mn0.b0
    public void v(android.view.Surface surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }

    public void w() {
        if (U()) {
            co0.y yVar = this.f411347p;
            yVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorPauseStateManager", "reset");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorPauseStateManager", "stopPauseTimeoutTimer");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = yVar.f125278c;
            if (b4Var != null) {
                b4Var.d();
            }
            yVar.f125278c = null;
            yVar.f125277b = co0.u.f125270d;
        }
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 p17 = p();
        nn0.x xVar = p17 instanceof nn0.x ? (nn0.x) p17 : null;
        if (xVar != null) {
            ((com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p825xc53e9ae1.C10830xb2ffc6ed) ms5.f.f412691a.b(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p825xc53e9ae1.C10830xb2ffc6ed.class)).d(xVar.f420166e);
            ((nn0.p) xVar.f420117b).mo149804x41012807();
        }
    }

    public void x(mn0.c0 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f411341g.remove(listener);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f411339e.b(), "removeStateChangeListener listener: " + listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn0.y.y():void");
    }

    @Override // mn0.b0
    public void z(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf glRootView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(glRootView, "glRootView");
    }
}
