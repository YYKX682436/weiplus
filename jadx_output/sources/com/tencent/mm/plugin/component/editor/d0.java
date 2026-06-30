package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class d0 implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorImageUI f96549d;

    public d0(com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI) {
        this.f96549d = editorImageUI;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/EditorImageUI$1", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI = this.f96549d;
        if (com.tencent.mm.vfs.w6.j(((ix1.c) editorImageUI.f96481g.getItem(i17)).f295322s)) {
            editorImageUI.setMMTitle(java.lang.String.format("%d/%d", java.lang.Integer.valueOf(i17 + 1), java.lang.Integer.valueOf(((java.util.ArrayList) editorImageUI.f96478d).size())));
            editorImageUI.enableOptionMenu(true);
        } else {
            editorImageUI.enableOptionMenu(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/EditorImageUI$1", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
    }
}
