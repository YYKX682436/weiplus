package tz2;

/* loaded from: classes14.dex */
public class e implements tz2.u, com.p314xaae8f345.mm.p944x882e457a.u0, dn.k {
    public i11.c A;
    public float B;
    public float C;
    public boolean D;
    public int E;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser f504795d;

    /* renamed from: e, reason: collision with root package name */
    public int f504796e;

    /* renamed from: f, reason: collision with root package name */
    public int f504797f;

    /* renamed from: g, reason: collision with root package name */
    public long f504798g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f504799h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f504800i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f504801m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f504802n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f504803o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.Activity f504804p;

    /* renamed from: t, reason: collision with root package name */
    public xz2.a f504808t;

    /* renamed from: z, reason: collision with root package name */
    public i11.e f504814z;

    /* renamed from: q, reason: collision with root package name */
    public int f504805q = -1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f504806r = true;

    /* renamed from: s, reason: collision with root package name */
    public long f504807s = -1;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f504809u = gm0.j1.b().n();

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f504810v = "";

    /* renamed from: w, reason: collision with root package name */
    public long f504811w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f504812x = 0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f504813y = "";

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // tz2.u
    public void a(android.widget.TextView textView, java.lang.String str) {
        try {
            boolean z17 = true;
            if (!str.equals(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61559xcc75bcf6) && !str.equals(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61563x6752e4f8) && !str.equals(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61565x2cba061f) && !str.equals(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61562xaef86602)) {
                if (java.lang.System.currentTimeMillis() - this.f504807s >= 1000) {
                    this.f504807s = java.lang.System.currentTimeMillis();
                } else {
                    z17 = false;
                }
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "onFrameworkEvent tips: unable to change text: %s", str);
                return;
            }
            java.lang.String c17 = wz2.a.c(textView.getContext(), str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "updateTipText res:%s tip:%s", str, c17);
            if (android.text.TextUtils.isEmpty(c17)) {
                return;
            }
            wz2.a.j(textView, c17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // tz2.u
    public void b(android.widget.TextView textView) {
    }

    @Override // tz2.u
    public void c(android.content.Intent intent, android.app.Activity activity) {
        xz2.a gVar;
        this.f504804p = activity;
        int intExtra = intent.getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        this.f504796e = intExtra;
        this.f504797f = intent.getIntExtra("face_cgi_scene", intExtra);
        this.f504799h = intent.getStringExtra("appId");
        this.f504800i = intent.getStringExtra("request_verify_pre_info");
        this.E = intent.getIntExtra("identify_type", 0);
        this.f504802n = intent.getBooleanExtra("needVideo", false);
        this.f504803o = intent.getStringExtra("feedbackUrl");
        this.f504806r = !intent.getBooleanExtra("face_flash_no_use_id_card", false);
        this.f504805q = android.provider.Settings.System.getInt(activity.getContentResolver(), "screen_brightness", 100);
        switch (this.f504796e) {
            case 0:
                gVar = new xz2.g();
                break;
            case 1:
                gVar = new xz2.f();
                break;
            case 2:
            case 5:
                gVar = new xz2.h();
                break;
            case 3:
                gVar = new xz2.i();
                break;
            case 4:
                gVar = new xz2.c();
                break;
            case 6:
                gVar = new xz2.e();
                break;
            default:
                gVar = new xz2.b();
                break;
        }
        this.f504808t = gVar;
        java.lang.String stringExtra = intent.getStringExtra("k_ticket");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "has prepared ticket. force set");
            c72.v.f121126f = stringExtra;
        }
        boolean z17 = this.f504809u;
        if (z17) {
            gm0.j1.d().a(com.p314xaae8f345.p3085x8ea91595.p3088xaf3f29eb.C26651x338099a8.f55984x5fe5d0c0, this);
        } else {
            gm0.j1.d().a(733, this);
        }
        gm0.j1.d().a(this.f504808t.mo176188xfb85f7b0(), this);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6435x3e5b6070 b17 = vz2.c.b();
        b17.f137734z = b17.b("AppId", this.f504799h, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "[%s]intent data, scene:%s ,mAppId:%s verifyInfo:%s currentLight %s enterBrightness: %s isLogin:%s", getClass().getSimpleName(), java.lang.Integer.valueOf(this.f504796e), this.f504799h, this.f504800i, java.lang.Float.valueOf(0.0f), java.lang.Integer.valueOf(this.f504805q), java.lang.Boolean.valueOf(z17));
    }

    public final void d() {
        if (android.text.TextUtils.isEmpty(this.f504813y)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "cancelSendTask media id:%s", this.f504813y);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(this.f504813y);
        this.f504813y = "";
    }

    public int e() {
        return 8;
    }

    public org.json.JSONObject f(java.lang.String str, int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("err_type", 1);
            jSONObject.put("err_code", i17);
            jSONObject.put("err_feedback", this.f504803o);
            jSONObject.put("key_app_id", this.f504799h);
            if (!android.text.TextUtils.isEmpty(str)) {
                jSONObject.put("err_msg", str);
            }
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public int g() {
        return 3;
    }

    public int h() {
        return 4;
    }

    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "improveBrightness");
        if (this.f504804p == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new tz2.b(this));
    }

    public void j(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "initPrepareTip :%s", str);
        if (str.equals("1")) {
            this.f504810v = i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81480x828d9d36);
            return;
        }
        if (str.equals("2")) {
            this.f504810v = i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81484x5d9410f8);
            return;
        }
        if (str.equals("3")) {
            this.f504810v = i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81483x11af29c2);
        } else if (str.equals("4")) {
            this.f504810v = i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81486x57d355df);
        } else if (str.equals("5")) {
            this.f504810v = i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81487x93ecd3fb);
        }
    }

    public void k(java.lang.String str, boolean z17) {
        vz2.c.b().f137719k = java.lang.System.currentTimeMillis() - this.f504812x;
        vz2.c.c().f137743l = java.lang.System.currentTimeMillis() - this.f504812x;
        java.lang.String m17 = m(str, z17);
        if (android.text.TextUtils.isEmpty(m17) || !com.p314xaae8f345.mm.vfs.w6.j(m17)) {
            n(90034, i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.c77));
        } else {
            o(m17, z17);
        }
    }

    public void l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "restoreBrightness %d", java.lang.Integer.valueOf(this.f504805q));
        if (this.f504805q > 0) {
            ((ku5.t0) ku5.t0.f394148d).B(new tz2.c(this));
        }
    }

    public java.lang.String m(java.lang.String str, boolean z17) {
        java.lang.String valueOf = java.lang.String.valueOf(this.f504798g);
        java.lang.String str2 = this.f504799h;
        int g17 = g();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            boolean z18 = tz2.t.f504858a;
            r45.mi miVar = new r45.mi();
            org.json.JSONObject e17 = tz2.s.e(valueOf, str2, "", "", g17, jSONObject);
            byte[] a17 = (z18 && z17) ? valueOf != null ? tz2.t.a(valueOf, e17.toString()) : new byte[0] : tz2.s.a(valueOf, e17.toString());
            miVar.f462066e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(a17);
            miVar.f462065d = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(tz2.s.b(valueOf, a17, z18 && z17));
            java.lang.String concat = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.h().concat("/release_out.fd");
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.l(miVar.mo14344x5f01b1f6(), concat);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashDataUtil", "save verify result to bioId:%s file:%s  fileSize:%s  fileMd5:%s useSM4:%s", valueOf, concat, java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(concat)), com.p314xaae8f345.mm.vfs.w6.o(concat), java.lang.Boolean.valueOf(z18));
            return concat;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e18, "reflect get yt result data error", new java.lang.Object[0]);
            return "";
        }
    }

    public final void n(int i17, java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("err_type", 4);
            jSONObject.put("err_code", i17);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, i17);
            jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, i17);
            jSONObject.put("err_msg", str);
            jSONObject.put("err_feedback", this.f504803o);
        } catch (org.json.JSONException unused) {
        }
        hashMap.put("response", jSONObject.toString());
        this.f504795d.mo120776xd218dbca(hashMap, null);
    }

    public void o(java.lang.String str, boolean z17) {
        dn.m mVar = new dn.m();
        mVar.f323320f = this;
        mVar.f69601xaca5bdda = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.f(str);
        mVar.f69595x6d25b0d9 = str;
        mVar.f69619xe9ed65f6 = "";
        mVar.f69592xf1ebe47b = 5;
        mVar.f69618x114ef53e = "";
        mVar.f69609xd84b8349 = 2;
        mVar.f69606xccdbf540 = false;
        mVar.f69597x853bb235 = false;
        mVar.f69580x454032b6 = 1;
        mVar.f69584x89a4c0cf = 0;
        mVar.f69598x47e3df1e = 0;
        mVar.f323322h = 5;
        if (z17 && tz2.t.f504858a) {
            mVar.Q = com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e.m39673x3136c9db().m39710x52c2522c(5).m39707x81fa9a19(1).m39713x7e4870a1(mVar.f69601xaca5bdda).m39708x76483653(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1.m38060x3136c9db().m38091x7383d0d(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504.m38477x3136c9db().m38490x181227e3(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4473x44c202ec.CIPHER_METHOD_SM4CBC).m38478x59bc66e()).m38063x59bc66e()).m39674x59bc66e();
        }
        this.f504813y = mVar.f69601xaca5bdda;
        vz2.c.j("reqCdn");
        this.f504811w = java.lang.System.currentTimeMillis();
        vz2.c.m(8);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerData", "hy: cdntra addSendTask failed. clientid:%s", mVar.f69601xaca5bdda);
        vz2.c.b().B = 5;
        vz2.c.c().f137750s = 5;
        vz2.c.j("cdnFailTask");
        n(90019, "face file add to cdn failed");
    }

    @Override // tz2.u
    /* renamed from: onNetworkRequestEvent */
    public void mo63480x2ed2023a(java.lang.String str, java.lang.String str2, java.util.HashMap hashMap, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "onNetworkRequestEvent  url:%s requestContent:%s requestHeaders:%s", str, str2, hashMap);
        this.f504795d = iYtSDKKitNetResponseParser;
        if (!str.contains("wechat_face_config")) {
            if (!str.contains("wechat_face_verify")) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.m121042x9cf0d20b().m121043xc6f9ce29(str, str2, hashMap, new tz2.a(this, iYtSDKKitNetResponseParser));
                return;
            }
            vz2.c.b().f137729u = java.lang.System.currentTimeMillis();
            l();
            k(str2, false);
            vz2.b.e(e());
            return;
        }
        vz2.c.b().f137726r = java.lang.System.currentTimeMillis();
        vz2.c.j("reqCfg");
        i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "requestConfig");
        vz2.c.m(2);
        try {
            java.lang.String string = new org.json.JSONObject(str2).getString("select_data");
            this.f504801m = string;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "getConfig selectData:%s", string);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e17, "reflect get yt config data error", new java.lang.Object[0]);
        }
        r45.ua3 ua3Var = new r45.ua3();
        ua3Var.f468698d = this.E;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "requestConfig cgiScene:%d", java.lang.Integer.valueOf(this.f504797f));
        if (this.f504809u) {
            gm0.j1.d().g(new c72.a0(this.f504797f, e(), this.f504799h, this.f504800i, this.f504801m.getBytes(), ua3Var));
        } else {
            gm0.j1.d().g(new c72.b0(this.f504797f, e(), this.f504799h, this.f504800i, this.f504801m.getBytes(), ua3Var));
        }
        vz2.b.d(e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if ((m1Var instanceof c72.a0) || (m1Var instanceof c72.b0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "[cgi-ret]NetSceneGetBioConfig errType:%s errCode:%s errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            vz2.c.b().f137727s = java.lang.System.currentTimeMillis();
            vz2.c.k("rspCfg", java.lang.Integer.valueOf(i18));
            vz2.c.b().f137715g = i18;
            this.f504812x = java.lang.System.currentTimeMillis();
            if (i17 != 0 || i18 != 0) {
                java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    vz2.c.b().B = 3;
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, 90036);
                    jSONObject.put("err_feedback", this.f504803o);
                    jSONObject.put("err_msg", i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81517x9a9e6cc4));
                } catch (org.json.JSONException unused) {
                }
                hashMap.put("response", jSONObject.toString());
                this.f504795d.mo120776xd218dbca(hashMap, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerError", "get mBioId failed");
                return;
            }
            c72.b bVar = (c72.b) m1Var;
            this.f504798g = bVar.g();
            java.lang.String m55290x5bf1598d = com.p314xaae8f345.mm.p1006xc5476f33.p1409x9e7e39d6.p1410x4e42091.C13537xa00bccff.m55290x5bf1598d(this.f504798g + "", bVar.c(), bVar.c().length);
            java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, 0);
                jSONObject2.put("err_msg", "OK");
                jSONObject2.put("type", 1);
                jSONObject2.put("smallface_ratio_threshold", bVar.b());
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "update smallface_ratio_threshold:%f", java.lang.Float.valueOf(bVar.b()));
                jSONObject3.put("smallface_ratio_threshold", bVar.b());
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120773x1b37865f(jSONObject3);
                if (bVar.p() != null) {
                    try {
                        jSONObject2.put("select_data", new org.json.JSONObject(new java.lang.String(bVar.p())));
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerData", e17, "parse selectJson error", new java.lang.Object[0]);
                    }
                }
                org.json.JSONArray optJSONArray = new org.json.JSONObject(m55290x5bf1598d).optJSONArray("face_action_seq");
                if (optJSONArray != null) {
                    for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
                        org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i19);
                        if (optJSONObject != null) {
                            if (optJSONObject.optInt("action_id", 0) == 6) {
                                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, optJSONObject.optString("action_data"));
                                jSONObject2.put("color_data", optJSONObject.optString("action_data"));
                            }
                            if (optJSONObject.optInt("action_id", 0) == 7) {
                                java.lang.String optString = optJSONObject.optString("action_data", "0");
                                j(optString);
                                jSONObject2.put("action_data", optString);
                            }
                        }
                    }
                }
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e18, "reflect get config error", new java.lang.Object[0]);
            }
            hashMap2.put("response", jSONObject2.toString());
            this.f504795d.mo120776xd218dbca(hashMap2, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "[sdk-info] mBioId:%s decryptConfig:%s retMap:%s", java.lang.Long.valueOf(this.f504798g), m55290x5bf1598d, hashMap2);
            return;
        }
        try {
            if (m1Var instanceof xz2.d) {
                vz2.c.b().f137731w = java.lang.System.currentTimeMillis();
                vz2.c.k("rspVerify", java.lang.Integer.valueOf(i18));
                vz2.c.b().f137717i = i18;
                if (i17 == 0 && i18 == 0) {
                    android.os.Bundle bundle = ((xz2.d) m1Var).f539741d;
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    for (java.lang.String str2 : bundle.keySet()) {
                        try {
                            jSONObject4.put(str2, bundle.get(str2));
                        } catch (org.json.JSONException unused2) {
                        }
                    }
                    try {
                        jSONObject4.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, i18);
                        jSONObject4.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, i18);
                        jSONObject4.put("err_msg", str);
                    } catch (org.json.JSONException unused3) {
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "[cgi-ret]retContent:%s", jSONObject4);
                    java.util.HashMap<java.lang.String, java.lang.String> hashMap3 = new java.util.HashMap<>();
                    hashMap3.put("response", jSONObject4.toString());
                    this.f504795d.mo120776xd218dbca(hashMap3, null);
                    return;
                }
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, i18);
                jSONObject5.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, i18);
                jSONObject5.put("err_type", 3);
                jSONObject5.put("err_code", i18);
                jSONObject5.put("err_retry", true);
                jSONObject5.put("err_msg", i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.jio));
            } else {
                if (m1Var instanceof c72.q) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "[cgi-ret]NetSceneFacePicThirdVerifyFace errType:%s errCode:%s errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                    vz2.c.k("rspVerify", java.lang.Integer.valueOf(i18));
                    vz2.c.b().f137717i = i18;
                    vz2.c.b().f137731w = java.lang.System.currentTimeMillis();
                    org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                    try {
                        jSONObject6.put("err_type", i17);
                        jSONObject6.put("err_code", i18);
                        jSONObject6.put("err_tip", ((c72.q) m1Var).f121116g);
                        jSONObject6.put("verify_result", ((c72.q) m1Var).f121115f);
                        jSONObject6.put("err_retry", ((c72.c) m1Var).e());
                        if (i17 == 0 && i18 == 0) {
                            jSONObject6.put("err_msg", str);
                            jSONObject6.put("key_app_id", this.f504799h);
                            jSONObject6.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, i18);
                            jSONObject6.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, i18);
                            jSONObject6.put("err_msg", str);
                            if (this.E == 1) {
                                jSONObject6.put("selfHandle", true);
                            }
                            vz2.b.c(e());
                        } else {
                            vz2.c.b().B = 4;
                            jSONObject6.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, i18);
                            jSONObject6.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, i18);
                            jSONObject6.put("err_msg", i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.g6w));
                            jSONObject6.put("err_feedback", this.f504803o);
                            jSONObject6.put("err_msg", str);
                            vz2.b.a(e());
                        }
                    } catch (org.json.JSONException unused4) {
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "[cgi-ret]retContent:%s", jSONObject6);
                    java.util.HashMap<java.lang.String, java.lang.String> hashMap4 = new java.util.HashMap<>();
                    hashMap4.put("response", jSONObject6.toString());
                    this.f504795d.mo120776xd218dbca(hashMap4, null);
                    return;
                }
                if (!(m1Var instanceof c72.c)) {
                    return;
                }
                vz2.c.b().f137731w = java.lang.System.currentTimeMillis();
                vz2.c.k("rspVerify", java.lang.Integer.valueOf(i18));
                vz2.c.b().f137717i = i18;
                org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                new android.os.Bundle().putString(this.f504808t.b(), ((c72.c) m1Var).n());
                jSONObject7.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, i18);
                jSONObject7.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, i18);
                jSONObject7.put("err_type", 2);
                jSONObject7.put("err_code", i18);
                jSONObject7.put("err_msg", str);
                jSONObject7.put("err_retry", ((c72.c) m1Var).e());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "[cgi-ret]retContent:%s", jSONObject7);
                java.util.HashMap<java.lang.String, java.lang.String> hashMap5 = new java.util.HashMap<>();
                hashMap5.put("response", jSONObject7.toString());
                this.f504795d.mo120776xd218dbca(hashMap5, null);
            }
        } catch (org.json.JSONException unused5) {
        }
    }

    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        int i18 = hVar == null ? -1 : hVar.f69553xb5f54fe9;
        vz2.c.k("rspCdn", java.lang.Integer.valueOf(i18));
        vz2.c.b().f137716h = i18;
        vz2.c.b().f137718j = java.lang.System.currentTimeMillis() - this.f504811w;
        if (i17 == -21005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "hy: ERR_CNDCOM_MEDIA_IS_UPLOADING cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
            return 0;
        }
        if (hVar == null || hVar.f69553xb5f54fe9 != 0 || !this.f504813y.equals(str)) {
            if (i17 != 0 || (hVar != null && hVar.f69553xb5f54fe9 != 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceFlashManagerData", "hy: cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                vz2.c.b().B = 5;
                java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, 90020);
                    java.lang.String r17 = i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81514xe34e69a8);
                    jSONObject.put("err_feedback", this.f504803o);
                    jSONObject.put("err_msg", r17);
                } catch (org.json.JSONException unused) {
                }
                hashMap.put("response", jSONObject.toString());
                this.f504795d.mo120776xd218dbca(hashMap, null);
            }
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
        java.lang.String str2 = hVar.f69522xf9dbbe9c;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_pic_cdn_id", str2);
        bundle.putString("key_cdn_aes_key", hVar.f69502xf11df5f5);
        vz2.c.j("reqVerify");
        vz2.c.m(9);
        vz2.c.b().f137730v = java.lang.System.currentTimeMillis();
        this.f504808t.a(this.f504796e, this.f504798g, str2, hVar.f69502xf11df5f5, this.f504799h, this.f504800i, h(), 0.0f, this.f504802n ? 1 : 0, this.f504806r, this.E, this);
        return 0;
    }

    @Override // tz2.u
    /* renamed from: release */
    public void mo63481x41012807() {
        d();
        l();
        gm0.j1.d().q(com.p314xaae8f345.p3085x8ea91595.p3088xaf3f29eb.C26651x338099a8.f55984x5fe5d0c0, this);
        gm0.j1.d().q(this.f504808t.mo176188xfb85f7b0(), this);
        gm0.j1.d().q(733, this);
        i11.e eVar = this.f504814z;
        if (eVar != null) {
            ((i11.h) eVar).m(this.A);
        }
    }

    @Override // tz2.u
    /* renamed from: reset */
    public void mo167283x6761d4f() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6435x3e5b6070 b17 = vz2.c.b();
        b17.f137734z = b17.b("AppId", this.f504799h, true);
        d();
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
