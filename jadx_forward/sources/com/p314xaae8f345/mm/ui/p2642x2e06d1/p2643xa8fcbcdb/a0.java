package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes11.dex */
public class a0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b f279324d;

    public a0(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b abstractActivityC21555x39071a9b) {
        this.f279324d = abstractActivityC21555x39071a9b;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/preference/MMPreference$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) adapterView.getAdapter().getItem(i17);
        if (c21560x1fce98fb == null) {
            yj0.a.h(this, "com/tencent/mm/ui/base/preference/MMPreference$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (c21560x1fce98fb.r() && c21560x1fce98fb.f279316t) {
            if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) {
                yj0.a.h(this, "com/tencent/mm/ui/base/preference/MMPreference$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21544x57e6e063) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21544x57e6e063 c21544x57e6e063 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21544x57e6e063) c21560x1fce98fb;
                c21544x57e6e063.M();
                c21544x57e6e063.N = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.y(this, c21544x57e6e063, c21560x1fce98fb);
            }
            if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5 c21545xcb424ea5 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5) c21560x1fce98fb;
                c21545xcb424ea5.M();
                c21545xcb424ea5.M = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.z(this, c21545xcb424ea5, c21560x1fce98fb);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b abstractActivityC21555x39071a9b = this.f279324d;
            h0Var = abstractActivityC21555x39071a9b.f39403xbb6ca34f;
            abstractActivityC21555x39071a9b.mo69080x80434d2e(h0Var, c21560x1fce98fb);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/preference/MMPreference$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
