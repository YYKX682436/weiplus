package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class z1 implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f222882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7 f222883e;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7 activityC16011x94b3fdc7, android.view.ViewGroup viewGroup) {
        this.f222883e = activityC16011x94b3fdc7;
        this.f222882d = viewGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/MMGameWebTabUI$8", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        if ((view2.getTag() instanceof java.lang.String) && "game_float_view_tag".equalsIgnoreCase((java.lang.String) view2.getTag())) {
            android.view.ViewGroup viewGroup = this.f222882d;
            int indexOfChild = viewGroup.indexOfChild(view2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGameWebTabUI", "float page index2:%d", java.lang.Integer.valueOf(indexOfChild));
            if (indexOfChild >= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7 activityC16011x94b3fdc7 = this.f222883e;
                viewGroup.removeView(activityC16011x94b3fdc7.f222749h);
                viewGroup.addView(activityC16011x94b3fdc7.f222749h, indexOfChild - 1);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/MMGameWebTabUI$8", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/MMGameWebTabUI$8", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/MMGameWebTabUI$8", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
