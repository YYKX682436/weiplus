package b32;

/* loaded from: classes10.dex */
public final class m implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer f17643d;

    public m(com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer) {
        this.f17643d = captureEditorContainer;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = this.f17643d;
        java.lang.String str = captureEditorContainer.f98693d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCompletion cost ");
        long startTick = captureEditorContainer.getStartTick();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - startTick);
        sb6.append("ms");
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        captureEditorContainer.setStartTick(android.os.SystemClock.elapsedRealtime());
        com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView = captureEditorContainer.f98697h;
        if (emojiVideoPlayTextureView != null) {
            emojiVideoPlayTextureView.f98630s = true;
            ph3.k kVar = emojiVideoPlayTextureView.f98626o;
            if (kVar != null) {
                kVar.o((int) 0.0d, true);
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = this.f17643d;
        com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView = captureEditorContainer.f98697h;
        if (emojiVideoPlayTextureView != null) {
            emojiVideoPlayTextureView.setOnDrawCallback(new b32.l(captureEditorContainer));
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        captureEditorContainer.setStartTick(android.os.SystemClock.elapsedRealtime());
        com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView2 = captureEditorContainer.f98697h;
        if (emojiVideoPlayTextureView2 != null) {
            emojiVideoPlayTextureView2.start();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
