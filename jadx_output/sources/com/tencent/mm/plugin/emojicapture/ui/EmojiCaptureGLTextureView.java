package com.tencent.mm.plugin.emojicapture.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u001d\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureGLTextureView;", "Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraPreviewGLTextureView;", "Lis0/c;", "getPreviewTexture", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class EmojiCaptureGLTextureView extends com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView {
    public EmojiCaptureGLTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView, et0.q
    public is0.c getPreviewTexture() {
        if (!(getRenderer() instanceof d32.l)) {
            return super.getPreviewTexture();
        }
        ms0.c renderer = getRenderer();
        kotlin.jvm.internal.o.e(renderer, "null cannot be cast to non-null type com.tencent.mm.plugin.emojicapture.ui.gl.EmojiCapturePreviewRenderer");
        return ((d32.l) renderer).d();
    }

    public EmojiCaptureGLTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
