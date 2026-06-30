package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class ol extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI f110382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI finderTeenModeLimitUI) {
        super(0);
        this.f110382d = finderTeenModeLimitUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI finderTeenModeLimitUI = this.f110382d;
        finderTeenModeLimitUI.setResult(11112);
        if (!(finderTeenModeLimitUI.isFinishing() | finderTeenModeLimitUI.isDestroyed())) {
            finderTeenModeLimitUI.finish();
        }
        return jz5.f0.f302826a;
    }
}
