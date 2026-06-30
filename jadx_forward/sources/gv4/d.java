package gv4;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final gv4.d f357652a = new gv4.d();

    public final java.lang.String a(java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(6).c();
        b(params);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("file://");
        stringBuffer.append(c17);
        stringBuffer.append("?");
        stringBuffer.append(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.k(params));
        return stringBuffer.toString();
    }

    public final void b(java.util.Map map) {
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getCurrentLanguage(...)");
        map.put("lang", f17);
        map.put("platform", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        map.put("version", java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(6)));
        map.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b());
        java.lang.String CLIENT_VERSION = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CLIENT_VERSION, "CLIENT_VERSION");
        map.put("wechatVersion", CLIENT_VERSION);
    }

    public final hv4.l c(android.content.Context context, java.lang.String talker, int i17, hv4.a listener, java.lang.String query, java.lang.String sessionId, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = new r45.ck6();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.String.valueOf(72));
        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, sessionId);
        hashMap.put("subSessionId", sessionId);
        hashMap.put("isHomePage", "1");
        if (!android.text.TextUtils.isEmpty(query)) {
            java.lang.String b17 = tg0.r2.a(72) ? query : fp.s0.b(query, "utf8");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
            hashMap.put("query", b17);
            hashMap.put("cursorIndex", java.lang.String.valueOf(i18));
        }
        hashMap.put("isOverseaApp", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(context) ? "1" : "0");
        b(hashMap);
        ((r45.ck6) h0Var.f391656d).f453158g = a(hashMap);
        r45.ck6 ck6Var = (r45.ck6) h0Var.f391656d;
        ck6Var.f453163o = talker;
        ck6Var.f453156e = sessionId;
        ck6Var.f453157f = 72;
        ck6Var.f453160i = "";
        ck6Var.f453155d = "";
        ck6Var.f453164p = i17;
        hv4.l lVar = new hv4.l(context, (r45.ck6) h0Var.f391656d, new gv4.c(listener, h0Var, i17, talker, sessionId));
        lVar.show();
        android.view.Window window = lVar.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7064x67496ed7 c7064x67496ed7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7064x67496ed7();
        c7064x67496ed7.f143719d = 1L;
        c7064x67496ed7.f143720e = 0L;
        c7064x67496ed7.f143721f = i17;
        c7064x67496ed7.f143722g = c01.id.e();
        c7064x67496ed7.f143723h = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(talker) ? 2L : 1L;
        c7064x67496ed7.f143724i = c7064x67496ed7.b("EnterSceneId", talker, true);
        c7064x67496ed7.f143725j = c7064x67496ed7.b("SessionId", sessionId, true);
        c7064x67496ed7.f143726k = c7064x67496ed7.b("QueryKey", query, true);
        c7064x67496ed7.k();
        su4.k3.m(c7064x67496ed7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.TagSearchUILogic", "startTagSearchDialog url:" + ((r45.ck6) h0Var.f391656d).f453158g);
        return lVar;
    }
}
