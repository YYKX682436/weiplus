package ov;

@j95.b
/* loaded from: classes7.dex */
public final class f0 extends i95.w implements pv.c0 {
    public void Ai(pv.b0 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f();
        f17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "clickFloatMenu scene: %s", scene);
        if (f17.i()) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.h()).A(f17.e(scene), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174739t = java.lang.Boolean.TRUE;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.h()).G("content_menu_clicked", true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j()) {
            f17.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a);
            return;
        }
        f17.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274591f);
        f17.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274592g);
        f17.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274593h);
        f17.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274594i);
        f17.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274595j);
    }

    public java.lang.String Bi(pv.a0 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        int ordinal = scene.ordinal();
        if (ordinal == 0) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ncj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        if (ordinal == 1) {
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nck);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            return string2;
        }
        if (ordinal != 2) {
            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nck);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            return string3;
        }
        java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nci);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        return string4;
    }

    public boolean Di(pv.a0 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (!z65.c.a()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        } else if (bm5.o1.f104252a.i(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2530x822d9a5b.C20169x45190b8c(), 0) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallEducationService", "hasShownEduView scene: " + scene + ", always show for test");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f();
        f17.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174737r;
        int i17 = scene.f440011d;
        java.lang.Boolean bool = (java.lang.Boolean) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.h()).i("content_edu_" + i17, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "isContentBallEducationViewShown scene: %s, shown: %s", scene, java.lang.Boolean.valueOf(i18));
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(i18));
        return i18;
    }

    public void Ni(pv.b0 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f();
        boolean z17 = false;
        f17.a(false);
        if (!f17.i() && com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174739t.booleanValue()) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174738s;
            int i17 = scene.f440019d;
            java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
            if (num == null) {
                num = 1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "decrementMenuNewCanShowCount scene: %s, canShowCount: %s", scene, num);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(java.lang.Math.max(java.lang.Integer.valueOf(num.intValue() - 1).intValue(), 0));
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), valueOf);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.h()).A(f17.e(scene), valueOf.intValue());
            pv.b0[] m159039xcee59d22 = pv.b0.m159039xcee59d22();
            int length = m159039xcee59d22.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    z17 = true;
                    break;
                } else if (f17.g(m159039xcee59d22[i18]) > 0) {
                    break;
                } else {
                    i18++;
                }
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "checkBallMenuAllSceneNotShow allNotShow");
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174740u = java.lang.Boolean.TRUE;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.h()).G("content_menu_all_not_show", true);
            }
        }
    }

    public void Ri(pv.a0 scene, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f();
        f17.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174737r;
        int i17 = scene.f440011d;
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "saveContentBallEducationViewShown scene: %s, shown: %s", scene, java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.h()).G("content_edu_" + i17, z17);
    }

    public boolean wi(pv.b0 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f();
        f17.getClass();
        f17.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "canShowFloatMenuNewFlag scene: %s, allNotShow: %s", scene, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174740u);
        if (f17.i()) {
            return false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174739t.booleanValue()) {
            int g17 = f17.g(scene);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "canShowFloatMenuNewFlag scene: %s, canShowCount: %s", scene, java.lang.Integer.valueOf(g17));
            if (g17 <= 0) {
                return false;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "canShowFloatMenuNewFlag not click and always show");
        }
        return true;
    }
}
