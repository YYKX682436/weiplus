package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 f257040d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var) {
        this.f257040d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransVoiceDialog", "sendVoiceMsg onClick.");
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = this.f257040d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.y yVar = v0Var.f257031y0;
        boolean z17 = false;
        if (yVar != null) {
            java.lang.String str = v0Var.D;
            java.lang.Long valueOf = java.lang.Long.valueOf(v0Var.C);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m2 m2Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m2) yVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "onVoiceMsgSend, fileName: %s.", str);
            int intValue = valueOf != null ? valueOf.intValue() : 0;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = m2Var.f272015a;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5 k5Var = c19666xfd6e2f33.f271623x0;
            if (true == (k5Var != null ? k5Var.p(str, intValue, c19666xfd6e2f33.m75464x9cdec029()) : false)) {
                z17 = true;
            }
        }
        if (z17) {
            v0Var.E = true;
        }
        v0Var.K(7);
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
