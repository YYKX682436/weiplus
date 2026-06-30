package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class mq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI f110318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq(com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI) {
        super(0);
        this.f110318d = selectLocalFileRouterUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Long.valueOf(this.f110318d.getIntent().getIntExtra("MINI_DURATION", 0) * 1000);
    }
}
