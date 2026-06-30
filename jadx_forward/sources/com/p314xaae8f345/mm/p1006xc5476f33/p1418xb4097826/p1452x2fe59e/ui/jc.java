package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class jc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14030x53172658 f191721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f191722e;

    public jc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14030x53172658 activityC14030x53172658, int i17) {
        this.f191721d = activityC14030x53172658;
        this.f191722e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveRemindConsumeWecoinUI$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14030x53172658 activityC14030x53172658 = this.f191721d;
        int i17 = 0;
        for (java.lang.Object obj : activityC14030x53172658.f190942v) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.lc) obj).f191801b = i17 == this.f191722e;
            i17 = i18;
        }
        activityC14030x53172658.f190943w.m8146xced61ae5();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveRemindConsumeWecoinUI$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
