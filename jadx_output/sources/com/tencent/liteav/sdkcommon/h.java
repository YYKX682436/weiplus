package com.tencent.liteav.sdkcommon;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final /* synthetic */ class h implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.sdkcommon.g f46560a;

    private h(com.tencent.liteav.sdkcommon.g gVar) {
        this.f46560a = gVar;
    }

    public static java.lang.Runnable a(com.tencent.liteav.sdkcommon.g gVar) {
        return new com.tencent.liteav.sdkcommon.h(gVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ScrollView scrollView = this.f46560a.f46549k;
        if (scrollView != null) {
            scrollView.fullScroll(130);
        }
    }
}
