package b32;

/* loaded from: classes8.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView f17650d;

    public t(com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView editorChangeTextView) {
        this.f17650d = editorChangeTextView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView editorChangeTextView = this.f17650d;
        editorChangeTextView.f98715q.requestFocus();
        editorChangeTextView.setImeVisibility(true);
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
