package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public class WXEntryActivity extends com.tencent.mm.pluginsdk.ui.AutoLoginActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f93685y = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f93686d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f93687e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f93688f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.i5 f93689g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.h5 f93691i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f93693n;

    /* renamed from: o, reason: collision with root package name */
    public int f93694o;

    /* renamed from: p, reason: collision with root package name */
    public int f93695p;

    /* renamed from: q, reason: collision with root package name */
    public android.net.Uri f93696q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f93697r;

    /* renamed from: s, reason: collision with root package name */
    public android.app.ProgressDialog f93698s;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelmsg.WXMediaMessage f93700u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f93702w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f93703x;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93690h = false;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.app.g5 f93692m = new com.tencent.mm.pluginsdk.model.app.g5();

    /* renamed from: t, reason: collision with root package name */
    public int f93699t = 0;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.ref.WeakReference f93701v = new java.lang.ref.WeakReference(this);

    /* loaded from: classes8.dex */
    public static class EntryReceiver extends android.content.BroadcastReceiver {

        /* renamed from: f, reason: collision with root package name */
        public static com.tencent.mm.sdk.platformtools.n3 f93704f;

        /* renamed from: a, reason: collision with root package name */
        public android.content.Context f93705a;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f93706b;

        /* renamed from: c, reason: collision with root package name */
        public int f93707c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f93708d;

        /* renamed from: e, reason: collision with root package name */
        public long f93709e;

        public static void a(com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver entryReceiver, android.content.Context context, android.content.Intent intent) {
            entryReceiver.f93705a = context;
            java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, com.tencent.mm.opensdk.constants.ConstantsAPI.CONTENT);
            entryReceiver.f93709e = com.tencent.mm.sdk.platformtools.c2.i(intent, com.tencent.mm.opensdk.constants.ConstantsAPI.APP_SUPORT_CONTENT_TYPE, 0L);
            int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION, 0);
            entryReceiver.f93707c = g17;
            int i17 = com.tencent.mm.plugin.base.stub.WXEntryActivity.f93685y;
            if (!(g17 >= 553713665)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "sdk version is not supported, sdkVersion = " + entryReceiver.f93707c);
                return;
            }
            java.lang.String l18 = com.tencent.mm.sdk.platformtools.c2.l(intent, com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE);
            entryReceiver.f93708d = l18;
            if (l18 == null || l18.length() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "unknown package, ignore");
                return;
            }
            if (!com.tencent.mm.plugin.base.stub.WXEntryActivity.a7(com.tencent.mm.sdk.platformtools.c2.d(intent, com.tencent.mm.opensdk.constants.ConstantsAPI.CHECK_SUM), com.tencent.mm.plugin.base.stub.WXEntryActivity.e7(l17, entryReceiver.f93707c, entryReceiver.f93708d))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "checksum fail");
                return;
            }
            if (l17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "check appid failed, null content");
                return;
            }
            android.net.Uri parse = android.net.Uri.parse(l17);
            java.lang.String authority = parse.getAuthority();
            try {
                entryReceiver.f93706b = parse.getQueryParameter("appid");
                com.tencent.mars.xlog.Log.i("MicroMsg.WXEntryActivity", "onReceive, appId = " + entryReceiver.f93706b);
                java.lang.String str = entryReceiver.f93706b;
                if (str == null || str.length() <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "invalid appid, ignore");
                    return;
                }
                if (!gm0.j1.a() || gm0.m.r()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WXEntryActivity", "not login, just save the appid : %s", entryReceiver.f93706b);
                    ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).Ri(entryReceiver.f93706b);
                    return;
                }
                if (!gm0.j1.b().f273254q) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WXEntryActivity", "not login accInitializing, just save the appid : %s", entryReceiver.f93706b);
                    ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).Ri(entryReceiver.f93706b);
                    return;
                }
                if ("registerapp".equals(authority)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WXEntryActivity", "handle app registeration: " + entryReceiver.f93708d + ", sdkver=" + entryReceiver.f93707c);
                    if (!gm0.j1.a()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "no available account");
                        return;
                    }
                    lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                    java.lang.String str2 = entryReceiver.f93706b;
                    ((kt.c) i0Var).getClass();
                    com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str2);
                    if (h17 == null || !com.tencent.mm.sdk.platformtools.t8.D0(entryReceiver.f93708d, h17.field_packageName)) {
                        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ri(entryReceiver.f93706b, entryReceiver.f93708d, new com.tencent.mm.plugin.base.stub.f1(entryReceiver, h17));
                        return;
                    } else {
                        entryReceiver.b(h17);
                        return;
                    }
                }
                if ("unregisterapp".equals(authority)) {
                    if (!gm0.j1.a()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "no available account");
                        return;
                    }
                    lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                    java.lang.String str3 = entryReceiver.f93706b;
                    ((kt.c) i0Var2).getClass();
                    com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str3, false, false);
                    lt.m0 m0Var = (lt.m0) i95.n0.c(lt.m0.class);
                    android.content.Context context2 = entryReceiver.f93705a;
                    java.lang.String str4 = entryReceiver.f93708d;
                    ((kt.e) m0Var).getClass();
                    if (!com.tencent.mm.pluginsdk.model.app.i1.a(context2, j17, str4)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "unreg fail, check app fail");
                    } else {
                        if (j17 == null || j17.field_status == 5) {
                            return;
                        }
                        j17.field_status = 4;
                        com.tencent.mm.pluginsdk.model.app.u5.Di().update(j17, new java.lang.String[0]);
                        com.tencent.mm.pluginsdk.ui.tools.n0.c(entryReceiver.f93706b);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "init: %s", e17.toString());
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
        
            if (r6 == false) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(com.tencent.mm.pluginsdk.model.app.m r12) {
            /*
                Method dump skipped, instructions count: 426
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver.b(com.tencent.mm.pluginsdk.model.app.m):void");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (context == null || intent == null) {
                return;
            }
            if (f93704f == null) {
                f93704f = new com.tencent.mm.sdk.platformtools.n3("WXEntryReceiver");
            }
            if (gm0.j1.i().f273208a.f273299d) {
                f93704f.post(new com.tencent.mm.plugin.base.stub.e1(this, context, intent));
            } else {
                gm0.j1.i().m(new com.tencent.mm.plugin.base.stub.d1(this, context, intent));
            }
        }
    }

    public static boolean a7(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "checkSumConsistent fail, invalid arguments");
            return false;
        }
        if (bArr.length != bArr2.length) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "checkSumConsistent fail, length is different");
            return false;
        }
        for (int i17 = 0; i17 < bArr.length; i17++) {
            if (bArr[i17] != bArr2[i17]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] e7(java.lang.String str, int i17, java.lang.String str2) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i17);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        return kk.k.g(stringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x01e4, code lost:
    
        if (r10.startsWith("content") != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0207, code lost:
    
        if (r10.startsWith("content") != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0221, code lost:
    
        if (r10.startsWith("content") != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0239, code lost:
    
        if (r10.startsWith("content") != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0271, code lost:
    
        if (r10.startsWith("content") == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c1, code lost:
    
        if (r10.startsWith("content") != false) goto L140;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02cc  */
    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X6(com.tencent.mm.pluginsdk.ui.p r17, android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 2615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.base.stub.WXEntryActivity.X6(com.tencent.mm.pluginsdk.ui.p, android.content.Intent):void");
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public boolean Y6(android.content.Intent intent) {
        if (!g7(intent, "preLogin")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "Init failed");
            finish();
            return false;
        }
        if (!gm0.j1.a() || gm0.m.r()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WXEntryActivity", "preLogin not login, save the appid : %s", this.f93686d);
            ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).Ri(this.f93686d);
        }
        if (!(this.f93694o >= 553713665)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "sdk version is not supported, sdkVersion = " + this.f93694o);
            finish();
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WXEntryActivity", "preLogin, appId = %s, pkg = %s, uri = %s", this.f93686d, this.f93687e, this.f93696q);
        if (this.f93696q == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "check appid failed, null content");
            finish();
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f93686d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "invalid appid, ignore");
            finish();
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f93687e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "unknown package, ignore");
            finish();
            return false;
        }
        if (a7(com.tencent.mm.sdk.platformtools.c2.d(intent, com.tencent.mm.opensdk.constants.ConstantsAPI.CHECK_SUM), e7(this.f93697r, this.f93694o, this.f93687e))) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "preLogin, checksum fail, appId = %s, pkg = %s, uri = %s", this.f93686d, this.f93687e, this.f93696q);
        finish();
        return false;
    }

    public final void b7(com.tencent.mm.modelbase.m1 m1Var, android.os.Bundle bundle) {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WXEntryActivity", "accHasReady not ready, do nothing");
            finish();
            return;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = this.f93686d;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
        if (h17 != null && com.tencent.mm.sdk.platformtools.t8.D0(this.f93687e, h17.field_packageName)) {
            c7(m1Var, h17, bundle);
            finish();
        } else {
            this.f93698s = db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.base.stub.x0(this));
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ri(this.f93686d, this.f93687e, new com.tencent.mm.plugin.base.stub.y0(this, h17, m1Var, bundle));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0537, code lost:
    
        if (r5.message.getType() != 4) goto L223;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ee A[Catch: Exception -> 0x0310, TRY_LEAVE, TryCatch #0 {Exception -> 0x0310, blocks: (B:181:0x02e8, B:183:0x02ee), top: B:180:0x02e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x036b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x044a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c7(com.tencent.mm.modelbase.m1 r29, com.tencent.mm.pluginsdk.model.app.m r30, android.os.Bundle r31) {
        /*
            Method dump skipped, instructions count: 1718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.base.stub.WXEntryActivity.c7(com.tencent.mm.modelbase.m1, com.tencent.mm.pluginsdk.model.app.m, android.os.Bundle):boolean");
    }

    public final void d7() {
        android.app.ProgressDialog progressDialog = this.f93698s;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f93698s.dismiss();
    }

    public final void f7() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mcx);
        if (findViewById == null) {
            j7();
        } else if (findViewById.getVisibility() == 8) {
            j7();
        } else {
            i7();
        }
    }

    public final boolean g7(android.content.Intent intent, java.lang.String str) {
        this.f93694o = com.tencent.mm.sdk.platformtools.c2.g(intent, com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION, 0);
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, com.tencent.mm.opensdk.constants.ConstantsAPI.CONTENT);
        this.f93697r = l17;
        if (l17 != null) {
            android.net.Uri parse = android.net.Uri.parse(l17);
            this.f93696q = parse;
            this.f93693n = parse.getAuthority();
            try {
                this.f93686d = this.f93696q.getQueryParameter("appid");
                this.f93695p = com.tencent.mm.sdk.platformtools.c2.f(getIntent().getExtras(), "_wxapi_command_type", 0);
                this.f93687e = com.tencent.mm.sdk.platformtools.c2.l(intent, com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE);
                this.f93688f = com.tencent.mm.sdk.platformtools.c2.l(intent, com.tencent.mm.opensdk.constants.ConstantsAPI.TOKEN);
                if (this.f93689g == null) {
                    this.f93689g = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).Di(this.f93688f);
                }
                com.tencent.mm.pluginsdk.model.app.i5 i5Var = this.f93689g;
                com.tencent.mars.xlog.Log.i("MicroMsg.WXEntryActivity", "init(%s) tokenData.token: %s, tokenData: %s, intent.packageName: %s, intent.openSDKVersion: %s", str, i5Var.f188934a, i5Var, this.f93687e, java.lang.Integer.valueOf(this.f93694o));
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "init: %s", e17.toString());
            }
        }
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cim;
    }

    public final void h7(int i17, int i18, java.lang.String str) {
        if (com.tencent.mm.ui.pc.a(this, i17, i18, null, 4)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WXEntryActivity", "mm error processor process this errcode");
            finish();
        } else if (!gm0.m.r()) {
            l7(str);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.WXEntryActivity", "account is hold, do finish");
            finish();
        }
    }

    public final void i7() {
        com.tencent.mm.pluginsdk.model.app.m5.c(this, com.tencent.mm.pluginsdk.model.app.m5.a(com.tencent.mm.sdk.platformtools.c2.e(getIntent()), -6), true, false);
        finish();
    }

    public final void j7() {
        com.tencent.mm.pluginsdk.model.app.m5.b(this, com.tencent.mm.pluginsdk.model.app.m5.a(com.tencent.mm.sdk.platformtools.c2.e(getIntent()), -2));
        finish();
    }

    public final void k7() {
        try {
            if (bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Target30_AuthenticationToast_Int, 0) == 1) {
                db5.t7.m(this, this.f93689g.f188935b + "-" + this.f93692m.f188913a);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WXEntryActivity", e17, "", new java.lang.Object[0]);
        }
    }

    public final void l7(java.lang.String str) {
        m7(str, "");
    }

    public final void m7(java.lang.String str, java.lang.String str2) {
        java.util.Map d17;
        int color = getResources().getColor(com.tencent.mm.R.color.f479461zy);
        if (getController() != null) {
            getController().G0(color);
        }
        d7();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mcx);
        if (findViewById == null) {
            dp.a.makeText(getApplicationContext(), com.tencent.mm.R.string.f493128j45, 0).show();
            finish();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/base/stub/WXEntryActivity", "showSpamView", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/base/stub/WXEntryActivity", "showSpamView", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setMMTitle(com.tencent.mm.R.string.f493128j45);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mtl);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mtk);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (str.startsWith("autoauth_errmsg_")) {
                str = str.substring(16);
            }
            if (str.startsWith("<e>") && (d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "e", null)) != null && !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) d17.get(".e.Content"))) {
                str = (java.lang.String) d17.get(".e.Content");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                textView.setText(str);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str2);
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.aag);
        java.lang.String Zi = gm0.j1.a() ? ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(this, this.f93686d) : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            button.setText(com.tencent.mm.R.string.j3y);
        } else {
            button.setText(getString(com.tencent.mm.R.string.j3y) + Zi);
        }
        button.setOnClickListener(new com.tencent.mm.plugin.base.stub.c1(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.WXEntryActivity", "showSpamView errMsg:%s, descMsg:%s, appId:%s, appName:%s", str, str2, this.f93686d, Zi);
    }

    public final java.lang.String n7(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        try {
            return java.net.URLEncoder.encode(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "urlEncode fail, str = %s, ex = %s", str, e17.getMessage());
            return str;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.sdk.platformtools.c2.m(getIntent(), "key_auto_login_wizard_exit", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXEntryActivity", "onCreate");
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.base.stub.u0(this));
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(1200, this);
        d7();
        com.tencent.mars.xlog.Log.i("MicroMsg.WXEntryActivity", "onDestroy");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0 || keyEvent.getKeyCode() != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WXEntryActivity", "user click back button");
        f7();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.WXEntryActivity", "onPause");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.WXEntryActivity", "onResume");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0206  */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r12, int r13, java.lang.String r14, com.tencent.mm.modelbase.m1 r15) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.base.stub.WXEntryActivity.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
