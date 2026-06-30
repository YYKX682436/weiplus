package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent f110064d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent finderAccountManagent) {
        super(0);
        this.f110064d = finderAccountManagent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = this.f110064d.getIntent();
        com.tencent.mm.plugin.finder.feed.ui.f fVar = com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent.f109198g;
        return intent.getStringExtra("ACCOUNT_USERNAME");
    }
}
