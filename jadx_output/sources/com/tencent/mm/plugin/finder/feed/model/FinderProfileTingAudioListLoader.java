package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileTingAudioListLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileTingAudioLoader;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileTingAudioListLoader extends com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioLoader {
    @Override // com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioLoader
    public com.tencent.mm.plugin.finder.feed.model.a7 b(db2.e6 scene, int i17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mm.plugin.finder.feed.model.a7 a7Var = new com.tencent.mm.plugin.finder.feed.model.a7(i17, i18, str);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(scene.M());
        a7Var.setIncrementList(linkedList);
        a7Var.setPullType(scene.f227964m);
        com.tencent.mm.modelbase.o oVar = scene.f227963i;
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        a7Var.setHasMore(((r45.wu0) fVar).f389465f == 1);
        com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        a7Var.setLastBuffer(((r45.wu0) fVar2).f389466g);
        return a7Var;
    }
}
