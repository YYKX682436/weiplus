package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class bx extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f187951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar) {
        super(0);
        this.f187951d = pzVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        boolean a17 = hc2.e.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187951d.U, "PersonalizedUpdate " + a17);
        int i18 = 0;
        if (a17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f187951d;
            int i19 = pzVar.f190295p;
            if (i19 == 4 || i19 == 1 || i19 == 3) {
                hb2.q qVar = hb2.q.f361615e;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = pzVar.f190288g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = pzVar.f190292m;
                if (qVar.o(abstractActivityC21394xb3d2c0cf, ctVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).l() : null, pzVar.C.m56388xcaeb60d0(), pzVar.f190312z1, pzVar.f190295p)) {
                    pzVar.f190310y1 = true;
                }
                this.f187951d.C.f189200z = false;
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar2 = this.f187951d;
            pzVar2.f190310y1 = false;
            pzVar2.C.f189185h.f332361p = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar3 = this.f187951d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56387xe6796cde = pzVar3.C.m56387xe6796cde();
            long j17 = pzVar3.G1;
            if (j17 != 0) {
                java.util.Iterator it = m56387xe6796cde.iterator();
                i17 = 0;
                while (it.hasNext()) {
                    if (((so2.j5) it.next()).mo2128x1ed62e84() == j17) {
                        break;
                    }
                    i17++;
                }
            }
            i17 = -1;
            int i27 = i17 + 1;
            int size = m56387xe6796cde.size();
            if (i17 != -1 && i27 < size && size > 1) {
                java.util.List subList = m56387xe6796cde.subList(i27, m56387xe6796cde.size());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
                i18 = subList.size();
                subList.clear();
                in5.n0 T0 = pzVar3.T0();
                if (T0 != null) {
                    T0.m8154xdb81fc7f(i27, i18);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pzVar3.U, "removeUnreadFeed currentId " + j17 + " findIndex " + i17 + " removeSize " + i18 + " dataSize " + size);
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f187951d.f190288g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.class)).l7();
        return jz5.f0.f384359a;
    }
}
