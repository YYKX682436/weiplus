package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class qg extends com.tencent.mm.plugin.finder.feed.x10 {
    public final com.tencent.mm.plugin.finder.storage.vj0 R;

    public qg(com.tencent.mm.plugin.finder.feed.ui.FinderMusicTopicVideoFlowUI finderMusicTopicVideoFlowUI, int i17) {
        super(finderMusicTopicVideoFlowUI, 2, i17, false, false, null, 56, null);
        this.R = finderMusicTopicVideoFlowUI.g7() ? new ca2.e() : this.Q;
    }

    @Override // com.tencent.mm.plugin.finder.feed.x10, com.tencent.mm.plugin.finder.feed.a1
    public com.tencent.mm.plugin.finder.storage.vj0 q() {
        return this.R;
    }
}
