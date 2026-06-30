package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class fi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI f110018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI finderPostPreviewUI) {
        super(0);
        this.f110018d = finderPostPreviewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (com.tencent.mm.ui.widget.imageview.WeImageView) this.f110018d.findViewById(com.tencent.mm.R.id.close_icon);
    }
}
