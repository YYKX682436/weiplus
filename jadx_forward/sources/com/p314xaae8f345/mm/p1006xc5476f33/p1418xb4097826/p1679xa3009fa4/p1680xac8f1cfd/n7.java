package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class n7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o7 f216797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o7 o7Var) {
        super(1);
        this.f216797d = o7Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar == null || (i17 = fVar.f152148a) != 0 || i17 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f m63203x96811f7a = this.f216797d.m63203x96811f7a();
            m63203x96811f7a.e(false);
            return m63203x96811f7a;
        }
        this.f216797d.f216966i = ((r45.f51) fVar.f152151d).m75934xbce7f2f(4);
        this.f216797d.f216967m = ((r45.f51) fVar.f152151d).m75939xb282bd08(3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f216797d.f216968n, "request CgiFinderGetCollectionWatchingList success, data: " + ((r45.f51) fVar.f152151d).m75941xfb821914(1).size() + ", lastBuffer: " + this.f216797d.f216966i + ", continueFlage: " + this.f216797d.f216967m);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o7 o7Var = this.f216797d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
        o7Var.getClass();
        java.util.LinkedList<r45.zx0> m75941xfb821914 = ((r45.f51) resp).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCollection_watching_info(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (r45.zx0 zx0Var : m75941xfb821914) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zx0Var);
            arrayList.add(new so2.j0(zx0Var));
        }
        int size = this.f216797d.f216964g.size();
        this.f216797d.f216964g.addAll(arrayList);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f216797d.f216963f;
        if (c22848x6ddd90cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        c22848x6ddd90cf.m8153xd399a4d9(size, arrayList.size());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o7 o7Var2 = this.f216797d;
        o7Var2.m63203x96811f7a().e(true);
        if (o7Var2.f216967m == 0) {
            o7Var2.m63203x96811f7a().E(true);
        }
        return jz5.f0.f384359a;
    }
}
