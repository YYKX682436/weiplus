package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public final class q7 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134 f181167a;

    public q7(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134 activityC13481xc7ac0134) {
        this.f181167a = activityC13481xc7ac0134;
    }

    @Override // ym5.m0
    public boolean d() {
        return false;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f374658i;
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.f7 f7Var = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.f7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.f7) obj : null;
                if (f7Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134 activityC13481xc7ac0134 = this.f181167a;
                    r45.ab0 ab0Var = f7Var.f180992e;
                    java.util.Iterator it6 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134.U6(activityC13481xc7ac0134, ab0Var).iterator();
                    while (it6.hasNext()) {
                        for (r45.ed6 sportRecord : (java.util.LinkedList) it6.next()) {
                            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13481xc7ac0134.mo55332x76847179();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                            z32.e0 e0Var = (z32.e0) pf5.z.f435481a.a(mo55332x76847179).a(z32.e0.class);
                            java.lang.String userName = activityC13481xc7ac0134.f180924g;
                            int i17 = ab0Var.f451413d;
                            e0Var.getClass();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sportRecord, "sportRecord");
                            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = e0Var.m158354x19263085();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(te5.y1.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                            te5.y1 y1Var = (te5.y1) a17;
                            java.lang.String str2 = sportRecord.f454861e;
                            java.lang.String str3 = str2 == null || str2.length() == 0 ? i17 + "appId:" + sportRecord.f454860d : i17 + "appName:" + sportRecord.f454861e;
                            if (!y1Var.P6().contains(str3)) {
                                int i18 = sportRecord.f454868o;
                                a42.c cVar = a42.c.f82733a;
                                if (i18 != 0) {
                                    str = str3;
                                    if (i18 == 1) {
                                        try {
                                            int i19 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(new org.json.JSONObject(sportRecord.f454866m).optString("finder_username")) ? 1 : 2;
                                            java.lang.String appName = sportRecord.f454861e;
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appName, "appName");
                                            cVar.a(3, 2, appName, i19, 2, userName);
                                        } catch (org.json.JSONException e17) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SportScrollReportUIC", e17, "SportScrollReportUIC", new java.lang.Object[0]);
                                        }
                                    }
                                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("21f9d636b41b25be", sportRecord.f454860d)) {
                                    str = str3;
                                    cVar.a(3, 1, e0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jjh), 2, 2, userName);
                                } else {
                                    str = str3;
                                    ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Ni(sportRecord.f454860d, new z32.b0(i17, 3, userName, sportRecord));
                                }
                                y1Var.P6().add(str);
                            }
                        }
                    }
                }
            }
        }
    }
}
