package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class zo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f215015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.cp f215016e;

    public zo(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.cp cpVar) {
        this.f215015d = view;
        this.f215016e = cpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/GameTeamInputCoinValueBottomPage$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f215015d;
        if (view2 != null && (c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) view2.findViewById(com.p314xaae8f345.mm.R.id.f565317c14)) != null) {
            c22621x7603e017.clearFocus();
            android.content.Context context = view2.getContext();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                abstractActivityC21394xb3d2c0cf.mo53060x36654fab(c22621x7603e017);
            }
        }
        view2.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yo(this.f215016e), 300L);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/GameTeamInputCoinValueBottomPage$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
