package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class nj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oj f214249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f214250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f214251f;

    public nj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oj ojVar, db5.h4 h4Var, int i17) {
        this.f214249d = ojVar;
        this.f214250e = h4Var;
        this.f214251f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderSelfShareBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        db5.t4 t4Var = this.f214249d.f214326e;
        if (t4Var != null) {
            t4Var.mo888x34063ac(this.f214250e, this.f214251f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderSelfShareBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
