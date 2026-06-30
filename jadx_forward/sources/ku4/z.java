package ku4;

/* loaded from: classes7.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final ku4.z f394072a = new ku4.z();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f394073b = lp0.b.e() + "/WebCanvasPkg";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f394074c = lp0.b.e() + "/WebPrefetcherPkg";

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f394075d = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f394076e = jz5.h.b(ku4.t.f394066d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f394077f = jz5.h.b(ku4.r.f394064d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f394078g = jz5.h.b(ku4.u.f394067d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f394079h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f394080i;

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f394081j;

    static {
        jz5.h.b(ku4.s.f394065d);
        f394079h = jz5.h.b(ku4.l.f394056d);
        f394080i = jz5.h.b(ku4.v.f394068d);
        f394081j = jz5.h.b(ku4.y.f394071d);
    }

    public static final void a(ku4.z zVar, com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String appId, long j17) {
        com.p314xaae8f345.mm.vfs.r6[] G;
        zVar.getClass();
        if (r6Var.m()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class);
            if (o6Var != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
                r45.mt g17 = zVar.g(appId);
                o6Var.Uf(appId, g17 != null ? g17.f462351f : 0);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f17 = zVar.f();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "<this>");
            java.lang.String u17 = f17.u("webcanvas_last_use_pkg_path_".concat(appId), "");
            long q17 = zVar.f().q("webcanvas_last_use_pkg_time_".concat(appId), 0L);
            java.lang.String l17 = zVar.l(appId);
            if (r6Var.m() && r6Var.y() && (G = r6Var.G()) != null) {
                for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                    r6Var2.o();
                    r6Var2.m82467xfb82e301();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r6Var2.o(), u17) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r6Var2.o(), l17)) {
                        r6Var2.l();
                        d(appId, r6Var2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasStorageLogic", "clearInvalidPkg appId=" + appId + ", path=" + r6Var2.o());
                        jx3.f.INSTANCE.w(1454L, 120L, 1L);
                    } else if (f394072a.j().contains(appId) && q17 != 0 && j17 - q17 > 2592000000L) {
                        r6Var2.l();
                        d(appId, r6Var2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasStorageLogic", "clearInvalidPkg on timeout appId=" + appId + ", path=" + r6Var2.o() + '}');
                        jx3.f.INSTANCE.w(1454L, 121L, 1L);
                    }
                }
            }
        }
    }

    public static final void d(java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = f394075d;
        synchronized (copyOnWriteArraySet) {
            java.util.Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((zs1.a) ((ku4.j) it.next())).getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPkgClear appId: ");
                sb6.append(str);
                sb6.append(", pkgFile: ");
                sb6.append(r6Var != null ? r6Var.o() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherPkgManager", sb6.toString());
            }
        }
    }

    public static final java.lang.String i(java.lang.String str) {
        if (str == null) {
            return "";
        }
        ku4.z zVar = f394072a;
        java.lang.String h17 = zVar.k() == 1 ? zVar.h(str, 2) : zVar.l(str);
        return h17 == null ? "" : h17;
    }

    public final synchronized void b(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        if ((appId.length() > 0) && !j().contains(appId)) {
            j().add(appId);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class);
            if (o6Var != null) {
                o6Var.Uf(appId, 0);
            }
            m();
        }
    }

    public final void c(boolean z17) {
        long q17 = f().q("webcanvas_last_clear_pkg_time", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long abs = java.lang.Math.abs(currentTimeMillis - q17);
        if (z17 || abs >= 86400000) {
            f().B("webcanvas_last_clear_pkg_time", currentTimeMillis);
            ((ku5.t0) ku5.t0.f394148d).k(ku4.o.f394059d, 20000L);
        }
    }

    public final java.lang.Object e(nu4.a aVar, java.lang.String str, java.lang.String str2, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        ku4.z zVar = f394072a;
        long longValue = ((java.lang.Number) ((jz5.n) f394081j).mo141623x754a37bb()).longValue();
        zVar.b(str);
        if (zVar.k() == 1) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n6.class)).A7("wx97b7aebac2183fd2", 2, new ku4.m("wx97b7aebac2183fd2"), new ku4.n("wx97b7aebac2183fd2"));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n6.class)).A7(str, 2, new ku4.m(str), new ku4.n(str));
        } else {
            zVar.o();
            zVar.p(str, longValue, 10);
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(zVar.l(str))) {
            zw4.g.a(zw4.e.f558443e, zw4.f.f558450g, aVar.f421766a.f460759d, i17, aVar.f421769d, aVar.f421770e, "", "");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasStorageLogic", "fetchBizPrefetchPkg pkg not exist, wait for download complete. appId=".concat(str));
            zw4.g.a(zw4.e.f558445g, zw4.f.f558450g, aVar.f421766a.f460759d, i17, aVar.f421769d, aVar.f421770e, "", "");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n6.class)).A7(str, zVar.k() != 1 ? 0 : 2, new ku4.p(str, nVar), new ku4.q(str, nVar));
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar2 = pz5.a.f440719d;
        return a17;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f394077f).mo141623x754a37bb();
    }

    public final r45.mt g(java.lang.String appId) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        byte[] j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f17 = f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "<get-mmkv>(...)");
        java.lang.String concat = "webcanvas_pkg_info_".concat(appId);
        if (f17.f(concat) && (j17 = f17.j(concat)) != null) {
            if (!(j17.length == 0)) {
                try {
                    java.lang.Object newInstance = r45.mt.class.newInstance();
                    ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance).mo11468x92b714fd(j17);
                    fVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                }
                return (r45.mt) fVar;
            }
        }
        fVar = null;
        return (r45.mt) fVar;
    }

    public final java.lang.String h(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 q66 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class)).q6(appId, i17, 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPreviewPkgPath appId=");
            sb6.append(appId);
            sb6.append(", pkgType=");
            sb6.append(i17);
            sb6.append(", md5=");
            sb6.append(q66 != null ? q66.f67186x912ff5eb : null);
            sb6.append(" download version= ");
            sb6.append(q66 != null ? java.lang.Integer.valueOf(q66.f67185x8987ca93) : null);
            sb6.append(" path=");
            sb6.append(q66 != null ? q66.f67183x55b471cc : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasStorageLogic", sb6.toString());
            if (q66 != null) {
                return q66.f67183x55b471cc;
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebCanvasStorageLogic", "getPreviewPkgPath ex " + e17.getMessage());
            return null;
        }
    }

    public final java.util.LinkedList j() {
        return (java.util.LinkedList) ((jz5.n) f394076e).mo141623x754a37bb();
    }

    public final int k() {
        return ((java.lang.Number) ((jz5.n) f394078g).mo141623x754a37bb()).intValue();
    }

    public final java.lang.String l(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(appId)) {
            return null;
        }
        r45.mt g17 = g(appId);
        if (g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasStorageLogic", "geReleasePkgPath pkgInfo is null, appId: %s", appId);
            return null;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(g17.f462350e)) {
            f().D("webcanvas_last_use_pkg_path_".concat(appId), new com.p314xaae8f345.mm.vfs.r6(g17.f462350e).o());
            f().B("webcanvas_last_use_pkg_time_".concat(appId), java.lang.System.currentTimeMillis());
            return g17.f462350e;
        }
        java.lang.String h17 = h(appId, 0);
        if (!com.p314xaae8f345.mm.vfs.w6.j(h17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasStorageLogic", "geReleasePkgPath pkgInfo " + g17.f462350e + " not exist");
            return null;
        }
        jx3.f.INSTANCE.w(1454L, 123L, 1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasStorageLogic", "geReleasePkgPath use wxa appId=" + appId + ", md5=" + g17.f462353h + " download version= " + g17.f462351f + " path=" + h17);
        return h17;
    }

    public final synchronized void m() {
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f17 = f();
            r45.wb5 wb5Var = new r45.wb5();
            wb5Var.f470570d = f394072a.j();
            f17.H("KPrefetcherBizAppIds", wb5Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebCanvasStorageLogic", "saveBizAppIds ex " + e17.getMessage());
        }
    }

    public final void n(java.lang.String appId, r45.mt pkg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkg, "pkg");
        f().H("webcanvas_pkg_info_".concat(appId), pkg.mo14344x5f01b1f6());
    }

    public final void o() {
        if (p("wx97b7aebac2183fd2", ((java.lang.Number) ((jz5.n) f394080i).mo141623x754a37bb()).longValue(), 6)) {
            jx3.f.INSTANCE.w(1454L, 54L, 1L);
        }
    }

    public final boolean p(java.lang.String str, long j17, int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f17 = f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        long j18 = f17.getLong(str.concat("-lastDownLoawnTime"), 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long abs = java.lang.Math.abs(currentTimeMillis - j18);
        if ((k() == 0 && abs < j17) || (k() != 0 && abs < com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d)) {
            k();
            return false;
        }
        f().B(str.concat("-lastDownLoawnTime"), currentTimeMillis);
        if (((java.util.List) ((jz5.n) f394079h).mo141623x754a37bb()).contains(str)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n6.class)).A7(str, 0, new ku4.w(str), new ku4.x(str));
            return true;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6.class)).z8(null, str, i17);
        return true;
    }
}
