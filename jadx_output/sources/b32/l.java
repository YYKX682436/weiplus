package b32;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer f17642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer) {
        super(0);
        this.f17642d = captureEditorContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = this.f17642d;
        pm0.v.X(new b32.k(captureEditorContainer));
        yz5.a aVar = captureEditorContainer.C;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView = captureEditorContainer.f98697h;
        if (emojiVideoPlayTextureView != null) {
            emojiVideoPlayTextureView.setOnDrawCallback(null);
        }
        return jz5.f0.f302826a;
    }
}
