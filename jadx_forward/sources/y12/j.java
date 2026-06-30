package y12;

/* loaded from: classes12.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    public static int f540401c;

    /* renamed from: d, reason: collision with root package name */
    public static int f540402d;

    /* renamed from: e, reason: collision with root package name */
    public static int f540403e;

    /* renamed from: f, reason: collision with root package name */
    public static int f540404f;

    /* renamed from: g, reason: collision with root package name */
    public static y12.j f540405g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f540406a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public f21.g f540407b;

    public static java.lang.String c() {
        return rr.s.f480682a.a();
    }

    public static y12.j e() {
        if (f540405g == null) {
            synchronized (y12.j.class) {
                f540405g = new y12.j();
            }
        }
        return f540405g;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0135 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y12.j.a(java.lang.String, java.lang.String):boolean");
    }

    public final int b(y12.i iVar) {
        int ordinal = iVar.ordinal();
        if (ordinal == 0) {
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_NEW_EMOJI_INT, 0)).intValue();
            f540401c = intValue;
            return intValue;
        }
        if (ordinal == 1) {
            int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_NEW_PANEL_INT, 0)).intValue();
            f540402d = intValue2;
            return intValue2;
        }
        if (ordinal == 2) {
            int intValue3 = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_NEW_SUGGEST_INT, 0)).intValue();
            f540403e = intValue3;
            return intValue3;
        }
        if (ordinal == 3) {
            return f11.e.f340087a;
        }
        if (ordinal != 4) {
            return -1;
        }
        int intValue4 = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_EGG_INT, 0)).intValue();
        f540404f = intValue4;
        return intValue4;
    }

    public f21.g d() {
        f21.g gVar;
        synchronized (this) {
            f21.g gVar2 = this.f540407b;
            if (gVar2 != null) {
                return gVar2;
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(c(), "egg"), "egg.xml");
            if (r6Var.m()) {
                g(r6Var);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiResUpdateMgr", "getEggList: from xml");
            synchronized (this) {
                gVar = this.f540407b;
            }
            return gVar;
        }
    }

    public final nr.g f(y12.i iVar) {
        java.util.HashMap hashMap = this.f540406a;
        nr.g gVar = (nr.g) hashMap.get(iVar);
        if (gVar == null) {
            gVar = new nr.g();
            hashMap.put(iVar, gVar);
        }
        int ordinal = iVar.ordinal();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6405x5dfc49e3 c6405x5dfc49e3 = gVar.f420579a;
        if (ordinal == 0) {
            c6405x5dfc49e3.f137536i = 1;
        } else if (ordinal == 1) {
            c6405x5dfc49e3.f137536i = 2;
        } else if (ordinal == 2) {
            c6405x5dfc49e3.f137536i = 3;
        } else if (ordinal == 4) {
            c6405x5dfc49e3.f137536i = 5;
        } else if (ordinal == 5) {
            c6405x5dfc49e3.f137536i = 6;
        } else if (ordinal == 6) {
            c6405x5dfc49e3.f137536i = 7;
        }
        return gVar;
    }

    public final boolean g(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        com.p314xaae8f345.mm.vfs.z7 z7Var;
        try {
            f21.g b17 = rr.t.b(r6Var);
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiResUpdateMgr", "parserEmojiEggConfig: error null");
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiResUpdateMgr", "parserEmojiEggConfig: %s", java.lang.Integer.valueOf(b17.f340431d.size()));
            synchronized (this) {
                this.f540407b = b17;
            }
            java.lang.String str = c() + "/egg";
            com.p314xaae8f345.mm.vfs.z7 a17 = str == null ? null : com.p314xaae8f345.mm.vfs.z7.a(str);
            if (a17 == null) {
                z7Var = new com.p314xaae8f345.mm.vfs.z7(null, null, com.p314xaae8f345.mm.vfs.e8.l("config.conf", false, false), null, null);
            } else {
                z7Var = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, com.p314xaae8f345.mm.vfs.e8.l(a17.f294812f + "/config.conf", false, false), a17.f294813g, a17.f294814h);
            }
            f540404f = rr.t.d(z7Var.m82499x9616526c());
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_EGG_INT, java.lang.Integer.valueOf(f540404f));
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.EmojiResUpdateMgr", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public void h(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd, boolean z17) {
        com.p314xaae8f345.mm.vfs.z7 z7Var;
        z85.b0 b0Var;
        com.p314xaae8f345.mm.vfs.z7 z7Var2;
        y12.i iVar = y12.i.EMOJI;
        int b17 = b(iVar);
        nr.g f17 = f(iVar);
        boolean a17 = a(c5255x5f3208fd.f135586g.f89294c, "temp");
        java.lang.String str = c() + "/temp";
        com.p314xaae8f345.mm.vfs.z7 a18 = str == null ? null : com.p314xaae8f345.mm.vfs.z7.a(str);
        if (a18 == null) {
            z7Var = new com.p314xaae8f345.mm.vfs.z7(null, null, com.p314xaae8f345.mm.vfs.e8.l("config.conf", false, false), null, null);
        } else {
            z7Var = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, com.p314xaae8f345.mm.vfs.e8.l(a18.f294812f + "/config.conf", false, false), a18.f294813g, a18.f294814h);
        }
        int d17 = rr.t.d(z7Var.m82499x9616526c());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6405x5dfc49e3 c6405x5dfc49e3 = f17.f420579a;
        c6405x5dfc49e3.f137534g = b17;
        c6405x5dfc49e3.f137535h = d17;
        f17.b(a17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6405x5dfc49e3 c6405x5dfc49e32 = f17.f420579a;
        c6405x5dfc49e32.f137533f = 0;
        c6405x5dfc49e32.k();
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiResUpdateMgr", "updateEmoji unzip file failed.");
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.f(c() + "/newemoji");
        com.p314xaae8f345.mm.vfs.w6.v(c() + "/temp", c() + "/newemoji");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(c(), "newemoji"), "newemoji-config.xml");
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiResUpdateMgr", "updateEmoji config don't exist.");
            return;
        }
        java.util.ArrayList c17 = rr.t.c(r6Var);
        nr.g f18 = f(iVar);
        f18.a(!c17.isEmpty());
        int size = c17.size();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6405x5dfc49e3 c6405x5dfc49e33 = f18.f420579a;
        c6405x5dfc49e33.f137533f = size;
        c6405x5dfc49e33.k();
        if (!c17.isEmpty()) {
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5 f19 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f();
            synchronized (f19.f276696a) {
                b0Var = f19.f276706k;
            }
            if (b0Var.y0(c17)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5318x4b0c5c72 c5318x4b0c5c72 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5318x4b0c5c72();
                c5318x4b0c5c72.f135633g.f88852a = 1;
                c5318x4b0c5c72.e();
                java.lang.String str2 = c() + "/newemoji";
                com.p314xaae8f345.mm.vfs.z7 a19 = str2 != null ? com.p314xaae8f345.mm.vfs.z7.a(str2) : null;
                if (a19 == null) {
                    z7Var2 = new com.p314xaae8f345.mm.vfs.z7(null, null, com.p314xaae8f345.mm.vfs.e8.l("config.conf", false, false), null, null);
                } else {
                    z7Var2 = new com.p314xaae8f345.mm.vfs.z7(a19.f294810d, a19.f294811e, com.p314xaae8f345.mm.vfs.e8.l(a19.f294812f + "/config.conf", false, false), a19.f294813g, a19.f294814h);
                }
                f540401c = rr.t.d(z7Var2.m82499x9616526c());
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_NEW_EMOJI_INT, java.lang.Integer.valueOf(f540401c));
            }
        }
        zy.r rVar = (zy.r) i95.n0.c(zy.r.class);
        am.r2 r2Var = c5255x5f3208fd.f135586g;
        ((yy.a) rVar).Ri(r2Var.f89292a, r2Var.f89293b, r2Var.f89295d);
    }
}
