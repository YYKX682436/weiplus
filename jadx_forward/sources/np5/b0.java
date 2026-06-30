package np5;

/* loaded from: classes9.dex */
public class b0 implements com.p314xaae8f345.mm.p944x882e457a.u0, np5.e {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f420351d;

    /* renamed from: e, reason: collision with root package name */
    public np5.f f420352e;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f420358n;

    /* renamed from: o, reason: collision with root package name */
    public android.os.Bundle f420359o;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f420353f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f420354g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f420355h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public android.app.Dialog f420356i = null;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f420357m = new java.util.HashSet();

    /* renamed from: p, reason: collision with root package name */
    public final np5.a f420360p = new np5.a(this);

    /* renamed from: q, reason: collision with root package name */
    public final np5.b f420361q = new np5.b(this);

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f420362r = new java.util.HashMap();

    public b0(android.content.Context context, np5.f fVar) {
        this.f420352e = null;
        this.f420351d = context;
        this.f420352e = fVar;
    }

    @Override // np5.e
    public void a(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        android.app.Dialog dialog;
        h(m1Var);
        this.f420353f.add(m1Var);
        if (z17 && ((dialog = this.f420356i) == null || (dialog != null && !dialog.isShowing()))) {
            android.app.Dialog dialog2 = this.f420356i;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            android.content.Context context = this.f420351d;
            if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletNetSceneMgr", "%s activity has destroyed!!!", this);
                return;
            }
            this.f420356i = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(context, false, new np5.u(this));
        }
        if (x51.o1.S && (m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o)) {
            com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o oVar = (com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o) m1Var;
            if (oVar.mo1064xb5887636().contains("authen") || oVar.mo1064xb5887636().contains("verify")) {
                oVar.m83041x764a06d7();
            }
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.g(m1Var);
    }

    @Override // np5.e
    public void b() {
        android.app.Dialog dialog = this.f420356i;
        if (dialog != null) {
            dialog.dismiss();
            this.f420356i = null;
        }
    }

    public void c(int i17) {
        ((java.util.HashSet) this.f420357m).add(java.lang.Integer.valueOf(i17));
        gm0.j1.i();
        gm0.j1.n().f354821b.a(i17, this);
    }

    public void d(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        e(m1Var, z17, 1, 0);
    }

    public void e(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17, int i17, int i18) {
        android.app.Dialog dialog;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = this;
        objArr[1] = java.lang.Boolean.valueOf(z17);
        objArr[2] = m1Var;
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0());
        boolean z18 = m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t;
        objArr[5] = java.lang.Boolean.valueOf(z18);
        android.app.Dialog dialog2 = this.f420356i;
        objArr[6] = java.lang.Boolean.valueOf(dialog2 == null || !(dialog2 == null || dialog2.isShowing()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "this %s isShowProgress %s scene: %s dialogType %s type %s IWxSafePay %s tipDialog showing? %s", objArr);
        h(m1Var);
        if (z17) {
            this.f420354g.add(m1Var);
        } else {
            this.f420355h.add(m1Var);
        }
        if (z17 && ((dialog = this.f420356i) == null || (dialog != null && !dialog.isShowing()))) {
            android.app.Dialog dialog3 = this.f420356i;
            if (dialog3 != null) {
                dialog3.dismiss();
            }
            android.content.Context context = this.f420351d;
            if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletNetSceneMgr", "activity has destroyed!!!");
                return;
            }
            if (i17 == 1) {
                if (z18) {
                    this.f420356i = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(context, false, new np5.v(this));
                } else {
                    this.f420356i = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj), this.f420351d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvq), false, false, new np5.w(this));
                }
            } else if (i17 == 2) {
                this.f420356i = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj), this.f420351d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvq), false, false, new np5.x(this));
            } else if (i17 == 3) {
                this.f420356i = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.f(context, "验证中", false, 0, new np5.y(this));
            } else if (i17 == 4) {
                this.f420356i = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(context, false, new np5.z(this));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "unknown dialog type: %d", java.lang.Integer.valueOf(i17));
                android.content.Context context2 = this.f420351d;
                this.f420356i = db5.e1.Q(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj), this.f420351d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvq), false, false, new np5.a0(this));
            }
        }
        if (x51.o1.S && (m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o)) {
            com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o oVar = (com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o) m1Var;
            if (oVar.mo1064xb5887636().contains("authen") || oVar.mo1064xb5887636().contains("verify")) {
                oVar.m83041x764a06d7();
            }
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.h(m1Var, i18);
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[0] = this;
        objArr2[1] = m1Var;
        objArr2[2] = m1Var.mo47948x7f0c4558() == null ? "" : m1Var.mo47948x7f0c4558().mo13823xb5887636();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "this %s scene url %s %s", objArr2);
    }

    public void f() {
        android.app.Dialog dialog = this.f420356i;
        if (dialog != null) {
            dialog.dismiss();
            this.f420356i = null;
        }
        java.util.HashSet hashSet = this.f420353f;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) it.next();
            gm0.j1.i();
            gm0.j1.n().f354821b.d(m1Var);
        }
        java.util.HashSet hashSet2 = this.f420354g;
        java.util.Iterator it6 = hashSet2.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = (com.p314xaae8f345.mm.p944x882e457a.m1) it6.next();
            gm0.j1.i();
            gm0.j1.n().f354821b.d(m1Var2);
        }
        hashSet.clear();
        hashSet2.clear();
    }

    public boolean g() {
        return (this.f420354g.isEmpty() && this.f420353f.isEmpty()) ? false : true;
    }

    public final void h(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var == null || !(m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1)) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 d1Var = (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1) m1Var;
        d1Var.m82989x7c4af7d8(this.f420358n);
        android.os.Bundle bundle = this.f420359o;
        if (bundle != null) {
            d1Var.m82988x820c8e8f(bundle);
            return;
        }
        android.content.Context context = this.f420351d;
        if (context instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) {
            d1Var.m82988x820c8e8f(((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) context).m83105x7498fe14());
        }
    }

    public void i(int i17) {
        gm0.j1.i();
        gm0.j1.n().f354821b.q(i17, this);
        java.util.Set set = this.f420357m;
        ((java.util.HashSet) set).remove(java.lang.Integer.valueOf(i17));
        if (((java.util.HashSet) set).isEmpty()) {
            f();
            this.f420352e = null;
            this.f420351d = null;
            np5.a aVar = this.f420360p;
            aVar.f420345g = null;
            gm0.j1.i();
            gm0.j1.n().f354821b.q(385, aVar);
            np5.b bVar = this.f420361q;
            bVar.f420350f = null;
            gm0.j1.i();
            gm0.j1.n().f354821b.q(385, bVar);
            java.util.HashMap hashMap = this.f420362r;
            for (np5.c cVar : hashMap.values()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IDelayQueryOrder", "onDestory rtType %s", java.lang.Integer.valueOf(cVar.f420364e));
                gm0.j1.i();
                gm0.j1.n().f354821b.q(cVar.f420364e, cVar);
            }
            hashMap.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean j(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "onSceneEnd scene is %s %s", this, m1Var.toString());
        boolean z17 = x51.o1.S;
        np5.a aVar = this.f420360p;
        if (z17 && (m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p)) {
            com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p pVar = (com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p) m1Var;
            if (!pVar.m83046xa8dc6533() && !pVar.H()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "test do delay query order");
                aVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "startDelayScene");
                aVar.f420344f = 0;
                aVar.a(pVar);
                return true;
            }
        }
        boolean z18 = m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.c;
        np5.b bVar = this.f420361q;
        if (z18) {
            bVar.getClass();
            com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1 c22898xca8246e1 = ((rr4.d) ((com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.c) m1Var)).f480766m;
            if (c22898xca8246e1 != null && c22898xca8246e1.b()) {
                np5.b.f420347g = c22898xca8246e1;
            }
        }
        boolean z19 = m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p;
        if (z19) {
            com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p pVar2 = (com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p) m1Var;
            if (pVar2.m83046xa8dc6533()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "getHasRetried pass %s", m1Var);
                return false;
            }
            if (pVar2.H() && (m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.a)) {
                boolean m83042x2e74bed0 = pVar2.m83042x2e74bed0();
                boolean z27 = !pVar2.m83005xab5ceedf();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "%s save or fetch shouldRetry, network: %B, server: %B", this, java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(m83042x2e74bed0));
                if (!m83042x2e74bed0 && !z27) {
                    return false;
                }
                bVar.getClass();
                com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1 mo83036x91bc3024 = ((com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.a) m1Var).mo83036x91bc3024();
                if (mo83036x91bc3024 != null && mo83036x91bc3024.b()) {
                    np5.b.f420347g = mo83036x91bc3024;
                }
                return bVar.a(pVar2);
            }
        }
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        java.util.HashMap hashMap = this.f420362r;
        if (hashMap != null) {
            np5.c cVar = (np5.c) hashMap.get(java.lang.Integer.valueOf(mo808xfb85f7b0));
            if (m1Var instanceof np5.d) {
                np5.d dVar = (np5.d) m1Var;
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.t) dVar).f238551h) {
                    return false;
                }
                cVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IDelayQueryOrder", "startQueryOrder %s ", dVar);
                cVar.f420365f = dVar;
                if (cVar.b(i17, i18, dVar)) {
                    return true;
                }
            }
        }
        if (!z19) {
            return false;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p pVar3 = (com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p) m1Var;
        if (pVar3.H()) {
            return false;
        }
        if (pVar3.m83046xa8dc6533()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "getHasRetried pass");
            return false;
        }
        aVar.getClass();
        int i19 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95543s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", " isServerDelayQuery %s mDelayQueryTime %s ", java.lang.Boolean.valueOf(pVar3.f295583e == 1), java.lang.Integer.valueOf(aVar.f420344f));
        boolean z28 = (pVar3.f295583e == 1) && aVar.f420344f < i19;
        boolean z29 = !pVar3.m83005xab5ceedf();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(965L, 13L, 1L);
        if (z29) {
            g0Var.C(965L, 14L, 1L);
        }
        if (!z28 && !z29) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "%s doing delay order query retry", this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderHelper", "startDelayScene");
        aVar.f420344f = 0;
        aVar.a(pVar3);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        boolean z18;
        np5.f fVar;
        java.util.HashSet hashSet = this.f420355h;
        boolean contains = hashSet.contains(m1Var);
        java.util.HashSet hashSet2 = this.f420353f;
        java.util.HashSet hashSet3 = this.f420354g;
        if (contains) {
            hashSet.remove(m1Var);
        } else if (hashSet3.contains(m1Var)) {
            if (j(i17, i18, str, m1Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "%s do delay order query.break off!", this);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "%s Not need delay query order,remove scene", this);
                hashSet3.remove(m1Var);
            }
        } else {
            if (!hashSet2.contains(m1Var)) {
                z17 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "%s onSceneEnd scenes %s forcescenes %s", this, java.lang.Integer.valueOf(hashSet3.size()), java.lang.Integer.valueOf(hashSet2.size()));
                if (hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    z18 = false;
                } else {
                    android.app.Dialog dialog = this.f420356i;
                    if (dialog != null) {
                        dialog.dismiss();
                        this.f420356i = null;
                    }
                    z18 = true;
                }
                if (z17 || (fVar = this.f420352e) == null) {
                }
                fVar.mo66167x76e0bfae(i17, i18, str, m1Var, z18);
                return;
            }
            if (j(i17, i18, str, m1Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "%s do delay order query.break off!", this);
                return;
            } else {
                hashSet2.remove(m1Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "%s Not need delay query order,remove scene", this);
            }
        }
        z17 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "%s onSceneEnd scenes %s forcescenes %s", this, java.lang.Integer.valueOf(hashSet3.size()), java.lang.Integer.valueOf(hashSet2.size()));
        if (hashSet3.isEmpty()) {
        }
        z18 = false;
        if (z17) {
        }
    }
}
