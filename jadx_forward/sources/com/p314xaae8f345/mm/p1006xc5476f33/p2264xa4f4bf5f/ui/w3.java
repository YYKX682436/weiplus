package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes8.dex */
public final class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e4 f255933d;

    public w3(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e4 e4Var) {
        this.f255933d = e4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/StatusMuteButtonHelper$attachTo$iv$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e4 e4Var = this.f255933d;
        boolean z17 = !e4Var.f255370k;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusMuteButtonHelper", "onToggle: showingMuted " + e4Var.f255370k + " -> " + z17);
        e4Var.c(z17);
        yz5.l lVar = e4Var.f255372m;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(z17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/StatusMuteButtonHelper$attachTo$iv$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
