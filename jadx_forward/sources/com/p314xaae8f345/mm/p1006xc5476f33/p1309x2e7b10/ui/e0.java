package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class e0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 f176519a;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var) {
        this.f176519a = b0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        tt1.j jVar;
        android.view.ViewGroup viewGroup;
        java.lang.Object obj = message.obj;
        if (obj == null || !(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r0)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r0) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q0 q0Var = r0Var.f176675a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q0 q0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q0.onGetCodeFail;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var = this.f176519a;
        if (q0Var == q0Var2) {
            if (b0Var.f176477p != null) {
                lu1.r.e(b0Var.f176469e, r0Var.f176676b, false);
                ku1.i iVar = b0Var.f176477p;
                ku1.l0 l0Var = iVar.f393632h;
                if (l0Var == null || (jVar = iVar.f393628d) == null || (viewGroup = iVar.f393631g) == null) {
                    return;
                }
                l0Var.b(viewGroup, jVar);
                return;
            }
            return;
        }
        if (q0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q0.onShowTimeExpired) {
            ku1.i iVar2 = b0Var.f176477p;
            if (iVar2 != null) {
                iVar2.l(lu1.e.CARDCODEREFRESHACTION_SHOWING_TIMEOUT);
                return;
            }
            return;
        }
        ku1.i iVar3 = b0Var.f176477p;
        if (iVar3 != null) {
            iVar3.l(r0Var.f176677c);
        }
    }
}
