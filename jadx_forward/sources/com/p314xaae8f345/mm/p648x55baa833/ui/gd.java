package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class gd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f145722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ld f145723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.kd f145724f;

    public gd(com.p314xaae8f345.mm.p648x55baa833.ui.kd kdVar, android.view.View view, com.p314xaae8f345.mm.p648x55baa833.ui.ld ldVar) {
        this.f145724f = kdVar;
        this.f145722d = view;
        this.f145723e = ldVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.p314xaae8f345.mm.p648x55baa833.ui.kd kdVar = this.f145724f;
        com.p314xaae8f345.mm.p648x55baa833.ui.bd item = kdVar.getItem(intValue);
        if (item == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectMemberAdapter", "item is null");
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea activityC10372xd653ffea = kdVar.f145825o;
        android.view.View view2 = this.f145722d;
        com.p314xaae8f345.mm.p648x55baa833.ui.ld ldVar = this.f145723e;
        activityC10372xd653ffea.b7(view2, ldVar.f145852g, ldVar.f145850e, intValue, item.f145592a.d1());
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
