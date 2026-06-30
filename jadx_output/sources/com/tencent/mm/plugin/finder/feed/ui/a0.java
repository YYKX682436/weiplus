package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI f109640d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI) {
        super(0);
        this.f109640d = finderAlbumTimelineUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.xw2 xw2Var;
        r45.z91 z91Var;
        r45.xw2 xw2Var2;
        r45.z91 z91Var2;
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI.L;
        com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI = this.f109640d;
        int m76 = finderAlbumTimelineUI.m7();
        if (m76 != 10 && m76 != 11) {
            if (m76 != 14 || !finderAlbumTimelineUI.getIntent().hasExtra("STREAM_CARD_BUFFER")) {
                return null;
            }
            r45.z91 z91Var3 = new r45.z91();
            z91Var3.set(9, 14);
            z91Var3.set(2, new com.tencent.mm.protobuf.g(finderAlbumTimelineUI.getIntent().getByteArrayExtra("STREAM_CARD_BUFFER")));
            return new com.tencent.mm.plugin.finder.feed.ui.l(3, z91Var3);
        }
        if (finderAlbumTimelineUI.getIntent().hasExtra("STREAM_CARD")) {
            r45.ww2 o76 = finderAlbumTimelineUI.o7();
            if (o76 == null || (xw2Var2 = (r45.xw2) o76.getCustom(23)) == null || (z91Var2 = (r45.z91) xw2Var2.getCustom(2)) == null) {
                return null;
            }
            r45.ww2 o77 = finderAlbumTimelineUI.o7();
            z91Var2.set(2, o77 != null ? o77.getByteString(6) : null);
            return new com.tencent.mm.plugin.finder.feed.ui.l(1, z91Var2);
        }
        if (!finderAlbumTimelineUI.getIntent().hasExtra("STREAM_TXT_CARD")) {
            return null;
        }
        r45.rx2 rx2Var = new r45.rx2();
        rx2Var.parseFrom(finderAlbumTimelineUI.getIntent().getByteArrayExtra("STREAM_TXT_CARD"));
        java.util.LinkedList list = rx2Var.getList(4);
        if (list == null || (xw2Var = (r45.xw2) list.get(((java.lang.Number) ((jz5.n) finderAlbumTimelineUI.D).getValue()).intValue())) == null || (z91Var = (r45.z91) xw2Var.getCustom(2)) == null) {
            return null;
        }
        return new com.tencent.mm.plugin.finder.feed.ui.l(2, z91Var);
    }
}
