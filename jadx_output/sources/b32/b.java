package b32;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer f17628d;

    public b(com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer) {
        this.f17628d = captureEditorContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = this.f17628d;
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = captureEditorContainer.f98695f;
        if (emojiCaptureReporter == null) {
            kotlin.jvm.internal.o.o("reporter");
            throw null;
        }
        long j17 = emojiCaptureReporter.f98583d;
        if (emojiCaptureReporter == null) {
            kotlin.jvm.internal.o.o("reporter");
            throw null;
        }
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.b(11, j17, 0L, 0L, 0L, 0L, 0L, 0, 0, emojiCaptureReporter.G);
        android.view.View view2 = captureEditorContainer.f98702p;
        r22.c presenter = captureEditorContainer.getPresenter();
        boolean z17 = false;
        if (presenter != null) {
            w22.v vVar = (w22.v) presenter;
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorPresenter", "speedUp " + vVar.f442589j);
            r22.d dVar = vVar.f442581b;
            com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView f98697h = dVar.getF98697h();
            if (kotlin.jvm.internal.o.a(f98697h != null ? java.lang.Float.valueOf(f98697h.getPlayRate()) : null, 1.0f)) {
                com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView f98697h2 = dVar.getF98697h();
                if (f98697h2 != null) {
                    f98697h2.setPlayRate(2.0f);
                }
                vVar.f442589j = true;
                z17 = true;
            } else {
                com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView f98697h3 = dVar.getF98697h();
                if (f98697h3 != null) {
                    f98697h3.setPlayRate(1.0f);
                }
                vVar.f442589j = false;
            }
        }
        view2.setSelected(z17);
        captureEditorContainer.f98705s.setImageDrawable(captureEditorContainer.f98702p.isSelected() ? captureEditorContainer.f98710x : captureEditorContainer.f98711y);
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
