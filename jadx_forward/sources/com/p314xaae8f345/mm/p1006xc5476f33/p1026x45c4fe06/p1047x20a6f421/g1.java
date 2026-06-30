package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class g1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 f159283d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f159284e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f159285f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.x1 f159286g;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f159288i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 f159289m;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 f159287h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1();

    /* renamed from: n, reason: collision with root package name */
    public boolean f159290n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f159291o = false;

    /* renamed from: p, reason: collision with root package name */
    public final uh1.o0 f159292p = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e1(this);

    public g1() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5164x497885b6>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.debugger.RemoteDebugJsEngine$4
            {
                this.f39173x3fe91575 = -1286330970;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5164x497885b6 c5164x497885b6) {
                am.u uVar;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5164x497885b6 c5164x497885b62 = c5164x497885b6;
                if (c5164x497885b62 != null && (uVar = c5164x497885b62.f135514g) != null && uVar.f89580c != null) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 g1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1.this;
                    if (g1Var.f159283d.f159138g.f159167g == 1) {
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("api_name", uVar.f89578a);
                            jSONObject.put("task_id", uVar.f89579b);
                            jSONObject.put("request_headers", uVar.f89580c.toString());
                            jSONObject.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, currentTimeMillis);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var = g1Var.f159287h;
                            if (n1Var != null) {
                                n1Var.f159339b.f159132a.mo50357xcd94f799().mo14660x738236e6("typeof DebuggerConnection.onReceiveNetworkHeader === 'function' && DebuggerConnection.onReceiveNetworkHeader('" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(jSONObject.toString()) + "')", null);
                            }
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.RemoteDebugJsEngine", "", e17);
                        }
                    } else {
                        r45.t47 t47Var = new r45.t47();
                        t47Var.f467674d = uVar.f89578a;
                        t47Var.f467675e = uVar.f89579b;
                        t47Var.f467676f = uVar.f89580c.toString();
                        t47Var.f467677g = currentTimeMillis;
                        g1Var.a0(t47Var, "networkDebugAPI");
                    }
                }
                return true;
            }
        }.mo48813x58998cd();
    }

    public static void t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 g1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17 = g1Var.f159288i.x();
        r45.a57 a57Var = new r45.a57();
        r45.m47 m47Var = new r45.m47();
        a57Var.f451276e = m47Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.v0) g1Var.f159288i.z1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.v0.class);
        if (v0Var != null) {
            a57Var.f451277f = v0Var.L();
        }
        a57Var.f451279h = g1Var.f159288i.t3().E0().f387385r.f156905md5;
        a57Var.f451280i = 1;
        java.lang.String M = g1Var.f159288i.x().M("WAServiceMainContext.js");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(M)) {
            a57Var.f451278g = kk.k.g(M.getBytes());
        }
        m47Var.f461682h = x17.i();
        m47Var.f461679e = wo.q.f529315c;
        m47Var.f461678d = wo.q.f529316d;
        m47Var.f461681g = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.a(g1Var.f159285f, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h);
        m47Var.f461680f = wo.q.f529318f;
        m47Var.f461684m = g1Var.f159285f.getResources().getDisplayMetrics().density;
        m47Var.f461683i = g1Var.f159285f.getResources().getDisplayMetrics().widthPixels / m47Var.f461684m;
        if (g1Var.f159288i.W0(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b.class) != null && ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) g1Var.f159288i.W0(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b.class)).a2() != null) {
            m47Var.f461685n = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) g1Var.f159288i.W0(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b.class)).a2().mo14665xb9044875();
        }
        r45.w47 w47Var = new r45.w47();
        g1Var.f159287h.getClass();
        w47Var.f470409d = "WeixinJSCore";
        java.util.HashMap hashMap = (java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1.f159337m;
        for (java.lang.String str : hashMap.keySet()) {
            if (((java.lang.String[]) hashMap.get(str)).length > 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugMsgMrg", "Interface method only support five arguments!");
            } else {
                r45.s47 s47Var = new r45.s47();
                s47Var.f467039d = str;
                for (int i17 = 0; i17 < ((java.lang.String[]) hashMap.get(str)).length; i17++) {
                    s47Var.f467040e.add(((java.lang.String[]) hashMap.get(str))[i17]);
                }
                w47Var.f470410e.add(s47Var);
            }
        }
        a57Var.f451275d = w47Var;
        g1Var.a0(a57Var, "setupContext");
    }

    public static void u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 g1Var) {
        java.lang.String str;
        g1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "login");
        g1Var.f159283d.e(1);
        r45.f57 f57Var = new r45.f57();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = g1Var.f159283d;
        f57Var.f455562d = a1Var.f159133b;
        synchronized (a1Var) {
            str = a1Var.f159134c;
        }
        f57Var.f455563e = str;
        g1Var.f159286g.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.b(1002, f57Var));
    }

    public static void y(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 g1Var, r45.g57 g57Var, r45.k47 k47Var) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.c(g1Var.f159283d, k47Var, g57Var.f456440d, g1Var.f159289m, g1Var.f159287h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "onLogin ");
            r45.x47 x47Var = g57Var.f456441e;
            if (x47Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugJsEngine", "onLogin room info is null");
                return;
            }
            if (x47Var.f471309d) {
                g1Var.f159283d.getClass();
                g1Var.T();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "joinRoom");
            g1Var.f159283d.e(2);
            r45.d57 d57Var = new r45.d57();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = g1Var.f159283d;
            d57Var.f453667d = a1Var.f159133b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.b1 b1Var = a1Var.f159138g;
            d57Var.f453669f = b1Var.f159161a;
            d57Var.f453668e = "";
            d57Var.f453670g = b1Var.f159162b;
            g1Var.f159286g.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.b(1003, d57Var));
        }
    }

    public final void F() {
        if (this.f159286g == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.x1 x1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.x1((uh1.a) this.f159288i.b(uh1.a.class));
            this.f159286g = x1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = this.f159283d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var = this.f159289m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var = this.f159287h;
            n1Var.f159338a = x1Var;
            n1Var.f159339b = a1Var;
            n1Var.f159340c = l2Var;
            com.p159x477cd522.p160x333422.C1475xe7732675.m16427x224e8645(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.o1(n1Var));
        }
        this.f159290n = false;
        boolean isEmpty = android.text.TextUtils.isEmpty(this.f159283d.f159155x);
        uh1.o0 o0Var = this.f159292p;
        if (!isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "connect wsEndpoint url:%s", this.f159283d.f159155x);
            this.f159286g.a(this.f159283d.f159155x, o0Var);
            return;
        }
        if (!(this.f159283d.f159138g.f159163c == 3)) {
            this.f159286g.a("wss://wxagame.weixin.qq.com/remote/", o0Var);
            return;
        }
        this.f159286g.a("ws://localhost:" + this.f159283d.f159138g.f159164d, o0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback) {
        mo14660x738236e6(str3, valueCallback);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        mo14660x738236e6(str, valueCallback);
    }

    public void S(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var, boolean z17, boolean z18) {
        java.lang.String str;
        this.f159291o = z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var = this.f159287h;
        n1Var.f159342e = z18;
        this.f159283d = a1Var;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = a1Var.f159132a;
        this.f159288i = yVar;
        this.f159285f = (android.app.Activity) yVar.mo50352x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2(this.f159285f, this.f159283d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.c1(this));
        this.f159289m = l2Var;
        ze.n t37 = this.f159288i.t3();
        l2Var.f159317e = t37.f156343s;
        if (l2Var.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) l2Var.getParent()).removeView(l2Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ef.RemoteDebugFloatView.a(t37, l2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3 c11848x16ccb2c3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3) android.view.LayoutInflater.from(l2Var.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569618gt, (android.view.ViewGroup) null);
        l2Var.f159318f = c11848x16ccb2c3;
        l2Var.f159321i = (android.widget.TextView) c11848x16ccb2c3.findViewById(com.p314xaae8f345.mm.R.id.f564745zy);
        l2Var.f159320h = (android.widget.TextView) l2Var.f159318f.findViewById(com.p314xaae8f345.mm.R.id.a07);
        l2Var.f159322m = (android.widget.TextView) l2Var.f159318f.findViewById(com.p314xaae8f345.mm.R.id.f564749a02);
        l2Var.f159323n = (android.widget.TextView) l2Var.f159318f.findViewById(com.p314xaae8f345.mm.R.id.f564751a04);
        l2Var.f159324o = (android.widget.TextView) l2Var.f159318f.findViewById(com.p314xaae8f345.mm.R.id.f564748a01);
        l2Var.f159325p = (android.widget.TextView) l2Var.f159318f.findViewById(com.p314xaae8f345.mm.R.id.f564743zw);
        l2Var.f159326q = (android.widget.TextView) l2Var.f159318f.findViewById(com.p314xaae8f345.mm.R.id.f564747a00);
        l2Var.f159328s = (android.widget.ImageView) l2Var.f159318f.findViewById(com.p314xaae8f345.mm.R.id.f564744zx);
        l2Var.f159327r = (android.widget.ImageView) l2Var.f159318f.findViewById(com.p314xaae8f345.mm.R.id.f564752a05);
        l2Var.f159329t = l2Var.f159318f.findViewById(com.p314xaae8f345.mm.R.id.f564746zz);
        l2Var.d();
        android.widget.TextView textView = l2Var.f159324o;
        android.view.View.OnClickListener onClickListener = l2Var.f159333x;
        textView.setOnClickListener(onClickListener);
        l2Var.f159325p.setOnClickListener(onClickListener);
        l2Var.f159323n.setOnClickListener(onClickListener);
        l2Var.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.b2(l2Var), 100L);
        if (this.f159286g == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.x1 x1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.x1((uh1.a) this.f159288i.b(uh1.a.class));
            this.f159286g = x1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var2 = this.f159283d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var2 = this.f159289m;
            n1Var.f159338a = x1Var;
            n1Var.f159339b = a1Var2;
            n1Var.f159340c = l2Var2;
            com.p159x477cd522.p160x333422.C1475xe7732675.m16427x224e8645(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.o1(n1Var));
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var3 = this.f159289m;
            l2Var3.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.c2(l2Var3));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.f2(l2Var3));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "sendClientNavigatorEvent  event:%s", "relaunched");
            r45.i47 i47Var = new r45.i47();
            i47Var.f458265d = "relaunched";
            n1Var.g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.e(i47Var, n1Var.f159339b, "clientNavigatorEvent"));
            return;
        }
        F();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var3 = this.f159283d;
        synchronized (a1Var3) {
            str = a1Var3.f159134c;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "getRemoteDebugTicket");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) this.f159288i.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxabusiness/getremotedebugticket", this.f159288i.mo48798x74292566(), new r45.en3(), r45.fn3.class).n(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.f1(this));
        }
    }

    public final void T() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "onReady");
        this.f159283d.e(3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "clearPendingScript");
        java.util.Iterator it = this.f159283d.f159147p.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            mo14660x738236e6((java.lang.String) pair.first, (android.webkit.ValueCallback) pair.second);
        }
        this.f159283d.f159147p.clear();
        this.f159287h.i(this.f159283d.a(), Integer.MAX_VALUE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var = this.f159289m;
        l2Var.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.c2(l2Var));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.f2(l2Var));
    }

    public void a0(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, java.lang.String str) {
        this.f159287h.g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.e(fVar, this.f159283d, str));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: addJavascriptInterface */
    public void mo14658x74041feb(java.lang.Object obj, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: destroy */
    public void mo14659x5cd39ffa() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f159288i;
        if (yVar == null || yVar.t3() == null || !this.f159288i.t3().A || !this.f159291o) {
            this.f159287h.f();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var = this.f159287h;
            n1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "onClose");
            java.util.concurrent.Future future = n1Var.f159349l;
            if (future != null) {
                future.cancel(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.h1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.h1.a();
            if (a17.f159296a != null) {
                a17.f159296a = null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0
    /* renamed from: evaluateJavascript */
    public void mo14660x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = this.f159283d;
        if (a1Var == null) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue("FATAL");
                return;
            }
            return;
        }
        synchronized (a1Var) {
            z17 = a1Var.f159146o;
        }
        if (z17) {
            return;
        }
        if (!this.f159283d.d()) {
            this.f159283d.f159147p.add(new android.util.Pair(str, valueCallback));
            this.f159284e = null;
            return;
        }
        r45.p47 p47Var = new r45.p47();
        p47Var.f464285e = this.f159283d.f159144m.incrementAndGet();
        p47Var.f464284d = str;
        a0(p47Var, "evaluateJavascript");
        int i17 = p47Var.f464285e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f159284e)) {
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("subscribeHandler\\(\"(.*)\" , ").matcher(str);
            gVar.f159278c = matcher.find() ? matcher.group(1) : "";
        } else {
            gVar.f159278c = this.f159284e;
            this.f159284e = null;
        }
        gVar.f159277b = java.lang.System.currentTimeMillis();
        gVar.f159279d = str.length();
        gVar.f159276a = valueCallback;
        this.f159283d.f159151t.put(java.lang.Integer.valueOf(i17), gVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u h0(java.lang.Class cls) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.b
    public void m(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var = this.f159287h;
        if (n1Var == null) {
            return;
        }
        n1Var.getClass();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has(dm.i4.f66865x76d1ec5a)) {
                n1Var.f159343f.add(java.lang.Integer.valueOf(jSONObject.getInt(dm.i4.f66865x76d1ec5a)));
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugMsgMrg", "sendInspectorMsg  e:%s", e17);
        }
        com.p159x477cd522.p160x333422.C1475xe7732675.m16426x9f2735ce(java.lang.Math.round(java.lang.Math.random() * 100.0d), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.b
    public void s(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var = this.f159287h;
        if (n1Var == null) {
            return;
        }
        n1Var.c(java.lang.Math.round(java.lang.Math.random() * 100.0d), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: setJsExceptionHandler */
    public void mo14673x29497b66(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s sVar) {
    }
}
