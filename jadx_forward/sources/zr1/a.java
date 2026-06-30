package zr1;

/* loaded from: classes11.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jk f556711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r45.jk jkVar) {
        super(0);
        this.f556711d = jkVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long j17;
        jz5.g gVar = com.p314xaae8f345.mm.p2621x8fb0427b.o1.f276723a;
        java.util.LinkedList list = this.f556711d.f459429d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
        com.p314xaae8f345.mm.p2621x8fb0427b.j1[] j1VarArr = com.p314xaae8f345.mm.p2621x8fb0427b.j1.f276572d;
        new java.util.HashSet();
        if (list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizRecycleCardLogic", "handleRecycleCardResult list is empty");
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                int i17 = ((r45.xl5) next).f471750f;
                com.p314xaae8f345.mm.p2621x8fb0427b.i1[] i1VarArr = com.p314xaae8f345.mm.p2621x8fb0427b.i1.f276553d;
                if (i17 == 2) {
                    arrayList.add(next);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                r45.xl5 xl5Var = (r45.xl5) it6.next();
                com.p314xaae8f345.mm.p2621x8fb0427b.s1 L0 = r01.q3.nj().L0(xl5Var.f471749e);
                if (L0 != null && L0.A0()) {
                    r45.yl5 yl5Var = new r45.yl5();
                    r45.sj6 u07 = L0.u0();
                    yl5Var.f472734d = u07 != null ? u07.f467331s : null;
                    yl5Var.f472735e = xl5Var.f471749e;
                    yl5Var.f472737g = xl5Var.f471751g;
                    linkedList.add(yl5Var);
                    r01.q3.nj().z0(xl5Var.f471749e);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizRecycleCardLogic", "handleRecycleCardResult ok " + L0.f67292x297eb4f7);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1534L, 12L, 1L);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizRecycleCardLogic", "handleRecycleCardResult recycleReportList fromScene=3, size = " + linkedList.size() + '/' + list.size());
            if (!linkedList.isEmpty()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.b2 nj6 = r01.q3.nj();
                com.p314xaae8f345.mm.p2621x8fb0427b.b2 nj7 = r01.q3.nj();
                synchronized (nj7) {
                    j17 = nj7.f275300h;
                }
                int i18 = 0;
                int i19 = 0;
                for (com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var : nj6.J0(nj6.f275296d.E("BizTimeLineInfo", null, "orderFlag>=?", new java.lang.String[]{"" + (j17 << 32)}, null, null, "orderFlag DESC"))) {
                    i18 += s1Var.v0() ? 1 : 0;
                    i19 += s1Var.A0() ? 1 : 0;
                }
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                r45.zl5 zl5Var = new r45.zl5();
                zl5Var.f473731d = linkedList;
                zl5Var.f473732e = i18;
                zl5Var.f473733f = i19;
                lVar.f152197a = zl5Var;
                lVar.f152198b = new r45.am5();
                lVar.f152199c = "/cgi-bin/mmbiz-bin/timeline/recyclecardreport";
                lVar.f152200d = 4768;
                com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new com.p314xaae8f345.mm.p2621x8fb0427b.n1(linkedList, 0), false);
            }
        }
        return jz5.f0.f384359a;
    }
}
