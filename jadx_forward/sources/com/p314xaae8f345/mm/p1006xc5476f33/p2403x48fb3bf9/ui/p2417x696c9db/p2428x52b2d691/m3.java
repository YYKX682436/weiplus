package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class m3 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.m3 f267887d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.m3();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        nw4.g gVar;
        java.lang.Object obj;
        jz5.f0 f0Var;
        android.app.Activity activity;
        java.lang.Object obj2;
        java.lang.String string;
        java.lang.Object obj3;
        java.lang.String string2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleHaoKanAction", "JsApiHandleHaoKanAction action=%s", str2);
        boolean z17 = str2 == null || str2.length() == 0;
        nw4.g gVar2 = env.f422396d;
        if (z17) {
            gVar2.e(msg.f422546c, msg.f422552i + ":fail action is empty", null);
            return true;
        }
        int hashCode = str2.hashCode();
        aw4.m0 m0Var = aw4.n0.f96434a;
        java.lang.String str3 = "result";
        switch (hashCode) {
            case -1893015372:
                if (!str2.equals("checkSyncHaoKanPermission")) {
                    return false;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("tophitory_show_init_dialog", false)) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("result", 1);
                    hashMap.put("dialogShowed", 0);
                    gVar2.e(msg.f422546c, msg.f422552i + ":ok", hashMap);
                } else {
                    java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
                    if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                        str = ":ok";
                        gVar = gVar2;
                        obj = "dialogShowed";
                        f0Var = null;
                    } else {
                        mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.l3 l3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.l3(env, msg);
                        if (((lf0.h0) g0Var).Ai()) {
                            java.lang.String string3 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574937on4);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                            gVar = gVar2;
                            java.lang.String string4 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574936on3);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                            try {
                                obj3 = ((java.util.HashMap) msg.f422323a).get("haoKanScene");
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleHaoKanAction", "checkHaoKanPermission New, e = %s", e17);
                            }
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("1", obj3)) {
                                string2 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574936on3);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("2", obj3)) {
                                string2 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574935on2);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                            } else {
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("3", obj3)) {
                                    string2 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574938on5);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleHaoKanAction", "handleCheckSyncHanKanPermissionAction New, type = %s, tips = %s", obj3, string4);
                                java.lang.String str4 = string4;
                                ((sg0.w3) ((tg0.x1) i95.n0.c(tg0.x1.class))).getClass();
                                obj = "dialogShowed";
                                m0Var.b(activity, l3Var, str4, string3, true, "tophitory_show_init_dialog");
                                str3 = "result";
                                str = ":ok";
                            }
                            string4 = string2;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleHaoKanAction", "handleCheckSyncHanKanPermissionAction New, type = %s, tips = %s", obj3, string4);
                            java.lang.String str42 = string4;
                            ((sg0.w3) ((tg0.x1) i95.n0.c(tg0.x1.class))).getClass();
                            obj = "dialogShowed";
                            m0Var.b(activity, l3Var, str42, string3, true, "tophitory_show_init_dialog");
                            str3 = "result";
                            str = ":ok";
                        } else {
                            gVar = gVar2;
                            obj = "dialogShowed";
                            str = ":ok";
                            java.lang.String string5 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1d);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
                            try {
                                obj2 = ((java.util.HashMap) msg.f422323a).get("haoKanScene");
                            } catch (java.lang.Exception e18) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleHaoKanAction", "checkHaoKanPermission, e = %s", e18);
                            }
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("1", obj2)) {
                                string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1d);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("2", obj2)) {
                                string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1c);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                            } else {
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("3", obj2)) {
                                    string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1e);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleHaoKanAction", "handleCheckSyncHanKanPermissionAction, type = %s, tips = %s", obj2, string5);
                                ((sg0.w3) ((tg0.x1) i95.n0.c(tg0.x1.class))).getClass();
                                m0Var.e(activity, l3Var, string5);
                            }
                            string5 = string;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleHaoKanAction", "handleCheckSyncHanKanPermissionAction, type = %s, tips = %s", obj2, string5);
                            ((sg0.w3) ((tg0.x1) i95.n0.c(tg0.x1.class))).getClass();
                            m0Var.e(activity, l3Var, string5);
                        }
                        f0Var = jz5.f0.f384359a;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleHaoKanAction", "handleCheckSyncHanKanPermissionAction activity is null");
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        hashMap2.put(str3, 0);
                        hashMap2.put(obj, 0);
                        gVar.e(msg.f422546c, msg.f422552i + str, hashMap2);
                    }
                }
                return true;
            case -824426050:
                if (!str2.equals("openHaoKanSettingsPage")) {
                    return false;
                }
                java.lang.String str5 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("mode");
                if (str5 == null) {
                    str5 = "normal";
                }
                mf0.g0 g0Var2 = (mf0.g0) i95.n0.c(mf0.g0.class);
                android.content.Context context = env.f422393a;
                ((lf0.h0) g0Var2).getClass();
                wm4.u.t(context, str5);
                break;
            case 24293759:
                if (!str2.equals("isHaoKanSwitchOn")) {
                    return false;
                }
                java.util.HashMap hashMap3 = new java.util.HashMap();
                boolean wi6 = ((lf0.w) ((mf0.e0) i95.n0.c(mf0.e0.class))).wi();
                hashMap3.put("isOpen", java.lang.Boolean.valueOf(wi6));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleHaoKanAction", "checkHaoKanSwitchOn isOpen " + wi6);
                gVar2.e(msg.f422546c, msg.f422552i + ":ok", hashMap3);
                break;
            case 1195381771:
                if (!str2.equals("checkSyncCommentPermission")) {
                    return false;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("tophitory_show_comment_dialog", false)) {
                    java.lang.ref.WeakReference k18 = com.p314xaae8f345.mm.app.w.k();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k18, "getTopActivity(...)");
                    if (((android.app.Activity) k18.get()) == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleHaoKanAction", "handleCheckSyncCommentPermission activity is null");
                        java.util.HashMap hashMap4 = new java.util.HashMap();
                        hashMap4.put("result", 0);
                        hashMap4.put("dialogShowed", 0);
                        gVar2.e(msg.f422546c, msg.f422552i + ":ok", hashMap4);
                        break;
                    } else {
                        tg0.x1 x1Var = (tg0.x1) i95.n0.c(tg0.x1.class);
                        android.app.Activity activity2 = (android.app.Activity) k18.get();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity2);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k3 k3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k3(env, msg);
                        ((sg0.w3) x1Var).getClass();
                        m0Var.d(activity2, k3Var, true);
                        break;
                    }
                } else {
                    java.util.HashMap hashMap5 = new java.util.HashMap();
                    hashMap5.put("result", 1);
                    hashMap5.put("dialogShowed", 0);
                    gVar2.e(msg.f422546c, msg.f422552i + ":ok", hashMap5);
                    break;
                }
            default:
                return false;
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 335;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "handleHaokanAction";
    }

    @Override // qw4.a
    public boolean d() {
        return true;
    }
}
