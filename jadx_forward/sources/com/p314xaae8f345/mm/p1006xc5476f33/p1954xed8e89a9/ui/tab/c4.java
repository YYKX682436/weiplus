package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 f235796d;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var) {
        this.f235796d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.c1 c1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.u0) this.f235796d.f236082c).f236136a.U;
        if (c1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[PhotoAccountGuide] action button clicked, biz=");
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.f5) c1Var).f235846a;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = c16892x4a36dc90.f235739n;
            sb6.append(z3Var != null ? z3Var.d1() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", sb6.toString());
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.g.f299275b.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.o5(new java.lang.ref.WeakReference(c16892x4a36dc90)));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
