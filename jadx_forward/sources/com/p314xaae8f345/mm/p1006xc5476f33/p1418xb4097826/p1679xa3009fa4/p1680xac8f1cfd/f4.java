package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes5.dex */
public final class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4 f215861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f215862e;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4 q4Var, android.view.View view) {
        this.f215861d = q4Var;
        this.f215862e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBaseCreateAccountHalfScreenUIC$initView$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4 q4Var = this.f215861d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = q4Var.f217191d;
        android.widget.CheckBox checkBox = (y1Var == null || (view2 = y1Var.f293560f) == null) ? null : (android.widget.CheckBox) view2.findViewById(com.p314xaae8f345.mm.R.id.g4b);
        if (checkBox != null) {
            checkBox.setChecked(!checkBox.isChecked());
        }
        this.f215862e.setContentDescription(checkBox != null && checkBox.isChecked() ? q4Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_) : q4Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571376db));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBaseCreateAccountHalfScreenUIC$initView$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
