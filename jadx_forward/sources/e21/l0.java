package e21;

/* loaded from: classes11.dex */
public class l0 implements com.p314xaae8f345.mm.p944x882e457a.j1, xg3.o0 {

    /* renamed from: h, reason: collision with root package name */
    public e21.r f328078h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f328079i;

    /* renamed from: d, reason: collision with root package name */
    public boolean f328074d = false;

    /* renamed from: e, reason: collision with root package name */
    public final kk.j f328075e = new jt0.j(200);

    /* renamed from: f, reason: collision with root package name */
    public final kk.j f328076f = new jt0.j(200);

    /* renamed from: g, reason: collision with root package name */
    public final kk.j f328077g = new jt0.j(200);

    /* renamed from: m, reason: collision with root package name */
    public final e21.e0 f328080m = new e21.e0();

    /* renamed from: n, reason: collision with root package name */
    public long f328081n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f328082o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new e21.g0(this), false);

    public l0(e21.g0 g0Var) {
        this.f328079i = new java.util.HashMap();
        this.f328079i = new java.util.HashMap();
    }

    public e21.r b() {
        if (this.f328078h == null && gm0.j1.a()) {
            synchronized (e21.r.class) {
                if (this.f328078h == null) {
                    this.f328078h = new e21.r(gm0.j1.u().f354686f);
                }
            }
        }
        return this.f328078h;
    }

    public final void c(int i17, int i18, java.lang.String str, java.lang.String str2) {
        java.util.HashSet hashSet = (java.util.HashSet) this.f328079i.get(java.lang.Integer.valueOf(i17));
        if (hashSet == null) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() != null) {
                linkedList.add((xg3.n0) weakReference.get());
            }
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((xg3.n0) it6.next()).a(i18, str, str2);
        }
        linkedList.clear();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        e21.j jVar;
        e21.g gVar;
        r45.j25 j25Var;
        java.util.LinkedList linkedList;
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogService", "onSceneEnd[%s] errType:%d,errCode:%d,errMsg:%s, sceneType %d", java.lang.Integer.valueOf(m1Var.hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f328082o;
        kk.j jVar2 = this.f328075e;
        e21.e0 e0Var = this.f328080m;
        if (mo808xfb85f7b0 == 806 && ((z17 = m1Var instanceof l41.c0))) {
            r45.a15 a15Var = (r45.a15) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
            kk.j jVar3 = this.f328076f;
            xg3.q0 q0Var = ((l41.c0) m1Var).f397321g;
            if (i17 == 0 || i18 == 0) {
                if (z17) {
                    int i19 = a15Var.mo11484xe92ab0a8() != null ? a15Var.mo11484xe92ab0a8().f458492d : 0;
                    e0Var.a(q0Var, i19);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5827xd72bd98b c5827xd72bd98b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5827xd72bd98b();
                    c5827xd72bd98b.f136135g.f89737a = i19;
                    c5827xd72bd98b.e();
                    c(q0Var.b(), i19, "", "");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogService", "openim op success, type:%d id %d", java.lang.Integer.valueOf(q0Var.f535960f), java.lang.Integer.valueOf(q0Var.b()));
                    int m126807x7444f759 = b().m126807x7444f759();
                    b().m0(q0Var);
                    ((lt0.f) jVar3).mo141381xc84af884(java.lang.Integer.valueOf(q0Var.f535956b));
                    this.f328074d = false;
                    e0Var.b(q0Var, (java.lang.Integer) ((lt0.f) jVar3).i(java.lang.Integer.valueOf(q0Var.f535956b)), m126807x7444f759);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogService", "openim op success, mapRecentDown: %d, mapOpenImRecentDown: %d", java.lang.Integer.valueOf(((lt0.f) jVar2).mo143586x35e001()), java.lang.Integer.valueOf(((lt0.f) jVar3).mo143586x35e001()));
                    long j17 = ((lt0.f) jVar2).mo143586x35e001() > 0 ? 500L : 0L;
                    b4Var.c(j17, j17);
                    return;
                }
                return;
            }
            java.lang.String g17 = (a15Var == null || a15Var.mo11484xe92ab0a8() == null) ? "" : x51.j1.g(a15Var.mo11484xe92ab0a8().f458493e);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                g17 = str;
            }
            int i27 = q0Var.f535956b;
            c(q0Var.b(), -1, "", g17);
            this.f328074d = false;
            java.lang.Integer num = (java.lang.Integer) ((lt0.f) jVar3).i(java.lang.Integer.valueOf(i27));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogService", "summeroplog id:%d, inserttime:%d, mapCnt:%d", java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(q0Var.f535957c), num);
            if (num == null) {
                ((lt0.f) jVar3).j(java.lang.Integer.valueOf(i27), 1);
                return;
            }
            if (num.intValue() < 2) {
                ((lt0.f) jVar3).j(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(num.intValue() + 1));
                return;
            }
            int m126807x7444f7592 = b().m126807x7444f759();
            b().m0(q0Var);
            ((lt0.f) jVar3).mo141381xc84af884(java.lang.Integer.valueOf(q0Var.f535956b));
            e0Var.b(q0Var, num, m126807x7444f7592);
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 12607 && (m1Var instanceof it1.a)) {
            it1.a aVar = (it1.a) m1Var;
            r45.pr prVar = (r45.pr) aVar.f376030e.f152244b.f152233a;
            kk.j jVar4 = this.f328077g;
            xg3.q0 q0Var2 = aVar.f376032g;
            if (i17 == 0 || i18 == 0) {
                int i28 = ((r45.ie) prVar.m75936x14adae67(0)) != null ? ((r45.ie) prVar.m75936x14adae67(0)).f458492d : 0;
                e0Var.a(q0Var2, i28);
                c(q0Var2.b(), i28, "", "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogService", "byp op success, opType:%d id %d ret %d", java.lang.Integer.valueOf(q0Var2.f535960f), java.lang.Integer.valueOf(q0Var2.b()), java.lang.Integer.valueOf(i28));
                int m126807x7444f7593 = b().m126807x7444f759();
                b().m0(q0Var2);
                ((lt0.f) jVar4).mo141381xc84af884(java.lang.Integer.valueOf(q0Var2.f535956b));
                this.f328074d = false;
                e0Var.b(q0Var2, (java.lang.Integer) ((lt0.f) jVar4).i(java.lang.Integer.valueOf(q0Var2.f535956b)), m126807x7444f7593);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogService", "byp op success, mapRecentDown: %d, mapBypRecentDown: %d", java.lang.Integer.valueOf(((lt0.f) jVar2).mo143586x35e001()), java.lang.Integer.valueOf(((lt0.f) jVar4).mo143586x35e001()));
                long j18 = ((lt0.f) jVar2).mo143586x35e001() > 0 ? 500L : 0L;
                b4Var.c(j18, j18);
                return;
            }
            java.lang.String g18 = (prVar == null || ((r45.ie) prVar.m75936x14adae67(0)) == null) ? "" : x51.j1.g(((r45.ie) prVar.m75936x14adae67(0)).f458493e);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g18)) {
                g18 = str;
            }
            int i29 = q0Var2.f535956b;
            c(q0Var2.b(), -1, "", g18);
            this.f328074d = false;
            java.lang.Integer num2 = (java.lang.Integer) ((lt0.f) jVar4).i(java.lang.Integer.valueOf(i29));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogService", "byp op failed, id:%d, inserttime:%d, mapCnt:%d", java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(q0Var2.f535957c), num2);
            if (num2 == null) {
                ((lt0.f) jVar4).j(java.lang.Integer.valueOf(i29), 1);
                return;
            }
            if (num2.intValue() < 2) {
                ((lt0.f) jVar4).j(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(num2.intValue() + 1));
                return;
            }
            int m126807x7444f7594 = b().m126807x7444f759();
            b().m0(q0Var2);
            ((lt0.f) jVar4).mo141381xc84af884(java.lang.Integer.valueOf(q0Var2.f535956b));
            e0Var.b(q0Var2, num2, m126807x7444f7594);
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 681 && (m1Var instanceof e21.j)) {
            if (i17 != 0 || i18 != 0 || (gVar = (jVar = (e21.j) m1Var).f328070e) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OplogService", "summeroplog tryStartNetscene onSceneEnd errType:%d, errCode:%d, rr:%s not retry", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), ((e21.j) m1Var).f328070e.toString());
                this.f328074d = false;
                return;
            }
            r45.i25 i25Var = gVar.f328054b.f328061a;
            int i37 = i25Var.f458220d;
            if (i37 != 0 || (j25Var = i25Var.f458221e) == null || (linkedList = j25Var.f459051e) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OplogService", "summeroplog tryStartNetscene onSceneEnd Ret:%d  not ok and no retry.", java.lang.Integer.valueOf(i37));
                this.f328074d = false;
                return;
            }
            if (j25Var != null && linkedList.size() != 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5827xd72bd98b c5827xd72bd98b2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5827xd72bd98b();
                int intValue = ((java.lang.Integer) i25Var.f458221e.f459051e.getLast()).intValue();
                am.vn vnVar = c5827xd72bd98b2.f136135g;
                vnVar.f89737a = intValue;
                java.util.LinkedList linkedList2 = i25Var.f458221e.f459052f;
                vnVar.f89738b = linkedList2.isEmpty() ? "" : ((r45.g25) linkedList2.getLast()).f456375e;
                vnVar.f89739c = linkedList2.isEmpty() ? "" : ((r45.g25) linkedList2.getLast()).f456374d;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vnVar.f89738b) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vnVar.f89739c)) {
                    for (int size = linkedList2.size() - 1; size >= 0; size--) {
                        vnVar.f89738b = ((r45.g25) linkedList2.get(size)).f456375e;
                        vnVar.f89739c = ((r45.g25) linkedList2.get(size)).f456374d;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vnVar.f89738b) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vnVar.f89739c)) {
                            break;
                        }
                    }
                }
                c5827xd72bd98b2.e();
            }
            java.util.List list = jVar.f328071f;
            r45.j25 j25Var2 = i25Var.f458221e;
            new e21.j0(this, this, list, j25Var2.f459051e, j25Var2.f459052f).c(50L, 50L);
        }
    }
}
