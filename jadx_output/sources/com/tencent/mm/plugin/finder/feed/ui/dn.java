package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class dn implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI f109952d;

    public dn(com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI finderTopicFeedUI) {
        this.f109952d = finderTopicFeedUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17;
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI finderTopicFeedUI = this.f109952d;
            java.lang.String string = finderTopicFeedUI.getContext().getString(com.tencent.mm.R.string.f490559yh);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = finderTopicFeedUI.getContext().getString(com.tencent.mm.R.string.f492075f54);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            if (com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI.d7(finderTopicFeedUI)) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f3u);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f3v);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z18 = z17;
            g4Var.j(10002, string, com.tencent.mm.R.raw.finder_icons_filled_share, finderTopicFeedUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478502m), z18);
            g4Var.j(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, string2, com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, z18);
        }
    }
}
