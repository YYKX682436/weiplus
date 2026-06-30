package b32;

/* loaded from: classes10.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer f17635d;

    public f(com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer) {
        this.f17635d = captureEditorContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = this.f17635d;
        if (captureEditorContainer.f98707u.getVisibility() == 0) {
            captureEditorContainer.a(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
