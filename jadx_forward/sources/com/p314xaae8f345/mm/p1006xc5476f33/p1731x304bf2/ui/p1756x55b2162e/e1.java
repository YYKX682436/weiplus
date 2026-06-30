package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class e1 implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f222797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427 f222798e;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427 activityC16010xe7956427, android.view.ViewGroup viewGroup) {
        this.f222798e = activityC16010xe7956427;
        this.f222797d = viewGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/GameWebTabUI$10", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        if ((view2.getTag() instanceof java.lang.String) && "game_float_view_tag".equalsIgnoreCase((java.lang.String) view2.getTag())) {
            android.view.ViewGroup viewGroup = this.f222797d;
            int indexOfChild = viewGroup.indexOfChild(view2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebTabUI", "float page index2:%d", java.lang.Integer.valueOf(indexOfChild));
            if (indexOfChild >= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427 activityC16010xe7956427 = this.f222798e;
                viewGroup.removeView(activityC16010xe7956427.f222730m);
                viewGroup.addView(activityC16010xe7956427.f222730m, indexOfChild - 1);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameWebTabUI$10", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/GameWebTabUI$10", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameWebTabUI$10", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
