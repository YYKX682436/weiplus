package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class ri extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI f110503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI finderPostPreviewUI) {
        super(0);
        this.f110503d = finderPostPreviewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI finderPostPreviewUI = this.f110503d;
        int identifier = finderPostPreviewUI.getResources().getIdentifier("status_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID);
        return java.lang.Integer.valueOf(identifier > 0 ? finderPostPreviewUI.getResources().getDimensionPixelSize(identifier) : com.tencent.mm.ui.bl.h(finderPostPreviewUI.getContext()));
    }
}
