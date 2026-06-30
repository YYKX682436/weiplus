package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class a extends tz2.e {
    public java.lang.String F;
    public java.lang.String G;
    public byte[] I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f218646J;
    public java.lang.String K;
    public float L;
    public java.lang.String M;
    public final java.lang.String P;
    public final java.lang.String Q;
    public java.lang.String R;
    public int S;
    public long T;
    public k72.v U;
    public java.lang.String H = "";
    public boolean N = false;

    public a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.r.f218782a;
        sb6.append(str);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(".mp4");
        this.P = sb6.toString();
        this.Q = str + android.os.SystemClock.elapsedRealtime() + "_encrypt";
        this.R = "";
        this.S = 0;
        this.T = 0L;
    }

    @Override // tz2.e, tz2.u
    public void a(android.widget.TextView textView, java.lang.String str) {
        boolean z17;
        try {
            if (java.lang.System.currentTimeMillis() - this.f504807s >= 1000) {
                this.f504807s = java.lang.System.currentTimeMillis();
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                java.lang.String c17 = wz2.a.c(textView.getContext(), str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionManager", "updateTipText res:%s tip:%s", str, c17);
                if (android.text.TextUtils.isEmpty(c17)) {
                    return;
                }
                textView.setText(c17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // tz2.e, tz2.u
    public void b(android.widget.TextView textView) {
        textView.setText(this.R);
    }

    @Override // tz2.e, tz2.u
    public void c(android.content.Intent intent, android.app.Activity activity) {
        super.c(intent, activity);
        this.f504796e = intent.getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        this.F = intent.getStringExtra("package");
        this.G = intent.getStringExtra("packageSign");
        this.N = intent.getBooleanExtra("needContract", false);
        this.H = intent.getStringExtra("otherVerifyTitle");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionManager", "[%s]intent data, packageName:%s packageSign:%s needSignContract:%s otherVerifyTitle:%s", com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.a.class.getSimpleName(), this.F, this.G, java.lang.Boolean.valueOf(this.N), this.H);
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean d17 = j35.u.d(activity, "android.permission.ACCESS_FINE_LOCATION", false);
        if (d17) {
            if (this.f504814z == null) {
                ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                this.f504814z = i11.h.e();
            }
            if (this.A == null) {
                this.A = new tz2.d(this);
            }
            ((i11.h) this.f504814z).l(this.A, true, false, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "startGetLocation checkLocation: %s and ignore", java.lang.Boolean.valueOf(d17));
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_spam_report, false)) {
            k72.v vVar = new k72.v();
            this.U = vVar;
            vVar.a();
        }
    }

    @Override // tz2.e
    public int e() {
        return 16;
    }

    @Override // tz2.e, tz2.u
    /* renamed from: onNetworkRequestEvent */
    public void mo63480x2ed2023a(java.lang.String str, java.lang.String str2, java.util.HashMap hashMap, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        java.lang.String str3 = this.Q;
        java.lang.String str4 = this.P;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionManager", "onNetworkRequestEvent  url:%s requestContent:%s requestHeaders:%s", str, str2, hashMap);
        this.f504795d = iYtSDKKitNetResponseParser;
        if (str.contains("wechat_face_config")) {
            vz2.c.j("reqCfg");
            i();
            vz2.b.d(16);
            j72.a aVar = new j72.a(this.f504796e, this.F, this.G);
            gm0.j1.d().a(2696, this);
            gm0.j1.d().g(aVar);
            return;
        }
        if (str.contains("wechat_face_verify")) {
            try {
                l();
                vz2.b.e(16);
                java.lang.String optString = new org.json.JSONObject(str2).optString("action_video");
                com.p314xaae8f345.mm.vfs.w6.h(str4);
                com.p314xaae8f345.mm.vfs.w6.h(str3);
                com.p314xaae8f345.mm.vfs.w6.R(str4, android.util.Base64.decode(optString, 0));
                p(str4);
                q(this.f218646J, str4, str3);
                com.p314xaae8f345.mm.vfs.w6.h(str4);
                o(str3, false);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e17, "action parse verify body error!!!", new java.lang.Object[0]);
            }
        }
    }

    @Override // tz2.e, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionManager", "onSceneEnd：errType %s ， errCode %s ，errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (!(m1Var instanceof j72.a)) {
            if (m1Var instanceof j72.c) {
                gm0.j1.d().q(2726, this);
                r45.mf3 mf3Var = ((j72.c) m1Var).f379577g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionManager", "scene is getFaceCheckResult get face check result, ret_code: %s, ret_msg: %s serialId:%s retry:%s", java.lang.Integer.valueOf(mf3Var.f461974d), mf3Var.f461975e, mf3Var.f461978h, java.lang.Integer.valueOf(mf3Var.f461977g));
                vz2.c.k("rspVerify", java.lang.Integer.valueOf(mf3Var.f461974d));
                vz2.c.c().f137741j = mf3Var.f461974d;
                java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("countFace", this.S);
                    jSONObject.put("err_code", mf3Var.f461974d);
                    if (i17 == 0 && i18 == 0) {
                        vz2.b.c(16);
                        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, mf3Var.f461974d);
                        jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, mf3Var.f461974d);
                        jSONObject.put("errormsg", mf3Var.f461975e);
                        jSONObject.put("err_msg", "ok");
                        jSONObject.put("token", mf3Var.f461976f);
                        jSONObject.put("serial_id", mf3Var.f461978h);
                        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f504796e);
                        if (mf3Var.f461974d != 0) {
                            jSONObject.put("err_retry", mf3Var.f461977g);
                            jSONObject.put("err_tip", mf3Var.f461975e);
                            jSONObject.put("err_msg", "fail");
                            jSONObject.put("otherVerifyTitle", this.H);
                        }
                    } else {
                        vz2.c.c().f137750s = 4;
                        vz2.b.a(16);
                        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, i18);
                        jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, i18);
                        jSONObject.put("errormsg", mf3Var.f461975e);
                        jSONObject.put("otherVerifyTitle", this.H);
                        jSONObject.put("err_code", i18);
                        jSONObject.put("err_retry", mf3Var.f461977g);
                        jSONObject.put("err_msg", "fail");
                    }
                } catch (org.json.JSONException unused) {
                }
                hashMap.put("response", jSONObject.toString());
                this.f504795d.mo120776xd218dbca(hashMap, null);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionManager", "scene is getFaceCheckActionerrType");
        vz2.c.k("rspCfg", java.lang.Integer.valueOf(i18));
        this.S++;
        gm0.j1.d().q(2696, this);
        j72.a aVar = (j72.a) m1Var;
        vz2.c.c().f137739h = i18;
        this.T = java.lang.System.currentTimeMillis();
        if (i17 != 0 || i18 != 0) {
            vz2.c.c().f137750s = 3;
            r(i18, str, "get action data error 3");
            return;
        }
        r45.if3 if3Var = aVar.f379570f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionManager", "[cgi-ret]NetSceneGetFaceCheckAction, ret_code: %s, ret_msg: %s, action_data: %s, reduction_ratio: %s, take_message: %s", java.lang.Integer.valueOf(if3Var.f458517d), if3Var.f458518e, if3Var.f458520g, java.lang.Float.valueOf(if3Var.f458521h), if3Var.f458522i);
        int i27 = if3Var.f458517d;
        if (i27 != 0) {
            r(i27, if3Var.f458518e, "get action data error 2");
            return;
        }
        java.lang.String str2 = if3Var.f458519f;
        this.f218646J = str2;
        java.lang.String str3 = if3Var.f458520g;
        this.K = str3;
        float f17 = if3Var.f458521h;
        this.L = f17;
        this.M = if3Var.f458522i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionManager", "[cgi-ret]NetSceneGetFaceCheckAction personId:%s actionData:%s reductionRatio:%s", str2, str3, java.lang.Float.valueOf(f17));
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.K, -1);
        if (P == 1 || P == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionManager", "user check blink eye");
            this.R = i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.c67);
            i19 = 1;
        } else if (P != 5) {
            i19 = -1;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionManager", "user check open month");
            this.R = i65.a.r(this.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.c68);
            i19 = 2;
        }
        if (i19 == -1) {
            r(-1, "", "get action data error 1");
            return;
        }
        java.lang.String str4 = i19 + "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionManager", "packageSuccessResult1");
        java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, 0);
            jSONObject2.put("errormsg", "OK");
            jSONObject2.put("type", 1);
            jSONObject2.put("action_data", str4);
            hashMap2.put("response", jSONObject2.toString());
        } catch (org.json.JSONException unused2) {
        }
        this.f504795d.mo120776xd218dbca(hashMap2, null);
    }

    public final void p(java.lang.String str) {
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionManager", "MD5ForSignatureString：%s", p17);
        byte[] bytes = p17.getBytes();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        if (fo3.s.INSTANCE.f4(1, bytes, 0, bytes.length, c19764x527bffc1)) {
            this.I = c19764x527bffc1.f38861x6ac9171;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionManager", "digitalSignature failed");
            this.I = bytes;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "AES"
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r7 = com.p314xaae8f345.mm.vfs.z7.a(r7)
            r1.<init>(r7)
            com.tencent.mm.vfs.r6 r7 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r8 = com.p314xaae8f345.mm.vfs.z7.a(r8)
            r7.<init>(r8)
            boolean r8 = r1.m()
            if (r8 == 0) goto Lbd
            boolean r8 = r1.A()
            if (r8 == 0) goto Lbd
            com.tencent.mm.vfs.r6 r8 = r7.s()
            boolean r8 = r8.m()
            if (r8 != 0) goto L31
            com.tencent.mm.vfs.r6 r8 = r7.s()
            r8.J()
        L31:
            r7.k()
            r8 = 0
            java.io.InputStream r1 = com.p314xaae8f345.mm.vfs.w6.C(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La6
            java.io.OutputStream r7 = com.p314xaae8f345.mm.vfs.w6.H(r7)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9b
            java.lang.String r2 = "UTF-8"
            byte[] r2 = r6.getBytes(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            byte[] r2 = r3.getEncoded()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            java.lang.String r0 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r6 = 1
            r0.init(r6, r3, r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            javax.crypto.CipherInputStream r6 = new javax.crypto.CipherInputStream     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r6.<init>(r1, r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lac
        L6d:
            int r0 = r6.read(r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lac
            r2 = -1
            if (r0 == r2) goto L7c
            r2 = 0
            r7.write(r8, r2, r0)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lac
            r7.flush()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lac
            goto L6d
        L7c:
            if (r7 == 0) goto L81
            r7.close()
        L81:
            r6.close()
            if (r1 == 0) goto Lbd
            r1.close()
            goto Lbd
        L8a:
            r8 = move-exception
            goto Lab
        L8c:
            r6 = move-exception
            r4 = r8
            r8 = r6
            r6 = r4
            goto Lad
        L91:
            r6 = move-exception
            r4 = r8
            r8 = r6
            r6 = r4
            goto Lab
        L96:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            goto Lad
        L9b:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            goto Lab
        La0:
            r6 = move-exception
            r7 = r8
            r1 = r7
            r8 = r6
            r6 = r1
            goto Lad
        La6:
            r6 = move-exception
            r7 = r8
            r1 = r7
            r8 = r6
            r6 = r1
        Lab:
            throw r8     // Catch: java.lang.Throwable -> Lac
        Lac:
            r8 = move-exception
        Lad:
            if (r7 == 0) goto Lb2
            r7.close()
        Lb2:
            if (r6 == 0) goto Lb7
            r6.close()
        Lb7:
            if (r1 == 0) goto Lbc
            r1.close()
        Lbc:
            throw r8
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.a.q(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void r(int i17, java.lang.String str, java.lang.String str2) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, i17);
            jSONObject.put("errormsg", str);
            jSONObject.put("err_code", i17);
            jSONObject.put("err_feedback", this.f504803o);
            jSONObject.put("otherVerifyTitle", this.H);
        } catch (org.json.JSONException unused) {
        }
        hashMap.put("response", jSONObject.toString());
        this.f504795d.mo120776xd218dbca(hashMap, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerError", str2);
    }

    @Override // tz2.e, dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionManager", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
        int i18 = hVar == null ? -1 : hVar.f69553xb5f54fe9;
        vz2.c.k("rspCdn", java.lang.Integer.valueOf(i18));
        vz2.c.c().f137740i = i18;
        vz2.c.c().f137742k = java.lang.System.currentTimeMillis() - this.f504811w;
        java.lang.String str2 = this.Q;
        if (hVar != null && hVar.f69553xb5f54fe9 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionManager", "hy: upload video done. now upload");
            com.p314xaae8f345.mm.vfs.w6.h(str2);
            vz2.c.j("reqVerify");
            j72.c cVar = new j72.c(this.f218646J, this.K, this.L, hVar.f69522xf9dbbe9c, hVar.f69502xf11df5f5, this.f504796e, this.M, this.F, this.I, this.N, 1, 0L, this.C, this.B, this.U);
            gm0.j1.d().a(2726, this);
            gm0.j1.d().g(cVar);
            vz2.c.c().f137743l = java.lang.System.currentTimeMillis() - this.T;
        } else {
            if (hVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceFlashActionManager", "hy: upload video cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                com.p314xaae8f345.mm.vfs.w6.h(str2);
                return 0;
            }
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceFlashActionManager", "hy: upload video start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                vz2.c.c().f137750s = 5;
            }
        }
        return 0;
    }

    @Override // tz2.e, tz2.u
    /* renamed from: release */
    public void mo63481x41012807() {
        super.mo63481x41012807();
        gm0.j1.d().q(2696, this);
        gm0.j1.d().q(2726, this);
        com.p314xaae8f345.mm.vfs.w6.h(this.P);
        com.p314xaae8f345.mm.vfs.w6.h(this.Q);
        k72.v vVar = this.U;
        if (vVar != null) {
            android.hardware.SensorManager sensorManager = vVar.f386302d;
            if (sensorManager != null) {
                sensorManager.unregisterListener(vVar);
            }
            this.U = null;
        }
    }
}
