package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService */
/* loaded from: classes7.dex */
public enum EnumC12202xa98118f8 {
    INSTANCE;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService$1WxPayActivityResultAdapter, reason: invalid class name */
    /* loaded from: classes7.dex */
    public class C1WxPayActivityResultAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final int f164049a;

        /* renamed from: b, reason: collision with root package name */
        public final android.content.Intent f164050b;

        public C1WxPayActivityResultAdapter(int i17, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.PayResultCallbackReason payResultCallbackReason) {
            this.f164049a = i17;
            this.f164050b = intent;
        }

        public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.C1WxPayCallbackResult a() {
            android.content.Intent intent = this.f164050b;
            int intExtra = intent != null ? intent.getIntExtra("key_is_clear_failure", -1) : -1;
            java.util.HashMap hashMap = new java.util.HashMap();
            if (intExtra == 0) {
                hashMap.put("payStatus", "pending");
            } else if (intExtra == 1) {
                hashMap.put("pay_status", "fail");
            }
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("key_pay_fail_reason");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    hashMap.put("fail_reason", stringExtra);
                }
                java.lang.String stringExtra2 = intent.getStringExtra("key_pay_completed_data");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    hashMap.put("payCompletedData", stringExtra2);
                }
                java.lang.String stringExtra3 = intent.getStringExtra("key_pay_overseaPayData");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                    hashMap.put("overseaPayData", stringExtra3);
                }
            }
            int i17 = this.f164049a;
            if (i17 == -1) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.C1WxPayCallbackResult(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.this, 1, 0, null, hashMap);
            }
            if (i17 != 5) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.C1WxPayCallbackResult(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.this, 3, 0, null, hashMap);
            }
            int intExtra2 = intent.getIntExtra("key_jsapi_pay_err_code", 0);
            java.lang.String stringExtra4 = intent.getStringExtra("key_jsapi_pay_err_msg");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            java.lang.String str = stringExtra4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApiPayService", "errCode: %d, errMsg: %s", java.lang.Integer.valueOf(intExtra2), str);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.C1WxPayCallbackResult(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.this, 2, intExtra2, str, hashMap);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService$1WxPayCallbackResult, reason: invalid class name */
    /* loaded from: classes7.dex */
    public class C1WxPayCallbackResult {

        /* renamed from: a, reason: collision with root package name */
        public final int f164052a;

        /* renamed from: b, reason: collision with root package name */
        public final int f164053b;

        /* renamed from: c, reason: collision with root package name */
        public final java.lang.String f164054c;

        /* renamed from: d, reason: collision with root package name */
        public final java.util.Map f164055d;

        public C1WxPayCallbackResult(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8 enumC12202xa98118f8, int i17, int i18, java.lang.String str, java.util.Map map) {
            this.f164052a = i17;
            this.f164053b = i18;
            this.f164054c = str;
            this.f164055d = map;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService$1WxPayResultDispatcher, reason: invalid class name */
    /* loaded from: classes7.dex */
    public class C1WxPayResultDispatcher {

        /* renamed from: a, reason: collision with root package name */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.C1WxPayActivityResultAdapter f164056a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.h f164057b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e f164058c;

        public C1WxPayResultDispatcher(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e eVar) {
            this.f164057b = hVar;
            this.f164058c = eVar;
        }

        public void a(int i17, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.PayResultCallbackReason payResultCallbackReason) {
            java.lang.String str;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.C1WxPayActivityResultAdapter c1WxPayActivityResultAdapter = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.C1WxPayActivityResultAdapter(i17, intent, payResultCallbackReason);
            this.f164056a = c1WxPayActivityResultAdapter;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.PayResultCallbackReason payResultCallbackReason2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.PayResultCallbackReason.SuccessAheadCallback;
            if ((payResultCallbackReason == payResultCallbackReason2 || payResultCallbackReason != payResultCallbackReason2) && payResultCallbackReason == payResultCallbackReason2 && (this.f164057b instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.i)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.C1WxPayCallbackResult a17 = c1WxPayActivityResultAdapter.a();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.i iVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.i) this.f164057b;
                int i18 = a17.f164052a;
                java.lang.String str2 = a17.f164054c;
                java.util.Map map = a17.f164055d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.v1 v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.v1) iVar;
                v1Var.getClass();
                if (i18 == 1) {
                    str = "ok";
                } else if (i18 != 2) {
                    str = "fail cancel";
                } else {
                    str = "fail:" + str2;
                }
                java.lang.String callbackStr = v1Var.f164222e.p(str, map);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestPayment", "onPayResultBeforeUserInteractionEnd result:%d, callbackStr:%s", java.lang.Integer.valueOf(i18), callbackStr);
                if (v1Var.f164218a.mo32091x9a3f0ba2() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.d dVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t) v1Var.f164218a.mo32091x9a3f0ba2()).f167202p3;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.x component = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.x) v1Var.f164218a;
                    int i19 = v1Var.f164219b;
                    dVar.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackStr, "callbackStr");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.w wVar = dVar.f167111b;
                    if (wVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("invokeProcess");
                        throw null;
                    }
                    wVar.b(component, i19, callbackStr);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestPayment", "runtime is FunctionalRuntime");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestPayment", "runtime is normal");
                    if (i18 == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x1 x1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x1();
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            java.lang.String str3 = "";
                            java.lang.String obj = map.get("payCompletedData") != null ? map.get("payCompletedData").toString() : "";
                            if (obj == null) {
                                obj = "";
                            }
                            jSONObject.put("payCompletedData", obj);
                            java.lang.String str4 = v1Var.f164221d;
                            if (str4 != null) {
                                str3 = str4;
                            }
                            jSONObject.put("requestId", str3);
                        } catch (org.json.JSONException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestPayment", "put JSON data error : %s", e17);
                        }
                        x1Var.f163907f = jSONObject.toString();
                        v1Var.f164218a.p(x1Var);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestPayment", "send onPayResultBeforeUserInteractionEndJsApiEvent jsonObject:%s", jSONObject);
                    }
                }
                vd1.g gVar = v1Var.f164220c;
                if (gVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.u0.a(gVar, v1Var.f164218a.mo48798x74292566(), callbackStr);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService$PayResultCallbackReason */
    /* loaded from: classes6.dex */
    public enum PayResultCallbackReason {
        SuccessAheadCallback,
        ActivityResult
    }

    /* renamed from: sendBizRedPacket */
    public void m51166x2ae7404e(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, org.json.JSONObject jSONObject, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.h hVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62(jSONObject);
        c19761xc2874b62.f273677v = 16;
        final com.p314xaae8f345.mm.ui.da daVar = new com.p314xaae8f345.mm.ui.da() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.7
            @Override // com.p314xaae8f345.mm.ui.xc
            /* renamed from: mmOnActivityResult */
            public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
                if (i17 != (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.this.hashCode() & 65535)) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.h hVar2 = hVar;
                if (i18 == -1) {
                    if (hVar2 != null) {
                        hVar2.a(1, 0, null, null);
                    }
                } else if (i18 == 2) {
                    if (hVar2 != null) {
                        hVar2.a(2, 0, intent != null ? intent.getStringExtra("key_result_errmsg") : "", null);
                    }
                } else if (hVar2 != null) {
                    hVar2.a(3, 0, null, null);
                }
            }
        };
        final android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_way", 3);
        intent.putExtra("appId", c19761xc2874b62.f273662d);
        intent.putExtra("timeStamp", c19761xc2874b62.f273666h);
        intent.putExtra("nonceStr", c19761xc2874b62.f273665g);
        intent.putExtra("packageExt", c19761xc2874b62.f273667i);
        intent.putExtra("signtype", c19761xc2874b62.f273664f);
        intent.putExtra("paySignature", c19761xc2874b62.f273671p);
        intent.putExtra("key_static_from_scene", 100004);
        intent.putExtra("url", c19761xc2874b62.f273673r);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f.b(activity, new yz5.l() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.8
            @Override // yz5.l
            /* renamed from: invoke */
            public java.lang.Object mo146xb9724478(java.lang.Object obj) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) obj;
                abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(daVar);
                j45.l.o(abstractActivityC21394xb3d2c0cf, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", intent, 65535 & com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.this.hashCode(), false);
                return jz5.f0.f384359a;
            }
        });
    }

    /* renamed from: startBindBankcard */
    public void m51167xaba2942b(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, final org.json.JSONObject jSONObject, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.h hVar) {
        final com.p314xaae8f345.mm.ui.da daVar = new com.p314xaae8f345.mm.ui.da() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.5
            @Override // com.p314xaae8f345.mm.ui.xc
            /* renamed from: mmOnActivityResult */
            public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
                if (i17 != (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.this.hashCode() & 65535)) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.h hVar2 = hVar;
                if (i18 == -1) {
                    if (hVar2 != null) {
                        hVar2.a(1, 0, null, null);
                    }
                } else if (hVar2 != null) {
                    hVar2.a(2, 0, null, null);
                }
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f.b(activity, new yz5.l() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.6
            @Override // yz5.l
            /* renamed from: invoke */
            public java.lang.Object mo146xb9724478(java.lang.Object obj) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62(jSONObject);
                c19761xc2874b62.f273676u = 4;
                ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).Ai((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) obj, c19761xc2874b62, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.this.hashCode() & 65535, daVar);
                return jz5.f0.f384359a;
            }
        });
    }

    /* renamed from: startPay */
    public boolean m51168x4e7c80e6(android.app.Activity activity, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, org.json.JSONObject jSONObject, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.h hVar, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081) {
        final com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62(jSONObject);
        if (c12559xbdae8559 != null) {
            c19761xc2874b62.f273677v = com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62.a(c12559xbdae8559.f169323f, c12559xbdae8559.f169326i);
            int i17 = c12559xbdae8559.f169323f;
            c19761xc2874b62.f273679x = i17;
            c19761xc2874b62.f273678w = c12559xbdae8559.f169332r;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiPayService", "startPay wxAppScene:%d, appId:%s", java.lang.Integer.valueOf(i17), d0Var.mo48798x74292566());
        }
        c19761xc2874b62.f273675t = 46;
        if (jSONObject.has("pay_scene")) {
            c19761xc2874b62.f273675t = jSONObject.optInt("pay_scene");
        }
        if (jSONObject.has("amount")) {
            c19761xc2874b62.f273680y = java.lang.String.valueOf(jSONObject.optInt("amount"));
        }
        java.lang.String optString = jSONObject.optString("adUxInfo");
        c19761xc2874b62.H = optString;
        qp3.a.c("AppBrandRuntime", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1.f34665x24728b, optString, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        java.lang.String optString2 = jSONObject.optString("commonUxInfo");
        c19761xc2874b62.I = optString2;
        qp3.a.d("AppBrandRuntime", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1.f34665x24728b, optString2, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        c19772x1c2cd081.f38869x6ac9171 = c19761xc2874b62.f273667i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e eVar = hd1.w.f361968c.b(d0Var) ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e.class) : null;
        final int hashCode = hashCode() & 65535;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.C1WxPayResultDispatcher c1WxPayResultDispatcher = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.C1WxPayResultDispatcher(hVar, eVar);
        c19761xc2874b62.X = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.x0.a(new p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c(this, c1WxPayResultDispatcher) { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.1PaySuccessAheadCallbackResultReceiver

            /* renamed from: g, reason: collision with root package name */
            public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.C1WxPayResultDispatcher f164048g;

            {
                super(new android.os.Handler(android.os.Looper.getMainLooper()));
                this.f164048g = c1WxPayResultDispatcher;
            }

            @Override // p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c
            public void a(int i18, android.os.Bundle bundle) {
                bundle.setClassLoader(com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62.class.getClassLoader());
                this.f164048g.a(i18, new android.content.Intent().putExtras(bundle), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.PayResultCallbackReason.SuccessAheadCallback);
            }
        }, activity);
        if (d0Var.mo32091x9a3f0ba2() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) {
            c19761xc2874b62.f273681z = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) d0Var.mo32091x9a3f0ba2()).e3() ? 1 : 0;
        }
        if (eVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j5) eVar).a(false);
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f.c(activity, new yz5.l(this) { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.1
            @Override // yz5.l
            /* renamed from: invoke */
            public java.lang.Object mo146xb9724478(java.lang.Object obj) {
                og0.o oVar = (og0.o) i95.n0.c(og0.o.class);
                com.p314xaae8f345.mm.ui.da daVar = new com.p314xaae8f345.mm.ui.da() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.1.1
                    @Override // com.p314xaae8f345.mm.ui.xc
                    /* renamed from: mmOnActivityResult */
                    public void mo9729x757c998b(int i18, int i19, android.content.Intent intent) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.AnonymousClass1 anonymousClass1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.AnonymousClass1.this;
                        if (hashCode == i18) {
                            c1WxPayResultDispatcher.a(i19, intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.PayResultCallbackReason.ActivityResult);
                            return;
                        }
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        objArr[0] = d0Var.mo48798x74292566();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.h hVar2 = hVar;
                        objArr[1] = java.lang.Integer.valueOf(hVar2 != null ? hVar2.hashCode() : 0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandJsApiPayService", "startPay mismatch requestCode, appId:%s, listener.hash[%d]", objArr);
                    }
                };
                ((ng0.q) oVar).getClass();
                h45.a0.d((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) obj, c19761xc2874b62, hashCode, daVar);
                return jz5.f0.f384359a;
            }
        }, new nf.j(this) { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.2
            @Override // nf.j
            /* renamed from: onResult */
            public void mo14598x57429edc(int i18, android.content.Intent intent) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.PayResultCallbackReason payResultCallbackReason = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.PayResultCallbackReason.ActivityResult;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.C1WxPayResultDispatcher c1WxPayResultDispatcher2 = c1WxPayResultDispatcher;
                c1WxPayResultDispatcher2.a(i18, intent, payResultCallbackReason);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e eVar2 = c1WxPayResultDispatcher2.f164058c;
                if (eVar2 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j5) eVar2).a(true);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.C1WxPayActivityResultAdapter c1WxPayActivityResultAdapter = c1WxPayResultDispatcher2.f164056a;
                java.util.Objects.requireNonNull(c1WxPayActivityResultAdapter);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.C1WxPayCallbackResult a17 = c1WxPayActivityResultAdapter.a();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.h hVar2 = c1WxPayResultDispatcher2.f164057b;
                if (hVar2 != null) {
                    hVar2.a(a17.f164052a, a17.f164053b, a17.f164054c, a17.f164055d);
                }
            }
        });
    }

    /* renamed from: startPayComponent */
    public void m51169x93905eb7(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.g gVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f.b(activity, new yz5.l(c12559xbdae8559, str, map, gVar) { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.11

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f164042d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ java.util.Map f164043e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.g f164044f;

            {
                this.f164042d = str;
                this.f164043e = map;
                this.f164044f = gVar;
            }

            @Override // yz5.l
            /* renamed from: invoke */
            public java.lang.Object mo146xb9724478(java.lang.Object obj) {
                final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8 enumC12202xa98118f8 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.this;
                enumC12202xa98118f8.getClass();
                og0.o oVar = (og0.o) i95.n0.c(og0.o.class);
                int hashCode = enumC12202xa98118f8.hashCode() & 65535;
                final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.g gVar2 = this.f164044f;
                com.p314xaae8f345.mm.ui.da daVar = new com.p314xaae8f345.mm.ui.da() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.12
                    @Override // com.p314xaae8f345.mm.ui.xc
                    /* renamed from: mmOnActivityResult */
                    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.g gVar3;
                        android.os.Bundle extras;
                        java.util.Set<java.lang.String> keySet;
                        if (i17 == (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.this.hashCode() & 65535) && (gVar3 = gVar2) != null) {
                            java.util.HashMap hashMap = new java.util.HashMap();
                            if (intent != null && (extras = intent.getExtras()) != null && (keySet = extras.keySet()) != null) {
                                for (java.lang.String str2 : keySet) {
                                    hashMap.put(str2, extras.get(str2));
                                }
                            }
                            if (i18 == -1) {
                                gVar3.a("ok", hashMap);
                            } else if (i18 == 5) {
                                gVar3.a("fail", hashMap);
                            } else if (i18 == 0) {
                                gVar3.a("cancel", hashMap);
                            }
                        }
                    }
                };
                ((ng0.q) oVar).getClass();
                h45.a0.h((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) obj, this.f164042d, this.f164043e, hashCode, daVar);
                return jz5.f0.f384359a;
            }
        });
    }

    /* renamed from: startPayToBank */
    public boolean m51170xbb887bdd(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, org.json.JSONObject jSONObject, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.h hVar) {
        final com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62(jSONObject);
        if (c12559xbdae8559 != null) {
            c19761xc2874b62.f273677v = com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62.a(c12559xbdae8559.f169323f, c12559xbdae8559.f169326i);
            c19761xc2874b62.f273679x = c12559xbdae8559.f169323f;
        }
        c19761xc2874b62.f273675t = 46;
        final com.p314xaae8f345.mm.ui.da daVar = new com.p314xaae8f345.mm.ui.da() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.3
            @Override // com.p314xaae8f345.mm.ui.xc
            /* renamed from: mmOnActivityResult */
            public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
                if (i17 != (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.this.hashCode() & 65535)) {
                    return;
                }
                boolean booleanExtra = intent != null ? intent.getBooleanExtra("is_new_cashier", false) : false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.h hVar2 = hVar;
                if (i18 != -1) {
                    if (hVar2 != null) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("is_new_cashier", booleanExtra ? "1" : "0");
                        hVar2.a(2, 0, null, hashMap);
                        return;
                    }
                    return;
                }
                java.util.HashMap hashMap2 = new java.util.HashMap();
                java.lang.String stringExtra = intent.getStringExtra("token");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (stringExtra == null) {
                    stringExtra = "";
                }
                java.lang.String stringExtra2 = intent.getStringExtra("bind_serial");
                java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
                hashMap2.put("token", stringExtra);
                hashMap2.put("bindSerial", str);
                hashMap2.put("is_new_cashier", booleanExtra ? "1" : "0");
                if (hVar2 != null) {
                    hVar2.a(1, 0, null, hashMap2);
                }
            }
        };
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f.b(activity, new yz5.l() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.4
            @Override // yz5.l
            /* renamed from: invoke */
            public java.lang.Object mo146xb9724478(java.lang.Object obj) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) obj;
                android.content.Intent intent = new android.content.Intent();
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b622 = c19761xc2874b62;
                intent.putExtra("appId", c19761xc2874b622.f273662d);
                intent.putExtra("timeStamp", c19761xc2874b622.f273666h);
                intent.putExtra("nonceStr", c19761xc2874b622.f273665g);
                intent.putExtra("packageExt", c19761xc2874b622.f273667i);
                intent.putExtra("signtype", c19761xc2874b622.f273664f);
                intent.putExtra("paySignature", c19761xc2874b622.f273671p);
                intent.putExtra("url", c19761xc2874b622.f273673r);
                intent.putExtra("pay_scene", c19761xc2874b622.f273676u);
                abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(daVar);
                j45.l.o(abstractActivityC21394xb3d2c0cf, "wallet", ".pay.ui.WalletLoanRepaymentUI", intent, 65535 & com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.this.hashCode(), false);
                return jz5.f0.f384359a;
            }
        });
    }

    /* renamed from: verifyPassword */
    public void m51171x6ad51e34(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, org.json.JSONObject jSONObject, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.j jVar) {
        final com.p314xaae8f345.mm.ui.da daVar = new com.p314xaae8f345.mm.ui.da() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.9
            @Override // com.p314xaae8f345.mm.ui.xc
            /* renamed from: mmOnActivityResult */
            public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
                if (i17 != (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.this.hashCode() & 65535)) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.j jVar2 = jVar;
                if (i18 != -1) {
                    if (jVar2 != null) {
                        jVar2.a(false, null);
                        return;
                    }
                    return;
                }
                java.lang.String str = "";
                if (intent != null) {
                    java.lang.String stringExtra = intent.getStringExtra("token");
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (stringExtra != null) {
                        str = stringExtra;
                    }
                }
                if (android.text.TextUtils.isEmpty(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiPayService", "checkPwdToken is empty, verifyWCPayPassword:fail");
                    if (jVar2 != null) {
                        jVar2.a(false, null);
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiPayService", "checkPwdToken is valid, verifyWCPayPassword:ok");
                if (jVar2 != null) {
                    jVar2.a(true, str);
                }
            }
        };
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62(jSONObject);
        final android.content.Intent intent = new android.content.Intent();
        intent.putExtra("appId", c19761xc2874b62.f273662d);
        intent.putExtra("timeStamp", c19761xc2874b62.f273666h);
        intent.putExtra("nonceStr", c19761xc2874b62.f273665g);
        intent.putExtra("packageExt", c19761xc2874b62.f273667i);
        intent.putExtra("signtype", c19761xc2874b62.f273664f);
        intent.putExtra("paySignature", c19761xc2874b62.f273671p);
        intent.putExtra("url", c19761xc2874b62.f273673r);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f.b(activity, new yz5.l() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.10
            @Override // yz5.l
            /* renamed from: invoke */
            public java.lang.Object mo146xb9724478(java.lang.Object obj) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) obj;
                abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(daVar);
                j45.l.o(abstractActivityC21394xb3d2c0cf, "wallet_core", ".ui.WalletCheckPwdUI", intent, 65535 & com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.this.hashCode(), false);
                return jz5.f0.f384359a;
            }
        });
    }
}
