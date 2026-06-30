package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class jy extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be f188683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f188684e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar) {
        super(0);
        this.f188683d = c5560x6f070be;
        this.f188684e = pzVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        in5.n0 T0;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be = this.f188683d;
        am.zd zdVar = c5560x6f070be.f135879g;
        int i17 = zdVar.f90085b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f188684e;
        if (i17 == 2 && pzVar.f190295p == 3) {
            java.lang.String finderUser = zdVar.f90084a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderUser, "finderUser");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz.L0(pzVar, finderUser);
        }
        am.zd zdVar2 = c5560x6f070be.f135879g;
        int i18 = zdVar2.f90088e;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = pzVar.f190288g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (i18 != ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6().m75939xb282bd08(5)) {
            java.lang.String finderUser2 = zdVar2.f90084a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderUser2, "finderUser");
            java.util.Iterator it = pzVar.C.m56387xe6796cde().iterator();
            int i19 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var = (so2.j5) next;
                if ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59299x6bf53a6c(), finderUser2) && (T0 = pzVar.T0()) != null) {
                    T0.m8148xed6e4d18(i19, new jz5.l(29, 1));
                }
                i19 = i27;
            }
        }
        return jz5.f0.f384359a;
    }
}
