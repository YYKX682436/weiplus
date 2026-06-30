package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class id implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.kd f64236d;

    public id(com.tencent.mm.chatroom.ui.kd kdVar) {
        this.f64236d = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f64236d.f64292o.a7(view, ((com.tencent.mm.chatroom.ui.ld) view.getTag()).f64321i, view.getId());
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
