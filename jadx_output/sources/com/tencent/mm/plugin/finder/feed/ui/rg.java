package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class rg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderMusicTopicVideoFlowUI f110501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(com.tencent.mm.plugin.finder.feed.ui.FinderMusicTopicVideoFlowUI finderMusicTopicVideoFlowUI) {
        super(0);
        this.f110501d = finderMusicTopicVideoFlowUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f110501d.getIntent().getIntExtra("KEY_INNER_TAB_TYPE", 3) == 4);
    }
}
