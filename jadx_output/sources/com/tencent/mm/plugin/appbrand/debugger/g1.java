package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class g1 implements com.tencent.mm.plugin.appbrand.jsruntime.t, com.tencent.mm.plugin.appbrand.profile.b {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.debugger.a1 f77750d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77751e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f77752f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.debugger.x1 f77753g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.luggage.sdk.jsapi.component.service.y f77755i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.debugger.l2 f77756m;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.debugger.n1 f77754h = new com.tencent.mm.plugin.appbrand.debugger.n1();

    /* renamed from: n, reason: collision with root package name */
    public boolean f77757n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f77758o = false;

    /* renamed from: p, reason: collision with root package name */
    public final uh1.o0 f77759p = new com.tencent.mm.plugin.appbrand.debugger.e1(this);

    public g1() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.debugger.RemoteDebugJsEngine$4
            {
                this.__eventId = -1286330970;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent appBrandNetWorkReqHeaderReceivedEvent) {
                am.u uVar;
                com.tencent.mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent appBrandNetWorkReqHeaderReceivedEvent2 = appBrandNetWorkReqHeaderReceivedEvent;
                if (appBrandNetWorkReqHeaderReceivedEvent2 != null && (uVar = appBrandNetWorkReqHeaderReceivedEvent2.f53981g) != null && uVar.f8047c != null) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = com.tencent.mm.plugin.appbrand.debugger.g1.this;
                    if (g1Var.f77750d.f77605g.f77634g == 1) {
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("api_name", uVar.f8045a);
                            jSONObject.put("task_id", uVar.f8046b);
                            jSONObject.put("request_headers", uVar.f8047c.toString());
                            jSONObject.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, currentTimeMillis);
                            com.tencent.mm.plugin.appbrand.debugger.n1 n1Var = g1Var.f77754h;
                            if (n1Var != null) {
                                n1Var.f77806b.f77599a.getJsRuntime().evaluateJavascript("typeof DebuggerConnection.onReceiveNetworkHeader === 'function' && DebuggerConnection.onReceiveNetworkHeader('" + com.tencent.mm.plugin.appbrand.utils.w2.a(jSONObject.toString()) + "')", null);
                            }
                        } catch (java.lang.Exception e17) {
                            com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.RemoteDebugJsEngine", "", e17);
                        }
                    } else {
                        r45.t47 t47Var = new r45.t47();
                        t47Var.f386141d = uVar.f8045a;
                        t47Var.f386142e = uVar.f8046b;
                        t47Var.f386143f = uVar.f8047c.toString();
                        t47Var.f386144g = currentTimeMillis;
                        g1Var.a0(t47Var, "networkDebugAPI");
                    }
                }
                return true;
            }
        }.alive();
    }

    public static void t(com.tencent.mm.plugin.appbrand.debugger.g1 g1Var) {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = g1Var.f77755i.x();
        r45.a57 a57Var = new r45.a57();
        r45.m47 m47Var = new r45.m47();
        a57Var.f369743e = m47Var;
        com.tencent.mm.plugin.appbrand.debugger.v0 v0Var = (com.tencent.mm.plugin.appbrand.debugger.v0) g1Var.f77755i.z1(com.tencent.mm.plugin.appbrand.debugger.v0.class);
        if (v0Var != null) {
            a57Var.f369744f = v0Var.L();
        }
        a57Var.f369746h = g1Var.f77755i.t3().E0().f305852r.f75372md5;
        a57Var.f369747i = 1;
        java.lang.String M = g1Var.f77755i.x().M("WAServiceMainContext.js");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(M)) {
            a57Var.f369745g = kk.k.g(M.getBytes());
        }
        m47Var.f380149h = x17.i();
        m47Var.f380146e = wo.q.f447782c;
        m47Var.f380145d = wo.q.f447783d;
        m47Var.f380148g = com.tencent.mm.sdk.platformtools.a0.a(g1Var.f77752f, com.tencent.mm.sdk.platformtools.z.f193112h);
        m47Var.f380147f = wo.q.f447785f;
        m47Var.f380151m = g1Var.f77752f.getResources().getDisplayMetrics().density;
        m47Var.f380150i = g1Var.f77752f.getResources().getDisplayMetrics().widthPixels / m47Var.f380151m;
        if (g1Var.f77755i.W0(com.tencent.luggage.sdk.jsapi.component.b.class) != null && ((com.tencent.luggage.sdk.jsapi.component.b) g1Var.f77755i.W0(com.tencent.luggage.sdk.jsapi.component.b.class)).a2() != null) {
            m47Var.f380152n = ((com.tencent.luggage.sdk.jsapi.component.b) g1Var.f77755i.W0(com.tencent.luggage.sdk.jsapi.component.b.class)).a2().getUserAgentString();
        }
        r45.w47 w47Var = new r45.w47();
        g1Var.f77754h.getClass();
        w47Var.f388876d = "WeixinJSCore";
        java.util.HashMap hashMap = (java.util.HashMap) com.tencent.mm.plugin.appbrand.debugger.n1.f77804m;
        for (java.lang.String str : hashMap.keySet()) {
            if (((java.lang.String[]) hashMap.get(str)).length > 5) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugMsgMrg", "Interface method only support five arguments!");
            } else {
                r45.s47 s47Var = new r45.s47();
                s47Var.f385506d = str;
                for (int i17 = 0; i17 < ((java.lang.String[]) hashMap.get(str)).length; i17++) {
                    s47Var.f385507e.add(((java.lang.String[]) hashMap.get(str))[i17]);
                }
                w47Var.f388877e.add(s47Var);
            }
        }
        a57Var.f369742d = w47Var;
        g1Var.a0(a57Var, "setupContext");
    }

    public static void u(com.tencent.mm.plugin.appbrand.debugger.g1 g1Var) {
        java.lang.String str;
        g1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "login");
        g1Var.f77750d.e(1);
        r45.f57 f57Var = new r45.f57();
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = g1Var.f77750d;
        f57Var.f374029d = a1Var.f77600b;
        synchronized (a1Var) {
            str = a1Var.f77601c;
        }
        f57Var.f374030e = str;
        g1Var.f77753g.b(com.tencent.mm.plugin.appbrand.debugger.y1.b(1002, f57Var));
    }

    public static void y(com.tencent.mm.plugin.appbrand.debugger.g1 g1Var, r45.g57 g57Var, r45.k47 k47Var) {
        if (com.tencent.mm.plugin.appbrand.debugger.y1.c(g1Var.f77750d, k47Var, g57Var.f374907d, g1Var.f77756m, g1Var.f77754h)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "onLogin ");
            r45.x47 x47Var = g57Var.f374908e;
            if (x47Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugJsEngine", "onLogin room info is null");
                return;
            }
            if (x47Var.f389776d) {
                g1Var.f77750d.getClass();
                g1Var.T();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "joinRoom");
            g1Var.f77750d.e(2);
            r45.d57 d57Var = new r45.d57();
            com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = g1Var.f77750d;
            d57Var.f372134d = a1Var.f77600b;
            com.tencent.mm.plugin.appbrand.debugger.b1 b1Var = a1Var.f77605g;
            d57Var.f372136f = b1Var.f77628a;
            d57Var.f372135e = "";
            d57Var.f372137g = b1Var.f77629b;
            g1Var.f77753g.b(com.tencent.mm.plugin.appbrand.debugger.y1.b(1003, d57Var));
        }
    }

    public final void F() {
        if (this.f77753g == null) {
            com.tencent.mm.plugin.appbrand.debugger.x1 x1Var = new com.tencent.mm.plugin.appbrand.debugger.x1((uh1.a) this.f77755i.b(uh1.a.class));
            this.f77753g = x1Var;
            com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = this.f77750d;
            com.tencent.mm.plugin.appbrand.debugger.l2 l2Var = this.f77756m;
            com.tencent.mm.plugin.appbrand.debugger.n1 n1Var = this.f77754h;
            n1Var.f77805a = x1Var;
            n1Var.f77806b = a1Var;
            n1Var.f77807c = l2Var;
            com.eclipsesource.mmv8.V8Inspector.setServer(new com.tencent.mm.plugin.appbrand.debugger.o1(n1Var));
        }
        this.f77757n = false;
        boolean isEmpty = android.text.TextUtils.isEmpty(this.f77750d.f77622x);
        uh1.o0 o0Var = this.f77759p;
        if (!isEmpty) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "connect wsEndpoint url:%s", this.f77750d.f77622x);
            this.f77753g.a(this.f77750d.f77622x, o0Var);
            return;
        }
        if (!(this.f77750d.f77605g.f77630c == 3)) {
            this.f77753g.a("wss://wxagame.weixin.qq.com/remote/", o0Var);
            return;
        }
        this.f77753g.a("ws://localhost:" + this.f77750d.f77605g.f77631d, o0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback) {
        evaluateJavascript(str3, valueCallback);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        evaluateJavascript(str, valueCallback);
    }

    public void S(com.tencent.mm.plugin.appbrand.debugger.a1 a1Var, boolean z17, boolean z18) {
        java.lang.String str;
        this.f77758o = z18;
        com.tencent.mm.plugin.appbrand.debugger.n1 n1Var = this.f77754h;
        n1Var.f77809e = z18;
        this.f77750d = a1Var;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = a1Var.f77599a;
        this.f77755i = yVar;
        this.f77752f = (android.app.Activity) yVar.getContext();
        com.tencent.mm.plugin.appbrand.debugger.l2 l2Var = new com.tencent.mm.plugin.appbrand.debugger.l2(this.f77752f, this.f77750d, new com.tencent.mm.plugin.appbrand.debugger.c1(this));
        this.f77756m = l2Var;
        ze.n t37 = this.f77755i.t3();
        l2Var.f77784e = t37.f74810s;
        if (l2Var.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) l2Var.getParent()).removeView(l2Var);
        }
        com.tencent.mm.plugin.appbrand.ef.RemoteDebugFloatView.a(t37, l2Var);
        com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView remoteDebugMoveView = (com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView) android.view.LayoutInflater.from(l2Var.getContext()).inflate(com.tencent.mm.R.layout.f488085gt, (android.view.ViewGroup) null);
        l2Var.f77785f = remoteDebugMoveView;
        l2Var.f77788i = (android.widget.TextView) remoteDebugMoveView.findViewById(com.tencent.mm.R.id.f483212zy);
        l2Var.f77787h = (android.widget.TextView) l2Var.f77785f.findViewById(com.tencent.mm.R.id.a07);
        l2Var.f77789m = (android.widget.TextView) l2Var.f77785f.findViewById(com.tencent.mm.R.id.f483216a02);
        l2Var.f77790n = (android.widget.TextView) l2Var.f77785f.findViewById(com.tencent.mm.R.id.f483218a04);
        l2Var.f77791o = (android.widget.TextView) l2Var.f77785f.findViewById(com.tencent.mm.R.id.f483215a01);
        l2Var.f77792p = (android.widget.TextView) l2Var.f77785f.findViewById(com.tencent.mm.R.id.f483210zw);
        l2Var.f77793q = (android.widget.TextView) l2Var.f77785f.findViewById(com.tencent.mm.R.id.f483214a00);
        l2Var.f77795s = (android.widget.ImageView) l2Var.f77785f.findViewById(com.tencent.mm.R.id.f483211zx);
        l2Var.f77794r = (android.widget.ImageView) l2Var.f77785f.findViewById(com.tencent.mm.R.id.f483219a05);
        l2Var.f77796t = l2Var.f77785f.findViewById(com.tencent.mm.R.id.f483213zz);
        l2Var.d();
        android.widget.TextView textView = l2Var.f77791o;
        android.view.View.OnClickListener onClickListener = l2Var.f77800x;
        textView.setOnClickListener(onClickListener);
        l2Var.f77792p.setOnClickListener(onClickListener);
        l2Var.f77790n.setOnClickListener(onClickListener);
        l2Var.postDelayed(new com.tencent.mm.plugin.appbrand.debugger.b2(l2Var), 100L);
        if (this.f77753g == null) {
            com.tencent.mm.plugin.appbrand.debugger.x1 x1Var = new com.tencent.mm.plugin.appbrand.debugger.x1((uh1.a) this.f77755i.b(uh1.a.class));
            this.f77753g = x1Var;
            com.tencent.mm.plugin.appbrand.debugger.a1 a1Var2 = this.f77750d;
            com.tencent.mm.plugin.appbrand.debugger.l2 l2Var2 = this.f77756m;
            n1Var.f77805a = x1Var;
            n1Var.f77806b = a1Var2;
            n1Var.f77807c = l2Var2;
            com.eclipsesource.mmv8.V8Inspector.setServer(new com.tencent.mm.plugin.appbrand.debugger.o1(n1Var));
        }
        if (z17) {
            com.tencent.mm.plugin.appbrand.debugger.l2 l2Var3 = this.f77756m;
            l2Var3.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.c2(l2Var3));
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.f2(l2Var3));
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "sendClientNavigatorEvent  event:%s", "relaunched");
            r45.i47 i47Var = new r45.i47();
            i47Var.f376732d = "relaunched";
            n1Var.g(com.tencent.mm.plugin.appbrand.debugger.y1.e(i47Var, n1Var.f77806b, "clientNavigatorEvent"));
            return;
        }
        F();
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var3 = this.f77750d;
        synchronized (a1Var3) {
            str = a1Var3.f77601c;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "getRemoteDebugTicket");
            ((com.tencent.mm.plugin.appbrand.networking.c0) this.f77755i.q(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxabusiness/getremotedebugticket", this.f77755i.getAppId(), new r45.en3(), r45.fn3.class).n(new com.tencent.mm.plugin.appbrand.debugger.f1(this));
        }
    }

    public final void T() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "onReady");
        this.f77750d.e(3);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "clearPendingScript");
        java.util.Iterator it = this.f77750d.f77614p.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            evaluateJavascript((java.lang.String) pair.first, (android.webkit.ValueCallback) pair.second);
        }
        this.f77750d.f77614p.clear();
        this.f77754h.i(this.f77750d.a(), Integer.MAX_VALUE);
        com.tencent.mm.plugin.appbrand.debugger.l2 l2Var = this.f77756m;
        l2Var.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.c2(l2Var));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.f2(l2Var));
    }

    public void a0(com.tencent.mm.protobuf.f fVar, java.lang.String str) {
        this.f77754h.g(com.tencent.mm.plugin.appbrand.debugger.y1.e(fVar, this.f77750d, str));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void destroy() {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f77755i;
        if (yVar == null || yVar.t3() == null || !this.f77755i.t3().A || !this.f77758o) {
            this.f77754h.f();
            com.tencent.mm.plugin.appbrand.debugger.n1 n1Var = this.f77754h;
            n1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "onClose");
            java.util.concurrent.Future future = n1Var.f77816l;
            if (future != null) {
                future.cancel(false);
            }
            com.tencent.mm.plugin.appbrand.debugger.h1 a17 = com.tencent.mm.plugin.appbrand.debugger.h1.a();
            if (a17.f77763a != null) {
                a17.f77763a = null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        boolean z17;
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = this.f77750d;
        if (a1Var == null) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue("FATAL");
                return;
            }
            return;
        }
        synchronized (a1Var) {
            z17 = a1Var.f77613o;
        }
        if (z17) {
            return;
        }
        if (!this.f77750d.d()) {
            this.f77750d.f77614p.add(new android.util.Pair(str, valueCallback));
            this.f77751e = null;
            return;
        }
        r45.p47 p47Var = new r45.p47();
        p47Var.f382752e = this.f77750d.f77611m.incrementAndGet();
        p47Var.f382751d = str;
        a0(p47Var, "evaluateJavascript");
        int i17 = p47Var.f382752e;
        com.tencent.mm.plugin.appbrand.debugger.g gVar = new com.tencent.mm.plugin.appbrand.debugger.g();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f77751e)) {
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("subscribeHandler\\(\"(.*)\" , ").matcher(str);
            gVar.f77745c = matcher.find() ? matcher.group(1) : "";
        } else {
            gVar.f77745c = this.f77751e;
            this.f77751e = null;
        }
        gVar.f77744b = java.lang.System.currentTimeMillis();
        gVar.f77746d = str.length();
        gVar.f77743a = valueCallback;
        this.f77750d.f77618t.put(java.lang.Integer.valueOf(i17), gVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public com.tencent.mm.plugin.appbrand.jsruntime.u h0(java.lang.Class cls) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.profile.b
    public void m(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.debugger.n1 n1Var = this.f77754h;
        if (n1Var == null) {
            return;
        }
        n1Var.getClass();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has(dm.i4.COL_ID)) {
                n1Var.f77810f.add(java.lang.Integer.valueOf(jSONObject.getInt(dm.i4.COL_ID)));
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugMsgMrg", "sendInspectorMsg  e:%s", e17);
        }
        com.eclipsesource.mmv8.V8Inspector.onReceiveData(java.lang.Math.round(java.lang.Math.random() * 100.0d), str);
    }

    @Override // com.tencent.mm.plugin.appbrand.profile.b
    public void s(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.debugger.n1 n1Var = this.f77754h;
        if (n1Var == null) {
            return;
        }
        n1Var.c(java.lang.Math.round(java.lang.Math.random() * 100.0d), str);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void setJsExceptionHandler(com.tencent.mm.plugin.appbrand.jsruntime.s sVar) {
    }
}
