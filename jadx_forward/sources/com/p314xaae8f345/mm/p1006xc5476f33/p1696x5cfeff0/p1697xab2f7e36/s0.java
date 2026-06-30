package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class s0 extends tz2.e {
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f218713J;
    public float K;
    public java.lang.String L;
    public wu5.b W;
    public wu5.b X;
    public k72.v Z;
    public java.lang.String H = "";
    public boolean M = false;
    public int N = 0;
    public long P = 0;
    public long Q = 0;
    public long R = 0;
    public long S = 0;
    public long T = 0;
    public long U = 0;
    public boolean V = false;
    public java.lang.String Y = "";

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "updateTipText tip failed : %s", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        return;
     */
    @Override // tz2.e, tz2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.widget.TextView r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.FaceFlashActionReflectManager"
            java.lang.String r1 = "fl_act_blink"
            boolean r1 = r9.equals(r1)     // Catch: java.lang.Exception -> L60
            r2 = 1
            if (r1 != 0) goto L39
            java.lang.String r1 = "fl_act_open_mouth"
            boolean r1 = r9.equals(r1)     // Catch: java.lang.Exception -> L60
            if (r1 != 0) goto L39
            java.lang.String r1 = "fl_act_shake_head"
            boolean r1 = r9.equals(r1)     // Catch: java.lang.Exception -> L60
            if (r1 != 0) goto L39
            java.lang.String r1 = "fl_act_nod_head"
            boolean r1 = r9.equals(r1)     // Catch: java.lang.Exception -> L60
            if (r1 == 0) goto L24
            goto L39
        L24:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L60
            long r5 = r7.f504807s     // Catch: java.lang.Exception -> L60
            long r3 = r3 - r5
            r5 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L38
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L60
            r7.f504807s = r3     // Catch: java.lang.Exception -> L60
            goto L39
        L38:
            r2 = 0
        L39:
            if (r2 != 0) goto L45
            java.lang.String r8 = "updateTipText tip failed : %s"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Exception -> L60
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r8, r9)     // Catch: java.lang.Exception -> L60
            return
        L45:
            android.content.Context r1 = r8.getContext()     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = wz2.a.c(r1, r9)     // Catch: java.lang.Exception -> L60
            java.lang.String r2 = "updateTipText tip succ :%s， res:%s"
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r9}     // Catch: java.lang.Exception -> L60
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2, r9)     // Catch: java.lang.Exception -> L60
            boolean r9 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L60
            if (r9 != 0) goto L6e
            r8.setText(r1)     // Catch: java.lang.Exception -> L60
            goto L6e
        L60:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r9 = "updateTipText：%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r9, r8)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s0.a(android.widget.TextView, java.lang.String):void");
    }

    @Override // tz2.e, tz2.u
    public void b(android.widget.TextView textView) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "init prepareVerifyTip:%s", this.f504810v);
        textView.setText(this.f504810v);
    }

    @Override // tz2.e, tz2.u
    public void c(android.content.Intent intent, android.app.Activity activity) {
        super.c(intent, activity);
        this.f504796e = intent.getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        this.F = intent.getStringExtra("package");
        this.G = intent.getStringExtra("packageSign");
        this.M = intent.getBooleanExtra("needContract", false);
        this.H = intent.getStringExtra("otherVerifyTitle");
        this.D = intent.getBooleanExtra("useHttp", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "[%s]init data, packageName:%s scene：%s,packageSign:%s needSignContract:%s otherVerifyTitle:%s useHttp:%s", com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s0.class.getSimpleName(), java.lang.Integer.valueOf(this.f504796e), this.F, this.G, java.lang.Boolean.valueOf(this.M), this.H, java.lang.Boolean.valueOf(this.D));
        this.U = java.lang.System.currentTimeMillis();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_spam_report, false)) {
            k72.v vVar = new k72.v();
            this.Z = vVar;
            vVar.a();
        }
    }

    @Override // tz2.e
    public int e() {
        return 18;
    }

    @Override // tz2.e
    public int g() {
        return 3;
    }

    @Override // tz2.e
    public void j(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "initPrepareTip :%s", str);
        java.lang.String[] split = str.split(",");
        if (split.length > 1) {
            this.V = true;
        } else {
            this.V = false;
        }
        java.lang.String str2 = split[0];
        if (str2.equals("1")) {
            this.f504810v = i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81480x828d9d36);
            return;
        }
        if (str2.equals("2")) {
            this.f504810v = i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81484x5d9410f8);
            return;
        }
        if (str2.equals("3")) {
            this.f504810v = i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81483x11af29c2);
        } else if (str2.equals("4")) {
            this.f504810v = i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81486x57d355df);
        } else if (str2.equals("5")) {
            this.f504810v = i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81487x93ecd3fb);
        }
    }

    @Override // tz2.e, tz2.u
    /* renamed from: onNetworkRequestEvent */
    public void mo63480x2ed2023a(java.lang.String str, java.lang.String str2, java.util.HashMap hashMap, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "onNetworkRequestEvent  url:%s requestContent:%s requestHeaders:%s", str, str2, hashMap);
        this.f504795d = iYtSDKKitNetResponseParser;
        if (!str.contains("wechat_face_config")) {
            if (str.contains("wechat_face_verify")) {
                try {
                    l();
                    vz2.b.e(18);
                    if (this.D) {
                        s(str2);
                    } else {
                        k(str2, true);
                    }
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionReflectManager", "action parse verify body error:%s", e17.getMessage());
                    return;
                }
            }
            return;
        }
        vz2.c.j("reqCfg");
        i();
        vz2.b.d(18);
        vz2.c.m(2);
        try {
            java.lang.String string = new org.json.JSONObject(str2).getString("select_data");
            this.f504801m = string;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "requestFlashConfig getConfig selectData:%s", string);
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionReflectManager", "requestFlashConfig reflect get yt config data error : %s", e18.getMessage());
        }
        if (!this.D) {
            j72.a aVar = new j72.a(this.f504796e, this.F, this.G, 2, this.f504801m.getBytes());
            gm0.j1.d().a(2696, this);
            gm0.j1.d().g(aVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
        cronetRequestParams.f18181xe78dee5f = 1;
        cronetRequestParams.url = "https://payapp.wechatpay.cn/faceplat/getfacecheckaction";
        cronetRequestParams.f18174xbfc5d0e1 = "POST";
        this.Q = java.lang.System.currentTimeMillis();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("user-agent", ik1.l0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "", (ik1.k0) nd.f.a(ik1.k0.class)));
        hashMap2.put("Accept-Encoding", "gzip,compress,br,deflate");
        hashMap2.put("charset", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        cronetRequestParams.m37968xeb7416ae(hashMap2);
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f504796e));
        hashMap3.put("package", this.F);
        hashMap3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54530xa4e1ea94, 2);
        try {
            hashMap3.put("select_data", new java.lang.String(this.f504801m.getBytes(), java.nio.charset.StandardCharsets.UTF_8));
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckAction use http select_data JSON error!");
        }
        cronetRequestParams.f18159x6574fc6c = new org.json.JSONObject(hashMap3).toString().getBytes();
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37962x5ffa1e0c = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37962x5ffa1e0c(cronetRequestParams, new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.l0(this));
        this.X = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.n0(this, m37962x5ffa1e0c);
        if (m37962x5ffa1e0c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckAction use http request, CronetHttpsCreateResult is null!");
            r(90036, i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81517x9a9e6cc4), "cgi failed");
        } else if (m37962x5ffa1e0c.f18157x23aa2e05 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckAction use http request, CronetLogic startCronetHttpTask fail!");
            r(90036, i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81517x9a9e6cc4), "cgi failed");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckAction use http request, CronetLogic startCronetHttpTask success!");
            ((ku5.t0) ku5.t0.f394148d).k(this.X, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d);
        }
    }

    @Override // tz2.e, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "onSceneEnd：errType %s，errCode %s ，errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (!(m1Var instanceof j72.a)) {
            if (m1Var instanceof j72.c) {
                gm0.j1.d().q(2726, this);
                r45.mf3 mf3Var = ((j72.c) m1Var).f379577g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "scene is getFaceCheckResult：ret_code: %s, ret_msg: %s serialId:%s retry:%s", java.lang.Integer.valueOf(mf3Var.f461974d), mf3Var.f461975e, mf3Var.f461978h, java.lang.Integer.valueOf(mf3Var.f461977g));
                java.lang.String str2 = mf3Var.f461978h;
                this.Y = str2;
                q(i18, i17, mf3Var.f461974d, mf3Var.f461975e, mf3Var.f461976f, str2, mf3Var.f461977g);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "scene is getFaceCheckActionerrType");
        gm0.j1.d().q(2696, this);
        vz2.c.k("rspCfg", java.lang.Integer.valueOf(i18));
        j72.a aVar = (j72.a) m1Var;
        vz2.c.c().f137739h = i18;
        this.N++;
        this.P = java.lang.System.currentTimeMillis();
        if (i17 != 0 || i18 != 0) {
            r(90036, i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81517x9a9e6cc4), "cgi failed");
            return;
        }
        r45.if3 if3Var = aVar.f379570f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "response.ret_code:%s，response.ret_msg：%s bio_id：%s，response.action_data:%s response.color_data:%s response.select_data:%s", java.lang.Integer.valueOf(if3Var.f458517d), if3Var.f458518e, java.lang.Long.valueOf(if3Var.f458526p), if3Var.f458520g, if3Var.f458524n, if3Var.f458525o);
        int i19 = if3Var.f458517d;
        if (i19 != 0) {
            r(i19, if3Var.f458518e, "response.ret_code != 0");
            return;
        }
        this.I = if3Var.f458519f;
        this.f218713J = if3Var.f458520g;
        this.K = if3Var.f458521h;
        this.L = if3Var.f458522i;
        this.f504798g = if3Var.f458526p;
        p(new java.lang.String(if3Var.f458525o.f273689a), if3Var.f458520g, if3Var.f458524n);
    }

    public final void p(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.R = java.lang.System.currentTimeMillis();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, 0);
            jSONObject.put("err_msg", "OK");
            jSONObject.put("type", 1);
            if (str != null) {
                try {
                    jSONObject.put("select_data", new org.json.JSONObject(str));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionReflectManager", "parse select_data fail:%s", e17.getMessage());
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                j(str2);
                jSONObject.put("action_data", str2);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                jSONObject.put("color_data", str3);
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionReflectManager", "reflect get config error:%s", e18.getMessage());
        }
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        hashMap.put("response", jSONObject.toString());
        this.f504795d.mo120776xd218dbca(hashMap, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "[sdk-info] retMap:%s", hashMap);
    }

    public final void q(int i17, int i18, int i19, java.lang.String str, java.lang.String str2, java.lang.String str3, int i27) {
        this.T = java.lang.System.currentTimeMillis();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_report_cdn_timecost, true);
        long j17 = this.S;
        if (j17 != 0 && fj6) {
            long j18 = this.R - this.Q;
            long j19 = this.T - j17;
            long j27 = j17 - this.U;
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("biz_id", 19361);
                jSONObject.put("report_module", "mmpayfacecheck");
                jSONObject.put("facecheckaction_timecost", j18);
                jSONObject.put("facecheckresult_timecost", j19);
                jSONObject.put("facecheck_timecost", j27);
                jSONObject.put("serial_id", str3 == null ? "" : str3);
                jSONObject.put("device_uuid", wo.w0.k());
                jSONObject.put("oaid", wo.w0.n());
                jSONObject.put("responseRetCode", i19);
                jSONArray.put(jSONObject);
                java.lang.String jSONArray2 = jSONArray.toString();
                if (jSONArray2 == null) {
                    jSONArray2 = "{}";
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("Content-Type", "application/json");
                com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
                cronetRequestParams.f18181xe78dee5f = 1;
                cronetRequestParams.url = "https://cube.weixinbridge.com/cube/report/reportbizdata?f=json";
                cronetRequestParams.f18174xbfc5d0e1 = "POST";
                cronetRequestParams.m37968xeb7416ae(hashMap);
                byte[] bytes = jSONArray2.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                cronetRequestParams.f18159x6574fc6c = bytes;
                com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37962x5ffa1e0c = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37962x5ffa1e0c(cronetRequestParams, new wz2.b());
                if (m37962x5ffa1e0c != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FaceUtilNew", "CoronetHttpsCreateResult:%d", java.lang.Integer.valueOf(m37962x5ffa1e0c.f18157x23aa2e05));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FaceUtilNew", "reportTimeCostByHttp startCronetHttpTask fail! createResult is null");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FaceUtilNew", "reportTimeCostByHttp exception: %s", e17.getMessage());
            }
        }
        vz2.c.k("rspVerify", java.lang.Integer.valueOf(i19));
        vz2.c.c().f137741j = i19;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6436x54c76ecc c17 = vz2.c.c();
        c17.f137751t = c17.b("SerialId", str3, true);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("countFace", this.N);
            jSONObject2.put("err_code", i19);
            if (i18 == 0 && i17 == 0) {
                vz2.b.c(18);
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, i19);
                jSONObject2.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, i19);
                jSONObject2.put("errormsg", str);
                jSONObject2.put("err_msg", "ok");
                jSONObject2.put("token", str2);
                jSONObject2.put("serial_id", str3);
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f504796e);
                if (i19 != 0) {
                    jSONObject2.put("err_retry", i27);
                    jSONObject2.put("err_tip", str);
                    jSONObject2.put("err_msg", "fail");
                    jSONObject2.put("otherVerifyTitle", this.H);
                }
            } else {
                vz2.b.a(18);
                vz2.c.c().f137750s = 4;
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, i17);
                jSONObject2.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, i17);
                jSONObject2.put("errormsg", str);
                jSONObject2.put("otherVerifyTitle", this.H);
                jSONObject2.put("err_code", i17);
                jSONObject2.put("err_retry", i27);
                jSONObject2.put("err_msg", "fail");
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionReflectManager", "NetSceneGetFaceCheckResult parse fail :%s", e18.getMessage());
        }
        java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        hashMap2.put("response", jSONObject2.toString());
        this.f504795d.mo120776xd218dbca(hashMap2, null);
    }

    public final void r(int i17, java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            vz2.c.c().f137750s = 3;
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, i17);
            jSONObject.put("err_code", i17);
            jSONObject.put("err_msg", str);
            jSONObject.put("err_feedback", this.f504803o);
            jSONObject.put("otherVerifyTitle", this.H);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionReflectManager", "packageErrorResult error:%s", e17.getMessage());
        }
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        hashMap.put("response", jSONObject.toString());
        this.f504795d.mo120776xd218dbca(hashMap, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionReflectManager", "packageErrorResult get mBioId failed：%s", str2);
    }

    @Override // tz2.e, dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", " cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s] ", str, java.lang.Integer.valueOf(i17), gVar, hVar);
        int i18 = hVar == null ? -1 : hVar.f69553xb5f54fe9;
        vz2.c.k("rspCdn", java.lang.Integer.valueOf(i18));
        vz2.c.c().f137740i = i18;
        vz2.c.c().f137742k = java.lang.System.currentTimeMillis() - this.f504811w;
        if (hVar == null || hVar.f69553xb5f54fe9 != 0) {
            if (i17 == 0 && hVar == null) {
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "cdnCallback sceneResult.field_retCode != 0");
            vz2.c.c().f137750s = 5;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, 90020);
                java.lang.String r17 = i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81514xe34e69a8);
                jSONObject.put("err_feedback", this.f504803o);
                jSONObject.put("err_msg", r17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionReflectManager", "cdn callback error:%s", e17.getMessage());
            }
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
            hashMap.put("response", jSONObject.toString());
            this.f504795d.mo120776xd218dbca(hashMap, null);
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "cdnCallback upload video done. now upload");
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e c4535xa2a5d19e = hVar.f323316r;
        if (c4535xa2a5d19e != null && c4535xa2a5d19e.m39746x2982308b() && hVar.f323316r.m39729xfb7d6f47().m38126xd3dc8945()) {
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 m38120x14030901 = hVar.f323316r.m39729xfb7d6f47().m38120x14030901();
            if (m38120x14030901.m38481x24dcf3d7() == com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4473x44c202ec.CIPHER_METHOD_SM4CBC) {
                tz2.t.f504859b = true;
                m38120x14030901.m38480xb5884f29();
                tz2.t.f504860c = m38120x14030901.m38479x5db1b23();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "use sm4 for video");
            }
        }
        j72.c cVar = new j72.c(this.I, this.f218713J, this.K, hVar.f69522xf9dbbe9c, hVar.f69502xf11df5f5, this.f504796e, this.L, this.F, null, this.M, 2, this.f504798g, this.C, this.B, this.Z);
        gm0.j1.d().a(2726, this);
        gm0.j1.d().g(cVar);
        vz2.c.j("reqVerify");
        vz2.c.c().f137743l = java.lang.System.currentTimeMillis() - this.P;
        return 0;
    }

    @Override // tz2.e, tz2.u
    /* renamed from: release */
    public void mo63481x41012807() {
        super.mo63481x41012807();
        gm0.j1.d().q(2696, this);
        gm0.j1.d().q(2726, this);
        k72.v vVar = this.Z;
        if (vVar != null) {
            android.hardware.SensorManager sensorManager = vVar.f386302d;
            if (sensorManager != null) {
                sensorManager.unregisterListener(vVar);
            }
            this.Z = null;
        }
    }

    public final void s(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
        int i17 = 1;
        cronetRequestParams.f18181xe78dee5f = 1;
        cronetRequestParams.url = "https://payapp.wechatpay.cn/faceplat/getfacecheckresult";
        cronetRequestParams.f18174xbfc5d0e1 = "POST";
        this.S = java.lang.System.currentTimeMillis();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("user-agent", ik1.l0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "", (ik1.k0) nd.f.a(ik1.k0.class)));
        hashMap.put("Accept-Encoding", "gzip,compress,br,deflate");
        hashMap.put("charset", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        cronetRequestParams.m37968xeb7416ae(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f504796e));
        hashMap2.put("package", this.F);
        hashMap2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54530xa4e1ea94, 2);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("is_vpn", ((pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class))).Ai());
            jSONObject.put("is_adb_enable", wo.w0.a() ? 1 : 0);
            jSONObject.put("is_development_setting_enable", wo.w0.b() ? 1 : 0);
            jSONObject.put("is_voip", ((pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class))).Bi() ? 1 : 0);
            if (!((pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class))).wi()) {
                i17 = 0;
            }
            jSONObject.put("is_screenshare", i17);
            jSONObject.put("oaid", wo.w0.n());
            jSONObject.put("screenbrightness", ((pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class))).Ni());
            jSONObject.put("deviceuuid", wo.w0.k());
            jSONObject.put("client_secinfo", k72.b.f386237a.b());
            hashMap2.put("sec_report", jSONObject);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            r45.mi miVar = new r45.mi();
            byte[] a17 = tz2.s.a(java.lang.String.valueOf(this.f504798g), tz2.s.e(java.lang.String.valueOf(this.f504798g), this.f504799h, "", "", 3, jSONObject2).toString());
            miVar.f462066e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(a17);
            miVar.f462065d = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(tz2.s.b(java.lang.String.valueOf(this.f504798g), a17, false));
            hashMap2.put("face_data", android.util.Base64.encodeToString(com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121941x2b87a22d(miVar.mo14344x5f01b1f6(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h("0479ad513f73e3d5b295e039835ffc37269b31349427b258b5d8a770845fb048f878a78b3b8e81e7bd769a6c4d677817f4b916f8152995771641168a13df496507")), 2));
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckResult use http, face_data JSON error!");
        }
        hashMap2.put("bio_id", java.lang.Long.valueOf(this.f504798g));
        cronetRequestParams.f18159x6574fc6c = new org.json.JSONObject(hashMap2).toString().getBytes();
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37962x5ffa1e0c = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37962x5ffa1e0c(cronetRequestParams, new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.p0(this));
        this.W = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.r0(this, m37962x5ffa1e0c);
        if (m37962x5ffa1e0c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckResult use http request, CronetHttpsCreateResult is null!");
            r(90007, i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81510x7bb3b721), "cgi failed");
        } else if (m37962x5ffa1e0c.f18157x23aa2e05 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckResult use http request, CronetLogic startCronetHttpTask fail!");
            r(90007, i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81510x7bb3b721), "cgi failed");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckResult use http request, CronetLogic startCronetHttpTask success!");
            ((ku5.t0) ku5.t0.f394148d).k(this.W, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d);
        }
    }
}
