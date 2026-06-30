package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class si extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI f110538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI finderPostPreviewUI) {
        super(0);
        this.f110538d = finderPostPreviewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI finderPostPreviewUI = this.f110538d;
        java.lang.String stringExtra = finderPostPreviewUI.getIntent().getStringExtra("KEY_USERNAME");
        return stringExtra == null ? xy2.c.e(finderPostPreviewUI) : stringExtra;
    }
}
