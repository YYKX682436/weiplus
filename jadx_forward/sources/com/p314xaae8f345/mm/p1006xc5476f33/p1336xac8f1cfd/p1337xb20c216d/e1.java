package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class e1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 f178085d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1) {
        this.f178085d = abstractActivityC13156x6363e8e1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/EditorUI$23", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (i17 == 0) {
            android.widget.PopupWindow popupWindow = ox1.s.h().f431165r;
            ox1.s.h().x(popupWindow != null && popupWindow.isShowing());
            android.widget.PopupWindow popupWindow2 = ox1.s.h().f431168u;
            ox1.s.h().z(popupWindow2 != null && popupWindow2.isShowing());
            ox1.s.h().E(false, 50L);
        } else if (i17 == 1) {
            ox1.s.h().n();
            ox1.s.h().p();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/EditorUI$23", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        android.widget.LinearLayout linearLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/EditorUI$23", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        if (i18 > 30) {
            ox1.s.h().n();
            ox1.s.h().p();
        }
        ox1.e l17 = ox1.s.h().l();
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = this.f178085d;
        if ((abstractActivityC13156x6363e8e1.f178042s || ((linearLayout = abstractActivityC13156x6363e8e1.f178032f) != null && linearLayout.getVisibility() == 0)) && l17.a() == 2 && ox1.t.b(c1163xf1deaba4, l17.f431128a) == null) {
            abstractActivityC13156x6363e8e1.b5();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/EditorUI$23", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
