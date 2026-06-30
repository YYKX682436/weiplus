package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class b4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16703x9178fa1f f233319d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16703x9178fa1f c16703x9178fa1f) {
        super(1);
        this.f233319d = c16703x9178fa1f;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar != null ? fVar.f152148a : 0;
        int i18 = fVar != null ? fVar.f152149b : 0;
        r45.tu2 tu2Var = fVar != null ? (r45.tu2) fVar.f152151d : null;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16703x9178fa1f c16703x9178fa1f = this.f233319d;
        c16703x9178fa1f.getClass();
        if (i17 == 0 && i18 == 0) {
            c16703x9178fa1f.f233265x = tu2Var != null ? tu2Var.m75934xbce7f2f(5) : null;
            if (tu2Var != null) {
                c16703x9178fa1f.f233264w = tu2Var.m75939xb282bd08(2);
                c16703x9178fa1f.m67361xdac5ee4d(tu2Var.m75939xb282bd08(3) != 0);
                java.util.Iterator it = tu2Var.m75941xfb821914(4).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next();
                    if (c19792x256d2725 != null) {
                        jm3.h1.f381855a.a(c19792x256d2725);
                        long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
                        java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
                        if (!c16703x9178fa1f.m67348x9c35b48d().contains(java.lang.Long.valueOf(m76784x5db1b11))) {
                            c16703x9178fa1f.m67345xe6796cde().add(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.q3(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t3(m76784x5db1b11, m76803x6c285d75, c19792x256d2725, false, 8, null)));
                        }
                    }
                }
                c16703x9178fa1f.m67343xf939df19().m8146xced61ae5();
                yz5.a onSceneEndListener = c16703x9178fa1f.getOnSceneEndListener();
                if (onSceneEndListener != null) {
                    onSceneEndListener.mo152xb9724478();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvTabFragment", "onSceneEnd BGFinderFeed " + c16703x9178fa1f.m67345xe6796cde().size());
            }
        }
        c16703x9178fa1f.m67356x96811f7a().N(0);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.p3 resultListener = c16703x9178fa1f.getResultListener();
        if (resultListener != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.h0) resultListener).a(4, c16703x9178fa1f.m67343xf939df19().mo1894x7e414b06());
        }
        return jz5.f0.f384359a;
    }
}
