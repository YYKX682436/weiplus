package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileTingSongListLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileTingMusicLoader;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileTingSongListLoader extends com.tencent.mm.plugin.finder.feed.model.FinderProfileTingMusicLoader {
    @Override // com.tencent.mm.plugin.finder.feed.model.FinderProfileTingMusicLoader
    public com.tencent.mm.plugin.finder.feed.model.f7 b(db2.f6 scene, int i17, int i18, java.lang.String str) {
        r45.i66 i66Var;
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mm.plugin.finder.feed.model.f7 f7Var = new com.tencent.mm.plugin.finder.feed.model.f7(i17, i18, str);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(scene.K());
        f7Var.setIncrementList(linkedList);
        f7Var.setPullType(scene.f227977m);
        f7Var.setHasMore(scene.L());
        com.tencent.mm.protobuf.f fVar = scene.f227976i.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMusicAlbumUserPageResponse");
        r45.fc6 fc6Var = ((r45.xi2) fVar).f390133h;
        f7Var.setLastBuffer((fc6Var == null || (i66Var = fc6Var.f374208d) == null) ? null : i66Var.f376768e);
        return f7Var;
    }
}
