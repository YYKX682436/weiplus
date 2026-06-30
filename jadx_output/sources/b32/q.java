package b32;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView f17647d;

    public q(com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView editorChangeTextView) {
        this.f17647d = editorChangeTextView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView editorChangeTextView = this.f17647d;
        android.text.Editable text = editorChangeTextView.f98715q.getText();
        b32.u callback = editorChangeTextView.getCallback();
        if (callback != null) {
            int i17 = editorChangeTextView.f98718t;
            b32.g gVar = (b32.g) callback;
            java.lang.String obj = text != null ? text.toString() : null;
            if (obj != null && obj.length() > 50) {
                obj = obj.substring(0, 50);
                kotlin.jvm.internal.o.f(obj, "substring(...)");
            }
            com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = gVar.f17637a;
            r22.c presenter = captureEditorContainer.getPresenter();
            if (presenter != null) {
                ((w22.v) presenter).j(obj, i17, true);
            }
            captureEditorContainer.f98699m.setShow(false);
        }
        editorChangeTextView.f98715q.clearFocus();
        if (editorChangeTextView.getTextChanged()) {
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.b(16, editorChangeTextView.getReporter().f98583d, 0L, 0L, 0L, 0L, 0L, 0, 0, editorChangeTextView.getReporter().G);
        }
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.b(15, editorChangeTextView.getReporter().f98583d, 0L, 0L, 0L, 0L, 0L, 0, 0, editorChangeTextView.getReporter().G);
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
