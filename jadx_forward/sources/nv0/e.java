package nv0;

/* loaded from: classes5.dex */
public interface e {
    static boolean a(nv0.e eVar, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k panelUIC, java.util.Map map, zw0.e eVar2, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.m mVar, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.o oVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openPanel");
        }
        java.util.Map map2 = (i17 & 2) != 0 ? null : map;
        zw0.e panelEntrance = (i17 & 4) != 0 ? new zw0.e(zw0.b.f558084e, zw0.d.f558094f) : eVar2;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.m mVar2 = (i17 & 8) != 0 ? null : mVar;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.o oVar2 = (i17 & 16) != 0 ? null : oVar;
        boolean z18 = (i17 & 32) != 0 ? true : z17;
        nv0.b bVar = (nv0.b) eVar;
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelUIC, "panelUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelEntrance, "panelEntrance");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6 = panelUIC.f150773i;
        if (abstractC10936x89d53ec6 == null) {
            abstractC10936x89d53ec6 = panelUIC.Y6();
            panelUIC.f150773i = abstractC10936x89d53ec6;
        }
        if (map2 != null) {
            abstractC10936x89d53ec6.m47070xe26dab14(map2);
        }
        android.widget.FrameLayout frameLayout = panelUIC.f324880d;
        if (frameLayout != null) {
            return bVar.d(abstractC10936x89d53ec6, frameLayout, panelEntrance, mVar2, oVar2, panelUIC, z18);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("movieComposingPanelContainer");
        throw null;
    }

    static boolean b(nv0.e eVar, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 panel, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closePanel");
        }
        boolean z19 = (i17 & 2) != 0 ? true : z17;
        boolean z27 = (i17 & 4) != 0 ? true : z18;
        nv0.b bVar = (nv0.b) eVar;
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("closePanel: ----> stack ");
        kz5.q qVar = bVar.f421957a;
        sb6.append(qVar.f395533f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DefaultPanelNavigation", sb6.toString());
        if (!qVar.isEmpty()) {
            if (!qVar.contains(panel)) {
                kz5.n0.g0(bVar.f421957a, null, null, null, 0, null, nv0.a.f421956d, 31, null);
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            } else if (panel.getF150738e() != com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150780i) {
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p f150738e = panel.getF150738e();
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p pVar = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150778g;
                if (f150738e == pVar) {
                    panel.animate().cancel();
                    panel.f150745o.animate().cancel();
                    panel.clearAnimation();
                    if (panel.getF150738e() == pVar) {
                        panel.A(false, true, new zw0.e(panel.m47060xff04c82c(), panel.mo47067x3a90fbd6()));
                    }
                }
                if (panel.getF150738e() == com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150779h) {
                    boolean z28 = true;
                    while (z28) {
                        z28 = ((nv0.b) panel.m47059x78645ef2()).e(false);
                    }
                    com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6.f(panel, z19, z27, null, 4, null);
                    qVar.remove(panel);
                    return true;
                }
                java.util.Objects.toString(panel.getF150738e());
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
        }
        return false;
    }

    static /* synthetic */ boolean c(nv0.e eVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popupPanel");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        return ((nv0.b) eVar).e(z17);
    }
}
