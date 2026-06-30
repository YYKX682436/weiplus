package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* renamed from: com.tencent.mm.plugin.base.stub.WXBizEntryActivity */
/* loaded from: classes9.dex */
public class ActivityC12935xbbbe044f extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f175135m = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f175137e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f175138f;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f175136d = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f175139g = false;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f175140h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5207x4c38dee1>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.14

        /* renamed from: d, reason: collision with root package name */
        public final int f175158d = 3;

        {
            this.f39173x3fe91575 = -1359897903;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5207x4c38dee1 c5207x4c38dee1) {
            am.e1 e1Var = c5207x4c38dee1.f135547g;
            boolean z17 = e1Var.f88051c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f activityC12935xbbbe044f = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this;
            if (!z17) {
                activityC12935xbbbe044f.finish();
                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.b7(activityC12935xbbbe044f, -2, "cancel");
                return true;
            }
            if (e1Var.f88054f != this.f175158d) {
                return true;
            }
            activityC12935xbbbe044f.finish();
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.b7(activityC12935xbbbe044f, 0, "ok");
            return true;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    public boolean f175141i = false;

    /* renamed from: com.tencent.mm.plugin.base.stub.WXBizEntryActivity$15, reason: invalid class name */
    /* loaded from: classes9.dex */
    class AnonymousClass15 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.Req f175160d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f175161e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f175162f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ r45.yp6 f175163g;

        public AnonymousClass15(com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.Req req, java.lang.String str, java.lang.String str2, r45.yp6 yp6Var) {
            this.f175160d = req;
            this.f175161e = str;
            this.f175162f = str2;
            this.f175163g = yp6Var;
        }

        @Override // com.p314xaae8f345.mm.p944x882e457a.e3
        /* renamed from: callback */
        public int mo1034xf5bc2045(int i17, final int i18, final java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
            final r45.zp6 zp6Var = (r45.zp6) oVar.f152244b.f152233a;
            java.lang.String str2 = this.f175161e;
            com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.Req req = this.f175160d;
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXBizEntryActivity", "doLaunchWxaRedirectingPage, with ticket[%s] hostAppId[%s], cgi failed, errType[%d] errCode[%d] errMsg[%s]", req.f32990xe4e861a4, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.s(5);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.15.1
                    @Override // java.lang.Runnable
                    public void run() {
                        r45.zp6 zp6Var2 = zp6Var;
                        java.lang.String str3 = zp6Var2 != null ? zp6Var2.f473818g : null;
                        boolean isEmpty = android.text.TextUtils.isEmpty(str3);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.AnonymousClass15 anonymousClass15 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.AnonymousClass15.this;
                        if (isEmpty) {
                            str3 = str;
                            if (android.text.TextUtils.isEmpty(str3)) {
                                str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hf8);
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f activityC12935xbbbe044f = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this;
                        db5.e1.E(activityC12935xbbbe044f, str3, activityC12935xbbbe044f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.15.1.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.AnonymousClass15.AnonymousClass1 anonymousClass1 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.AnonymousClass15.AnonymousClass1.this;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.AnonymousClass15 anonymousClass152 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.AnonymousClass15.this;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.v(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this, anonymousClass152.f175160d, anonymousClass152.f175162f, i18, str);
                            }
                        });
                    }
                });
                return 0;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = zp6Var.f473826r;
            java.lang.String str3 = this.f175162f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f activity = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this;
            if (gVar == null || gVar.f273689a.length <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.s(6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXBizEntryActivity", "doLaunchWxaRedirectingPage, with ticket[%s] hostAppId[%s], get invalid wxa_runtime_buff from cgi", req.f32990xe4e861a4, str2);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable(this) { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.15.2
                    @Override // java.lang.Runnable
                    public void run() {
                        dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.lbo, 0).show();
                    }
                });
                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.v(activity, req, str3, -1, "Invalid wxa_runtime_buff");
                return 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.s(4);
            android.util.Pair ne6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).ne(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this, this.f175160d, ((r45.y7) this.f175163g.f472812g.getFirst()).f472365e, zp6Var.f473817f, zp6Var.f473826r.i());
            if (((java.lang.Integer) ne6.first).intValue() != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.v(activity, req, str3, ((java.lang.Integer) ne6.first).intValue(), (java.lang.String) ne6.second);
            } else {
                java.lang.String invokeTicket = req.f32990xe4e861a4;
                fm1.b bVar = fm1.b.f345547a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeTicket, "invokeTicket");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                fm1.b.f345548b.put(invokeTicket.hashCode(), activity);
            }
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.base.stub.WXBizEntryActivity$1DeepLinkCallback, reason: invalid class name */
    /* loaded from: classes9.dex */
    class C1DeepLinkCallback implements o25.k0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.g6, o25.b2, o25.c2 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f175172a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f175173b;

        public C1DeepLinkCallback(java.lang.String str, java.lang.String str2) {
            this.f175172a = str;
            this.f175173b = str2;
        }

        @Override // o25.b2
        public java.lang.String a() {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str = this.f175173b;
            return str == null ? "" : str;
        }

        @Override // o25.k0
        public void b(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "openBusinessView, DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f activityC12935xbbbe044f = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this;
            if (m1Var != null && (((!z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) || (i17 != 0 && i18 != 0)) && (m1Var instanceof com.p314xaae8f345.mm.p957x53236a1b.h1))) {
                r45.zp6 I = ((com.p314xaae8f345.mm.p957x53236a1b.h1) m1Var).I();
                if (I == null || activityC12935xbbbe044f.isFinishing()) {
                    activityC12935xbbbe044f.finish();
                    return;
                }
                java.lang.String str2 = I.f473818g;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 != null) {
                    str = str2;
                }
                final java.lang.String string = str == null ? activityC12935xbbbe044f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hf8) : str;
                db5.e1.E(activityC12935xbbbe044f, string, activityC12935xbbbe044f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC12935xbbbe044f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.1DeepLinkCallback.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.C1DeepLinkCallback c1DeepLinkCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.C1DeepLinkCallback.this;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f activityC12935xbbbe044f2 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this;
                        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.f175135m;
                        java.lang.String stringExtra = activityC12935xbbbe044f2.getIntent().getStringExtra("key_app_id");
                        java.lang.String stringExtra2 = activityC12935xbbbe044f2.getIntent().getStringExtra("key_business_type");
                        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(stringExtra);
                        if (h17 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXBizEntryActivity", "launchFakeMiniProgramBackToApp info is null");
                        } else {
                            android.os.Bundle bundle = new android.os.Bundle();
                            com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11259xee7a56f0.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11259xee7a56f0.Resp(bundle);
                            resp.f32999xb32a65a0 = "{}";
                            resp.f32868xb2d5068c = string;
                            resp.f32869xc3c3c505 = h17.f67384x996f3ea;
                            resp.f32867xa7c470f2 = -3;
                            resp.f32998xd7e6e31a = stringExtra2;
                            resp.f32870x7fa0d2de = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n5.f273326a;
                            activityC12935xbbbe044f2.f7(bundle, resp, h17);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this.finish();
                    }
                });
                return;
            }
            if ("nativeOpenAdCanvas".equals(activityC12935xbbbe044f.getIntent().getStringExtra("key_business_type"))) {
                l64.a.d(l64.a.b(activityC12935xbbbe044f.getIntent().getStringExtra("key_app_id"), this.f175172a), 2);
            }
            if (!(m1Var instanceof com.p314xaae8f345.mm.p957x53236a1b.h1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXBizEntryActivity", "openBusinessView, DeepLinkHelper.DeepLinkCallback, scene is not NetSceneTranslateLink, finish activity");
                activityC12935xbbbe044f.finish();
                return;
            }
            r45.zp6 zp6Var = (r45.zp6) ((com.p314xaae8f345.mm.p957x53236a1b.h1) m1Var).f152870e.f152244b.f152233a;
            java.lang.String str3 = zp6Var == null ? null : zp6Var.f473817f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "openBusinessView, DeepLinkHelper.DeepLinkCallback transUri[%s]", str3);
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if ((str3 == null ? "" : str3).startsWith("weixin://dl/jumpFakeWxa/")) {
                return;
            }
            if (str3 == null) {
                str3 = "";
            }
            if (str3.startsWith("weixin://dl/openLiteApp/")) {
                return;
            }
            activityC12935xbbbe044f.finish();
        }

        @Override // o25.c2
        public void c() {
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this.finish();
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.g6
        public void d() {
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f activityC12935xbbbe044f = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = activityC12935xbbbe044f.f175136d;
            if (abstractC20980x9b9ad01d != null) {
                abstractC20980x9b9ad01d.mo48814x2efc64();
                activityC12935xbbbe044f.f175136d = null;
            }
            activityC12935xbbbe044f.f175136d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12573x6a664d3b>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.1DeepLinkCallback.2
                {
                    this.f39173x3fe91575 = 551436157;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12573x6a664d3b c12573x6a664d3b) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this.finish();
                    return false;
                }
            };
            activityC12935xbbbe044f.f175136d.mo48813x58998cd();
            activityC12935xbbbe044f.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "setDoFinishOnNextResume");
            activityC12935xbbbe044f.f175141i = true;
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.g6
        public void e() {
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this.finish();
        }

        @Override // o25.c2
        public void f() {
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this.finish();
        }
    }

    public static void a7(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f activityC12935xbbbe044f, java.lang.String str) {
        java.lang.String stringExtra = activityC12935xbbbe044f.getIntent().getStringExtra("key_app_id");
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(stringExtra);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WXBizEntryActivity", "bizPublishWithImageBackToApp, can not find app info, appId = " + stringExtra);
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11242x986d7a78.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11242x986d7a78.Resp();
            resp.f32868xb2d5068c = str;
            resp.f32867xa7c470f2 = -3;
            activityC12935xbbbe044f.f7(bundle, resp, h17);
        }
    }

    public static void b7(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f activityC12935xbbbe044f, int i17, java.lang.String str) {
        activityC12935xbbbe044f.f175140h.mo48814x2efc64();
        java.lang.String stringExtra = activityC12935xbbbe044f.getIntent().getStringExtra("key_app_id");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "qrCodePayBackToApp: %s, errMsg: %s", stringExtra, str);
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(stringExtra);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WXBizEntryActivity", "qrCodePayBackToApp can not find app info");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11265x5e1ae059.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11265x5e1ae059.Resp();
        resp.f32867xa7c470f2 = i17;
        resp.f32868xb2d5068c = str;
        resp.f32869xc3c3c505 = h17.f67384x996f3ea;
        resp.f32870x7fa0d2de = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n5.f273326a;
        activityC12935xbbbe044f.f7(bundle, resp, h17);
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0542 A[Catch: Exception -> 0x05cb, TryCatch #3 {Exception -> 0x05cb, blocks: (B:162:0x052c, B:171:0x0534, B:176:0x0542, B:177:0x054b), top: B:160:0x052a }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x054b A[Catch: Exception -> 0x05cb, TRY_LEAVE, TryCatch #3 {Exception -> 0x05cb, blocks: (B:162:0x052c, B:171:0x0534, B:176:0x0542, B:177:0x054b), top: B:160:0x052a }] */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p r23, android.content.Intent r24) {
        /*
            Method dump skipped, instructions count: 2080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.X6(com.tencent.mm.pluginsdk.ui.p, android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean Y6(android.content.Intent intent) {
        return true;
    }

    public final void c7(final int i17) {
        android.net.Uri uri;
        try {
            uri = getIntent().getData();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXBizEntryActivity", "get data from intent for finder task failed : %s", e17.getMessage());
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
                public void b(int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "handleFinderTask, type = %d, DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Boolean.valueOf(z17));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f activityC12935xbbbe044f = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this;
                    if (i18 == 0 || i19 == 0 || !(m1Var instanceof com.p314xaae8f345.mm.p957x53236a1b.h1)) {
                        activityC12935xbbbe044f.finish();
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.q(7);
                    r45.zp6 I = ((com.p314xaae8f345.mm.p957x53236a1b.h1) m1Var).I();
                    if (I == null || activityC12935xbbbe044f.isFinishing()) {
                        activityC12935xbbbe044f.finish();
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f activityC12935xbbbe044f2 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this;
                    java.lang.String str2 = I.f473818g;
                    java.lang.String string = activityC12935xbbbe044f2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hf8);
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    db5.e1.E(activityC12935xbbbe044f2, str2 == null ? string : str2, activityC12935xbbbe044f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC12935xbbbe044f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.12.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i27) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.AnonymousClass12 anonymousClass12 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.AnonymousClass12.this;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f activityC12935xbbbe044f3 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this;
                            int i28 = i17;
                            int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.f175135m;
                            java.lang.String stringExtra4 = activityC12935xbbbe044f3.getIntent().getStringExtra("key_app_id");
                            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(stringExtra4);
                            if (h17 != null) {
                                android.os.Bundle bundle2 = new android.os.Bundle();
                                switch (i28) {
                                    case 33:
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "Finder share video backToApp: %s", stringExtra4);
                                        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11251xb1ce4c5e.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11251xb1ce4c5e.Resp();
                                        resp.f32867xa7c470f2 = -3;
                                        resp.f32968xb32a65a0 = "{}";
                                        activityC12935xbbbe044f3.f7(bundle2, resp, h17);
                                        break;
                                    case 34:
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "Finder open profile backToApp: %s", stringExtra4);
                                        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11250x617b5fbd.Resp resp2 = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11250x617b5fbd.Resp();
                                        resp2.f32867xa7c470f2 = -3;
                                        resp2.f32962xb32a65a0 = "{}";
                                        activityC12935xbbbe044f3.f7(bundle2, resp2, h17);
                                        break;
                                    case 35:
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "Finder open live backToApp: %s", stringExtra4);
                                        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11249xb63fb358.Resp resp3 = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11249xb63fb358.Resp();
                                        resp3.f32867xa7c470f2 = -3;
                                        resp3.f32959xb32a65a0 = "{}";
                                        activityC12935xbbbe044f3.f7(bundle2, resp3, h17);
                                        break;
                                    case 36:
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "Finder open feed backToApp: %s", stringExtra4);
                                        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11248xb63ce80a.Resp resp4 = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11248xb63ce80a.Resp();
                                        resp4.f32867xa7c470f2 = -3;
                                        resp4.f32955xb32a65a0 = "{}";
                                        activityC12935xbbbe044f3.f7(bundle2, resp4, h17);
                                        break;
                                    case 39:
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "Finder open feed backToApp: %s", stringExtra4);
                                        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11252x37adebac.Resp resp5 = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11252x37adebac.Resp();
                                        resp5.f32867xa7c470f2 = -3;
                                        resp5.f32970xb32a65a0 = "{}";
                                        activityC12935xbbbe044f3.f7(bundle2, resp5, h17);
                                        break;
                                    case 41:
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "Finder open event backToApp: %s", stringExtra4);
                                        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11247x1159bdae.Resp resp6 = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11247x1159bdae.Resp();
                                        resp6.f32867xa7c470f2 = -3;
                                        resp6.f32950xb32a65a0 = "";
                                        activityC12935xbbbe044f3.f7(bundle2, resp6, h17);
                                        break;
                                    case 42:
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "Finder bind backToApp: %s", stringExtra4);
                                        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11244x2750923f.Resp resp7 = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11244x2750923f.Resp();
                                        resp7.f32867xa7c470f2 = -3;
                                        activityC12935xbbbe044f3.f7(bundle2, resp7, h17);
                                        break;
                                }
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WXBizEntryActivity", "can not find app info");
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this.finish();
                        }
                    });
                }
            }, getIntent().getStringExtra("key_package_name"), getIntent().getStringExtra("key_package_signature"));
        }
    }

    public final void d7(java.lang.String str, java.lang.String str2) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
        if (h17 == null) {
            return;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699 c11272xd6622699 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699();
        c11272xd6622699.f33061xb2206a6f = str2;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(c11272xd6622699);
        c11286x34a5504.f33127xc9f07109 = com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a;
        c11286x34a5504.f33125x9b39409a = str2;
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).fj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, h17.f67370x28d45f97, c11286x34a5504, 2, null, null);
    }

    public final void e7(java.lang.String str, java.lang.String str2, boolean z17, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar;
        com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 abstractC11230x9d3d6a61;
        java.lang.String stringExtra = getIntent().getStringExtra("key_app_id");
        try {
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            mVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(stringExtra);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WXBizEntryActivity", e17, "getAppInfo", new java.lang.Object[0]);
            mVar = null;
        }
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXBizEntryActivity", "launchMiniProgramBackToApp info is null");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (z17) {
            abstractC11230x9d3d6a61 = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11256xe1f5f53a.Resp(bundle);
        } else {
            com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11255xf99ecb99.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11255xf99ecb99.Resp(bundle);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "{}";
            }
            resp.f32981xb32a65a0 = str;
            abstractC11230x9d3d6a61 = resp;
        }
        abstractC11230x9d3d6a61.f32868xb2d5068c = str2;
        abstractC11230x9d3d6a61.f32869xc3c3c505 = mVar.f67384x996f3ea;
        abstractC11230x9d3d6a61.f32867xa7c470f2 = i17;
        f7(bundle, abstractC11230x9d3d6a61, mVar);
    }

    public final void f7(android.os.Bundle bundle, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 abstractC11230x9d3d6a61, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        abstractC11230x9d3d6a61.mo48431x792022dd(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = mVar.f67386xa1e9e82c;
        args.f32701xaddf3082 = bundle;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.h(bundle);
        args.f32703x5cfee87 = 268435456;
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, args);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r3.numActivities > 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r2 = true;
     */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            boolean r0 = r6.isTaskRoot()
            r2 = 0
            if (r0 != 0) goto L1c
            goto L64
        L1c:
            java.lang.Class<android.app.ActivityManager> r0 = android.app.ActivityManager.class
            java.lang.Object r0 = b3.l.m9714xac92a5d0(r6, r0)
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r3, r0)
        L64:
            if (r2 == 0) goto L6a
            super.finishAndRemoveTask()
            goto L6d
        L6a:
            super.finish()
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.finish():void");
    }

    public final void g7(final boolean z17) {
        runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.base.stub.WXBizEntryActivity.16
            @Override // java.lang.Runnable
            public void run() {
                android.view.View findViewById = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.this.findViewById(com.p314xaae8f345.mm.R.id.jmb);
                if (findViewById != null) {
                    int i17 = z17 ? 0 : 8;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/base/stub/WXBizEntryActivity$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/base/stub/WXBizEntryActivity$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569755l1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: hideAllManagedDialogs */
    public void mo54210xbb94da6b() {
        super.mo54210xbb94da6b();
        g7(false);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f175138f = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.m(getIntent());
        if (gm0.j1.b().n() && !gm0.m.r()) {
            android.content.Intent intent = getIntent();
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.class) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.l()) {
                    long longExtra = intent.getLongExtra("__BIZ_ENTRY_ENTER_ID", 0L);
                    if (longExtra != 0) {
                        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.f175266c).add(java.lang.Long.valueOf(longExtra));
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.i(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.f175265b, "__BIZ_ENTRY_ENTER_ID", 0L) == longExtra) {
                            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.class) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.f175265b = null;
                            }
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizLogic", "Safe Launch WXBizEntry addToConsumedSet %d", java.lang.Long.valueOf(longExtra));
                }
            }
        }
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575934m3);
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "onCreate");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.l()) {
            boolean booleanExtra = getIntent().getBooleanExtra("__BIZ_ENTRY_FROM_RETRY", false);
            if (this.f175138f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.q(booleanExtra ? 32 : 33);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "Safe Launch WXBizEntry isInConsumedSet finished");
                finish();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.q(booleanExtra ? 34 : 35);
        }
        m78596x71afbec8(0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        mo2550x7c2abd06(9);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "onDestroy()");
        super.onDestroy();
        this.f175140h.mo48814x2efc64();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f175136d;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "onNewIntent");
        this.f175141i = false;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f175136d;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
            this.f175136d = null;
        }
        g7(true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "onPause");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizEntryActivity", "onResume, mDoFinishOnNextResume[%b]", java.lang.Boolean.valueOf(this.f175141i));
        if (this.f175141i) {
            finish();
        }
    }
}
