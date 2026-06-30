package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public class WXBizEntryActivity extends com.tencent.mm.pluginsdk.ui.AutoLoginActivity {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f93602m = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f93604e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93605f;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f93603d = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93606g = false;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f93607h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BusiF2fPaySuccEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.14

        /* renamed from: d, reason: collision with root package name */
        public final int f93625d = 3;

        {
            this.__eventId = -1359897903;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.BusiF2fPaySuccEvent busiF2fPaySuccEvent) {
            am.e1 e1Var = busiF2fPaySuccEvent.f54014g;
            boolean z17 = e1Var.f6518c;
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity wXBizEntryActivity = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this;
            if (!z17) {
                wXBizEntryActivity.finish();
                com.tencent.mm.plugin.base.stub.WXBizEntryActivity.b7(wXBizEntryActivity, -2, "cancel");
                return true;
            }
            if (e1Var.f6521f != this.f93625d) {
                return true;
            }
            wXBizEntryActivity.finish();
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity.b7(wXBizEntryActivity, 0, "ok");
            return true;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    public boolean f93608i = false;

    /* renamed from: com.tencent.mm.plugin.base.stub.WXBizEntryActivity$15, reason: invalid class name */
    /* loaded from: classes9.dex */
    class AnonymousClass15 implements com.tencent.mm.modelbase.e3 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage.Req f93627d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f93628e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f93629f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ r45.yp6 f93630g;

        public AnonymousClass15(com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage.Req req, java.lang.String str, java.lang.String str2, r45.yp6 yp6Var) {
            this.f93627d = req;
            this.f93628e = str;
            this.f93629f = str2;
            this.f93630g = yp6Var;
        }

        @Override // com.tencent.mm.modelbase.e3
        public int callback(int i17, final int i18, final java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
            final r45.zp6 zp6Var = (r45.zp6) oVar.f70711b.f70700a;
            java.lang.String str2 = this.f93628e;
            com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage.Req req = this.f93627d;
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WXBizEntryActivity", "doLaunchWxaRedirectingPage, with ticket[%s] hostAppId[%s], cgi failed, errType[%d] errCode[%d] errMsg[%s]", req.invokeTicket, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                com.tencent.mm.plugin.base.stub.e0.s(5);
                com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.15.1
                    @Override // java.lang.Runnable
                    public void run() {
                        r45.zp6 zp6Var2 = zp6Var;
                        java.lang.String str3 = zp6Var2 != null ? zp6Var2.f392285g : null;
                        boolean isEmpty = android.text.TextUtils.isEmpty(str3);
                        com.tencent.mm.plugin.base.stub.WXBizEntryActivity.AnonymousClass15 anonymousClass15 = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.AnonymousClass15.this;
                        if (isEmpty) {
                            str3 = str;
                            if (android.text.TextUtils.isEmpty(str3)) {
                                str3 = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this.getString(com.tencent.mm.R.string.hf8);
                            }
                        }
                        com.tencent.mm.plugin.base.stub.WXBizEntryActivity wXBizEntryActivity = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this;
                        db5.e1.E(wXBizEntryActivity, str3, wXBizEntryActivity.getString(com.tencent.mm.R.string.f490573yv), com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this.getString(com.tencent.mm.R.string.f490507x1), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.15.1.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                                com.tencent.mm.plugin.base.stub.WXBizEntryActivity.AnonymousClass15.AnonymousClass1 anonymousClass1 = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.AnonymousClass15.AnonymousClass1.this;
                                com.tencent.mm.plugin.base.stub.WXBizEntryActivity.AnonymousClass15 anonymousClass152 = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.AnonymousClass15.this;
                                com.tencent.mm.plugin.base.stub.e0.v(com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this, anonymousClass152.f93627d, anonymousClass152.f93629f, i18, str);
                            }
                        });
                    }
                });
                return 0;
            }
            com.tencent.mm.protobuf.g gVar = zp6Var.f392293r;
            java.lang.String str3 = this.f93629f;
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity activity = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this;
            if (gVar == null || gVar.f192156a.length <= 0) {
                com.tencent.mm.plugin.base.stub.e0.s(6);
                com.tencent.mars.xlog.Log.e("MicroMsg.WXBizEntryActivity", "doLaunchWxaRedirectingPage, with ticket[%s] hostAppId[%s], get invalid wxa_runtime_buff from cgi", req.invokeTicket, str2);
                com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable(this) { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.15.2
                    @Override // java.lang.Runnable
                    public void run() {
                        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.lbo, 0).show();
                    }
                });
                com.tencent.mm.plugin.base.stub.e0.v(activity, req, str3, -1, "Invalid wxa_runtime_buff");
                return 0;
            }
            com.tencent.mm.plugin.base.stub.e0.s(4);
            android.util.Pair ne6 = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).ne(com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this, this.f93627d, ((r45.y7) this.f93630g.f391279g.getFirst()).f390832e, zp6Var.f392284f, zp6Var.f392293r.i());
            if (((java.lang.Integer) ne6.first).intValue() != 0) {
                com.tencent.mm.plugin.base.stub.e0.v(activity, req, str3, ((java.lang.Integer) ne6.first).intValue(), (java.lang.String) ne6.second);
            } else {
                java.lang.String invokeTicket = req.invokeTicket;
                fm1.b bVar = fm1.b.f264014a;
                kotlin.jvm.internal.o.g(invokeTicket, "invokeTicket");
                kotlin.jvm.internal.o.g(activity, "activity");
                fm1.b.f264015b.put(invokeTicket.hashCode(), activity);
            }
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.base.stub.WXBizEntryActivity$1DeepLinkCallback, reason: invalid class name */
    /* loaded from: classes9.dex */
    class C1DeepLinkCallback implements o25.k0, com.tencent.mm.plugin.appbrand.service.g6, o25.b2, o25.c2 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f93639a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f93640b;

        public C1DeepLinkCallback(java.lang.String str, java.lang.String str2) {
            this.f93639a = str;
            this.f93640b = str2;
        }

        @Override // o25.b2
        public java.lang.String a() {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str = this.f93640b;
            return str == null ? "" : str;
        }

        @Override // o25.k0
        public void b(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "openBusinessView, DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Boolean.valueOf(z17));
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity wXBizEntryActivity = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this;
            if (m1Var != null && (((!z17 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) || (i17 != 0 && i18 != 0)) && (m1Var instanceof com.tencent.mm.modelsimple.h1))) {
                r45.zp6 I = ((com.tencent.mm.modelsimple.h1) m1Var).I();
                if (I == null || wXBizEntryActivity.isFinishing()) {
                    wXBizEntryActivity.finish();
                    return;
                }
                java.lang.String str2 = I.f392285g;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 != null) {
                    str = str2;
                }
                final java.lang.String string = str == null ? wXBizEntryActivity.getString(com.tencent.mm.R.string.hf8) : str;
                db5.e1.E(wXBizEntryActivity, string, wXBizEntryActivity.getString(com.tencent.mm.R.string.f490573yv), wXBizEntryActivity.getString(com.tencent.mm.R.string.f490507x1), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.1DeepLinkCallback.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                        com.tencent.mm.plugin.base.stub.WXBizEntryActivity.C1DeepLinkCallback c1DeepLinkCallback = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.C1DeepLinkCallback.this;
                        com.tencent.mm.plugin.base.stub.WXBizEntryActivity wXBizEntryActivity2 = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this;
                        int i27 = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.f93602m;
                        java.lang.String stringExtra = wXBizEntryActivity2.getIntent().getStringExtra("key_app_id");
                        java.lang.String stringExtra2 = wXBizEntryActivity2.getIntent().getStringExtra("key_business_type");
                        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(stringExtra);
                        if (h17 == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizEntryActivity", "launchFakeMiniProgramBackToApp info is null");
                        } else {
                            android.os.Bundle bundle = new android.os.Bundle();
                            com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Resp(bundle);
                            resp.extMsg = "{}";
                            resp.errStr = string;
                            resp.openId = h17.field_openId;
                            resp.errCode = -3;
                            resp.businessType = stringExtra2;
                            resp.transaction = com.tencent.mm.pluginsdk.ui.tools.n5.f191793a;
                            wXBizEntryActivity2.f7(bundle, resp, h17);
                        }
                        com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this.finish();
                    }
                });
                return;
            }
            if ("nativeOpenAdCanvas".equals(wXBizEntryActivity.getIntent().getStringExtra("key_business_type"))) {
                l64.a.d(l64.a.b(wXBizEntryActivity.getIntent().getStringExtra("key_app_id"), this.f93639a), 2);
            }
            if (!(m1Var instanceof com.tencent.mm.modelsimple.h1)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WXBizEntryActivity", "openBusinessView, DeepLinkHelper.DeepLinkCallback, scene is not NetSceneTranslateLink, finish activity");
                wXBizEntryActivity.finish();
                return;
            }
            r45.zp6 zp6Var = (r45.zp6) ((com.tencent.mm.modelsimple.h1) m1Var).f71337e.f70711b.f70700a;
            java.lang.String str3 = zp6Var == null ? null : zp6Var.f392284f;
            com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "openBusinessView, DeepLinkHelper.DeepLinkCallback transUri[%s]", str3);
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if ((str3 == null ? "" : str3).startsWith("weixin://dl/jumpFakeWxa/")) {
                return;
            }
            if (str3 == null) {
                str3 = "";
            }
            if (str3.startsWith("weixin://dl/openLiteApp/")) {
                return;
            }
            wXBizEntryActivity.finish();
        }

        @Override // o25.c2
        public void c() {
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this.finish();
        }

        @Override // com.tencent.mm.plugin.appbrand.service.g6
        public void d() {
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity wXBizEntryActivity = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this;
            com.tencent.mm.sdk.event.IListener iListener = wXBizEntryActivity.f93603d;
            if (iListener != null) {
                iListener.dead();
                wXBizEntryActivity.f93603d = null;
            }
            wXBizEntryActivity.f93603d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.1DeepLinkCallback.2
                {
                    this.__eventId = 551436157;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent appBrandUIEnterAnimationCompleteEvent) {
                    com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this.finish();
                    return false;
                }
            };
            wXBizEntryActivity.f93603d.alive();
            wXBizEntryActivity.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "setDoFinishOnNextResume");
            wXBizEntryActivity.f93608i = true;
        }

        @Override // com.tencent.mm.plugin.appbrand.service.g6
        public void e() {
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this.finish();
        }

        @Override // o25.c2
        public void f() {
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this.finish();
        }
    }

    public static void a7(com.tencent.mm.plugin.base.stub.WXBizEntryActivity wXBizEntryActivity, java.lang.String str) {
        java.lang.String stringExtra = wXBizEntryActivity.getIntent().getStringExtra("key_app_id");
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(stringExtra);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WXBizEntryActivity", "bizPublishWithImageBackToApp, can not find app info, appId = " + stringExtra);
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            com.tencent.mm.opensdk.modelbiz.WXBizPublishWithImage.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXBizPublishWithImage.Resp();
            resp.errStr = str;
            resp.errCode = -3;
            wXBizEntryActivity.f7(bundle, resp, h17);
        }
    }

    public static void b7(com.tencent.mm.plugin.base.stub.WXBizEntryActivity wXBizEntryActivity, int i17, java.lang.String str) {
        wXBizEntryActivity.f93607h.dead();
        java.lang.String stringExtra = wXBizEntryActivity.getIntent().getStringExtra("key_app_id");
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "qrCodePayBackToApp: %s, errMsg: %s", stringExtra, str);
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(stringExtra);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WXBizEntryActivity", "qrCodePayBackToApp can not find app info");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.opensdk.modelbiz.WXQRCodePay.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXQRCodePay.Resp();
        resp.errCode = i17;
        resp.errStr = str;
        resp.openId = h17.field_openId;
        resp.transaction = com.tencent.mm.pluginsdk.ui.tools.n5.f191793a;
        wXBizEntryActivity.f7(bundle, resp, h17);
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0542 A[Catch: Exception -> 0x05cb, TryCatch #3 {Exception -> 0x05cb, blocks: (B:162:0x052c, B:171:0x0534, B:176:0x0542, B:177:0x054b), top: B:160:0x052a }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x054b A[Catch: Exception -> 0x05cb, TRY_LEAVE, TryCatch #3 {Exception -> 0x05cb, blocks: (B:162:0x052c, B:171:0x0534, B:176:0x0542, B:177:0x054b), top: B:160:0x052a }] */
    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X6(com.tencent.mm.pluginsdk.ui.p r23, android.content.Intent r24) {
        /*
            Method dump skipped, instructions count: 2080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.X6(com.tencent.mm.pluginsdk.ui.p, android.content.Intent):void");
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public boolean Y6(android.content.Intent intent) {
        return true;
    }

    public final void c7(final int i17) {
        android.net.Uri uri;
        try {
            uri = getIntent().getData();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizEntryActivity", "get data from intent for finder task failed : %s", e17.getMessage());
            uri = null;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_finder_video_path");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_finder_share_video_jump_info_string");
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_finder_share_video_jump_info_extra_data");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_app_id", getIntent().getStringExtra("key_app_id"));
        bundle.putString("key_finder_video_path", stringExtra);
        if (i17 == 33) {
            bundle.putString("key_finder_share_video_jump_info_string", stringExtra2);
            bundle.putString("key_finder_share_video_jump_info_extra_data", stringExtra3);
        }
        if (uri != null) {
            o25.z.f(this, uri.toString(), getIntent().getIntExtra("translate_link_scene", 1), bundle, new o25.k0() { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.12
                @Override // o25.k0
                public void b(int i18, int i19, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "handleFinderTask, type = %d, DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Boolean.valueOf(z17));
                    com.tencent.mm.plugin.base.stub.WXBizEntryActivity wXBizEntryActivity = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this;
                    if (i18 == 0 || i19 == 0 || !(m1Var instanceof com.tencent.mm.modelsimple.h1)) {
                        wXBizEntryActivity.finish();
                        return;
                    }
                    com.tencent.mm.plugin.base.stub.e0.q(7);
                    r45.zp6 I = ((com.tencent.mm.modelsimple.h1) m1Var).I();
                    if (I == null || wXBizEntryActivity.isFinishing()) {
                        wXBizEntryActivity.finish();
                        return;
                    }
                    com.tencent.mm.plugin.base.stub.WXBizEntryActivity wXBizEntryActivity2 = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this;
                    java.lang.String str2 = I.f392285g;
                    java.lang.String string = wXBizEntryActivity2.getString(com.tencent.mm.R.string.hf8);
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    db5.e1.E(wXBizEntryActivity2, str2 == null ? string : str2, wXBizEntryActivity.getString(com.tencent.mm.R.string.f490573yv), wXBizEntryActivity.getString(com.tencent.mm.R.string.f490507x1), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.12.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i27) {
                            com.tencent.mm.plugin.base.stub.WXBizEntryActivity.AnonymousClass12 anonymousClass12 = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.AnonymousClass12.this;
                            com.tencent.mm.plugin.base.stub.WXBizEntryActivity wXBizEntryActivity3 = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this;
                            int i28 = i17;
                            int i29 = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.f93602m;
                            java.lang.String stringExtra4 = wXBizEntryActivity3.getIntent().getStringExtra("key_app_id");
                            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                            com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(stringExtra4);
                            if (h17 != null) {
                                android.os.Bundle bundle2 = new android.os.Bundle();
                                switch (i28) {
                                    case 33:
                                        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "Finder share video backToApp: %s", stringExtra4);
                                        com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo.Resp();
                                        resp.errCode = -3;
                                        resp.extMsg = "{}";
                                        wXBizEntryActivity3.f7(bundle2, resp, h17);
                                        break;
                                    case 34:
                                        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "Finder open profile backToApp: %s", stringExtra4);
                                        com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile.Resp resp2 = new com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile.Resp();
                                        resp2.errCode = -3;
                                        resp2.extMsg = "{}";
                                        wXBizEntryActivity3.f7(bundle2, resp2, h17);
                                        break;
                                    case 35:
                                        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "Finder open live backToApp: %s", stringExtra4);
                                        com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive.Resp resp3 = new com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive.Resp();
                                        resp3.errCode = -3;
                                        resp3.extMsg = "{}";
                                        wXBizEntryActivity3.f7(bundle2, resp3, h17);
                                        break;
                                    case 36:
                                        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "Finder open feed backToApp: %s", stringExtra4);
                                        com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed.Resp resp4 = new com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed.Resp();
                                        resp4.errCode = -3;
                                        resp4.extMsg = "{}";
                                        wXBizEntryActivity3.f7(bundle2, resp4, h17);
                                        break;
                                    case 39:
                                        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "Finder open feed backToApp: %s", stringExtra4);
                                        com.tencent.mm.opensdk.modelbiz.WXChannelStartLive.Resp resp5 = new com.tencent.mm.opensdk.modelbiz.WXChannelStartLive.Resp();
                                        resp5.errCode = -3;
                                        resp5.extMsg = "{}";
                                        wXBizEntryActivity3.f7(bundle2, resp5, h17);
                                        break;
                                    case 41:
                                        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "Finder open event backToApp: %s", stringExtra4);
                                        com.tencent.mm.opensdk.modelbiz.WXChannelOpenEvent.Resp resp6 = new com.tencent.mm.opensdk.modelbiz.WXChannelOpenEvent.Resp();
                                        resp6.errCode = -3;
                                        resp6.extMsg = "";
                                        wXBizEntryActivity3.f7(bundle2, resp6, h17);
                                        break;
                                    case 42:
                                        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "Finder bind backToApp: %s", stringExtra4);
                                        com.tencent.mm.opensdk.modelbiz.WXChannelBind.Resp resp7 = new com.tencent.mm.opensdk.modelbiz.WXChannelBind.Resp();
                                        resp7.errCode = -3;
                                        wXBizEntryActivity3.f7(bundle2, resp7, h17);
                                        break;
                                }
                            } else {
                                com.tencent.mars.xlog.Log.w("MicroMsg.WXBizEntryActivity", "can not find app info");
                            }
                            com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this.finish();
                        }
                    });
                }
            }, getIntent().getStringExtra("key_package_name"), getIntent().getStringExtra("key_package_signature"));
        }
    }

    public final void d7(java.lang.String str, java.lang.String str2) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
        if (h17 == null) {
            return;
        }
        com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject();
        wXAppExtendObject.extInfo = str2;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXAppExtendObject);
        wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
        wXMediaMessage.messageExt = str2;
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).fj(com.tencent.mm.sdk.platformtools.x2.f193071a, h17.field_appId, wXMediaMessage, 2, null, null);
    }

    public final void e7(java.lang.String str, java.lang.String str2, boolean z17, int i17) {
        com.tencent.mm.pluginsdk.model.app.m mVar;
        com.tencent.mm.opensdk.modelbase.BaseResp baseResp;
        java.lang.String stringExtra = getIntent().getStringExtra("key_app_id");
        try {
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            mVar = com.tencent.mm.pluginsdk.model.app.w.h(stringExtra);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WXBizEntryActivity", e17, "getAppInfo", new java.lang.Object[0]);
            mVar = null;
        }
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizEntryActivity", "launchMiniProgramBackToApp info is null");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (z17) {
            baseResp = new com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken.Resp(bundle);
        } else {
            com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram.Resp(bundle);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "{}";
            }
            resp.extMsg = str;
            baseResp = resp;
        }
        baseResp.errStr = str2;
        baseResp.openId = mVar.field_openId;
        baseResp.errCode = i17;
        f7(bundle, baseResp, mVar);
    }

    public final void f7(android.os.Bundle bundle, com.tencent.mm.opensdk.modelbase.BaseResp baseResp, com.tencent.mm.pluginsdk.model.app.m mVar) {
        baseResp.toBundle(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = mVar.field_packageName;
        args.bundle = bundle;
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        args.flags = 268435456;
        com.tencent.mm.opensdk.channel.MMessageActV2.send(com.tencent.mm.sdk.platformtools.x2.f193071a, args);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r3.numActivities > 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r2 = true;
     */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void finish() {
        /*
            r6 = this;
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.WXBizEntryActivity"
            java.lang.String r2 = "finish stack:%s"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            boolean r0 = r6.isTaskRoot()
            r2 = 0
            if (r0 != 0) goto L1c
            goto L64
        L1c:
            java.lang.Class<android.app.ActivityManager> r0 = android.app.ActivityManager.class
            java.lang.Object r0 = b3.l.getSystemService(r6, r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 != 0) goto L27
            goto L64
        L27:
            java.util.List r0 = r0.getAppTasks()
            if (r0 == 0) goto L64
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L34
            goto L64
        L34:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5a
        L38:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L64
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L5a
            android.app.ActivityManager$AppTask r3 = (android.app.ActivityManager.AppTask) r3     // Catch: java.lang.Throwable -> L5a
            android.app.ActivityManager$RecentTaskInfo r3 = r3.getTaskInfo()     // Catch: java.lang.Throwable -> L5a
            if (r3 != 0) goto L4b
            goto L38
        L4b:
            int r4 = r3.id     // Catch: java.lang.Throwable -> L5a
            int r5 = r6.getTaskId()     // Catch: java.lang.Throwable -> L5a
            if (r4 != r5) goto L38
            int r0 = r3.numActivities     // Catch: java.lang.Throwable -> L5a
            r1 = 1
            if (r0 > r1) goto L64
            r2 = r1
            goto L64
        L5a:
            r0 = move-exception
            java.lang.String r3 = "shouldRemoveTaskOnFinish check task get exception %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.tencent.mars.xlog.Log.e(r1, r3, r0)
        L64:
            if (r2 == 0) goto L6a
            super.finishAndRemoveTask()
            goto L6d
        L6a:
            super.finish()
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.finish():void");
    }

    public final void g7(final boolean z17) {
        runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.16
            @Override // java.lang.Runnable
            public void run() {
                android.view.View findViewById = com.tencent.mm.plugin.base.stub.WXBizEntryActivity.this.findViewById(com.tencent.mm.R.id.jmb);
                if (findViewById != null) {
                    int i17 = z17 ? 0 : 8;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/base/stub/WXBizEntryActivity$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/base/stub/WXBizEntryActivity$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        });
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488222l1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void hideAllManagedDialogs() {
        super.hideAllManagedDialogs();
        g7(false);
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f93605f = com.tencent.mm.plugin.base.stub.e0.m(getIntent());
        if (gm0.j1.b().n() && !gm0.m.r()) {
            android.content.Intent intent = getIntent();
            synchronized (com.tencent.mm.plugin.base.stub.e0.class) {
                if (com.tencent.mm.plugin.base.stub.e0.l()) {
                    long longExtra = intent.getLongExtra("__BIZ_ENTRY_ENTER_ID", 0L);
                    if (longExtra != 0) {
                        ((java.util.HashSet) com.tencent.mm.plugin.base.stub.e0.f93733c).add(java.lang.Long.valueOf(longExtra));
                        if (com.tencent.mm.sdk.platformtools.c2.i(com.tencent.mm.plugin.base.stub.e0.f93732b, "__BIZ_ENTRY_ENTER_ID", 0L) == longExtra) {
                            synchronized (com.tencent.mm.plugin.base.stub.e0.class) {
                                com.tencent.mm.plugin.base.stub.e0.f93732b = null;
                            }
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "Safe Launch WXBizEntry addToConsumedSet %d", java.lang.Long.valueOf(longExtra));
                }
            }
        }
        setTheme(com.tencent.mm.R.style.f494401m3);
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "onCreate");
        if (com.tencent.mm.plugin.base.stub.e0.l()) {
            boolean booleanExtra = getIntent().getBooleanExtra("__BIZ_ENTRY_FROM_RETRY", false);
            if (this.f93605f) {
                com.tencent.mm.plugin.base.stub.e0.q(booleanExtra ? 32 : 33);
                com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "Safe Launch WXBizEntry isInConsumedSet finished");
                finish();
                return;
            }
            com.tencent.mm.plugin.base.stub.e0.q(booleanExtra ? 34 : 35);
        }
        setTitleVisibility(0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(9);
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "onDestroy()");
        super.onDestroy();
        this.f93607h.dead();
        com.tencent.mm.sdk.event.IListener iListener = this.f93603d;
        if (iListener != null) {
            iListener.dead();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "onNewIntent");
        this.f93608i = false;
        com.tencent.mm.sdk.event.IListener iListener = this.f93603d;
        if (iListener != null) {
            iListener.dead();
            this.f93603d = null;
        }
        g7(true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "onPause");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizEntryActivity", "onResume, mDoFinishOnNextResume[%b]", java.lang.Boolean.valueOf(this.f93608i));
        if (this.f93608i) {
            finish();
        }
    }
}
