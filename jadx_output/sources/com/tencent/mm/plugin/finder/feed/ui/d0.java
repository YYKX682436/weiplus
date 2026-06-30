package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI f109922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI) {
        super(0);
        this.f109922d = finderAlbumTimelineUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f109922d.getIntent().getIntExtra("STREAM_TXT_CARD_INDEX", 0));
    }
}
