package a32;

/* loaded from: classes10.dex */
public final class g0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView f1016d;

    public g0(com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView) {
        this.f1016d = editorStickerView;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView = this.f1016d;
        r45.p64 p64Var = editorStickerView.f98680u;
        if (p64Var != null) {
            editorStickerView.f98673n.a(p64Var);
            java.lang.String str = p64Var.f382792d;
            u22.t tVar = editorStickerView.f98674o;
            tVar.f424032e = str;
            tVar.f424034g = true;
        }
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter reporter = editorStickerView.getReporter();
        if (reporter != null) {
            reporter.e(26);
        }
    }
}
