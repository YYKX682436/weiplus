package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class id implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.kd f145769d;

    public id(com.p314xaae8f345.mm.p648x55baa833.ui.kd kdVar) {
        this.f145769d = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f145769d.f145825o.a7(view, ((com.p314xaae8f345.mm.p648x55baa833.ui.ld) view.getTag()).f145854i, view.getId());
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
