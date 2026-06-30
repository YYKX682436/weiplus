package vy3;

/* loaded from: classes.dex */
public final class w extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.w f523024e = new vy3.w();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("queryStr");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) msg.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        java.lang.String str3 = str2 != null ? str2 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartWebSearch", "ScanJsApi-Call startWebSearch queryStr: " + str + ", scene: " + str3);
        boolean N = r26.n0.N(str);
        nw4.g gVar = env.f422396d;
        if (N || r26.n0.N(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartWebSearch", "ScanJsApi-Call startWebSearch param is empty");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("ret", "1");
            gVar.e(msg.f422546c, msg.f422552i + ":param invalid", hashMap);
        } else {
            int y17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y1(str3);
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            java.lang.String l17 = o13.n.l(y17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "getUnsignedMd5UInt(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartWebSearch", "ScanJsApi-Call doStartWebSearch  scene:" + y17 + "  sessionId:" + l17);
            su4.j2 j2Var = new su4.j2();
            j2Var.f494471a = env.f422393a;
            j2Var.f494472b = y17;
            j2Var.f494474d = str;
            j2Var.f494475e = l17;
            j2Var.f494476f = true;
            j2Var.f494478h = true;
            j2Var.f494479i = false;
            j2Var.f494491u = true;
            j2Var.f494486p = false;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("ret", "0");
            gVar.e(msg.f422546c, msg.f422552i + ":ok", hashMap2);
        }
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.me.f34458x24728b;
    }
}
