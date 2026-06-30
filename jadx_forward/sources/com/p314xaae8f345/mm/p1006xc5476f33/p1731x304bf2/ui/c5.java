package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class c5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.e {
    public c5(android.content.Context context, int i17) {
        super(context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de);
        this.f222902e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1) view.getTag();
            int i17 = e1Var.f68469xc4aab016;
            android.content.Context context = this.f222901d;
            if (i17 == 6) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f221806a2)) {
                    return;
                }
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(this.f222901d, 13, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de, 5, r53.f.v(context, e1Var.f221806a2, null, null), 0, e1Var.f68449x28d45f97, this.f222902e, e1Var.f68469xc4aab016, e1Var.f68458xd54c6aa5, e1Var.T2, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.a(null, null, e1Var.U2, null));
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putCharSequence("game_app_id", e1Var.f68449x28d45f97);
            bundle.putInt("game_report_from_scene", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de);
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(this.f222901d, 13, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de, 5, r53.f.o(context, e1Var.f68449x28d45f97, null, bundle, 0), 0, e1Var.f68449x28d45f97, this.f222902e, e1Var.f68469xc4aab016, e1Var.f68458xd54c6aa5, e1Var.T2, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.a(null, null, e1Var.U2, null));
        }
    }
}
