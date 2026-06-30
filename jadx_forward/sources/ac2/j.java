package ac2;

/* loaded from: classes2.dex */
public final class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ac2.t f84567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f84568b;

    public j(ac2.t tVar, long j17) {
        this.f84567a = tVar;
        this.f84568b = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.ArrayList m56387xe6796cde;
        java.util.AbstractList m56387xe6796cde2;
        java.util.AbstractCollection m56387xe6796cde3;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ac2.t tVar = this.f84567a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.B, "requestFirstFeed errType %d errCode %d", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
        if (c19792x256d2725 != null) {
            if (tVar.f84591z == this.f84568b) {
                if (fVar.f152149b == 0 || c19792x256d2725.m76784x5db1b11() != 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 1);
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = tVar.f187954d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                    a17.m59358xc5f6eaef(nyVar != null ? nyVar.f216913n : 0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p(a17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = tVar.f188103t;
                    java.util.ArrayList m56387xe6796cde4 = abstractC13919x46aff122 != null ? abstractC13919x46aff122.m56387xe6796cde() : null;
                    if (m56387xe6796cde4 == null || m56387xe6796cde4.isEmpty()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff1222 = tVar.f188103t;
                        if (abstractC13919x46aff1222 != null && (m56387xe6796cde3 = abstractC13919x46aff1222.m56387xe6796cde()) != null) {
                            m56387xe6796cde3.add(p17);
                        }
                        ac2.y yVar = tVar.E;
                        if (yVar != null) {
                            yVar.a().m8146xced61ae5();
                        }
                        ac2.y yVar2 = tVar.E;
                        if (yVar2 != null) {
                            yVar2.z();
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff1223 = tVar.f188103t;
                        if (abstractC13919x46aff1223 != null && (m56387xe6796cde = abstractC13919x46aff1223.m56387xe6796cde()) != null) {
                            java.util.Iterator it = m56387xe6796cde.iterator();
                            int i17 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i17 = -1;
                                    break;
                                }
                                if (((so2.j5) it.next()).mo2128x1ed62e84() == c19792x256d2725.m76784x5db1b11()) {
                                    break;
                                }
                                i17++;
                            }
                            if (i17 != -1) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff1224 = tVar.f188103t;
                                if (abstractC13919x46aff1224 != null && (m56387xe6796cde2 = abstractC13919x46aff1224.m56387xe6796cde()) != null) {
                                }
                                ac2.y yVar3 = tVar.E;
                                if (yVar3 != null) {
                                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf a18 = yVar3.a();
                                    a18.m8148xed6e4d18(i17, new jz5.l(12, null));
                                    a18.m8148xed6e4d18(i17, new jz5.l(45, null));
                                    a18.m8148xed6e4d18(i17, new jz5.l(48, null));
                                    a18.m8148xed6e4d18(i17, new jz5.l(49, null));
                                }
                            }
                        }
                    }
                }
            }
            return jz5.f0.f384359a;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff1225 = tVar.f188103t;
        if (abstractC13919x46aff1225 != null) {
            abstractC13919x46aff1225.mo56155xd210094c();
        }
        return jz5.f0.f384359a;
    }
}
