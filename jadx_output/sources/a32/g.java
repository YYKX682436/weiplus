package a32;

/* loaded from: classes10.dex */
public final class g implements com.tencent.mm.plugin.mmsight.ui.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer f1015a;

    public g(com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer) {
        this.f1015a = captureContainer;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.i0
    public void a(int i17) {
        this.f1015a.f98659y.p(true, true, i17);
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.i0
    public void b(int i17) {
        this.f1015a.f98659y.p(false, true, i17);
    }
}
