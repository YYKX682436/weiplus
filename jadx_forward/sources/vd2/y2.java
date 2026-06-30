package vd2;

/* loaded from: classes2.dex */
public abstract class y2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f517561d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14166x338f3aec f517562e;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14166x338f3aec c14166x338f3aec) {
        this.f517562e = c14166x338f3aec;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: alive */
    public void mo56311x58998cd() {
        super.mo56311x58998cd();
        gm0.j1.d().a(6479, this);
    }

    public abstract com.p314xaae8f345.mm.p944x882e457a.m1 b();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: dead */
    public void mo56312x2efc64() {
        super.mo56312x2efc64();
        gm0.j1.d().q(6479, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetch */
    public void mo56275x5cd06ba(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (obj == null || !(obj instanceof com.p314xaae8f345.mm.p944x882e457a.m1)) {
            return;
        }
        this.f517561d.put(obj, callback);
        gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) obj);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchInit */
    public void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.b0();
        b0Var.m56423xd4b4a5a1(1000);
        callback.mo55587xb461ee3d(b0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchLoadMore */
    public void mo56024xaef8a235(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p944x882e457a.m1 b17 = b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14166x338f3aec c14166x338f3aec = this.f517562e;
        r45.gy0 gy0Var = c14166x338f3aec.f193266n.f390742n;
        if (gy0Var != null && gy0Var.m75939xb282bd08(0) == 3) {
            ((db2.q5) b17).f309669r = true;
        }
        km2.r rVar = c14166x338f3aec.f193266n;
        if (rVar.f390747s) {
            rVar.f390747s = false;
            ((db2.q5) b17).O(3);
        } else {
            ((db2.q5) b17).O(2);
        }
        android.content.Context context = c14166x338f3aec.f193013p;
        if (context != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            im2.s6 s6Var = (im2.s6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(im2.s6.class);
            if (s6Var != null) {
                s6Var.O6((db2.q5) b17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.m56461x34ddd257(this, b17, callback, false, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchPreload */
    public void mo56463x5a77d9ef(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p944x882e457a.m1 b17 = b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14166x338f3aec c14166x338f3aec = this.f517562e;
        r45.gy0 gy0Var = c14166x338f3aec.f193266n.f390742n;
        boolean z17 = false;
        if (gy0Var != null && gy0Var.m75939xb282bd08(0) == 3) {
            z17 = true;
        }
        if (z17) {
            ((db2.q5) b17).f309669r = true;
        }
        db2.q5 q5Var = (db2.q5) b17;
        q5Var.O(3);
        android.content.Context context = c14166x338f3aec.f193013p;
        if (context != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            im2.s6 s6Var = (im2.s6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(im2.s6.class);
            if (s6Var != null) {
                s6Var.O6(q5Var);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.m56461x34ddd257(this, b17, callback, false, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchRefresh */
    public void mo56025xae25fec1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p944x882e457a.m1 b17 = b();
        r45.gy0 gy0Var = this.f517562e.f193266n.f390742n;
        boolean z17 = false;
        if (gy0Var != null && gy0Var.m75939xb282bd08(0) == 3) {
            z17 = true;
        }
        if (z17) {
            ((db2.q5) b17).f309669r = true;
        }
        ((db2.q5) b17).O(4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.m56461x34ddd257(this, b17, callback, false, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        vd2.z2 z2Var;
        boolean z17;
        r45.v74 v74Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        java.util.Map map = this.f517561d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0) ((java.util.LinkedHashMap) map).get(scene);
        if (n0Var != null) {
            map.remove(scene);
            boolean z18 = scene instanceof db2.q5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14166x338f3aec c14166x338f3aec = this.f517562e;
            if (z18) {
                if (i17 == 0 && i18 == 0) {
                    com.p314xaae8f345.mm.p944x882e457a.o oVar = ((db2.q5) scene).f309661g;
                    if (oVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
                    z17 = ((r45.z71) fVar).m75939xb282bd08(3) != 0;
                } else {
                    z17 = true;
                }
                r45.gy0 gy0Var = c14166x338f3aec.f193266n.f390742n;
                if (gy0Var != null && gy0Var.m75939xb282bd08(0) == 3) {
                    r45.gy0 gy0Var2 = c14166x338f3aec.f193266n.f390742n;
                    if (gy0Var2 != null) {
                        gy0Var2.set(1, null);
                    }
                    r45.gy0 gy0Var3 = c14166x338f3aec.f193266n.f390742n;
                    if (gy0Var3 != null) {
                        gy0Var3.set(0, 0);
                    }
                }
                db2.q5 q5Var = (db2.q5) scene;
                boolean z19 = z17;
                vd2.z2 z2Var2 = new vd2.z2(q5Var.f309665n, i17, i18, str, q5Var.f309669r);
                java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> M = q5Var.M();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(M, 10));
                for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : M) {
                    ya2.g.m(ya2.h.f542017a, c19792x256d2725.m76760x76845fea(), false, 2, null);
                    bu2.j.f106067a.n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 16384), bu2.i.f106064l);
                    km2.m mVar = new km2.m(c19792x256d2725);
                    r45.v74 v74Var2 = mVar.f390662d.f150079p0;
                    java.lang.String m75945x2fec8307 = v74Var2 != null ? v74Var2.m75945x2fec8307(3) : null;
                    if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && (v74Var = mVar.f390662d.f150079p0) != null) {
                        ml2.q1 q1Var = ml2.q1.f409345e;
                        v74Var.set(3, "temp_2");
                    }
                    arrayList.add(mVar);
                }
                z2Var2.m56420x2a5f836b(arrayList);
                z2Var2.m56423xd4b4a5a1(q5Var.f309666o);
                com.p314xaae8f345.mm.p944x882e457a.o oVar2 = q5Var.f309661g;
                if (oVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
                    throw null;
                }
                com.p314xaae8f345.mm.p944x882e457a.n nVar = oVar2.f152244b;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = nVar.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
                z2Var2.m56421x73095078(((r45.z71) fVar2).m75934xbce7f2f(2));
                z2Var2.m56419xdac5ee4d(z19);
                java.util.HashMap hashMap = km2.n.f390680p;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = nVar.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
                km2.n.f390681q = ((r45.z71) fVar3).m75939xb282bd08(5) * 1000;
                java.lang.String m56464xb5886c64 = m56464xb5886c64();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
                java.util.List m56409x97891cf7 = z2Var2.m56409x97891cf7();
                sb6.append(m56409x97891cf7 != null ? java.lang.Integer.valueOf(m56409x97891cf7.size()) : null);
                sb6.append(",refresh_interval:");
                sb6.append(km2.n.f390681q);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
                z2Var = z2Var2;
            } else {
                z2Var = null;
            }
            if (z2Var != null) {
                n0Var.mo55587xb461ee3d(z2Var);
                return;
            }
            yz5.l lVar = c14166x338f3aec.f193259d;
            if (lVar != null) {
                lVar.mo146xb9724478(null);
            }
        }
    }
}
