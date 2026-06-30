package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class e30 extends so2.h1 {

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f106622o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.c72 f106623p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e30(com.tencent.mm.plugin.finder.storage.FinderItem feedObject, java.util.List relateLiving, r45.c72 c72Var) {
        super(feedObject);
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        kotlin.jvm.internal.o.g(relateLiving, "relateLiving");
        this.f106622o = relateLiving;
        this.f106623p = c72Var;
    }

    @Override // com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.c
    public int h() {
        return 2021;
    }
}
