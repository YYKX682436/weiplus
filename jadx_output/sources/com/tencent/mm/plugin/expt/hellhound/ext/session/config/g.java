package com.tencent.mm.plugin.expt.hellhound.ext.session.config;

/* loaded from: classes15.dex */
public abstract class g {
    public static void a(java.lang.String str) {
        r45.c45 e17;
        nm5.b l17;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.tencent.mm.plugin.expt.hellhound.ext.session.config.b bVar = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99783a;
        if (str == null || (e17 = x52.c.e()) == null || (l17 = bVar.l(e17.f371270d)) == null) {
            return;
        }
        java.lang.String str2 = e17.f371270d;
        if (str2 == null ? false : kotlin.jvm.internal.o.b("145", bVar.a(str2))) {
            return;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellKSessionConfig", "HellK, updateCurSid, old: " + e17.f371270d);
        java.lang.String str3 = str + '_' + l17.a(1);
        e17.f371270d = str3;
        x52.c.j(e17);
        java.lang.Object a17 = l17.a(0);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99785c = (java.lang.String) a17;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellKSessionConfig", "HellK, updateCurSid, new: " + str3);
    }
}
