package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI f110517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
        super(0);
        this.f110517d = finderAppPushRouteProxyUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f110517d.getIntent().getIntExtra("KEY_JUMP_TYPE_CODE", 0));
    }
}
