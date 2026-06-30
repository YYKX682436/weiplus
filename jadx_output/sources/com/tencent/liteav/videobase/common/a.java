package com.tencent.liteav.videobase.common;

/* loaded from: classes13.dex */
final /* synthetic */ class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.videobase.common.a f46708a = new com.tencent.liteav.videobase.common.a();

    private a() {
    }

    public static java.lang.Runnable a() {
        return f46708a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videobase.common.HDRCapability.checkIsHDR10Supported();
    }
}
