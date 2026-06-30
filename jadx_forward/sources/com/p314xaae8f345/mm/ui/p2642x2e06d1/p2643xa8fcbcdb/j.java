package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes11.dex */
public class j implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21544x57e6e063 f279365d;

    public j(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21544x57e6e063 c21544x57e6e063) {
        this.f279365d = c21544x57e6e063;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/preference/DialogPreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21544x57e6e063 c21544x57e6e063 = this.f279365d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = c21544x57e6e063.P;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.i iVar = c21544x57e6e063.L;
        java.lang.String str = (java.lang.String) iVar.f279361g[i17];
        iVar.f279362h = str;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.k kVar = c21544x57e6e063.N;
        if (kVar != null) {
            kVar.a(true);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 q0Var = c21544x57e6e063.M;
        if (q0Var != null) {
            q0Var.a(c21544x57e6e063, iVar.f279362h);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/preference/DialogPreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
