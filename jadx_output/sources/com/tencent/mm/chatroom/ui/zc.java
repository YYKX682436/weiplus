package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class zc implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectMemberUI f64728d;

    public zc(com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI) {
        this.f64728d = selectMemberUI;
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
        com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI = this.f64728d;
        if (selectMemberUI.f63971d.getAdapter() == selectMemberUI.f63976i) {
            selectMemberUI.a7(view, i17, j17);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
