package ph1;

/* loaded from: classes7.dex */
public final class g0 implements ph1.h, ph1.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f435860d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final ik1.x f435861e = new ik1.x();

    /* renamed from: f, reason: collision with root package name */
    public final ze.n f435862f;

    public g0(ze.n nVar) {
        this.f435862f = nVar;
    }

    public static void h(ph1.g0 g0Var, java.lang.String str, ph1.g gVar) {
        synchronized (g0Var.f435860d) {
            ((java.util.HashSet) g0Var.f435860d).remove(str);
        }
        java.util.Set g17 = g0Var.f435861e.g(str);
        if (g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "markLoadingFinished %s, result %s, get null callbackSet, maybe canceled by user before", str, gVar.name());
            return;
        }
        java.util.Iterator it = g17.iterator();
        while (it.hasNext()) {
            ph1.d dVar = ((ph1.f0) it.next()).f435853a;
            if (dVar != null) {
                dVar.a(gVar);
            }
        }
    }

    @Override // ph1.h
    public void a(java.lang.String str, ph1.d dVar, ph1.c cVar, boolean z17) {
        m(str, dVar, cVar, z17, null);
    }

    @Override // ph1.h
    public ph1.b b() {
        return new ph1.a0(this);
    }

    @Override // ph1.h
    public boolean c(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3 = this.f435862f.f156336n;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str);
        java.lang.String str4 = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str3);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                str2 = "";
            } else {
                str2 = "$" + a17;
            }
            sb6.append(str2);
            str4 = sb6.toString();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.da.f157025a.b(str4, 0, new java.lang.String[0]);
        return (b17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f67183x55b471cc) || !com.p314xaae8f345.mm.vfs.w6.j(b17.f67183x55b471cc)) ? false : true;
    }

    @Override // ph1.h
    public java.lang.String d(java.lang.String str) {
        return k(str).f33454x337a8b;
    }

    @Override // ph1.h
    public boolean e() {
        return true;
    }

    @Override // ph1.h
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e f(java.lang.String pathOrModuleName) {
        if (android.text.TextUtils.isEmpty(pathOrModuleName)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = this.f435862f.E0().f387385r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathOrModuleName, "pathOrModuleName");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ph1.i0.b(kz5.b0.c(c11667xc7e59dd6), pathOrModuleName, "findModuleInfoByModuleName", false, 4, null), c11667xc7e59dd6)) {
            return c11667xc7e59dd6;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8.equals(pathOrModuleName)) {
            pathOrModuleName = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(pathOrModuleName, false);
        }
        java.lang.String pathOrModule = pathOrModuleName;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.o(this.f435862f, false).j();
        java.util.LinkedList linkedList = c11667xc7e59dd6.f156935g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkedList, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathOrModule, "pathOrModule");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) ph1.i0.b(linkedList, pathOrModule, "findModuleInfoByModuleName", false, 4, null);
    }

    @Override // ph1.h
    public void g(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, ph1.d dVar) {
        ph1.e0 e0Var = new ph1.e0(null);
        e0Var.f435849a = true;
        e0Var.f435850b = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.AUTO_RE_LAUNCH == wdVar && this.f435862f.u0().r() != k91.z3.TRANSPARENT;
        e0Var.f435851c = true;
        e0Var.f435852d = ph1.o.f435878a;
        if (this.f435862f.L0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModule with path(%s), but runtime(%s) finished", str, this.f435862f.f156336n);
            if (dVar != null) {
                dVar.a(ph1.g.FAIL);
                return;
            }
            return;
        }
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? this.f435862f.E0().f387385r : k(str);
        b0Var.f373357a = k17;
        if (j(k17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModule appId:%s path:%s, module:%s, options:%b, [loaded]", this.f435862f.f156336n, str, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) b0Var.f373357a).f33454x337a8b, e0Var);
            if (dVar != null) {
                if (e0Var.f435851c) {
                    l(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) b0Var.f373357a).f33454x337a8b, "options.injectModuleJS");
                }
                dVar.a(ph1.g.OK);
                return;
            }
        }
        ik1.b0 b0Var2 = new ik1.b0();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        if (e0Var.f435849a) {
            this.f435862f.m(new ph1.v(this, c19762x487075a, b0Var, e0Var, b0Var2));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModule, appId:%s path:%s, module:%s, options:%b [do loadOrAddPendingCallback]", this.f435862f.f156336n, str, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) b0Var.f373357a).f33454x337a8b, e0Var);
        n((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) b0Var.f373357a, new ph1.x(this, dVar, c19762x487075a, e0Var, b0Var, b0Var2), true, new ph1.y(this, b0Var, null, b0Var2), e0Var.f435852d, null);
    }

    public final void i(java.lang.String str, ph1.d dVar, ph1.c cVar) {
        boolean contains;
        if (dVar == null && cVar == null) {
            return;
        }
        synchronized (this.f435860d) {
            contains = ((java.util.HashSet) this.f435860d).contains(str);
        }
        if (!contains) {
            if (j(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? this.f435862f.E0().f387385r : k(str))) {
                if (dVar != null) {
                    dVar.a(ph1.g.OK);
                    return;
                }
                return;
            }
        }
        this.f435861e.e(str, new ph1.f0(dVar, cVar));
    }

    public final boolean j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e) {
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11656xaf63146e.f33455xe121c411) && com.p314xaae8f345.mm.vfs.w6.j(c11656xaf63146e.f33455xe121c411);
        if (z17) {
            if (!c11656xaf63146e.f33453xc73e777a) {
                l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8, "checkModuleLoaded");
            }
            l(c11656xaf63146e.f33454x337a8b, "checkModuleLoaded");
        }
        return z17;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e k(java.lang.String pathOrModule) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = this.f435862f.E0().f387385r;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pathOrModule) && !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8.equals(pathOrModule)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.o(this.f435862f, false).j();
            java.util.LinkedList linkedList = c11667xc7e59dd6.f156935g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkedList, "<this>");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathOrModule, "pathOrModule");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) ph1.i0.b(linkedList, pathOrModule, "findModuleInfoByResourcePath", false, 4, null);
            if (c11656xaf63146e != null) {
                return c11656xaf63146e;
            }
        }
        return c11667xc7e59dd6;
    }

    public final void l(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y C0 = this.f435862f.C0();
        if (C0 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "injectServiceScriptSafe appId:%s, module:%s, reason:%s ret:%b", this.f435862f.f156336n, str, str2, java.lang.Boolean.valueOf(C0.y(str)));
    }

    public final void m(java.lang.String str, ph1.d dVar, ph1.c cVar, boolean z17, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e f17 = f(str);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModuleByName, appId:%s, name:%s, injectModuleJS:%b, [not found]", this.f435862f.f156336n, str, java.lang.Boolean.valueOf(z17));
            if (dVar != null) {
                dVar.a(ph1.g.MODULE_NOT_FOUND);
                return;
            }
            return;
        }
        if (!j(f17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModuleByName, appId:%s, name:%s, injectModuleJS:%b, [do loadOrAddPendingCallback]", this.f435862f.f156336n, str, java.lang.Boolean.valueOf(z17));
            n(f17, new ph1.z(this, z17, f17, dVar), true, cVar, ph1.o.f435880c, str2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModuleByName, appId:%s, name:%s, injectModuleJS:%b, [loaded]", this.f435862f.f156336n, str, java.lang.Boolean.valueOf(z17));
        if (z17) {
            l(f17.f33454x337a8b, "options.injectModuleJS");
        }
        if (dVar != null) {
            dVar.a(ph1.g.OK);
        }
    }

    public final void n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e, ph1.d dVar, boolean z17, ph1.c cVar, java.util.concurrent.Executor executor, java.lang.String str) {
        boolean contains;
        java.lang.String str2 = c11656xaf63146e.f33454x337a8b;
        boolean z18 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8.equals(str2) || c11656xaf63146e.f33453xc73e777a || j(this.f435862f.E0().f387385r)) ? false : true;
        if (z17 && dVar != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(str2);
            if (z18) {
                linkedList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8);
            }
            dVar.b(linkedList);
        }
        if (z18) {
            n(this.f435862f.E0().f387385r, null, false, null, executor, str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModule, name %s, independent %b, should ensure __APP__ %b", c11656xaf63146e.f33454x337a8b, java.lang.Boolean.valueOf(c11656xaf63146e.f33453xc73e777a), java.lang.Boolean.valueOf(z18));
        i(str2, dVar, cVar);
        synchronized (this.f435860d) {
            contains = ((java.util.HashSet) this.f435860d).contains(str2);
            if (!contains) {
                ((java.util.HashSet) this.f435860d).add(str2);
            }
        }
        if (contains) {
            return;
        }
        ph1.i iVar = new ph1.i(2);
        if (z18) {
            i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8, new ph1.b0(this, iVar), null);
        } else {
            iVar.a(null);
        }
        ph1.r b17 = ph1.q.f435881a.b(this.f435862f, this.f435862f.E0().f387385r.e(this.f435862f.f156336n, str2), str);
        b17.b(new ph1.d0(this, str2, iVar));
        b17.a(executor);
    }
}
