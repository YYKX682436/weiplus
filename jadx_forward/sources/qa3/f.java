package qa3;

/* loaded from: classes15.dex */
public final class f implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa3.h f442576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f442577b;

    public f(qa3.h hVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f442576a = hVar;
        this.f442577b = countDownLatch;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        qa3.o oVar = qa3.o.f442584a;
        qa3.h hVar = this.f442576a;
        oVar.c(hVar.f442568a, false, "errCode:" + i17);
        if (hVar.f442571d <= 0) {
            this.f442577b.countDown();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        qa3.o oVar = qa3.o.f442584a;
        qa3.h hVar = this.f442576a;
        oVar.c(hVar.f442568a, true, "");
        if (hVar.f442571d <= 0) {
            this.f442577b.countDown();
        }
    }
}
