package com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad;

/* loaded from: classes8.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d f295196d;

    public j(com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar) {
        this.f295196d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/manager/SmileyPanelManager$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 v9Var = this.f295196d.C;
        if (v9Var != null) {
            v9Var.c();
        }
        yj0.a.h(this, "com/tencent/mm/view/manager/SmileyPanelManager$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
