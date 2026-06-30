package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class we extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.image.FinderImageBanner f104866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f104867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag f104868f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f104869g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.d1 f104870h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner, com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout, com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag finderImgFeedMusicTag, com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout2, so2.d1 d1Var) {
        super(0);
        this.f104866d = finderImageBanner;
        this.f104867e = finderFullSeekBarLayout;
        this.f104868f = finderImgFeedMusicTag;
        this.f104869g = finderFullSeekBarLayout2;
        this.f104870h = d1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner = this.f104866d;
        boolean z17 = finderImageBanner.f132324v || this.f104867e.T;
        com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag musicPlayer = this.f104868f;
        if (z17) {
            kotlin.jvm.internal.o.f(musicPlayer, "$musicPlayer");
            int i17 = com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag.f121429r;
            musicPlayer.d(false);
            finderImageBanner.o();
            com.tencent.mm.plugin.finder.report.m4 m4Var = (com.tencent.mm.plugin.finder.report.m4) kz5.n0.k0(finderImageBanner.getViewInfos());
            if (m4Var != null) {
                m4Var.f125137f = 1;
            }
            musicPlayer.setTag(com.tencent.mm.R.id.fun, java.lang.Boolean.FALSE);
        } else {
            musicPlayer.setTag(com.tencent.mm.R.id.fun, java.lang.Boolean.TRUE);
            musicPlayer.e();
            finderImageBanner.m();
        }
        this.f104869g.setPlayingStatus(!z17);
        this.f104870h.f410310d = z17;
        return java.lang.Boolean.valueOf(z17);
    }
}
