package com.tencent.mm.plugin.appbrand.wxassistant.pageinfo;

/* loaded from: classes7.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public static final android.hardware.display.VirtualDisplay.Callback f92294b = new com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.j();

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.platform.PlatformViewRenderTarget f92295a;

    public k(android.content.Context context, com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.a aVar, android.hardware.display.VirtualDisplay virtualDisplay, android.view.View view, io.flutter.plugin.platform.PlatformViewRenderTarget platformViewRenderTarget, android.view.View.OnFocusChangeListener onFocusChangeListener, int i17, java.lang.Object obj) {
        this.f92295a = platformViewRenderTarget;
        int i18 = context.getResources().getDisplayMetrics().densityDpi;
        new com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.SingleViewPresentation(context, virtualDisplay.getDisplay(), view, aVar, i17, onFocusChangeListener).show();
    }
}
