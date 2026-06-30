package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.m f108121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc2.a f108122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f108123f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.feed.model.m mVar, fc2.a aVar, java.util.LinkedList linkedList) {
        super(0);
        this.f108121d = mVar;
        this.f108122e = aVar;
        this.f108123f = linkedList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.m mVar = this.f108121d;
        mVar.f().post(new com.tencent.mm.plugin.finder.feed.model.k(this.f108122e, this.f108123f, mVar));
        return jz5.f0.f302826a;
    }
}
