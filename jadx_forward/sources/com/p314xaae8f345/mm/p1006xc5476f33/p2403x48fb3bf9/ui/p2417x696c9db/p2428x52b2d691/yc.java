package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class yc extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.yc f268218d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.yc();

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sc f268219e;

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sc f268220f;

    /* renamed from: g, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rc f268221g;

    /* renamed from: h, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rc f268222h;

    public static final java.util.HashMap e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.yc ycVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sc scVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        ycVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str6 = "";
        if (scVar == null || (str = scVar.f268062f) == null) {
            str = "";
        }
        hashMap.put("share_report_pre_msg_icon_url", str);
        if (scVar == null || (str2 = scVar.f268061e) == null) {
            str2 = "";
        }
        hashMap.put("share_report_pre_msg_desc", str2);
        if (scVar == null || (str3 = scVar.f268059c) == null) {
            str3 = "";
        }
        hashMap.put("share_report_pre_msg_title", str3);
        if (scVar == null || (str4 = scVar.f268060d) == null) {
            str4 = "";
        }
        hashMap.put("share_report_pre_msg_url", str4);
        if (scVar != null && (str5 = scVar.f268063g) != null) {
            str6 = str5;
        }
        hashMap.put("share_report_pre_msg_appid", str6);
        return hashMap;
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        boolean z17 = env.f422393a instanceof android.app.Activity;
        nw4.g gVar = env.f422396d;
        if (!z17 || !(gVar instanceof nw4.n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareCustomContent", "context error!");
            gVar.e(msg.f422546c, msg.f422552i + ":fail, context error", null);
            return false;
        }
        java.lang.String str = (java.lang.String) msg.f422323a.get("friend");
        java.lang.String str2 = (java.lang.String) msg.f422323a.get("timeline");
        java.lang.String str3 = (java.lang.String) msg.f422323a.get("menuItems");
        java.lang.String str4 = (java.lang.String) msg.f422323a.get("opItems");
        f268219e = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sc(str);
        f268220f = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sc(str2);
        f268221g = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rc(str3);
        f268222h = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rc(str4);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sc scVar = f268219e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(scVar);
        if (!scVar.f267950b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sc scVar2 = f268220f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(scVar2);
            if (!scVar2.f267950b) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rc rcVar = f268221g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rcVar);
                if (!rcVar.f267950b) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rc rcVar2 = f268222h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rcVar2);
                    if (!rcVar2.f267950b) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sc scVar3 = f268219e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(scVar3);
                        if (scVar3.f267949a) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sc scVar4 = f268219e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(scVar4);
                            if (!scVar4.a()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareCustomContent", "shareFriendData isNotAvailable, friendStr = " + str);
                                gVar.e(msg.f422546c, msg.f422552i + ":fail, add share item, but friend data lack", null);
                                return false;
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sc scVar5 = f268219e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(scVar5);
                        if (scVar5.f267949a) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sc scVar6 = f268220f;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(scVar6);
                            if (!scVar6.a()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareCustomContent", "timelineTLData isNotAvailable, timelineStr = " + str2);
                                gVar.e(msg.f422546c, msg.f422552i + ":fail, add timeline item, but timeline data lack", null);
                                return false;
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sc scVar7 = f268219e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(scVar7);
                        if (!scVar7.f267949a) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sc scVar8 = f268220f;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(scVar8);
                            if (!scVar8.f267949a) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareCustomContent", "have to add either share friend or timeline!");
                                gVar.e(msg.f422546c, msg.f422552i + ":fail, have to add either share friend or timeline!", null);
                                return false;
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rc rcVar3 = f268221g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rcVar3);
                        if (rcVar3.f267949a) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rc rcVar4 = f268221g;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rcVar4);
                            if (!rcVar4.a()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareCustomContent", "menuItemsData isNotAvailable, timelineStr = " + str2);
                                gVar.e(msg.f422546c, msg.f422552i + ":fail, add menuItemsData item, but menuItemsData data lack", null);
                                return false;
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rc rcVar5 = f268222h;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rcVar5);
                        if (rcVar5.f267949a) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rc rcVar6 = f268222h;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rcVar6);
                            if (!rcVar6.a()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareCustomContent", "opItemsData isNotAvailable, timelineStr = " + str2);
                                gVar.e(msg.f422546c, msg.f422552i + ":fail, add opItemsData item, but opItemsData data lack", null);
                                return false;
                            }
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(env.f422393a, 0, false);
                        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.tc(env);
                        k0Var.f293407o = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.uc(env);
                        android.content.Context context = env.f422393a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context : null;
                        if (viewOnCreateContextMenuListenerC19337x37f3384d == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareCustomContent", "webViewUI == null!");
                            gVar.e(msg.f422546c, msg.f422552i + ":fail, webViewUI == null", null);
                            return false;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 controller = viewOnCreateContextMenuListenerC19337x37f3384d.L1;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(controller, "controller");
                        hy4.m0 recentForwardReporter = viewOnCreateContextMenuListenerC19337x37f3384d.f265382q2.f265585i;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recentForwardReporter, "recentForwardReporter");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.vc vcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.vc(env);
                        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
                        com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m mVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
                        k0Var.f293409p = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p(k0Var, mVar, viewOnCreateContextMenuListenerC19337x37f3384d, controller, recentForwardReporter, null);
                        k0Var.f293418w = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r(mVar, recentForwardReporter, vcVar, controller);
                        k0Var.f293419x = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.s(mVar, k0Var);
                        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.wc(env);
                        k0Var.f293417v = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.xc(env);
                        k0Var.v();
                        return true;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareCustomContent", "menuItem or opItem, json parse fail");
                gVar.e(msg.f422546c, msg.f422552i + ":fail, menuItem or opItem, json parse fail!", null);
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareCustomContent", "share friends or timeline, json parse fail");
        gVar.e(msg.f422546c, msg.f422552i + ":fail, share friends or timeline, json parse fail!", null);
        return false;
    }

    @Override // nw4.q2
    public int b() {
        return 368;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "shareCustomContent";
    }
}
