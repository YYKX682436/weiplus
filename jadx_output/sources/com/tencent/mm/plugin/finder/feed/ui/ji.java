package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class ji extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI f110195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI finderPostPreviewUI) {
        super(0);
        this.f110195d = finderPostPreviewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f110195d.getIntent().getIntExtra("KEY_FROM_SCENE", 0));
    }
}
