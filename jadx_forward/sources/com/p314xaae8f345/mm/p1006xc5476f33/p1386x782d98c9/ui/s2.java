package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public final class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13467x6324ae0d f181189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.r2 f181190e;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13467x6324ae0d activityC13467x6324ae0d, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.r2 r2Var) {
        this.f181189d = activityC13467x6324ae0d;
        this.f181190e = r2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI$FollowItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13467x6324ae0d activityC13467x6324ae0d = this.f181189d;
        android.content.Intent intent = new android.content.Intent(activityC13467x6324ae0d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714.class);
        intent.putExtra(dm.i4.f66875xa013b0d5, this.f181190e.f181172e.f454538e);
        activityC13467x6324ae0d.startActivityForResult(intent, activityC13467x6324ae0d.f180814n);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI$FollowItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
