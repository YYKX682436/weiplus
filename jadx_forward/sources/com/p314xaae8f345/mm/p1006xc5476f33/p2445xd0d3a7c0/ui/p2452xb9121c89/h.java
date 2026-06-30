package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269742d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3) {
        this.f269742d = activityC19519x7af4daf3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$14", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (i17 == 0) {
            android.widget.PopupWindow popupWindow = nz4.y.h().f423193r;
            nz4.y.h().A(popupWindow != null && popupWindow.isShowing());
            android.widget.PopupWindow popupWindow2 = nz4.y.h().f423196u;
            nz4.y.h().C(popupWindow2 != null && popupWindow2.isShowing());
            nz4.y.h().I(false, 50L);
        } else if (i17 == 1) {
            nz4.y.h().n();
            nz4.y.h().p();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$14", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        android.widget.FrameLayout frameLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$14", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        if (i18 > 30) {
            nz4.y.h().n();
            nz4.y.h().p();
        }
        nz4.h l17 = nz4.y.h().l();
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269742d;
        if ((activityC19519x7af4daf3.N || ((frameLayout = activityC19519x7af4daf3.f269683p) != null && frameLayout.getVisibility() == 0)) && l17.a() == 2 && nz4.z.b(c1163xf1deaba4, l17.f423152a) == null) {
            activityC19519x7af4daf3.b5();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$14", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
