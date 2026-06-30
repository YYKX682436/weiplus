package a32;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer f1039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer) {
        super(1);
        this.f1039d = captureContainer;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f1039d;
        captureContainer.f98659y.getClass();
        pm0.v.X(new a32.u(it0.c.a(), captureContainer));
        com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView = captureContainer.f98648n;
        editorStickerView.getClass();
        pm0.v.V(200L, new a32.e0(editorStickerView));
        if (!booleanValue) {
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.c(9, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markCameraOpenFailed");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.C(1012L, 3L, 1L);
            if (captureContainer.g()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markCpuCropPreviewFailed");
                g0Var.C(1012L, 9L, 1L);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markGpuCropPreviewFailed");
                g0Var.C(1012L, 8L, 1L);
            }
        }
        if (captureContainer.g()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markCpuCropPreview");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1012L, 7L, 1L);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markGpuCropPreview");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1012L, 6L, 1L);
        }
        return jz5.f0.f302826a;
    }
}
