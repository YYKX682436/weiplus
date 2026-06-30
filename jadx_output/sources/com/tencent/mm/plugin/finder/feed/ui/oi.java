package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class oi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI f110378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI finderPostPreviewUI) {
        super(0);
        this.f110378d = finderPostPreviewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f110378d.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false));
    }
}
