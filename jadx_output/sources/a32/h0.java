package a32;

/* loaded from: classes10.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView f1018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView) {
        super(1);
        this.f1018d = editorStickerView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        t85.d dVar = (t85.d) obj;
        r45.p64 p64Var = dVar != null ? dVar.f416456a : null;
        com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView = this.f1018d;
        editorStickerView.f98680u = p64Var;
        if (dVar != null) {
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter reporter = editorStickerView.getReporter();
            r45.p64 p64Var2 = dVar.f416456a;
            if (reporter != null) {
                java.lang.String str = p64Var2.f382792d;
                java.lang.String str2 = p64Var2.f382794f;
                reporter.A = str;
                reporter.D = str2;
                reporter.B = dVar.f416457b;
                reporter.C = dVar.f416458c;
                reporter.e(23);
            }
            editorStickerView.f98678s = p64Var2;
            editorStickerView.f98679t = p64Var2.f382792d;
            fp0.u c17 = u85.i.f425707a.c(p64Var2);
            if (c17 == fp0.u.f265290f) {
                editorStickerView.c(c17);
            }
        }
        return jz5.f0.f302826a;
    }
}
