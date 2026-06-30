package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class mj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderRecommendReasonTimelineUI f110312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(com.tencent.mm.plugin.finder.feed.ui.FinderRecommendReasonTimelineUI finderRecommendReasonTimelineUI) {
        super(0);
        this.f110312d = finderRecommendReasonTimelineUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f110312d.getIntent().getIntExtra("KEY_SINGLE_COMMENT_SCENE", 337));
    }
}
