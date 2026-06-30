package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class b7 extends com.tencent.mm.plugin.finder.feed.model.internal.y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioLoader f107737e;

    public b7(com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioLoader finderProfileTingAudioLoader) {
        this.f107737e = finderProfileTingAudioLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse b(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i(getTAG(), "dealOnSceneEnd scene:" + scene);
        if (!(scene instanceof db2.e6)) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.model.z6 z6Var = (i17 == 0 && i18 == 0) ? com.tencent.mm.plugin.finder.feed.model.z6.f108513f : com.tencent.mm.plugin.finder.feed.model.z6.f108514g;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioLoader finderProfileTingAudioLoader = this.f107737e;
        finderProfileTingAudioLoader.getClass();
        finderProfileTingAudioLoader.f107610i = z6Var;
        com.tencent.mm.plugin.finder.feed.model.a7 b17 = finderProfileTingAudioLoader.b((db2.e6) scene, i17, i18, str);
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
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioLoader finderProfileTingAudioLoader = this.f107737e;
        return new db2.e6(finderProfileTingAudioLoader.f107605d, finderProfileTingAudioLoader.f107606e, finderProfileTingAudioLoader.f107607f, finderProfileTingAudioLoader.f107608g, finderProfileTingAudioLoader.getLastBuffer(), 2, finderProfileTingAudioLoader.getContextObj());
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = this.f107737e.f107609h;
        if (iResponse != null) {
            return iResponse;
        }
        com.tencent.mm.plugin.finder.feed.model.a7 a7Var = new com.tencent.mm.plugin.finder.feed.model.a7(0, 0, "");
        a7Var.setIncrementList(new java.util.LinkedList());
        a7Var.setLastBuffer(null);
        return a7Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.modelbase.m1 d() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioLoader finderProfileTingAudioLoader = this.f107737e;
        return new db2.e6(finderProfileTingAudioLoader.f107605d, finderProfileTingAudioLoader.f107606e, finderProfileTingAudioLoader.f107607f, finderProfileTingAudioLoader.f107608g, null, 0, finderProfileTingAudioLoader.getContextObj());
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public java.util.List e() {
        return kz5.b0.c(8460);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.fetch(obj, callback, z17);
        com.tencent.mm.plugin.finder.feed.model.z6 z6Var = com.tencent.mm.plugin.finder.feed.model.z6.f108512e;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioLoader finderProfileTingAudioLoader = this.f107737e;
        finderProfileTingAudioLoader.getClass();
        finderProfileTingAudioLoader.f107610i = z6Var;
    }
}
