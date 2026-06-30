package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class zc implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea f146261d;

    public zc(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea activityC10372xd653ffea) {
        this.f146261d = activityC10372xd653ffea;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SelectMemberUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea activityC10372xd653ffea = this.f146261d;
        if (activityC10372xd653ffea.f145504d.getAdapter() == activityC10372xd653ffea.f145509i) {
            activityC10372xd653ffea.a7(view, i17, j17);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
