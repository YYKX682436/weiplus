package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 f256973d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var) {
        this.f256973d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = this.f256973d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e eVar = v0Var.f257012f;
        eVar.f256933x = 1;
        v0Var.P = true;
        if (v0Var.I) {
            v0Var.I = false;
            eVar.f256931v = 0;
            eVar.f256927r = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.c cVar = v0Var.f257027w;
            if (cVar != null) {
                cVar.a(false, true);
            }
            android.view.View view2 = v0Var.f257019p;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$4$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$4$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = v0Var.L;
            if (n3Var != null) {
                n3Var.mo50303x856b99f0(5000);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = v0Var.H;
            if (b4Var != null) {
                b4Var.d();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = v0Var.f257017n;
            if (c22621x7603e017 != null) {
                c22621x7603e017.setText(v0Var.f257029x0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
