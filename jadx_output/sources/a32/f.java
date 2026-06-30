package a32;

/* loaded from: classes10.dex */
public final class f implements com.tencent.mm.plugin.mmsight.ui.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer f1013a;

    public f(com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer) {
        this.f1013a = captureContainer;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.j0
    public final void a() {
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f1013a;
        com.tencent.mars.xlog.Log.i(captureContainer.f98641d, "simpleTapCallback");
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer.b(captureContainer, false);
    }
}
