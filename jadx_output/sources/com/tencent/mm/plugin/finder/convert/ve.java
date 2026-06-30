package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ve extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag f104782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.image.FinderImageBanner f104783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag finderImgFeedMusicTag, com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner) {
        super(0);
        this.f104782d = finderImgFeedMusicTag;
        this.f104783e = finderImageBanner;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag finderImgFeedMusicTag = this.f104782d;
        finderImgFeedMusicTag.setTag(com.tencent.mm.R.id.fun, bool);
        finderImgFeedMusicTag.e();
        this.f104783e.m();
        return jz5.f0.f302826a;
    }
}
