package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* renamed from: io.flutter.plugin.platform.SurfaceProducerPlatformViewRenderTarget */
/* loaded from: classes15.dex */
public class C28740x95aefe implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf {
    private static final java.lang.String TAG = "SurfaceProducerRenderTarget";

    /* renamed from: producer */
    private io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer f71888xc42bcf92;

    public C28740x95aefe(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer) {
        this.f71888xc42bcf92 = surfaceProducer;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getHeight */
    public int mo53762x1c4fb41d() {
        return this.f71888xc42bcf92.mo138083x1c4fb41d();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getId */
    public long mo53763x5db1b11() {
        return this.f71888xc42bcf92.id();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getSurface */
    public android.view.Surface mo53764xcf572877() {
        return this.f71888xc42bcf92.mo138084xcf572877();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getWidth */
    public int mo53765x755bd410() {
        return this.f71888xc42bcf92.mo138085x755bd410();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: isReleased */
    public boolean mo53766xafdb8087() {
        return this.f71888xc42bcf92 == null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: release */
    public void mo53767x41012807() {
        this.f71888xc42bcf92.mo138094x41012807();
        this.f71888xc42bcf92 = null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: resize */
    public void mo53768xc84d9cb4(int i17, int i18) {
        this.f71888xc42bcf92.mo138098x76500f83(i17, i18);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: scheduleFrame */
    public void mo138698x62a02d16() {
        this.f71888xc42bcf92.mo138095x62a02d16();
    }
}
