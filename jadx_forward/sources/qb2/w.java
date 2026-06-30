package qb2;

/* loaded from: classes10.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f442835d;

    public w(java.util.List list) {
        this.f442835d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String m75945x2fec8307;
        java.util.List<qb2.t> list = this.f442835d;
        java.util.ArrayList<r45.lz0> arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (qb2.t tVar : list) {
            r45.lz0 lz0Var = new r45.lz0();
            lz0Var.set(0, tVar.f65868x114ef53e);
            lz0Var.set(1, tVar.f65866xbed8694c);
            arrayList.add(lz0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209321k9).mo141623x754a37bb()).r()).booleanValue()) {
            new db2.p4(new java.util.LinkedList(arrayList)).l();
            return;
        }
        for (r45.lz0 lz0Var2 : arrayList) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(lz0Var2.m75945x2fec8307(0))) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                m75945x2fec8307 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a.h(lz0Var2.m75945x2fec8307(0));
            } else {
                m75945x2fec8307 = lz0Var2.m75945x2fec8307(0);
            }
            zy2.dc fj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).fj(m75945x2fec8307);
            if (!(fj6 instanceof ya2.b2)) {
                fj6 = null;
            }
            ya2.b2 b2Var = fj6 != null ? (ya2.b2) fj6 : null;
            if (b2Var != null) {
                r45.zl1 zl1Var = new r45.zl1();
                zl1Var.set(0, new java.util.LinkedList());
                java.util.LinkedList m75941xfb821914 = zl1Var.m75941xfb821914(0);
                r45.yl1 yl1Var = new r45.yl1();
                yl1Var.set(0, 2);
                yl1Var.set(2, 1);
                m75941xfb821914.add(yl1Var);
                java.util.LinkedList m75941xfb8219142 = zl1Var.m75941xfb821914(0);
                r45.yl1 yl1Var2 = new r45.yl1();
                yl1Var2.set(0, 4);
                yl1Var2.set(2, 1);
                yl1Var2.set(4, "测试");
                m75941xfb8219142.add(yl1Var2);
                b2Var.f69302xb21664aa = zl1Var;
                b2Var.f69339x744b360c = 2000L;
                b2Var.f69316x722c2 = 12L;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).oj(b2Var);
            }
        }
    }
}
