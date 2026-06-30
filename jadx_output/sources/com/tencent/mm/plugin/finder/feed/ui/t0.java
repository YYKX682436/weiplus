package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI f110549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
        super(0);
        this.f110549d = finderAppPushRouteProxyUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f110549d.getIntent().getStringExtra("KEY_OBJECT_NONCE_ID");
    }
}
