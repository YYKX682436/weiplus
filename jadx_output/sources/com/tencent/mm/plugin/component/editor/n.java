package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorFileUI f96612d;

    public n(com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI) {
        this.f96612d = editorFileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/EditorFileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.component.editor.EditorFileUI.A;
        com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI = this.f96612d;
        editorFileUI.W6();
        com.tencent.mm.plugin.component.editor.f.f96553d.e(editorFileUI.f96470s.T);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/EditorFileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
