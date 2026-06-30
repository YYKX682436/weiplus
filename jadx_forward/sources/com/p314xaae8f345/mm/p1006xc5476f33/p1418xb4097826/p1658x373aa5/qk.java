package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class qk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15346x1cf713c4 f214433d;

    public qk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15346x1cf713c4 c15346x1cf713c4) {
        this.f214433d = c15346x1cf713c4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderSnsHeaderView$refreshClearBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15346x1cf713c4 c15346x1cf713c4 = this.f214433d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(c15346x1cf713c4.getContext(), 1, true);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ok(1, c15346x1cf713c4, 2);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pk(1, c15346x1cf713c4, 2);
        k0Var.v();
        java.util.ArrayList a17 = c15346x1cf713c4.m62374xc879b3f2().a(so2.j1.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",1,");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            r45.nw1 m76794xd0557130 = ((so2.j1) it.next()).f491972d.m76794xd0557130();
            arrayList2.add(java.lang.Long.valueOf(m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : 0L));
        }
        sb6.append(kz5.n0.g0(arrayList2, ";", null, null, 0, null, null, 62, null));
        sb6.append(',');
        sb6.append(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(21530, sb6.toString());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderSnsHeaderView$refreshClearBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
