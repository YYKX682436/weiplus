package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes10.dex */
public final class rb extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rb f268026d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rb();

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f268027e = null;

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f268028f = null;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f268029g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f268030h = "";

    /* renamed from: i, reason: collision with root package name */
    public static boolean f268031i = false;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f268032m = "";

    @Override // nw4.q2
    public boolean a(final nw4.k env, final nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        boolean z17 = env.f422393a instanceof android.app.Activity;
        nw4.g gVar = env.f422396d;
        if (!z17 || !(gVar instanceof nw4.n)) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiScanBankCard", "context error!", null);
            gVar.e(msg.f422546c, msg.f422552i + ":fail, context error", null);
            return false;
        }
        if (((java.util.HashMap) msg.f422323a).isEmpty()) {
            java.lang.String str = msg.f422546c;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("err_msg", "fail");
            hashMap.put("err_code", 10001);
            hashMap.put("scanResult", "");
            gVar.e(str, "scanBankCard:fail", hashMap);
            return false;
        }
        if (!((java.util.HashMap) msg.f422323a).containsKey("certPem") || !((java.util.HashMap) msg.f422323a).containsKey("baseRequest")) {
            java.lang.String str2 = msg.f422546c;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("err_msg", "fail");
            hashMap2.put("err_code", 10001);
            hashMap2.put("scanResult", "");
            gVar.e(str2, "scanBankCard:fail", hashMap2);
            return false;
        }
        java.lang.Object obj = ((java.util.HashMap) msg.f422323a).get("trueName");
        java.lang.String str3 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str3 == null) {
            str3 = "";
        }
        f268030h = str3;
        java.lang.Object obj2 = ((java.util.HashMap) msg.f422323a).get("useHttp");
        java.lang.String str4 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str4 == null) {
            str4 = "false";
        }
        f268031i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(str4, false);
        java.lang.Object obj3 = ((java.util.HashMap) msg.f422323a).get("certPem");
        java.lang.String str5 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str5 == null) {
            str5 = "";
        }
        f268029g = str5;
        java.lang.Object obj4 = ((java.util.HashMap) msg.f422323a).get("baseRequest");
        java.lang.String str6 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        f268032m = str6 != null ? str6 : "";
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiScanBankCard", "Start Scan", null);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f268027e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5961x66a09f94>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiScanBankCard$startScan$1
            {
                this.f39173x3fe91575 = 96068484;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5961x66a09f94 c5961x66a09f94) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5961x66a09f94 event = c5961x66a09f94;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.qs qsVar = event.f136260g;
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qsVar.f89274a);
                nw4.y2 y2Var = msg;
                nw4.k kVar = nw4.k.this;
                if (K0) {
                    com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rb.f268027e;
                    if (abstractC20980x9b9ad01d != null) {
                        abstractC20980x9b9ad01d.mo48814x2efc64();
                    }
                    nw4.g gVar2 = kVar.f422396d;
                    java.lang.String str7 = y2Var.f422546c;
                    java.util.HashMap hashMap3 = new java.util.HashMap();
                    hashMap3.put("err_msg", "fail");
                    hashMap3.put("err_code", 10002);
                    hashMap3.put("scanResult", "");
                    gVar2.e(str7, "scanBankCard:fail", hashMap3);
                    return false;
                }
                java.lang.String cardId = qsVar.f89274a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cardId, "cardId");
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile("-");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
                java.lang.String replaceAll = compile.matcher(cardId).replaceAll(" ");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
                java.lang.String concat = "scan success: ".concat(replaceAll);
                int i19 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiScanBankCard", concat, null);
                nw4.g gVar3 = kVar.f422396d;
                java.lang.String str8 = y2Var.f422546c;
                java.util.HashMap hashMap4 = new java.util.HashMap();
                hashMap4.put("err_msg", "ok");
                hashMap4.put("err_code", 0);
                hashMap4.put("scanResult", replaceAll);
                gVar3.e(str8, "scanBankCard:ok", hashMap4);
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rb.f268027e;
                if (abstractC20980x9b9ad01d2 != null) {
                    abstractC20980x9b9ad01d2.mo48814x2efc64();
                }
                return true;
            }
        };
        f268028f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5969xdb95834b>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiScanBankCard$startScan$2
            {
                this.f39173x3fe91575 = 2058274619;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5969xdb95834b c5969xdb95834b) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5969xdb95834b event = c5969xdb95834b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i19 = event.f136267g.f89933a;
                nw4.y2 y2Var = msg;
                nw4.k kVar = nw4.k.this;
                if (i19 == 1) {
                    nw4.g gVar2 = kVar.f422396d;
                    java.lang.String str7 = y2Var.f422546c;
                    java.util.HashMap hashMap3 = new java.util.HashMap();
                    hashMap3.put("err_msg", "cancel");
                    hashMap3.put("err_code", java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6));
                    hashMap3.put("scanResult", "");
                    gVar2.e(str7, "scanBankCard:cancel", hashMap3);
                } else {
                    nw4.g gVar3 = kVar.f422396d;
                    java.lang.String str8 = y2Var.f422546c;
                    java.util.HashMap hashMap4 = new java.util.HashMap();
                    hashMap4.put("err_msg", "fail");
                    hashMap4.put("err_code", 10002);
                    hashMap4.put("scanResult", "");
                    gVar3.e(str8, "scanBankCard:fail", hashMap4);
                }
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rb.f268028f;
                if (abstractC20980x9b9ad01d != null) {
                    abstractC20980x9b9ad01d.mo48814x2efc64();
                }
                return true;
            }
        };
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = f268027e;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48813x58998cd();
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = f268028f;
        if (abstractC20980x9b9ad01d2 != null) {
            abstractC20980x9b9ad01d2.mo48813x58998cd();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 7);
        intent.putExtra("scan_bankcard_with_confirm_ui", true);
        intent.putExtra("scan_bankcard_use_http", f268031i);
        intent.putExtra("bank_card_owner", f268030h);
        intent.putExtra("scan_bankcard_cert_pem", f268029g);
        intent.putExtra("scan_bankcard_baserequest", f268032m);
        j45.l.j(env.f422393a, "scanner", ".ui.ScanCardUI", intent, null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 512;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "scanBankCard";
    }
}
