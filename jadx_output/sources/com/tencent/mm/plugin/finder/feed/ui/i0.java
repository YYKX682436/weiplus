package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI f110134d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
        super(0);
        this.f110134d = finderAppPushRouteProxyUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Long.valueOf(this.f110134d.getIntent().getLongExtra("KEY_PUSH_CTRL_FLAG", 0L));
    }
}
