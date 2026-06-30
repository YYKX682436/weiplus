package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/chatbot/JsApiGenRedPackageCover;", "Lcom/tencent/mm/plugin/appbrand/jsapi/f;", "Lcom/tencent/mm/plugin/appbrand/jsapi/l;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover */
/* loaded from: classes7.dex */
public class C12063xb16c5aa3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34025x366c91de = 1466;

    /* renamed from: NAME */
    private static final java.lang.String f34026x24728b = "genRedPackageCover";

    /* renamed from: g, reason: collision with root package name */
    public static final jc1.d f161813g = new jc1.d(-1, "fail:reject");

    /* renamed from: h, reason: collision with root package name */
    public static final jc1.d f161814h = new jc1.d(-2, "fail:file not exist");

    /* renamed from: i, reason: collision with root package name */
    public static final jc1.d f161815i = new jc1.d(-3, "ok");

    /* renamed from: m, reason: collision with root package name */
    public static final jc1.d f161816m = new jc1.d(-4, "fail:undefined username");

    /* renamed from: n, reason: collision with root package name */
    public static final jc1.d f161817n = new jc1.d(-5, "fail:undefined jumptype");

    /* renamed from: o, reason: collision with root package name */
    public static final jc1.d f161818o = new jc1.d(-6, "fail:fetch album fail");

    public static final java.lang.String D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3 c12063xb16c5aa3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        c12063xb16c5aa3.getClass();
        if (r26.i0.y(str, "wxfile://", false)) {
            return str;
        }
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = lVar.mo50354x59eafec1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50354x59eafec1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256 = mo50354x59eafec1.mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)), "", false, b0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49619x6aa75256, "createTempFileFrom(...)");
        if (mo49619x6aa75256 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK && !android.text.TextUtils.isEmpty((java.lang.CharSequence) b0Var.f373357a)) {
            return (java.lang.String) b0Var.f373357a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGenRedPackageCover", "[-] fail to generate path with wxfile scheme. '%s','%s'", str, mo49619x6aa75256);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        if (r10 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3 r7, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r8, int r9, java.util.Map r10) {
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
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.E(com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover, com.tencent.mm.plugin.appbrand.jsapi.l, int, java.util.Map):void");
    }

    public static /* synthetic */ void H(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3 c12063xb16c5aa3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, jc1.d dVar, java.lang.String str, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: responseError");
        }
        if ((i18 & 8) != 0) {
            str = null;
        }
        c12063xb16c5aa3.G(lVar, i17, dVar, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0048, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r12, "wxid_ai_31zbeyiafl2") != false) goto L15;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r11, org.json.JSONObject r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "[-] fail to get field value."
            java.lang.String r1 = "[+] JsApiGenRedPackageCover invoked."
            java.lang.String r2 = "MicroMsg.JsApiGenRedPackageCover"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            if (r11 != 0) goto L11
            java.lang.String r11 = "[-] env is null."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r11)
            return
        L11:
            jc1.d r1 = jc1.f.f380452h
            if (r12 != 0) goto L20
            java.lang.String r12 = "[-] data is null."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r12)
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r12, r5)     // Catch: org.json.JSONException -> Lb2
            java.lang.String r5 = "weixinintell_yb"
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r12, r5)     // Catch: org.json.JSONException -> Lb2
            java.lang.String r6 = "wxid_wi_1d142z0zdj03"
            if (r5 == 0) goto L41
        L3f:
            r12 = r6
            goto L4b
        L41:
            java.lang.String r5 = "wxid_ai_31zbeyiafl2"
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r12, r5)     // Catch: org.json.JSONException -> Lb2
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r12, r0, r1)
            jc1.d r0 = jc1.f.f380448d
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
            android.content.Context r1 = r11.mo50352x76847179()
            java.lang.String r2 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            yb1.q r2 = new yb1.q
            r2.<init>(r10, r11, r13)
            com.tencent.mm.pluginsdk.ui.chat.p9 r12 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.p9) r12
            r12.getClass()
            ku5.u0 r11 = ku5.t0.f394148d
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r12)
            jc1.d r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.f161817n
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r12, r0, r3)
            java.lang.String r12 = "can not get value of field 'username'"
            r10.G(r11, r13, r1, r12)
            return
        Lbe:
            r12 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r12, r0, r3)
            java.lang.String r12 = "can not get value of field 'jumpType'"
            r10.G(r11, r13, r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }

    public final void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, int i17) {
        android.content.Context n17;
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        android.content.Context n18 = lVar.n();
        h0Var.f391656d = n18;
        if (!(n18 instanceof android.app.Activity) && (n17 = com.p314xaae8f345.mm.app.w.INSTANCE.n()) != null) {
            h0Var.f391656d = n17;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.ui.l2.a(str);
        ((vh0.f3) n1Var).bj((android.content.Context) h0Var.f391656d, str, 1, a17, new yb1.s(this, lVar, i17, a17, n1Var, h0Var, str));
    }

    public final void G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, jc1.d dVar, java.lang.String str) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, jc1.f.f380445a)) {
            throw new java.lang.IllegalArgumentException("Please use responseOK() to notify successful.");
        }
        if (str != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "cancel") && !r26.i0.y(str, "fail", false)) {
            str = "fail:".concat(str);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", dVar.f380436a);
        lVar.a(i17, r(str, dVar, jSONObject));
    }
}
