package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class e0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 f256961d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var) {
        this.f256961d = v0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = this.f256961d;
        if (v0Var.W) {
            v0Var.W = false;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v0Var.X)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.y yVar = v0Var.f257031y0;
            if (yVar != null) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m2 m2Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m2) yVar;
                m2Var.f272015a.postDelayed(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.l2(m2Var, v0Var.X), 200L);
            }
            java.lang.String str = v0Var.X;
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.util.List list = v0Var.Z;
            objArr[0] = list != null ? java.lang.Integer.valueOf(list.size()) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransVoiceDialog", "cgiReport size = %s", objArr);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransVoiceDialog", "cgiReport: abTestFlag = [%s]", 0);
            java.util.List list2 = v0Var.Z;
            java.lang.String valueOf = java.lang.String.valueOf(0);
            b31.d dVar = v0Var.Y;
            dVar.getClass();
            gm0.j1.e().j(new b31.c(dVar, new java.util.ArrayList(list2), str, valueOf, 10));
            java.util.List list3 = v0Var.Z;
            if (list3 != null) {
                list3.clear();
            }
        }
    }
}
