package kr3;

/* loaded from: classes11.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.q0 f392944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f392945e;

    public m0(kr3.q0 q0Var, java.lang.Boolean bool) {
        this.f392944d = q0Var;
        this.f392945e = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kr3.q0 q0Var = this.f392944d;
        q0Var.getClass();
        java.lang.Boolean bool = this.f392945e;
        if (bool != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f c6829x19be670f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f();
            if (bool.booleanValue()) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = q0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                pf5.z zVar = pf5.z.f435481a;
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.k1) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.k1.class)).f392926h;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = q0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9) ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.x0) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.x0.class)).f392926h;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = q0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
                java.util.List list = ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0) zVar.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0.class)).f235464s;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    java.lang.String str = ((mr3.l) it.next()).f412412h;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = q0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
                pf5.z zVar2 = pf5.z.f435481a;
                ((gc0.p2) zVar2.a(activity4).a(gc0.p2.class)).f351781m.b(c21503x6e5a020a != null ? c21503x6e5a020a.m79018xbf6ca3d1() : null, c19645x574159e9 != null ? c19645x574159e9.m75370xcd47ad5f() : null, arrayList, c21503x6e5a020a);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity5 = q0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity5, "activity");
                ((hr3.w1) zVar2.a(activity5).a(hr3.w1.class)).O6();
                c6829x19be670f.f141509o = 1L;
            } else {
                c6829x19be670f.f141509o = 2L;
            }
            c6829x19be670f.f141507m = java.lang.System.currentTimeMillis() - q0Var.f392981y;
            c6829x19be670f.p((java.lang.String) ((jz5.n) q0Var.f392965f).mo141623x754a37bb());
            c6829x19be670f.f141517w = c6829x19be670f.b("sessionid", q0Var.f392982z, true);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = q0Var.f392966g;
            c6829x19be670f.f141510p = z3Var != null && z3Var.r2() ? 1L : 3L;
            if (q0Var.m158359x1e885992().getIntExtra("key_label_click_source", 0) > 0) {
                c6829x19be670f.f141512r = 22L;
            }
            for (java.lang.Class cls : q0Var.R6()) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity6 = q0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity6, "activity");
                ((kr3.j) pf5.z.f435481a.a(activity6).a(cls)).g7(c6829x19be670f);
            }
            c6829x19be670f.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "22865 report:\n" + c6829x19be670f.n());
        }
    }
}
