package com.tencent.liteav.sdkcommon;

/* loaded from: classes15.dex */
final /* synthetic */ class k implements android.view.View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.sdkcommon.g f46564a;

    private k(com.tencent.liteav.sdkcommon.g gVar) {
        this.f46564a = gVar;
    }

    public static android.view.View.OnClickListener a(com.tencent.liteav.sdkcommon.g gVar) {
        return new com.tencent.liteav.sdkcommon.k(gVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        this.f46564a.a(false);
    }
}
