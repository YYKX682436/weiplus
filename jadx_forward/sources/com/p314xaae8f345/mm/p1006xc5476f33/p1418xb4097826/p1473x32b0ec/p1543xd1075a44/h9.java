package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class h9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f200088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 f200089e;

    public h9(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 x9Var) {
        this.f200088d = context;
        this.f200089e = x9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f200088d;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_SOURCE", 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 x9Var = this.f200089e;
            intent.putExtra("KEY_REPORT_TO_SVR_SCENE", x9Var.f201837J.m75939xb282bd08(3));
            intent.putExtra("KEY_REPORT_TO_SVR_TS", c01.id.a() - x9Var.f201837J.m75942xfb822ef2(4));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).Gj(activity, intent, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
