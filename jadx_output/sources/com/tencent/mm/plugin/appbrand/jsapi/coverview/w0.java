package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes13.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MultiTouchImageView f80721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer f80722e;

    public w0(com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer zoomImagePreviewer, com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView) {
        this.f80722e = zoomImagePreviewer;
        this.f80721d = multiTouchImageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer zoomImagePreviewer = this.f80722e;
        float f17 = zoomImagePreviewer.f80667y1;
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.f80721d;
        if (f17 != multiTouchImageView.getOriginScale()) {
            multiTouchImageView.setOriginScale(zoomImagePreviewer.f80667y1);
            multiTouchImageView.u(zoomImagePreviewer.f80667y1);
            multiTouchImageView.h();
        }
    }
}
