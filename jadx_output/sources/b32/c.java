package b32;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer f17630d;

    public c(com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer) {
        this.f17630d = captureEditorContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = this.f17630d;
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = captureEditorContainer.f98695f;
        if (emojiCaptureReporter == null) {
            kotlin.jvm.internal.o.o("reporter");
            throw null;
        }
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.b(12, emojiCaptureReporter.f98583d, 0L, 0L, 0L, 0L, 0L, 0, 0, emojiCaptureReporter.G);
        captureEditorContainer.a(!(captureEditorContainer.f98707u.getVisibility() == 0));
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
