package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class l2 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 implements t13.j {
    public boolean A;

    /* renamed from: q, reason: collision with root package name */
    public final int f219635q;

    /* renamed from: r, reason: collision with root package name */
    public final int f219636r;

    /* renamed from: s, reason: collision with root package name */
    public final t13.k f219637s;

    /* renamed from: t, reason: collision with root package name */
    public final g23.e f219638t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Boolean f219639u;

    /* renamed from: v, reason: collision with root package name */
    public final long f219640v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219641w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f219642x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f219643y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219644z;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var, int i17, int i18, long j17) {
        super(w0Var);
        int i19;
        this.f219639u = java.lang.Boolean.FALSE;
        this.f219641w = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f219644z = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.k2(this, android.os.Looper.getMainLooper());
        this.f219636r = i17;
        android.content.Context h17 = h();
        if (i17 == -32) {
            i19 = 4384;
        } else if (i17 == -15) {
            i19 = 4240;
        } else if (i17 != -13) {
            switch (i17) {
                case org.p3343x72743996.net.InterfaceC29524x4f65168b.f73893x3897a05 /* -30 */:
                    i19 = 4193;
                    break;
                case -29:
                    i19 = 4210;
                    break;
                case -28:
                    i19 = 4368;
                    break;
                case -27:
                    i19 = 4209;
                    break;
                case -26:
                    i19 = 12294;
                    break;
                case -25:
                    i19 = 12293;
                    break;
                case -24:
                    i19 = 4352;
                    break;
                case -23:
                    i19 = 8224;
                    break;
                default:
                    switch (i17) {
                        case -7:
                            i19 = 4208;
                            break;
                        case -6:
                            i19 = 4160;
                            break;
                        case -5:
                            i19 = 4144;
                            break;
                        case -4:
                            i19 = 4112;
                            break;
                        case -3:
                            i19 = 4128;
                            break;
                        case -2:
                            i19 = 4176;
                            break;
                        case -1:
                            i19 = 4192;
                            break;
                        default:
                            i19 = -1;
                            break;
                    }
            }
        } else {
            i19 = 4224;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSDetailAdapter", "searchType=%d | uiLogicType=%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i19));
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(java.lang.Integer.valueOf(i19));
        this.f219637s = (t13.k) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Vi(hashSet, h17, this, i18).get(0);
        g23.e eVar = new g23.e();
        this.f219638t = eVar;
        eVar.f349438g = i17;
        this.f219635q = i18;
        this.f219640v = j17;
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        str.equals(this.f219583g);
        n(kVar.j(0));
        notifyDataSetChanged();
        l(getCount(), true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        g23.e eVar = this.f219638t;
        eVar.f349432a = currentTimeMillis;
        eVar.getClass();
        java.util.Iterator it = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a) kVar).f219542n.iterator();
        while (it.hasNext()) {
            eVar.f349434c += ((t13.i) it.next()).f496103f.size();
        }
        ((java.util.ArrayList) eVar.f349440i).addAll(kVar.h(eVar.f349433b));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void c() {
        super.c();
        g23.e eVar = this.f219638t;
        eVar.f349432a = 0L;
        eVar.f349434c = 0;
        eVar.f349435d = 0L;
        ((java.util.ArrayList) eVar.f349439h).clear();
        ((java.util.ArrayList) eVar.f349440i).clear();
        t13.k kVar = this.f219637s;
        kVar.c();
        kVar.mo63601x92b73cc2();
        this.f219644z.mo50303x856b99f0(1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public u13.g d(int i17) {
        u13.g b17 = this.f219637s.b(i17);
        if (b17 != null) {
            b17.f505299i = i17;
            b17.f505296f = 2;
            b17.f505301k = java.lang.String.valueOf(this.f219638t.f349435d);
        }
        return b17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void f() {
        g23.e eVar = this.f219638t;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f349436e) && !this.f219639u.booleanValue() && eVar.f349435d != 0) {
            eVar.f349437f = z13.f.Y6(h()).b7();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.k(eVar);
        }
        this.f219639u = java.lang.Boolean.FALSE;
        this.f219642x = false;
        long j17 = this.f219640v;
        if (j17 == 0) {
            j17 = o13.n.g(this.f219635q);
        }
        eVar.f349435d = j17;
        eVar.f349436e = this.f219583g;
        eVar.f349433b = c01.id.c();
        t13.k kVar = this.f219637s;
        if (kVar instanceof j23.h) {
            j23.h hVar = (j23.h) kVar;
            boolean z17 = this.f219585i;
            hVar.f378805p = z17;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = hVar.f219540i;
            objArr[1] = z17 ? "yes" : "no";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSContactDetailUIUnit", "fts: query: %s, setSearchByPinyin: %s", objArr);
        }
        this.f219637s.f(this.f219583g, this.f219641w, new java.util.HashSet(), 0L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void g() {
        if (!this.f219642x) {
            this.f219642x = true;
            if (!this.A) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.m(this.f219583g, false, this.f219637s.e(), this.f219636r);
            }
        }
        boolean booleanValue = this.f219639u.booleanValue();
        g23.e eVar = this.f219638t;
        if (!booleanValue) {
            this.f219639u = java.lang.Boolean.TRUE;
            eVar.f349437f = z13.f.Y6(h()).b7();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.k(eVar);
        }
        eVar.f349432a = 0L;
        eVar.f349434c = 0;
        eVar.f349435d = 0L;
        ((java.util.ArrayList) eVar.f349439h).clear();
        ((java.util.ArrayList) eVar.f349440i).clear();
        super.g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        t13.k kVar = this.f219637s;
        kVar.a(view, gVar, z17);
        boolean z18 = gVar.f505305o;
        g23.e eVar = this.f219638t;
        if (z18) {
            if (!this.f219642x) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.m(this.f219583g, true, kVar.e(), gVar.f505297g);
                this.f219642x = true;
            }
            eVar.f349437f = z13.f.Y6(h()).b7();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.e(gVar, eVar);
            return false;
        }
        if (!(gVar instanceof e23.x)) {
            return false;
        }
        this.A = true;
        eVar.f349437f = z13.f.Y6(h()).b7();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.e(gVar, eVar);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void m(android.content.Context context, u13.g gVar) {
        ((w50.k) ((x50.j) i95.n0.c(x50.j.class))).getClass();
        if (gVar == null ? false : gVar instanceof b05.f) {
            super.m(context, gVar);
            g23.e eVar = this.f219638t;
            eVar.getClass();
            int i17 = gVar.f505291a;
            if (i17 == -1 || i17 == 0 || i17 == 11) {
                return;
            }
            long c17 = c01.id.c();
            java.util.Iterator it = ((java.util.ArrayList) eVar.f349440i).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p13.e eVar2 = (p13.e) it.next();
                if (eVar2.f432607b == gVar.f505292b) {
                    eVar2.f432610e = c17 - eVar.f349433b;
                    eVar2.f432616k = c17;
                    break;
                }
            }
            java.lang.String wi6 = ((w50.k) ((x50.j) i95.n0.c(x50.j.class))).wi(gVar);
            if (wi6 != "") {
                ((java.util.ArrayList) eVar.f349439h).add(wi6);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0, android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        super.onScrollStateChanged(absListView, i17);
        if (i17 == 2) {
            this.f219643y = true;
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).g();
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1) p94.w0.d()).G();
        } else {
            this.f219643y = false;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f219302c) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f219644z;
            n3Var.mo50303x856b99f0(1);
            n3Var.mo50307xb9e94560(1, 200L);
        }
    }
}
