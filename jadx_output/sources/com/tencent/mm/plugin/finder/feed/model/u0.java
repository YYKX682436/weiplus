package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes15.dex */
public final class u0 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader f108385d;

    public u0(com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader finderEmojiListLoader) {
        this.f108385d = finderEmojiListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.fetch(obj, callback, z17);
        com.tencent.mm.plugin.finder.feed.model.w0 w0Var = com.tencent.mm.plugin.finder.feed.model.w0.f108420e;
        com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader finderEmojiListLoader = this.f108385d;
        finderEmojiListLoader.getClass();
        finderEmojiListLoader.f107399e = w0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.w0 w0Var = com.tencent.mm.plugin.finder.feed.model.w0.f108420e;
        com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader finderEmojiListLoader = this.f108385d;
        finderEmojiListLoader.getClass();
        finderEmojiListLoader.f107399e = w0Var;
        com.tencent.mm.plugin.finder.feed.model.v0 v0Var = new com.tencent.mm.plugin.finder.feed.model.v0(0, 0, "");
        v0Var.setPullType(1000);
        v0Var.setHasMore(true);
        callback.onFetchDone(v0Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.w0 w0Var = com.tencent.mm.plugin.finder.feed.model.w0.f108420e;
        com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader finderEmojiListLoader = this.f108385d;
        finderEmojiListLoader.getClass();
        finderEmojiListLoader.f107399e = w0Var;
        if (finderEmojiListLoader.f107398d) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new com.tencent.mm.plugin.finder.feed.model.r0(finderEmojiListLoader, callback, null), 3, null);
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new com.tencent.mm.plugin.finder.feed.model.t0(finderEmojiListLoader, callback, null), 3, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        java.util.Map map;
        java.util.Map map2;
        java.util.Map map3;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader finderEmojiListLoader = this.f108385d;
        boolean z17 = finderEmojiListLoader.f107398d;
        bw5.ia iaVar = bw5.ia.EmoticonDesignerListDataType_StorePack;
        boolean z18 = false;
        if (z17) {
            com.tencent.mm.plugin.finder.feed.model.v0 v0Var = new com.tencent.mm.plugin.finder.feed.model.v0(0, 0, "");
            v0Var.setIncrementList(finderEmojiListLoader.f107405n);
            v0Var.setPullType(4);
            com.tencent.wechat.aff.emoticon.s sVar = finderEmojiListLoader.f107403i;
            if (sVar != null && (map3 = sVar.f216671i) != null) {
                z18 = kotlin.jvm.internal.o.b(((java.util.LinkedHashMap) map3).get(iaVar), java.lang.Boolean.TRUE);
            }
            v0Var.setHasMore(z18);
            callback.onFetchDone(v0Var);
            com.tencent.mm.plugin.finder.feed.model.w0 w0Var = com.tencent.mm.plugin.finder.feed.model.w0.f108421f;
            finderEmojiListLoader.getClass();
            finderEmojiListLoader.f107399e = w0Var;
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.v0 v0Var2 = new com.tencent.mm.plugin.finder.feed.model.v0(0, 0, "");
        v0Var2.setIncrementList(finderEmojiListLoader.f107405n);
        v0Var2.setPullType(4);
        if (finderEmojiListLoader.f107406o) {
            com.tencent.wechat.aff.emoticon.s sVar2 = finderEmojiListLoader.f107403i;
            if (sVar2 != null && (map2 = sVar2.f216671i) != null) {
                z18 = kotlin.jvm.internal.o.b(((java.util.LinkedHashMap) map2).get(bw5.ia.EmoticonDesignerListDataType_SingleEmoji), java.lang.Boolean.TRUE);
            }
            v0Var2.setHasMore(z18);
        } else {
            com.tencent.wechat.aff.emoticon.s sVar3 = finderEmojiListLoader.f107403i;
            if (sVar3 != null && (map = sVar3.f216671i) != null) {
                z18 = kotlin.jvm.internal.o.b(((java.util.LinkedHashMap) map).get(iaVar), java.lang.Boolean.TRUE);
            }
            v0Var2.setHasMore(z18);
        }
        callback.onFetchDone(v0Var2);
        com.tencent.mm.plugin.finder.feed.model.w0 w0Var2 = com.tencent.mm.plugin.finder.feed.model.w0.f108421f;
        finderEmojiListLoader.getClass();
        finderEmojiListLoader.f107399e = w0Var2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        return null;
    }
}
