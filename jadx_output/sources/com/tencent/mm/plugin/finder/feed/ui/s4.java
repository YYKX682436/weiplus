package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class s4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI f110523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI finderGameLivePostVerifyUI) {
        super(0);
        this.f110523d = finderGameLivePostVerifyUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f110523d.getIntent().getStringExtra("APPID");
    }
}
