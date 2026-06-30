package com.tencent.mm.plugin.appbrand.skyline.nativeview;

/* loaded from: classes14.dex */
public class j implements io.flutter.view.TextureRegistry.OnFrameConsumedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.skyline.nativeview.l f88898a;

    public j(com.tencent.mm.plugin.appbrand.skyline.nativeview.l lVar) {
        this.f88898a = lVar;
    }

    @Override // io.flutter.view.TextureRegistry.OnFrameConsumedListener
    public void onFrameConsumed() {
        if (android.os.Build.VERSION.SDK_INT == 29) {
            this.f88898a.f88917q.decrementAndGet();
        }
    }
}
