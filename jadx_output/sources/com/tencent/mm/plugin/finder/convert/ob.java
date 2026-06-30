package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ob implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104166d;

    public ob(in5.s0 s0Var) {
        this.f104166d = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) this.f104166d.p(com.tencent.mm.R.id.ghd);
        if (finderFullSeekBarLayout != null) {
            finderFullSeekBarLayout.q();
        }
    }
}
