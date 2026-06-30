package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class af extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(in5.s0 s0Var) {
        super(0);
        this.f102881d = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.s0 s0Var = this.f102881d;
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd);
        if (finderFullSeekBarLayout != null) {
            finderFullSeekBarLayout.T = true;
        }
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout2 = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd);
        if (finderFullSeekBarLayout2 != null) {
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout.I(finderFullSeekBarLayout2, null, false, 3, null);
        }
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout3 = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd);
        if (finderFullSeekBarLayout3 != null) {
            finderFullSeekBarLayout3.T = false;
        }
        return jz5.f0.f302826a;
    }
}
