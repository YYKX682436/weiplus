package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class e7 extends com.tencent.mm.plugin.finder.feed.model.internal.y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileTingMusicLoader f107826e;

    public e7(com.tencent.mm.plugin.finder.feed.model.FinderProfileTingMusicLoader finderProfileTingMusicLoader) {
        this.f107826e = finderProfileTingMusicLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse b(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i(getTAG(), "dealOnSceneEnd scene:" + scene);
        if (!(scene instanceof db2.f6)) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.model.d7 d7Var = (i17 == 0 && i18 == 0) ? com.tencent.mm.plugin.finder.feed.model.d7.f107804f : com.tencent.mm.plugin.finder.feed.model.d7.f107805g;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingMusicLoader finderProfileTingMusicLoader = this.f107826e;
        finderProfileTingMusicLoader.getClass();
        finderProfileTingMusicLoader.f107619m = d7Var;
        com.tencent.mm.plugin.finder.feed.model.f7 b17 = finderProfileTingMusicLoader.b((db2.f6) scene, i17, i18, str);
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealOnSceneEnd hasMore:");
        sb6.append(b17.getHasMore());
        sb6.append(" count:");
        java.util.List incrementList = b17.getIncrementList();
        sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
        sb6.append(" lastBuffer:");
        sb6.append(b17.getLastBuffer());
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        return b17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.modelbase.m1 c() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingMusicLoader finderProfileTingMusicLoader = this.f107826e;
        return new db2.f6(finderProfileTingMusicLoader.f107614e, finderProfileTingMusicLoader.f107615f, finderProfileTingMusicLoader.f107616g, finderProfileTingMusicLoader.f107617h, finderProfileTingMusicLoader.getLastBuffer(), 2, finderProfileTingMusicLoader.getContextObj());
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = this.f107826e.f107618i;
        if (iResponse != null) {
            return iResponse;
        }
        com.tencent.mm.plugin.finder.feed.model.f7 f7Var = new com.tencent.mm.plugin.finder.feed.model.f7(0, 0, "");
        f7Var.setIncrementList(new java.util.LinkedList());
        f7Var.setLastBuffer(null);
        return f7Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.modelbase.m1 d() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingMusicLoader finderProfileTingMusicLoader = this.f107826e;
        return new db2.f6(finderProfileTingMusicLoader.f107613d, finderProfileTingMusicLoader.f107615f, finderProfileTingMusicLoader.f107616g, finderProfileTingMusicLoader.f107617h, null, 0, finderProfileTingMusicLoader.getContextObj());
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public java.util.List e() {
        return kz5.b0.c(11732);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.fetch(obj, callback, z17);
        com.tencent.mm.plugin.finder.feed.model.d7 d7Var = com.tencent.mm.plugin.finder.feed.model.d7.f107803e;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingMusicLoader finderProfileTingMusicLoader = this.f107826e;
        finderProfileTingMusicLoader.getClass();
        finderProfileTingMusicLoader.f107619m = d7Var;
    }
}
