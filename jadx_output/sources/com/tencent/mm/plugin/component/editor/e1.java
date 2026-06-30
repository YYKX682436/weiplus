package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class e1 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96552d;

    public e1(com.tencent.mm.plugin.component.editor.EditorUI editorUI) {
        this.f96552d = editorUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/EditorUI$23", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (i17 == 0) {
            android.widget.PopupWindow popupWindow = ox1.s.h().f349632r;
            ox1.s.h().x(popupWindow != null && popupWindow.isShowing());
            android.widget.PopupWindow popupWindow2 = ox1.s.h().f349635u;
            ox1.s.h().z(popupWindow2 != null && popupWindow2.isShowing());
            ox1.s.h().E(false, 50L);
        } else if (i17 == 1) {
            ox1.s.h().n();
            ox1.s.h().p();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/EditorUI$23", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        android.widget.LinearLayout linearLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
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
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = this.f96552d;
        if ((editorUI.f96509s || ((linearLayout = editorUI.f96499f) != null && linearLayout.getVisibility() == 0)) && l17.a() == 2 && ox1.t.b(recyclerView, l17.f349595a) == null) {
            editorUI.b5();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/EditorUI$23", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
