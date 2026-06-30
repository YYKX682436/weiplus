package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public enum AppBrandJsApiPayService {
    INSTANCE;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService$1WxPayActivityResultAdapter, reason: invalid class name */
    /* loaded from: classes7.dex */
    public class C1WxPayActivityResultAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final int f82516a;

        /* renamed from: b, reason: collision with root package name */
        public final android.content.Intent f82517b;

        public C1WxPayActivityResultAdapter(int i17, android.content.Intent intent, com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.PayResultCallbackReason payResultCallbackReason) {
            this.f82516a = i17;
            this.f82517b = intent;
        }

        public com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.C1WxPayCallbackResult a() {
            android.content.Intent intent = this.f82517b;
            int intExtra = intent != null ? intent.getIntExtra("key_is_clear_failure", -1) : -1;
            java.util.HashMap hashMap = new java.util.HashMap();
            if (intExtra == 0) {
                hashMap.put("payStatus", "pending");
            } else if (intExtra == 1) {
                hashMap.put("pay_status", "fail");
            }
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("key_pay_fail_reason");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    hashMap.put("fail_reason", stringExtra);
                }
                java.lang.String stringExtra2 = intent.getStringExtra("key_pay_completed_data");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    hashMap.put("payCompletedData", stringExtra2);
                }
                java.lang.String stringExtra3 = intent.getStringExtra("key_pay_overseaPayData");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                    hashMap.put("overseaPayData", stringExtra3);
                }
            }
            int i17 = this.f82516a;
            if (i17 == -1) {
                return new com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.C1WxPayCallbackResult(com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.this, 1, 0, null, hashMap);
            }
            if (i17 != 5) {
                return new com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.C1WxPayCallbackResult(com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.this, 3, 0, null, hashMap);
            }
            int intExtra2 = intent.getIntExtra("key_jsapi_pay_err_code", 0);
            java.lang.String stringExtra4 = intent.getStringExtra("key_jsapi_pay_err_msg");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            java.lang.String str = stringExtra4;
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApiPayService", "errCode: %d, errMsg: %s", java.lang.Integer.valueOf(intExtra2), str);
            return new com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.C1WxPayCallbackResult(com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.this, 2, intExtra2, str, hashMap);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService$1WxPayCallbackResult, reason: invalid class name */
    /* loaded from: classes7.dex */
    public class C1WxPayCallbackResult {

        /* renamed from: a, reason: collision with root package name */
        public final int f82519a;

        /* renamed from: b, reason: collision with root package name */
        public final int f82520b;

        /* renamed from: c, reason: collision with root package name */
        public final java.lang.String f82521c;

        /* renamed from: d, reason: collision with root package name */
        public final java.util.Map f82522d;

        public C1WxPayCallbackResult(com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService appBrandJsApiPayService, int i17, int i18, java.lang.String str, java.util.Map map) {
            this.f82519a = i17;
            this.f82520b = i18;
            this.f82521c = str;
            this.f82522d = map;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService$1WxPayResultDispatcher, reason: invalid class name */
    /* loaded from: classes7.dex */
    public class C1WxPayResultDispatcher {

        /* renamed from: a, reason: collision with root package name */
        public com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.C1WxPayActivityResultAdapter f82523a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.h f82524b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.nfc.e f82525c;

        public C1WxPayResultDispatcher(com.tencent.mm.plugin.appbrand.jsapi.pay.h hVar, com.tencent.mm.plugin.appbrand.jsapi.nfc.e eVar) {
            this.f82524b = hVar;
            this.f82525c = eVar;
        }

        public void a(int i17, android.content.Intent intent, com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.PayResultCallbackReason payResultCallbackReason) {
            java.lang.String str;
            com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.C1WxPayActivityResultAdapter c1WxPayActivityResultAdapter = new com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.C1WxPayActivityResultAdapter(i17, intent, payResultCallbackReason);
            this.f82523a = c1WxPayActivityResultAdapter;
            com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.PayResultCallbackReason payResultCallbackReason2 = com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.PayResultCallbackReason.SuccessAheadCallback;
            if ((payResultCallbackReason == payResultCallbackReason2 || payResultCallbackReason != payResultCallbackReason2) && payResultCallbackReason == payResultCallbackReason2 && (this.f82524b instanceof com.tencent.mm.plugin.appbrand.jsapi.pay.i)) {
                com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.C1WxPayCallbackResult a17 = c1WxPayActivityResultAdapter.a();
                com.tencent.mm.plugin.appbrand.jsapi.pay.i iVar = (com.tencent.mm.plugin.appbrand.jsapi.pay.i) this.f82524b;
                int i18 = a17.f82519a;
                java.lang.String str2 = a17.f82521c;
                java.util.Map map = a17.f82522d;
                com.tencent.mm.plugin.appbrand.jsapi.pay.v1 v1Var = (com.tencent.mm.plugin.appbrand.jsapi.pay.v1) iVar;
                v1Var.getClass();
                if (i18 == 1) {
                    str = "ok";
                } else if (i18 != 2) {
                    str = "fail cancel";
                } else {
                    str = "fail:" + str2;
                }
                java.lang.String callbackStr = v1Var.f82689e.p(str, map);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestPayment", "onPayResultBeforeUserInteractionEnd result:%d, callbackStr:%s", java.lang.Integer.valueOf(i18), callbackStr);
                if (v1Var.f82685a.getRuntime() instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t) {
                    com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.d dVar = ((com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t) v1Var.f82685a.getRuntime()).f85669p3;
                    com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.x component = (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.x) v1Var.f82685a;
                    int i19 = v1Var.f82686b;
                    dVar.getClass();
                    kotlin.jvm.internal.o.g(component, "component");
                    kotlin.jvm.internal.o.g(callbackStr, "callbackStr");
                    com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.w wVar = dVar.f85578b;
                    if (wVar == null) {
                        kotlin.jvm.internal.o.o("invokeProcess");
                        throw null;
                    }
                    wVar.b(component, i19, callbackStr);
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestPayment", "runtime is FunctionalRuntime");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestPayment", "runtime is normal");
                    if (i18 == 1) {
                        com.tencent.mm.plugin.appbrand.jsapi.pay.x1 x1Var = new com.tencent.mm.plugin.appbrand.jsapi.pay.x1();
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            java.lang.String str3 = "";
                            java.lang.String obj = map.get("payCompletedData") != null ? map.get("payCompletedData").toString() : "";
                            if (obj == null) {
                                obj = "";
                            }
                            jSONObject.put("payCompletedData", obj);
                            java.lang.String str4 = v1Var.f82688d;
                            if (str4 != null) {
                                str3 = str4;
                            }
                            jSONObject.put("requestId", str3);
                        } catch (org.json.JSONException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestPayment", "put JSON data error : %s", e17);
                        }
                        x1Var.f82374f = jSONObject.toString();
                        v1Var.f82685a.p(x1Var);
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestPayment", "send onPayResultBeforeUserInteractionEndJsApiEvent jsonObject:%s", jSONObject);
                    }
                }
                vd1.g gVar = v1Var.f82687c;
                if (gVar != null) {
                    com.tencent.mm.plugin.appbrand.report.model.u0.a(gVar, v1Var.f82685a.getAppId(), callbackStr);
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum PayResultCallbackReason {
        SuccessAheadCallback,
        ActivityResult
    }

    public void sendBizRedPacket(android.app.Activity activity, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, org.json.JSONObject jSONObject, final com.tencent.mm.plugin.appbrand.jsapi.pay.h hVar) {
        com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = new com.tencent.mm.pluginsdk.wallet.WalletJsapiData(jSONObject);
        walletJsapiData.f192144v = 16;
        final com.tencent.mm.ui.da daVar = new com.tencent.mm.ui.da() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.7
            @Override // com.tencent.mm.ui.xc
            public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
                if (i17 != (com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.this.hashCode() & 65535)) {
                    return;
                }
                com.tencent.mm.plugin.appbrand.jsapi.pay.h hVar2 = hVar;
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
        intent.putExtra("appId", walletJsapiData.f192129d);
        intent.putExtra("timeStamp", walletJsapiData.f192133h);
        intent.putExtra("nonceStr", walletJsapiData.f192132g);
        intent.putExtra("packageExt", walletJsapiData.f192134i);
        intent.putExtra("signtype", walletJsapiData.f192131f);
        intent.putExtra("paySignature", walletJsapiData.f192138p);
        intent.putExtra("key_static_from_scene", 100004);
        intent.putExtra("url", walletJsapiData.f192140r);
        com.tencent.mm.plugin.appbrand.jsapi.pay.f.b(activity, new yz5.l() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.8
            @Override // yz5.l
            public java.lang.Object invoke(java.lang.Object obj) {
                com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) obj;
                mMActivity.mmSetOnActivityResultCallback(daVar);
                j45.l.o(mMActivity, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", intent, 65535 & com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.this.hashCode(), false);
                return jz5.f0.f302826a;
            }
        });
    }

    public void startBindBankcard(android.app.Activity activity, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, final org.json.JSONObject jSONObject, final com.tencent.mm.plugin.appbrand.jsapi.pay.h hVar) {
        final com.tencent.mm.ui.da daVar = new com.tencent.mm.ui.da() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.5
            @Override // com.tencent.mm.ui.xc
            public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
                if (i17 != (com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.this.hashCode() & 65535)) {
                    return;
                }
                com.tencent.mm.plugin.appbrand.jsapi.pay.h hVar2 = hVar;
                if (i18 == -1) {
                    if (hVar2 != null) {
                        hVar2.a(1, 0, null, null);
                    }
                } else if (hVar2 != null) {
                    hVar2.a(2, 0, null, null);
                }
            }
        };
        com.tencent.mm.plugin.appbrand.jsapi.pay.f.b(activity, new yz5.l() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.6
            @Override // yz5.l
            public java.lang.Object invoke(java.lang.Object obj) {
                com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = new com.tencent.mm.pluginsdk.wallet.WalletJsapiData(jSONObject);
                walletJsapiData.f192143u = 4;
                ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).Ai((com.tencent.mm.ui.MMActivity) obj, walletJsapiData, com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.this.hashCode() & 65535, daVar);
                return jz5.f0.f302826a;
            }
        });
    }

    public boolean startPay(android.app.Activity activity, final com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, org.json.JSONObject jSONObject, final com.tencent.mm.plugin.appbrand.jsapi.pay.h hVar, com.tencent.mm.pointers.PString pString) {
        final com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = new com.tencent.mm.pluginsdk.wallet.WalletJsapiData(jSONObject);
        if (appBrandStatObject != null) {
            walletJsapiData.f192144v = com.tencent.mm.pluginsdk.wallet.WalletJsapiData.a(appBrandStatObject.f87790f, appBrandStatObject.f87793i);
            int i17 = appBrandStatObject.f87790f;
            walletJsapiData.f192146x = i17;
            walletJsapiData.f192145w = appBrandStatObject.f87799r;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiPayService", "startPay wxAppScene:%d, appId:%s", java.lang.Integer.valueOf(i17), d0Var.getAppId());
        }
        walletJsapiData.f192142t = 46;
        if (jSONObject.has("pay_scene")) {
            walletJsapiData.f192142t = jSONObject.optInt("pay_scene");
        }
        if (jSONObject.has("amount")) {
            walletJsapiData.f192147y = java.lang.String.valueOf(jSONObject.optInt("amount"));
        }
        java.lang.String optString = jSONObject.optString("adUxInfo");
        walletJsapiData.H = optString;
        qp3.a.c("AppBrandRuntime", com.tencent.mm.plugin.appbrand.jsapi.pay.y1.NAME, optString, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        java.lang.String optString2 = jSONObject.optString("commonUxInfo");
        walletJsapiData.I = optString2;
        qp3.a.d("AppBrandRuntime", com.tencent.mm.plugin.appbrand.jsapi.pay.y1.NAME, optString2, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        pString.value = walletJsapiData.f192134i;
        com.tencent.mm.plugin.appbrand.jsapi.nfc.e eVar = hd1.w.f280435c.b(d0Var) ? (com.tencent.mm.plugin.appbrand.jsapi.nfc.e) nd.f.a(com.tencent.mm.plugin.appbrand.jsapi.nfc.e.class) : null;
        final int hashCode = hashCode() & 65535;
        final com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.C1WxPayResultDispatcher c1WxPayResultDispatcher = new com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.C1WxPayResultDispatcher(hVar, eVar);
        walletJsapiData.X = com.tencent.mm.plugin.appbrand.ipc.x0.a(new android.support.v4.os.ResultReceiver(this, c1WxPayResultDispatcher) { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.1PaySuccessAheadCallbackResultReceiver

            /* renamed from: g, reason: collision with root package name */
            public final com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.C1WxPayResultDispatcher f82515g;

            {
                super(new android.os.Handler(android.os.Looper.getMainLooper()));
                this.f82515g = c1WxPayResultDispatcher;
            }

            @Override // android.support.v4.os.ResultReceiver
            public void a(int i18, android.os.Bundle bundle) {
                bundle.setClassLoader(com.tencent.mm.pluginsdk.wallet.WalletJsapiData.class.getClassLoader());
                this.f82515g.a(i18, new android.content.Intent().putExtras(bundle), com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.PayResultCallbackReason.SuccessAheadCallback);
            }
        }, activity);
        if (d0Var.getRuntime() instanceof com.tencent.mm.plugin.appbrand.o6) {
            walletJsapiData.f192148z = ((com.tencent.mm.plugin.appbrand.o6) d0Var.getRuntime()).e3() ? 1 : 0;
        }
        if (eVar != null) {
            ((com.tencent.mm.plugin.appbrand.utils.j5) eVar).a(false);
        }
        return com.tencent.mm.plugin.appbrand.jsapi.pay.f.c(activity, new yz5.l(this) { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.1
            @Override // yz5.l
            public java.lang.Object invoke(java.lang.Object obj) {
                og0.o oVar = (og0.o) i95.n0.c(og0.o.class);
                com.tencent.mm.ui.da daVar = new com.tencent.mm.ui.da() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.1.1
                    @Override // com.tencent.mm.ui.xc
                    public void mmOnActivityResult(int i18, int i19, android.content.Intent intent) {
                        com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.AnonymousClass1 anonymousClass1 = com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.AnonymousClass1.this;
                        if (hashCode == i18) {
                            c1WxPayResultDispatcher.a(i19, intent, com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.PayResultCallbackReason.ActivityResult);
                            return;
                        }
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        objArr[0] = d0Var.getAppId();
                        com.tencent.mm.plugin.appbrand.jsapi.pay.h hVar2 = hVar;
                        objArr[1] = java.lang.Integer.valueOf(hVar2 != null ? hVar2.hashCode() : 0);
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandJsApiPayService", "startPay mismatch requestCode, appId:%s, listener.hash[%d]", objArr);
                    }
                };
                ((ng0.q) oVar).getClass();
                h45.a0.d((com.tencent.mm.ui.MMActivity) obj, walletJsapiData, hashCode, daVar);
                return jz5.f0.f302826a;
            }
        }, new nf.j(this) { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.2
            @Override // nf.j
            public void onResult(int i18, android.content.Intent intent) {
                com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.PayResultCallbackReason payResultCallbackReason = com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.PayResultCallbackReason.ActivityResult;
                com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.C1WxPayResultDispatcher c1WxPayResultDispatcher2 = c1WxPayResultDispatcher;
                c1WxPayResultDispatcher2.a(i18, intent, payResultCallbackReason);
                com.tencent.mm.plugin.appbrand.jsapi.nfc.e eVar2 = c1WxPayResultDispatcher2.f82525c;
                if (eVar2 != null) {
                    ((com.tencent.mm.plugin.appbrand.utils.j5) eVar2).a(true);
                }
                com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.C1WxPayActivityResultAdapter c1WxPayActivityResultAdapter = c1WxPayResultDispatcher2.f82523a;
                java.util.Objects.requireNonNull(c1WxPayActivityResultAdapter);
                com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.C1WxPayCallbackResult a17 = c1WxPayActivityResultAdapter.a();
                com.tencent.mm.plugin.appbrand.jsapi.pay.h hVar2 = c1WxPayResultDispatcher2.f82524b;
                if (hVar2 != null) {
                    hVar2.a(a17.f82519a, a17.f82520b, a17.f82521c, a17.f82522d);
                }
            }
        });
    }

    public void startPayComponent(android.app.Activity activity, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.tencent.mm.plugin.appbrand.jsapi.pay.g gVar) {
        com.tencent.mm.plugin.appbrand.jsapi.pay.f.b(activity, new yz5.l(appBrandStatObject, str, map, gVar) { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.11

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f82509d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ java.util.Map f82510e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.g f82511f;

            {
                this.f82509d = str;
                this.f82510e = map;
                this.f82511f = gVar;
            }

            @Override // yz5.l
            public java.lang.Object invoke(java.lang.Object obj) {
                final com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService appBrandJsApiPayService = com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.this;
                appBrandJsApiPayService.getClass();
                og0.o oVar = (og0.o) i95.n0.c(og0.o.class);
                int hashCode = appBrandJsApiPayService.hashCode() & 65535;
                final com.tencent.mm.plugin.appbrand.jsapi.pay.g gVar2 = this.f82511f;
                com.tencent.mm.ui.da daVar = new com.tencent.mm.ui.da() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.12
                    @Override // com.tencent.mm.ui.xc
                    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
                        com.tencent.mm.plugin.appbrand.jsapi.pay.g gVar3;
                        android.os.Bundle extras;
                        java.util.Set<java.lang.String> keySet;
                        if (i17 == (com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.this.hashCode() & 65535) && (gVar3 = gVar2) != null) {
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
                h45.a0.h((com.tencent.mm.ui.MMActivity) obj, this.f82509d, this.f82510e, hashCode, daVar);
                return jz5.f0.f302826a;
            }
        });
    }

    public boolean startPayToBank(android.app.Activity activity, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, org.json.JSONObject jSONObject, final com.tencent.mm.plugin.appbrand.jsapi.pay.h hVar) {
        final com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = new com.tencent.mm.pluginsdk.wallet.WalletJsapiData(jSONObject);
        if (appBrandStatObject != null) {
            walletJsapiData.f192144v = com.tencent.mm.pluginsdk.wallet.WalletJsapiData.a(appBrandStatObject.f87790f, appBrandStatObject.f87793i);
            walletJsapiData.f192146x = appBrandStatObject.f87790f;
        }
        walletJsapiData.f192142t = 46;
        final com.tencent.mm.ui.da daVar = new com.tencent.mm.ui.da() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.3
            @Override // com.tencent.mm.ui.xc
            public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
                if (i17 != (com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.this.hashCode() & 65535)) {
                    return;
                }
                boolean booleanExtra = intent != null ? intent.getBooleanExtra("is_new_cashier", false) : false;
                com.tencent.mm.plugin.appbrand.jsapi.pay.h hVar2 = hVar;
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
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
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
        return com.tencent.mm.plugin.appbrand.jsapi.pay.f.b(activity, new yz5.l() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.4
            @Override // yz5.l
            public java.lang.Object invoke(java.lang.Object obj) {
                com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) obj;
                android.content.Intent intent = new android.content.Intent();
                com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData2 = walletJsapiData;
                intent.putExtra("appId", walletJsapiData2.f192129d);
                intent.putExtra("timeStamp", walletJsapiData2.f192133h);
                intent.putExtra("nonceStr", walletJsapiData2.f192132g);
                intent.putExtra("packageExt", walletJsapiData2.f192134i);
                intent.putExtra("signtype", walletJsapiData2.f192131f);
                intent.putExtra("paySignature", walletJsapiData2.f192138p);
                intent.putExtra("url", walletJsapiData2.f192140r);
                intent.putExtra("pay_scene", walletJsapiData2.f192143u);
                mMActivity.mmSetOnActivityResultCallback(daVar);
                j45.l.o(mMActivity, "wallet", ".pay.ui.WalletLoanRepaymentUI", intent, 65535 & com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.this.hashCode(), false);
                return jz5.f0.f302826a;
            }
        });
    }

    public void verifyPassword(android.app.Activity activity, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, org.json.JSONObject jSONObject, final com.tencent.mm.plugin.appbrand.jsapi.pay.j jVar) {
        final com.tencent.mm.ui.da daVar = new com.tencent.mm.ui.da() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.9
            @Override // com.tencent.mm.ui.xc
            public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
                if (i17 != (com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.this.hashCode() & 65535)) {
                    return;
                }
                com.tencent.mm.plugin.appbrand.jsapi.pay.j jVar2 = jVar;
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
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (stringExtra != null) {
                        str = stringExtra;
                    }
                }
                if (android.text.TextUtils.isEmpty(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiPayService", "checkPwdToken is empty, verifyWCPayPassword:fail");
                    if (jVar2 != null) {
                        jVar2.a(false, null);
                        return;
                    }
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiPayService", "checkPwdToken is valid, verifyWCPayPassword:ok");
                if (jVar2 != null) {
                    jVar2.a(true, str);
                }
            }
        };
        com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = new com.tencent.mm.pluginsdk.wallet.WalletJsapiData(jSONObject);
        final android.content.Intent intent = new android.content.Intent();
        intent.putExtra("appId", walletJsapiData.f192129d);
        intent.putExtra("timeStamp", walletJsapiData.f192133h);
        intent.putExtra("nonceStr", walletJsapiData.f192132g);
        intent.putExtra("packageExt", walletJsapiData.f192134i);
        intent.putExtra("signtype", walletJsapiData.f192131f);
        intent.putExtra("paySignature", walletJsapiData.f192138p);
        intent.putExtra("url", walletJsapiData.f192140r);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        com.tencent.mm.plugin.appbrand.jsapi.pay.f.b(activity, new yz5.l() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.10
            @Override // yz5.l
            public java.lang.Object invoke(java.lang.Object obj) {
                com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) obj;
                mMActivity.mmSetOnActivityResultCallback(daVar);
                j45.l.o(mMActivity, "wallet_core", ".ui.WalletCheckPwdUI", intent, 65535 & com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.this.hashCode(), false);
                return jz5.f0.f302826a;
            }
        });
    }
}
