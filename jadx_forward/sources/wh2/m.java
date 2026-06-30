package wh2;

/* loaded from: classes2.dex */
public final class m extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1506xbe953013.C14231xd1c27277 f527489d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1506xbe953013.C14231xd1c27277 c14231xd1c27277) {
        this.f527489d = c14231xd1c27277;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.nw1 m76794xd0557130;
        r45.s11 s11Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1506xbe953013.C14231xd1c27277 c14231xd1c27277 = this.f527489d;
        wh2.n nVar = new wh2.n(c14231xd1c27277, i17, i18, str);
        if (fVar instanceof r45.t91) {
            java.util.LinkedList<r45.fh2> linkedList = new java.util.LinkedList();
            if (c14231xd1c27277.m56388xcaeb60d0().isEmpty()) {
                linkedList.addAll(((r45.t91) fVar).m75941xfb821914(1));
            } else {
                java.util.List I = kz5.j0.I(c14231xd1c27277.m56388xcaeb60d0(), so2.q2.class);
                java.util.LinkedList<r45.fh2> m75941xfb821914 = ((r45.t91) fVar).m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObjects(...)");
                for (r45.fh2 fh2Var : m75941xfb821914) {
                    java.util.Iterator it = ((java.util.ArrayList) I).iterator();
                    int i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i19 = -1;
                            break;
                        }
                        so2.q2 q2Var = (so2.q2) it.next();
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) fh2Var.m75936x14adae67(1);
                        java.lang.Long valueOf = (c19792x256d2725 == null || (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) == null) ? null : java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0));
                        r45.nw1 m76794xd05571302 = q2Var.f492082n.m76794xd0557130();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, m76794xd05571302 != null ? java.lang.Long.valueOf(m76794xd05571302.m75942xfb822ef2(0)) : null)) {
                            break;
                        }
                        i19++;
                    }
                    if (i19 != -1) {
                        java.lang.String m56464xb5886c64 = m56464xb5886c64();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("repeat feed:");
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) fh2Var.m75936x14adae67(1);
                        sb6.append(c19792x256d27252 != null ? cm2.a.f124861a.x(c19792x256d27252, -1) : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
                    } else {
                        linkedList.add(fh2Var);
                    }
                }
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            for (r45.fh2 fh2Var2 : linkedList) {
                int m75939xb282bd08 = fh2Var2.m75939xb282bd08(0);
                if (m75939xb282bd08 == 1) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) fh2Var2.m75936x14adae67(1);
                    if (c19792x256d27253 != null) {
                        so2.q2 q2Var2 = new so2.q2(c19792x256d27253, 0);
                        q2Var2.f492083o = fh2Var2.m75939xb282bd08(3);
                        linkedList2.add(q2Var2);
                    }
                } else if (m75939xb282bd08 == 2 && (s11Var = (r45.s11) fh2Var2.m75936x14adae67(2)) != null) {
                    so2.g2 g2Var = new so2.g2(s11Var);
                    g2Var.f491893e = fh2Var2.m75939xb282bd08(3);
                    linkedList2.add(g2Var);
                }
            }
            nVar.m56420x2a5f836b(linkedList2);
            r45.t91 t91Var = (r45.t91) fVar;
            t91Var.m75939xb282bd08(4);
            nVar.m56421x73095078(t91Var.m75934xbce7f2f(2));
            nVar.m56419xdac5ee4d(t91Var.m75939xb282bd08(3) == 1);
            nVar.m56423xd4b4a5a1(2);
        }
        return nVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        return new ke2.c0(this.f527489d.m56357x44e5026c());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        return new ke2.c0(this.f527489d.m56357x44e5026c());
    }
}
