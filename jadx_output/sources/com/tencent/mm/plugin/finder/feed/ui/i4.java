package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class i4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI f110138d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI finderGalleryUI) {
        super(0);
        this.f110138d = finderGalleryUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f110138d.getIntent().getBooleanExtra("IS_SHOW_MENU_POST", false));
    }
}
