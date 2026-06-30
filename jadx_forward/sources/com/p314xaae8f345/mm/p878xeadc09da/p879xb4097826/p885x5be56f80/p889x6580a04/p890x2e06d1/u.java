package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1;

/* loaded from: classes5.dex */
public final class u implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.y f150789d;

    public u(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.y yVar) {
        this.f150789d = yVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        ov0.e m157204x661a2673;
        int m47101x9918f4e4;
        int m47101x9918f4e42;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.y yVar = this.f150789d;
        yVar.m47101x9918f4e4();
        int i18 = yVar.B;
        if (yVar.F == i17) {
            return;
        }
        yVar.F = i17;
        boolean z18 = i17 > 0;
        if (i17 > 0) {
            m47101x9918f4e4 = yVar.m47101x9918f4e4();
            if (m47101x9918f4e4 != i17 && i17 >= yVar.B) {
                m47101x9918f4e42 = yVar.m47101x9918f4e4();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.k(yVar.getContext(), i17);
                yVar.D(yVar.m47105xecc3a569(), i17 - m47101x9918f4e42);
            }
        }
        if (yVar.E != com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.s.f150785d) {
            yVar.getClass();
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.t tVar = yVar.D;
            if (tVar != null) {
                ov0.i0 i0Var = ((ov0.u) tVar).f430686a;
                ov0.t tVar2 = (ov0.t) i0Var.f150773i;
                if (tVar2 != null && (m157204x661a2673 = tVar2.m157204x661a2673()) != null && m157204x661a2673 == ov0.e.f430658e && !z18) {
                    com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.U6(i0Var, false, 1, null);
                }
            }
        }
        yVar.E = z18 ? com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.s.f150786e : com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.s.f150787f;
    }
}
