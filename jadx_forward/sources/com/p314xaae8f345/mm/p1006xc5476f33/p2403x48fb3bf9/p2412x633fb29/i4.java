package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public final class i4 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f264471e = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f264470d = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: f, reason: collision with root package name */
    public final dn.k f264472f = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j4(this);

    public boolean a(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 n0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l4 Zi = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi();
        Zi.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 abstractC19284xdca64a7 = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewJSSDKFileItemManager", "getItemByServerId error, media id is null or nil");
        } else {
            java.util.Iterator it = Zi.f264536a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 abstractC19284xdca64a72 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7) it.next();
                java.lang.String str3 = abstractC19284xdca64a72.f264272h;
                if (str3 == null) {
                    str3 = "";
                }
                if (str3.equals(str2)) {
                    abstractC19284xdca64a7 = abstractC19284xdca64a72;
                    break;
                }
            }
        }
        if (abstractC19284xdca64a7 != null) {
            abstractC19284xdca64a7.f264268d = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewFileChooserCdnService", "the file item has alreay in local : appid : %s, serverId : %s, localId : %s", str, str2, abstractC19284xdca64a7.f264269e);
            n0Var.a(true, 0, abstractC19284xdca64a7.f264269e, abstractC19284xdca64a7.f264272h, null, null);
            return true;
        }
        gm0.j1.d().a(1035, this);
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b1(str, str2));
        if (n0Var != null) {
            this.f264470d.add(n0Var);
        }
        return true;
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0 m0Var) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f264471e;
        if (copyOnWriteArraySet == null || m0Var == null || copyOnWriteArraySet.contains(m0Var)) {
            return;
        }
        copyOnWriteArraySet.add(m0Var);
    }

    public boolean c(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 n0Var) {
        return d(str, str2, i17, i18, i19, 0, n0Var);
    }

    public final boolean d(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 n0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().b(str2);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewFileChooserCdnService", "addUploadTask get webview file chooser item  by local id failed : %s", str2);
            return false;
        }
        b17.f264268d = str;
        if (n0Var != null) {
            this.f264470d.add(n0Var);
        }
        if (i18 == 202 || i18 == 214 || i18 == 215 || i18 == 366 || i27 == 8) {
            b17.f264282u = false;
        }
        b17.f264280s = true;
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_WebViewJSSDKCdnService_2";
        mVar.f323320f = this.f264472f;
        mVar.f323319e = true;
        mVar.f69601xaca5bdda = b17.f264273i;
        mVar.f69595x6d25b0d9 = b17.f264271g;
        mVar.f69592xf1ebe47b = i17;
        mVar.f69618x114ef53e = "weixin";
        mVar.f69609xd84b8349 = 2;
        if (i17 == 10011 || i18 == 214) {
            mVar.f69606xccdbf540 = true;
        } else {
            mVar.f69606xccdbf540 = false;
        }
        mVar.f69597x853bb235 = false;
        mVar.f69580x454032b6 = i18;
        mVar.f69584x89a4c0cf = i19;
        mVar.f323322h = i27;
        mVar.f69594x4b409164 = true;
        mVar.f69621xf91593ca = false;
        mVar.f69619xe9ed65f6 = b17.f264270f;
        boolean Bi = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewFileChooserCdnService", "summersafecdn add upload cdn task : %b, force_aeskeycdn: %b, trysafecdn: %b, localid : %s ", java.lang.Boolean.valueOf(Bi), java.lang.Boolean.valueOf(mVar.f69594x4b409164), java.lang.Boolean.valueOf(mVar.f69621xf91593ca), str2);
        return Bi;
    }

    public boolean e(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewFileChooserCdnService", "cancelDownloadTask get webview file chooser item  by local id : %s", str);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
        return true;
    }

    public boolean f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().b(str);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewFileChooserCdnService", "cancelUploadTask get webview file chooser item  by local id failed : %s", str);
            return false;
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(b17.f264273i);
        return true;
    }

    public final synchronized void g(final boolean z17, final int i17, final int i18, final java.lang.String str, final java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewFileChooserCdnService", "notifyProgressCallback, upload : %b, mediaType : %d, percent : %d, localId : %s, mediaId : %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2);
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f264471e;
        if (copyOnWriteArraySet != null && copyOnWriteArraySet.size() > 0) {
            java.util.Iterator it = this.f264471e.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0) it.next()).a(z17, i17, i18, str, str2);
            }
        }
        fs.g.b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o0.class, new fs.o() { // from class: com.tencent.mm.plugin.webview.model.i4$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o0) nVar)).getClass();
                boolean z18 = z17;
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
                int i19 = i18;
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
                java.lang.String str3 = str;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnProgressCallback", "onWebView cdn callback progress, upload : %b, mediaType : %d, percent : %d, localid : %s, mediaId : %s", valueOf, valueOf2, valueOf3, str3, str2);
                if (!z18) {
                    return false;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put(dm.i4.f66867x2a5c95c7, str3);
                    jSONObject.put("percent", i19);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "onMediaFileUploadProgress");
                    bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject.toString());
                    ((h80.k) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class))).getClass();
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(bundle, tw4.a.class, null);
                    return false;
                } catch (org.json.JSONException unused) {
                    return false;
                }
            }
        });
    }

    public final synchronized void h(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f264470d;
        if (copyOnWriteArraySet != null && copyOnWriteArraySet.size() > 0) {
            java.util.Iterator it = this.f264470d.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0) it.next()).a(z17, i17, str, str2, str3, str4);
            }
        }
    }

    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 n0Var) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f264470d;
        if (copyOnWriteArraySet == null || n0Var == null) {
            return;
        }
        copyOnWriteArraySet.remove(n0Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewFileChooserCdnService", "onSceneEnd, errType = %d, errCode = %d, funcType = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        if (mo808xfb85f7b0 == 1034) {
            gm0.j1.d().q(1034, this);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t1 t1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t1) m1Var;
            java.lang.String str2 = ((r45.xe4) t1Var.f264647d.f152244b.f152233a).f471546d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l4 Zi = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi();
            java.lang.String str3 = t1Var.f264650g;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b17 = Zi.b(str3);
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str2;
            java.lang.String str4 = t1Var.f264649f;
            objArr[1] = str4;
            objArr[2] = str3;
            objArr[3] = java.lang.Boolean.valueOf(b17 == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewFileChooserCdnService", "get server server id : %s from server for appid : %s, localId = %s, item == null ? %b", objArr);
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewFileChooserCdnService", "upload cdn info failed");
                if (b17 != null) {
                    h(false, 0, b17.f264269e, b17.f264273i, null, null);
                    return;
                }
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || b17 == null) {
                return;
            }
            b17.f264272h = str2;
            g(true, b17.f264275n, 100, b17.f264269e, str2);
            h(true, 0, b17.f264269e, b17.f264272h, b17.f264279r.f38732x419c440e, null);
            return;
        }
        if (mo808xfb85f7b0 != 1035) {
            return;
        }
        gm0.j1.d().q(1035, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b1) m1Var;
        java.lang.String str5 = b1Var.f264319g;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewFileChooserCdnService", "download cdn info failed");
            h(false, 0, null, str5, null, null);
            return;
        }
        r45.re4 re4Var = ((r45.te4) b1Var.f264316d.f152244b.f152233a).f467885d;
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        java.lang.String str6 = b1Var.f264318f;
        objArr2[0] = str6;
        objArr2[1] = str5;
        objArr2[2] = java.lang.Boolean.valueOf(re4Var == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewFileChooserCdnService", "appid = %s, serverId = %s, cdninfo == null ? %b", objArr2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) || re4Var == null) {
            return;
        }
        java.lang.String str7 = re4Var.f466298f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewFileChooserCdnService", "cdn info type = %s", str7);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
            return;
        }
        if (str7.toLowerCase().equals("voice")) {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.f264583a;
            d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.c("_USER_FOR_WEBVIEW_JSAPI" + c01.y1.a(str6, java.lang.System.currentTimeMillis()));
        } else if (str7.toLowerCase().equals("video")) {
            d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.c(java.lang.System.currentTimeMillis() + ""));
        } else {
            d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.c(java.lang.System.currentTimeMillis() + ""));
        }
        d17.f264280s = false;
        d17.f264268d = str6;
        d17.f264272h = str5;
        if (d17.f264279r == null) {
            d17.f264279r = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k4();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k4 k4Var = d17.f264279r;
        k4Var.f38729xf11df5f5 = re4Var.f466297e;
        k4Var.f38730xf9dbbe9c = re4Var.f466296d;
        k4Var.f38731x17c343e7 = re4Var.f466299g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(d17);
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_WebViewJSSDKCdnService_1";
        mVar.f323320f = this.f264472f;
        mVar.f323319e = false;
        mVar.f69601xaca5bdda = d17.f264273i;
        mVar.f69595x6d25b0d9 = d17.f264271g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k4 k4Var2 = d17.f264279r;
        mVar.f69620xeb1a61d6 = k4Var2.f38731x17c343e7;
        mVar.f69592xf1ebe47b = 5;
        mVar.f69591xf9dbbe9c = k4Var2.f38730xf9dbbe9c;
        mVar.f69575xf11df5f5 = k4Var2.f38729xf11df5f5;
        mVar.f69609xd84b8349 = 2;
        mVar.f69606xccdbf540 = false;
        mVar.f69597x853bb235 = false;
        boolean wi6 = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewFileChooserCdnService", "add download cdn task : %b, localid : %s", java.lang.Boolean.valueOf(wi6), d17.f264272h);
        if (wi6) {
            return;
        }
        h(false, 0, null, null, null, null);
    }
}
