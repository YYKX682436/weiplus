package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorFileUI f96581d;

    public k(com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI) {
        this.f96581d = editorFileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/EditorFileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI = this.f96581d;
        java.lang.String c17 = hx1.b.c(editorFileUI.f96470s);
        new android.content.Intent().setAction("android.intent.action.VIEW");
        if (4 == editorFileUI.T6()) {
            editorFileUI.f96474w = false;
            editorFileUI.X6();
        } else {
            editorFileUI.getClass();
            ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).wi(editorFileUI, c17, editorFileUI.f96470s.K, 5);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/EditorFileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
