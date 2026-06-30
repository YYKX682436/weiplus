package kr3;

/* loaded from: classes11.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.q1 f392946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f392947e;

    public m1(kr3.q1 q1Var, java.lang.Boolean bool) {
        this.f392946d = q1Var;
        this.f392947e = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kr3.q1 q1Var = this.f392946d;
        q1Var.getClass();
        java.lang.Boolean bool = this.f392947e;
        if (bool != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f c6829x19be670f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f();
            if (bool.booleanValue()) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = q1Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                pf5.z zVar = pf5.z.f435481a;
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.j1) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.j1.class)).f393013h;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = q1Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9) ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.w0) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.w0.class)).f393013h;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = q1Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
                java.util.List list = ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.i0) zVar.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.i0.class)).f235605s;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    java.lang.String str = ((mr3.l) it.next()).f412412h;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = q1Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
                pf5.z zVar2 = pf5.z.f435481a;
                ((gc0.p2) zVar2.a(activity4).a(gc0.p2.class)).f351781m.b(c21503x6e5a020a != null ? c21503x6e5a020a.m79018xbf6ca3d1() : null, c19645x574159e9 != null ? c19645x574159e9.m75370xcd47ad5f() : null, arrayList, c21503x6e5a020a);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity5 = q1Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity5, "activity");
                ((hr3.w1) zVar2.a(activity5).a(hr3.w1.class)).O6();
                c6829x19be670f.f141509o = 1L;
            } else {
                c6829x19be670f.f141509o = 2L;
            }
            c6829x19be670f.f141507m = java.lang.System.currentTimeMillis() - q1Var.f393001y;
            c6829x19be670f.p((java.lang.String) ((jz5.n) q1Var.f392985f).mo141623x754a37bb());
            c6829x19be670f.f141517w = c6829x19be670f.b("sessionid", q1Var.f393002z, true);
            com.p314xaae8f345.mm.p670x38b72420.o R6 = q1Var.R6();
            c6829x19be670f.f141510p = R6 != null && ((yq3.v) R6).k() ? 1L : 3L;
            if (q1Var.m158359x1e885992().getIntExtra("key_label_click_source", 0) > 0) {
                c6829x19be670f.f141512r = 22L;
            }
            for (java.lang.Class cls : q1Var.Q6()) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity6 = q1Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity6, "activity");
                ((kr3.t) pf5.z.f435481a.a(activity6).a(cls)).f7(c6829x19be670f);
            }
            c6829x19be670f.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "22865 report:\n" + c6829x19be670f.n());
        }
    }
}
