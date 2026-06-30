package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAccountRecommendListUI f110206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.finder.feed.ui.FinderAccountRecommendListUI finderAccountRecommendListUI) {
        super(0);
        this.f110206d = finderAccountRecommendListUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f110206d.getIntent().getStringExtra("profile_username");
        return stringExtra == null ? "" : stringExtra;
    }
}
