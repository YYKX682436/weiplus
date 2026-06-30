package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class fn implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI f110028d;

    public fn(com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI finderTopicFeedUI) {
        this.f110028d = finderTopicFeedUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            g4Var.g(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, this.f110028d.getContext().getString(com.tencent.mm.R.string.gys), com.tencent.mm.R.raw.icons_outlined_report_problem);
        }
    }
}
