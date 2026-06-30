package a32;

/* loaded from: classes10.dex */
public final class b implements com.tencent.mm.plugin.mmsight.ui.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer f1004a;

    public b(com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer) {
        this.f1004a = captureContainer;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.x
    public void a(boolean z17) {
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f1004a;
        com.tencent.mars.xlog.Log.i(captureContainer.f98641d, if1.m.NAME);
        a32.a aVar = new a32.a(captureContainer);
        captureContainer.f98643f.l(new a32.t(captureContainer));
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer.b(captureContainer, captureContainer.f98659y.l(aVar));
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.x
    public void b(java.util.ArrayList arrayList) {
    }
}
