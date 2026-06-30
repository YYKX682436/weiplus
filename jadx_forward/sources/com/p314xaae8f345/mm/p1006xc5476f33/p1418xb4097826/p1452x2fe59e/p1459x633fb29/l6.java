package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class l6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5464x5322afbe f189687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91 f189688e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5464x5322afbe c5464x5322afbe, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91 c13885xb1569e91) {
        super(0);
        this.f189687d = c5464x5322afbe;
        this.f189688e = c13885xb1569e91;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5464x5322afbe c5464x5322afbe = this.f189687d;
        if (c5464x5322afbe != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91 c13885xb1569e91 = this.f189688e;
            am.ab abVar = c5464x5322afbe.f135803g;
            int i17 = abVar.f87677a;
            if (i17 == 100) {
                long j17 = abVar.f87678b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13885xb1569e91.getF204960d(), "add localId: " + j17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 D0 = ((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(j17);
                if (D0 == null) {
                    i95.m c17 = i95.n0.c(cq.k.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    java.util.List a17 = cq.n1.a((cq.k) c17, pm0.v.u(j17), java.lang.Boolean.FALSE);
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
                    java.util.Iterator it = a17.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80.N.a((ni0.h) it.next()));
                    }
                    D0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80) kz5.n0.Z(arrayList);
                }
                if (D0 != null && (c13885xb1569e91.f189114e || !D0.t0().m59315x31740422())) {
                    new java.util.ArrayList();
                    c13885xb1569e91.m56388xcaeb60d0().add(0, new so2.k0(D0));
                    c13885xb1569e91.getDispatcher().a();
                }
            } else if (i17 == 110) {
                long j18 = abVar.f87678b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13885xb1569e91.getF204960d(), "del localId: " + j18);
                java.util.Iterator it6 = c13885xb1569e91.m56387xe6796cde().iterator();
                int i18 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i18 = -1;
                        break;
                    }
                    if (((so2.j5) it6.next()).mo2128x1ed62e84() == j18) {
                        break;
                    }
                    i18++;
                }
                if (i18 != -1) {
                    java.lang.Object remove = c13885xb1569e91.m56387xe6796cde().remove(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remove, "removeAt(...)");
                    c13885xb1569e91.getDispatcher().a();
                    if (c13885xb1569e91.m56387xe6796cde().size() == 0) {
                        c13885xb1569e91.f189117h = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f6.f189390e;
                        yz5.a aVar = c13885xb1569e91.f189116g;
                        if (aVar != null) {
                            aVar.mo152xb9724478();
                        }
                    }
                }
            } else if (i17 == 112) {
                long j19 = abVar.f87678b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13885xb1569e91.getF204960d(), "mod localId: " + j19);
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91.f189112o;
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o6(c13885xb1569e91, j19, true));
            }
        }
        return jz5.f0.f384359a;
    }
}
