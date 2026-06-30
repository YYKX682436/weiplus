package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class m3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.t3 f207306d;

    public m3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.t3 t3Var) {
        this.f207306d = t3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$MixSearchProfileAdapter$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca c14951x18cbc2ca = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca) this.f207306d.f207391e;
        c14951x18cbc2ca.getClass();
        android.content.Intent intent = new android.content.Intent();
        r45.b31 b31Var = new r45.b31();
        b31Var.set(6, c14951x18cbc2ca.f207099e);
        b31Var.set(0, c14951x18cbc2ca.f207101g);
        b31Var.set(1, java.lang.Integer.valueOf(c14951x18cbc2ca.f207102h));
        b31Var.set(2, 1);
        b31Var.set(4, c14951x18cbc2ca.f207103i);
        java.util.ArrayList arrayList2 = c14951x18cbc2ca.f207104m;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(java.lang.Boolean.valueOf(b31Var.m75941xfb821914(7).add((r45.mu2) it.next())));
        }
        int i17 = c14951x18cbc2ca.f207109r;
        try {
            if (i17 == 13) {
                intent.putExtra("request_type", 17);
            } else {
                intent.putExtra("request_type", 1);
            }
            intent.putExtra("is_force_night_mode", i17 == 13);
        } catch (java.lang.Exception unused) {
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).oj(c14951x18cbc2ca.f207100f, b31Var, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$MixSearchProfileAdapter$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
