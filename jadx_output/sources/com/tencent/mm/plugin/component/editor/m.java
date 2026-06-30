package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorFileUI f96594d;

    public m(com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI) {
        this.f96594d = editorFileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/EditorFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean b17 = fp.i.b();
        com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI = this.f96594d;
        if (!b17) {
            db5.e1.i(editorFileUI.getContext(), com.tencent.mm.R.string.cbp, com.tencent.mm.R.string.f490573yv);
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/EditorFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.component.editor.f.f96553d.c(new com.tencent.mm.plugin.component.editor.c(editorFileUI.f96470s, false, com.tencent.mm.plugin.component.editor.a.TYPE_FILE, -1));
        editorFileUI.f96460f.setVisibility(8);
        editorFileUI.f96458d.setVisibility(8);
        editorFileUI.f96459e.setVisibility(8);
        editorFileUI.f96463i.setVisibility(8);
        android.view.View view2 = editorFileUI.f96466o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/EditorFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
