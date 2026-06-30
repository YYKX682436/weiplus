package zv;

/* loaded from: classes11.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f557434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f557435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f557436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f557437g;

    public a3(yz5.l lVar, long j17, boolean z17, boolean z18) {
        this.f557434d = lVar;
        this.f557435e = j17;
        this.f557436f = z17;
        this.f557437g = z18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.util.List W0;
        java.util.Iterator it;
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23523xaa6b11f5 c23523xaa6b11f5;
        java.lang.String str;
        java.lang.Boolean bool;
        java.util.LinkedList linkedList;
        java.util.Iterator it6;
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        zv.q qVar = zv.q.f557612a;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (this.f557436f) {
            W0 = r01.q3.nj().P0(10, 285212721);
        } else {
            boolean z17 = this.f557437g;
            long j17 = this.f557435e;
            W0 = z17 ? r01.q3.nj().W0(j17, 285212721) : r01.q3.nj().f1(10, j17, 285212721);
        }
        for (java.util.Iterator it7 = W0.iterator(); it7.hasNext(); it7 = it) {
            com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = (com.p314xaae8f345.mm.p2621x8fb0427b.s1) it7.next();
            if (s1Var.v0()) {
                if (s1Var.v0()) {
                    java.lang.String str2 = s1Var.f67306x114ef53e;
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
                    ot0.r0 r0Var = (ot0.r0) ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(s1Var.f67292x297eb4f7, s1Var.f67281xad49e234);
                    long j18 = s1Var.f67296x8340ced5;
                    long j19 = s1Var.f67292x297eb4f7;
                    long j27 = s1Var.f67293xd09be28e;
                    boolean z18 = s1Var.f67285xf918da09;
                    long j28 = s1Var.f67282xac3be4e;
                    if (n17 != null) {
                        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                        str = c01.a2.e(str2);
                    } else {
                        str = null;
                    }
                    if (n17 != null) {
                        bool = java.lang.Boolean.valueOf(n17.w2());
                        it = it7;
                    } else {
                        it = it7;
                        bool = null;
                    }
                    java.lang.Boolean bool2 = bool;
                    int i17 = 1;
                    c23523xaa6b11f5 = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23523xaa6b11f5(str2, str, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Boolean.valueOf(s1Var.f67286xff7b64c5 == 1), java.lang.Boolean.valueOf(s1Var.f67287x15a25b3), java.lang.Boolean.valueOf(z18), bool2, java.lang.Long.valueOf(j28), null, java.lang.Boolean.valueOf((1 & s1Var.f67279x6e664fd4) != 0), new java.util.LinkedList(), 1024, null);
                    java.util.LinkedList linkedList3 = r0Var.f430114i;
                    if (linkedList3 != null) {
                        java.util.Iterator it8 = linkedList3.iterator();
                        while (it8.hasNext()) {
                            ot0.s0 s0Var = (ot0.s0) it8.next();
                            java.util.List<com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23524x7a19fea8> m86915x749b8e0a = c23523xaa6b11f5.m86915x749b8e0a();
                            java.util.LinkedList linkedList4 = m86915x749b8e0a instanceof java.util.LinkedList ? (java.util.LinkedList) m86915x749b8e0a : null;
                            if (linkedList4 != null) {
                                java.lang.String str3 = s0Var.f430294d;
                                java.lang.String str4 = s0Var.f430295e;
                                java.lang.String m17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).m(s0Var.f430295e);
                                java.lang.String str5 = s0Var.f430299i;
                                java.lang.String str6 = s0Var.D;
                                java.lang.String str7 = s0Var.f430302n;
                                long j29 = s0Var.f430303o;
                                boolean z19 = s0Var.I == i17 ? i17 : 0;
                                long j37 = s0Var.C;
                                linkedList = linkedList2;
                                it6 = it8;
                                linkedList4.add(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23524x7a19fea8(str3, str4, m17, java.lang.Long.valueOf(s0Var.f430298h), str5, str6, str7, java.lang.Long.valueOf(j29), java.lang.Long.valueOf(s0Var.f430307q), s0Var.f430318z, s0Var.A, s0Var.G, java.lang.Long.valueOf(j37), java.lang.Long.valueOf(s0Var.E), java.lang.Long.valueOf(s0Var.F), java.lang.Boolean.valueOf(z19)));
                            } else {
                                linkedList = linkedList2;
                                it6 = it8;
                            }
                            i17 = 1;
                            linkedList2 = linkedList;
                            it8 = it6;
                        }
                    }
                    linkedList2 = linkedList2;
                } else {
                    it = it7;
                    c23523xaa6b11f5 = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23523xaa6b11f5(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                }
                linkedList2.add(c23523xaa6b11f5);
            } else {
                it = it7;
            }
        }
        this.f557434d.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(kz5.n0.V0(linkedList2))));
    }
}
