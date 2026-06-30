package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class n3 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.o3 f234215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.o3 o3Var) {
        super(false);
        this.f234215d = o3Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.o3 o3Var = this.f234215d;
        o3Var.f234222g.f234033b2 = false;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7056xe1fb940b c7056xe1fb940b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7056xe1fb940b();
        c7056xe1fb940b.f143654d = 3L;
        c7056xe1fb940b.k();
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(20);
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = o3Var.f234222g;
        int i17 = activityC16764xd1ab6b38.A1;
        if (i17 == 1) {
            tw3.b.f504012a = 1;
        } else if (i17 != 2) {
            tw3.b.f504012a = 0;
        } else {
            tw3.b.f504012a = 21;
        }
        if (activityC16764xd1ab6b38.W1) {
            j45.l.h(activityC16764xd1ab6b38.mo55332x76847179(), "remittance", ".mobile.ui.BankMobileRemittanceChooseUI");
        } else {
            if (((h45.q) i95.n0.c(h45.q.class)).mo24852xdf2d02ae(null, null)) {
                return;
            }
            j45.l.h(activityC16764xd1ab6b38.mo55332x76847179(), "remittance", ".bankcard.ui.BankRemitBankcardInputUI");
        }
    }
}
