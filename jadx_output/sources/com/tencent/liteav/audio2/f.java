package com.tencent.liteav.audio2;

/* loaded from: classes13.dex */
final /* synthetic */ class f implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.audio2.e f46265a;

    private f(com.tencent.liteav.audio2.e eVar) {
        this.f46265a = eVar;
    }

    public static java.lang.Runnable a(com.tencent.liteav.audio2.e eVar) {
        return new com.tencent.liteav.audio2.f(eVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.audio2.e.a(this.f46265a);
    }
}
