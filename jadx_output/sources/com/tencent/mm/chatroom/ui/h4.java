package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class h4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.LargeTouchableAreasItemView f64199d;

    public h4(com.tencent.mm.chatroom.ui.LargeTouchableAreasItemView largeTouchableAreasItemView) {
        this.f64199d = largeTouchableAreasItemView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/LargeTouchableAreasItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.LargeTouchableAreasItemView largeTouchableAreasItemView = this.f64199d;
        largeTouchableAreasItemView.setItemViewSelected(!largeTouchableAreasItemView.f63792h);
        largeTouchableAreasItemView.getClass();
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/LargeTouchableAreasItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
