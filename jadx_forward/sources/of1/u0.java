package of1;

/* loaded from: classes8.dex */
public final class u0 extends of1.m2 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f426545h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f426546i;

    public u0(of1.v0 v0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59) {
        this.f426545h = v0Var;
        this.f426546i = c22633x83752a59;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public java.lang.String Ni() {
        return this.f426545h.E;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void W1(java.lang.String str) {
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
        ((ku5.t0) ku5.t0.f394148d).B(new of1.t0(this.f426545h, P, str));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public boolean aj(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        ((ku5.t0) ku5.t0.f394148d).B(new of1.s0(this.f426545h, str, str2, bundle, z17));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /* renamed from: callback */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo70207xf5bc2045(int r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: of1.u0.mo70207xf5bc2045(int, android.os.Bundle):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /* renamed from: getCurrentUrl */
    public java.lang.String mo70208xad58292c() {
        return this.f426545h.Z();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public android.os.Bundle i(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07;
        java.lang.String string;
        java.lang.String string2;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("key_webview_container_env", "miniProgram");
        of1.v0 v0Var = this.f426545h;
        if (i17 == 18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = v0Var.W1;
            if (oVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                throw null;
            }
            android.app.Activity a17 = q75.a.a(((of1.w1) oVar).m151218x3af91936());
            if (a17 == null) {
                java.lang.String D1 = v0Var.D1();
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = v0Var.Y();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar2 = v0Var.W1;
                if (oVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                    throw null;
                }
                objArr[1] = java.lang.Integer.valueOf(oVar2.hashCode());
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar3 = v0Var.W1;
                if (oVar3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                    throw null;
                }
                objArr[2] = ((of1.w1) oVar3).mo51534x86b9ebe3().mo120156xb5887639();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(D1, "AC_GET_PUBLISHER_ID invalid context(%s) hash(%d) url(%s)", objArr);
                return bundle2;
            }
            android.content.Intent intent = a17.getIntent();
            bundle2.putString("KPublisherId", intent != null ? intent.getStringExtra("KPublisherId") : null);
            java.lang.String valueOf = java.lang.String.valueOf(v0Var.O().f264923j);
            if (valueOf == null) {
                valueOf = "";
            }
            bundle2.putString("KPublisherReqId", valueOf);
            bundle2.putString("serverMsgID", v0Var.O().A.toString());
            bundle2.putString("geta8key_username", v0Var.O().f264919f);
            android.content.Intent intent2 = a17.getIntent();
            bundle2.putString("sns_local_id", intent2 != null ? intent2.getStringExtra("sns_local_id") : null);
            bundle2.putInt("getA8KeyScene", v0Var.f263451b.f554286f);
            bundle2.putString("url", v0Var.Z());
            ft.f4 f4Var = (ft.f4) i95.n0.c(ft.f4.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar4 = v0Var.W1;
            if (oVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 m151232xaf156f4a = ((of1.w1) oVar4).m151232xaf156f4a();
            ((et.s) f4Var).getClass();
            if (m151232xaf156f4a != null) {
                bundle2.putString("wxappPathWithQuery", m151232xaf156f4a.Y1());
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = m151232xaf156f4a.mo32091x9a3f0ba2();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = mo32091x9a3f0ba2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) mo32091x9a3f0ba2 : null;
                java.lang.String str = (o6Var == null || (u07 = o6Var.u0()) == null) ? null : u07.f128809v;
                java.lang.String str2 = str != null ? str : "";
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba22 = m151232xaf156f4a.mo32091x9a3f0ba2();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = mo32091x9a3f0ba22 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) mo32091x9a3f0ba22 : null;
                int g27 = o6Var2 != null ? o6Var2.g2() : 0;
                bundle2.putString("wxappSessionId", str2);
                bundle2.putInt("wxappScene", g27);
            }
        } else if (i17 == 87) {
            boolean z17 = v0Var.F0;
            java.lang.String str3 = v0Var.f426559e2;
            java.util.Map map = v0Var.S;
            if (z17) {
                bundle2.putString("result", "not_return");
            } else {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                bundle2.putString("full_url", str3 == null ? "" : str3);
                if (map != null) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) map;
                    if (!concurrentHashMap.isEmpty()) {
                        bundle2.putInt("set_cookie", 1);
                        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                            java.lang.String str4 = (java.lang.String) entry.getKey();
                            java.lang.String str5 = (java.lang.String) entry.getValue();
                            com.p314xaae8f345.p3210x3857dc.d.g().b(str3 == null ? "" : str3, str4 + '=' + str5);
                        }
                        com.p314xaae8f345.p3210x3857dc.d.g().mo120241x5d03b04();
                        java.lang.String D12 = v0Var.D1();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[0] = com.p314xaae8f345.p3210x3857dc.d.g().a(str3 != null ? str3 : "");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(D12, "cookies:%s", objArr2);
                    }
                }
                bundle2.putInt("set_cookie", 0);
            }
        } else {
            if (i17 == 99) {
                bundle2.putInt("geta8key_scene", v0Var.Q());
                return bundle2;
            }
            if (i17 == 101) {
                if (bundle == null) {
                    return bundle2;
                }
                bundle.setClassLoader(of1.v0.class.getClassLoader());
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar5 = v0Var.W1;
                if (oVar5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                    throw null;
                }
                android.content.Context a18 = q75.a.a(((of1.w1) oVar5).m151218x3af91936());
                android.content.Intent intent3 = new android.content.Intent();
                android.os.Bundle bundle3 = bundle.getBundle("open_ui_with_webview_ui_extras");
                if (bundle3 == null) {
                    bundle3 = android.os.Bundle.EMPTY;
                }
                android.content.Intent putExtras = intent3.putExtras(bundle3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtras, "putExtras(...)");
                if (a18 == null) {
                    a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    putExtras.addFlags(268435456);
                }
                java.lang.String string3 = bundle.getString("open_ui_with_webview_ui_plugin_name");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
                java.lang.String string4 = bundle.getString("open_ui_with_webview_ui_plugin_entry");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string4);
                if (r26.i0.n(string4, ".BaseScanUI", false) && (a18 instanceof android.app.Activity)) {
                    of1.r0 r0Var = of1.r0.f426529a;
                    nf.g.a(a18).f(r0Var);
                    j45.l.n(a18, string3, string4, putExtras, cf.b.a(r0Var));
                } else {
                    j45.l.j(a18, string3, string4, putExtras, null);
                }
            } else if (i17 == 145) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar6 = v0Var.W1;
                if (oVar6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                    throw null;
                }
                bundle2.putStringArray("key_webview_apbrand_jsapi_report_args", ((of1.w1) oVar6).m151228x788f70ec());
            } else {
                if (i17 == 302) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar7 = v0Var.W1;
                    if (oVar7 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                        throw null;
                    }
                    android.app.Activity a19 = q75.a.a(((of1.w1) oVar7).m151218x3af91936());
                    if (a19 != null) {
                        bundle2.putParcelable("delegate", com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41.a(a19));
                        return bundle2;
                    }
                    java.lang.String D13 = v0Var.D1();
                    java.lang.Object[] objArr3 = new java.lang.Object[3];
                    objArr3[0] = v0Var.Y();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar8 = v0Var.W1;
                    if (oVar8 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                        throw null;
                    }
                    objArr3[1] = java.lang.Integer.valueOf(oVar8.hashCode());
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar9 = v0Var.W1;
                    if (oVar9 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                        throw null;
                    }
                    objArr3[2] = ((of1.w1) oVar9).mo51534x86b9ebe3().mo120156xb5887639();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(D13, "AC_GET_OPEN_WEAPP_ACTIVITY_IPC_DELEGATE invalid context(%s) hash(%d) url(%s)", objArr3);
                    return bundle2;
                }
                if (i17 == 1020) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d O = v0Var.O();
                    bundle2.putInt("key_get_a8key_req_params_req_id", O.f264923j);
                    bundle2.putString("key_get_a8key_req_params_msg_id", O.A);
                    bundle2.putString("key_get_a8key_req_params_username", O.f264919f);
                    bundle2.putString("key_get_a8key_req_params_msg_username", O.f264935v);
                    return bundle2;
                }
                if (i17 != 4008) {
                    if (i17 == 90001) {
                        java.lang.String a27 = com.p314xaae8f345.p3210x3857dc.d.g().a(mo70208xad58292c());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v0Var.D1(), "AC_GET_CURRENT_COOKIE, url:" + mo70208xad58292c() + ", cookie:" + a27);
                        bundle2.putString("cookie", a27);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f426546i;
                        bundle2.putFloat("density", c22633x83752a59.m81401x1f106092());
                        bundle2.putInt("topOffset", pm0.v.s(c22633x83752a59)[1]);
                        if (bundle != null && (string = bundle.getString("currentPicUrl")) != null) {
                            bundle2.putString("currentUrlPath", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.x0.d(string));
                        }
                        return bundle2;
                    }
                    if (i17 == 121004) {
                        v0Var.f426556b2.e(bundle != null ? bundle.getBoolean("key_on_secure_video_action_is_live", false) : false);
                    } else if (i17 != 139) {
                        if (i17 == 140) {
                            bundle2.putInt("key_webview_preverify_info_scene", 1);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar10 = v0Var.W1;
                            if (oVar10 != null) {
                                bundle2.putString("key_webview_preverify_info_source_appid", ((of1.w1) oVar10).m151219x74292566());
                                return bundle2;
                            }
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                            throw null;
                        }
                        switch (i17) {
                        }
                    } else {
                        if (bundle == null || (string2 = bundle.getString("info")) == null) {
                            return bundle2;
                        }
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(string2);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar11 = v0Var.W1;
                            if (oVar11 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                                throw null;
                            }
                            ((of1.w1) oVar11).F(jSONObject);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5159xfddea0d4 c5159xfddea0d4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5159xfddea0d4();
                android.content.Context Y = v0Var.Y();
                am.o oVar12 = c5159xfddea0d4.f135508g;
                oVar12.f89027b = Y;
                oVar12.f89026a = i17;
                if (4003 == i17) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bundle);
                    oVar12.f89028c = bundle.getString("apdu");
                } else if (4004 == i17) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bundle);
                    java.lang.String string5 = bundle.getString("apdus");
                    boolean z19 = bundle.getBoolean("breakIfFail", true);
                    boolean z27 = bundle.getBoolean("breakIfTrue", false);
                    oVar12.f89028c = string5;
                    oVar12.f89029d = z19;
                    oVar12.f89030e = z27;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.w.a(c5159xfddea0d4);
                android.os.Bundle bundle4 = c5159xfddea0d4.f135509h.f89121a;
                if (bundle4 != null) {
                    bundle2.putAll(bundle4);
                }
            }
        }
        return bundle2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void t3(java.lang.String str, java.lang.String str2, int i17, int i18) {
        of1.m mVar = this.f426545h.X1;
        if (mVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewScanHelper");
            throw null;
        }
        hy4.s sVar = mVar.f426504r;
        if (sVar == null || str == null || !str.equals(sVar.f367729c)) {
            return;
        }
        boolean o17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(mVar.b());
        kd0.l2 l2Var = (kd0.l2) i95.n0.c(kd0.l2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = mVar.f426413d;
        of1.w1 w1Var = (of1.w1) oVar;
        boolean q27 = w1Var.f426566d.q2();
        ((jd0.z1) l2Var).getClass();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.c(i17, str2, o17, q27)) {
            ((et.s) ((ft.f4) i95.n0.c(ft.f4.class))).wi(w1Var.m151232xaf156f4a(), false, i17, str2, true, false, mVar.b());
            mVar.f426499m = null;
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            mVar.f426503q = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
        }
        hy4.s sVar2 = mVar.f426504r;
        if (sVar2 != null) {
            sVar2.b();
        }
        mVar.f426501o = i17;
        mVar.f426502p = i18;
        if (str2 == null || mVar.f426497h == null) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.HTMLViewScanHelper", "processGetWXACodeNickName mResultOfImageUrl nil");
        } else {
            kd0.l2 l2Var2 = (kd0.l2) i95.n0.c(kd0.l2.class);
            int i19 = mVar.f426501o;
            ((jd0.z1) l2Var2).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.e(i19, str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLViewScanHelper", "processGetWXACodeNickName");
                kd0.p2 p2Var = mVar.f426505s;
                int i27 = mVar.f426501o;
                java.lang.String b17 = mVar.b();
                kd0.f2 f2Var = new kd0.f2(str2);
                f2Var.f388168b = 4;
                f2Var.f388169c = b17;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var).i(i27, f2Var);
            }
        }
        mVar.f426499m = str2;
        com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var = mVar.f426497h;
        if (s6Var == null || !s6Var.f292254e.i()) {
            return;
        }
        ((of1.w1) oVar).f426567e.P0(new of1.e(mVar));
    }
}
