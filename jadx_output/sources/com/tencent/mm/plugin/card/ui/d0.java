package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class d0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.b0 f94974d;

    public d0(com.tencent.mm.plugin.card.ui.b0 b0Var) {
        this.f94974d = b0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.card.ui.s0 s0Var = this.f94974d.T;
        if (s0Var != null) {
            int i18 = com.tencent.mm.plugin.card.ui.CardDetailUI.S;
            ((com.tencent.mm.plugin.card.ui.q) s0Var).f95124a.x();
        }
    }
}
