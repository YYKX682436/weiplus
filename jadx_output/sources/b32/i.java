package b32;

/* loaded from: classes10.dex */
public final class i implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer f17639a;

    public i(com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer) {
        this.f17639a = captureEditorContainer;
    }

    @Override // qk.u9
    public void a(com.tencent.mm.api.IEmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = this.f17639a;
        com.tencent.mars.xlog.Log.i(captureEditorContainer.f98693d, "[onSelectedEmoji] emojiInfo:%s", emojiInfo);
        r22.c presenter = captureEditorContainer.getPresenter();
        if (presenter != null) {
            ((w22.v) presenter).b(emojiInfo, null);
        }
        onHide();
    }

    @Override // qk.u9
    public void onHide() {
        this.f17639a.a(false);
    }
}
