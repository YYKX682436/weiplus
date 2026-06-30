package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class k5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader f108115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader) {
        super(0);
        this.f108115d = finderPoiFeedLoader;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.ha haVar = new com.tencent.mm.plugin.finder.feed.model.ha();
        haVar.f107926e = new java.lang.ref.WeakReference(this.f108115d);
        return haVar;
    }
}
