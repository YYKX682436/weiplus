package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class t5 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.t5 f268072d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.t5();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        android.net.Uri uri;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.Map map = msg.f422323a;
        boolean z17 = map == null || map.isEmpty();
        nw4.g gVar = env.f422396d;
        if (z17) {
            java.lang.String callbackId = msg.f422546c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackId, "callbackId");
            e(gVar, callbackId, "launchAppByScheme:fail", "params dic is invalid");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchAppByScheme", "schemeUrl is nil for launchAppByScheme");
            return true;
        }
        java.lang.Object obj = map.get("schemeUrl");
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchAppByScheme", "schemeUrl is nil for launchAppByScheme");
            java.lang.String callbackId2 = msg.f422546c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackId2, "callbackId");
            e(gVar, callbackId2, "launchAppByScheme:fail", "schemeUrl is null");
            return true;
        }
        try {
            uri = android.net.Uri.parse(str2);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchAppByScheme", "schemeUri is not valid:" + str2);
            uri = null;
        }
        if (uri == null) {
            java.lang.String callbackId3 = msg.f422546c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackId3, "callbackId");
            e(gVar, callbackId3, "launchAppByScheme:fail", "schemeUrl is invalid");
            return true;
        }
        zg0.q2 a17 = env.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17 : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.z0 z0Var = r0Var != null ? r0Var.f263456d0 : null;
        if (z0Var != null) {
            android.graphics.Point point = z0Var.f263561a;
            if ((point.x == 0 && point.y == 0) ? false : true) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d O = r0Var.O();
                int i17 = O.f264923j;
                java.lang.String str3 = O.f264919f;
                if (str3 == null) {
                    str3 = "";
                }
                java.lang.String str4 = O.f264935v;
                if (str4 == null) {
                    str4 = "";
                }
                java.lang.String str5 = O.A;
                if (str5 == null) {
                    str5 = "";
                }
                int i18 = O.F;
                android.net.Uri uri2 = uri;
                int i19 = O.G;
                int d17 = O.d();
                int i27 = O.f264916c;
                long j17 = z0Var.f263562b;
                long currentTimeMillis = j17 > 0 ? java.lang.System.currentTimeMillis() - j17 : 0L;
                r45.yg4 yg4Var = new r45.yg4();
                yg4Var.f472579d = i27;
                zg0.q2 a18 = env.a();
                if (a18 == null || (str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a18).Z()) == null) {
                    str = "";
                }
                yg4Var.f472580e = str;
                yg4Var.f472581f = str2;
                yg4Var.f472593u = i17;
                yg4Var.f472583h = str3;
                yg4Var.f472584i = str4;
                yg4Var.f472585m = str5;
                yg4Var.f472586n = i18;
                yg4Var.f472587o = i19;
                yg4Var.f472588p = d17;
                yg4Var.f472590r = currentTimeMillis;
                yg4Var.f472591s = point.x;
                yg4Var.f472592t = point.y;
                yg4Var.f472589q = 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchAppByScheme", "do MMNewCheckLaunchAppReq, scene:" + yg4Var.f472579d + ", content_type:" + yg4Var.f472586n + ", appmsg_inner_type:" + yg4Var.f472587o + ", scheme_url:" + yg4Var.f472581f);
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152197a = yg4Var;
                lVar.f152198b = new r45.zg4();
                lVar.f152199c = "/cgi-bin/micromsg-bin/newchecklaunchapp";
                lVar.f152200d = 9558;
                android.content.Context context = env.f422393a;
                if (!(context instanceof android.app.Activity)) {
                    context = r0Var.f263449a.m81400x569210f3();
                }
                com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x xVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class);
                com.p314xaae8f345.mm.p944x882e457a.o a19 = lVar.a();
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context);
                java.lang.String callbackId4 = msg.f422546c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackId4, "callbackId");
                ((h80.i) xVar).wi(a19, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s5(weakReference, callbackId4, uri2, new java.lang.ref.WeakReference(gVar)));
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchAppByScheme", "launchAppByScheme fail not click webview");
        java.lang.String callbackId5 = msg.f422546c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackId5, "callbackId");
        e(gVar, callbackId5, "launchAppByScheme:fail", "can not launch app without user interaction");
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return wc1.p.f77345x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "launchAppByScheme";
    }

    public final void e(nw4.g gVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("err_desc", str3);
        gVar.e(str, str2, linkedHashMap);
    }
}
