package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class e0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.b0 f94986a;

    public e0(com.tencent.mm.plugin.card.ui.b0 b0Var) {
        this.f94986a = b0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        tt1.j jVar;
        android.view.ViewGroup viewGroup;
        java.lang.Object obj = message.obj;
        if (obj == null || !(obj instanceof com.tencent.mm.plugin.card.ui.r0)) {
            return;
        }
        com.tencent.mm.plugin.card.ui.r0 r0Var = (com.tencent.mm.plugin.card.ui.r0) obj;
        com.tencent.mm.plugin.card.ui.q0 q0Var = r0Var.f95142a;
        com.tencent.mm.plugin.card.ui.q0 q0Var2 = com.tencent.mm.plugin.card.ui.q0.onGetCodeFail;
        com.tencent.mm.plugin.card.ui.b0 b0Var = this.f94986a;
        if (q0Var == q0Var2) {
            if (b0Var.f94944p != null) {
                lu1.r.e(b0Var.f94936e, r0Var.f95143b, false);
                ku1.i iVar = b0Var.f94944p;
                ku1.l0 l0Var = iVar.f312099h;
                if (l0Var == null || (jVar = iVar.f312095d) == null || (viewGroup = iVar.f312098g) == null) {
                    return;
                }
                l0Var.b(viewGroup, jVar);
                return;
            }
            return;
        }
        if (q0Var == com.tencent.mm.plugin.card.ui.q0.onShowTimeExpired) {
            ku1.i iVar2 = b0Var.f94944p;
            if (iVar2 != null) {
                iVar2.l(lu1.e.CARDCODEREFRESHACTION_SHOWING_TIMEOUT);
                return;
            }
            return;
        }
        ku1.i iVar3 = b0Var.f94944p;
        if (iVar3 != null) {
            iVar3.l(r0Var.f95144c);
        }
    }
}
