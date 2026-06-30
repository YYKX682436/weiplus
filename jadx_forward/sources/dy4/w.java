package dy4;

/* loaded from: classes8.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public dy4.d f326249b;

    /* renamed from: c, reason: collision with root package name */
    public dy4.f1 f326250c;

    /* renamed from: d, reason: collision with root package name */
    public double f326251d;

    /* renamed from: e, reason: collision with root package name */
    public int f326252e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f326253f;

    /* renamed from: g, reason: collision with root package name */
    public int f326254g;

    /* renamed from: h, reason: collision with root package name */
    public org.json.JSONObject f326255h;

    /* renamed from: j, reason: collision with root package name */
    public int f326257j;

    /* renamed from: l, reason: collision with root package name */
    public z41.c f326259l;

    /* renamed from: m, reason: collision with root package name */
    public android.database.ContentObserver f326260m;

    /* renamed from: n, reason: collision with root package name */
    public android.content.BroadcastReceiver f326261n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k0 f326262o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0 f326263p;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f326248a = "MicroMsg.WebViewVideoEventHandler:" + hashCode();

    /* renamed from: i, reason: collision with root package name */
    public final cy4.f f326256i = new dy4.o(this);

    /* renamed from: k, reason: collision with root package name */
    public int f326258k = -1;

    public final void a(java.lang.String event, org.json.JSONObject jSONObject) {
        dy4.d dVar = this.f326249b;
        if (dVar != null) {
            jSONObject.put("__timestamp", java.lang.System.currentTimeMillis());
            nw4.y2 y2Var = dVar.f326147b;
            android.os.Bundle bundle = y2Var.f422548e;
            java.lang.String str = (bundle == null || !bundle.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d)) ? null : (java.lang.String) y2Var.f422548e.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            nw4.k kVar = dVar.f326146a;
            if (K0) {
                nw4.g gVar = kVar.f422396d;
                if (gVar instanceof nw4.n) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                    ((nw4.n) gVar).p(event, jSONObject);
                    return;
                }
                return;
            }
            nw4.g gVar2 = kVar.f422396d;
            if (gVar2 instanceof nw4.n) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.y1 y17 = ((nw4.n) gVar2).y();
                if (y17 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    y17.c().e(str, event, jSONObject2);
                }
            }
        }
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.p.f172433a;
        dy4.f1 f1Var = this.f326250c;
        java.lang.String a17 = pVar.a(f1Var != null ? f1Var.D : null);
        dy4.f1 f1Var2 = this.f326250c;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f1Var2 != null ? f1Var2.D : null, null)) {
            this.f326254g = 0;
        }
        long b17 = pVar.b(a17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("clientMediaId", a17);
        dy4.f1 f1Var3 = this.f326250c;
        jSONObject.put("isOpenVideoPreload", f1Var3 != null ? ((java.lang.Boolean) ((jz5.n) f1Var3.f326158l1).mo141623x754a37bb()).booleanValue() : false);
        jSONObject.put("previousCompletedSize", b17);
        jSONObject.put("playCount", this.f326254g);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f326248a, "generateWaitingReadyExtInfo:".concat(jSONObject2));
        return jSONObject2;
    }

    public final org.json.JSONObject c() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = this.f326255h;
        if (jSONObject2 != null) {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject2);
        }
        return jSONObject;
    }

    public final void d(java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.String str2 = this.f326248a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onPlayerProcessStateChanged event=" + str);
        if (jSONObject == null) {
            try {
                jSONObject = c();
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "onPlayerProcessStateChanged " + str + " fail", e17);
                return;
            }
        }
        jSONObject.put("event", str);
        a("onPlayerProcessStateChanged", jSONObject);
    }

    public final void e(boolean z17) {
        try {
            a("onVideoPause", c());
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f326248a, "OnXWebVideoPause fail", e17);
        }
        i();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new dy4.v(this));
    }

    public final void f(boolean z17) {
        java.lang.String str = this.f326248a;
        try {
            this.f326252e = 0;
            a("onVideoPlay", c());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "start video update timer");
            if (this.f326253f == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "start video update timer, create new timer");
                this.f326253f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("VideoUpdateTimer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new dy4.u(this), true);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f326253f;
            if (b4Var != null) {
                b4Var.c(0L, 250L);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new dy4.t(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onPlayingReport");
            try {
                d("Playing", null);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onPlayingReport fail", e17);
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "OnXWebVideoPlay fail", e18);
        }
    }

    public final void g() {
        try {
            a("onVideoWaiting", c());
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f326248a, "OnXWebVideoWaiting fail", e17);
        }
    }

    public final void h(sf.f fVar) {
        if (fVar instanceof dy4.d) {
            dy4.d dVar = (dy4.d) fVar;
            this.f326249b = dVar;
            java.lang.Object obj = dVar.f326146a.f422393a;
            dy4.b bVar = obj instanceof dy4.b ? (dy4.b) obj : null;
            if (bVar != null) {
                bVar.q3(this.f326256i);
            }
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (this.f326259l == null) {
                this.f326259l = new z41.c(context, new dy4.s(this));
            }
            android.database.ContentObserver contentObserver = this.f326260m;
            java.lang.String str = this.f326248a;
            if (contentObserver == null) {
                this.f326260m = new dy4.n(new android.os.Handler(), new java.lang.ref.WeakReference(this));
                android.content.ContentResolver contentResolver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext().getContentResolver();
                android.net.Uri uriFor = android.provider.Settings.System.getUriFor("screen_brightness");
                try {
                    android.database.ContentObserver contentObserver2 = this.f326260m;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(contentObserver2);
                    contentResolver.registerContentObserver(uriFor, false, contentObserver2);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, "initBrightnessObserver", new java.lang.Object[0]);
                }
            }
            if (this.f326261n == null) {
                final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
                this.f326261n = new android.content.BroadcastReceiver(weakReference) { // from class: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler$VolumeBroadcastReceiver

                    /* renamed from: a, reason: collision with root package name */
                    public final java.lang.ref.WeakReference f268507a;

                    /* renamed from: b, reason: collision with root package name */
                    public final java.lang.String f268508b;

                    {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakReference, "weakEventHandler");
                        this.f268507a = weakReference;
                        this.f268508b = "MicroMsg.VolumeBroadcastReceiver";
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(android.content.Context context2, android.content.Intent intent) {
                        if (context2 == null || intent == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android.media.VOLUME_CHANGED_ACTION", intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3) {
                            return;
                        }
                        try {
                            dy4.w wVar = (dy4.w) this.f268507a.get();
                            if (wVar == null) {
                                return;
                            }
                            wVar.a("onVolumeChange", wVar.c());
                        } catch (org.json.JSONException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f268508b, "onVolumeChange fail " + e17.getMessage());
                        }
                    }
                };
                try {
                    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                    intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(this.f326261n, intentFilter);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th7, "initBrightnessObserver", new java.lang.Object[0]);
                }
            }
            z41.c cVar = this.f326259l;
            if (cVar != null) {
                cVar.enable();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k0 k0Var = this.f326262o;
            if (k0Var != null) {
                ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
                java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268518b;
                synchronized (arrayList) {
                    arrayList.remove(k0Var);
                }
            }
            this.f326262o = new dy4.p(this);
            ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b bVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268517a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k0 k0Var2 = this.f326262o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var2);
            java.util.ArrayList arrayList2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268518b;
            synchronized (arrayList2) {
                arrayList2.size();
                arrayList2.add(k0Var2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0 l0Var = this.f326263p;
            if (l0Var != null) {
                ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
                java.util.ArrayList arrayList3 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268519c;
                synchronized (arrayList3) {
                    arrayList3.remove(l0Var);
                }
            }
            this.f326263p = new dy4.q(this);
            ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0 l0Var2 = this.f326263p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l0Var2);
            bVar2.a(l0Var2);
        }
    }

    public final void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f326248a, "stop video update timer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f326253f;
        if (b4Var != null) {
            b4Var.d();
        }
    }
}
