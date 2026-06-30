package la3;

/* loaded from: classes8.dex */
public final class j implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler, la3.a {

    /* renamed from: d, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f399072d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f399073e;

    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c0 A[Catch: all -> 0x01c4, TRY_LEAVE, TryCatch #0 {all -> 0x01c4, blocks: (B:76:0x016f, B:82:0x018a, B:85:0x01a2, B:89:0x01c0), top: B:75:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(android.content.Context r22, int r23, java.util.Map r24, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 r25) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: la3.j.<init>(android.content.Context, int, java.util.Map, io.flutter.plugin.common.MethodChannel):void");
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: dispose */
    public void mo31847x63a5261f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppWebviewView", "LiteAppWebview is dispose!!!");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f399072d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
        android.view.View view = this.f399073e;
        if (!(view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppWebviewView", "view not is MMWebview.");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMWebView");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) view;
        if (c22633x83752a59.f292909y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppWebviewView", "webview already destroy.");
            return;
        }
        java.lang.Object mo120164x90fc158e = c22633x83752a59.mo120164x90fc158e();
        if (mo120164x90fc158e instanceof zg0.q2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppWebviewView", "webview controller destroy");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) ((zg0.q2) mo120164x90fc158e)).D0();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppWebviewView", "webview destroy");
        c22633x83752a59.mo52095x5cd39ffa();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: getView */
    public android.view.View mo31848xfb86a31b() {
        return this.f399073e;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff methodCall, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methodCall, "methodCall");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppWebviewView", "onMethodCall " + methodCall.f71610xbfc5d0e1 + ", " + methodCall.f71609x86ac7956);
        java.lang.String str = methodCall.f71610xbfc5d0e1;
        android.view.View view = this.f399073e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) view : null;
        if (c22633x83752a59 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppWebviewView", "view not is MMWebview");
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (str.equals("goBack")) {
            c22633x83752a59.mo120168xb5fed1ef();
        } else if (str.equals("goForward")) {
            c22633x83752a59.mo120169xed0748bd();
        } else if (str.equals("reload")) {
            c22633x83752a59.mo120172xc84a8199();
        } else if (str.equals("loadURL")) {
            java.lang.Object obj = methodCall.f71609x86ac7956;
            if (obj instanceof java.util.ArrayList) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                if (arrayList.size() == 1) {
                    java.lang.Object obj2 = arrayList.get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                    c22633x83752a59.mo32265x141096a9((java.lang.String) obj2);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppWebviewView", "arguments error");
            }
        } else if (str.equals("canGoBack")) {
            linkedHashMap.put("canGoBack", java.lang.Boolean.valueOf(c22633x83752a59.mo120129xed1a21df()));
        } else if (str.equals("canGoForward")) {
            linkedHashMap.put("canGoForward", java.lang.Boolean.valueOf(c22633x83752a59.mo120130xc062b2cd()));
        } else if (str.equals("getCurrentUrl")) {
            java.lang.String mo120156xb5887639 = c22633x83752a59.mo120156xb5887639();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo120156xb5887639, "getUrl(...)");
            linkedHashMap.put("url", mo120156xb5887639);
        } else if (str.equals("getCurrentTitle")) {
            java.lang.String mo64579x7531c8a2 = c22633x83752a59.mo64579x7531c8a2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo64579x7531c8a2, "getTitle(...)");
            linkedHashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, mo64579x7531c8a2);
        } else {
            if (!str.equals("postMessage")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppWebviewView", "onMethodCall not found method: ".concat(str));
                result.mo65718x5c4d208("", "onMethodCall not found method", null);
                return;
            }
            java.lang.Object obj3 = methodCall.f71609x86ac7956;
            if (obj3 instanceof java.util.ArrayList) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                java.util.ArrayList arrayList2 = (java.util.ArrayList) obj3;
                if (arrayList2.size() == 1) {
                    java.lang.Object mo120164x90fc158e = c22633x83752a59.mo120164x90fc158e();
                    if (mo120164x90fc158e instanceof zg0.q2) {
                        int U = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) ((zg0.q2) mo120164x90fc158e)).U();
                        java.lang.Object obj4 = arrayList2.get(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19281x39681380.g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19281x39681380(U, "onLiteAppMessage", new org.json.JSONObject((java.lang.String) obj4)));
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppWebviewView", "arguments error");
            }
        }
        result.mo65720x90b54003(linkedHashMap);
    }
}
