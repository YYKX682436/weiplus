package com.tencent.mm.plugin.appbrand.jsapi.camera;

/* loaded from: classes7.dex */
public class SameLayerCameraView extends com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView implements tb1.b0 {

    /* renamed from: l1, reason: collision with root package name */
    public static final /* synthetic */ int f80189l1 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.Surface f80190y0;

    public SameLayerCameraView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView
    public com.tencent.mm.plugin.mmsight.api.MMSightRecordView e(android.content.Context context, int i17, int i18) {
        return new com.tencent.mm.plugin.mmsight.api.MMSightRecordView(context, this.f80190y0, i17, i18);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView
    public tb1.m j(java.lang.String str) {
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals(com.tencent.mm.plugin.appbrand.jsapi.scanner.p.NAME)) ? super.j(str) : new tb1.v0(this);
    }

    @Override // tb1.b0
    public void setCustomSurface(android.view.Surface surface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayerCameraView", "setCustomSurface:%s", surface);
        this.f80190y0 = surface;
    }

    public SameLayerCameraView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
