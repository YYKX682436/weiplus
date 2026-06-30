package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6;

/* loaded from: classes7.dex */
public final class g implements nh1.b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.g f167432a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.g();

    @Override // nh1.b
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        java.lang.Boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        if (!c17.booleanValue()) {
            android.view.LayoutInflater.from(context);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            new java.util.ArrayList();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.d(pageView);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.f(str, context, pageView);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
                h4Var.f309914y = null;
                h4Var.f309915z = null;
            }
            arrayList.clear();
            db5.g4 g4Var = new db5.g4(context);
            dVar.mo887xc459429a(g4Var);
            if (g4Var.z()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                return;
            }
            k0Var.f293405n = dVar;
            k0Var.f293414s = fVar;
            k0Var.f293387d = null;
            k0Var.G = null;
            k0Var.v();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondaryMenuDelegateAudits", "close Audits");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPerformanceTracer", "closeAudits");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.f168899d = java.lang.Boolean.FALSE;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.c(pageView)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = pageView.mo32091x9a3f0ba2().C0();
            if (C0 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EventOnGameAuditsStateChange", "service is null");
            } else {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("state", 1);
                od1.b bVar = new od1.b();
                bVar.t(hashMap);
                bVar.u(C0);
                bVar.m();
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C02 = pageView.mo32091x9a3f0ba2().C0();
            if (C02 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EventOnAppAuditsStateChange", "service is null");
            } else {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("state", 1);
                od1.a aVar = new od1.a();
                aVar.t(hashMap2);
                aVar.u(C02);
                aVar.m();
            }
        }
        va1.b bVar2 = va1.b.f515762a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2 = pageView.mo32091x9a3f0ba2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo32091x9a3f0ba2, "getRuntime(...)");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("audits_instanceid", mo32091x9a3f0ba2.u0().f128810w);
        bundle.putString("audits_appid", mo32091x9a3f0ba2.f156336n);
        bundle.putLong("audits_app_start_time", mo32091x9a3f0ba2.u0().I);
        android.os.Bundle bundle2 = (android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, va1.a.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.g(mo32091x9a3f0ba2.f156336n, bundle2 != null ? bundle2.getStringArrayList("audits_trace_event_list") : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuditsUtil", "tracer to write data");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba22 = pageView.mo32091x9a3f0ba2();
        if (mo32091x9a3f0ba22.f167720s2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "stopDumpTrace");
            mo32091x9a3f0ba22.f167720s2.d();
            mo32091x9a3f0ba22.f167720s2 = null;
        }
        java.lang.String str2 = mo32091x9a3f0ba22.f156336n;
        java.util.HashMap hashMap3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.f168884a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.f fVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.f) hashMap3.get(str2);
        if (fVar2 != null) {
            hashMap3.remove(str2);
            fVar2.h();
        }
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        java.lang.Boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        if (c17.booleanValue()) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.euv);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eux);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.c(pageView) && pageView.mo32091x9a3f0ba2().s2()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 b17 = pageView.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getConfig(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195) b17;
        if ((java.lang.Boolean.parseBoolean(pageView.mo32091x9a3f0ba2().S2(false).qe("supportAudits")) && (c11813xf952a195.f387385r.f156932d == 1 || c11813xf952a195.f387385r.f156932d == 2)) || z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            return true;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return false;
    }
}
