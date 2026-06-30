package lc3;

/* loaded from: classes7.dex */
public abstract class o extends lc3.f0 {

    /* renamed from: e, reason: collision with root package name */
    public lc3.f f399446e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f399447f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f399448g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f399449h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String instanceName) {
        super(instanceName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        this.f399447f = jz5.h.b(new lc3.m(this));
        this.f399448g = jz5.h.b(new lc3.k(this));
        this.f399449h = jz5.h.b(new lc3.j(this));
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 h(lc3.o oVar, lc3.n0 n0Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var;
        jc3.k0 tVar;
        java.util.Collection w17 = oVar.w();
        iz5.a.g("No biz permits current pkg manager to manage file!", !w17.isEmpty());
        java.lang.String p17 = oVar.p();
        if (n0Var instanceof lc3.m0) {
            str = ((lc3.m0) n0Var).f399443a;
            u1Var = null;
        } else if (n0Var instanceof lc3.l0) {
            u1Var = ((lc3.l0) n0Var).f399441a;
            str = null;
        } else {
            str = null;
            u1Var = null;
        }
        int size = w17.size();
        java.lang.String instanceName = oVar.f399427d;
        if (size <= 1) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
            return com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229512a.a(instanceName, str, p17, u1Var, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4 d4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class);
        java.util.Collection collection = w17;
        java.util.List S0 = kz5.n0.S0(collection);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) d4Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229512a;
        java.lang.String lowerCase = instanceName.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229514c;
        if (hashMap.containsKey(lowerCase)) {
            tVar = (jc3.k0) hashMap.get(lowerCase);
            if (tVar == null) {
                synchronized (kVar) {
                    hashMap.remove(lowerCase);
                }
                tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.t(lowerCase, str, u1Var, S0);
                synchronized (kVar) {
                    hashMap.put(lowerCase, tVar);
                }
            } else {
                jc3.k0.Ag(tVar, lowerCase, str, null, u1Var, null, 16, null);
            }
        } else {
            tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.t(lowerCase, str, u1Var, S0);
            synchronized (kVar) {
                hashMap.put(lowerCase, tVar);
            }
        }
        jc3.k0 k0Var = tVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4 d4Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class);
        java.lang.String l17 = oVar.l();
        java.util.List<java.lang.String> S02 = kz5.n0.S0(collection);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) d4Var2).getClass();
        synchronized (ue3.c.f508425a) {
            java.util.HashMap hashMap2 = ue3.c.f508426b;
            java.lang.Object obj = hashMap2.get(l17);
            if (obj == null) {
                obj = new java.util.ArrayList();
                hashMap2.put(l17, obj);
            }
            java.util.List list = (java.util.List) obj;
            for (java.lang.String str2 : S02) {
                if (!list.contains(str2)) {
                    list.add(str2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushStorageFactory", "Added biz '" + str2 + "' to storage permission list of public service '" + l17 + '\'');
                }
            }
        }
        return k0Var;
    }

    @Override // jc3.x
    public java.lang.String a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return bf3.r0.e((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) ((jz5.n) this.f399448g).mo141623x754a37bb(), path);
    }

    @Override // jc3.x
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 b() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) ((jz5.n) this.f399448g).mo141623x754a37bb();
    }

    @Override // jc3.x
    public final java.lang.String d() {
        java.lang.String d17 = t().d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        return d17;
    }

    @Override // jc3.x
    public final java.lang.String e() {
        java.lang.String Di;
        ie3.i iVar = (ie3.i) i95.n0.c(ie3.i.class);
        int a17 = t().a();
        he3.e eVar = (he3.e) iVar;
        eVar.getClass();
        java.lang.String instanceName = this.f399427d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.MagicPkgConfigFeature", "getPkgAppConfigWithInstanceName, instanceName:" + instanceName + ", version:" + a17);
        java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
        if (eVar.Bi(s07) == a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.MagicPkgConfigFeature", "use asset appConfig, ".concat(instanceName));
            ge3.a Ai = eVar.Ai(s07);
            if (Ai == null || (Di = Ai.b()) == null) {
                Di = "";
            }
        } else if (eVar.cj(s07)) {
            if (eVar.aj(s07) == a17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.MagicPkgConfigFeature", "use udr appConfig, ".concat(instanceName));
                Di = eVar.Zi(s07);
            }
            Di = null;
        } else {
            if (eVar.Ni(s07) == a17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.MagicPkgConfigFeature", "use boot appConfig, ".concat(instanceName));
                Di = eVar.Di(s07);
            }
            Di = null;
        }
        return Di == null ? (java.lang.String) ((jz5.n) this.f399449h).mo141623x754a37bb() : Di;
    }

    @Override // jc3.x
    public final void f(yz5.l cb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        ku5.u0 u0Var = ku5.t0.f394148d;
        ((ku5.t0) u0Var).h(new lc3.n(cb6, this), "MagicBrushFs_" + this.f399427d);
    }

    public boolean i() {
        return !(this instanceof fe3.b);
    }

    public boolean j() {
        java.lang.Boolean a17 = jc3.w0.f380543a.a(v());
        if (a17 != null) {
            return a17.booleanValue();
        }
        return false;
    }

    public abstract lc3.a k();

    public final java.lang.String l() {
        java.lang.String instanceName = this.f399427d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        return r26.n0.s0(instanceName, "-", instanceName);
    }

    public java.lang.String m() {
        return l();
    }

    public abstract lc3.c n();

    public yz5.a o() {
        return lc3.l.f399440d;
    }

    public java.lang.String p() {
        return null;
    }

    public final java.lang.String q(lc3.c cVar) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class))).Di() + cVar.f399421a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        if (r0 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lc3.f r() {
        /*
            r5 = this;
            boolean r0 = r5.x()
            r1 = 0
            java.lang.String r2 = r5.f399427d
            java.lang.String r3 = "hy: boots file system with instance name "
            java.lang.String r4 = "MircoMsg.MBBootsPkgManagementBase"
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r2 = " use debug!"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
            com.tencent.mm.plugin.appbrand.appcache.y8 r0 = new com.tencent.mm.plugin.appbrand.appcache.y8
            lc3.c r2 = r5.n()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)
            java.lang.String r2 = r5.q(r2)
            r0.<init>(r2)
            r0.a()
            goto La8
        L36:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r2 = " use assets!"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
            lc3.a r0 = r5.k()
            if (r0 == 0) goto L8b
            java.lang.String r2 = r5.m()
            java.lang.String r3 = "bizName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r3)
            boolean r3 = bf3.r0.b(r0, r2)
            if (r3 == 0) goto L88
            com.tencent.mm.plugin.appbrand.appcache.y8 r3 = new com.tencent.mm.plugin.appbrand.appcache.y8
            java.lang.String r0 = bf3.r0.d(r0, r2)
            r3.<init>(r0)
            boolean r0 = r3.a()
            if (r0 != 0) goto L86
            java.lang.String r0 = "MicroMsg.MagicBaseUtil"
            java.lang.String r3 = "hy: fatal error! read info failed, treat as not providing fs"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3)
            java.lang.String r0 = "MagicBrushLocalPkgFileProtector"
            com.tencent.mm.sdk.platformtools.o4 r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(r0)
            java.lang.String r3 = "forceRegen_"
            java.lang.String r2 = r3.concat(r2)
            r3 = 1
            r0.putBoolean(r2, r3)
            goto L88
        L86:
            r0 = r3
            goto L89
        L88:
            r0 = r1
        L89:
            if (r0 != 0) goto La8
        L8b:
            java.lang.String r0 = "hy: fail to copy embed pkg to local file system. use fallback assets"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r0)
            lc3.a r0 = r5.k()
            if (r0 == 0) goto La7
            com.tencent.mm.plugin.appbrand.appcache.r r2 = new com.tencent.mm.plugin.appbrand.appcache.r
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r0 = r0.f399411a
            r2.<init>(r3, r0)
            boolean r0 = r2.a()
            if (r0 == 0) goto La7
            r0 = r2
            goto La8
        La7:
            r0 = r1
        La8:
            if (r0 == 0) goto Laf
            lc3.g r1 = new lc3.g
            r1.<init>(r5, r0)
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lc3.o.r():lc3.f");
    }

    @Override // jc3.x
    /* renamed from: release */
    public void mo66315x41012807() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class))).wi(this.f399427d);
    }

    public abstract java.lang.String s();

    public final lc3.f t() {
        return (lc3.f) ((jz5.n) this.f399447f).mo141623x754a37bb();
    }

    public java.lang.String u() {
        return "debug";
    }

    public java.lang.String v() {
        return "debug";
    }

    public abstract java.util.Collection w();

    public final boolean x() {
        lc3.c n17 = n();
        if (n17 == null) {
            return false;
        }
        lc3.b bVar = lc3.b.f399416e;
        lc3.b bVar2 = n17.f399422b;
        if (bVar2 != bVar) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!z65.c.a()) {
                return false;
            }
        }
        return bVar2 != lc3.b.f399417f && com.p314xaae8f345.mm.vfs.w6.j(q(n17));
    }
}
