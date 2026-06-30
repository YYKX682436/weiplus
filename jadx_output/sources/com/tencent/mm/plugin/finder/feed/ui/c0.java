package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI f109736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI) {
        super(0);
        this.f109736d = finderAlbumTimelineUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] byteArrayExtra = this.f109736d.getIntent().getByteArrayExtra("STREAM_CARD");
        if (byteArrayExtra == null) {
            return null;
        }
        r45.ww2 ww2Var = new r45.ww2();
        ww2Var.parseFrom(byteArrayExtra);
        return ww2Var;
    }
}
