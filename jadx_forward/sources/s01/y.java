package s01;

/* loaded from: classes11.dex */
public class y implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f483471d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f483472e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f483473f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public final kk.j f483474g = new kk.l(64);

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f483475h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f483476i = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f483477m = new java.lang.Object();

    /* renamed from: n, reason: collision with root package name */
    public final kk.j f483478n = new kk.l(64);

    public y() {
        gm0.j1.n().f354821b.a(1352, this);
        gm0.j1.n().f354821b.a(1365, this);
        gm0.j1.n().f354821b.a(od1.b.f73036x366c91de, this);
        gm0.j1.n().f354821b.a(1354, this);
        gm0.j1.n().f354821b.a(1357, this);
        gm0.j1.n().f354821b.a(bb1.e.f4185x366c91de, this);
        gm0.j1.n().f354821b.a(1355, this);
        gm0.j1.n().f354821b.a(1358, this);
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.c.f34284x366c91de, this);
        gm0.j1.n().f354821b.a(1361, this);
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.k2.f34491x366c91de, this);
        gm0.j1.n().f354821b.a(cc1.u.f4292x366c91de, this);
    }

    public void a(java.util.LinkedList linkedList, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this.f483473f) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                s01.x xVar = new s01.x(str, str2);
                if (!this.f483472e.contains(xVar)) {
                    this.f483471d.add(xVar);
                    ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) this.f483474g).put(str2, new java.lang.Long(currentTimeMillis));
                }
            }
            c();
        }
    }

    public void b(java.util.LinkedList linkedList, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this.f483477m) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                s01.x xVar = new s01.x(str, str2);
                if (this.f483476i.contains(xVar)) {
                    return;
                }
                this.f483475h.add(xVar);
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) this.f483478n).put(str2, new java.lang.Long(currentTimeMillis));
            }
            d();
        }
    }

    public final void c() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (this.f483473f) {
            if (this.f483472e.isEmpty()) {
                if (this.f483471d.isEmpty()) {
                    return;
                }
                java.util.Iterator it = this.f483471d.iterator();
                while (it.hasNext()) {
                    s01.x xVar = (s01.x) it.next();
                    r45.rj rjVar = new r45.rj();
                    rjVar.f466473d = xVar.f483469a;
                    rjVar.f466474e = xVar.f483470b;
                    linkedList.add(rjVar);
                }
                if (linkedList.isEmpty()) {
                    return;
                }
                this.f483472e.addAll(this.f483471d);
                this.f483471d.clear();
                gm0.j1.n().f354821b.g(new s01.i0(linkedList));
            }
        }
    }

    public final void d() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (this.f483477m) {
            if (this.f483476i.isEmpty()) {
                if (this.f483475h.isEmpty()) {
                    return;
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.Iterator it = this.f483475h.iterator();
                while (it.hasNext()) {
                    s01.x xVar = (s01.x) it.next();
                    java.util.LinkedList linkedList2 = (java.util.LinkedList) hashMap.get(xVar.f483469a);
                    if (linkedList2 == null) {
                        linkedList2 = new java.util.LinkedList();
                        hashMap.put(xVar.f483469a, linkedList2);
                    }
                    linkedList2.add(xVar.f483470b);
                }
                for (java.lang.String str : hashMap.keySet()) {
                    java.util.LinkedList linkedList3 = (java.util.LinkedList) hashMap.get(str);
                    if (linkedList3 != null && !linkedList3.isEmpty()) {
                        r45.ao aoVar = new r45.ao();
                        aoVar.f451694d = str;
                        aoVar.f451695e = linkedList3;
                        linkedList.add(aoVar);
                    }
                }
                this.f483476i.addAll(this.f483475h);
                this.f483475h.clear();
                gm0.j1.n().f354821b.g(new s01.k0(linkedList, null));
            }
        }
    }

    public s01.g0 e(java.lang.String str, r45.j53 j53Var, r01.w2 w2Var) {
        s01.g0 g0Var = new s01.g0(str, j53Var, w2Var);
        gm0.j1.n().f354821b.g(g0Var);
        return g0Var;
    }

    public void f(java.lang.String str, java.lang.String str2, int i17) {
        java.lang.Long l17 = (java.lang.Long) ((kk.l) this.f483474g).get(str);
        if (l17 == null || l17.longValue() + i17 < java.lang.System.currentTimeMillis()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (this.f483473f) {
                s01.x xVar = new s01.x(str2, str);
                if (!this.f483472e.contains(xVar)) {
                    this.f483471d.add(xVar);
                    ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) this.f483474g).put(str, new java.lang.Long(currentTimeMillis));
                    c();
                }
            }
        }
    }

    /* renamed from: finalize */
    public void m163502xd764dc1e() {
        gm0.j1.n().f354821b.q(1352, this);
        gm0.j1.n().f354821b.q(1365, this);
        gm0.j1.n().f354821b.q(od1.b.f73036x366c91de, this);
        gm0.j1.n().f354821b.q(1354, this);
        gm0.j1.n().f354821b.q(1357, this);
        gm0.j1.n().f354821b.q(bb1.e.f4185x366c91de, this);
        gm0.j1.n().f354821b.q(1355, this);
        gm0.j1.n().f354821b.q(1358, this);
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.c.f34284x366c91de, this);
        gm0.j1.n().f354821b.q(1361, this);
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.k2.f34491x366c91de, this);
        gm0.j1.n().f354821b.q(cc1.u.f4292x366c91de, this);
        super.finalize();
    }

    public void g(java.lang.String str, java.lang.String str2, int i17) {
        java.lang.Long l17 = (java.lang.Long) ((kk.l) this.f483478n).get(str);
        if (l17 == null || l17.longValue() + i17 < java.lang.System.currentTimeMillis()) {
            j(str, str2);
        }
    }

    public void h(java.lang.String str, r01.w2 w2Var) {
        gm0.j1.n().f354821b.g(new s01.j0(str, w2Var));
    }

    public void i(java.lang.String str, java.lang.String str2, r01.w2 w2Var) {
        if (w2Var == null) {
            return;
        }
        s01.a0 d17 = s01.r.d(str2);
        if (d17 == null || d17.f65840x13fe5d2b.equals(str)) {
            h(str2, w2Var);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        r45.ao aoVar = new r45.ao();
        aoVar.f451694d = str2;
        aoVar.f451695e = linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(aoVar);
        gm0.j1.n().f354821b.g(new s01.k0(linkedList2, w2Var));
    }

    public void j(java.lang.String str, java.lang.String str2) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this.f483477m) {
            s01.x xVar = new s01.x(str2, str);
            if (this.f483476i.contains(xVar)) {
                return;
            }
            this.f483475h.add(xVar);
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) this.f483478n).put(str, new java.lang.Long(currentTimeMillis));
            d();
        }
    }

    public boolean k(r45.j53 j53Var, java.lang.String str, boolean z17) {
        if (j53Var == null || j53Var.f459125d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatNetworkMgr", "fullBizChat or fullBizChat.chat or brandUserName == null");
            return false;
        }
        if (j53Var.f459126e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatNetworkMgr", "members==null");
            return false;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new s01.w(this, j53Var, str, z17), "Thread-internalHandleFullBizChatInfo");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l(r45.j53 r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s01.y.l(r45.j53, java.lang.String, boolean):boolean");
    }

    public boolean m(r45.xj xjVar, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xjVar.f471686d)) {
            return false;
        }
        s01.a0 a0Var = new s01.a0();
        a0Var.f65840x13fe5d2b = xjVar.f471686d;
        a0Var.f65841xdde069b = xjVar.f471687e;
        a0Var.f65836x75756b18 = str;
        a0Var.f65837x35be6339 = xjVar.f471689g;
        a0Var.f65839x776e2b6b = xjVar.f471690h;
        a0Var.f65833xd21ffea8 = xjVar.f471688f;
        a0Var.f65834x53f3fff9 = xjVar.f471692m;
        if (!r01.q3.Vi().J0(a0Var)) {
            r01.q3.Vi().mo880xb970c2b9(a0Var);
        }
        s01.h hVar = new s01.h();
        hVar.f69169xf75e5c37 = a0Var.f65840x13fe5d2b;
        hVar.f69170x75756b18 = a0Var.f65836x75756b18;
        hVar.f69171x736d1fa8 = a0Var.f65841xdde069b;
        hVar.f69173x73703457 = 1;
        return s01.r.m(hVar) != null;
    }

    public s01.p0 n(java.lang.String str, r45.pj pjVar, r01.w2 w2Var) {
        s01.p0 p0Var = new s01.p0(str, pjVar, w2Var);
        gm0.j1.n().f354821b.g(p0Var);
        return p0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:298:0x04ee, code lost:
    
        if (r11 == false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0553, code lost:
    
        if (r12.moveToFirst() != false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0555, code lost:
    
        r14.add(r12.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0560, code lost:
    
        if (r12.moveToNext() != false) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0562, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0709, code lost:
    
        if (r11 == false) goto L434;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r11, int r12, java.lang.String r13, com.p314xaae8f345.mm.p944x882e457a.m1 r14) {
        /*
            Method dump skipped, instructions count: 1832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s01.y.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
