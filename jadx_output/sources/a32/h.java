package a32;

/* loaded from: classes10.dex */
public final class h implements com.tencent.mm.plugin.mmsight.ui.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer f1017a;

    public h(com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer) {
        this.f1017a = captureContainer;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void a() {
        this.f1017a.f98659y.p(true, false, 1);
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void b() {
        this.f1017a.f98659y.p(false, false, 1);
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void c(float f17, float f18) {
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f1017a;
        captureContainer.f98659y.c(f17, f18, captureContainer.f98643f.getWidth(), captureContainer.f98643f.getHeight(), 400L);
        captureContainer.f98651q.a(f17, f18);
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void d() {
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f1017a;
        at0.n nVar = captureContainer.f98659y;
        if (nVar.f13604l == 0) {
            nVar.f13594b.o();
        }
        captureContainer.d();
    }
}
