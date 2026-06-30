package com.tencent.mm.plugin.appbrand.jsapi.chatbot;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/chatbot/JsApiGenRedPackageCover;", "Lcom/tencent/mm/plugin/appbrand/jsapi/f;", "Lcom/tencent/mm/plugin/appbrand/jsapi/l;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public class JsApiGenRedPackageCover extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1466;
    private static final java.lang.String NAME = "genRedPackageCover";

    /* renamed from: g, reason: collision with root package name */
    public static final jc1.d f80280g = new jc1.d(-1, "fail:reject");

    /* renamed from: h, reason: collision with root package name */
    public static final jc1.d f80281h = new jc1.d(-2, "fail:file not exist");

    /* renamed from: i, reason: collision with root package name */
    public static final jc1.d f80282i = new jc1.d(-3, "ok");

    /* renamed from: m, reason: collision with root package name */
    public static final jc1.d f80283m = new jc1.d(-4, "fail:undefined username");

    /* renamed from: n, reason: collision with root package name */
    public static final jc1.d f80284n = new jc1.d(-5, "fail:undefined jumptype");

    /* renamed from: o, reason: collision with root package name */
    public static final jc1.d f80285o = new jc1.d(-6, "fail:fetch album fail");

    public static final java.lang.String D(com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover jsApiGenRedPackageCover, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        jsApiGenRedPackageCover.getClass();
        if (r26.i0.y(str, "wxfile://", false)) {
            return str;
        }
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = lVar.getFileSystem();
        kotlin.jvm.internal.o.d(fileSystem);
        com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom = fileSystem.createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)), "", false, b0Var);
        kotlin.jvm.internal.o.f(createTempFileFrom, "createTempFileFrom(...)");
        if (createTempFileFrom == com.tencent.mm.plugin.appbrand.appstorage.j1.OK && !android.text.TextUtils.isEmpty((java.lang.CharSequence) b0Var.f291824a)) {
            return (java.lang.String) b0Var.f291824a;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGenRedPackageCover", "[-] fail to generate path with wxfile scheme. '%s','%s'", str, createTempFileFrom);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        if (r10 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover r7, com.tencent.mm.plugin.appbrand.jsapi.l r8, int r9, java.util.Map r10) {
        /*
            r7.getClass()
            kotlin.jvm.internal.l0 r0 = new kotlin.jvm.internal.l0
            r1 = 2
            r0.<init>(r1)
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            jz5.l r3 = new jz5.l
            java.lang.String r4 = "errCode"
            r3.<init>(r4, r2)
            r0.a(r3)
            if (r10 == 0) goto L52
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r10.size()
            r3.<init>(r4)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L2b:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r10.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            jz5.l r6 = new jz5.l
            r6.<init>(r5, r4)
            r3.add(r6)
            goto L2b
        L48:
            jz5.l[] r10 = new jz5.l[r1]
            java.lang.Object[] r10 = r3.toArray(r10)
            jz5.l[] r10 = (jz5.l[]) r10
            if (r10 != 0) goto L54
        L52:
            jz5.l[] r10 = new jz5.l[r1]
        L54:
            r0.b(r10)
            int r10 = r0.c()
            jz5.l[] r10 = new jz5.l[r10]
            java.lang.Object[] r10 = r0.d(r10)
            jz5.l[] r10 = (jz5.l[]) r10
            java.util.Map r10 = kz5.c1.k(r10)
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.z.f193105a
            boolean r0 = r10 instanceof java.util.HashMap
            if (r0 == 0) goto L6e
            goto L74
        L6e:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r10)
            r10 = r0
        L74:
            java.lang.String r0 = "errno"
            r10.put(r0, r2)
            java.lang.String r0 = "ok"
            java.lang.String r7 = r7.t(r0, r10)
            r8.a(r9, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.E(com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover, com.tencent.mm.plugin.appbrand.jsapi.l, int, java.util.Map):void");
    }

    public static /* synthetic */ void H(com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover jsApiGenRedPackageCover, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, jc1.d dVar, java.lang.String str, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: responseError");
        }
        if ((i18 & 8) != 0) {
            str = null;
        }
        jsApiGenRedPackageCover.G(lVar, i17, dVar, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0048, code lost:
    
        if (kotlin.jvm.internal.o.b(r12, "wxid_ai_31zbeyiafl2") != false) goto L15;
     */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l r11, org.json.JSONObject r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "[-] fail to get field value."
            java.lang.String r1 = "[+] JsApiGenRedPackageCover invoked."
            java.lang.String r2 = "MicroMsg.JsApiGenRedPackageCover"
            com.tencent.mars.xlog.Log.i(r2, r1)
            if (r11 != 0) goto L11
            java.lang.String r11 = "[-] env is null."
            com.tencent.mars.xlog.Log.e(r2, r11)
            return
        L11:
            jc1.d r1 = jc1.f.f298919h
            if (r12 != 0) goto L20
            java.lang.String r12 = "[-] data is null."
            com.tencent.mars.xlog.Log.e(r2, r12)
            java.lang.String r12 = "data is null."
            r10.G(r11, r13, r1, r12)
            return
        L20:
            r3 = 0
            java.lang.String r4 = "jumpType"
            int r4 = r12.getInt(r4)     // Catch: org.json.JSONException -> Lbe
            java.lang.String r5 = "username"
            java.lang.String r12 = r12.getString(r5)     // Catch: org.json.JSONException -> Lb2
            java.lang.String r5 = "getString(...)"
            kotlin.jvm.internal.o.f(r12, r5)     // Catch: org.json.JSONException -> Lb2
            java.lang.String r5 = "weixinintell_yb"
            boolean r5 = kotlin.jvm.internal.o.b(r12, r5)     // Catch: org.json.JSONException -> Lb2
            java.lang.String r6 = "wxid_wi_1d142z0zdj03"
            if (r5 == 0) goto L41
        L3f:
            r12 = r6
            goto L4b
        L41:
            java.lang.String r5 = "wxid_ai_31zbeyiafl2"
            boolean r0 = kotlin.jvm.internal.o.b(r12, r5)     // Catch: org.json.JSONException -> Lb2
            if (r0 == 0) goto L4b
            goto L3f
        L4b:
            r0 = 1
            if (r4 != r0) goto L69
            r10.F(r11, r12, r13)     // Catch: java.lang.Throwable -> L52
            goto Lb1
        L52:
            r12 = move-exception
            java.lang.String r0 = "[-] Fail to open chatting ui."
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r12, r0, r1)
            jc1.d r0 = jc1.f.f298915d
            java.lang.String r12 = r12.getMessage()
            if (r12 != 0) goto L65
            java.lang.String r12 = "unexpected error"
        L65:
            r10.G(r11, r13, r0, r12)
            goto Lb1
        L69:
            r12 = 2
            if (r4 != r12) goto L94
            java.lang.Class<xs.h1> r12 = xs.h1.class
            i95.m r12 = i95.n0.c(r12)
            xs.h1 r12 = (xs.h1) r12
            android.content.Context r1 = r11.getContext()
            java.lang.String r2 = "getContext(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            yb1.q r2 = new yb1.q
            r2.<init>(r10, r11, r13)
            com.tencent.mm.pluginsdk.ui.chat.p9 r12 = (com.tencent.mm.pluginsdk.ui.chat.p9) r12
            r12.getClass()
            ku5.u0 r11 = ku5.t0.f312615d
            com.tencent.mm.pluginsdk.ui.chat.o9 r13 = new com.tencent.mm.pluginsdk.ui.chat.o9
            r13.<init>(r2, r12, r1, r0)
            ku5.t0 r11 = (ku5.t0) r11
            r11.q(r13)
            goto Lb1
        L94:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "[-] invalid value of 'jumpType': "
            r12.<init>(r0)
            r12.append(r4)
            java.lang.String r12 = r12.toString()
            com.tencent.mars.xlog.Log.e(r2, r12)
            jc1.d r6 = com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.f80284n
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r10
            r4 = r11
            r5 = r13
            H(r3, r4, r5, r6, r7, r8, r9)
        Lb1:
            return
        Lb2:
            r12 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r12, r0, r3)
            java.lang.String r12 = "can not get value of field 'username'"
            r10.G(r11, r13, r1, r12)
            return
        Lbe:
            r12 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r12, r0, r3)
            java.lang.String r12 = "can not get value of field 'jumpType'"
            r10.G(r11, r13, r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }

    public final void F(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, int i17) {
        android.content.Context n17;
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        android.content.Context n18 = lVar.n();
        h0Var.f310123d = n18;
        if (!(n18 instanceof android.app.Activity) && (n17 = com.tencent.mm.app.w.INSTANCE.n()) != null) {
            h0Var.f310123d = n17;
        }
        java.lang.String a17 = com.tencent.mm.ui.l2.a(str);
        ((vh0.f3) n1Var).bj((android.content.Context) h0Var.f310123d, str, 1, a17, new yb1.s(this, lVar, i17, a17, n1Var, h0Var, str));
    }

    public final void G(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, jc1.d dVar, java.lang.String str) {
        if (kotlin.jvm.internal.o.b(dVar, jc1.f.f298912a)) {
            throw new java.lang.IllegalArgumentException("Please use responseOK() to notify successful.");
        }
        if (str != null && !kotlin.jvm.internal.o.b(str, "cancel") && !r26.i0.y(str, "fail", false)) {
            str = "fail:".concat(str);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", dVar.f298903a);
        lVar.a(i17, r(str, dVar, jSONObject));
    }
}
