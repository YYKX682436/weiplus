package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class pb implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104252a;

    public pb(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f104252a = baseFinderFeed;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        return kz5.b1.e(new jz5.l("feed_id", pm0.v.u(this.f104252a.getItemId())));
    }
}
