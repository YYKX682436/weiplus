package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class gd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f64189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ld f64190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.kd f64191f;

    public gd(com.tencent.mm.chatroom.ui.kd kdVar, android.view.View view, com.tencent.mm.chatroom.ui.ld ldVar) {
        this.f64191f = kdVar;
        this.f64189d = view;
        this.f64190e = ldVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.tencent.mm.chatroom.ui.kd kdVar = this.f64191f;
        com.tencent.mm.chatroom.ui.bd item = kdVar.getItem(intValue);
        if (item == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectMemberAdapter", "item is null");
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI = kdVar.f64292o;
        android.view.View view2 = this.f64189d;
        com.tencent.mm.chatroom.ui.ld ldVar = this.f64190e;
        selectMemberUI.b7(view2, ldVar.f64319g, ldVar.f64317e, intValue, item.f64059a.d1());
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
