package a32;

/* loaded from: classes10.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration f1045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f1046e;

    public v(com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration captureDecoration, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        this.f1045d = captureDecoration;
        this.f1046e = emojiInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f17;
        float f18;
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration captureDecoration = this.f1045d;
        if (captureDecoration.f98665z != null) {
            return;
        }
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer editorItemContainer = captureDecoration.f98661v;
        android.graphics.RectF validRect = editorItemContainer.getValidRect();
        android.content.Context context = captureDecoration.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView emojiEditorItemView = new com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView(context);
        emojiEditorItemView.setEmojiInfo(this.f1046e);
        emojiEditorItemView.resume();
        captureDecoration.f98665z = emojiEditorItemView;
        editorItemContainer.getClass();
        editorItemContainer.c(new b32.y(editorItemContainer, emojiEditorItemView, null));
        android.graphics.drawable.Drawable drawable = emojiEditorItemView.getDrawable();
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float width = validRect.width();
            float height = validRect.height();
            if (intrinsicWidth > intrinsicHeight) {
                f18 = width / 3;
                f17 = (intrinsicHeight * f18) / intrinsicWidth;
            } else {
                f17 = height / 3;
                f18 = (intrinsicWidth * f17) / intrinsicHeight;
            }
            float f19 = validRect.right;
            float f27 = validRect.bottom;
            emojiEditorItemView.getTouchMatrix().setPolyToPoly(new float[]{0.0f, 0.0f, intrinsicWidth, intrinsicHeight}, 0, new float[]{f19 - f18, f27 - f17, f19, f27}, 0, 2);
            float f28 = (-captureDecoration.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480351vc)) / 2;
            emojiEditorItemView.getTouchMatrix().postTranslate(f28, f28);
        }
    }
}
