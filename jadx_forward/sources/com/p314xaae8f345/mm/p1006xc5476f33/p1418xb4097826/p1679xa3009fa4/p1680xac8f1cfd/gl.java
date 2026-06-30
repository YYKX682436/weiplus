package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class gl extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca f216071d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca) {
        super(0);
        this.f216071d = c15456x2c452bca;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca = this.f216071d;
        boolean isFinishing = c15456x2c452bca.m158354x19263085().isFinishing();
        boolean isDestroyed = c15456x2c452bca.m158354x19263085().isDestroyed();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeUIC", "initOtherTabFragment: isActivityFinishing=" + isFinishing + " isActivityDestroyed=" + isDestroyed);
        if (!isFinishing && !isDestroyed) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 m63052x8f02c6c = c15456x2c452bca.m63052x8f02c6c();
            cq.k1.a();
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Wg).mo141623x754a37bb()).r()).booleanValue()) {
                java.util.ArrayList fragments = c15456x2c452bca.getFragments();
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : fragments) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) obj;
                    if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(abstractC15124x7bae6180, m63052x8f02c6c) || (abstractC15124x7bae6180 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15125x3dfd503d)) ? false : true) {
                        arrayList.add(obj);
                    }
                }
            } else {
                java.util.ArrayList fragments2 = c15456x2c452bca.getFragments();
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : fragments2) {
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) obj2, m63052x8f02c6c)) {
                        arrayList.add(obj2);
                    }
                }
            }
            p012xc85e97e9.p114xa324943e.p115xd1075a44.a m8299xf939df19 = c15456x2c452bca.X6().f516230b.m8299xf939df19();
            tw2.f fVar = m8299xf939df19 instanceof tw2.f ? (tw2.f) m8299xf939df19 : null;
            if (fVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFragmentPagerAdapter", "setFragmentMaxLifeToResume: fragmentSize=" + arrayList.size());
                if (!arrayList.isEmpty()) {
                    p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = fVar.f504000i;
                    if (abstractC1104xc1ad431d.m7690x7328e940()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderFragmentPagerAdapter", "setFragmentMaxLifeToResume: fragmentManager is save state");
                    } else {
                        try {
                            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = abstractC1104xc1ad431d.m7630xb2c12e75();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
                            for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : arrayList) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append("setFragmentMaxLifeToResume: tabType=");
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae61802 = componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) componentCallbacksC1101xa17d4670 : null;
                                sb6.append(abstractC15124x7bae61802 != null ? java.lang.Integer.valueOf(abstractC15124x7bae61802.f210798p) : null);
                                sb6.append(", attachedFragmentManager=");
                                sb6.append(componentCallbacksC1101xa17d4670.m7446xe17c5d07());
                                sb6.append(", currentFragmentManager=");
                                sb6.append(abstractC1104xc1ad431d);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFragmentPagerAdapter", sb6.toString());
                                m7630xb2c12e75.m(componentCallbacksC1101xa17d4670, p012xc85e97e9.p093xedfae76a.n.RESUMED);
                            }
                            m7630xb2c12e75.d();
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderFragmentPagerAdapter", th6, "setFragmentMaxLifeToResume: ", new java.lang.Object[0]);
                            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.O6(c15456x2c452bca);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.Q6(c15456x2c452bca);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.P6(c15456x2c452bca);
        }
        return jz5.f0.f384359a;
    }
}
