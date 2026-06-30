package com.tencent.liteav.base.system;

/* loaded from: classes13.dex */
final /* synthetic */ class i implements com.tencent.liteav.base.util.i.a {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.system.i f46408a = new com.tencent.liteav.base.system.i();

    private i() {
    }

    public static com.tencent.liteav.base.util.i.a a() {
        return f46408a;
    }

    @Override // com.tencent.liteav.base.util.i.a
    public final void a(boolean z17) {
        com.tencent.liteav.base.system.LiteavSystemInfo.onAppBackgroundStateChanged(z17);
    }
}
