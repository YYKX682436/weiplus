package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class l extends o13.b {

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.Set f219118z = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public o13.y f219119e;

    /* renamed from: f, reason: collision with root package name */
    public o13.y f219120f;

    /* renamed from: g, reason: collision with root package name */
    public w13.b f219121g;

    /* renamed from: h, reason: collision with root package name */
    public o13.v f219122h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.HashSet f219123i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.HashMap f219124m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.HashMap f219125n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashMap f219126o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.HashMap f219127p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.reflect.Method f219128q;

    /* renamed from: r, reason: collision with root package name */
    public final l75.z0 f219129r = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m(this);

    /* renamed from: s, reason: collision with root package name */
    public final l75.z0 f219130s = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.n(this);

    /* renamed from: t, reason: collision with root package name */
    public final l75.q0 f219131t = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.o(this);

    /* renamed from: u, reason: collision with root package name */
    public final l75.q0 f219132u = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.p(this);

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f219133v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f219134w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f219135x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f219136y;

    static {
        java.lang.String[] split = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bll).split(";");
        if (split != null) {
            for (java.lang.String str : split) {
                f219118z.add(str);
            }
        }
    }

    public l() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f219133v = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785>(a0Var) { // from class: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$5
            {
                this.f39173x3fe91575 = -981145195;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785 c6205xeec13785) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785 c6205xeec137852 = c6205xeec13785;
                long j17 = c6205xeec137852.f136457g.f87952a;
                com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l.this;
                if (j17 <= 0) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) lVar.f219119e).b(131093, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.b1(lVar, null));
                    return false;
                }
                if (!lVar.f219136y.e()) {
                    return false;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = lVar.f219136y;
                long j18 = c6205xeec137852.f136457g.f87952a;
                b4Var.c(j18, j18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "* Update contact at once triggered.");
                return false;
            }
        };
        this.f219134w = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6197x2d9053b9>(a0Var) { // from class: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$6
            {
                this.f39173x3fe91575 = -1874260055;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6197x2d9053b9 c6197x2d9053b9) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l.this;
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) lVar.f219119e).b(65556, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.d0(lVar, o13.d.f423758k));
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) lVar.f219119e).b(131093, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.b1(lVar, null));
                return false;
            }
        };
        this.f219135x = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.q(this), true);
        this.f219136y = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.r(this), false);
    }

    public static void n(p13.z zVar) {
        if (zVar == null || zVar.f432717b != 131075 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.f432720e)) {
            return;
        }
        try {
            boolean z17 = true;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(zVar.f432720e, true);
            if (n17 != null && ((int) n17.E2) != 0) {
                zVar.f432738w = n17.v2();
                if (c01.e2.I(zVar.f432720e)) {
                    z17 = false;
                }
                zVar.f432739x = z17;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTS.FTS5SearchContactLogic", "fillChatroomSortFieldsIfNeeded failed for %s: %s", zVar.f432720e, th6.getMessage());
        }
    }

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        p13.c q0Var;
        int i17 = uVar.f432673b;
        if (i17 == 12) {
            q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.q0(this, uVar);
        } else if (i17 == 14) {
            q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.j0(this, uVar);
        } else if (i17 == 32) {
            q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.r0(this, uVar);
        } else if (i17 == 48) {
            q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.a1(this, uVar);
        } else if (i17 == 96) {
            q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.x0(this, uVar);
        } else if (i17 == 64) {
            q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y0(this, uVar);
        } else if (i17 == 65) {
            q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.z0(this, uVar);
        } else if (i17 == 99) {
            q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l0(this, uVar);
        } else if (i17 != 100) {
            switch (i17) {
                case 5:
                    q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m0(this, uVar);
                    break;
                case 6:
                    q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k0(this, uVar);
                    break;
                case 7:
                    q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.n0(this, uVar);
                    break;
                case 8:
                    q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s0(this, uVar);
                    break;
                case 9:
                    q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.v0(this, uVar);
                    break;
                default:
                    switch (i17) {
                        case 16:
                            q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.w0(this, uVar);
                            break;
                        case 17:
                            q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.x(this, uVar);
                            break;
                        case 18:
                            q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.t0(this, uVar);
                            break;
                        default:
                            q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.i0(this, uVar);
                            break;
                    }
            }
        } else {
            q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.u0(this, uVar);
        }
        if (17 == uVar.f432673b) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219120f).b(-131072, q0Var);
            return q0Var;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219120f).b(-65536, q0Var);
        return q0Var;
    }

    @Override // o13.w
    /* renamed from: getName */
    public java.lang.String mo9545xfb82e301() {
        return "FTS5SearchContactLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "Create Fail!");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "Create Success!");
        this.f219121g = (w13.b) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(3);
        this.f219119e = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218912d;
        this.f219120f = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218913e;
        this.f219122h = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).fj();
        this.f219123i = new java.util.HashSet();
        this.f219124m = new java.util.HashMap();
        this.f219125n = new java.util.HashMap();
        this.f219126o = new java.util.HashMap();
        this.f219127p = new java.util.HashMap();
        try {
            java.lang.reflect.Method declaredMethod = dm.e2.class.getDeclaredMethod("parseBuff", new java.lang.Class[0]);
            this.f219128q = declaredMethod;
            declaredMethod.setAccessible(true);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219119e).b(131072, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.c0(this, null));
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219119e).b(131082, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.t(this, null));
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219119e).b(131092, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.v(this, null));
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219119e).b(131095, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.w(this, null));
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().add(this.f219131t);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.f219130s);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().a(this.f219129r);
            l75.q0 q0Var = this.f219132u;
            ((l80.a) ((m80.i) i95.n0.c(m80.i.class))).f398522d.getClass();
            b93.r.wi().add(q0Var);
            this.f219135x.c(600000L, 600000L);
            this.f219133v.mo48813x58998cd();
            this.f219134w.mo48813x58998cd();
            return true;
        } catch (java.lang.NoSuchMethodException e17) {
            iz5.b bVar = new iz5.b("Can't find BaseContact.parseBuff method, class prototype has changed.");
            bVar.initCause(e17);
            throw bVar;
        }
    }

    @Override // o13.b
    public boolean i() {
        this.f219133v.mo48814x2efc64();
        this.f219134w.mo48814x2efc64();
        this.f219136y.d();
        this.f219135x.d();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f219130s);
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo49775xc84af884(this.f219131t);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(this.f219129r);
        l75.q0 q0Var = this.f219132u;
        ((l80.a) ((m80.i) i95.n0.c(m80.i.class))).f398522d.getClass();
        b93.r.wi().mo49775xc84af884(q0Var);
        java.util.HashMap hashMap = this.f219124m;
        if (hashMap != null) {
            hashMap.clear();
        }
        java.util.HashSet hashSet = this.f219123i;
        if (hashSet != null) {
            hashSet.clear();
        }
        this.f219121g = null;
        this.f219119e = null;
        this.f219120f = null;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int j(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String str2, java.lang.String[] strArr, byte[] bArr) {
        int i17;
        int i18;
        long j17;
        int i19;
        java.util.HashMap hashMap;
        java.lang.String str3;
        java.lang.String str4;
        int i27;
        java.lang.String[] strArr2 = strArr;
        java.lang.String str5 = "MicroMsg.FTS.FTS5SearchContactLogic";
        java.lang.String P0 = z3Var.P0();
        java.lang.String w07 = z3Var.w0();
        java.lang.String i28 = o13.n.i(w07, false);
        java.lang.String i29 = o13.n.i(w07, true);
        java.lang.String i37 = o13.n.i(P0, false);
        java.lang.String i38 = o13.n.i(P0, true);
        long b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) this.f219122h).b(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P0)) {
            i17 = 0;
        } else {
            this.f219121g.u(131075, 5, 0L, str, b17, P0);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i37)) {
                i17 = 1;
            } else {
                this.f219121g.u(131075, 6, 0L, str, b17, i37);
                i17 = 2;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i38)) {
                this.f219121g.u(131075, 7, 0L, str, b17, i38);
                i17++;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w07)) {
            i18 = 0;
        } else {
            int i39 = 0;
            this.f219121g.u(131075, 1, 0L, str, b17, w07);
            i17++;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i37)) {
                this.f219121g.u(131075, 2, 0L, str, b17, i28);
                i17++;
            }
            i18 = i39;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i38)) {
                this.f219121g.u(131075, 3, 0L, str, b17, i29);
                i17++;
                i18 = i39;
            }
        }
        if (!(str2 == null ? "" : str2).contains(c01.z1.r())) {
            return i17;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (strArr2 == null || strArr2.length <= 0) {
            j17 = 0;
            i19 = 0;
        } else {
            long length = strArr2.length;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            mo.a aVar = new mo.a();
            try {
                aVar.mo11468x92b714fd(bArr);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTS5SearchContactLogic", e17, "parse chatroom data", new java.lang.Object[i18]);
            }
            java.util.Iterator it = aVar.f411772d.iterator();
            while (it.hasNext()) {
                mo.b bVar = (mo.b) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f411781e)) {
                    hashMap2.put(bVar.f411780d, bVar.f411781e);
                }
            }
            java.util.HashMap r17 = r(strArr2);
            int i47 = i18;
            int i48 = i47;
            boolean z17 = i18;
            while (i48 < strArr2.length) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.String str6 = strArr2[i48];
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) r17.get(str6);
                if (z3Var2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "can not get chatroomMemberContact data memberUsername:%s i:%s", str6, java.lang.Integer.valueOf(i48));
                    sb7.append("\u200b");
                    hashMap = r17;
                    str3 = str5;
                } else {
                    hashMap = r17;
                    java.lang.String w08 = z3Var2.w0();
                    java.lang.String P02 = z3Var2.P0();
                    java.lang.String i49 = o13.n.i(w08, z17);
                    java.lang.String i57 = o13.n.i(w08, true);
                    if (w08 == null) {
                        w08 = "\u2002";
                    }
                    sb7.append(w08);
                    sb7.append("\u200c");
                    str3 = str5;
                    sb7.append(i49 == null ? "\u2002" : i49);
                    sb7.append("\u200c");
                    sb7.append(i57 == null ? "\u2002" : i57);
                    sb7.append("\u200c");
                    java.lang.String i58 = o13.n.i(P02, false);
                    java.lang.String i59 = o13.n.i(P02, true);
                    if (P02 == null) {
                        P02 = "\u2002";
                    }
                    sb7.append(P02);
                    sb7.append("\u200c");
                    sb7.append(i58 == null ? "\u2002" : i58);
                    sb7.append("\u200c");
                    sb7.append(i59 == null ? "\u2002" : i59);
                    sb7.append("\u200c");
                    java.lang.String str7 = (java.lang.String) hashMap2.get(str6);
                    if (str7 == null) {
                        str7 = "\u2002";
                    }
                    sb7.append(str7);
                    sb7.append("\u200c");
                    s(z3Var2);
                    java.lang.String str8 = z3Var2.f318122y1;
                    if (str8 == null) {
                        str8 = "\u2002";
                    }
                    sb7.append(str8);
                    sb7.append("\u200c");
                    if (!z3Var2.r2() || (str4 = o13.n.f(str6, z3Var2.t0())) == null) {
                        str4 = "\u2002";
                    }
                    sb7.append(str4);
                    sb7.append("\u200c");
                    if (sb7.indexOf("\u200b") >= 0) {
                        sb7 = new java.lang.StringBuilder(sb7.toString().replace("\u200b", "\u2002"));
                        i27 = 1;
                    } else {
                        i27 = i47;
                    }
                    sb7.append("\u200b");
                    sb6.append((java.lang.CharSequence) sb7);
                    i47 = i27;
                }
                i48++;
                r17 = hashMap;
                strArr2 = strArr;
                str5 = str3;
                z17 = 0;
            }
            j17 = length;
            i19 = i47;
        }
        if (sb6.length() > 0) {
            sb6.setLength(sb6.length() - 1);
            this.f219121g.u(131075, 38, j17, str, b17, sb6.toString());
            i17++;
        }
        if (i19 != 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(146L, 29L, 1L, false);
        }
        return i17;
    }

    public int k(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        int i17;
        java.lang.String str;
        byte[] bArr;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var.d1())) {
            return m(z3Var);
        }
        android.database.Cursor e17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) this.f219122h).e(java.lang.String.format("SELECT memberlist, roomdata, chatroomStatus FROM %s WHERE chatroomname = ?", "chatroom"), new java.lang.String[]{z3Var.d1()}, 2);
        try {
            if (e17.moveToNext()) {
                java.lang.String string = e17.getString(0);
                byte[] blob = e17.getBlob(1);
                i17 = e17.getInt(2);
                bArr = blob;
                str = string;
            } else {
                i17 = 0;
                str = null;
                bArr = null;
            }
            e17.close();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && bArr != null) {
                l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.a3.f275275e2;
                if (!((((long) i17) & 2) == 2)) {
                    java.lang.String[] split = o13.c.f423741a.split(str);
                    java.util.Arrays.sort(split, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s(this));
                    int t17 = t(z3Var.d1(), split);
                    if (t17 > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "updateChatroomMember %s %d", z3Var.d1(), java.lang.Integer.valueOf(t17));
                    }
                    return j(z3Var.d1(), z3Var, str, split, bArr);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "error chatroom data %s", z3Var.d1());
            int t18 = t(z3Var.d1(), null);
            if (t18 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "updateChatroomMember %s %d", z3Var.d1(), java.lang.Integer.valueOf(t18));
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            if (e17 != null) {
                e17.close();
            }
            throw th6;
        }
    }

    public int l(long j17, java.lang.String str, java.util.List list, long j18) {
        int i17;
        java.lang.String str2;
        int size = list.size();
        boolean z17 = false;
        java.lang.String i18 = o13.n.i(str, false);
        boolean z18 = true;
        java.lang.String i19 = o13.n.i(str, true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            i17 = 0;
        } else {
            long j19 = size;
            this.f219121g.u(2097172, 66, j19, java.lang.String.valueOf(j17), j18, str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i18)) {
                i17 = 1;
            } else {
                this.f219121g.u(2097172, 67, j19, java.lang.String.valueOf(j17), j18, i18);
                i17 = 2;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i19)) {
                this.f219121g.u(2097172, 68, j19, java.lang.String.valueOf(j17), j18, i19);
                i17++;
            }
        }
        if (list.isEmpty()) {
            return i17;
        }
        list.sort(new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.C15584x31a3f5());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.HashMap r17 = r((java.lang.String[]) list.toArray(new java.lang.String[0]));
        int i27 = 0;
        while (i27 < list.size()) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.lang.String str3 = (java.lang.String) list.get(i27);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) r17.get(str3);
            if (z3Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "can not get labelContact data labelUsername:%s i:%s", str3, java.lang.Integer.valueOf(i27));
                sb7.append("\u200b");
            } else {
                java.lang.String w07 = z3Var.w0();
                java.lang.String P0 = z3Var.P0();
                java.lang.String i28 = o13.n.i(w07, z17);
                java.lang.String i29 = o13.n.i(w07, z18);
                if (w07 == null) {
                    w07 = "\u2002";
                }
                sb7.append(w07);
                sb7.append("\u200c");
                if (i28 == null) {
                    i28 = "\u2002";
                }
                sb7.append(i28);
                sb7.append("\u200c");
                sb7.append(i29 == null ? "\u2002" : i29);
                sb7.append("\u200c");
                java.lang.String i37 = o13.n.i(P0, z17);
                java.lang.String i38 = o13.n.i(P0, true);
                if (P0 == null) {
                    P0 = "\u2002";
                }
                sb7.append(P0);
                sb7.append("\u200c");
                if (i37 == null) {
                    i37 = "\u2002";
                }
                sb7.append(i37);
                sb7.append("\u200c");
                sb7.append(i38 == null ? "\u2002" : i38);
                sb7.append("\u200c");
                sb7.append("\u2002");
                sb7.append("\u200c");
                s(z3Var);
                java.lang.String str4 = z3Var.f318122y1;
                if (str4 == null) {
                    str4 = "\u2002";
                }
                sb7.append(str4);
                sb7.append("\u200c");
                if (!z3Var.r2() || (str2 = o13.n.f(str3, z3Var.t0())) == null) {
                    str2 = "\u2002";
                }
                sb7.append(str2);
                sb7.append("\u200c");
                if (sb7.indexOf("\u200b") >= 0) {
                    sb7 = new java.lang.StringBuilder(sb7.toString().replace("\u200b", "\u2002"));
                }
                sb7.append("\u200b");
                sb6.append((java.lang.CharSequence) sb7);
            }
            i27++;
            z17 = false;
            z18 = true;
        }
        if (sb6.length() <= 0) {
            return i17;
        }
        sb6.setLength(sb6.length() - 1);
        this.f219121g.u(2097172, 69, size, java.lang.String.valueOf(j17), j18, sb6.toString());
        return i17 + 1;
    }

    public int m(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        long j17;
        java.lang.String str6;
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        int i29;
        int i37;
        int i38;
        android.database.Cursor cursor;
        java.util.ArrayList arrayList;
        long j18 = z3Var.E2;
        java.lang.String d17 = z3Var.d1();
        java.lang.String t07 = z3Var.t0();
        java.lang.String P0 = z3Var.P0();
        int i39 = 0;
        java.lang.String i47 = o13.n.i(P0, false);
        java.lang.String i48 = o13.n.i(P0, true);
        java.lang.String w07 = z3Var.w0();
        java.lang.String i49 = o13.n.i(w07, false);
        java.lang.String i57 = o13.n.i(w07, true);
        java.lang.String str20 = z3Var.f318122y1;
        java.lang.String D0 = z3Var.D0();
        if (D0 != null && D0.endsWith("\u0000")) {
            D0 = D0.substring(0, D0.length() - 1);
        }
        java.lang.String str21 = z3Var.E1;
        int f17 = z3Var.f1();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
        if ((f17 & 8) != 0) {
            int i58 = z3Var.m2() ? 2097171 : z3Var.l2() ? 2097173 : 131076;
            ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).getClass();
            try {
                arrayList = r01.q3.cj().b1(d17).D0(false).b().f445620a;
            } catch (java.lang.Exception unused) {
                arrayList = new java.util.ArrayList();
            }
            i17 = i58;
            str = "\u200b";
            str2 = str21;
            str3 = str20;
            str4 = w07;
            str5 = P0;
            j17 = currentTimeMillis;
            i18 = 0;
            str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, "\u200b");
        } else {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(d17)) {
                str = "\u200b";
                str2 = str21;
                str3 = str20;
                str4 = w07;
                str5 = P0;
                i27 = 131081;
            } else {
                currentTimeMillis = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) this.f219122h).b(d17);
                java.util.regex.Pattern pattern = o13.c.f423747g;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                u(d17, pattern.split(D0 == null ? "" : D0));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D0)) {
                    str = "\u200b";
                    str2 = str21;
                    str3 = str20;
                    str4 = w07;
                    str5 = P0;
                    j17 = currentTimeMillis;
                    str6 = "";
                    i17 = 131072;
                    i18 = 0;
                } else {
                    java.util.List d18 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) this.f219122h).d(D0);
                    if (((java.util.ArrayList) d18).isEmpty()) {
                        str = "\u200b";
                        str2 = str21;
                        str3 = str20;
                        str4 = w07;
                        str5 = P0;
                        i19 = 0;
                    } else {
                        str = "\u200b";
                        str2 = str21;
                        str3 = str20;
                        str4 = w07;
                        str5 = P0;
                        i19 = 0;
                        this.f219121g.u(131072, 11, j18, d17, currentTimeMillis, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(d18, "\u200b"));
                        i39 = 1;
                    }
                    i39 += i19;
                    i27 = 131072;
                }
            }
            i17 = i27;
            j17 = currentTimeMillis;
            i18 = i39;
            str6 = "";
        }
        java.lang.String f18 = o13.n.f(d17, t07);
        if (f18 == null || f18.length() == 0) {
            i28 = i17;
            str7 = str6;
        } else {
            i28 = i17;
            str7 = str6;
            this.f219121g.u(i17, 15, j18, d17, j17, f18);
            i18++;
        }
        if (str4 == null || str4.length() == 0) {
            str8 = i47;
            str9 = i48;
            str10 = str5;
            str11 = null;
            str12 = null;
            str13 = null;
        } else {
            str13 = i47;
            str11 = i48;
            str8 = i49;
            str9 = i57;
            str10 = str4;
            str12 = str5;
        }
        if (str10 == null || str10.length() == 0) {
            str14 = str11;
            str15 = str12;
            str16 = str13;
        } else {
            java.lang.String str22 = str10.equalsIgnoreCase(str8) ? null : str8;
            java.lang.String str23 = (str22 == null || str22.length() == 0 || str22.equalsIgnoreCase(str9)) ? null : str9;
            java.lang.String str24 = str22;
            str14 = str11;
            str15 = str12;
            str16 = str13;
            this.f219121g.u(i28, 1, j18, d17, j17, str10);
            if (str24 != null && str24.length() != 0) {
                this.f219121g.u(i28, 2, j18, d17, j17, str24);
            }
            if (str23 != null && str23.length() != 0) {
                this.f219121g.u(i28, 3, j18, d17, j17, str23);
            }
            i18 += 3;
        }
        if (str15 != null && str15.length() != 0) {
            java.lang.String str25 = str16;
            java.lang.String str26 = str15.equalsIgnoreCase(str25) ? null : str25;
            if (str26 == null || str26.length() == 0 || str26.equalsIgnoreCase(str14)) {
                str14 = null;
            }
            java.lang.String str27 = str26;
            this.f219121g.u(i28, 5, j18, d17, j17, str15);
            if (str27 != null && str27.length() != 0) {
                this.f219121g.u(i28, 6, j18, d17, j17, str27);
            }
            if (str14 != null && str14.length() != 0) {
                this.f219121g.u(i28, 7, j18, d17, j17, str14);
            }
            i18 += 3;
        }
        if (str3 != null && str3.length() > 0) {
            this.f219121g.u(i28, 4, j18, d17, j17, str3);
            i18++;
        }
        int i59 = i28;
        if (i59 == 131072) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                str17 = str;
                android.database.Cursor e17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) this.f219122h).e("SELECT moblie FROM addr_upload2 WHERE username=?;", new java.lang.String[]{d17}, 2);
                if (e17.moveToFirst()) {
                    cursor = e17;
                    this.f219121g.u(i59, 16, j18, d17, j17, e17.getString(0));
                    i18++;
                } else {
                    cursor = e17;
                }
                cursor.close();
            } else {
                str17 = str;
                this.f219121g.u(i59, 16, j18, d17, j17, str2.replace(z3Var.K1 == 0 ? "," : "，", str17));
                i18++;
            }
            java.lang.String str28 = z3Var.W;
            java.lang.String str29 = ((java.util.HashSet) f219118z).contains(str28) ? "" : str28;
            if (str29 != null && str29.length() != 0) {
                this.f219121g.u(i59, 18, j18, d17, j17, str29);
                i18++;
            }
            java.lang.String str30 = z3Var.X;
            if (str30 != null && str30.length() != 0) {
                this.f219121g.u(i59, 17, j18, d17, j17, str30);
                i18++;
            }
        } else {
            str17 = str;
        }
        if ((i59 == 131076 || i59 == 2097171 || i59 == 2097173) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
            java.lang.String str31 = str7;
            this.f219121g.u(i59, 19, j18, d17, j17, str31);
            i18++;
            java.lang.String i66 = o13.n.i(str31, false);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i66)) {
                str18 = str17;
                str19 = str31;
            } else {
                str18 = str17;
                str19 = str31;
                this.f219121g.u(i59, 20, j18, d17, j17, i66);
                i18++;
            }
            java.lang.String i67 = o13.n.i(str19, true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i67)) {
                i29 = 1;
            } else {
                i29 = 1;
                this.f219121g.u(i59, 21, j18, d17, j17, i67);
                i18++;
            }
        } else {
            str18 = str17;
            i29 = 1;
        }
        if (i59 != 131081) {
            return i18;
        }
        java.lang.String str32 = z3Var.J1;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str32)) {
            i37 = 0;
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            try {
                org.json.JSONArray optJSONArray = new org.json.JSONObject(str32).optJSONArray("custom_info");
                if (optJSONArray != null) {
                    for (int i68 = 0; i68 < optJSONArray.length(); i68++) {
                        org.json.JSONObject jSONObject = optJSONArray.getJSONObject(i68);
                        j41.d0 d0Var = new j41.d0();
                        d0Var.a(jSONObject);
                        linkedList.add(d0Var);
                    }
                }
                i37 = 0;
            } catch (org.json.JSONException e18) {
                i37 = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenIMCustomDetail", e18, "parse", new java.lang.Object[0]);
            }
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (int i69 = i37; i69 < linkedList.size(); i69++) {
                java.util.Iterator it = ((j41.d0) linkedList.get(i69)).f379151b.iterator();
                while (it.hasNext()) {
                    java.lang.String a17 = ((j41.e0) it.next()).a(z3Var.Q0());
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                        stringBuffer.append(a17);
                        stringBuffer.append("\u200c");
                    }
                }
                stringBuffer.append(str18);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringBuffer.toString())) {
                this.f219121g.u(131081, 51, z3Var.E2, z3Var.d1(), j17, stringBuffer.toString());
                i38 = i29;
                return i18 + i38;
            }
        }
        i38 = i37;
        return i18 + i38;
    }

    public boolean o(java.lang.String str) {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.endsWith("@stranger") || str.endsWith("@qqim") || str.endsWith("@app") || com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str) || str.contains(",") || str.endsWith("@gamelifesess") || str.endsWith("@gamelife") || str.endsWith("@gamelifehistory")) ? false : true;
    }

    public boolean p(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.lang.String d17 = z3Var.d1();
        if (!q(z3Var) || !o(d17) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(d17) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.U3(d17)) {
            return false;
        }
        if (z3Var.r2()) {
            return true;
        }
        if (z3Var.q2() || z3Var.k2()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p) this.f219122h;
        pVar.getClass();
        android.database.Cursor e17 = pVar.e(java.lang.String.format("SELECT 1 FROM rconversation WHERE username = ?", new java.lang.Object[0]), new java.lang.String[]{d17}, 2);
        try {
            boolean moveToNext = e17.moveToNext();
            e17.close();
            return moveToNext;
        } catch (java.lang.Throwable th6) {
            if (e17 != null) {
                e17.close();
            }
            throw th6;
        }
    }

    public boolean q(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        if ((z3Var.u2() && !"notifymessage".equals(z3Var.d1())) || z3Var.o2() || z3Var.F0() != 0) {
            return false;
        }
        if (z3Var.r2()) {
            return true;
        }
        return (z3Var.q2() || z3Var.k2()) ? false : true;
    }

    public final java.util.HashMap r(java.lang.String[] strArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT rowid, username, alias, conRemark, nickname , lvbuff, type FROM rcontact WHERE username IN ");
        java.util.HashMap hashMap2 = o13.n.f423774a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(256);
        sb7.append('(');
        for (java.lang.String str : strArr) {
            sb7.append(android.database.DatabaseUtils.sqlEscapeString(str) + ',');
        }
        sb7.setCharAt(sb7.length() - 1, ')');
        sb6.append(sb7.toString());
        sb6.append(";");
        android.database.Cursor e17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) this.f219122h).e(sb6.toString(), null, 2);
        while (e17.moveToNext()) {
            try {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.mo9015xbf5d97fd(e17);
                hashMap.put(z3Var.d1(), z3Var);
            } catch (java.lang.Throwable th6) {
                if (e17 != null) {
                    e17.close();
                }
                throw th6;
            }
        }
        e17.close();
        return hashMap;
    }

    public void s(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        try {
            this.f219128q.invoke(z3Var, new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTS5SearchContactLogic", e17, "Failed parsing RContact LVBuffer.", new java.lang.Object[0]);
        }
    }

    public int t(java.lang.String str, java.lang.String[] strArr) {
        int i17;
        java.lang.String[] strArr2 = (java.lang.String[]) this.f219125n.get(str);
        this.f219121g.h();
        if (strArr2 == null) {
            w13.b bVar = this.f219121g;
            bVar.f523738t.m107801x35198eae(1, str);
            bVar.f523738t.m107867xb158f775();
            i17 = ((int) this.f219121g.f523742x.m107873x58f653cf()) + 0;
            if (strArr != null) {
                this.f219121g.N(str, strArr);
                this.f219125n.put(str, strArr);
                i17 += strArr.length;
            }
        } else if (strArr == null) {
            w13.b bVar2 = this.f219121g;
            bVar2.f523738t.m107801x35198eae(1, str);
            bVar2.f523738t.m107867xb158f775();
            i17 = ((int) this.f219121g.f523742x.m107873x58f653cf()) + 0;
            this.f219125n.remove(str);
        } else {
            java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(strArr2));
            int i18 = 0;
            for (java.lang.String str2 : strArr) {
                if (!hashSet.remove(str2)) {
                    w13.b bVar3 = this.f219121g;
                    bVar3.f523736r.m107801x35198eae(1, str);
                    bVar3.f523736r.m107801x35198eae(2, str2);
                    bVar3.f523736r.m107867xb158f775();
                    i18++;
                }
            }
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                w13.b bVar4 = this.f219121g;
                bVar4.f523737s.m107801x35198eae(1, str);
                bVar4.f523737s.m107801x35198eae(2, str3);
                bVar4.f523737s.m107867xb158f775();
                i18++;
            }
            this.f219125n.put(str, strArr);
            i17 = i18;
        }
        this.f219121g.j();
        return i17;
    }

    public final java.util.List u(java.lang.String str, java.lang.String[] strArr) {
        java.util.ArrayList arrayList;
        if (strArr.length != 0) {
            arrayList = new java.util.ArrayList(strArr.length);
            for (java.lang.String str2 : strArr) {
                arrayList.add(java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str2, 0L)));
            }
        } else {
            arrayList = null;
        }
        java.util.List list = (java.util.List) this.f219126o.get(str);
        if (list == null) {
            w13.b bVar = this.f219121g;
            bVar.f523741w.m107801x35198eae(1, str);
            bVar.f523741w.m107867xb158f775();
            if (arrayList != null && !arrayList.isEmpty()) {
                w13.b bVar2 = this.f219121g;
                bVar2.getClass();
                if (!arrayList.isEmpty()) {
                    boolean m17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) bVar2.f423731f).m();
                    if (!m17) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) bVar2.f423731f).a();
                    }
                    bVar2.f523739u.m107801x35198eae(1, str);
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        bVar2.f523739u.m107799x37fbf859(2, ((java.lang.Long) it.next()).longValue());
                        bVar2.f523739u.m107867xb158f775();
                    }
                    if (!m17) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) bVar2.f423731f).d();
                    }
                }
                this.f219126o.put(str, arrayList);
            }
            return arrayList;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            w13.b bVar3 = this.f219121g;
            bVar3.f523741w.m107801x35198eae(1, str);
            bVar3.f523741w.m107867xb158f775();
            this.f219126o.remove(str);
            return list;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet(list);
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            long longValue = ((java.lang.Long) it6.next()).longValue();
            if (!hashSet.remove(java.lang.Long.valueOf(longValue))) {
                w13.b bVar4 = this.f219121g;
                bVar4.f523739u.m107801x35198eae(1, str);
                bVar4.f523739u.m107799x37fbf859(2, longValue);
                bVar4.f523739u.m107867xb158f775();
                arrayList2.add(java.lang.Long.valueOf(longValue));
            }
        }
        java.util.Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            long longValue2 = ((java.lang.Long) it7.next()).longValue();
            w13.b bVar5 = this.f219121g;
            bVar5.f523740v.m107801x35198eae(1, str);
            bVar5.f523740v.m107799x37fbf859(2, longValue2);
            bVar5.f523740v.m107867xb158f775();
        }
        arrayList2.addAll(hashSet);
        this.f219126o.put(str, arrayList);
        return arrayList2;
    }
}
