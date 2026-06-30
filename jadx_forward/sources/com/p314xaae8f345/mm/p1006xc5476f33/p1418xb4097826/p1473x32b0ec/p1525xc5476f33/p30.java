package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class p30 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30 f195359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f195360e;

    public p30(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30 r30Var, android.view.ViewGroup viewGroup) {
        this.f195359d = r30Var;
        this.f195360e = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30 r30Var = this.f195359d;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30.t1(r30Var)) {
            r30Var.u1();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        r45.qc6 qc6Var = ((mm2.c1) r30Var.P0(mm2.c1.class)).Q;
        boolean z17 = qc6Var != null && qc6Var.m75939xb282bd08(3) == 1;
        android.view.ViewGroup viewGroup = this.f195360e;
        if (!z17) {
            df2.ar arVar = (df2.ar) r30Var.U0(df2.ar.class);
            if (arVar != null && arVar.f7()) {
                db5.t7.m(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nwt));
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30 r30Var2 = this.f195359d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(r30Var2, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o30(viewGroup, r30Var2, null), 3, null);
                r30Var.u1();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        r45.qc6 qc6Var2 = ((mm2.c1) r30Var.P0(mm2.c1.class)).Q;
        if (qc6Var2 != null && (m75945x2fec8307 = qc6Var2.m75945x2fec8307(4)) != null) {
            java.lang.String str = m75945x2fec8307.length() == 0 ? m75945x2fec8307 : null;
            if (str != null) {
                android.content.Context context = viewGroup.getContext();
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = str;
                e4Var.c();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
