package com.tencent.liteav.sdkcommon;

/* loaded from: classes15.dex */
final /* synthetic */ class i implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.sdkcommon.g f46561a;

    private i(com.tencent.liteav.sdkcommon.g gVar) {
        this.f46561a = gVar;
    }

    public static java.lang.Runnable a(com.tencent.liteav.sdkcommon.g gVar) {
        return new com.tencent.liteav.sdkcommon.i(gVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ScrollView scrollView = this.f46561a.f46549k;
        if (scrollView != null) {
            scrollView.fullScroll(130);
        }
    }
}
