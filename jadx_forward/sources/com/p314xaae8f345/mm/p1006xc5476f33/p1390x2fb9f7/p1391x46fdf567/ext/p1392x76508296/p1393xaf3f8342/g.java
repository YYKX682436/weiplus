package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342;

/* loaded from: classes15.dex */
public abstract class g {
    public static void a(java.lang.String str) {
        r45.c45 e17;
        nm5.b l17;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.f181316a;
        if (str == null || (e17 = x52.c.e()) == null || (l17 = bVar.l(e17.f452803d)) == null) {
            return;
        }
        java.lang.String str2 = e17.f452803d;
        if (str2 == null ? false : p3321xbce91901.jvm.p3324x21ffc6bd.o.b("145", bVar.a(str2))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellKSessionConfig", "HellK, updateCurSid, old: " + e17.f452803d);
        java.lang.String str3 = str + '_' + l17.a(1);
        e17.f452803d = str3;
        x52.c.j(e17);
        java.lang.Object a17 = l17.a(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.f181318c = (java.lang.String) a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellKSessionConfig", "HellK, updateCurSid, new: " + str3);
    }
}
