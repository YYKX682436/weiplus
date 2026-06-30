package w14;

/* loaded from: classes11.dex */
public final class d implements xg3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final w14.d f523767d;

    /* renamed from: e, reason: collision with root package name */
    public static w14.c f523768e;

    /* renamed from: f, reason: collision with root package name */
    public static long f523769f;

    /* renamed from: g, reason: collision with root package name */
    public static long f523770g;

    /* renamed from: h, reason: collision with root package name */
    public static w14.c f523771h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f523772i;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f523773m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Map f523774n;

    static {
        w14.d dVar = new w14.d();
        f523767d = dVar;
        w14.c cVar = w14.c.f523761g;
        f523768e = cVar;
        f523771h = cVar;
        f523774n = kz5.c1.k(new jz5.l(w14.c.f523764m, new ip.k(3, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ohf))), new jz5.l(w14.c.f523763i, new ip.k(2, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ohg))), new jz5.l(w14.c.f523762h, new ip.k(1, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ohe))));
        dVar.c();
    }

    public final void a() {
        r45.f8 f8Var;
        c();
        if (f523771h == f523768e && f523769f == f523770g) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("not change. mBannerContentType = ");
            sb6.append(f523768e);
            sb6.append(", extStatus2 = ");
            long j17 = f523769f;
            r26.a.a(2);
            java.lang.String l17 = java.lang.Long.toString(j17, 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "toString(...)");
            sb6.append(l17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationHelper", sb6.toString());
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsNotificationHelper", "finish not main process");
            return;
        }
        r45.p53 p53Var = null;
        if (f523771h != f523768e) {
            f8Var = new r45.f8();
            f8Var.f455616d = f523768e.f523766d;
        } else {
            f8Var = null;
        }
        if (!f523773m) {
            ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).a(235, this, true);
            ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).a(23, this, true);
            f523773m = true;
        }
        long j18 = f523769f;
        if (j18 != f523770g) {
            boolean z17 = (j18 & 9007199254740992L) == 0;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("extStatus2 changed. showAvatar: ");
            sb7.append(z17);
            sb7.append(", extStatus2: ");
            long j19 = f523769f;
            r26.a.a(2);
            java.lang.String l18 = java.lang.Long.toString(j19, 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l18, "toString(...)");
            sb7.append(l18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationHelper", sb7.toString());
            p53Var = new r45.p53();
            p53Var.f464294d = 106;
            p53Var.f464295e = z17 ? 2 : 1;
        } else {
            r26.a.a(2);
            java.lang.String l19 = java.lang.Long.toString(j18, 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l19, "toString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationHelper", "extStatus2 not changed: ".concat(l19));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (f8Var != null) {
            arrayList.add(new xg3.p0(235, f8Var));
        }
        if (p53Var != null) {
            arrayList.add(new xg3.p0(23, p53Var));
        }
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationHelper", "opList is empty");
        } else {
            ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).c(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationHelper", "doOplog mBannerContentType = " + f523768e.f523766d);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("finish mBannerContentType = ");
        sb8.append(f523768e);
        sb8.append(", extStatus2 = ");
        long j27 = f523769f;
        r26.a.a(2);
        java.lang.String l27 = java.lang.Long.toString(j27, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l27, "toString(...)");
        sb8.append(l27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationHelper", sb8.toString());
    }

    public final java.lang.String b() {
        c();
        if (f523768e == w14.c.f523761g) {
            f523768e = ip.b.a() ? w14.c.f523762h : w14.c.f523764m;
        }
        if (d(null)) {
            int ordinal = f523768e.ordinal();
            if (ordinal == 1) {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p__);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                return string;
            }
            if (ordinal == 2) {
                java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p_e);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                return string2;
            }
        }
        ip.k kVar = (ip.k) f523774n.get(f523768e);
        java.lang.String str = kVar != null ? kVar.f375105b : null;
        return str == null ? "" : str;
    }

    public final void c() {
        if (f523772i) {
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsNotificationHelper", "initBannerContentSettings not main process");
            return;
        }
        f523772i = true;
        w14.b bVar = w14.c.f523759e;
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_NOTIFICATION_BANNER_TYPE_NEW_INT_SYNC, null);
        f523768e = bVar.a(num == null ? 0 : num.intValue());
        f523769f = c01.z1.i();
        if (f523768e == w14.c.f523761g) {
            f523768e = ip.b.a() ? w14.c.f523762h : w14.c.f523764m;
        }
        f523771h = f523768e;
        f523770g = f523769f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init mBannerContentType = ");
        sb6.append(f523768e);
        sb6.append(", extStatus2 = ");
        long j17 = f523770g;
        r26.a.a(2);
        java.lang.String l17 = java.lang.Long.toString(j17, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "toString(...)");
        sb6.append(l17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationHelper", sb6.toString());
    }

    public final boolean d(java.lang.String str) {
        c();
        if (!(f523768e.f523766d != 0)) {
            return ip.b.a();
        }
        if (!e() && !f()) {
            return false;
        }
        long j17 = f523769f;
        boolean z17 = (9007199254740992L & j17) == 0;
        if ((j17 & 4503599627370496L) != 0) {
            return str == null ? z17 : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "1");
        }
        return true;
    }

    public final boolean e() {
        c();
        return f523768e.f523766d == 1;
    }

    public final boolean f() {
        c();
        return f523768e.f523766d == 2;
    }

    public final void g(boolean z17) {
        long j17 = f523769f;
        r26.a.a(2);
        java.lang.String l17 = java.lang.Long.toString(j17, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationHelper", "extStatus2 before: ".concat(l17));
        long j18 = f523769f | 4503599627370496L;
        f523769f = j18;
        long j19 = z17 ? j18 & (-9007199254740993L) : j18 | 9007199254740992L;
        f523769f = j19;
        r26.a.a(2);
        java.lang.String l18 = java.lang.Long.toString(j19, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l18, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationHelper", "extStatus2 after:  ".concat(l18));
    }

    public final void h(int i17) {
        f523768e = w14.c.f523759e.a(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationHelper", "updateApnsBannerDisplayContentSetting mBannerContentType = " + f523768e);
    }

    @Override // xg3.d0
    public void u0(int i17, r45.g25 g25Var, xg3.q0 q0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doOplog ret = ");
        sb6.append(i17);
        sb6.append(", oplogErrMsg = ");
        sb6.append(g25Var != null ? g25Var.f456375e : null);
        sb6.append(", ");
        sb6.append(g25Var != null ? g25Var.f456374d : null);
        sb6.append(", option = ");
        sb6.append(q0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationHelper", sb6.toString());
        l14.e.f396541a.b(l14.d.f396538g);
        if (i17 == 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_NOTIFICATION_BANNER_TYPE_NEW_INT_SYNC, java.lang.Integer.valueOf(f523768e.f523766d));
            bn0.g.f104312a.g("USERINFO_SETTING_NOTIFICATION_BANNER_TYPE_NEW_INT_SYNC", f523768e.f523766d);
            c01.z1.P(f523769f);
            f523771h = f523768e;
            f523770g = f523769f;
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("doOplog error ret = ");
        sb7.append(i17);
        sb7.append(", oplogErrMsg = ");
        sb7.append(g25Var != null ? g25Var.f456375e : null);
        sb7.append(", ");
        sb7.append(g25Var != null ? g25Var.f456374d : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsNotificationHelper", sb7.toString());
    }
}
