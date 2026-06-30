package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes8.dex */
public class s extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e f265099d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e) {
        this.f265099d = serviceC19302xd3c5b06e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void A5(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "removeCallback, id = %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e = this.f265099d;
        java.util.Iterator it = ((java.util.ArrayList) serviceC19302xd3c5b06e.f265019i).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x1603547 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next();
            if (c19336x1603547.f265329e == i17) {
                it.remove();
            } else if (!com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.b(serviceC19302xd3c5b06e, c19336x1603547)) {
                it.remove();
            }
        }
        serviceC19302xd3c5b06e.f265014d.remove(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void D8(java.lang.String str, int[] iArr, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e = this.f265099d;
        if (serviceC19302xd3c5b06e.f265016f == null) {
            serviceC19302xd3c5b06e.f265016f = new java.util.HashMap();
            serviceC19302xd3c5b06e.f265017g.mo48813x58998cd();
            serviceC19302xd3c5b06e.f265018h.mo48813x58998cd();
        }
        c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
        c17.i("key_basescanui_screen_position", java.lang.Boolean.TRUE);
        c17.i("key_basescanui_screen_x", java.lang.Float.valueOf(i17));
        c17.i("key_basescanui_screen_y", java.lang.Float.valueOf(i18));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184 c5884x4c2d9184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184();
        am.aq aqVar = c5884x4c2d9184.f136192g;
        aqVar.f87708b = str;
        aqVar.f87707a = java.lang.System.currentTimeMillis();
        aqVar.f87712f = 2;
        if (iArr != null && iArr.length > 0) {
            aqVar.f87710d = new java.util.HashSet();
            for (int i19 : iArr) {
                aqVar.f87710d.add(java.lang.Integer.valueOf(i19));
            }
        }
        c5884x4c2d9184.e();
        serviceC19302xd3c5b06e.f265016f.put(str, 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void Dd(java.lang.String str) {
        boolean a17 = gm0.j1.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "triggerGetContact, accHasReady = " + a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.y(this, 1000L, null, str);
        if (a17) {
            yVar.a(null);
        } else {
            yVar.a(this.f265099d.f265021n);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public boolean F4(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p957x53236a1b.k0 k0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "doScene, type = %d", java.lang.Integer.valueOf(i17));
        if (i17 != 233) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e = this.f265099d;
            if (i17 == 666) {
                if (!gm0.j1.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                    return false;
                }
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.B;
                serviceC19302xd3c5b06e.getClass();
                java.lang.String string = bundle.getString("emoji_store_jump_url");
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o5.class))).getClass();
                f11.k kVar = new f11.k(string);
                kVar.f340099f = java.lang.Integer.valueOf(bundle.getInt("webview_binder_id"));
                return gm0.j1.d().h(kVar, 0);
            }
            if (i17 == 673) {
                if (!gm0.j1.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f1 f1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f1(bundle.getString("reading_mode_data_url"), bundle.getString("reading_mode_data_useragent"), bundle.getInt("reading_mode_data_width"), bundle.getInt("reading_mode_data_height"));
                f1Var.f264405f = java.lang.Integer.valueOf(bundle.getInt("webview_binder_id"));
                return gm0.j1.d().h(f1Var, 0);
            }
            if (i17 == 1295) {
                if (!gm0.j1.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                    return false;
                }
                if (bundle != null) {
                    java.lang.String string2 = bundle.getString("ad_report_data_str");
                    if (i95.n0.c(p94.c0.class) != null) {
                        ((n34.c) ((p94.c0) i95.n0.c(p94.c0.class))).wi(13791, string2, (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                        return true;
                    }
                }
                return false;
            }
            if (i17 != 2836) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "doScene fail, invalid type = %d", java.lang.Integer.valueOf(i17));
                return false;
            }
            if (!gm0.j1.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                return false;
            }
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.B;
            serviceC19302xd3c5b06e.getClass();
            java.lang.String string3 = bundle.getString("service_click_tid");
            long j17 = bundle.getLong("service_click_stime", 0L);
            long j18 = bundle.getLong("service_click_etime", 0L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "doServiceClick tid = %s, stime = %d, etime = %d", string3, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            if (string3 == null || string3.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "doServiceClick fail, tid is null");
                return false;
            }
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.m06();
            lVar.f152198b = new r45.n06();
            lVar.f152199c = "/cgi-bin/mmoc-bin/ad/service_click";
            lVar.f152200d = 2836;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            r45.m06 m06Var = (r45.m06) a17.f152243a.f152217a;
            m06Var.f461582d = string3;
            m06Var.f461583e = j17;
            m06Var.f461584f = j18;
            com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.j0(serviceC19302xd3c5b06e), false);
            return true;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
            return false;
        }
        java.lang.String string4 = bundle.getString("geta8key_data_req_url");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bundle.getString("k_share_url"))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.c6.a(string4, bundle.getString("k_share_url"));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4)) {
            w60.j jVar = (w60.j) i95.n0.c(w60.j.class);
            java.lang.String string5 = bundle.getString("geta8key_data_appid");
            java.lang.String string6 = bundle.getString("geta8key_data_scope");
            java.lang.String string7 = bundle.getString("geta8key_data_state");
            int i27 = bundle.getInt("geta8key_session_id", 0);
            ((v60.u) jVar).getClass();
            k0Var = new com.p314xaae8f345.mm.p957x53236a1b.k0(string5, string6, string7, i27);
        } else {
            w60.j jVar2 = (w60.j) i95.n0.c(w60.j.class);
            java.lang.String string8 = bundle.getString("geta8key_data_username");
            int i28 = bundle.getInt("geta8key_data_scene");
            int i29 = bundle.getInt("geta8key_data_reason");
            int i37 = bundle.getInt("geta8key_data_flag");
            java.lang.String string9 = bundle.getString("geta8key_data_net_type");
            int i38 = bundle.getInt("geta8key_session_id", 0);
            java.lang.String string10 = bundle.getString("geta8key_data_appid");
            java.lang.String string11 = bundle.getString("key_function_id");
            int i39 = bundle.getInt("key_wallet_region", 0);
            byte[] byteArray = bundle.getByteArray("k_a8key_cookie");
            ((v60.u) jVar2).getClass();
            com.p314xaae8f345.mm.p957x53236a1b.k0 k0Var2 = new com.p314xaae8f345.mm.p957x53236a1b.k0(string4, i29);
            r45.r83 r83Var = (r45.r83) k0Var2.f152889e.f152243a.f152217a;
            r83Var.f466143d = 2;
            r45.du5 du5Var = new r45.du5();
            du5Var.f454289d = string4;
            du5Var.f454290e = true;
            r83Var.f466148i = du5Var;
            r83Var.f466151o = i28;
            r83Var.f466152p = string8;
            r83Var.f466155s = i29;
            r83Var.f466157u = i37;
            r83Var.f466158v = string9;
            r83Var.f466161y = i38;
            r83Var.f466162z = string11;
            r83Var.A = i39;
            r45.du5 du5Var2 = new r45.du5();
            du5Var2.f454289d = string10;
            du5Var2.f454290e = true;
            r83Var.f466145f = du5Var2;
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(byteArray);
            r83Var.B = cu5Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetA8Key", "get a8key reqUrl = %s, username = %s, scene = %d, reason = %d, flag = %d, netType = %s, requestId = %d, appId = %s, functionId = %s, wallentRegion = %d, a8KeyCookie = %s", string4, string8, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), string9, java.lang.Integer.valueOf(i38), string10, string11, java.lang.Integer.valueOf(i39), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(byteArray));
            k0Var = k0Var2;
        }
        k0Var.f152893i = java.lang.Integer.valueOf(bundle.getInt("webview_binder_id"));
        int i47 = bundle.getInt("geta8key_data_subscene", -1);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = k0Var.f152889e;
        if (i47 > 0) {
            ((r45.r83) oVar.f152243a.f152217a).D = i47;
        }
        java.lang.String string12 = bundle.getString("geta8key_outer_url");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string12)) {
            ((r45.r83) oVar.f152243a.f152217a).C = string12;
        }
        return gm0.j1.d().h(k0Var, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void Gd(java.lang.String str, int i17) {
        new android.os.Bundle().putInt("webview_binder_id", i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.a(this.f265099d, 5, null, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public java.lang.String Ge(java.lang.String str) {
        o25.z.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
        return "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public int J3() {
        return gm0.j1.b().h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public boolean Jg(java.lang.String str) {
        j45.l.g(str);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void M7(int i17) {
        android.os.Parcelable parcelable;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i17);
        a17.f266525u = true;
        java.util.Iterator it = ((java.util.ArrayList) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r8.f273414a).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8 q8Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "onWebViewUIPause, pause plugin = " + q8Var.mo74208xfb82e301());
            q8Var.b(this.f265099d);
        }
        android.os.Bundle bundle = a17.f266517o;
        if (bundle == null || (parcelable = bundle.getParcelable("KSnsAdTag")) == null || !(parcelable instanceof com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad)) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        ((com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad) parcelable).f153007o = android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public boolean Mb(java.lang.String str) {
        return c01.e2.J(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:54|(2:56|(2:58|59))|60|61|63|59|52) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0190, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "ExDeviceConnectDeviceEvent publish failed");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgHandler", r0, "", new java.lang.Object[0]);
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Md(int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.s.Md(int, boolean):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public java.lang.String O3(java.lang.String str) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.c6.b(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public java.lang.String R9(java.lang.String str) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        java.lang.String c17 = com.p314xaae8f345.mm.p943x351df9c2.g.c(str, false, false);
        if (!com.p314xaae8f345.mm.vfs.w6.j(c17)) {
            dw4.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v(this, str));
        }
        return c17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void Ri() {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        intent.setFlags(268435456);
        intent.putExtra("sns_userName", str);
        intent.addFlags(67108864);
        intent.putExtra("sns_adapter_type", 1);
        gm0.j1.u().c().w(68389, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(68389, null), 0) + 1));
        intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUserPagerUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e = this.f265099d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(serviceC19302xd3c5b06e, arrayList.toArray(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "gotoSnsUserUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        serviceC19302xd3c5b06e.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(serviceC19302xd3c5b06e, "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "gotoSnsUserUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public java.lang.String S1(java.lang.String str) {
        java.lang.String format;
        com.p314xaae8f345.mm.app.p622xc5476f33.n nVar = (com.p314xaae8f345.mm.app.p622xc5476f33.n) ((o25.x1) i95.n0.c(o25.x1.class));
        nVar.getClass();
        java.util.ArrayList b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b.b(this.f265099d, str);
        if (b17.size() == 0) {
            return str;
        }
        java.util.Collections.sort(b17, new com.p314xaae8f345.mm.app.p622xc5476f33.m(nVar));
        java.util.Iterator it = b17.iterator();
        java.lang.String str2 = str;
        while (it.hasNext()) {
            r35.m3 m3Var = (r35.m3) it.next();
            int i17 = m3Var.f450725a;
            int i18 = m3Var.f450726b;
            int i19 = m3Var.f450728d;
            java.lang.String str3 = i19 != 1 ? i19 != 24 ? i19 != 25 ? null : "<a href=\"%s@tel@\">%s</a>" : "<a href=\"%s@mailto@\">%s</a>" : "<a href=\"%s\">%s</a>";
            if (str3 != null) {
                java.lang.String e17 = m3Var.e();
                if (i19 != 1 || e17.startsWith("http://")) {
                    format = java.lang.String.format(str3, e17.trim(), e17.trim());
                } else {
                    format = java.lang.String.format(str3, "http://" + e17.trim(), e17.trim());
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(format) && i17 < i18) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    try {
                        sb6.append(str2.subSequence(0, i17 + 0));
                        sb6.append(format);
                        sb6.append(str2.subSequence(i18 + 0, str2.length()));
                        format.length();
                        str2 = sb6.toString();
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QrCodeURLHelper", e18.getMessage());
                        str2 = "";
                    }
                }
                if (str2.length() == 0) {
                    return str;
                }
            }
        }
        return str2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public int Sg(java.lang.String str) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.g(c5303xc75d2f73, 1, str);
        c5303xc75d2f73.e();
        return c5303xc75d2f73.f135624h.f87966a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public boolean T1(long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "hasBindNetworkDevice, msgid:" + j17);
        if (j17 == Long.MIN_VALUE && str2 == null) {
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
        am.b6 b6Var = c5348xb8e1a564.f135674g;
        if (j17 != Long.MIN_VALUE) {
            b6Var.f87752a = j17;
            b6Var.f87753b = str;
        }
        if (str2 != null) {
            b6Var.f87754c = str2;
        }
        c5348xb8e1a564.e();
        if (c5348xb8e1a564.f135675h.f87869a) {
            return true;
        }
        if (gm0.j1.a() && j17 != Long.MIN_VALUE) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
            if (Li.mo78013xfb85f7b0() == 49) {
                boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Li.Q0());
                java.lang.String j18 = Li.j();
                int A0 = Li.A0();
                if (R4 && j18 != null && A0 == 0) {
                    j18 = c01.w9.u(j18);
                }
                int i17 = ot0.q.v(j18).f430199i;
                if (i17 == 3) {
                    return ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16L);
                }
                if (i17 == 4) {
                    return ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8L);
                }
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public boolean T7() {
        return !gm0.j1.b().n() || gm0.m.r();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public android.os.Bundle U6(int i17, android.os.Bundle bundle) {
        j75.f Ai;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 q0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Ri();
        q0Var.getClass();
        if (i17 == 1) {
            int i18 = bundle.getInt("webview_id");
            q0Var.f263124d.remove(java.lang.Integer.valueOf(i18));
            su4.q0 q0Var2 = q0Var.f263131n;
            if ((!q0Var2.f494573a) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q0Var2.f494574b)) {
                tg0.v1 v1Var = (tg0.v1) i95.n0.c(tg0.v1.class);
                int i19 = q0Var2.f494578f;
                java.lang.String str = q0Var2.f494574b;
                boolean z17 = q0Var2.f494576d;
                boolean z18 = q0Var2.f494575c;
                int i27 = q0Var2.f494577e;
                ((sg0.q3) v1Var).getClass();
                int i28 = z17 ? 3 : z18 ? 2 : 1;
                jx3.f fVar = jx3.f.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = java.lang.Integer.valueOf(i19);
                objArr[1] = 1;
                objArr[2] = java.lang.Integer.valueOf(i28);
                objArr[3] = java.lang.Integer.valueOf(i27);
                if (str == null) {
                    str = "";
                }
                objArr[4] = str.replace(",", " ");
                fVar.d(12042, objArr);
                q0Var2.f494573a = true;
            }
            ra0.y Di = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Di();
            if (Di != null && (Ai = ((en3.l0) Di).Ai()) != null) {
                Ai.B3(new sa0.j());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "activity destroy %d", java.lang.Integer.valueOf(i18));
        } else if (i17 == 5) {
            java.lang.String string = bundle.getString("history");
            com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class));
            if (d0Var.mj()) {
                android.util.SparseArray sparseArray = d0Var.f218931z;
                if (sparseArray.indexOfKey(8) >= 0) {
                    ((o13.w) sparseArray.get(8)).e(string);
                }
            }
        } else if (i17 == 6) {
            ((lf0.u) ((mf0.d0) i95.n0.c(mf0.d0.class))).Bi(bundle.getString("reportString"));
        } else {
            if (i17 == 7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5417xb0026372 c5417xb0026372 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5417xb0026372();
                am.n9 n9Var = c5417xb0026372.f135764g;
                n9Var.f88939a = 3;
                n9Var.f88945g = bundle.getString("md5");
                n9Var.f88940b = bundle.getString("designerId");
                n9Var.f88943e = bundle.getString("aeskey");
                n9Var.f88944f = bundle.getString("encryptUrl");
                n9Var.f88946h = bundle.getString("productId");
                n9Var.f88942d = bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                n9Var.f88941c = bundle.getString("thumbUrl");
                c5417xb0026372.e();
                am.o9 o9Var = c5417xb0026372.f135765h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "GENERATE_EMOJI_PATH %s", o9Var.f89051a);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("emojiPath", o9Var.f89051a);
                return bundle2;
            }
            if (i17 == 8) {
                r45.lq5 lq5Var = new r45.lq5();
                lq5Var.f461289t = bundle.getString("reportString");
                gm0.j1.d().g(new su4.a2(lq5Var));
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public boolean Ua(java.lang.String str, boolean z17, android.os.Bundle bundle) {
        return ((com.p314xaae8f345.mm.app.p622xc5476f33.j) o25.z1.a()).b(this.f265099d, str, z17, null, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void Ui(int i17, int i18) {
        this.f265099d.f265021n.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.w(this, i17, i18));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public java.util.List V3() {
        java.util.List<java.lang.String> p17 = r01.q3.cj().p1(128);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : p17) {
            if (!r01.z.k(str)) {
                linkedList.add(str);
            }
        }
        return linkedList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void X9(java.lang.String str, int i17, android.os.Bundle bundle) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_File_Name", str);
            intent.putExtra("Retr_Compress_Type", 0);
            intent.putExtra("Retr_Msg_Type", 0);
            e(intent, bundle);
            intent.addFlags(268435456);
            g(intent, i17);
            return;
        }
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Ni = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(com.p314xaae8f345.mm.vfs.w6.p(str));
        if (Ni == null || !((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni).E0()) {
            Ni = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str));
        }
        int k17 = Ni == null ? 0 : (int) com.p314xaae8f345.mm.vfs.w6.k(((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni).N0());
        if (Ni != null) {
            str = ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni).N0();
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        boolean z17 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, options) != null && options.outHeight > ip.c.c()) || options.outWidth > ip.c.c();
        if (k17 > ip.c.a() || z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            u1Var.g(this.f265099d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574940k21));
            u1Var.a(true);
            u1Var.l(null);
            u1Var.q(false);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Retr_File_Name", Ni == null ? "" : ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni).mo42933xb5885648());
        intent2.putExtra("Retr_Msg_Type", 5);
        intent2.putExtra("Retr_MsgImgScene", 1);
        e(intent2, bundle);
        intent2.addFlags(268435456);
        g(intent2, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void Y2() {
        if ((c01.z1.n() & 32768) == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.setFlags(268435456);
            intent.addFlags(67108864);
            intent.putExtra("sns_timeline_NeedFirstLoadint", true);
            ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Vi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public java.lang.String Yb(java.lang.String str) {
        boolean a17 = gm0.j1.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "getDynamicConfigValue, accHasReady = " + a17);
        return !a17 ? (java.lang.String) new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.x(this, 1000L, null, str).a(this.f265099d.f265021n) : ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public boolean Yh() {
        int i17;
        try {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("EnableWebviewScanQRCode"), 1);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "getIntValFromDynamicConfig parseInt failed, val: EnableWebviewScanQRCode");
            i17 = 1;
        }
        return i17 == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public boolean Zi() {
        return r01.z.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void af(android.content.Intent intent) {
        android.content.Intent intent2 = new android.content.Intent(this.f265099d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19301x4b18db3b.class);
        intent2.putExtra("proxyui_action_code_key", 9);
        intent2.putExtra("proxyui_next_intent_key", intent);
        intent2.setFlags(268435456);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e = this.f265099d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(serviceC19302xd3c5b06e, arrayList.toArray(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "gotoSimpleLoginUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        serviceC19302xd3c5b06e.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(serviceC19302xd3c5b06e, "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "gotoSimpleLoginUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void b6(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e = this.f265099d;
        java.util.Map map = serviceC19302xd3c5b06e.f265016f;
        if (map == null || !map.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "%s is not recognizing", str);
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5226x932022f1 c5226x932022f1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5226x932022f1();
        c5226x932022f1.f135559g.getClass();
        c5226x932022f1.e();
        serviceC19302xd3c5b06e.f265016f.remove(str);
        com.p314xaae8f345.mm.vfs.w6.h(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (r0.moveToFirst() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r3 = r0.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        r2.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (r0.moveToNext() != false) goto L23;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List bc() {
        /*
            r14 = this;
            boolean r0 = gm0.j1.a()
            if (r0 == 0) goto Le
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Ai()
            com.tencent.mm.plugin.webview.modeltools.j1 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.cj()
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L17
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L17:
            java.util.ArrayList r1 = new java.util.ArrayList
            long r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "delete from WebViewHostsFilter where expireTime < "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "WebViewHostsFilter"
            boolean r2 = r0.m145253xb158737d(r3, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "MicroMsg.WebViewStorage"
            java.lang.String r4 = "delete expired items request  : [%b]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r2)
            l75.k0 r5 = r0.f264835d
            java.lang.String r6 = r0.mo145255x88e404c3()
            java.lang.String r0 = "host"
            java.lang.String[] r7 = new java.lang.String[]{r0}
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 2
            android.database.Cursor r0 = r5.D(r6, r7, r8, r9, r10, r11, r12, r13)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            if (r0 == 0) goto L77
            boolean r3 = r0.moveToFirst()
            if (r3 == 0) goto L77
        L63:
            r3 = 0
            java.lang.String r3 = r0.getString(r3)
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r4 != 0) goto L71
            r2.add(r3)
        L71:
            boolean r3 = r0.moveToNext()
            if (r3 != 0) goto L63
        L77:
            if (r0 == 0) goto L7c
            r0.close()
        L7c:
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.s.bc():java.util.List");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void c9(java.lang.String str, boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i17);
        a17.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "addInvokedJsApiFromMenu, functionName = %s, clear isBusy state", str);
        a17.f266526v = false;
        a17.f266516n.add(str);
        if (z17) {
            a17.f266515m.add(str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void cc(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i17);
        a17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "clearSession");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.k1.f267328d == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.k1.class) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.k1.f267328d == null) {
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.k1.f267328d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.k1(context, null);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.k1.f267328d.c(a17.f266533y1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public int dg(int i17, int i18) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(i17, null), i18);
    }

    public final void e(android.content.Intent intent, android.os.Bundle bundle) {
        if (bundle != null) {
            intent.putExtra("serverMsgID", bundle.getString("serverMsgID"));
            intent.putExtra("geta8key_username", bundle.getString("geta8key_username"));
            intent.putExtra("KPublisherReqId", bundle.getString("KPublisherReqId"));
            intent.putExtra("sns_local_id", bundle.getString("sns_local_id"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public java.lang.String f3(java.lang.String str) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false);
        if (j17 == null) {
            return null;
        }
        return j17.f67386xa1e9e82c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    /* renamed from: favEditTag */
    public void mo74366x57ac0d95() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        c5432x35bb364f.f135776g.f90061a = 35;
        c5432x35bb364f.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public int fd() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(12304, null));
    }

    public final void g(android.content.Intent intent, int i17) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41 c3933x11320b41;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e = this.f265099d;
        try {
            java.util.Iterator it = ((java.util.ArrayList) serviceC19302xd3c5b06e.f265019i).iterator();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var = null;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x1603547 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next();
                if (c19336x1603547 != null && c19336x1603547.f265329e == i17) {
                    z0Var = c19336x1603547.f265328d;
                }
            }
            android.os.Bundle i18 = z0Var.i(302, android.os.Bundle.EMPTY);
            i18.setClassLoader(com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41.class.getClassLoader());
            c3933x11320b41 = (com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41) i18.getParcelable("delegate");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "startMsgRetransmitUI, try get startActivityIpcDelegate e=%s", e17);
            c3933x11320b41 = null;
        }
        if (c3933x11320b41 == null) {
            ((com.p314xaae8f345.mm.app.y7) dw4.a.f325830a).v(intent, serviceC19302xd3c5b06e);
            return;
        }
        intent.setClassName(serviceC19302xd3c5b06e, "com.tencent.mm.ui.transmit.MsgRetransmitUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c3933x11320b41, arrayList.toArray(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "startMsgRetransmitUI", "(Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c3933x11320b41.b((android.content.Intent) arrayList.get(0));
        yj0.a.f(c3933x11320b41, "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "startMsgRetransmitUI", "(Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    /* renamed from: getDisplayName */
    public java.lang.String mo74367x40021d37(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).f2();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    /* renamed from: getLanguage */
    public java.lang.String mo74368x1bacd0ce() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void hj(int i17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.l(i17, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0570  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle i(int r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 2238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.s.i(int, android.os.Bundle):android.os.Bundle");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public int ia() {
        return h45.g0.f360478a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    /* renamed from: isSDCardAvailable */
    public boolean mo74369xe8158c5e() {
        return gm0.j1.u().l();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void j7(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.b Bi = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Bi();
        Bi.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : bundle.keySet()) {
            hashMap.put(str, bundle.get(str));
        }
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreWebViewLogic", "unknow action:%d", java.lang.Integer.valueOf(i17));
        } else {
            Bi.c(hashMap);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public boolean j8(java.lang.String str) {
        boolean a17 = gm0.j1.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "isBizContact, accHasReady = " + a17);
        if (a17) {
            return c01.e2.G(str);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public boolean ja(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i17);
        boolean z17 = a17.f266526v;
        boolean z18 = o45.wf.f424566k;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewStubService", "isBusy(%d), doingFunction = %s", java.lang.Integer.valueOf(i17), a17.f266527w);
        } else if (z18 && a17.f266528x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "isBusy(%d), awaiting proxyUI", java.lang.Integer.valueOf(i17));
            return true;
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.e jg(android.os.Bundle bundle) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.m0(null);
        long j17 = bundle.getLong("msg_id", Long.MIN_VALUE);
        java.lang.String string = bundle.getString("msg_talker");
        java.lang.String string2 = bundle.getString("sns_local_id");
        int i17 = bundle.getInt("news_svr_id", 0);
        java.lang.String string3 = bundle.getString("news_svr_tweetid");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (Long.MIN_VALUE != j17) {
            c4Var.f87854g = bundle.getInt("message_index", 0);
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
            z17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.i(c5303xc75d2f73, j17, string);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6111xbfced4cd c6111xbfced4cd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6111xbfced4cd();
            am.kx kxVar = c6111xbfced4cd.f136387g;
            kxVar.f88721b = string2;
            kxVar.f88722c = c5303xc75d2f73;
            kxVar.f88720a = bundle.getString("rawUrl");
            kxVar.getClass();
            c6111xbfced4cd.e();
            z17 = c6111xbfced4cd.f136388h.f88810a;
        } else {
            if (i17 == 0) {
                m0Var.f265078e = true;
                return m0Var;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5872xad626b51 c5872xad626b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5872xad626b51();
            am.np npVar = c5872xad626b51.f136179g;
            npVar.f88974a = 3;
            npVar.f88975b = c5303xc75d2f73;
            npVar.f88976c = i17;
            npVar.f88977d = string3;
            c5872xad626b51.e();
            z17 = c5872xad626b51.f136180h.f89104a;
        }
        if (z17) {
            java.lang.String string4 = bundle.getString("prePublishId");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (string4 == null) {
                string4 = "";
            }
            java.lang.String a17 = c01.n2.a(string4);
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("sendAppMsgScene", 2);
            c17.i("preChatName", bundle.getString("preChatName"));
            c17.i("preMsgIndex", java.lang.Integer.valueOf(bundle.getInt("preMsgIndex")));
            c17.i("prePublishId", string4);
            c17.i("preUsername", bundle.getString("preUsername"));
            c17.i("getA8KeyScene", bundle.getString("getA8KeyScene"));
            c17.i("referUrl", bundle.getString("referUrl"));
            android.os.Bundle bundle2 = bundle.getBundle("jsapiargs");
            if (bundle2 != null) {
                c17.i("adExtStr", bundle2.getString("key_snsad_statextstr"));
            }
            c4Var.f87855h = a17;
            c5303xc75d2f73.e();
        } else {
            if (c4Var.f87859l == 0) {
                c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cak;
            }
            c5303xc75d2f73.e();
        }
        m0Var.f265079f = c5303xc75d2f73.f135624h.f87966a;
        return m0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public boolean lb() {
        return gm0.j1.a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void m(java.lang.String str, boolean z17) {
        ((com.p314xaae8f345.mm.app.p622xc5476f33.j) o25.z1.a()).c(this.f265099d, str, z17, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public java.lang.String m3() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5609x6f0f697b c5609x6f0f697b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5609x6f0f697b();
        c5609x6f0f697b.e();
        return c5609x6f0f697b.f135935g.f87983a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void ng(int i17, android.os.Bundle bundle, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "edw, invoke, actionCode = %d, binderID = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f265099d.f265021n.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.t(this, i17, bundle, i18));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void pb(android.os.Bundle bundle, int i17) {
        this.f265099d.f265014d.put(i17, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void pc(int i17) {
        android.os.Parcelable parcelable;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i17);
        a17.f266525u = false;
        java.util.Iterator it = ((java.util.ArrayList) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r8.f273414a).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8 q8Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "onWebViewUIResume, resume plugin = " + q8Var.mo74208xfb82e301());
            q8Var.a(this.f265099d);
        }
        a17.C = false;
        android.os.Bundle bundle = a17.f266517o;
        if (bundle == null || (parcelable = bundle.getParcelable("KSnsAdTag")) == null || !(parcelable instanceof com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad)) {
            return;
        }
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = (com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad) parcelable;
        long j17 = c11137xb05b06ad.f153007o;
        if (j17 <= 0) {
            return;
        }
        long j18 = c11137xb05b06ad.f153008p;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c11137xb05b06ad.f153008p = j18 + (android.os.SystemClock.elapsedRealtime() - j17);
        c11137xb05b06ad.f153007o = 0L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void q7(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i17).r6().putString(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public boolean r6(java.lang.String str) {
        ((com.p314xaae8f345.mm.app.p622xc5476f33.n) ((o25.x1) i95.n0.c(o25.x1.class))).getClass();
        return (str == null || str.length() == 0 || (!str.endsWith("@mailto@") && !str.endsWith("@tel@"))) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void rg(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(z0Var == null ? -1 : z0Var.hashCode());
        objArr[1] = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "addCallback, cb.hash = %d, id = %d", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e = this.f265099d;
        ((java.util.ArrayList) serviceC19302xd3c5b06e.f265019i).add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547(z0Var, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i17);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) serviceC19302xd3c5b06e.f265019i).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x1603547 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.b(serviceC19302xd3c5b06e, c19336x1603547)) {
                    int i18 = c19336x1603547.f265329e;
                } else {
                    arrayList.add(c19336x1603547);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "removeDeadCallBacker %d is dead, may be crash before, just remove it.", java.lang.Integer.valueOf(c19336x1603547.f265329e));
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
                return;
            }
            ((java.util.ArrayList) serviceC19302xd3c5b06e.f265019i).remove(arrayList);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "removeDeadCallBacker ex:%s", e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public android.os.Bundle tb(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 q0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Ri();
        q0Var.getClass();
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (i17 != 2) {
            if (i17 == 4) {
                java.util.HashMap hashMap = (java.util.HashMap) su4.r2.b(bundle.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), bundle.getBoolean("isHomePage"), bundle.getInt("type"));
                bundle2.putString("type", (java.lang.String) hashMap.get("type"));
                bundle2.putString("isMostSearchBiz", (java.lang.String) hashMap.get("isMostSearchBiz"));
                bundle2.putString("isLocalSug", (java.lang.String) hashMap.get("isLocalSug"));
                bundle2.putString("isSug", (java.lang.String) hashMap.get("isSug"));
                bundle2.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, (java.lang.String) hashMap.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811));
            } else if (i17 == 6) {
                bundle2.putString("result", su4.o2.e(bundle.getString("key")));
            } else if (i17 == 7) {
                bundle2.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, q0Var.c(20, 0, true));
            } else if (i17 == 8) {
                java.util.HashMap hashMap2 = (java.util.HashMap) ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1.class)).Zi()).i(bundle.getString("reqId"));
                bundle2.putInt("requestType", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap2.get("requestType"), 0));
                bundle2.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, (java.lang.String) hashMap2.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
            }
            return bundle2;
        }
        java.lang.String string = bundle.getString("key");
        bundle2.putString("result", su4.o2.d(string).toString());
        if ("educationTab".equals(string)) {
            org.json.JSONObject d17 = su4.o2.d("discoverSearchGuide");
            if (d17.optJSONArray("items").length() > 0) {
                bundle2.putString("result_1", d17.toString());
            }
        }
        return bundle2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void u1(java.lang.String str, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("proxyui_phone", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.a(this.f265099d, 8, bundle, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public java.lang.String u2(java.lang.String str, int i17) {
        if (i17 == 1) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.e(str);
        }
        if (i17 != 2) {
            return null;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.d(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public java.lang.String ua() {
        return (java.lang.String) gm0.j1.u().c().l(-1535680990, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public boolean uf(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5296x2dd9a53 c5296x2dd9a53 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5296x2dd9a53();
        long j17 = bundle.getLong("fav_local_id", -1L);
        am.w3 w3Var = c5296x2dd9a53.f135617g;
        w3Var.f89791a = j17;
        w3Var.f89793c = 12;
        c5296x2dd9a53.e();
        java.lang.Long valueOf = java.lang.Long.valueOf(w3Var.f89791a);
        am.x3 x3Var = c5296x2dd9a53.f135618h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "do del fav web url, local id %d, result %B", valueOf, java.lang.Boolean.valueOf(x3Var.f89876a));
        return x3Var.f89876a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public boolean wc(java.lang.String str) {
        return c01.e2.D(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void x7(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.a(i17, str, str2);
        a17.f264282u = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().c(null, a17.f264269e, 5, 0, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cd  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x8(java.lang.String r17, java.lang.String r18, java.lang.String r19, android.os.Bundle r20, android.os.Bundle r21, int r22) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.s.x8(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, android.os.Bundle, int):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0
    public void yf(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, int i19, android.os.Bundle bundle) {
        if (str == null) {
            return;
        }
        final android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19304x577b8b34.class);
        intent.setFlags(872415232);
        intent.putExtra("key_string_for_scan", str);
        intent.putExtra("key_string_for_url", str2);
        intent.putExtra("key_string_for_image_url", str3);
        intent.putExtra("key_codetype_for_scan", i18);
        intent.putExtra("key_codeversion_for_scan", i19);
        if (bundle != null) {
            java.lang.String string = bundle.getString("preUsername");
            java.lang.String string2 = bundle.getString("preChatName");
            java.lang.String string3 = bundle.getString("rawUrl");
            intent.putExtra("geta8key_init_request_id", bundle.getInt("geta8key_init_request_id", 0));
            java.lang.String a17 = c01.n2.a("WebviewQrCode");
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("preUsername", string);
            c17.i("preChatName", string2);
            c17.i("url", str2);
            c17.i("Contact_Sub_Scene", java.lang.Integer.valueOf(!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(str2) ? 6 : 1));
            c17.i("Contact_Scene_Note", str2);
            c17.i("rawUrl", string3);
            intent.putExtra("img_gallery_session_id", a17);
            java.lang.String string4 = bundle.getString("pre_username");
            if (string4 != null && c01.e2.G(string4)) {
                intent.putExtra("key_string_for_from_username", string4);
            }
            intent.putExtra("key_file_path_for_scan", bundle.getString(com.p314xaae8f345.mm.ui.w2.f292737q));
            intent.putExtra("key_delete_file_after_deal", true);
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f265099d.f265019i).iterator();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var = null;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x1603547 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next();
            if (c19336x1603547 != null && c19336x1603547.f265329e == i17) {
                z0Var = c19336x1603547.f265328d;
            }
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.stub.s$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "lambda$reqDealQBarResult$0", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "lambda$reqDealQBarResult$0", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        };
        if (z0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.e(intent.getExtras(), "webview", ".stub.WebviewScanImageActivity", z0Var, runnable);
        } else {
            runnable.run();
        }
    }
}
